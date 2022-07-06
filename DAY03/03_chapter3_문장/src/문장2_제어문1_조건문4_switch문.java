import java.util.Scanner;

public class 문장2_제어문1_조건문4_switch문 {

	public static void main(String[] args) {

		// 조건문(분기문)
		/*
		 *  1) 단일 if문
		 *    ==> 용도: 조건이 참인(true)경우에만 문장을 실행시킬 때 사용
		 *    ==> 문법:
		 *        문장1;
		 *        
		 *        if(조건식){
		 *          문장2;
		 *          문장2-1;
		 *        }
		 *        문장3;
		 *        
		 *     예>
		 *       문장1;
		 *       if(n > 20){
		 *         ...
		 *       }
		 *       문장n;
		 *     ==> {}생략가능하다.
		 *        생략하면 바로 뒤 하나의 문장만 영향을 받는다.
		 *    
		 *    
		 *  2) if~else문
		      => 용도: 조건에 따라서 실행하는 문장이 달라질 때 사용
		 *    ==> 문법:
		 *        문장1;
		 *        
		 *        if(조건식){
		 *          문장2;
		 *        }else{
		 *          문장2-1;
		 *        }
		 *        문장3;
		 *  
		 *  3) 다중 if문
		 *   => 용도: 조건이 여러개인 경우에 사용
		 *    ==> 문법:
		 *    
		 *     문장1;
		 *     
		 *     if(조건식1){
		 *        문장2;
		 *     }else if(조건식2){  // elif (파이썬)
		 *        문장3;
		 *     
		 *     }else if(조건식3){
		 *        문장4;
		 *     
		 *     }else{
		 *        문장5;
		 *     }

		 *    
		 *  4) switch 문
		 *   
		 *  => 용도: 조건이 여러개인 경우에 사용
		 *  ==> 문법:
		 *   switch(변수){
		 *      case 값1: 문장1; break;
		 *      case 값2: 문장2; break;
		 *      case 값3: 문장3; break;
		 *      default:  기본문장;
		 *   }
           ==> default 문 옵션
           ==> break 문 옵션
           ==> 변수와 값의 비교는  내부적으로 == 비교한다.
           
           ==> switch문에서 사용가능한 데이터 타입
              
               byte - O
               short - O
               int - O
               long - x
               
               float - x
               double - x
               char - O
               boolean - x
               
               String - O
               enum 타입 - o
               
              switch문에서 지원되지 않는 데이터타입인 경우에는
                            그냥  다중 if문을 사용하면 된다.
		 */
	
		char num = 10;
		  switch(num) {
			  case 10: System.out.println("10 출력"); break; 
			  case 5: System.out.println("5 출력"); break;
			  case 15: System.out.println("15 출력"); break;
			  default: System.out.println("default"); break;
		  }
		  
		String s = "A";
		switch (s) {
		case "A":
			
			break;

		default:
			break;
		}
	
		

	}

}
