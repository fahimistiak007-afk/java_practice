import java.util.Scanner;

public class ta{
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.print("Number of members:");
   int members=input.nextInt();
   for (int i=1;i<= members;i++){
    System.out.print("Exercises for member-"+i+":");
    int exercises=input.nextInt();
    if(exercises>3){
      System.out.println("(Cannt do more than 3 exercises)");
      exercises=3;
    }
    double rawSum=0; 
    double total=0;
    boolean alllessThese200=true;
    for(int j=1;j<=exercises;j++){
    System.out.print("Exercise-"+j+":");
    double calorie=input.nextDouble();
    rawSum+=calorie;
    total+=calorie;
    if(calorie>350){
      total+=calorie*.50;
    }if(calorie>=200){
      alllessThese200=false;
    }
    }
    double rawaverage=rawSum/exercises;
    if(rawaverage>400){
      total+=50*exercises;
    }
    double finalavg=total/exercises;
    if(alllessThese200){
      finalavg=finalavg-(finalavg*.10);
    }
    System.out.printf("Average calories earned per day for member -%d: %.3f\n"+i,finalavg);

    }
    input.close();
   
    }
  }