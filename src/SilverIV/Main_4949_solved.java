package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main_4949_solved {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) { // 소괄호와 대괄호만 판단한다.
			String a = br.readLine();
			if(a.equals(".")){ // 종료 입력
				System.exit(0);
			}
			// https://com-on-bappool.tistory.com/50
			List<Integer> asdf = new ArrayList<>();
			int big = 0; // 대괄호
			int small = 0; // 소괄호 
			boolean balance = true; // 균형판단
			
			for(int i = 0; i<a.length(); i++) {
				char c = a.charAt(i);
				if(c == '[') { // 시작하는 대괄호
					asdf.add(1); // 첫번째 위치에 추가
					big++;
				} else if(c == '(') { // 시작하는 소괄호
					asdf.add(2); // 두번째 위치에 추가
					small++;
				}
				else if(c == ']') { // 닫히는 대괄호 파악
					if(big == 0 || asdf.get(asdf.size()-1) != 1) { //지금까지 나온 [가 없거나 혹은 리스트의 사이즈가
						balance = false; // 밸런스 파괴됌
						break; // 멈춤 
					}
					asdf.remove(asdf.size()-1); // if문 조건 미달성시 asdf에서 하나 줄임
					big--;
				}
				else if(c == ')') { // 닫히는 소괄호 파악 및 위와 같음
					if(small == 0 || asdf.get(asdf.size()-1) != 2) {
						balance = false;
						break;
					}
					asdf.remove(asdf.size()-1); // if문 조건 미달성시 asdf에서 하나 줄임
					small--;
				}
			}
			if(big > 0 || small > 0) balance = false;
			if(balance=true) {
				System.out.println("yes"); // 균형이 true이면
			}
			else System.out.println("no");
		}
	}
}
