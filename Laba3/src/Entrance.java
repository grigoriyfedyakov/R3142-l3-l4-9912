
public class Entrance extends Cave {
	private String name;
	public Entrance(String name) {
		super(name);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void found() {
		System.out.print(getName()+" закладывался ");
	}

}
