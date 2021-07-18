//19001101
/* Q1 -> a recursive function prime(n)
that returns true for a prime number and false for the other*/

import scala.io.StdIn._
package Q1{
  object Q1_Prime {

    def prime(a:Int ,b:Int=2):Boolean = b match{
      case m if(a==m) => true
      case m if(gcd(a,m)>1) => false
      case m if(a==1) => false
      case m => prime(a,m+1)
    }

    def gcd(m:Int ,n:Int):Int = n match{
      case 0 => m
      case n if (n>m) => gcd(n,m)
      case _ => gcd(n,m%n)

    }

    def main(args : Array[String]){
      print("Enter number : ");
      val x = scala.io.StdIn.readInt();
      print(" Is given number a prime: ");
      if(prime(x)){
        println("true")
      }else{
        println("false")
      }

    }
  }
}




