package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1152 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine(); // 문자 입력
		int count = 0; // 카운팅
		
		
		//String arrays[]= a.split(" ");
		// (2) ->split함수로 나눠주는 방식도 틀렸음
		
		/*	
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) == ' '){
				count++;
			}
		} (1)' '을 세주는 방식은 틀렸음
		*/
		
		
		StringTokenizer st = new StringTokenizer(a," ");
		// StringTokenizer는 지정한 구분자(문자)로 문자열을 쪼개어 준다.
		// 구분자를 적어주지 않고 문자열만 넣으면 공백을 기준으로 나누어 줌.("")
		System.out.println(st.countTokens()); //st를 호출하고, countTokens라는
		//메쏘드를 사용하여 토큰의 개수를 반환한다.
	
	
	}
}
