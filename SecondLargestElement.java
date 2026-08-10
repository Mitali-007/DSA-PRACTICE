import  java.util.*;
public class SecondLargestElement{
	static int secondLargestElement(int a[]){
		int n = a.length;
		int max=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]>secondLargest && a[i]<max){
				secondLargest =a[i];
			}
        }
		return secondLargest;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		int n = sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.print(secondLargestElement(a));
	}
}
