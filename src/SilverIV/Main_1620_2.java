package today_solving;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Main_1620_2 { //

	public static void main(String[] args) throws Exception {
		
		Map<String, String> hash = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<a; i++) {
			String pocketmon = br.readLine();
			String Num = Integer.toString(i+1);
			hash.put(pocketmon, Num);
			hash.put(Num, pocketmon);
		}
		
		
		for(int i=1; i<a+1; i++) {
			System.out.println(i+" "+hash.get(i));
		} // 입력확인용 for
		System.out.println(hash);
	
		
		
		
		for(int i=0; i<b; i++) {
				sb.append(hash.get(br.readLine()) + "\n");	
		}		
			System.out.print(sb);
		}
	}