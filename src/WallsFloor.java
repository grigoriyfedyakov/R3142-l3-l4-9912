import java.util.Objects;

public class WallsFloor extends Cave{
    private String name;
    public WallsFloor(String name) {
        super(name);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void facing(String str) {
        System.out.print(name+" oblitsovyvalis "+ str);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WallsFloor that = (WallsFloor) o;
        return Objects.equals(name, that.name);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    public String toString() {
        return "WallsFloor{" +
                "name='" + name + '\'' +
                '}';
    }
}
