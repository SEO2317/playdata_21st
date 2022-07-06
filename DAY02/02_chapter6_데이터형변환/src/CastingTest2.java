
public class CastingTest2 {

	public static void main(String[] args) {
		
		//3. int보다 작은 타입의 연산결과는 int로 반환된다.
		short s = 10;
		short s2 = 5;
//		short s3 = s + s2;
		
		//해결1
		int ss = s + s2;
		
		//해결2
		short ss2 =(short) (s+s2);
//		short ss3 =(short)s+s2;
	   
		//4. 연산할 때 작은타입하고 큰타입이면 결과는 큰 타입이 반환된다.
		int y = 10;
		double y2 = 3.14;
		double result = y + y2;
		
		/*
		 *   기본형 및 참조형도 데이터 형변환이 가능하다.
		 *   즉, 참조형인 클래스도 형변환이 가능하다.
		 *   예> A 클래스 --> B 클래스 타입으로 변환가능하다.
		 *     단, A와 B의 관계가 상속관계여야 된다.
		 *      역으로 변환되는 클래스들간의 관계가 상속관계가 아니면
		 *      형변환이 안된다.
		 */
		
		
		
	}

}
