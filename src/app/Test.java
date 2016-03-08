package app;

public class Test {

	/**
	 * 类加载器的委托机制: 类加载器一级一级委托到BootStrap类加载器，当BootStrap无法加载当前所要加载的类时，
	 * 然后才一级一级退回到子孙加载器去加载该类 。当退回到最初的类加载器时，如果它自己也不能完成类的加载，那么会抛出ClassNotFound异常。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ClassLoader loader = TestClassLoader.class.getClassLoader();
		// 循环输出类加载器
		while (loader != null) {
			System.out.println(loader.getClass().getName());
			loader = loader.getParent();
		}
	}
}
