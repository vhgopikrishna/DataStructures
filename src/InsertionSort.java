package src;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {15,4,99,1,61,24};
		int size = input.length;
		System.out.println("Original Array");
		for(int i=0;i<size;i++)
		{
			System.out.print(input[i]+"\t");
		}
		for(int i = 1;i<size;i++)	
		{
			int temp = input[i];
			int j = i-1;
			while(j>=0 && input[j]>temp)
			{
				input[j+1] = input[j];
				j--;
					
			}
			input[j+1] = temp;
		}
		System.out.println();
		System.out.println("Sorted Array");
		for(int i=0;i<size;i++)
		{
			System.out.print(input[i]+"\t");
		}
	}

}
