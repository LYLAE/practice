
public class practice_210805_1 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
				
		//if(조건식)
		if(num1 < num2)
		{
			System.out.println("num1는 num2보다 작다.");			
		}
		
		
		//if(조건식) else
		if(num1 > num2)
		{
			System.out.println("num1는 num2보다 작다.");			
		}
		else
		{
			System.out.println("num1은 num2보다 크지 않다.");
		}
		
		
		
		//if(조건식) else if
		if(num1 > num2)
		{
			System.out.println("num1는 num2보다 크다.");			
		}
		else if(num1 < num2)
		{
			System.out.println("num1은 num2보다 작다.");
		}
		else if(num1 == num2)
		{
			System.out.println("num1은 num2와 같다.");
		}
		else
		{
			System.out.println("num1은 num2와 크지도 작지도 같지도 않다.");
		}
		
	
		
		
		
	}
}

