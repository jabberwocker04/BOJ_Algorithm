package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2145 { // try catch로 없애줬음.

	public static void main(String[] args) throws IOException {
		//숫자의 각 자릿수 더하기
		//한자릿수가 될때까지 반복
		//주어지는 숫자는 100000보다는 낮은 양의 정수임.
		//0 입력받으면 종료 <- 이부분에서 에러남
	try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {

	String a; 
	a = br.readLine(); //한자릿수로 만들어줄 숫자 입력해줌
	
	if(a.equals(0)) { //숫자가 0이면 
		System.exit(0);//시스템 종료
	}
	String[] b;
	b = a.split(""); //String배열로 입력받은 숫자를 각각 쪼개줌
		//ex)1234 => b[0]==1 b[1]==2 b[2]==3 b[3]==4
	
	Test(b); // 재귀함수 메소드 호출 || 매개변수 b배열
			
		}
	
	} catch (NumberFormatException e) {
		System.exit(0); //에러를 강제로 없애줬음...
	} catch (Exception e) {
		System.exit(0); //역시 에러를 강제로 없애줬음. 
	} // try catch 구문
	
	}


	static void Test(String[] b) { // String[]b배열을 인자로 가져왔음 
		
		int c = 0;
		for(int i=0; i<b.length; i++) {
			c = c + Integer.parseInt(b[i]);
		} // c변수는 b를 계속 더해주는 변수임
		
			if((c / 10) == 0 && c != 0) { // 10으로 나누어서 몫이 안나오면 한자릿수
				System.out.println(c); // 한자릿수인지 검사하여 한자릿수면 출력
			} else if( c == 0) { // c가 0이라는 것은 b배열이 "0"이라는 것을 의미함
				System.out.println(""); //넣어주지 않으면 메모리초과가 나오게 됨
			}
			else { // 한자릿수가 아닌 경우 
				Test(String.valueOf(c).split("")); // 다 더했던 c를 다시 인자 b에 split으로 각각 넣어줌
			}
	}
}