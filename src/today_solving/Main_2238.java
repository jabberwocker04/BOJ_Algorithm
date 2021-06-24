package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main_2238 {

	public static void main(String[] args) throws Exception{
		//낮은 가격 제시한 놈이 사가는 경매
		//같은 가격이 둘 이상일 경우에는 무효임
		//1. 가장 적은 수의 사람이 제시한 가격을 찾는다. || 같은 가격을 제시한 사람이 둘 이상일 경우 무효
		//가장 낮은 가격으로 물건을 판다, 그리고 가장 먼저 제시한 사람이 물건을 살 수 있다.
		int min = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int U = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String[] jesi = new String [N];
		int[] n_number = new int[N];
		String[] n_name = new String[N];
		
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		/* map으로 풀까 싶어서 만들었던 것
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
			
		}
		*/
		
		jesi[0] = br.readLine();
		n_number[0] = Integer.parseInt(jesi[0].split(" ")[1]);
		n_name[0] = jesi[0].split(" ")[0];
		
		for(int i=1; i<N-1; i++) {
			jesi[i] = br.readLine();
			System.out.println(jesi[i]);
			
				for(int j=0; j<N; j++) {
				if(n_name[i] == n_name[j-1]) {
					
					
					n_number[i] = Integer.parseInt(jesi[i].split(" ")[1]);
					
				}
			}
		}// 입력받기 끝
		
		
		
		
		
		
	}
}
