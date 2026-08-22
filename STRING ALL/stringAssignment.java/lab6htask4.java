import java.util.Scanner;
public class lab6htask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Fan Message: ");
        String message = sc.nextLine();
int madridCount=0;
        int bayernCount=0;

        for(int i=0;i<=message.length()-6; i++) {

            if ((message.charAt(i)=='m'||message.charAt(i)=='M')&&(message.charAt(i+1)=='a'||message.charAt(i+ 1)=='A') &&(message.charAt(i+2)=='d'||message.charAt(i+2)=='D')&&(message.charAt(i+3)=='r'||message.charAt(i+3)=='R')&&(message.charAt(i+4)=='i'||message.charAt(i+4)=='I')&&(message.charAt(i+5)=='d'||message.charAt(i+5)=='D')){
                  madridCount++;
            }
        }
 for(int i=0;i<=message.length()-6;i++){
 if ((message.charAt(i)=='b'||message.charAt(i)=='B')&&(message.charAt(i+1) =='a'||message.charAt(i+1) =='A')&&(message.charAt(i+2)=='y'||message.charAt(i+2)=='Y')&&(message.charAt(i+3)=='e'||message.charAt(i+3)=='E')&&(message.charAt(i+4)=='r'||message.charAt(i+4)=='R')&&(message.charAt(i+5)=='n'||message.charAt(i+5)=='N')) {

                bayernCount++;
            }
        }  if (madridCount>bayernCount){
            System.out.println("Madrid   Supporter");
        }else if (bayernCount > madridCount) {
            System.out.println("Bayern  Supporter");
        }
        else {
            System.out.println("Neutral");
        } boolean close =false;
        boolean destroy=false;
 for (int i=0;i<=message.length()-5;i++) {
 if ((message.charAt(i)=='c'||message.charAt(i)=='C')&&(message.charAt(i+1) =='l'||message.charAt(i+1)=='L')&&(message.charAt(i+2)=='o'||message.charAt(i+2)=='O') &&(message.charAt(i+3)=='s'||message.charAt(i+3) =='S')&&(message.charAt(i+4)=='e'||message.charAt(i+4) =='E')){
 close = true;
            }
        }
 for(int i=0;i<=message.length()-7;i++) {
 if ((message.charAt(i) =='d'|| message.charAt(i)=='D') &&(message.charAt(i + 1) =='e'||message.charAt(i+1) =='E') &&(message.charAt(i+ 2)=='s'|| message.charAt(i+2)=='S')&&
        (message.charAt(i+3) =='t'|| message.charAt(i+3)=='T')&&(message.charAt(i+4) =='r'||message.charAt(i+4)=='R')&&(message.charAt(i+5) =='o'|| message.charAt(i+5)=='O')&&(message.charAt(i+6)=='y'||message.charAt(i+6)=='Y')) 
        {
 destroy = true;
            }
        }
 if(close){
   System.out.println("Fan expect a close match");
        }
        else if(destroy){
   System.out.println("Fan expects a dominating victory!");
        }
        else {
    System.out.println("Hard to read the fan sentiment");
        }
    }
}
