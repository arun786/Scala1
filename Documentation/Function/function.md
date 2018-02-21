# Scala

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
	
# Java

	package Function;
	
	public class FunctionInJava {
	
		public static void main(String[] args) {
	
			int maxValue = max(10,20);
			System.out.println(maxValue);
		}
	
		public static int max(int a, int b) {
			return a > b ? a : b;
		}
	}
