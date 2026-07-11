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


