
public class Printf메서드 {

	public static void main(String[] args) {
		// 모니터에 출력하는 표준출력 방법
		/*
		 *  1. System.out.println(값)
		 *    ==> 새로운 라인을 생성하고 출력한다.
		 *  2. System.out.print(값)
		 *    ==> 새로운 라인을 생성하지 않고 출력한다.
		 *       따라서 한 줄에 출력된다.
		 *  3. System.out.printf("표현식", 값1,값2,값3... )
		 *  
		 *    값이 문자열: %s
		 *    값이 문자: %c
		 *    값이 정수: %d
		 *    값이 실수: %f
		 *    값이 불린: %b
		 *    ==> 출력할 때 특정 포맷을 만들기 위해서 사용된다.
		 *       그리고 print처럼 한줄로 출력된다.
		 */
		String name ="홍길동";
		int age = 20;
		float height = 176.564678F;		

		//출력하고자 하는 포맷은 다음과 같다.
		/*
		 *   이름: 홍길동, 나이:20, 키: 176.56
		 * 
		 */
		System.out.println("이름:"+name+", 나이:"+age+", 키:"+ height);
		System.out.print("이름:"+name+", 나이:"+age+", 키:"+ height);
		System.out.println();
		System.out.printf("이름:%s,나이:%d,키:%.2f", name, age, height);
		System.out.println();
		System.out.printf("이름:%20s,나이:%10d,키:%.2f", name, age, height);

	}

}
