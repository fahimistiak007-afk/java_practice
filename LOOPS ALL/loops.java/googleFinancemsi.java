import java .util.Scanner;
public class googleFinancemsi {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Startups");
        int N=sc.nextInt();
        System.out.print("Enter Principal Amount");
        double P=sc.nextDouble();
        System.out.print("Enter Interest Amount");
        double years=sc.nextDouble();
        double simpleInterest=(P*1*years);
        double total=0.0;
        for(int i=1;i<=N;i++){
            double sum=0.0;
            for (int year=1;year<=year;year++){
                if(year==2){
                    continue;
                }
                if(sum+simpleInterest>=.5*P){
                    sum=.5*P;
                    break;
                }
                sum=sum+simpleInterest;
            }total+=sum;
        }
        System.out.println("Total points earned by goodle "+total);



    }
    
}
