import java.util.*;

public class PracticeSheet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* =========================================================
           1. INPUT 2 NUMBERS AND PRINT SUM
        ========================================================= */
        /*
        Input: 5 6
        Output: 11
        */

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));


        /* =========================================================
           2. PRINT 1 TO N
        ========================================================= */
        /*
        Input: 5
        Output: 1 2 3 4 5
        */

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }

        System.out.println();


        /* =========================================================
           3. SUM 1 TO N
        ========================================================= */
        /*
        Input: 5
        Output: 15
        */

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum = " + sum);


        /* =========================================================
           4. EVEN NUMBERS FROM 1 TO N
        ========================================================= */
        /*
        Input: 10
        Output: 2 4 6 8 10
        */

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();


        /* =========================================================
           5. SUM OF EVEN NUMBERS
        ========================================================= */
        /*
        Input: 10
        Output: 30
        */

        int evenSum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                evenSum += i;
            }
        }
        System.out.println("Even Sum = " + evenSum);


        /* =========================================================
           6. SUM OF ODD NUMBERS
        ========================================================= */
        /*
        Input: 10
        Output: 25
        */

        int oddSum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                oddSum += i;
            }
        }
        System.out.println("Odd Sum = " + oddSum);


        /* =========================================================
           7. FACTORIAL
        ========================================================= */
        /*
        Input: 5
        Output: 120
        */

        int fact = 1;

        for(int i = n; i >= 1; i--){
            fact *= i;
        }
        System.out.println("Factorial = " + fact);


        /* =========================================================
           8. ARRAY INPUT + PRINT
        ========================================================= */
        /*
        Input:
        5
        10 20 30 40 50
        */

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        /* =========================================================
           9. SUM OF ARRAY
        ========================================================= */
        /*
        Output: 150
        */

        int arrSum = 0;

        for(int i = 0; i < size; i++){
            arrSum += arr[i];
        }
        System.out.println("Array Sum = " + arrSum);


        /* =========================================================
           10. MAX IN ARRAY
        ========================================================= */
        /*
        Output: 90
        */

        int max = arr[0];

        for(int i = 1; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max = " + max);


        /* =========================================================
           11. MIN IN ARRAY
        ========================================================= */
        /*
        Output: 10
        */

        int min = arr[0];

        for(int i = 1; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min = " + min);
    }
}

/* 
============================================
Find second largest number in array
===========================================

suppose [10, 30, 40, 50, 90]
output is [50]

*/


import java.util.*;

public class PracticeSheet{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
            System.out.println(" max is " + max);
            System.out.print("Second max is " + secondMax);
    }
}


/**
 * Min and second minimum in array
 */
import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){

            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            } 
            else if (arr[i] < secondMin && arr[i] != min){
                secondMin = arr[i];
            }
        }

        System.out.println("Smallest: "+ min);
        System.out.println("secondSmallest: "+ secondMin);
    }
}


/*
 Reverese of number 
Example [1,2,3,4,5] => [5,4,3,2,1]
import java.util.*;
*/

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int reverse = 0;

        while(n != 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse = " + reverse);
    }
}


/* 
Palindrome or not 121 palindrome 123 not 
 */

import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while(n != 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if(original == reverse){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


/**
 *  Check the count of number
 * Ex:- 1232323
 * output: 7
 * 
 */
import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        int count = 0;

        while(n != 0){
            n = n / 10;
            count++;
        }
            System.out.println("count: " + count);
    }
}


/**
 * Sum of digit
 * ex: 123
 * output: 6
 */

import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        int sum = 0;

        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
            System.out.println("sum: " + sum);
    }
}

/**
 * 
 * Armstrong number ex: 153 => (1 * 1 * 1)+ (5 * 5 * 5) + (3 * 3 * 3) == 153 yes
 * ex: 121 => (1 * 1 * 1) + (2 * 2 * 2) + (1 * 1 *1) != 121 not 
 */

import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while(n != 0){
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        
        if(sum == original){
            System.out.println("Armstrong number");
        } else {
            System.out.println("not armstrong");
        }
    }
}


/**
 * 
 * Check duplicate values
 * if [1,2,1]
 * ot: [1,2]
 */

import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array after removing duplicates.");

        for(int i = 0; i < n; i++){
            boolean isDuplicate = false;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                System.out.print(arr[i] + " ");
            }
        }
    }
}



/** 
 * Frequentlu count of array
 * [1,2,2,3,1]
 * 1 -> 1 times
 * 2 -> 2 times
 * 3 -> 1 times
 */

import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Frequently count.");

        for(int i = 0; i < n; i++){
            boolean alreadyCount = false;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]) {
                    alreadyCount = true;
                    break;
                }
            }

            if(alreadyCount) continue;

            int count = 0;

            for(int k = 0; k < n; k++){
                if(arr[i] == arr[k]){
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count + " times");
        }
    }
}


/**
 * 
 * Frequently number is sorted or not
 * [1,2,3,4,5] sorted
 * [1,2,3,1,1] not sorted
 */
import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i +1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.print("Array is sorted");
        } else {
            System.out.print("Arrau is not sorted");
        }
    }
}

/**
 * (Last): Reverse Array without extra array

👉 Input:
[1, 2, 3, 4, 5]

👉 Output:
[5, 4, 3, 2, 1]
 */

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed Array:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}