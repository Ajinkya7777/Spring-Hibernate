package LambdaExpressionAndFunctionalInterface;

import java.util.TreeMap;

public class TreeMapSorting {
	 public static void main(String[] args) {
		
		 TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		 tree.put(1, "Mango");
		 tree.put(3, "Apple");
		 tree.put(4, "Banana");
		 tree.put(2, "Kiwi");
		 
		 System.out.println("Before sorting :\t"+tree);
		 //by defalut tree map will give us the order natural order and if we pass the lambda expression to the 
		 // constructor of the treemap then we will get the customized order
		 
		 TreeMap<Integer, String> tree2 = new TreeMap<Integer, String>((i1,i2) ->  (i1>i2)?-1:(i1<i2)?1:0);
		 
		 tree2.put(1, "Mango");
		 tree2.put(3, "Apple");
		 tree2.put(4, "Banana");
		 tree2.put(2, "Kiwi");
		 
		 System.out.println("after Sorting :\t" +tree2);
		 //customized descending order bcz we passed the lambda expression as the argument to the treemap constructor
		 
		 
	}
}
