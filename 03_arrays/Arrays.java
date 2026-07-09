import java.util.*;

public class Arrays {
    public static void main(String args[]){
        // int[] marks = new int[3];
        // int mark[] = new int[30];
        // marks[0] = 45;
        // marks[1] = 98;
        // marks[2] = 95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for(int i=0; i<3; i++){
        //     System.out.println(mark[i] = i*3);
        // }

        // int marks[] = {2,3,4};
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // Input
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }

        // Output
        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }


        // Take an array as input from the user. Search for a given number x and print the index at which it occurs.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index: " + i);
            }
        }
        

    }
}