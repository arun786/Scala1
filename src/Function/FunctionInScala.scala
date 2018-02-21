package Function

object FunctionDefined {
  def main(args: Array[String]): Unit = {

    val maxValue = max(10, 20)
    println(maxValue)
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) a else b
  }
}