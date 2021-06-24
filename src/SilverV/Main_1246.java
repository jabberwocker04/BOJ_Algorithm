package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1246 {

	public static void main(String[] args) throws Exception{
		//N개의 달걀과 M개의 잠재고객
		//i번째 고객마다 각자 달격 하나를 p(i)가격 이하로 살 수 있음
		//한 고객에게 두개 이상의 달걀은 팔지 않음
		//A가격에 달걀을 판다면 p(i)가 A가격보다 크거나 같은 모든 고객은 달걀을 산다
		
		//첫째줄에 정수 N과 M이 입력된다(달걀과 잠재고객)
		//둘째줄부터 M+1번째 줄까지 i+1번째 줄에는 P(i)가 입력된다.
		//첫째줄에 경래가 책정한 가격과 이 가격으로 올릴 수 있는 수익을 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 StringTokenizer st = new StringTokenizer(br.readLine());

		 int N = Integer.parseInt(st.nextToken());
		 int M = Integer.parseInt(st.nextToken());
		 int price[] = new int [M];
		 for(int i=0; i<M; i++) {
			 price[i] = Integer.parseInt(br.readLine());
		 }
		 Arrays.sort(price);
		 //여기까지 인풋
		 int result, max = 0, p = 0;
		 
		 for(int i=0; i<M; i++) {
			 if(M-i < N) {
				 result = price[i] * (M-i);
			 }	 else {
				 result = price[i] * N;
			 }
			 if ( max < result) {
				 p = price[i];
				 max = result;
			 }
		 }
		 System.out.println(p+" "+max);
		 
		 
	}
}
