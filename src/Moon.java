import java.util.Objects;

public class Moon {
	private String name;
	public Moon(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
    public String print(Predlog predlog) {
    	switch (predlog) {
    	case NA:
    		return (" на Луне ");
    	case INSIDE:
			return (" внутрь Луны ");
    	case PO:
			return (" по Луне ");
    	}
		return null;
	}
    public String cover(Predlog predlog) {
    	switch (predlog) {
    	case NA:
    		return ("на лунной поверхности ");
    	case INSIDE:
			return("внутрь лунной поверхности ");
    	case PO:
			return("по лунной поверхности ");
    	}
		return null;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Moon moon = (Moon) o;
		return Objects.equals(name, moon.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public String toString() {
		return "Moon{" +
				"name='" + name + '\'' +
				'}';
	}
}
