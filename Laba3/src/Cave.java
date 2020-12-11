
public class Cave  {
	private String name;
	public Cave(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void print() {
    	System.out.print(getName()+" ");
    }
	public void fill() {
		System.out.print(getName()+" çàïîëíÿëàñü âîçäóõîì");
	}
}

