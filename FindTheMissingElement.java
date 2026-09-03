import java.util.Scanner;
public class FindTheMissingElement{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int actualSum=0;
        int arr[]= sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            actualSum+=arr[i];
        }
        int expectedsum= n*(n-1)/2;
        int missingelement= expectedsum-actualSum;

        System.out.println("missingelement");

        
        }

}
// 
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = n;

        for (int i = 0; i < n; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor;
    }
}