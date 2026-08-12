public class differentPatterns {
    public static void main(String[] args) {
        /*
         * int m=5;
         * int n=4;
         */
        /*
         * for(int i=1;i<=n;i++){
         * for(int j=1;j<=m;j++){
         * System.out.print("*");
         * }
         * System.out.println("");
         * }
         */
        /*
         * for(int i=1;i<=n;i++){
         * for(int j=1;j<=m;j++){
         * if(i==1||j==1||i==n||j==m){
         * System.out.print("*");
         * }else{
         * System.out.print(" ");
         * }
         * }System.out.println(" ");
         * 
         * }
         */
        /*
         * int row=4;
         * for(int i=1;i<=row;i++){
         * for(int j=1;j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println("");
         * }
         */
        /*
         * int row=4;
         * for(int i=1;i<=row;i++){
         * for(int j=row;j>=i;j--){
         * System.out.print("*");
         * 
         * }
         * System.out.println(" ");
         * }
         */
        /*
         * int row=4;
         * for(int i=row;i>=1;i--){
         * for(int j=1;j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println(" ");
         * }
         */
        /*
         * int row=4;
         * for(int i=1;i<=row;i++){
         * for(int j=row-1;j>=i;j--){
         * System.out.print(" ");
         * }
         * for(int k=1;k<=i;k++){
         * System.out.print("*");
         * }
         * System.out.println(" ");
         * }
         */
        /*
         * int row=4;
         * for(int i=1;i<=row;i++){
         * for(int j=row;j>=i;j--){
         * System.out.print("*");
         * }
         * for(int k=1;k<=i;k++){
         * System.out.print(" ");
         * }
         * System.out.println(" ");
         * }
         */
        /*
         * int row=4;
         * for(int i=1;i<=row;i++){
         * for(int j=1;j<=i;j++){
         * System.out.print(+j);
         * }
         * System.out.println(" ");
         * }
         */
        // Solution for flyds triangle
        int n = 5;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + "");
                number++;
            }
            System.out.println(" ");
        }
    }
}