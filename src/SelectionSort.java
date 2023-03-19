package com.gl.datastructures;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {24,13,12,13,32,55};
		selectionSort(arr);
	}
	
	public static void selectionSort(int arr[])
	{
		int min = 0;
		int temp = 0;
		int index = 0;
		int size = arr.length;
		for(int i = 0;i<size ;i++)
		{
			min = arr[i];
			temp = arr[i];
			for (int j = i;j<size-1;j++)
			{
				if(arr[j+1]<min)
				{																																																																								
					min = arr[j+1];
					index = j+1;
				}
				
			}
			if (min != temp)
			{
			arr[i] = min;
			arr[index] = temp;
			}
			System.out.println("After Iteration "+i);
			for(int k=0;k<size;k++)
			{
				System.out.print(arr[k]+"\t");
			}
			System.out.println("\n");
		}
		
//		for(int k=0;k<size;k++)
//		{
//			System.out.print(arr[k]+"\t");
//		}
	}

}
