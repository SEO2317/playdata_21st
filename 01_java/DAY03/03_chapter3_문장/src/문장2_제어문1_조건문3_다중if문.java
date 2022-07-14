import java.util.Scanner;

public class 문장2_제어문1_조건문3_다중if문 {

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
		 *  
		 */
	   /*
	    *  문제:
	    *   
	    *   점수를 입력받아서 학점을 출력하시오
	    *   
	    *   90 ~ 100: A학점
	    *   80 ~ 89: B학점
	    *   70 ~ 79: C학점
	    *   나머지:  F학점
	    * 	
	    */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String grade;
		if(num >= 90 ) {
			grade="A학점";
		}else if(num >= 80 ) {
			grade="B학점";
		}else if(num >= 70 ) {
			grade="C학점";
		}else {
			grade="F학점";	
		}
		System.out.println(grade);
		
//		if(num >= 90 ) {
//			System.out.println("A학점");
//		}else if(num >= 80 ) {
//			System.out.println("B학점");
//		}else if(num >= 70 ) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("F학점");			
//		}
		
//		if(num >= 90 && num <=100) {
//			System.out.println("A학점");
//		}else if(num >= 80 && num <=89) {
//			System.out.println("B학점");
//		}else if(num >= 70 && num <=79) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("F학점");			
//		}
	 	
	   
		
		
		

	}

}
