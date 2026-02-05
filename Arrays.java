/*
import java.util.*;
class Arrays{
    public static void main(String[] args) {
        int [] arr= { 80,20,70,40,50 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The length of this array is: "+ arr[arr.length-1]);
        System.out.println(arr[4]);
        
        arr[4]=100;
        System.out.println(Arrays.toString(arr));
    }
}
*/

/*
import java.util.*;
class Arrays {
    public static void main(String[] args) {
        int [] arr= { 10,20,30,40,50 };
        for(int i : arr){
        System.out.println(arr[i]);  
        }
    }
}
*/

/*
import java.util.*;
class Arrays {
    public static void main(String[] args) {
        int [] arr= { 10,20,30,40,50 };
        for(int i=0 ;i<5 ; i++){
        System.out.println(arr[i]);  
        }
    }
}
*/

/*
import java.util.*;
class Arrays {
    public static void main(String[] args) {
        int [] arr= { 100,20,30,40,50 };
        int max = arr[0];
        for(int i=1 ;i<5 ; i++){
          if(max < arr[i]){
            max= arr[i]; 
          }
        }
        System.out.println(max);
    }
}
*/

/*
import java.util.*;
class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> var = new ArrayList<>();
        var.add(10);
        var.add(20);
        var.add(30);
        var.add(40);
        System.out.print(var);
    }
}
*/

//Q- Declaration of array
import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0]= 10;
        marks[1]= 20;
        marks[2]= 30;
        marks[3]= 40;
        for(int i=0 ;i<4 ; i++){
            System.out.println(marks[i]); 
        } 
    }
}