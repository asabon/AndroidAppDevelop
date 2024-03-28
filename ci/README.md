# ci

## 概要

- GitHub Actions を利用した CI 環境構築のための設定ファイル群

## ディレクトリ・ファイル構成

以下のように、job ごとに Dangerfile, Gemfile を個別に用意。

```text
+ .github/
  + workflows/
    + ci.yml
+ ci/               : ci.yml から実行される各 job が参照する設定ファイル群置き場
  + androidLint/
    + Dangerfile
    + Gemfile
  + build/
    + Dangerfile
    + Gemfile
  + ktlint/
    + Dangerfile
    + Gemfile
  + unitTest/
    + Dangerfile
    + Gemfile
```

## GitHub に対する設定変更

Workflow からプルリクにコメントを書き込むため、リポジトリに対して以下の設定変更を実施。

- "Settings" → "Actions" → "General" → "Workflow permissions"
  - "Read and write permissions" にチェックを入れる
    - danger を使ってプルリクにコメントを書き込むために GIT_HUB_TOKEN に write 権限が必要なため。
    - 他にいい方法があるかも・・・
