import java.util.Scanner;

public class Butterfly {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num::");
        int num=sc.nextInt();

        for (int i = 1; i <=num; i++) {

          ///left triangle
            
          for (int j = 1; j <=i; j++) {

            System.out.print("*");
          }

          //for spacing
          for(int k=1;k<=2*(num-i);k++){
            System.out.print(" ");
          }

          //for right triangle
          for (int e = 1; e <=i; e++) {
            System.err.print("*");
          }
          System.out.println();
        }

        for (int i = num; i >=1; i--) {

            ///left triangle
              
            for (int j = 1; j <=i; j++) {
  
              System.out.print("*");
            }
  
            //for spacing
            for(int k=1;k<=2*(num-i);k++){
              System.out.print(" ");
            }
  
            //for right triangle
            for (int e = 1; e <=i; e++) {
              System.err.print("*");
            }
            System.out.println();
          }
    }
}
