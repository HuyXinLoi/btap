package cuahangcf;

public class menu {
	public static void main(String[] args) {
		cffff cf = new cffff();
		cffff cf1 = new cffff();
		cffff cf2 = new cffff();
		cf.setKind("Hawaiian Kona");
		cf1.setKind("Ethiopian coffee");
		cf2.setKind("Colombian Supreme");
		cf.setPrice(15.95);
		cf1.setPrice(8.00);
		cf2.setPrice(9.50);
		cf.setWeight(20);
		cf1.setWeight(20);
		cf2.setWeight(20);
		cf.output();
		cf1.output();
		cf2.output();
	}
}
