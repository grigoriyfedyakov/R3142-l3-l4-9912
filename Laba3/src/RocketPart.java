
public class RocketPart {
	private String name;
	public RocketPart(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void attach() {
		System.out.print("приделать "+getName());
	}
	public void whereTake() {
		System.out.print("где найти "+getName()+" ");
	}
	public void print() {
		System.out.print(getName());
	}
}
