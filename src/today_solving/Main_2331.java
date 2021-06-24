package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2331 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		int b= Integer.parseInt(st.nextToken());
		
		List<Integer> Array = new ArrayList<Integer>();
		int count = 1; //
		Array.add(count, Integer.parseInt(a)); // 첫번째 입력을 add 해준다
		
		while(true) {
			for(int i=1; i<Array.size(); i++) { 
				if(Array.contains(Array.get(i))) {
					System.out.print(count);
					break;
				}} // 동일한 값이 있으면 반복 종료 == for문(중복검사) 종료
			
			//List에 값 추가하기
			String[] a_a = a.split("");
			int sum = 0;
			int[] a_b = new int[100000];
			for(int i=0; i<a_a.length; i++) {
				int a_b[i] = Integer.parseInt(a_a[i]);
				for(int j=0; j<b; j++) {
					sum = sum +(a_b[i]*a_b[i]);					
				}
			}
			
			
			
			}// 무한반복
		
		
		
		} 
		
		
	
	public int bae(int a, int b) {
		int D = a;
		
		
		return D;
	}
}