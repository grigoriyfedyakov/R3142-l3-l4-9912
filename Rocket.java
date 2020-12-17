import java.util.Objects;

public class Rocket implements Rider {
	private String name;
	private Mest mest;
	public Rocket(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void freeRide(String where) {
		switch(mest) {
		case ON:
			System.out.print("он" + " мог свободно кататься ");
			break;
		case ONA:
			System.out.print("она" + " могла свободно кататься ");
			break;
		case ONI:
			System.out.print("они" + " могли свободно кататься ");
			break;
		case ONO:
			System.out.print("оно" + " могло свободно кататься ");
			break;		
		}
		System.out.print(where);
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Rocket rocket = (Rocket) o;
		return Objects.equals(name, rocket.name) &&
				mest == rocket.mest;
	}

	public int hashCode() {
		return Objects.hash(name, mest);
	}

	public String toString() {
		return "Rocket{" +
				"name='" + name + '\'' +
				", mest=" + mest +
				'}';
	}
}
