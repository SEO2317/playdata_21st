2일차

1. 정수형: 2진수, 8진수, 10진수, 16진수로 사용된다., 
// 정수형의 값의 범위
		// 기본형에 해당되는 클래스 제공한다.
		// 예> byte 기본형에 해당되는 Byte 클래스가 제공된다.
		/*
		    기본형				wrapper클래스
		  byte			    Byte
		  short	            Short
		  int 				Integer
		  long				Long
		  
		  float			    Float
		  double            Double
		  
		  char				Character
		  
		  boolean	        Boolean
		  
		 */
     
     
 2.실수형:  (float:4byte, double:8byte)이며
 
 float 실수형 표현할때 에는 수치뒤에 소문자 f 또는 대문자 F을 붙인다.
 
 
 실수형의 범위는
float최소값:1.4E-45이며
float최대값:3.4028235E38이다

double최소값:4.9E-324이며
double최대값:1.7976931348623157E308이다


3.논리형 boolean(true,false)

public class PDT_boolean {

	public static void main(String[] args) {
		// 참/거짓 ==> 논리데이터
		
		System.out.println(true);
		System.out.println(false);
		
		
	}

}

//결과 true(참),false(거짓)으로 출력된다.


4.변수

변수를 저장할때 쓰이는 데이터 타입

/*
		 *   "홍길동" ==> 문자열, String
		 *   20     ==> 정수, byte,short,int,long
		 *   "서울"  ==> 문자열, String
		 *   175.4  ==> 실수, float, double
		 *   76.32  ==> 실수, float, double
		 *   true   ==> 논리, boolean
		 * 
 */
 변수 선언
 데이터타입 변수명;
 
 변수명은 모두 소문자, 의미있는 명사형 사용한다.
 
 변수 초기화
 변수명 = 값
 
 변수에 맨 처음 값을 저장하는 작업의미이다.
 
 변수를 변경할때 주의사항
 
 /*
  초기화 및 값 변경할 때는 데이터타입이 일치되어야 한다.
 */
 
     
     
     
