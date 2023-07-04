import scala.io.StdIn.readInt

object Q2 {
  def PatternMatching(num: Int): String = num match {
    case num if num < 0 => "Negative"
    case num if num == 0 => "Zero"
    case num if num % 2 == 0 => "Even"
    case num if num % 2 == 1 => "Odd"

  }

  def main(args: Array[String]): Unit = {

    printf("Input any integer number: ")
    var number: Int = readInt()

    println(PatternMatching(number))

  }


}
