package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1524_solved {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Testcase = Integer.parseInt(st.nextToken()); // ��� �������� T
		for(int i=0; i<Testcase; i++) {
			String trash = br.readLine(); // ������ ���Ͱ�
			String soldier[] = br.readLine().split(" ");
			int[] soldier_a = new int[Integer.parseInt(soldier[0])]; // ������ ���� 
			int[] soldier_b = new int[Integer.parseInt(soldier[1])]; // ���� ����
			
			/*
			StringTokenizer st = new StringTokenizer(br.readLine()); // ���� ��ū �Է�
			for(int j=0; j<soldier_a.length; j++) {
				soldier_a[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(soldier_a); // ���� ��ū ����
			
			
			st = new StringTokenizer(br.readLine()); // ���� ��ū �Է�
			for(int j=0; j<soldier_b.length; j++) {
				soldier_b[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(soldier_b); // ���� ��ū ���� 
			*/
			
			String[] as = br.readLine().split(" ");
			for(int j=0; j<soldier_a.length; j++) {
				soldier_a[j] = Integer.parseInt(as[j]);
			}
			Arrays.sort(soldier_a);
			
			String[] bs = br.readLine().split(" ");
			for(int j=0; j<soldier_b.length; j++) {
				soldier_b[j] = Integer.parseInt(bs[j]);
			}
			Arrays.sort(soldier_b);
			
			
			if( soldier_a[soldier_a.length-1] > soldier_b[soldier_b.length-1] ) {
				System.out.println("S");
			} else if ( soldier_a[soldier_a.length-1] < soldier_b[soldier_b.length-1] ) {
				System.out.println("B");		
			} else if ( soldier_a[soldier_a.length-1] == soldier_b[soldier_b.length-1] ) {
				System.out.println("S");
			}
			
			
		} // Testcase ����
	}
}
