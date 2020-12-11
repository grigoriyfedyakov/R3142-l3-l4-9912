
public class Door extends Innovations {
	private String name;
	private Mest mest;
	public Door(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void place() {
		switch(mest) {
		case он:
			System.out.print("делался " +getName());
			break;
		case она:
			System.out.print("делалась "+getName());
			break;
		case они:
			System.out.print("устанавливались "+getName());
			break;
		case оно:
			System.out.print("делалось "+getName());
			break;		
		}
	}
	public void produce() {
		switch(mest) {
		case он:
			System.out.print(" вырабатывающий ");
			break;
		case она:
			System.out.print(" вырабатывающая ");
			break;
		case они:
			System.out.print(" вырабатывающие ");
			break;
		case оно:
			System.out.print(" вырабатывающее ");
			break;		
		}
	}
	public void print() {
		System.out.print(getName()+" ");
	}

}
