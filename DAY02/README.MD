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
문법: 데이터타입 변수명;
 
 변수명은 모두 소문자, 의미있는 명사형 사용한다.
 
 변수 초기화
 문법: 변수명 = 값
 
 변수에 맨 처음 값을 저장하는 작업의미이다.
 
  
초기화 및 값 변경할 때는 데이터타입이 일치되어야 한다.
 
 
 // 변수선언과 초기화를 한꺼번에 하는 경우
 //문법: 데이터타입  변수명 = 값;
 
 변수를 변경할때 주의사항
 1.동일한 이름 사용 불가한다.
 
 2.변수 종류 3가지 중에서 로컬변수는 반드시 사용전에 초기화해야 된다.
 
 3.변수 스코프(scope) => 변수를 사용할 수 있는 범위 의미. 기본적으로 블럭(scope)
		// 자바 언어는 변수가 블럭 scope를 따른다고 말한다.
 
 변수의 종류
 
 1)로컬변수(local variable)
		 *    - 메서드 안에서 선언
		 *    - 저장되는 메모리명: 스택(stack )
		 *    - 변수의 삶(variable lifecycle)은 
		 *      메서드가 호출될 때 생성 ~ 메서드가 끝나면 제거된다.
		 *      (자동으로 호출되는 유일한 메서드가 main 메서드, 역으로 main메서드를
		 *      제외한 메서드는 반드시 호출해야 수행된다.)
		 *    - 주의할 점은 반드시 사용전에 초기화해야 된다.
		 *      
		 *   2)인스턴스변수(instance variable)
		 *    - 메서드 밖에서 선언
		 *    - 저장되는 메모리명: 힙(heap )
		 *    - 변수의 삶(variable lifecycle)은 
		 *      객체(클래스)가 생성될 때 생성 ~ 객체(클래스)가 소멸될 때 제거된다.
		 *     ==> 클래스 생성 문법:   new 클래스명();
		 *    - 초기화하지 않아도 자동으로 초기화된다.
		 *     정수: 0
		 *     실수: 0.0
		 *     논리: false
		 *     문자: /u0000
		 *     
		 *     참조: null
		 *     
		 *   3)클래스변수(class variable, static variable)
		 *    - 메서드 밖에서 선언 + static 키워드 지정
		 *    - 저장되는 메모리명: method area
		 *    - 변수의 삶(variable lifecycle)은 
		 *     프로그램 실행할 때 생성 ~ 프로그램 종료될 때 제거된다.
		 *    - 초기화하지 않아도 자동으로 초기화된다.
		 *     정수: 0
		 *     실수: 0.0
		 *     논리: false
		 *     문자: /u0000
		 *     
		 *     참조: null  
     
     
     
