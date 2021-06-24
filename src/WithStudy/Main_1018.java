package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {

	public static void main(String[] args) throws Exception {
		//MN개의 단위 정사각형으로 나누어져 있는 M*N 크기의 보드
		//검은색, 흰색으로 칠해져 있음 이 M*N을 잘라서 8*8크기의 체스판 만들기
		//체스판처러 검흰검흰 번갈아서 칠해짐
		//(0,0)이 흰색인 경우 || (0,0)이 검은색인 경우
		//M*N에서 최대한 비슷한 8*8을 떼어낸 후 
		//몇개의 정사각형을 다시 칠해야겠다고 생각함.
		//다시 칠할 정사각형의 최소 개수를 구하는 프로그램
		
		//N,M>=8 || N,M<=8 
		//둘째줄부터 N개의 줄에는 보드의 각 행 상태가 주어진다.
		//B는 검은색 W는 흰색이다
		
		String[][] firstW = {{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"}};
		
		
		String[][] firstB = {{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"}};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int g = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		String Chess[][] = new String [g][s];
		int count[] = new int [g];
		
		
		for(int i=0; i<g; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<s; j++) {
				Chess[i][j] = st.nextToken();
				}
				
			}
		
		
	for(int i=0; i<g; i++) {
		System.out.println("");
		for(int j=0; j<s; j++) {
			System.out.print(Chess[i][j]) ;
			}
		
		}
	
	}
}