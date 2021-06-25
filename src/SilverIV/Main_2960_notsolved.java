package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class Main_2960_notsolved { // 에라토스테네스의 체

   public static void main(String[] args) throws Exception {

      /*
       에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾는 유명한 알고리즘이다.
      이 알고리즘은 다음과 같다.
      2부터 N까지 모든 정수를 적는다.
      아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
      P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
      아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
      N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.
      
      입력
      첫째 줄에 N과 K가 주어진다. (1 ≤ K < N, max(2, K) < N ≤ 1000)
      출력
      첫째 줄에 K번째 지워진 수를 출력한다.        
      */
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken()); // 가장 큰 수 N
      int b = Integer.parseInt(st.nextToken()); // 몇 번째일지 구해줄 수 K
      boolean[] asdf = new boolean[a+1];
      
      int count = 0;
      for(int i =2; i <= a; i++) {
    	  asdf[i] = true;
      }
      
      for(int i=2; i <= a; i++) {
    	  for(int j= 1; j <+ a; j++) {
    		  if(!asdf[j]) {
    			  continue;
    		  } else {
    			  asdf[j] = false;
    			  count ++;
    			  if(count == b) {
    				  System.out.println(j);
    				  System.exit(0);
    			  }
    		  }
    			  
    	  }
      }
      
      
   }
}