package today_solving;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Main_1343 {

	public static void main(String[] args) throws Exception {
		//폴리오미노 AAAA와 BB 2개를 무한대로 가짐
		//'.'와 'X'로 이루어진 보드판에서 'X'를 모두 덮고, '.'는 덮으면 안된다.
		//폴리오미노로 모두 덮은 보드판을 출력하라
		
		//입력)보드판의 크기는 최대 500
		//출력)사전순으로 가장 앞서는 답을 출력하고, 못덮으면 -1 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		String[] a_a = input.split("");
		String [] arr = new String [500];
		int [] temp = new int [500];
		
		
		for(int i = 0; i<input.length(); i++) {
			if(a_a[i].equals("X")) {
				temp[i] = 1;				
			}
		}// X를 1로 변환함
		int count = 0;
		int num = 0;//배열의 위치 지정하는 변수
		boolean possible = true;
		for(int i=0; i<input.length(); i++) {
			if(temp[i] == 1) {
				count++;
			if(count % 4 == 0) {
				arr[num] = "AAAA";
				num++;
				count = 0; // 4로 나누어지면 AAAA
			} else if(count % 4 != 0 && count % 2 == 0 && temp[i+1] != 1) {
				arr[num] = "BB";
				num++;
				count = 0;
			}
			}else {
				if(count %2 != 0) {
					possible = false;
					break;
				} else {
					arr[num] = ".";
					num++;
				}
			}
		}
		
		if(possible == false || count==1) {
			System.out.println(-1);
		} else {
			for(int i=0; i<num; i++) {
				System.out.print(arr[i]);
			}
		}
		
	}
}
