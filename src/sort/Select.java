package sort;
//����Ʈ�� �ּҰ��� ã��

//�װ��� �Ǿտ� ��ġ�� ���� ��ü
//�Ǿ��� �� ������ ����Ʈ�� ���� ������� ��ü

public class Select {

	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2,6};
		int min;
		int temp;

		// ������
		System.out.print("������ : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.println("");

		// ������
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

		// ������
		System.out.print("������ : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.println("");
	}

}
