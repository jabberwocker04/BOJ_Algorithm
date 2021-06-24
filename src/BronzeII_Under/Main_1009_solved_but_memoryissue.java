package BronzeII_Under;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
public class Main_1009_solved_but_memoryissue { // 분산처리

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // String으로 받아줌, 더빠름
		// https://www.acmicpc.net/blog/view/56 입력 속도 비교 링크
		Scanner sc = new Scanner(System.in); // 그냥 스캐너씀
		int Test; // 테스트 케이스
		int a, b; // a의 b승
		BigInteger results[]; // a의 b승을 배열로 만들어서 저장함	
		Test = sc.nextInt(); // TestCase 입력
		results = new BigInteger [Test]; // 배열 수 입력
		for(int i=0; i<Test; i++) { // Test 시작
			a = sc.nextInt(); // 정수 입력
			b = sc.nextInt(); // 지수 입력
			
			results[i] = BigInteger.valueOf(a); // 제곱이기때문에 우선 results[i]에 a를 넣어야 한다.
			for(int j=1; j < b; j++) { // a의 b승 시작
			results[i] = results[i].multiply(BigInteger.valueOf(a));
				} // multiply는 곱하는 메쏘드이고 BigInteger.vlaueof를 써주어야 
			//BigInteger로 만든 배열의 인자값을 계산할 수 있다
			}	
		for(int i=0; i<Test; i++) { // 결과출력
			if((results[i].mod(BigInteger.valueOf(10)) != BigInteger.valueOf(0))) {
				System.out.println(results[i].mod(BigInteger.valueOf(10)));
			} else if ((results[i].mod(BigInteger.valueOf(10)) == BigInteger.valueOf(0))) {
				System.out.println("10"); // 나머지가 없으면 10 출력
			}
		}
	}
} // 이클립스에선 실행되지만 백준에서는 실행이 안되었음. BigInteger를 사용하였지만
// 메모리 이슈가 남. 아무래도 이 풀이법이 아닌 것 같음.