//19001101
/*Q3 -> a recursive function returns the addition of numbers from 1 to n*/

import java.util.Scanner
import scala.io.StdIn.readInt

package Q3{
  object Q3_addNumbers {
    def addNumber(a:Int,b:Int=0): Int=a match{
      case 0 => b
      case x if x>0 => addNumber((a-1),(b+a))
    }


    def main(args:Array[String]){

      var input = new Scanner (System.in);
      print("Enter number to get the total addition upto that : ");
      val num=input.nextInt();
      println("\nAddition 1 to "+num+" => "+addNumber(num));

    }
  }
}

