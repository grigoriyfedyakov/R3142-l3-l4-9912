
public class Main {
	public static void main(String[] args) {
		Human kubik = new Human("�����", Mest.ON);
		Human vintikandshpuntik = new Human("������ � �������", Mest.ONI);
		Moon moon = new Moon("����");
		Cave cave = new Cave("������");
		Cave othercave = new Cave("������ ������");
		Stone granit = new Stone("������");
		Stone otherstone = new Stone("�����-������ ������ �������� ������");
		Entrance entrance = new Entrance("���� � ������");
		WallsFloor wallsfloor = new WallsFloor("����� � ������� ������");
		Inners inners = new Inners("������������ ������");
		Rocket rocket = new Rocket("������", Mest.ONA);
		RocketPart wheels = new RocketPart("������");
		RocketPart tale = new RocketPart("�����");
		Trubolet trubolet = new Trubolet("���������� ��������� ��������");
		Wall wall = new Wall("�������������������� ������", Mest.ONA);
		Door door = new Door("������������ ������������� �����", Mest.ONA);
		Sluice sluice = new Sluice("�������� ����������", Mest.ONO);
		SolarBatteries solarbatteries = new SolarBatteries("��������� �������", Mest.ONI);
		Electricity electricity = new Electricity("��������������");
		Room rooms = new Room("�������",Mest.ONI);
		Room corridors = new Room("��������", Mest.ONI);
		Room halls = new Room("����", Mest.ONI);
		Room downs = new Room("�������", Mest.ONI);
		Room elevators = new Room("�����", Mest.ONI);
		Room callbox = new Room("���������� �����", Mest.ONI);
		Room hutch = new Room("�������", Mest.ONI);
		Room storage = new Room("������", Mest.ONI);
		Room photolab = new Room("���������������", Mest.ONI);
		Room nii = new Room("������-����������������� ���������", Mest.ONI);
		Room railway = new Room("��������� �������� ������", Mest.ONA);
		Project project = new Project("������");


		kubik.think("FAST");
		System.out.print("� ");
		kubik.startCreate();
		project.print("LONG");
		cave.reform(moon.print(Predlog.NA));
		System.out.println("");

		project.print("THIS");
		System.out.print(": ");
		entrance.found(wall.getName());
		System.out.print("� ������� ");
		door.place();
		System.out.print(" � ");
		sluice.place();
		cave.fill("AFTER");
		System.out.println("");

		wallsfloor.facing(granit.getName());
		System.out.print(" ��� ");
		wallsfloor.facing(otherstone.getName());
		System.out.println("");

		cave.nearby(moon.cover(Predlog.NA));
		solarbatteries.place();
		solarbatteries.produce(electricity.light(cave.getName()));
		System.out.print(" �");
		solarbatteries.produce(electricity.heat(cave.getName()));
		System.out.println("");

		inners.convert("SLOW");
		System.out.println(": ");
		rooms.appear();
		corridors.appear();
		halls.appear();
		downs.appear();
		elevators.appear();
		callbox.appear();
		hutch.appear();
		storage.appear();
		photolab.appear();
		nii.appear();
		railway.appear();
		railway.conect(othercave.getName());
		System.out.println("");

		project.improve("FAST");
		System.out.println("");

		vintikandshpuntik.thinkDeliver(cave.getName(),rocket.getName());
		System.out.print("� ");
		vintikandshpuntik.thinkLaunch(rocket.getName(),moon.print(Predlog.INSIDE));
		System.out.println("");

		vintikandshpuntik.finishedThink("LONG",tale.attach(rocket.getName()));
		System.out.println("");
		vintikandshpuntik.finishedThink("LONG",wheels.attach(rocket.getName()));
		System.out.println("����� ");
		rocket.freeRide(moon.print(Predlog.PO));
		trubolet.like();
		System.out.println("");

		vintikandshpuntik.notThink("ONLY",wheels.whereTake(moon.print(Predlog.NA)));

	}

}
