package list.linkedlist.implementation;

import java.util.ArrayList;

public class array {

	public static void main(String[] args) {

		String[] words1 = new String[5];
		
		// 데이터타입이 int로 이루어진 배열의 선언X
		int[] numbers1 = new int[5];
		int[] numbers2 = {10,20,30,40,50};
		int[] numbers3 = new int[] {10,20,30,40,50};
		
		// 값을 선언하지 않았을 경우 '0'이 출력된다.
		System.out.println(numbers1[0]);
		
		// numbers2의 첫번째 Index값 '10'이 출력된다.
		System.out.println(numbers2[0]);
		// numbers2의 두번째 Index값 '20'이 출력된다.
		System.out.println(numbers2[1]);
		
		// numbers3의 네번재 Index값 '40'이 출력된다.
		System.out.println(numbers3[3]);
		
		// .length() 함수 : elements의 갯수
		System.out.println("numbers1의 length : "+numbers1.length);
		
		/* 
		 * length()에 대하여
		 * length함수의 경우, 설정되어진 Elements들이 몇 개인지가 아닌, Size를 알려준다.
		 */
		int[] numbers4 = new int[5]; // number4 변수에 5개 사이즈로 이루어진 int타입의 Array를 선언
		numbers4[0]=10; // 인덱스 0 자리에 10 대입
		numbers4[1]=20; // 인덱스 1 자리에 20 대입
		numbers4[2]=30; // 인덱스 2 자리아 30 대입
		System.out.println(numbers1.length); // 인덱스 0,1,2에만 대입을 했으나 length는 5가 나온다.
		
		int[] numbers5 = new int[10];
		System.out.print("numbers5 length구하기 : ");
		System.out.println(numbers5.length);
		
		// Array 배열 순차적으로 출력하기
		int i=0;
		while(numbers5.length>i){
			System.out.println(numbers5[i]);
			i++;			
		}

	}

}
