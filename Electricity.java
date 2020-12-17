import java.util.Objects;

public class Electricity {
	private String name;
	public Electricity(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String light(String str) {
		return(name+ " для освещения "+str);
	}
	public String heat(String str) {
		return(name+" для отопления "+str);
		
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Electricity that = (Electricity) o;
		return Objects.equals(name, that.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public String toString() {
		return "Electricity{" +
				"name='" + name + '\'' +
				'}';
	}
}
