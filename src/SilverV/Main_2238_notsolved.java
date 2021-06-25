package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main_2238_notsolved {

	public static void main(String[] args) throws Exception{
		//���� ���� ������ ���� �簡�� ���
		//���� ������ �� �̻��� ��쿡�� ��ȿ��
		//1. ���� ���� ���� ����� ������ ������ ã�´�. || ���� ������ ������ ����� �� �̻��� ��� ��ȿ
		//���� ���� �������� ������ �Ǵ�, �׸��� ���� ���� ������ ����� ������ �� �� �ִ�.
		int min = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int U = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String[] jesi = new String [N];
		int[] n_number = new int[N];
		String[] n_name = new String[N];
		
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		/* map���� Ǯ�� �; ������� ��
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
			
		}
		*/
		
		jesi[0] = br.readLine();
		n_number[0] = Integer.parseInt(jesi[0].split(" ")[1]);
		n_name[0] = jesi[0].split(" ")[0];
		
		for(int i=1; i<N-1; i++) {
			jesi[i] = br.readLine();
			System.out.println(jesi[i]);
			
				for(int j=0; j<N; j++) {
				if(n_name[i] == n_name[j-1]) {
					
					
					n_number[i] = Integer.parseInt(jesi[i].split(" ")[1]);
					
				}
			}
		}// �Է¹ޱ� ��
		
		
		
		
		
		
	}
}
