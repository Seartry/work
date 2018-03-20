package designmodel.create;

public class ConcreteCreater extends Creater{

	public <T extends Product> T createProduct(Class<T> c){
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return (T)product;
	}
}
