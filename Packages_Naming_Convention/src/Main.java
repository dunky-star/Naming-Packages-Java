import com.dunky.challenge.X;
import com.dunky.scopes.ScopeCheck;
import com.dunky.series.Series;

import java.util.Scanner;

/**
 *      Create a suitably named package containing a class called Series
 *      with the following static methods:
 *      nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
 *      0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
 *
 *      factorial(int n) returns the product of all numbers from 1 to n
 *            i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
 *      The first 10 factorials are:
 *      0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
 *
 *      fibonacci(n) returns the nth Fibonacci number. These are defined as:
 *      f(0) = 0
 *      f(1) = 1
 *      f(n) = f(n-1) + f(n-2)
 *      (so f(2) is also 1. The first 10 fibonacci numbers are:
 *        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
 *
 *
 */
public class Main {
    public static void main(String[] args){
        for(int i=0; i <=10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("\n");

        System.out.println("Factorial:");
        System.out.println("************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("\n");

        System.out.println("Fibonacci Series:");
        System.out.println("******************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }
        System.out.println("\n");

        System.out.println("Scope in Java");
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("\n");
        scopeInstance.timesTwo();
        System.out.println("***********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter a number: ");
        X x = new X(sc.nextInt());
        x.x();
    }
}
