package sort;

import java.util.Arrays;


/*
�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��

array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��,
commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return
*/

public class seek_k_number {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { 	{ 2, 5, 3 },
								{ 4, 4, 1 },
								{ 1, 7, 3 }

		};

		Solution s = new Solution();
		
		System.out.println(Arrays.toString(s.solution(array, commands)));
	}
}

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] newarr;
		int start;
		int end;
		
		for (int i = 0; i < commands.length; i++) {
			start=commands[i][0]-1;
			end=commands[i][1];
			newarr=Arrays.copyOfRange(array, start, end);
			Arrays.sort(newarr);
			answer[i]=newarr[commands[i][2]-1];
		}
		
		return answer;
	}
}