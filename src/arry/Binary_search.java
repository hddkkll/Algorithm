package arry;

import java.util.Scanner;

//�̺а˻��� �̸� ���ĵ� �����Ͱ� �־����

//�� �Է¹�����
//�迭�� �߰����� �̾� ��
//
public class Binary_search {
	public static void main(String[] args) {
		int arr[] = new int[100];
		int count = 0; // Ƚ��
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		int index1=0;	//���� �ε�������
		int index2=arr.length-1;	//���� �ε�������
		int index=(index1+index2)/2;	//���� �ε���

		// �迭�� 1~100 ������� ����
		for (int i = 0; i < 100; i++)
			arr[i] = i + 1;
		
		
		System.out.print("�˻��� ���� �Է� : ");
		num = sc.nextInt();
		sc.nextLine();
	
		
		while (true) {
			count++;
			
			//���� ã������
			if (num == arr[index]) {
				System.out.println(num + " �� " + count + " ������ ã�ҽ��ϴ�");
				break;
			}
			
			//ã�°��� �ε������� ū���
			else if(num > arr[index]) {				
				index1=index+1;
				index=(index1+index2)/2;
			}
			
			//ã�°��� �ε������� �������
			else if(num < arr[index]) {
				index2=index-1;
				index=(index1+index2)/2;
			}	
		}
	}
}