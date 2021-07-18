//19001101
/*Q4 -> a recursive function to determine even and odd numbers*/

import java.util.Scanner
import scala.io.StdIn.readInt


package Q4 {
  object Q4_oddEven {
    def isEven(m: Int): Boolean = m match {
      case 0 => true
      case _ => isOdd(m - 1)
    }

    def isOdd(m: Int): Boolean = !(isEven(m))


    def main(args: Array[String]) {

      var input = new Scanner(System.in);
      print("Enter number to check ODD or EVEN : ");
      val num = input.nextInt();

      if (isOdd(num))
        println("The number "+num+" is ODD");
      else
        println("The number "+num+" is EVEN");
    }
  }
}

