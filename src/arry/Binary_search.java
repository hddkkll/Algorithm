package arry;

import java.util.Scanner;

//이분검색은 미리 정렬된 데이터가 있어야함

//값 입력받은후
//배열의 중간값을 뽑아 비교
//
public class Binary_search {
	public static void main(String[] args) {
		int arr[] = new int[100];
		int count = 0; // 횟수
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		int index1=0;	//앞쪽 인덱스저장
		int index2=arr.length-1;	//뒤쪽 인덱스저장
		int index=(index1+index2)/2;	//실제 인덱스

		// 배열에 1~100 순서대로 넣음
		for (int i = 0; i < 100; i++)
			arr[i] = i + 1;
		
		
		System.out.print("검색할 숫자 입력 : ");
		num = sc.nextInt();
		sc.nextLine();
	
		
		while (true) {
			count++;
			
			//값을 찾았을때
			if (num == arr[index]) {
				System.out.println(num + " 은 " + count + " 번만에 찾았습니다");
				break;
			}
			
			//찾는값이 인덱스보다 큰경우
			else if(num > arr[index]) {				
				index1=index+1;
				index=(index1+index2)/2;
			}
			
			//찾는값이 인덱스보다 작은경우
			else if(num < arr[index]) {
				index2=index-1;
				index=(index1+index2)/2;
			}	
		}
	}
}