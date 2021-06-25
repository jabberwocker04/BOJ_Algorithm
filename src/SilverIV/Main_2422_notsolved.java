package SilverIV;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//���̽�ũ�� ó������

public class Main_2422_notsolved { // ���� ��ǰ
	
static int Combination_zumsu;

	public static void main(String[] args) throws Exception {
		//���̽�ũ�� ���Կ� N������ ���̽�ũ��(1������ N�������� ��ȣ�� ����)
		//� ������ ���̽�ũ���� �Բ� ������ ������
		//�̷��� ��츦 ���ϸ鼭 3������ �����Ϸ��� �Ѵ�.
		
		//N�� M�� �־�����. N�� ���̽�ũ�� ������ ���̰�, M�� ������ �ȵǴ� ������ �����̴�. �Ʒ� M���� �ٿ��� ������ �ȵǴ� ������ ��ȣ�� �־�����.
		//���� ������ �ι� �̻� ������ �ʴ´�. ������ ����� �� ��ΰ�?
		//5 3 -> 5���� ���̽�ũ���� 3���� ��������� �ȵǴ� �����̴�. 1,2->1���� 2���� ���̸� �ȵ� || 3,4 -> 3,4�� ���̸� �ȵ� || 1,3 -> 1,3�� ���̸� �ȵ�
		//->145,235,245 �̷��� �������� ������.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean icecream[][] = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			icecream[i][i] = true;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken())-1;
			int end = Integer.parseInt(st.nextToken())-1;
			icecream [start][end] = true;
			icecream [end][start] = true;
		}

		int answer = 0;
		for(int i=0; i<N; i++) {
			for(int j=1; j<N; j++) {
				if(!icecream[i][j]) { // icecerea[i][j]�϶�
					
					for(int k=j; k<N; k++) { // k=j���� �����ؼ� N���� �ݺ��Ѵ�
						if(!icecream[j][k] && !icecream[i][k]) { // [j][k] && [i][k] �Ѵ� false �̸� answer ++;
							answer++;
							//System.out.println((i+1) +" "+(j+1) +" "+(k+1));
						}
					}
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				
				System.out.print(icecream[i][j]+" ");
			}
			System.out.println("");
			}
			
		System.out.println(answer-(N-1));	
	}
}