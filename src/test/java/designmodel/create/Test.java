package designmodel.create;

public class Test {

	public static void main(String[] args) {
		ConcreteCreater c = new ConcreteCreater();
		Product p1 = c.createProduct(Football.class);
		Product p2 = c.createProduct(TV.class);
		p1.function();
		p2.function();
	}
}
