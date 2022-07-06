import java.util.Scanner;

public class 문장2_제어문1_조건문1_단일if문2_실습 {

	public static void main(String[] args) {
		
		//문제
		// 키보드로 숫자를 입력받아서 짝수이면 출력한다.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean result = (num%2)==0;
//		if(result) {
		if((num%2)==0) {
			System.out.println(num);
		}
	
		System.out.println("END");
	}
}
