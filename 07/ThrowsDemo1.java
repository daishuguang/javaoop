class Math {
	public int div(int i, int j) throws Exception {		// �������Բ������쳣
		System.out.println("********���㿪ʼ********");
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
	// �������е������쳣�����Բ�����try...catch�����
	// �������������쳣��ֻ�ܽ��쳣�׸�JVM���д���
	public static void main(String args[]) throws Exception {
		Math m = new Math();			// ʵ����Math����
		/*
		try {
			System.out.println("��������: " + m.div(10, 2));
		}catch(Exception e) {
			e.printStackTrace();		// ��ӡ�쳣
		}
		*/
		
		
		//System.out.println("��������: " + m.div(10, 2));
		
		// try {
			// throw new Exception("�Լ��׳����쳣!");	// �׳��쳣��ʵ��������
		// }catch(Exception e) {						// �����쳣
			// System.out.println(e);
		// }
		
		try {
			System.out.println("��������: " + m.div(10,0));
		}
		catch (Exception e) {							// �����쳣����
			System.out.println("�쳣����: " + e);
		}
	}
}
