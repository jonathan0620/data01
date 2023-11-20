package 배열응용;

public class 영어만추출후대문자변경 {

	public static void main(String[] args) {

		String s1 = "나는 진짜 java programmer가 되었어";
		
		String result = s1.substring(6, 21);
		System.out.println(result);
		System.out.println(result.toUpperCase());
	}

}
