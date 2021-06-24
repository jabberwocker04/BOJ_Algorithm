package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1439 {

	public static void main(String[] args) throws Exception {
		//다솜이는 0과 1로만 이루어진 문자열 S를 가진다.
		//S에 있는 모든 숫자를 전부 같게 만들려고 한다.
		//S에서 연속된 하나 이상의 숫자를 잡고 모두 뒤집는 것이다 = 0은 1로, 1은 0으로
		
		//ex)S=0001100 이면 다 뒤집으면 1110011
		//4번째 문자열부터 5번째 문자까지 뒤집으면 1111111 이 되어서 2번만에 모두 같은숫자로 만들 수 있다.
		//하지만 처음부터 4번부터5번까지를 뒤집으면 00000000이 되어서 1번만에 모두 같은숫자로 만들 수 있다.
		//문자열 S가 주어졌을 때 다솜이가 해야하는 최소행동횟수
		//S<1000001
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int count_1 = 0;
		int count_0 = 0;
		String s[] = temp.split("");
		
		if(s[0].equals("0")) {
			count_0 ++;
		} else
			count_1 ++;
		
		for(int i=1; i<s.length; i++) {
			if(s[i].equals(s[i-1])==false) {
				if(s[i].equals("0")) {
					count_0 ++;
				} else
					count_1 ++;
			}	
		}
		
		System.out.println(Math.min(count_1, count_0));
		
	}
}
