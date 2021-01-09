/**
 * Create a method that can accept an array of string objects and sort in 
 * alphabetical order. The elements in the lefthalf shpuld be completely
 * in uppercase and the elements in the right half should be completely
 * in lower case. Return the resulting array.
 * NOTE: If there are odd number of string objects, then (n/2)+1
 * elements should be in UPPERCASE.
 * @author M. Sai Harini
 *
 */
import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String[] objects = {"HARI","HARINI","TOMY"};
		sortStrings(objects);

	}
	public static void sortStrings(String[] objects) {
		Arrays.sort(objects);
		int length=  objects.length;
		for(int i=0;i<length;i++) {
			if(length%2==0)
			{
				if(i<(length/2)) {
					System.out.print(objects[i].toUpperCase() + " ");
				}
				else {
					System.out.print(objects[i].toLowerCase()+" ");
				}
			}
			else {
				if(i<=((length/2)-1)) {
					System.out.print(objects[i].toUpperCase() +" ");
				}
				else {
					System.out.print(objects[i].toLowerCase() +" ");
				}
			}
		}
	}

}
