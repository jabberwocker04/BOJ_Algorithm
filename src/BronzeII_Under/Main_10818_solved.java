package BronzeII_Under;

import java.util.Scanner;

public class Main_10818_solved {
	public static void main(String[] args){
		 
		Scanner sc = new Scanner(System.in);
		int small,large,input;
   	 small = 1000000;
   	 large = -1000000;
		int N, C =0;
     N = sc.nextInt();
     int[] array = new int[N];
    
    
     for(int i=0; i<array.length; i++){
    	 
    	 input = sc.nextInt();
    	 array[i] = input;
    	 if(small>array[i]) {
    		 small = array[i];
    	 } 
    	 if(large<array[i]) {
    		 large = array[i];
    	 }
    	 
    	 
     }System.out.print(small +" "+ large);
}
}