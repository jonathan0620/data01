package 배열응용;

import 배열기본.Print;

public class 배열최소값찾기 {

	public static void main(String[] args) {
		int[] n = {90, 80, 20, 60, 70};
		//최소값/최대값을 찾을 때는 인덱스를 하나씩 옮기면서
		//거기까지의 최소/최대값을 넣어둘 수 있는 변수를 따로 만들어주기
		//최소/최대보다 작거나 크면 최소/최대값 넣어주는 변수가 변경
		
		int min = n[0]; //첫번째 값 넣기
		for (int x : n) {
			if(x < min) {
				min = x;
			}
		}
		System.out.println(min);
		Print.arr(n);
	}

}
