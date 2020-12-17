import java.util.Objects;

public class Stone {
	private String name;
	public Stone(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Stone stone = (Stone) o;
		return Objects.equals(name, stone.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public String toString() {
		return "Stone{" +
				"name='" + name + '\'' +
				'}';
	}
}
