# AndroidAppDevelop

## 概要

- Android アプリ開発のテンプレート的なもの

## 運用方針

- 目的ごとにブランチを分け、差分の比較がしやすいようにする

## 各ブランチの目的

 - main
   - ベース
     - Android Studio から新規プロジェクトを作成した状態
   - 目的
     - 最小構成
     - 各派生ブランチのベースとなるもの
     - 各プラグインなど「なるべく最新」の状態を維持
     - GitHub Actions を使った CI 環境の構築
       - ビルドチェック
       - Android Lint
       - ktlint
       - UnitTest
       - カバレッジ計測
- feature/admob/main
  - ベース
    - main ブランチ
  - 目的
    - アプリに AdMob バナーを追加する
- feature/navigation/main
  - ベース
    - main ブランチ
  - 目的
    - アプリに画面遷移を容易に実現するための "Navigation" を追加する

## 各ブランチのステータス

| Branch                  | Status                                                                                                                                                                                                                                                                                                                             |
|-------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| main                    | [![CI](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml/badge.svg?branch=main&event=push)](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml) [![codecov](https://codecov.io/gh/asabon/AndroidAppDevelop/graph/badge.svg?token=4SXPG7QSC3)](https://codecov.io/gh/asabon/AndroidAppDevelop) |
| feature/admob/main      | [![CI](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml/badge.svg?branch=feature%2Fadmob%2Fmain&event=push)](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml)                                                                                                                             |
| feature/navigation/main | [![CI](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml/badge.svg?branch=feature%2Fnavigation%2Fmain&event=push)](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml)                                                                                                                        |

## 作者

- asabon

## ライセンス

- MIT ライセンス
