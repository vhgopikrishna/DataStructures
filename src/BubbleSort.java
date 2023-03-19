package com.gl.datastructures;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {56,44,89,12,23,65,9,17,11};
		bubbleSort(arr);			
	}
	
	public static void bubbleSort(int array[]) {
		int temp = 0;
		System.out.println(array.length);
		for (int i = 0;i<array.length;i++) 
		{
			for (int j=0;j<array.length-1;j++)
			{  
				if (array[j]>array[j+1])
				{
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			  }	
			
		}
		for (int k = 0;k<array.length;k++)
		{	
			System.out.print(array[k]+"\t");
		}
	}

}
