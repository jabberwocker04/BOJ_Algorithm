package SilverV;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1010_2 {

	public static void main(String[] args) throws Exception { // 05.24
		//���� N =< ���� M
		//���ʰ� ������ �������� �ϸ� �ִ� �Ѱ� �ٸ��� ����
		//�ٸ��� �ִ��� ���� ������ �ϱ� ������ �ּ� N���� �ٸ� ����
		//�ٸ��� ���� �� �ִ� ����� ���� ���ϱ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Test = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0; i<Test; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int bridge_a = Integer.parseInt(st.nextToken())+1;
			int bridge_b = Integer.parseInt(st.nextToken())+1;
			int[][] asdf = new int[bridge_a][bridge_b];
			
			for(int k=0; k<bridge_b; k++) {
				asdf[0][k] = k;
				}
	
			
			for(int j=1; j<bridge_a; j++) {
				for(int k=1; k<bridge_b; k++) {
					asdf[j][k] = asdf[j][k-1] + asdf[j-1][k-1];
					}
				}
			
			
			int result = asdf[bridge_a][bridge_b];
			
			for(int j=0; j<bridge_a; j++) {
				for(int k=0; k<bridge_b; k++) {
					System.out.print(asdf[j][k]);		
				}
				System.out.println("");
			}
		}
	}
}
