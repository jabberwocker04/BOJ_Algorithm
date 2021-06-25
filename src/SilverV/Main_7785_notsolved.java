package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_7785_notsolved {

	public static void main(String[] args) throws Exception {
		//n���� ���Ա���� �־�����
		//n���� �ٿ��� ���� ��ϰ� �̸��� �־�����.
		//���������� ����, ��ҹ��ڰ� �ٸ��� �ٸ� ����̴�. 
		//������ �������� ȸ�翡 �ִ� ����� ���.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String,String> set = new HashSet<String,String>();//HashMap����
		int Testcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<Testcase; i++) {
			String[] input = new String[2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[0] = st.nextToken();
			input[1] = st.nextToken();
			map.put(input[0], input[1]);
		}
		
		System.out.println(map.values());
		System.out.println(map.keySet());
		
	}
}
