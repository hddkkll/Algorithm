package sort;
//서로 이웃한 데이터들을 비교하여
//큰데이터를 뒤로 보내는 방식

public class Bubble {

	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2,6};
		int temp;
		
		//처음값출력
		System.out.print("정렬전 : ");
		for(int i = 0 ; i<arr.length;i++)
			System.out.print(arr[i]);
		System.out.println("");
		
		//비교
		for(int a=1; a<arr.length;a++) {
			for(int i=0; i<arr.length-a; i++) {
			//비교후 스왑
			if(arr[i]>=arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}		
			}
		}
		
		//최종값 출력
		System.out.print("정렬후 : ");
		for(int i = 0 ;i<arr.length;i++)
			System.out.print(arr[i]);
	}

}