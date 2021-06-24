package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1063 {

	public static void main(String[] args) throws Exception {
		//ŷ
		
		int[][] Chess = new int [8][8];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		int c = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine());
			
			if(st.nextToken().equals("R")) {
				R();
			} 
			
		}
	
	}
	
	public static void R() {
		
	}
}
