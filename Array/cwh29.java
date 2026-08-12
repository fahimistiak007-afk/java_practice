
 public class cwh29{
    public static void main(String[] args) {
        // Create a array of 5 floats and print their sum
        /*
         * float[]marks={45.7f,65.6f,98.3f,78.1f,56.3f};
         * float sum=0;
         * for(float element :marks){
         * sum=sum+element;
         * }
         * System.out.println("The value of sum is :"+sum);
         */
        // Create an array wheter the gvivent integar is present or not?
        /*
         * float[]marks={45.7f,67.8f,63.4f,99.2f,100.8f};
         * float num=63.4f;
         * boolean isArray=false;
         * for(float element:marks){
         * if(num==element){
         * isArray=true;
         * break;
         * }
         * 
         * }
         * if(isArray=true){
         * System.out.println("The Value is present in the array");
         * }
         * else{
         * System.out.println("The value is not present in the array");
         * 
         * }
         */
        // Create a programme to add two numbers of sign matrice 2 into 3
        /*
         * int [][]mat1={{1,2,3},
         * {4,5,6}};
         * int[][]mat2={{2,6,13},
         * {3,7,1}};
         * for(int i=0;i<mat1.length;i++){
         * for(int j=0;j<=matm,[i].length;j++){
         * System.out.printf("The Value will be i"); }
         */
        // Write a java Programme that reverse an array
        /*
         * int []arr={1,2,3,4,5,6};
         * int l=arr.length;
         * int n=Math.floorDiv(l,2);
         * int temp=0;
         * for(int i=0;i<=n;i++){
         * temp= arr[i];
         * arr[i]=arr[l-1-i];
         * arr[l-i-1]=temp;
         * 
         * }
         * for(int element:arr){
         * System.out.println(element);
         * }
         */
        // Write a Java Programme to find the Maximum element in an array
        /* MY FAILED ATTEMPT
int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
       
        int max = 0;
        int temp = 0;
        for (int i = 0; i <= arr.length;i++){
            temp = arr[i];
            if (temp >= max) {
                max = temp;
            }
        }
System.out.println("The Highest value will be"+max); */
//CODE WITH HARRYS ATTEMPT 
int[]arr={1,34,56,76,32};
int max=0;
for(int e:arr){
    if(e>max){
        max=e;
    }
}
System.out.println(max);
    }
}
