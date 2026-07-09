import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Length of string: "+ str.length());
    }
}


import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i) + " ");
        }
    }
}


import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                
                count++;
            }
        }
        System.out.print(count);
    }
}



import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int upper = 0;
        int lower = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch > 'A' && ch <= 'Z'){
                upper++;
            } else if (ch > 'a' && ch <= 'z') {
                lower++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}


import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int digit = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch > '0' && ch >= '9'){
                digit++;
            }
        }
        System.out.println(digit);
    }
}



import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int special = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if((ch >= '0' && ch <= '9') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z')) {
                // ignore digit and letter
            }
            else {
                special++;
            }
        }

        System.out.println("Special characters = " + special);
    }
}




import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

    
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if((ch >= '0' && ch <= '9') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z')){
                System.out.print(ch);
            }
        }
    }
}



// BEst approach to store in string builder
import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

    
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if((ch >= '0' && ch <= '9') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z')){
                System.out.print(sb.append(ch));
            }
        }
    }
}




import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();


        StringBuilder sb =  new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z')){
                sb.append(Character.toUpperCase(ch));
            } else if((ch >= 'A' && ch <= 'Z')){
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }
}


import java.util.*;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            int count = 0;
            char ch = str.charAt(i);

            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }

            if(count == 1) {
                System.out.println(ch);
                
            }
            
        }
        System.out.println("No non-repeating character");
    }
}



import java.util.*;

class Questions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];

        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }

        for(int i = 0; i < str.length(); i++){
            if(freq[str.charAt(i)] == 1){
                System.out.println(str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}