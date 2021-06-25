package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_1292_solved {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] work = new int[1001];
		
		int count = 1;
		
		for(int i=0; i<work.length; i++) {
			for(int j=0; j<i; j++) {
				if(count==1001){
					break;
				}
				work[count] = i;
				count ++;
			}
		}//이중포문 종료
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum = sum+work[i];
		}
		System.out.println(sum);
	}
}
