package sort;

public class insert {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 3, 2, 6 };
		int temp;
		int index;

				
		for (int key = 1; key < arr.length; key++) {
			index = key;
			for (int value = key - 1; value >= 0; value--) {
				if (arr[index] < arr[value]) {
					temp = arr[value];
					arr[value] = arr[index];
					arr[index] = temp;
				}
				index--;
			}
		}

		
//		for (int key = 1; key < arr.length; key++) {
//			index = key;
//			for (int value = key - 1; value >= 0; value--) {
//				System.out.println(" key : " + key + " index : " + index + " value : " + value);
//				index--;
//			}
//		}
		
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
	}
}