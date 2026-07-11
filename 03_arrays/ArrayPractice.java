// Take names as input and print all the names given in array

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        // System.out.println("Enter size of array: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String name[] = new String[size];

        for(int i=0; i<size; i++){
            // System.out.println("Enter names: ");
            name[i] = sc.next();
        }

        // System.out.println("Your names are given below:- ");

        for(int i=0; i<name.length; i++){
            System.out.println("name at " + (i + 1) + " is " + name[i]);
        }
        
    } 
}



// Find max and min value
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        System.out.print("Enter size of array: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            // System.out.println("Enter names: ");
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // System.out.println("Your names are given below:- ");

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
            
        }

        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
        
    } 
}


// Check if array is ascending or not 

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        System.out.print("Enter size of array: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            // System.out.println("Enter names: ");
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.print("The array is sorted in ascending order");
        } else {
            System.out.print("The array is not sorted in ascending order");

        }
        
    } 
}


// 2D Array 


// take row and column as input and do all task like nested fn in patterns.
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =  sc.nextInt();       
        int cols =  sc.nextInt();     

        int [][] numbers = new int[rows][cols];

        // input
        // rows
        for(int i=0; i<rows; i++){
            // cols
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }  

        // Output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ") ;
            }
            System.out.println();
        }
    } 
}


// Take input or 2d array from user and also take x and print if x found in 2d array.
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =  sc.nextInt();       
        int cols =  sc.nextInt();     

        int [][] numbers = new int[rows][cols];

        // input
        // rows
        for(int i=0; i<rows; i++){
            // cols
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }  
        System.out.print("Enter searching num: ");
        int x = sc.nextInt();

        // Output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("---- Found ----") ;

                    System.out.print("Number found at (" + i + " , " + j );
                }
            }
        }
    } 
}


// Print traverse of matrix like enter 2 row 3 col print 3 row 2 cols vice versa 
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =  sc.nextInt();       
        int cols =  sc.nextInt();     

        int [][] numbers = new int[rows][cols];

        // input
        // rows
        for(int i=0; i<rows; i++){
            // cols
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }  
        

        // Output
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(numbers[i][j] + " ");
            }
                System.out.println(" ");
        }

        



    } 
}




