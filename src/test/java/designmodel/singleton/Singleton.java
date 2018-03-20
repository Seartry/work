package designmodel.singleton;
/**
 * 单例模式
 * 线程安全的模式
 * @author zhangxp
 *
 */
public class Singleton {
	/**
	 * 由类自己提供一个实例化对象
	 */
	private static final Singleton instance = new Singleton();
	/**
	 * 私有化构造方法
	 */
	private Singleton(){
		
	}
	/**
	 * 提供获取实例的对外方法
	 * @return
	 */
	public static Singleton getInstance() {
		return instance;
	}
	
}
