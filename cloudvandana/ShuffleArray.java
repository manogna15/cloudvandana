import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        int n;  
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt();  
        int[] arr = new int[n]; 
        System.out.print("Enter the number of elements you want to store: ");  
        for(int i=0; i<n; i++)  {  
        arr[i]=sc.nextInt();  
        }  
        shuffleArray(arr);
        System.out.println("Shuffled Array: " + Arrays.toString(arr));
    }

    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

           
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
