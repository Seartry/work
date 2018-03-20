package designmodel.singleton;
/**
 * 单例模式
 * 非线程安全的情况
 * @author zhangxp
 *
 */
public class Singleton2 {
	
	public static Singleton2 instance = null;
	
	private Singleton2() {
		
	}
	
	public static Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
