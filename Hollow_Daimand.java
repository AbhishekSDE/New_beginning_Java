import java.util.Scanner;

public class Hollow_Daimand {
    
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
        System.out.println("enter the num ::");
        int num=sc.nextInt();

        for (int i = 1; i <=num; i++) {
            
            for(int k=1;k<=num-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = num-1; i >=1; i--) {
            
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(k==1||k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
