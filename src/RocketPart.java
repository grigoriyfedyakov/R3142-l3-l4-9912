import java.util.Objects;

public class RocketPart {
	private String name;
	public RocketPart(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String attach(String where) {
		return ("��������� "+name+" � "+where);
	}
	public String whereTake(String where) {
		return ("��� ����� "+name+where);
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RocketPart that = (RocketPart) o;
		return Objects.equals(name, that.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public String toString() {
		return "RocketPart{" +
				"name='" + name + '\'' +
				'}';
	}
}
