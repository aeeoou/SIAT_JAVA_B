package ch07.ex04.case01;
// Array
public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3];
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		// iterating (데이터를 반복적으로 읽어내는 작업)
		// 17~20 코드를 한 줄로 줄인 작업
		for(int i = 0; i < ints.length; i++) ints[i] = i;
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		
		System.out.println();
		
		// for each
		for(int i: ints) System.out.print(i + " ");
		
		int[] array = {30, 50, 90};
		array = new int[] {30, 50, 90};
			
	}
}
