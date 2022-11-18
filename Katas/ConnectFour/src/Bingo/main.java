package Bingo;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] card= new int[25];
		
		for (int i = 0; i < 25; i++) {
			int a=(int)(Math.random()*74+1);
			if(checkIfExists(card,i,a)){
				System.out.println("borramos"+a);
				i--;
			}else {
				card[i]=a;
			}
			
			
			card[12]=0;
			
			System.out.println(card[i]);
			
		}
	}
	
	public static boolean checkIfExists(int[] array, int pos, int num) {
		for (int i = 0; i <= pos; i++) {
			if(array[i]==num) {
				return true;
			}
		}
		return false;
	}
}
