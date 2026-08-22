import java .util.Scanner;
public class lab6task3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        System.out.print("Start Index:");
        int startIndex=sc.nextInt();
        int endIndex=sc.nextInt();
        String code="";
        if(startIndex>0 && endIndex<text.length()-1){
            for(int i=startIndex;i<=endIndex;i++){
                char cr=text.charAt(i);
                code+=cr;

            }
        }else{
            System.out.println("Not Valid");
        }System.out.println(code);
    }
}