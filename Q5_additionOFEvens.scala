//19001101
/*Q5 -> Q5 -> a recursive function to get the addition of
all even numbers less than given n.*/

import java.util.Scanner

package Q5{

  object Q5_additionOFEvens {
    def isEven(m: Int): Boolean = m match {
      case 0 => true
      case _ => isOdd(m - 1)
    }

    def isOdd(m: Int): Boolean = !(isEven(m))

    def evenSum(n:Int,i:Int=0,sum:Int=0):Int={
      if(i>=n){
        return sum
      }

      return evenSum(n,i+2,sum+i)
    }

    def main(args: Array[String]) {

      var input = new Scanner(System.in);
      print("Enter number to take all EVEN numbers' addition below that : ");
      val num = input.nextInt();

      println("The addition of all even numbers less than "+num+" is = "+evenSum(num))
    }
  }
}


