package sort;
//���� �̿��� �����͵��� ���Ͽ�
//ū�����͸� �ڷ� ������ ���

public class Bubble {

	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2,6};
		int temp;
		
		//ó�������
		System.out.print("������ : ");
		for(int i = 0 ; i<arr.length;i++)
			System.out.print(arr[i]);
		System.out.println("");
		
		//��
		for(int a=1; a<arr.length;a++) {
			for(int i=0; i<arr.length-a; i++) {
			//���� ����
			if(arr[i]>=arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}		
			}
		}
		
		//������ ���
		System.out.print("������ : ");
		for(int i = 0 ;i<arr.length;i++)
			System.out.print(arr[i]);
	}

}