package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main_1764_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] NM_arrays = new String[N+M]; //듣보+못보
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			NM_arrays[i] = br.readLine();
		}
		for(int i=N; i<M+N; i++) {
			NM_arrays[i] = br.readLine();
		}
		Arrays.sort(NM_arrays);
		//input 
		
		for(int i=0; i<N+M-1; i++) {
			if(NM_arrays[i].equals(NM_arrays[i+1])) {
				list.add(NM_arrays[i]);
			}
		}
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		br.close();
		}// 종료
}