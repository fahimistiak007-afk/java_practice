import java.util.Scanner;
public class lab6task6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String markStr=sc.nextLine();
        int marks=0;
        for(int i=0;i<markStr.length();i++){
            char ch=markStr.charAt(i);
            int digit=ch-'0';
            marks=(marks*10)+digit;
            if(marks<0|| marks>100){
                System.out.println("Invalid Mark");
            
            }else if(marks>=90){
                System.out.println("A");
            }else if (marks>=80){
                System.out.println("A-");
            }else if (marks>=70){
                System.out.println("B");
            }else if(marks>=60){
                System.out.println("C");
            }else if(marks>=50){
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        }
    }
}