import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Energy (E):");
         int e= input.nextInt();
         System.out.print("Number of RIver(N)");
         int n=input.nextInt();
boolean tired=false;

 for(int i=0;i<=n;i++){
     System.out.print("Enter River Distance D" +i+");
     int d=input.nextInt;
     if(d<=5){
         e-=2;
     }
 else {
        e-=d/2;
            }
            if (e<0){ 
                system.out.println("charmandar stopped at River:"+i);
                tired=true;
                break;
    }
}
    if(!tired){
    System.out.println("All done");
    System.out.println(e+"energy left");
    }
    input.close();
}
}
