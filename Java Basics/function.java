// Ouestion of function or methods in java

//Q-1 Write a function program to print your name
/* 
import java.util.*;
public class function {
    // returntype functionname (type arg1,type arg2)
    public static void print(String name){
        System.out.print(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.nextLine();
        print(name);
    }
}
*/

//Q-2 Write a function for sum of two numbers
/* 
import java.util.*;
public class function {
    public static int calcsum(int a, int b){
        int sum= a+b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vaue of a: ");
        int a= sc.nextInt();
        System.out.print("Enter vaue of b: ");
        int b= sc.nextInt();
        int sum = calcsum(a,b);
        System.out.print("The sum of two numbers is: "+ sum);
    }
}
*/

//Q-3 Write a program for product of two numbers
/* 
import java.util.*;
public class function {
    public static int calcprod(int a, int b){
        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vaue of a: ");
        int a= sc.nextInt();
        System.out.print("Enter vaue of b: ");
        int b= sc.nextInt();
        int product = calcprod(a,b);
        System.out.print("The sum of two numbers is: "+ product);
    }
}
*/

//Q-4 Write a program for finding factorial of a number using function
/*
import java.util.*;
public class function {
    public static void printfactorial(int num){
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.print("Factorial: " + factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = sc.nextInt();
        printfactorial(value);
    }
}
*/

/* 
//Q-5 Write a function takes radius as input and return the circumference of a circle
import java.util.*;
public class function{
    public static void circumfxn(int r){
        double circumference = 2*3.14*r ;
        System.out.print( "The circumference of a circle is: "+ circumference );
    }  
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print ( "Enter the radius of circle: ");
        int radius = sc.nextInt();
        circumfxn(radius);
    }  
}
*/
