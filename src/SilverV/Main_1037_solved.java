package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1037_solved {

	public static void main(String[] args) throws Exception { // 05.24
		//��� A�� N�� ��¥ ����� �Ƿ���
		//N�� A�� ����̰�, A�� 1�� N�� �ƴϾ�� �Ѵ�
		//� �� N�� ��¥ ����� ��� �־��� ��, N�� �������� ���ϱ�
	
		//ù° �ٿ� N�� ��¥ ����� ������ �־�����, ��°�ٿ��� N�� ��¥ ����� �־�����.
		//1,000,000>= N >=2 �� �ڿ����̰� �ߺ����� �ʴ´�.
			
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