/**
 * Create a method which accepts an integer array and removes all the 
 * duplicates in the array.
 * Return the resulting array in descending order
 * @author M. Sai Harini
 *
 */
import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int array[] = {1,2,4,10,20,60,70};
		changeArray(array);

	}
	public static void changeArray(int[] array) {
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]==array[j])
				{
					array[j]=array[len-1];
					len--;
					j--;
				}
			}
		}
		
		System.out.println("Removing Duplicates");
		int[] array1=Arrays.copyOf(array, len);
		for(int i=0;i<len;i++) 
		{
			System.out.println(array1[i]+"");
		}
		System.out.println();
		
		Arrays.sort(array1);
		System.out.println("Ascending order");
			for(int i=0;i<array1.length;i++) 
			{
				System.out.print(array1[i]+"");
		}
			System.out.println();
			
			System.out.println("Descending order");
			for(int i= array1.length-1;i>=0;i--)
			{
				System.out.println(array1[i]+" ");
			}
	}

}
