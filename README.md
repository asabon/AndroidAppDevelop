# AndroidAppDevelop

## Overview

- Android アプリ開発のテンプレート的なもの

## Branches

- ブランチごとに用途、目的を分けてメンテナンスする
  - main
    - 新規プロジェクトを作成した状態を極力変えない「最小構成」
    - CI 環境に必要なプラグインなどだけを導入
      - GitHub Actions を利用
        - ビルドチェック
        - Android Lint
        - ktlint
        - UnitTest
        - カバレッジ計測

## Status

| Branch | Status                                                                                                                                                                                                                                                                                                                             |
|--------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| main   | [![CI](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml/badge.svg?branch=main&event=push)](https://github.com/asabon/AndroidAppDevelop/actions/workflows/ci.yml) [![codecov](https://codecov.io/gh/asabon/AndroidAppDevelop/graph/badge.svg?token=4SXPG7QSC3)](https://codecov.io/gh/asabon/AndroidAppDevelop) |

## Author

- asabon

## License

- MIT ライセンス
