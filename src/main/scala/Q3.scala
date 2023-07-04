object Q3 {
  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def toCapital(str: String, index: Int): String = {
    var letter = ((str.charAt(index)).toString).toUpperCase()
    var capLetter: Char = letter(0)
    //StringBuilder is a class that represents a mutable sequence of characters. So that, we can perform modifications to the string.
    val newStr = new StringBuilder(str)
    newStr.setCharAt(index, capLetter)
    var res = newStr.toString
    res

  }

  def formatNames(name: String, function: (String) => String, index: Int = -1): String = {
    if (index == -1) {
      function(name)
    } else {
      toCapital(name, index)
    }
  }

  def main(args: Array[String]): Unit = {

    var result1 = formatNames("Benny", toUpper)
    println(result1)
    var result2 = formatNames("Niroshan", toUpper, 1)
    println(result2)
    var result3 = formatNames("Saman", toLower)
    println(result3)
    var result4 = formatNames("Kumara", toUpper, "Kumara".length - 1)
    println(result4)

  }

}
