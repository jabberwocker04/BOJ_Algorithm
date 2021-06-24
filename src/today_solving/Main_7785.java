package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_7785 {

	public static void main(String[] args) throws Exception {
		//n개의 출입기록이 주어진다
		//n개의 줄에는 출입 기록과 이름이 주어진다.
		//동명이인이 없고, 대소문자가 다르면 다른 사람이다. 
		//사전의 역순으로 회사에 있는 사람들 출력.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String,String> set = new HashSet<String,String>();//HashMap생성
		int Testcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<Testcase; i++) {
			String[] input = new String[2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[0] = st.nextToken();
			input[1] = st.nextToken();
			map.put(input[0], input[1]);
		}
		
		System.out.println(map.values());
		System.out.println(map.keySet());
		
	}
}
