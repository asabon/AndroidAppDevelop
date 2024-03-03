package net.asabon.androidappdevelop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.ads.MobileAds
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
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidAppDevelopTheme {
        Greeting("Android")
    }
}
