
import java.util.Scanner;

public class MergeSort{
	 void sort(int arr[],int left,int right)
	{
		int mid;
		if (left < right)
		{	
		mid = (left+right)/2;
		sort(arr,left,mid);
		sort(arr,mid+1,right);
		}
	}
	public static void main(String args[]) {
		
		int size = 0;
		
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i = 0;i<size;i++)
		{
			Scanner ae = new Scanner(System.in);
			arr[i] = ae.nextInt();
		}
		for(int j = 0;j<size;j++)
		{
			System.out.print(arr[j]+"\t");
		}
		
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, size-1);
	}
	
}	
	