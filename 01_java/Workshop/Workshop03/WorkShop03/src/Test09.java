import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		System.out.println("세 정수를 최댓값을 구하세요");
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a>=b)&&(a>=c)){
			max = a;
		}else if((b>=a)&&(b>=c)) {
				max = b;
		}
		else {
		max = c;
		}
		
		
		System.out.printf("a: %2s\n값",a);
		System.out.printf("b: %2s\n값",b);
		System.out.printf("c: %2s\n값",c);
		System.out.printf("max의 최댓값",max);
		
	}	
}
