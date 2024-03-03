package net.asabon.androidappdevelop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.google.android.gms.ads.MobileAds
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.asabon.androidappdevelop.ui.theme.AndroidAppDevelopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MobileAds.initialize(this) {}
        setContent {
            AndroidAppDevelopTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApplication()
                }
            }
        }
    }
}

@Composable
fun MyApplication() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen(navController)
        }
        composable("sub") {
            SubScreen(navController)
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "This is MainScreen.")
        Button(
            onClick = {
                navController.navigate("sub")
            }
        ) {
            Text(text = "Go to SubScreen.")
        }
        // AdMobBanner が画面の一番下に来るようにスペースを調整
        Spacer(
            modifier = Modifier
                .fillMaxHeight()
                .weight(weight = 1f, fill = false)
        )
        // Sample adUnitId = "ca-app-pub-3940256099942544/6300978111"
        AdMobBanner(stringResource(id = R.string.admob_unit_id_main))
    }
}

@Composable
fun SubScreen(navController: NavController) {
    Column {
        Text(text = "This is SubScreen.")
        Button(
            onClick = {
                navController.navigate("main")
            }
        ) {
            Text(text = "Go to MainScreen.")
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidAppDevelopTheme {
        MyApplication()
    }
}
 */
