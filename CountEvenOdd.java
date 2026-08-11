import java.util.*;
public class CountEvenOdd {
    static void countEvenOdd(int a[]){
       int evencount=0;
       int oddcount=0;
       int n= a.length;

       for (int i=0;i<n;i++) {
           if (a[i] % 2 == 0) {
               evencount++;
           } else {
               oddcount++;
           }
       }

       System.out.println("Even count: " + evencount);
       System.out.println("Odd count: " + oddcount);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        countEvenOdd(a);
    }
    
}
