package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1246_solved {

	public static void main(String[] args) throws Exception{
		//N���� �ް��� M���� �����
		//i��° ������ ���� �ް� �ϳ��� p(i)���� ���Ϸ� �� �� ����
		//�� ������ �ΰ� �̻��� �ް��� ���� ����
		//A���ݿ� �ް��� �Ǵٸ� p(i)�� A���ݺ��� ũ�ų� ���� ��� ���� �ް��� ���
		
		//ù°�ٿ� ���� N�� M�� �Էµȴ�(�ް��� �����)
		//��°�ٺ��� M+1��° �ٱ��� i+1��° �ٿ��� P(i)�� �Էµȴ�.
		//ù°�ٿ� �淡�� å���� ���ݰ� �� �������� �ø� �� �ִ� ������ ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 StringTokenizer st = new StringTokenizer(br.readLine());

		 int N = Integer.parseInt(st.nextToken());
		 int M = Integer.parseInt(st.nextToken());
		 int price[] = new int [M];
		 for(int i=0; i<M; i++) {
			 price[i] = Integer.parseInt(br.readLine());
		 }
		 Arrays.sort(price);
		 //������� ��ǲ
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
