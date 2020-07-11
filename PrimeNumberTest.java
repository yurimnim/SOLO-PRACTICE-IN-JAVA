package java_101_0709;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimeNumberTest {
	public static void main(String[] args) {
		LinkedList<Integer> prime = new LinkedList<Integer>();
		
		//2~100 숫자 리스트 만들기
		for(int i=2;i<101;i++) {
			prime.add(i);
		}
		
		//2의배수제거 
		for(int i=1;i<prime.size();i++) {
			if(prime.get(i)%2==0) {
				prime.remove(i);
			}
		}
		//3의배수제거 
		for(int i=2;i<prime.size();i++) {
			if(prime.get(i)%3==0) {
				prime.remove(i);
			}
		}
		//5의배수제거 
		for(int i=3;i<prime.size();i++) {
			if(prime.get(i)%5==0) {
				prime.remove(i);
			}
		}
		
		//7의배수제거 
		for(int i=5;i<prime.size();i++) {
			if(prime.get(i)%7==0) {
				prime.remove(i);
			}
		}
		
		
		System.out.println("100 까지 숫자중에 소수찾기 결과 ==> Iterator 사용해서 프린트 ");
		Iterator<Integer> primeComplete= prime.iterator();
			while(primeComplete.hasNext()) {
				System.out.print(primeComplete.next() + " ");
			}
		
	}	
	
 }
