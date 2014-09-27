public class RuntimeExceptionDemo01 {
	public static void main(String args[]) {
		String str = "123";					// 定义一个由数字组成的字符串
		int temp = Integer.parseInt(str);	// 将字符串变为int类型
		System.out.println(temp * temp);	// 计算乘方
	}
}