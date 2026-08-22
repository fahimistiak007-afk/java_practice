import java.util.Scanner ;

public class lab6htask3 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     System.out.println("Names of the spells: ");
    int powerLvl=0, largestLength=-1;
    String largestSpell="";
    while (true) {
      String Spell=sc.nextLine();
      if (Spell.length()==4 && 
          Spell.charAt(0)=='s' && Spell.charAt(1)=='t' && 
          Spell.charAt(2)=='o' && Spell.charAt(3)=='p') {
        break;
      }
      String newSt="";
      int sum=0;
      for (int i=0; i<Spell.length(); i++) {
        char ch=Spell.charAt(i);
        if (ch<='z'&&ch>='a') {
          ch-=32;
          newSt=newSt+ch;
          sum=sum+ch;
        }
        else if (ch<='Z'&&ch>='A'){
          newSt+=ch;
          sum+=ch;
        }
      }
      if (newSt.length()>largestLength) {
        largestSpell=newSt;
        largestLength=newSt.length();
        powerLvl=sum;
      }
    }
    System.out.println("Largest Spell : "+largestSpell);
    System.out.println("Power Level : "+powerLvl);
    }
}
