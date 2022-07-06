
public class 문장2_제어문2_반복문1_for문 {

	public static void main(String[] args) {
		// 반복문
		/*
		 *  1. for문
		 *  
		 *   문법:
		 *     for(초기값 ; 조건식; 증감식 ){
		 *     
		 *     
		 *     }
		 *     
		 *     예> hello 문자열을 5번 출력하자.
		 *     
		 *       int n=1; //변수 초기화
		 *              "Hello" 출력
		 *       n++
		 *       n <= 5
		 *       
		 *       for(int n=1 ; n <= 5 ; n++ ){
		 *         System.out.println( "Hello" );
		 *       }
		 *       
		 *  2. while문
		 *  
		 *  3. do~ while문
		 * 
		 */
		
		 // 1. 초기값 1부터 시작
		 for(int n=1 ; n <= 5 ; n++ ){
			 System.out.println( "Hello" );
		  }
		
		 for(int n=0 ; n < 5 ; n++ ){
			 System.out.println( "world" );
		 }
		 
		 for(int n=5 ; n > 0 ; n-- ){
			 System.out.println( "Happy" );
		 }
		 
		 for(int n=1 ; n < 10 ; n+=2 ){
			 System.out.println( "BBBB" );
		 }
		 
		 for(int n=1,m=1 ; n < 10 && m <2 ; n+=2,m++ ){
			 System.out.println( "CCCC" );
		 }
		 //중첩 가능
		 /* 
		  *   ==> 모든 제어문은 중첩 가능
		  *   
		  *  1. 조건문 중첩	
		  *  
		  *     if( ){
		  *     
		  *       if(){
		  *       
		  *       }
		  *       
		  *       for(){
		  *       
		  *       }
		  *     }
		  * 
		  *  2. 반복문 중첩
		  *   for( ){
		  *     for(){
		  *        if(){
		  *        
		  *        }
		  *     }
		  *   }
		  * 
		  * 
		  */
		  int x = 0; //누적용
		 for(int n=1 ; n <= 5 ; n++ ){
			 int num = 0; //반복할때마다 매번 생성
			 num++;
			 x++;
			 System.out.println( n + "Hello" + num +"\t" + x);
		  }

	}

}
