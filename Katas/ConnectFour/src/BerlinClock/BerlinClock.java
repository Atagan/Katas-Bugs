package BerlinClock;

import java.util.Scanner;

public class BerlinClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int hours, minutes, seconds;
		String answer;
		
		System.out.println("Welcome to the Berliner Clock");
		System.out.println("Insert the time you want to convert");
		
		do {
				do{ 
					System.out.print("Hours: ");
					hours = sc.nextInt();
				} while(hours>23||hours<0);
				
				do {
					System.out.print("Minutes: ");
					minutes = sc.nextInt();
				} while(minutes<0||minutes>59);
				
				do {
					System.out.print("Seconds:");
					seconds =sc.nextInt();
				} while(seconds<0||seconds>59);
				
				
				System.out.print("Is this the correct time? Y or N ");
				System.out.println(hours + ":" + minutes + ":" + seconds);
				answer=sc.next();
				if(answer.toUpperCase().equals("Y")) {
					System.out.println(berlinClock(hours, minutes, seconds));
				}
			
		} while(answer.equals("N"));
		
	}
	public static char[] singleMinutes(int min) {
		int resto = min%5;
		char singleMinutes[] = new char [4];
		for (int i = 0; i < singleMinutes.length; i++) {
			if(i<=resto-1) {
				singleMinutes[i]='Y';
			}else {
				singleMinutes[i]='O';
			}
		}
		return singleMinutes;

	}
	
	public static char[] fiveMinutes(int min) {
		int cociente = min/5;
		char fiveMinutes[] = new char [11];
		for (int i = 0; i < fiveMinutes.length; i++) {
			if(i<=cociente-1) {
				if(i==2||i==5||i==8) {
					fiveMinutes[i]='R';
				}else {					
					fiveMinutes[i]='Y';
				}
			}else {
				fiveMinutes[i]='O';
			}
		}
		return fiveMinutes;
		
	}
	
	public static char[] singleHours(int hours) {
		
		int resto = hours%5;
		char singleHours[] = new char [4];
		for (int i = 0; i < singleHours.length; i++) {
			if(i<=resto-1) {
				singleHours[i]='R';
			}else {
				singleHours[i]='O';
			}
		}
		return singleHours;
	}
	
	public static char[] fiveHours(int hours) {
		
		int cociente = hours/5;
		char fiveHours[] = new char [4];
		for (int i = 0; i < fiveHours.length; i++) {
			if(i<=cociente-1) {			
					fiveHours[i]='R';
			}else {
				fiveHours[i]='O';
			}
		}
		return fiveHours;
	}
	
	public static char[] secondsLamp(int seconds) {
		int resto = seconds%2;
		char secondsLamp[] = new char [1];
			if(resto==0) {
				secondsLamp[0]='Y';
			}else {
				secondsLamp[0]='O';
			}
		return secondsLamp;
	}
	
	
	  public static String berlinClock(int hours, int minutes, int seconds) { 
		 return String.valueOf(secondsLamp(seconds))+
				 String.valueOf(fiveHours(hours))+
				 String.valueOf(singleHours(hours))+
				 String.valueOf(fiveMinutes(minutes))+
				 String.valueOf(singleMinutes(minutes))
				 ;  
	  }
	 

}
