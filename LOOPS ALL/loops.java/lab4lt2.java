import java.util.Scanner;
public class lab4lt2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Students(S): ");
        int s=sc.nextInt();
        double highestavg=0;
        int topstd=0;
        System.out.println("Missions(M): ");
        int m=sc.nextInt();
        for(int i=1;i<=s;i++){
            int sum=0;
            System.out.println("Score of Student"+i+":");

        for(int j=1;j<=m;j++){
            System.out.println();
            int num=sc.nextInt();
            sum+=num;
              }
              double avg=(double)sum/3;
               System.out.printf("Average point of Student %d: %.2f\n", i,avg);
            if(avg>highestavg){
                highestavg=avg;
                topstd=i;
               
        }
             
            }
             System.out.println();
        System.out.println("Student " + topstd + " receives the badge of honour!!");
}}

