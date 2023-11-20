package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 입력해서배열에넣기3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너로 숫자 넣기
		double[] numbers = new double[5];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자 입력 >> ");
			numbers[i] = sc.nextDouble();
		}
		sc.close();//통로 닫기
		System.out.println(Arrays.toString(numbers));
		
		
		int count = 0;
		String location = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2의 위치는 " + i);
			}else if(numbers[i] == 33.3) {
				System.out.println("33.3의 위치는 " + i);
				count++;
				location = location + i + " ";
				list.add(i);
			}
		}
		
		System.out.println(count);
		System.out.println("33.3위치는 " + location);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			int index = list.get(i);
			numbers[index] = 333.3;
		}
		System.out.println(Arrays.toString(numbers));
//		 List<double[]> list = Arrays.asList(numbers);
	}
}
