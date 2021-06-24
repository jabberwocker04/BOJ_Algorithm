package Not_Solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1173_Time_over {

	public static void main(String[] args) throws IOException {

		// 운동 or 휴식
		// 운동 -> 맥박이 T만큼 증가, 맥박이 X였다면 1분후 X+T
		// 맥박은 M을 넘기면 안됨 -> X+T <= M이어야 함
		
		// 휴식 -> 맥박이 R만큼 감소, 맥박이 X였다면 1분후 X-R
		// 맥박은 m보다 낮아지면 안됨 -> X-R >= m이어야 함.
		
		//영식이 초기맥박은 m이고 운동을 N분 하려고 함.
		//이 때 운동을 N분하는데 필요한 시간의 최솟값을 구해보자.
		//N, m, M, T, R을 입력해주기.
		
		//N은 휴식(X-R)과 운동(X+T)로 이루어져 있음.
		int N, m, M, T, R;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(st.nextToken()); //운동 하고픈 시간
		m = Integer.parseInt(st.nextToken()); // 최소맥박 & 초기맥박
		M = Integer.parseInt(st.nextToken()); // 최대맥박
		T = Integer.parseInt(st.nextToken()); // 증가맥박
		R = Integer.parseInt(st.nextToken()); // 감소맥박
		int count = 0;
		int RealM = m; // 현재맥박
		int time=0;
		while(count<N) {
			// 운동
			if (M >= T+RealM) {
				RealM = RealM+T;
				time=time+1;
				count++;
			}
			// 휴식
			else {
				if(m > RealM-R) { // 최대맥박 이상일때 휴식
				RealM = m;
				time = time+1;
			} else {
				RealM = RealM - R;
				time++;
				}
			}
		}
		
			if(RealM + T > M && RealM == m) { // 현재맥박+운동 >> 최대맥박이고 현재맥박이 최저맥박이라면
				System.out.println("-1");
				//System.exit(0);
				return; 
				}
			System.out.println(time);
			}
		}

