package BronzeI;

import java.util.Scanner;

public class Main_1546_solved {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double avg = 0;
        int total = 0;
        int max = 0;
        	
        for(int i=0; i<n; i++){
            int score = sc.nextInt();
            total += score;
              if(score > max ) {
            	  max = score;
              }
        }
        avg = 100.0 * total / max / n;
        System.out.printf("%.2f", avg);
    }
}