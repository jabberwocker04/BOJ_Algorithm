package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_9237 {

	static Integer[] Tree;
	public static void main(String[] args) throws Exception {
		//농부 상근이는 마당에 심기 위한 나무 묘목 n개를 구입했다.
		
		//첫째 줄에는 묘목의 수 N (1 ≤ N ≤ 100,000)이 주어진다. 
		//둘째 줄에는 각 나무가 다 자라는데 며칠이 걸리는지를 나타낸 ti가 주어진다. 
		//(1 ≤ ti ≤ 1,000,000)
		//모든나무가 완전히 자라고 마지막 나무가 자란 다음날 이장초대
		
		//첫째 줄에 며칠에 이장님을 초대할 수 있는지 출력한다. 
		//답이 여러 가지인 경우에는 가장 작은 값을 출력한다. 
		//묘목을 구입한 날이 1일이다.
		
		//ex)4 2343 -> 4개의 나무를 심음, 가장 작은 값을 출력
		//나무마다 2일 3일 4일 3일 걸림. -> 7일만에 이장초대(가장 작은 값)
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
