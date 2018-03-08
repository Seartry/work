package ssm.tena;

import javax.swing.JFrame;

public class Oop02 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		JFrame jf = new JFrame("我的窗口");
		jf.setSize(600, 400);
		jf.setLocation(400, 400);
		jf.show();
		jf = null;
	}
}
