package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2139 { // 나는 너가 살아온 날을 알고 있다
	public static void main(String[] args) throws IOException {
		//윤년은 하루가 많다
		//윤년은 해당하는 연도가 4로 나누어 떨어진다
		//그러나 100으로 나누어 지는 연도는 제외
		//그러나 400으로 나누어 떨어지면 포함
		//2000년은 윤도 1976년도 윤년
		//그러나 1900년은 윤년아님
		//28일,30일,31일로 이루어진 날들이 있음
		//날짜를 카운트 해야함.
		//input - dd-mm-yyyy but 0 0 0 -> exit
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int dd, mm, yyyy; // 일, 월, 연도 객체생성
		String[] dmy = new String[3]; // 년월일 하나로된 문자배열 생성(Split으로 나눠줄 용도)
		
		
		while(true) { // 무한반복 시작
		dmy = br.readLine().split(" "); // 14 8 2004 입력시 [0]==14||[1]==8||[2]==2004
		dd = Integer.parseInt((dmy[0])); // 일
		mm = Integer.parseInt(dmy[1]); // 월
		yyyy = Integer.parseInt(dmy[2]); // 년
		// == 이부분까지 입력받는 파트 == //
		int result = 0;	
		
		if( dd == 0 && mm == 0 && yyyy == 0) {
			System.exit(0);
		} // 입력시 0 0 0 이면 종료
		
		 int m[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	
		//달마다의 날짜를 입력해줌, 1월의 경우 
		 boolean yoon = false; //윤년 판단(기본적으로 윤년 아님)
		 
		 
		 if ((yyyy % 4 == 0 && yyyy % 100 != 0) || yyyy % 400 == 0) { // 윤년임
			yoon = true; // 윤년판단(4로 나누어지면서 100으로 나누어지지는 않음) or 400으로 나누어짐
		 }
		 if (yoon == true) { // 윤년일 때
			m[2] = 29; // 2월을 29일로 만들어줌
		 }
		 
		 for(int i=0; i<mm; i++) {
			 result = result + m[i]; // 지난날짜 모두 더해줌
		 } // 3월1일 일 경우 m[0]+m[1]+m[2] + result
		 //이것이 윤년이면, 0+31+29 = 60
		 
		 // ====위가 더 좋은 버전 || 아래는 memory 조금 커짐 ====//
		 
		 /*
			 if(yoon == true && mm > 2) {
				 result = result + 1;// 2월이상이면 +1해줘야함
			  for(int i=0; i<mm; i++) {
			 result = result + m[i]; // 지난날짜 모두 더해줌
		 }} else for(int j=0; j<mm; j++) {
				 result = result + m[j]; // 지난날짜 모두 더해줌 
			 }
		*/ 
		
		 //윤년의 3월 1일이었기 때문에 0+31+29(m배열) + 1(dd)
		 result = result + dd; // 다로 입력한 dd 더해줘서 총 날짜 계산
		 System.out.println(result); // 총 날짜 계산
		} // 무한 루프 while
	}
}