
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
	public void freeRide() {
		switch(mest) {
		case он:
			System.out.print(mest + " мог свободно кататься ");
			break;
		case она:
			System.out.print(mest + " могла свободно кататься ");
			break;
		case они:
			System.out.print(mest + " могли свободно кататься ");
			break;
		case оно:
			System.out.print(mest + " могло свободно кататься ");
			break;		
		}
	}
}
