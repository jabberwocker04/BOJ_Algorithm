package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_2947_solved {

	public static void main(String[] args) throws Exception {
		// 나무조각 5개를 가진다
		// 나무조각은 1부터 5까지 있음
		// 나무조각을 1 2 3 4 5 순서로 만들려고 한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a_a = new int [5];
		
		for(int i=0; i<a_a.length; i++) {
			a_a[i] = Integer.parseInt(st.nextToken());
		} // 입력
		
		for(int i=0; i<a_a.length-1; i++) { // 버블정렬
			for(int j=0; j<a_a.length-1; j++) {
				if(a_a[j] > a_a[j+1]) {
					int temp = a_a[j];
					a_a[j] = a_a[j+1];
					a_a[j+1] = temp;
					for(int k=0; k<a_a.length; k++) {
						System.out.print(a_a[k]+" ");				
					}
					System.out.println("");
				} // if문
			}
		}
	}
}