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
		System.out.print(getName()+" начал создавать ");
	}
	public void think(String how) {
		System.out.print(getName()+" ");
		if (how=="FAST") {
			System.out.print("недолго ");
		}
		switch(mest) {
			case ON:
				System.out.print("думал ");
				break;
			case ONA:
				System.out.print("думала ");
				break;
			case ONI:
				System.out.print("думали ");
				break;
			case ONO:
				System.out.print("думал ");
				break;
		}
	}
	public void thinkDeliver(String where,String what) {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("принялcя думать, как доставить "+what+" в "+where+" ");
				break;
			case ONA:
				System.out.print("принялась думать, как доставить "+what+" в "+where+" ");
				break;
			case ONI:
				System.out.print("принялись думать, как доставить "+what+" в "+where+" ");
				break;
			case ONO:
				System.out.print("принялось думать, как доставить "+what+" в "+where+" ");
				break;
		}

	}
	public void thinkLaunch(String what, String where) {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("принялcя думать, как запустить "+what+" "+where);
				break;
			case ONA:
				System.out.print("принялась думать, как запустить "+what+" "+where);
				break;
			case ONI:
				System.out.print("принялись думать, как запустить "+what+" "+where);
				break;
			case ONO:
				System.out.print("принялось думать, как запустить "+what+" "+where);
				break;
		}
	}
	public void finishedThink(String How,String what) {
		System.out.print(name+" ");
		if (How=="LONG") {
			System.out.print("в результате долгих обдумываний ");
		}
		switch(mest) {
			case ON:
				System.out.print("додумался ");
				break;
			case ONA:
				System.out.print("додумалась ");
				break;
			case ONI:
				System.out.print("додумались ");
				break;
			case ONO:
				System.out.print("додумалось ");
				break;
		}
		System.out.print(what);
	}
	public void notThink(String how, String what) {
		if (how=="ONLY") {
			System.out.print("Единственное, до чего ");
		}
		System.out.print("не смогли додуматься " + name+" это "+what);
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
