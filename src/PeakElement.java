import java.util.Scanner;
public class PeakElement {
        // TODO: Read n
        // TODO: Read the array elements
        // TODO: Find the first peak element and print its index
        public static int peakElement(int[] arr){
                int n = arr.length;
                if(n==0)
                        return -1;
                if(n==1 || arr[0]>arr[1])
                        return 0;
                for(int i=1; i<n-1; i++){
                        if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
                                return i;
                }
                if(arr[n-1]>arr[n-2]){
                        return n-1;
                }
                return -1;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println(peakElement(arr));
        }
}
