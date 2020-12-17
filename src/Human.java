import java.util.Objects;

public class Human implements Thinker {
	private String name;
	private Mest mest;
	public Human(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}

	public void print() {
		System.out.print(getName()+" ");
	}
	public void startCreate() {
		System.out.print(getName()+" ����� ��������� ");
	}
	public void think(String how) {
		System.out.print(getName()+" ");
		if (how=="FAST") {
			System.out.print("������� ");
		}
		switch(mest) {
			case ON:
				System.out.print("����� ");
				break;
			case ONA:
				System.out.print("������ ");
				break;
			case ONI:
				System.out.print("������ ");
				break;
			case ONO:
				System.out.print("����� ");
				break;
		}
	}
	public void thinkDeliver(String where,String what) {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("������c� ������, ��� ��������� "+what+" � "+where+" ");
				break;
			case ONA:
				System.out.print("��������� ������, ��� ��������� "+what+" � "+where+" ");
				break;
			case ONI:
				System.out.print("��������� ������, ��� ��������� "+what+" � "+where+" ");
				break;
			case ONO:
				System.out.print("��������� ������, ��� ��������� "+what+" � "+where+" ");
				break;
		}

	}
	public void thinkLaunch(String what, String where) {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("������c� ������, ��� ��������� "+what+" "+where);
				break;
			case ONA:
				System.out.print("��������� ������, ��� ��������� "+what+" "+where);
				break;
			case ONI:
				System.out.print("��������� ������, ��� ��������� "+what+" "+where);
				break;
			case ONO:
				System.out.print("��������� ������, ��� ��������� "+what+" "+where);
				break;
		}
	}
	public void finishedThink(String How,String what) {
		System.out.print(name+" ");
		if (How=="LONG") {
			System.out.print("� ���������� ������ ����������� ");
		}
		switch(mest) {
			case ON:
				System.out.print("��������� ");
				break;
			case ONA:
				System.out.print("���������� ");
				break;
			case ONI:
				System.out.print("���������� ");
				break;
			case ONO:
				System.out.print("���������� ");
				break;
		}
		System.out.print(what);
	}
	public void notThink(String how, String what) {
		if (how=="ONLY") {
			System.out.print("������������, �� ���� ");
		}
		System.out.print("�� ������ ���������� " + name+" ��� "+what);
	}
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Human human = (Human) o;
		return Objects.equals(name, human.name) &&
				mest == human.mest;
	}

	public int hashCode() {
		return Objects.hash(name, mest);
	}

	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", mest=" + mest +
				'}';
	}

}
