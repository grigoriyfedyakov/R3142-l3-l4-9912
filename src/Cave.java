import java.util.Objects;

public class Cave  {
	private String name;
	public Cave(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void fill(String how) {
		if (how=="AFTER") {
			System.out.print(" после чего "+getName()+" заполнялась воздухом");
		}
		if (how=="BEFORE") {
			System.out.print(" перед чем "+getName()+" заполнялась воздухом");
		}
	}

	public void reform(String where) {
		System.out.print(" оборудования под жилье "+name+where);
	}

	public void nearby(String where) {
		System.out.print("Рядом с " +name+" "+where);
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cave cave = (Cave) o;
		return Objects.equals(name, cave.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public String toString() {
		return "Cave{" +
				"name='" + name + '\'' +
				'}';
	}
}
