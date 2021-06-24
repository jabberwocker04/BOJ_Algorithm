package today_solving;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//아이스크림 처먹지마

public class Main_2422 { // 아직 못품
	
static int Combination_zumsu;

	public static void main(String[] args) throws Exception {
		//아이스크림 가게에 N종류의 아이스크림(1번부터 N번까지의 번호가 있음)
		//어떤 종류의 아이스크림은 함께 먹으면 쓰레기
		//이러한 경우를 피하면서 3가지를 선택하려고 한다.
		
		//N과 M이 주어진다. N은 아이스크림 종류의 수이고, M은 섞으면 안되는 조합의 개수이다. 아래 M개의 줄에는 섞으면 안되는 조합의 번호가 주어진다.
		//같은 조합은 두번 이상 나오지 않는다. 가능한 방법은 총 몇개인가?
		//5 3 -> 5개의 아이스크림과 3가지 섞어먹으면 안되는 조합이다. 1,2->1번은 2번과 섞이면 안됨 || 3,4 -> 3,4가 섞이면 안됨 || 1,3 -> 1,3이 섞이면 안됨
		//->145,235,245 이렇게 세가지만 가능함.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean icecream[][] = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			icecream[i][i] = true;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken())-1;
			int end = Integer.parseInt(st.nextToken())-1;
			icecream [start][end] = true;
			icecream [end][start] = true;
		}

		int answer = 0;
		for(int i=0; i<N; i++) {
			for(int j=1; j<N; j++) {
				if(!icecream[i][j]) { // icecerea[i][j]일때
					
					for(int k=j; k<N; k++) { // k=j부터 시작해서 N까지 반복한다
						if(!icecream[j][k] && !icecream[i][k]) { // [j][k] && [i][k] 둘다 false 이면 answer ++;
							answer++;
							//System.out.println((i+1) +" "+(j+1) +" "+(k+1));
						}
					}
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				
				System.out.print(icecream[i][j]+" ");
			}
			System.out.println("");
			}
			
		System.out.println(answer-(N-1));	
	}
}