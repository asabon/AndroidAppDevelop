# ktlint

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
## .editorconfig

### Standard rules

- https://pinterest.github.io/ktlint/latest/rules/standard/

```text
...
[*.{kt, kts}]
insert_final_newline = true
ktlint_code_style = android_studio
ktlint_function_naming_ignore_when_annotated_with = Composable
ktlint_standard_value-argument-comment = disabled
```