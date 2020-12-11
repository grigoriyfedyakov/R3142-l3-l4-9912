
public class Electricity {
	private String name;
	public Electricity(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void light() {
		System.out.print("для освещения ");
	}
	public void heat() {
		System.out.print("для отопления ");
		
	}
}
