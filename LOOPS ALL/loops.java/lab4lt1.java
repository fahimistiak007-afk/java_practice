import java.util.Scanner;

public class lab4lt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int N=sc.nextInt();
int count=0;

for(int i=1;i<=N;i++){
    for(int j=1;j<=N;j++){
        if(i!=j &&  i%j==0){
            System.out.println(i+"beats"+j);
            count++;
        }
    }

}System.out.println("Total Wins"+count);
}

    }

