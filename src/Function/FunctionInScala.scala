package Function

object FunctionDefined {
  def main(args: Array[String]): Unit = {

    val maxValue = max(10, 20)
    println(maxValue)

    val increment = function(2)
    println(increment)
    
    val greets = greet()
    println(greets)
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  def function(x: Int) = x + 1
  
  def greet() = "Hello World"
}