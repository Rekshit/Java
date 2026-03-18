/*class hello {
    public static void main(String[] args) {
        int a = 45;
        int b = 56;
        int sum = a+b;
        System.out.print(sum);
    }
}
*/

/*class hello {
    public static void main(String[] args) {
        int a=45 , b=6;
        System.out.print(a+b);
    }
}
*/

/*import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int \
        a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
*/

/* 
import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18) {
            System.out.println("Adult");
        }

        else{
            System.out.println("Child");
        }
    }
}
*/
/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        if(num%2 == 0) {
            System.out.println("Even");
        }

        else{
            System.out.println("odd");
        }
    }
}
*/

/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2) {
            System.out.println("Both are equal");
        }

        else if (num1 > num2 ) {
            System.out.println("Num 1 is greater");
        }

        else {
            System.out.println("Num 2 is greater");
        }
    }
}
*/

/*
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2) {
            System.out.println("Both are equal");
        }

        if (num1 > num2 ) {
            System.out.println("Num 1 is greater");
        }

        else {
            System.out.println("Num 2 is greater");
        }
    }
}
*/

/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the button:");
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            case 4 : System.out.println("Invalid Button");
        }
    }
}
    */
/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int sum= 0;

        for(int i=1; i<=n ; i++){
            sum= sum+i;
        }
        System.out.print("The sum of first n nastural number is: ");
        System.out.print(sum);
    }
}   
*/ 
/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table:");
        int n = sc.nextInt();
        int sum= 0;

        for(int i=1; i<=10 ; i++){
            sum= n*i;
            System.out.println(sum);
        }
    }
}  
*/
/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println() ;
        }
    }
}
*/

/*import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<= n ; i++){
            for(int j=1; j<= n; j++){
                if (i==1 || i==n || j==1 || j==n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println() ;
        }
    }
}
*/

/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=2 ; i++){
            for(int j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println() ;
        }
    }
}
*/
/*
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println() ;
        }
    }
}
*/

/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println() ;
        }
    }
}
*/

/*
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=n; i>=1 ; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println() ;
        }
    }
}
*/
/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println() ;
        }
    }
}
    //revise again
*/
/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println() ;
        }
    }
}
*/

/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=n; i>=1 ; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println() ;
        }
    }
}
*/

/* 
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println() ;
        }
    }
}
*/

/*
//Floyd's Triangle
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int num = 1;

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println() ;
        }
    }
}  
*/

import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if ( sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 "); 
                }
            }
            System.out.println() ;
        }
    }
}