
public class Cave  {
	private String name;
	public Cave(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void fill() {
		System.out.print(getName()+" заполнялась воздухом");
	}
}
