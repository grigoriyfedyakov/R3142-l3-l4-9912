import java.util.Objects;

public class Trubolet implements Rider {
	private String name;
	public Trubolet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void like() {
		System.out.print("��� "+getName());
	}
	public void freeRide(String where) {
		System.out.print("�������� "+where);
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Trubolet trubolet = (Trubolet) o;
		return Objects.equals(name, trubolet.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public String toString() {
		return "Trubolet{" +
				"name='" + name + '\'' +
				'}';
	}
}
