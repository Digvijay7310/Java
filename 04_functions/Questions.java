import java.util.*;


public class Practice{

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int c = calculateSum(a, b);
        System.out.println(c);
        System.out.print(c * c);
    }
}



/**
 * 
 * Here we print the sum in two types. How can we differenciate these two statement in interview :-
 * 
 * System.out.print(calculate(a, b));
 * it directly print the sum and return value is not store anywhere in program
 * 
 * But,
 * int c = calculate(a, b);
 * System.out.print(a, b);
 * 
 * Here, c contains the return value and we can use c as return time with more operation.
 * Ex: System.out.print(c * 20)
 * Ex: System.out.print(c ** 20)
 * 
 */



// Greates Common Divisor

public class GCDExample {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}