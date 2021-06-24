package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		String Q[] = new String[a];
		for(int i=0; i<a; i++) {
			Q[i] = br.readLine();
		}
		
		Arrays.sort(Q, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(Q[0]);
		for(int i=1; i<a; i++) {
			if (!Q[i].equals(Q[i-1])) {
			System.out.println(Q[i]);
			}
		}
	
	}
}
