import java.util.Scanner ;

public class lab6htask5 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     int llength=0;
     int sp=s.length()-1;
     while(sp>=0 && s.charAt(sp)==' '){
      sp--;
     }
     while(sp>=0 && s.charAt(sp)!=' ' ){
      llength++;
      sp--;
     }
System.out.println(llength);
    }
}
