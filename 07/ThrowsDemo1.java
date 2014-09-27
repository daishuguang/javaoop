class Math {
	public int div(int i, int j) throws Exception {		// 方法可以不处理异常
		System.out.println("********计算开始********");
		int temp = 0;
		try {
			temp = i / j;
		} 
		catch (Exception e) {
			throw e;
		} 
		finally {
			System.out.println("*********** END ********");
		}
		return temp;
	}
}

public class ThrowsDemo1 {
	// 本方法中的所有异常都可以不适用try...catch处理的
	// 主方法向上抛异常，只能将异常抛给JVM进行处理
	public static void main(String args[]) throws Exception {
		Math m = new Math();			// 实例化Math对象
		/*
		try {
			System.out.println("除法操作: " + m.div(10, 2));
		}catch(Exception e) {
			e.printStackTrace();		// 打印异常
		}
		*/
		
		
		//System.out.println("除法操作: " + m.div(10, 2));
		
		// try {
			// throw new Exception("自己抛出的异常!");	// 抛出异常的实例化对象
		// }catch(Exception e) {						// 捕获异常
			// System.out.println(e);
		// }
		
		try {
			System.out.println("除法操作: " + m.div(10,0));
		}
		catch (Exception e) {							// 进行异常捕获
			System.out.println("异常产生: " + e);
		}
	}
}
