package 배열응용;

public class 남자여자구분 {

	public static void main(String[] args) {
		String s1 = "2056521";
		
		char result = s1.charAt(0);
		if(result == '1') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}

}
