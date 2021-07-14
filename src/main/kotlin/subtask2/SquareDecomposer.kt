package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 5) {
            return null
        }
        return decompose(number*number, number-1)
    }

    private fun decompose(num: Int, n: Int): Array<Int>?{
        for (i in n downTo 1) {
            val r = num - i * i
            when {
                r == 0 -> return arrayOf(i)
                r < 0 -> return null
            }
            var next = sqrt(r.toDouble()).toInt()
            if (next >= i) {
                next = i - 1
            }
            val nextVal = decompose(r, next)
            if (nextVal != null) return nextVal + arrayOf(i)
        }
        return null
    }
}