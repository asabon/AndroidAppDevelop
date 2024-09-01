[![CI](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml/badge.svg?branch=main&event=push)](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml)
[![codecov](https://codecov.io/gh/asabon/AndroidAppDevelop/graph/badge.svg?token=4SXPG7QSC3)](https://codecov.io/gh/asabon/AndroidAppDevelop)

# AndroidAppDevelop

## 概要

- Android アプリ開発のテンプレート
- Android Studio から新規プロジェクトを作成した状態をベースに必要なプラグインなどを導入

## フィーチャー

- UI 構築方法は Jetpack Compose を使用
- 画面遷移は Navigation を使用
- Google AdMob を使用したバナー広告表示を導入

## CI環境

- GitHub Actions を利用した CI 環境を構築
  - ビルドチェック
  - Android Lint
  - KtLint
  - UnitTest
  - カバレッジ計測

## 依存関係

### 動作確認済みのバージョン組み合わせ

| Name          | Version |
|---------------|---------|
| Gradle Plugin | 8.5.2   |
| Kotlin        | 1.9.22  |
| Kotlinter     | 4.2.0   |
| Kover         | 0.7.5   |

### 参照情報

- Kotlin
  - https://kotlinlang.org/docs/releases.html
- kotlinter-gradle
  - https://github.com/jeremymailen/kotlinter-gradle
- Compose compiler
  - https://androidx.dev/storage/compose-compiler/repository

## 作者

- asabon

## ライセンス

- MIT ライセンス
