package java_101_0711;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class LottoTest {
	public static void main(String[] args) {
		TreeSet<Integer> luckyNum = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Put the winning number of the week.");
		System.out.println("ex)13.15.17.22.23.45");
		String input = sc.next();	
		StringTokenizer st = new StringTokenizer(input, ".");
		while(st.hasMoreTokens()) {
			luckyNum.add(Integer.parseInt(st.nextToken()));
		}
			
		Random rand = new Random();
		int cnt = 0;
		
		while(true) {
			TreeSet<Integer> myNumber = new TreeSet<Integer>();
			while(true) {
				myNumber.add(rand.nextInt(50)+1);
				if(myNumber.size()== 6) {
					break;
				}
			}
			if(!myNumber.equals(luckyNum)) {
				cnt++;
			}
			else {
				break;
			}
		}
		
		System.out.println("You should've bought " + cnt + " of lottery tickets to win ");
		System.out.println(luckyNum + " these numbers.");
	}
}
