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
		System.out.print("начал создавать ");
	}
	public void think(String how) {
		if (how=="FAST") {
			System.out.print("недолго ");
		}
		switch(mest) {
		case он:
			System.out.print("думал ");
			break;
		case она:
			System.out.print("думала ");
			break;
		case они:
			System.out.print("думали ");
			break;
		case оно:
			System.out.print("думал ");
			break;
		}
	}
	public void thinkDeliever() {
		switch(mest) {
		case он:
			System.out.print("принялcя думать, как доставить ");
			break;
		case она:
			System.out.print("принялась думать, как доставить ");
			break;
		case они:
			System.out.print("принялись думать, как доставить ");
			break;
		case оно:
			System.out.print("принялось думать, как доставить ");
			break;
		}
		
	}
	public void thinkLaunch() {
		switch(mest) {
		case он:
			System.out.print("принялcя думать, как запустить ");
			break;
		case она:
			System.out.print("принялась думать, как запустить ");
			break;
		case они:
			System.out.print("принялись думать, как запустить ");
			break;
		case оно:
			System.out.print("принялось думать, как запустить ");
			break;
		}
	}
	public void finishedThink(String How) {
		if (How=="LONG") {
			System.out.print("в результате долгих обдумываний ");
		}
		switch(mest) {
		case он:
			System.out.print("додумался ");
			break;
		case она:
			System.out.print("додумалась ");
			break;
		case они:
			System.out.print("додумались ");
			break;
		case оно:
			System.out.print("додумалось ");
			break;
		}
	}
	public void notThink(String how) {
		if (how=="ONLY") {
			System.out.print("Единственное, до чего ");
		}
		System.out.print("не смогли додуматься " + getName());
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
