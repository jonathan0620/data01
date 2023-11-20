package 배열응용;

import java.util.Random;

import 배열기본.Print;

public class 랜덤한배열최대값찾기 {

	// 랜덤한 값 1000개 발생 후 배열에 넣고
	//1. 최소값 구하고 순서도 수정
	//2. 최대값 구하기
	//3. 최대값의 갯수는?
	public static void main(String[] args) {
		int r = numbers[0];
		r.setSeed(100);
		int[] numbers = new int[1000];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000);
		}
		
		Print.arr(numbers);
		
		int max = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (max < 1000) {
				max;
			}
		}
		
		System.out.println(max);
}
