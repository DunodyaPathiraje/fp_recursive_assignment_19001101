//19001101
/*Q2 -> a recursive function primeSeq(n)
that prints all 	prime number which less than n*/

import java.util.Scanner
import scala.io.StdIn.readInt

package Q2{
  object Q2_primeSeq {
    def GCD(m:Int,n:Int): Int=n match{
      case 0 => m
      case x if x>m => GCD(x,m)
      case _ => GCD(n,m%n)
    }

    def prime(a:Int ,b:Int=2):Boolean = b match{
      case m if(a==m) => true
      case m if(GCD(a,m)>1) => false
      case m if(a==1) => false
      case m => prime(a,m+1)
    }

    def primeSeq(a:Int): Unit={
      if(a>2)
        primeSeq(a-1);
      var bool= (prime(a));
      if (bool)
        println(a);
    }

    def main(args:Array[String]){

      var input = new Scanner (System.in);
      print("Enter number to print all prime number which less than you entered : ");
      val num=input.nextInt();

      println("Prime number upto "+num);

      primeSeq(num);
    }
  }
}
