class MyException extends Exception {		// �Զ����쳣�࣬�̳�Exception��
	
	public MyException(String msg) {		// ���췽�������쳣��Ϣ
		super(msg);							// ���ø����еĹ��췽��
	}
}

public class DefaultException {

	public static void main(String args[]) {
		try {
			throw new MyException("�Զ����쳣.");	// �׳��쳣
		}catch(Exception e) {						// �쳣����
			System.out.println(e);
		}
	}
}