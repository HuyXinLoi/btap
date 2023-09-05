package cuahangcf;

public class cffff {
	String kind;
	double price;
	int weight;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void output()
	{
		System.out.println("Loai:" + this.kind + "\t Gia: $"+ this.price + "/pound\tCan nang: "+ this.weight + "->>>" + this.calculator());
		System.out.println();
	}
	public double calculator()
	{
		return this.price*this.weight;
	}
	
}
