
public class Stone {
	private String name;
	public Stone(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.print(getName()+" ");
	}
}
