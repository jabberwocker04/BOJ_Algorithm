package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2331_notsolved_whatsolve {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int b= Integer.parseInt(st.nextToken()); // N
		int a = Integer.parseInt(st.nextToken()); // P
		
		int ans = 0;
		int cur = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(b);
		flag : while(true) {
			int sum = 0;
			char[] chs=list.get(cur).toString().toCharArray();
			for(int i=0;i<chs.length;i++) {
				sum+=Math.pow(Character.getNumericValue(chs[i]), a);
			}
			for(int j=0;j<list.size();j++) {
				if(sum==list.get(j)) {
					ans=j;
					break flag;
				} 
			}
			list.add(sum);
			cur++;
		}
		
		System.out.println(ans);

	}
}