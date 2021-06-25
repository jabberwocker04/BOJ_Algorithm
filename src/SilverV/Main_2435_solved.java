package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_2435_solved {

	public static void main(String[] args) throws Exception {
		// ���û ���� ������
		//ù° �ٿ� �� ���� ���� N�� K�� �� ���� ������ ���̿� �ΰ� �־�����. N�� �µ��� ������ ��ü ��¥�� ���̴�. 
		//N�� 2�̻�, 100�����̴�. K�� ���� ���ϱ� ���� �������� ��¥�� ���̴�. K�� 1�� N ������ �����̴�. 
		//��° �ٿ��� ���� ������ �µ��� ��Ÿ���� N���� ������ ��ĭ�� ���̿� �ΰ� �־�����. �� ���� ��� -100�̻�, 100�����̴�.
		
		//	ù° �ٿ�, �µ��� �������� �������� K���� �µ��� ���� �ִ밡 �Ǵ� ���� ����Ѵ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N[] = new int[Integer.parseInt(st.nextToken())];
		int K = Integer.parseInt(st.nextToken());
		int M[] = new int[1+N.length-K];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N.length; i++) {
			N[i] = Integer.parseInt(st.nextToken());
		}
		
		int MAX = Integer.MIN_VALUE;
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<K; j++) {
				M[i] = M[i] + N[i+j];
			}
			
			if(MAX<M[i]) {
				MAX = M[i];
			}
		}
		System.out.print(MAX);
	}
}
