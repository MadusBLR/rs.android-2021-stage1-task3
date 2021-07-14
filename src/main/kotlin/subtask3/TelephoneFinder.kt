package subtask3

import javax.xml.stream.events.Characters

class TelephoneFinder {
    private val neighbors = arrayOf("8","24","135","26","157","2468","359","48","5790","68")
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number[0]=='-')
            return null
        val result = mutableListOf<String>()
        for(c in number.indices)
        {
            for(t in neighbors[Character.getNumericValue(number[c])])
            {
               var newNumber = StringBuilder(number)
                               .also { it.setCharAt(c, t) }
                               .toString()
               result.add(newNumber)
            }
        }

        return result.toTypedArray()
    }
}
