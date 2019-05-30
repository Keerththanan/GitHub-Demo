/********************************************
 *					QUIZ					*
 ********************************************/

/*
 * Write a logic to optimize a list of lists according to the below conditions.
 * 1. If size of two or more CONSICUTIVE element in the parent list is 1, put them together as a
 * 	single child list.
 * 
 * This is the format of the list at the begining.
 * ArrayList at the begining: [[1], [2, 3], [4], [5], [6], [7, 8], [9], [10, 11]]
 * 
 * This should be your final output.	
 * ArrayList after the process: [[1], [2, 3], [4, 5, 6], [7, 8], [9], [10, 11]]
*/


import java.util.ArrayList;
import java.util.List;

public class OptimizeArrayList {

	public static void main(String[] args) {
		List<Integer> list0 = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();
		List<Integer> list5 = new ArrayList<>();
		List<Integer> list6 = new ArrayList<>();
		List<Integer> list7 = new ArrayList<>();

		// Use more lists
		/*
		 * List<Integer> array8 = new ArrayList<>(); List<Integer> array9 = new
		 * ArrayList<>(); List<Integer> array10 = new ArrayList<>();
		 */

		list0.add(1);
		list1.add(2);
		list1.add(3);
		list2.add(4);
		list3.add(5);
		list4.add(6);
		list5.add(7);
		list5.add(8);
		list6.add(9);
		list7.add(10);
		list7.add(11);

		List<List<Integer>> arrays = new ArrayList<List<Integer>>();
		arrays.add(list0);
		arrays.add(list1);
		arrays.add(list2);
		arrays.add(list3);
		arrays.add(list4);
		arrays.add(list5);
		arrays.add(list6);
		arrays.add(list7);

		// Print ArrayList at the begining
		System.out.println("ArrayList at the begining: " + arrays);

		//TODO Implement your logic HERE
		
		// Print ArrayList at the process
		System.out.println("ArrayList after the process: " + arrays);
	}
}
