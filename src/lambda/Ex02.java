package lambda;

interface Lambda02{
	public void lam(Object o);
}

public class Ex02 {
	public static void main(String[] args) {
		
		Lambda02 lam01 = (aaa)->{
			System.out.println(aaa+" test");
			System.out.println("여러줄 출력도 가능");
			System.out.println("중괄호로 묶어서");
		};
		
		lam01.lam("하이");
		
		
	}
}
