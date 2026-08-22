import java.util.Scanner;
public class lab6htask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String input=sc.nextLine();
         int maxValue=0;
         for(int i=0;i<=input.length()-2;i++){
          int ch1=input.charAt(i);
          int ch2=input.charAt(i+1);
          if((ch1>='0' && ch1<='9')&&(ch2>='0' && ch2<='9')){
            int currentNum=(ch1-'0')*10+(ch2-'0');
          if(currentNum>maxValue){
            maxValue=currentNum;
          }
          

         }
         

    }System.out.println("2 DIGIT PIN:"+maxValue);
}
}
