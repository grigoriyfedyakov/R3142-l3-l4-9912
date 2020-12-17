import java.util.Objects;

public class Entrance extends Cave {
	private String name;
	public Entrance(String name) {
		super(name);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void found(String str) {
		System.out.print(getName()+" закладывался " +str+" ");
	}

	public boolean equals(Object o) {

		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Entrance entrance = (Entrance) o;
		return Objects.equals(name, entrance.name);
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), name);
	}

	public String toString() {
		return "Entrance{" +
				"name='" + name + '\'' +
				'}';
	}
}
