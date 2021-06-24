package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());	
		for(int k=0; k<t; k++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int r = Integer.parseInt(st.nextToken());
		String s = st.nextToken();
	
		for(int j=0; j<s.length(); j++) {
			for(int i=0; i<r; i++) {
				System.out.print(s.charAt(j));
				}
			}
		System.out.println("");
		}
	}
}
