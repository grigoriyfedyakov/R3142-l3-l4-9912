import java.util.Objects;

public class Sluice extends Innovations {
	private String name;
	private Mest mest;
	public Sluice(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void place() {
		switch(mest) {
		case ON:
			System.out.print("������� " +getName());
			break;
		case ONA:
			System.out.print("�������� "+getName());
			break;
		case ONI:
			System.out.print("�������� "+getName());
			break;
		case ONO:
			System.out.print("�������� "+getName());
			break;		
		}
	}
	public void produce(String str) {
		switch(mest) {
		case ON:
			System.out.print(" �������������� ");
			break;
		case ONA:
			System.out.print(" �������������� ");
			break;
		case ONI:
			System.out.print(" �������������� ");
			break;
		case ONO:
			System.out.print(" �������������� ");
			break;		
		}
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sluice sluice = (Sluice) o;
		return Objects.equals(name, sluice.name) &&
				mest == sluice.mest;
	}

	public int hashCode() {
		return Objects.hash(name, mest);
	}

	public String toString() {
		return "Sluice{" +
				"name='" + name + '\'' +
				", mest=" + mest +
				'}';
	}
}
