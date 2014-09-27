class MyException extends Exception {		// 自定义异常类，继承Exception类
	
	public MyException(String msg) {		// 构造方法接收异常信息
		super(msg);							// 调用父类中的构造方法
	}
}

public class DefaultException {

	public static void main(String args[]) {
		try {
			throw new MyException("自定义异常.");	// 抛出异常
		}catch(Exception e) {						// 异常处理
			System.out.println(e);
		}
	}
}