
public class QuickSort {
	static void swap(int arr[],int i,int j)
	{
		int temp=0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	int partition(int arr[],int low,int high)
	{
		int i = low+1;
		int j = high;
		int p = arr[low];
//		System.out.println();
//		System.out.println("i="+i);
//		System.out.println("j="+j);
//		System.out.println("p="+p);
//		System.out.println("arr[1]"+arr[1]);
		while (low < high)
		{
			while(arr[i]<=p && i<high)
			{
//				System.out.println("i arr["+i+"]="+arr[i]);
				i++;
			}
			
			
			while(arr[j]>p)
			{
//				System.out.println("j arr["+j+"]="+arr[j]);
				j--;
			}
			if (i<j)
			{
				swap(arr,i,j);
			}
			else
			{
				swap(arr,low,j);
				return j;
			}
		}
		return j;
	}
	 void Sort(int arr[],int l,int h)
	 {
		 if(l<h)
		 {
			 int k = partition(arr,l,h);
//			 System.out.println();
//			 System.out.println("K Value = "+k);
			 Sort(arr,l,k-1);
//			 System.out.println();
//			 System.out.println("Left Array");
//			 for(int a=0;a<arr.length;a++)
//				{
//					System.out.print(arr[a]+"\t");
//				}
//			 System.out.println();
			 Sort(arr,k+1,h);
//			 System.out.println();
//			 System.out.println("Right Array");
//			 for(int a=0;a<arr.length;a++)
//				{
//					System.out.print(arr[a]+"\t");
//				}
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {63,85,12,56,21,44};
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		QuickSort qs = new QuickSort();
		qs.Sort(arr,0,arr.length-1);
		
		System.out.println();
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
	}

}
