import java.util.*;

public class DArray {
	public static void main (String args[]) {
	
//	ArrayList<String> arraylist = new  ArrayList<String>();
	DynamicArray dynamicArray = new DynamicArray(5);
//	System.out.println(dynamicArray.capacity);
	
	dynamicArray.add("A");
	dynamicArray.add("B");
	dynamicArray.add("C");
	dynamicArray.add("D");
	dynamicArray.add("E");
	dynamicArray.add("F");

	dynamicArray.delete("A");
	dynamicArray.delete("B");
	dynamicArray.delete("C");

//	
//	dynamicArray.insert(0,"X");
//	dynamicArray.delete("A");
//	System.out.println(dynamicArray.search("C"));
	System.out.println(dynamicArray);
	System.out.println("size:"+dynamicArray.size);
	System.out.println("Capacity:"+dynamicArray.capacity);
System.out.println("empty:"+dynamicArray.isEmpty());
	}
}
