package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_2435 {

	public static void main(String[] args) throws Exception {
		// 기상청 인턴 신현수
		//첫째 줄에 두 개의 정수 N과 K가 한 개의 공백을 사이에 두고 주어진다. N은 온도를 측정한 전체 날짜의 수이다. 
		//N은 2이상, 100이하이다. K는 합을 구하기 위한 연속적인 날짜의 수이다. K는 1과 N 사이의 정수이다. 
		//둘째 줄에는 매일 측정한 온도를 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다. 이 수는 모두 -100이상, 100이하이다.
		
		//	첫째 줄에, 온도의 수열에서 연속적인 K일의 온도의 합이 최대가 되는 값을 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N[] = new int[Integer.parseInt(st.nextToken())];
		int K = Integer.parseInt(st.nextToken());
		int M[] = new int[1+N.length-K];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N.length; i++) {
			N[i] = Integer.parseInt(st.nextToken());
		}
		
		int MAX = Integer.MIN_VALUE;
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<K; j++) {
				M[i] = M[i] + N[i+j];
			}
			
			if(MAX<M[i]) {
				MAX = M[i];
			}
		}
		System.out.print(MAX);
	}
}
