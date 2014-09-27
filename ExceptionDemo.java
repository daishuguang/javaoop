public class ExceptionDemo {
	public static void main(String args[]) {
		System.out.println("********** BEGIN *************");
		int i = 10;
		int j = 0;
		try {
		int temp = i / j;
		System.out.println("result: " + temp);
		System.out.println("**************************");
		} catch(ArithmeticException e) {
			System.out.println("Exception occurs at Info: " + e);
		}
		System.out.println("*********** END ***************");
	}
}