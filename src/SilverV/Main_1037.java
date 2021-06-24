package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1037 {

	public static void main(String[] args) throws Exception { // 05.24
		//양수 A가 N의 진짜 약수가 되려면
		//N은 A의 배수이고, A는 1과 N이 아니어야 한다
		//어떤 수 N의 진짜 약수가 모두 주어질 때, N은 무엇인지 구하기
	
		//첫째 줄에 N의 진짜 약수으 개수가 주어지고, 둘째줄에는 N의 진짜 약수가 주어진다.
		//1,000,000>= N >=2 인 자연수이고 중복되지 않는다.
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
	
		System.out.println(a[0]*a[a.length-1]);
		
	 }
}