
public class practice_210802_2 {
	public static void main(String[] args) {
		
		//서식 문자
		System.out.println("오늘의 날씨는 10도 입니다.");
		System.out.printf("오늘의 날씨는 %d도 입니다.\n", 8);
		
		int num1 = 20;
		System.out.println("오늘의 기온은 "+ num1 +"도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", num1);
		
		System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n", 6, 2, 10);
		
		//정수
		int num2 = 30;
		System.out.printf("num2(10진수) : %d\n", num2);
		System.out.printf("num2(8진수) : %o\n", num2);
		System.out.printf("num2(16진수) : %x\n", num2);
		
		//문자
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.", 'a' , 'A');
		
		char c1 = 'a';
		char c2 = 'A';
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", c1 , c2);
		
		//문자열
		System.out.printf("\'%s\'을 대문자로 바꾸면 \'%s\'입니다.\n","java","Java");
		
		//실수
		float f = 1.23f; //뒤에 f를 붙이네
		System.out.printf("f = %f\n",f);
		
		double d = 1.23456d; //뒤에 d를 붙이네
		
		System.out.printf("d = $f\n",d);
	}

}
