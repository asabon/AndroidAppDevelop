# androidLint

## Overview

- ktlint による Lint チェックを行う
- プルリク時、warning をプルリクコメントに記載する

## Modification

- .github/workflows/ci.yml
  - ktlint job を追加
- ci/ktlint に以下のファイルを追加
  - Dangerfile
  - Gemfile
- Project の build.gradle.kts に以下の記述を追加
  ```kotlin
  plugins {
      // ...
      id("org.jmailen.kotlinter") version "4.2.0" apply false
      // ...
  }
  ```
- Module の build.gradle.kts に以下の記述を追加
  ```kotlin
  plugins {
      // ...
      id("org.jmailen.kotlinter")
      // ...
  }
  // ...
  kotlinter {
  ignoreFailures = true
  reporters = arrayOf("checkstyle", "plain")
  }
  ```
