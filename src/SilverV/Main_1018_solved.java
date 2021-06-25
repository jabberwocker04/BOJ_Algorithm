package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018_solved {

	public static void main(String[] args) throws Exception {
		//MN���� ���� ���簢������ �������� �ִ� M*N ũ���� ����
		//������, ������� ĥ���� ���� �� M*N�� �߶� 8*8ũ���� ü���� �����
		//ü����ó�� ������� �����Ƽ� ĥ����
		//(0,0)�� ����� ��� || (0,0)�� �������� ���
		//M*N���� �ִ��� ����� 8*8�� ��� �� 
		//��� ���簢���� �ٽ� ĥ�ؾ߰ڴٰ� ������.
		//�ٽ� ĥ�� ���簢���� �ּ� ������ ���ϴ� ���α׷�
		
		//N,M>=8 || N,M<=8 
		//��°�ٺ��� N���� �ٿ��� ������ �� �� ���°� �־�����.
		//B�� ������ W�� ����̴�
		
		String[][] firstW = {{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"}};
		
		
		String[][] firstB = {{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"}};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int g = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		String Chess[][] = new String [g][s];
		int count[] = new int [g];
		
		
		for(int i=0; i<g; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<s; j++) {
				Chess[i][j] = st.nextToken();
				}
				
			}
		
		
	for(int i=0; i<g; i++) {
		System.out.println("");
		for(int j=0; j<s; j++) {
			System.out.print(Chess[i][j]) ;
			}
		
		}
	
	}
}