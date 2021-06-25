package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1764_solved {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[] NM = a.split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		String[] N_arrays = new String[N]; //�躸
		String[] M_arrays = new String[M]; //����
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			N_arrays[i] = br.readLine();
		}
		
		for(int i=0; i<M; i++) {
			M_arrays[i] = br.readLine();
		}
		//input 
		int count = 0;
		
		if(N<M) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(N_arrays[i].equals(M_arrays[j])) {
						count ++;
						sb.append(N_arrays[i]);
						sb.append(" ");
					}
				}
			}
		} //if(N<M)
		
		if(N>M) {
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(M_arrays[i].equals(N_arrays[j])) {
						count ++;
						sb.append(M_arrays[i]);
						sb.append(" ");
						}
					}
				}
			} //if(N>M)
		
		String temp = sb.toString();
		String[] NM_arrays = new String[count];
		NM_arrays = temp.split(" ");
		Arrays.sort(NM_arrays);
		System.out.println(count);
		for(int i=0; i<count; i++) {
			System.out.println(NM_arrays[i]);
		}
		
		}// ����
}
