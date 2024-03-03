package net.asabon.androidappdevelop

/**
 * テーブル(表)を持ったクラス
 *
 * テーブルに対するコメントの仕方について、
 * linter の警告をコントロールするため。
 */
class ClassA {
    fun calculate(a: Int, b: Int): Int {
        val array = arrayOf(
            intArrayOf(1, 2, 3, 4, 5), // コメントA
            intArrayOf(6, 7, 8, 9, 10), // コメントB
            intArrayOf(100, 200, 300, 400, 500)  // コメントC
        )
        return array[a][b]
    }
}
