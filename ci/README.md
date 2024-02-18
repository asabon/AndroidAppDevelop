# ci

## Overview

- GitHub Actions を利用した CI 環境を構築

## Modification

- GitHub
  - Repository 設定
    - Settings
      - Actions
        - General
          - Workflow permissions
            - "Read and write permissions" にチェック
              - danger を使ってプルリクに書き込むために GIT_HUB_TOKEN に write 権限が必要。
