import java.util.Objects;

public class Room {
	private String name;
	private Mest mest;
	public Room(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public void appear() {
		switch (mest) {
    	case ON:
    		System.out.println("��������� "+name);
    		break;
    	case ONA:
    		System.out.println("���������� "+name);
    		break;
    	case ONO:
    		System.out.println("���������� "+name);
    		break;
    	case ONI:
    		System.out.println("���������� "+name);
    		break;
		}
	}
	public void conect(String str){
		System.out.print(name+" ��� ����� � "+str);
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Room room = (Room) o;
		return Objects.equals(name, room.name) &&
				mest == room.mest;
	}

	public int hashCode() {
		return Objects.hash(name, mest);
	}

	public String toString() {
		return "Room{" +
				"name='" + name + '\'' +
				", mest=" + mest +
				'}';
	}
}
