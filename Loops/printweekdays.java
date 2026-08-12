 import java.util.Scanner;
 public class printweekDays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter week numbers");
        int weeks=sc.nextInt();
        System.out.print("Enter days numbers");
        int days=sc.nextInt();
for(int i=1;i<=weeks;i++){
    System.out.println("Week"+i);

for (int j=1;j<=days;j++){
    System.out.println("Days"+j);
}
}
    }
 }
