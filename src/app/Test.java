package app;

public class Test {

	/**
	 * ���������ί�л���: �������һ��һ��ί�е�BootStrap�����������BootStrap�޷����ص�ǰ��Ҫ���ص���ʱ��
	 * Ȼ���һ��һ���˻ص����������ȥ���ظ��� �����˻ص�������������ʱ��������Լ�Ҳ���������ļ��أ���ô���׳�ClassNotFound�쳣��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ClassLoader loader = TestClassLoader.class.getClassLoader();
		// ѭ������������
		while (loader != null) {
			System.out.println(loader.getClass().getName());
			loader = loader.getParent();
		}
	}
}
