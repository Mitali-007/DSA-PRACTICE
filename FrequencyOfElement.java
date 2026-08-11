import java.util.*;
public class FrequencyOfElement {
    static int freqOfElement(int a[], int target){
        int freq = 0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==target){
                freq = freq+1;
            }
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println("Frequency of element " + freqOfElement(a, target));
    }
    
}
