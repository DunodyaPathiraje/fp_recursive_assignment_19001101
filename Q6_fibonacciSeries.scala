//19001101
/* Q6 -> a recursive function print fist n Fibonacci numbers for given n */

import java.util.Scanner

package Q6{
  object Q6_fibonacciSeries {
    def fibonacciSeries(x:Int):Int={
      if (x==0)0
      else if (x<=2)1
      else fibonacciSeries(x-1) +fibonacciSeries(x-2)
    }

    def printFibonacci(y:Int):Any={
      if(y>0)
        printFibonacci(y-1)
      println(fibonacciSeries(y))

    }

    def main(args: Array[String]) {

      var input = new Scanner(System.in);
      print("Enter the number to display Fibonacci series : ");
      val num = input.nextInt();

      println("The fibonacci series upto "+num+" is =\n ")
      print(printFibonacci(num))
    }

  }
}


