
import java.util.Scanner;
public class lab4lt3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ");
        int a=sc.nextInt();
        System.out.print("Enter b");
        int b=sc.nextInt();
     
        int count=0;
        for(int i=a;i<=b;i++){
            int temp=i;
               int sum=0;
            while(temp>0){
                
                int d=temp%10;
                sum+=d;
                temp=temp/10;
                if(i%sum==0){
                    System.out.print(i+",");
                    count++;
                }
            }
        }
     System.out.println(count);
    }
    
}
