
public class Room {
	public static void appear(String name, Mest mest) {
		switch (mest) {
    	case он:
    		System.out.println("Появлялся "+name);
    		break;
    	case она:
    		System.out.print("Появлялась "+name);
    		break;
    	case оно:
    		System.out.println("Появлялось "+name);
    		break;
    	case они:
    		System.out.println("Появлялись "+name);
    		break;
		}
	}

}
