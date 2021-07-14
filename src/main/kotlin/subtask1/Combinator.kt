package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var i=0

        while(i<array[1])
        {
            if(choose(array[1],i)==array[0])
            {
                return i
            }
            i++
        }
        return null
    }
    private fun choose(m: Int, k: Int): Int
    {
        var result: Long = 1
        for(i in k+1..m)
            result *= i
        for(i in 1..m-k)
            result/=i
        return result.toInt()
    }
}
