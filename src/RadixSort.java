package src;

import java.util.Arrays;

public class RadixSort {
	
	static int getMax(int arr[],int size)
	{
		int max = arr[0];
		for(int i=1;i<size;i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	static int[] Sort(int arr[],int size,int max)
	{
		int res[] = new int[size];
		for(int i=0;i<size;i++)
		{
			res[i] = arr[i];
		}
		//Iterating the loop for no of digit times in the max number of the array
		for (int pos=1;(max/pos)>0;pos*=10)
		{
			int count[] = new int[10];
			Arrays.fill(count, 0);
			//Constructing count array
			for(int i =0;i<size;i++)
			{
				++count[((arr[i]/pos)%10)];
			}
			//Constructing Cumulative count array
			for(int j=1;j<size;j++)
			{
				count[j] = count[j]+count[j-1];
			}
			//Constructing the sorted array for each pass of pos
			for(int k=(size-1);k>=0;k--)
			{
				res[--count[((arr[k]/pos)%10)]] = arr[k];
			}
			for(int m=0;m<size;m++)
			{
				arr[m] = res[m];
			}
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {432,8,530,90,88,231,11,45,677,199};
		int size = input.length;
		int max = getMax(input,size);
		System.out.println("Original Array");
		for(int i = 0;i<size;i++)
		{
			System.out.print(input[i]+"\t");
		}
//		int maxdigits = getMaxDigitCount(max);
		input = Sort(input,size,max);
		System.out.println();
		System.out.println("Sorted Array");
		for(int i = 0;i<size;i++)
		{
			System.out.print(input[i]+"\t");
		}
	}

}
