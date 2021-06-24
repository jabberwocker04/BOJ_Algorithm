 package Not_Solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main_1159_will_solve {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		//int a = br.read();
		int a = sc.nextInt(); // 받아야하는 이름의 수
		int count = 0; // 5글자 이상인지 확인용 count
		String b = null; // 이름을 받을 변수
		String b_1; // 배열이아니고 스트링으로 받아보기
		String[] a_1 = new String[a]; // 이름의 수만큼 배열생성
		String[] c_1 = null;
		for(int i=0; i<a; i++) {
			b = br.readLine(); // 이름을 우선적으로 받음
			a_1[i] = b.substring(0,1); // 이름을 해체하여 첫번째 글자를 String a_1[]에 삽입

			System.out.print(a_1[i]);
		}
		Arrays.sort(a_1); // 첫글자 배열로 받아준 후 내림차순 배열정리
		b_1 = Arrays.toString(a_1);
		
		for(int i=0; i<a_1.length; i++) {
			for(int j=0; j<a_1.length; j++) {
				if(a_1[i].equals(a_1[j])) {
					count++;
				}
				if(count==5) {
					c_1[i]=a_1[i];
					a_1[i]=null;
					count=0;
				}
			}
		}
		Arrays.sort(c_1);
		System.out.println(c_1);
	}
}