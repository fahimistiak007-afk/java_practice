public class Solution5{
    public static void main(String[] args) {
      double a=4.5;
      double b=9.5;
      double c=Math.sqrt(a*a+b*b);
      double sinA= a/c;
      double cosA= b/c;
      double sinB= b/c;
      double cosB= a/c;
      System.out.println("sinA will be"+sinA);
      System.out.println("sinB will be"+sinB);
      System.out.println("cosA will be"+cosA);
      System.out.println("cosB will be"+cosB);
    }
}
