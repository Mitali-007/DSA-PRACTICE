import java.util.*;
public class LinearSearch {
    static int linearSearch (int[] arr, int target) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
            else
                continue;
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("Linear Search: " + linearSearch(arr, target));
    }
    
}
