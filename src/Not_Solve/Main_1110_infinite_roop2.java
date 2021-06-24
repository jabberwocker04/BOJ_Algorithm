package Not_Solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1110_infinite_roop2 {

	public static void main(String[] args) throws IOException {

		//0 =< N <= 99
		//먼저 주어진 수가 10보다 작으면 앞에 0을 붙여 두자리수로 만듬
		// 각 자리의 숫자를 더한다.
		// 주어진 수의 가장 오른쪽 자리 수와
		// 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수
		
		// 26으로 시작한다 -> 2+6=8 새로운수는 68이다(주어진 수의 가장오른쪽자리 수 6/ 더한수 8)
		//6+8 = 14 -> 8과 4 84 -> 4와 2 42 ||4 + 2 = 6 새로운수는 26
		// 위의 예는 4번만에 원래 수로 돌아온다. 따라서 26의 사이클의 길이는 4.
		//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 구하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a; 
		
		a = br.readLine(); // 처음 받아주는 숫자
		int aa = Integer.parseInt(a);
		String[] b; // 받아준 숫자를 쪼개서 저장할 배열
		int count = 0; // 카운트를 셀 변수
		int c;
		b = a.split("");
		String d;
		while (true) {	
							 //if) 26-> 2 + 6 -> c==8
			c = Integer.parseInt(b[0])+Integer.parseInt(b[1]);
				
			//d는 String b[]는 String c는 int를 String으로 바꿔줌
			// d == 68
			d = b[1] + Integer.toString(c%10); // (String) 68
			
			count ++;
			
			if(d == a) { // 무한루프 클리어 조건
			break;
			} else if(d != a) {
			b = d.split(""); // -> b = [6,8]
			} 
		} // 무한루프 종료
	
		System.out.println("count = " + count);	
		System.out.println("a = "+a+" c= "+c+" d= "+d + " aa = "+aa);
	}
}
