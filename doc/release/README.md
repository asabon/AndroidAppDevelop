# リリース手順

## 手順

1. バージョン番号を更新する

    - app/build.gradle.kts を編集
        ```
        android {
            ...
            defaultConfig {
                ...
                versionCode = 4
                versionName = "1.1.0"
                ...
            }
            ...
        ```
    - versionCode
        - 任意の数値
        - 必ず大きな値にすること
    - versionName
        - ユーザーに見えるバージョン番号
        - X.Y.Z
            - X : 大きな機能アップ
            - Y : 時刻データ更新、小規模な機能アップ
            - Z : 不具合修正

2. GitHub に push する

3. ビルドする

    - "Build"
        - "Generate Signed Bundle / APK ..." を選択
    - "Android App Bundle" を選択
    - "Next" を選択
    - "productionRelease" を選択
