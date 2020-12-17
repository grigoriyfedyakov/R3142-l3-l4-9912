import java.util.Objects;

public class Inners extends Cave{
	private String name;
	public Inners(String name) {
		super(name);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void convert(String how) {
		if (how=="SLOW") {
			System.out.print(getName()+" постепенно ");
		}
		System.out.print("переоборудовалaсь ");
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Inners inners = (Inners) o;
		return Objects.equals(name, inners.name);
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), name);
	}

	public String toString() {
		return "Inners{" +
				"name='" + name + '\'' +
				'}';
	}
}
