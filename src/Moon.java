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
    		return (" �� ���� ");
    	case INSIDE:
			return (" ������ ���� ");
    	case PO:
			return (" �� ���� ");
    	}
		return null;
	}
    public String cover(Predlog predlog) {
    	switch (predlog) {
    	case NA:
    		return ("�� ������ ����������� ");
    	case INSIDE:
			return("������ ������ ����������� ");
    	case PO:
			return("�� ������ ����������� ");
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
