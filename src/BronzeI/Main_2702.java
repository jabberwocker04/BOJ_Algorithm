package BronzeI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_2702 {
	public static void main(String[] args) throws IOException {
		// 두 정수 a와 v의 최소 공배수는 두수의 공통된 배수중 가장 작고
		// ex)2, 3 = 6
		// 최대공약수는 두스의 공통된 약수중 가장 큰 수이다.
		// ex)30, 50 == 150
		
		//테스트 케이스 T = 1<=T<=1000
		// 각 테스트 케이스는 a와 b로 이루어짐 + 공백으로 구분
		// 테스트 케이스의 최소공배수, 최대공약수 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase = Integer.parseInt(br.readLine()); // Testcase 입력
		int a, b;// 최대공배수 최대공약수 구해줄 a b
		for (int i = 0; i<Testcase; i++){
			String ab = br.readLine();//a b를 Line으로 받아줘야함(한줄로)
			String a_b[];
			a_b = (ab.split(" "));
			a = Integer.parseInt(a_b[0]);
			b = Integer.parseInt(a_b[1]);		
			//여기까지 a b를 받아줌
			System.out.print(baesu(a, b)+" "); // baesu 메쏘드에 ab 입력하고 배수가 먼저 나옴
			System.out.println(yaksu(a, b)); // yaksu 메쏘드에 ab넣고 약수 나옴
		} // Testcase 실행
	}
	
	public static int yaksu(int a, int b) { // a와 b를 인자로 받음
		
		while(b != 0) { // 유클리드 호제법 || b가 0이 아니면 계속 반복
			int r = a%b; // 임시함수 r에 a를 b로 나눈 값의 나머지를 넣어줌 
			a = b; // a에 b를 넣어줌
			b = r; // b에는 나머지값을 다시 넣어줌
		}
		return a;
	}
	
	public static int baesu(int a, int b) {
		return a * b / yaksu(a, b);
	} 
	// baesu 종료
	
}

