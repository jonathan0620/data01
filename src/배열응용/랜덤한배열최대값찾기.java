package 배열응용;

import java.util.Arrays;
import java.util.Random;

import 배열기본.Print;

public class 랜덤한배열최대값찾기 {

	// 랜덤한 값 1000개 발생 후 배열에 넣고
	//1. 최소값 구하고 순서도 수정
	//2. 최대값 구하기
	//3. 최대값의 갯수는?
	public static void main(String[] args) {
		int[] s = new int[1000]; 
		Random r = new Random(100); //seed, 씨앗값!
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(999) + 1; //0~998--> 1~999
		}
		System.out.println(Arrays.toString(s));
		//정렬후 최소/최대 
		Arrays.sort(s); //오름차순 정렬, 파괴함수
		//<---> 비파괴함수, String num = "100"; Integer.parseInt(num); 
		System.out.println(Arrays.toString(s)); //출력해서 확인!
		System.out.println("최소값>> "+ s[0]);
		System.out.println("최대값>> "+ s[s.length - 1]);
	}
}
