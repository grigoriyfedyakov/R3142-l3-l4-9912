import java.util.Objects;

public class Project {
	private String name;
	public Project(String name) {
		this.name = name;
	}
	public void print(String how) {
		if (how=="SHORT") {
			System.out.print(name+" ");
		}
		if (how=="THIS") {
			System.out.print("Этот "+name);
		}
		if (how=="LONG") {
			System.out.print("архитектурный " + name);
		}
	}
	public void improve(String how) {
		if (how=="FAST") {
			System.out.print(name+" быстро обрастал новыми деталями ");
		}
		if (how=="SLOW") {
			System.out.print(name+"медленно обрастал новыми деталями ");
		}
		
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Project project = (Project) o;
		return Objects.equals(name, project.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public String toString() {
		return "Project{" +
				"name='" + name + '\'' +
				'}';
	}
}
