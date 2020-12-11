
public class Moon {
	private String name;
	public Moon(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
    public void print(Predlog predlog) {
    	switch (predlog) {
    	case на:
    		System.out.print(predlog+" Луне ");
    		break;
    	case внутрь:
    		System.out.print(predlog+" Луны ");
    		break;
    	case по:
    		System.out.print(predlog+" Луне ");
    		break;
    	}
    }
    public void cover(Predlog predlog) {
    	switch (predlog) {
    	case на:
    		System.out.print(predlog+" лунной поверхности ");
    		break;
    	case внутрь:
    		System.out.print(predlog+" лунной поверхности ");
    		break;
    	case по:
    		System.out.print(predlog+" лунной поверхности ");
    		break;
    	}
    }

}
