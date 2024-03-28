# AdMob

## 目的

AdMob を使って自分のアプリにバナー広告を表示して収益を得る。

## やりかた

### app/build.gradle.kts

- 依存関係に "com.google.android.gms:play-services-ads" を追加。

```kotlin
dependencies {
    // ...

    // AdMob
    implementation("com.google.android.gms:play-services-ads:22.6.0")
}
```

### AndroidManifest.xml

- AD_ID にアクセスする必要があるのでそのパーミッションを設定する。

```text
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <uses-permission android:name="com.google.android.gms.permission.AD_ID"/>

    <application
        ...
        </activity>
        <meta-data
            android:name="com.google.android.gms.ads.APPLICATION_ID"
            android:value="@string/admob_app_id" />
    </application>
```

### 初期化

- 以下のような感じで MobileAds を初期化する。

```text
...
import com.google.android.gms.ads.MobileAds
...

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MobileAds.initialize(this) {}
        ...
    }
}
```

### バナー表示

- AdmobBanner.kt を使用する。

```kotlin
    // "ca-app-pub-3940256099942544/6300978111" は Sample の UnitId
    AdMobBanner("ca-app-pub-3940256099942544/6300978111")
```
