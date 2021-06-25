package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_10828_notsolved {
	
	static int stackSize;
	String stack[] ;
	
	public static void main(String[] args) throws Exception { // 스택구현
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Test = Integer.parseInt(br.readLine());

		
		for(int i=0; i<Test; i++) {
			String temp = br.readLine();
			if(temp.equals("pop")) {
				pop(temp);
			} else if(temp.equals("size")) {
				size(temp);
			} else if(temp.equals("empty")) {
				empty(temp);
			} else if(temp.equals("top")) {
				top(temp);
			} else { // push
				String target = "push";
				int target_num = temp.indexOf(target); 
				String result; 
				result = temp.substring(target_num);
				System.out.println(result+" "+target_num);
			}
		}
		
	}
	public void push(String temp) { //push = 정수 X를 스택에 넣는 연산
		int a = Integer.parseInt(temp.substring(4));
		
		
	}
	
	public static String pop(String temp) { //pop = 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어가 있는 정수가 없는 경우 -1을 출력
		
		return temp;
	}
	
	public static String size(String temp) { //size = 스택에 들어있는 정수의 개수를 출력한다.
		
		return temp;
	}
	
	public static String empty(String temp) { // empty = 스택이 비어있으면 1, 아니면 0을 출력한다.
		
		return temp;
	}
	
	public static String top(String temp) { // top = 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어가 있는 정수가 없는 경우 -1을 출력
		
		return temp;
	}
}
