import java.util.*;

public class BasicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sc.nextLine();

        System.out.println("str is " + str);
        System.out.println(" ");
        System.out.println("Length is " + str.length());
        System.out.println(" ");
        System.out.println("char at " + str.charAt(0));
        System.out.println(" ");
        
        for(int i = 0; i < str.length(); i++){
            System.out.println("The value of i is " + i);
            System.out.print(str.charAt(i) + " ");
        }
    } 
}