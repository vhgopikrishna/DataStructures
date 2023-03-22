
import java.util.Scanner;

public class MergeSort{
	void merge(int arr[],int left,int mid,int right)
	 {
		 int leftsize = mid - left +1;
		 int rightsize = right - mid;
		 int temp = 0;
		 
		 int leftarr[] = new int[leftsize];
		 int rightarr[] = new int[rightsize];
		 
		 for(int i = 0;i<leftsize;i++)
		 {
			 leftarr[i] = arr[left+i];
		 }
		 for(int j=0;j<rightsize;j++)
		 {
			 rightarr[j] = arr[mid+1+j];
		 }
		 
		 int i=0; 
		 int j=0;
		 int k=left;
		 
		 while(i < leftsize && j< rightsize)
		 {
			 if (leftarr[i]<rightarr[j])
			 {
				 arr[k] = leftarr[i];
				 i++;
			 }
			 else
			 {
				 arr[k] = rightarr[j];
				 j++;
			 }
			 k++;
		 }
		 while(i<leftsize)
		 {
			 arr[k]=leftarr[i];
			 i++;
			 k++;
		 }
		 while(j<rightsize)
		 {
			 arr[k]=rightarr[j];
			 j++;
			 k++;
		 }
	 }
	 void sort(int arr[],int left,int right)
	{
		int mid;
		if (left < right)
		{	
		mid = (left+right)/2;
		sort(arr,left,mid);
		sort(arr,mid+1,right);
		merge(arr,left,mid,right);
		}
	}
	public static void main(String args[]) {
		
		int size = 0;
		
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		Scanner ae = new Scanner(System.in);
		for(int i = 0;i<size;i++)
		{
			arr[i] = ae.nextInt();
		}
		for(int j = 0;j<size;j++)
		{
			System.out.print(arr[j]+"\t");
		}
		System.out.println();
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, size-1);
		for(int l=0;l<size;l++)
		{
			System.out.print(arr[l]+"\t");
		}
	}
	
}	
	