package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_9237_solved {

	static Integer[] Tree;
	public static void main(String[] args) throws Exception {
		//��� ����̴� ���翡 �ɱ� ���� ���� ���� n���� �����ߴ�.
		
		//ù° �ٿ��� ������ �� N (1 �� N �� 100,000)�� �־�����. 
		//��° �ٿ��� �� ������ �� �ڶ�µ� ��ĥ�� �ɸ������� ��Ÿ�� ti�� �־�����. 
		//(1 �� ti �� 1,000,000)
		//��糪���� ������ �ڶ�� ������ ������ �ڶ� ������ �����ʴ�
		
		//ù° �ٿ� ��ĥ�� ������� �ʴ��� �� �ִ��� ����Ѵ�. 
		//���� ���� ������ ��쿡�� ���� ���� ���� ����Ѵ�. 
		//������ ������ ���� 1���̴�.
		
		//ex)4 2343 -> 4���� ������ ����, ���� ���� ���� ���
		//�������� 2�� 3�� 4�� 3�� �ɸ�. -> 7�ϸ��� �����ʴ�(���� ���� ��)
		//ex2)6 39 38 9 35 39 20 -> 42
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		Tree = new Integer[a];
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<Tree.length; i++) {
			Tree[i] = Integer.parseInt(st.nextToken());	
		}//Input
		Arrays.sort(Tree, Collections.reverseOrder());
		
		for(int i=0; i<a; i++) {
			Tree[i]=Tree[i]+i+1;			
			if(max<Tree[i]) {
				max = Tree[i];
			}		
		}
		
		//System.out.println(count);
		//System.out.println(Arrays.toString(Tree));
		System.out.println(max+1);
	}
}
