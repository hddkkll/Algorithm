package arry;

public class Rank {
	public static void main(String[] args) {
		int jumsu[] = {5,4,1,3,2,6};
		int rank[] = {1,1,1,1,1,1};
		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<rank.length; j++) {
				if(jumsu[i]<jumsu[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0; i<rank.length;i++)
			System.out.println(rank[i]);
	}

}
