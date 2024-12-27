import java.util.Scanner;

public class Damru {
    
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter the num ::");
        int num=sc.nextInt();

        for (int i = num; i>=1 ; i--) {
            
            for(int k=1;k<=num-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                if(i==num||j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 2; i <=num; i++) {
            
            for(int k=1;k<=num-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                if(i==num||j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
