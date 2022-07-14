
public class 연산자6_삼항연산자 {

	public static void main(String[] args) {
	
		// 3항연산자 ==> 중첩 가능
		/*
		 *  문법:
		 *      변수 = (조건식)?참값:거짓값;
		 *      변수 = (조건식)?참값:3항연산자 ;
		 * 
		 *   조건식: 비교연산자, 논리연산자
		 */

		int n = 3;
		//실습1: n값이 10보다 크면 100반환하고 작으면 200 반환해서 변수에 저장.
		int result = (n>10)?100:200;
		System.out.println(result);
		//실습2: age값이 70보다 크면 '노년' 반환하고 50보다 크면 '장년' 아니면 '청년' 반환해서 변수에 저장.
		int age = 80;
		String result2 = (age>70)?"노년":((age>50)?"장년":"청년");
		System.out.println(result2);
		
		
		
	}
}
