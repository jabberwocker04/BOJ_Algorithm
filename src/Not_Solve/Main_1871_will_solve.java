package Not_Solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_1871_will_solve {

	public static void main(String[] args) throws IOException {
		// ABC-0123(세글자,네숫자)
		// nice 번호판은 첫부분과 두번째부분의 가치의 차이가 100을 넘지 않음
		//글자로 이루어진 첫번째 부분의 가치는 글자를 26진법 수처럼 계산함.
		//ex) ABC의 가치는 28이다.(0*26^2 + 1*26^1 + 2*26^0)
		//즉 ABC-0123 은 | 28 - 123 | <= 100 이기 때문에 좋은 번호판이다.
		//자동차 번호판이 주어지면 좋은 번호판인지 아닌지 구하는 프로그램 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bunhopan;
		int Test = Integer.parseInt(br.readLine()); // TestCase 입력
		for(int i=0; i<Test; i++) {
			
			
			bunhopan = br.readLine();
			
			System.out.println(Integer.parseInt(bunhopan));
			
		}
		
	}
}
