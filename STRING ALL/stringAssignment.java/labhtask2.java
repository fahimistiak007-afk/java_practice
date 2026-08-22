import java.util.Scanner ;

public class labhtask2 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     String vowels="";
     for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        vowels+=ch;
      }
     }
     String result="";
     int vowelPosition=vowels.length()-1;
     for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        result+=vowels.charAt(vowelPosition);
        vowelPosition--;
      }else{
        result+=ch;
      }

     }
     System.out.println(result);
    }
}
