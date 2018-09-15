import java.util.Scanner;

/**
 *
 */
public class Tutorial {

    public static int fibonacciIteration(int n){
        int i;
        int first = 0;
        int second = 1;
        int next;

        if(n == 0){
            return first;
        }
        for(i = 1;i<n;i++){

                next = first+second;
                first = second;
                second = next;

        }
        return second;
    }

    public static int fibonacciRecursion(int n){
        if(n <= 1){
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //تعريف السكانر المسؤول عن اخذ الانبوت من اليوزر
        System.out.println("Enter a number to calculate its fib "); //سؤال اليوزر عن الرقم
        int n = scanner.nextInt();//اخذ الانبوت وتخزينه في فاريبل
        int resultIter = fibonacciIteration(n);
        int resultRecur = fibonacciRecursion(n);
        System.out.println("result Iteration : " + resultIter);
        System.out.println("result Recursion : " + resultRecur);




    }
}
