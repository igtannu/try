
interface TestInterface {
	public void square(int n);
	static void showstatic() {
		System.out.println("hi static");
	}

//	default void show() {
//		System.out.println("hi deafult");
//		
//	}
}

public class tru implements TestInterface{
	
	
	public static void main(String[] args) {
	tru t=new tru();
	t.square(7);

	}

	@Override
	public void square(int n) {
		System.out.println(n*n);
		
	}
	

}
