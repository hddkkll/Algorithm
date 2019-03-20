package sort;
//리스트중 최소값을 찾기

//그값을 맨앞에 위치한 값과 교체
//맨앞을 뺀 나머지 리스트를 같은 방법으로 교체

public class Select {

	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2,6};
		int min;
		int temp;

		// 정렬전
		System.out.print("정렬전 : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.println("");

		// 정렬중
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			boolean ck = false;
			for (int a = i + 1; a < arr.length; a++) {
				if (arr[min] > arr[a]) {
					min = a;
					ck = true;
				}
			}
			if (ck) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

		// 정렬후
		System.out.print("정렬후 : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.println("");
	}

}
