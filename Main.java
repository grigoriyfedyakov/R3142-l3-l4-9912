
public class Main {
	public static void main(String[] args) {
		Human kubik = new Human("Кубик", Mest.ON);
		Human vintikandshpuntik = new Human("Винтик и Шпунтик", Mest.ONI);
		Moon moon = new Moon("Луна");
		Cave cave = new Cave("пещера");
		Cave othercave = new Cave("другая пещера");
		Stone granit = new Stone("гранит");
		Stone otherstone = new Stone("какой-нибудь другой красивый камень");
		Entrance entrance = new Entrance("вход в пещеру");
		WallsFloor wallsfloor = new WallsFloor("Стены и потолок пещеры");
		Inners inners = new Inners("Внутренность пещеры");
		Rocket rocket = new Rocket("ракета", Mest.ONA);
		RocketPart wheels = new RocketPart("колеса");
		RocketPart tale = new RocketPart("хвост");
		Trubolet trubolet = new Trubolet("реактивный роликовый труболет");
		Wall wall = new Wall("воздухонепроницаемая стенка", Mest.ONA);
		Door door = new Door("герметически закрывающаяся дверь", Mest.ONA);
		Sluice sluice = new Sluice("шлюзовое устройство", Mest.ONO);
		SolarBatteries solarbatteries = new SolarBatteries("солнечные батареи", Mest.ONI);
		Electricity electricity = new Electricity("электроэнергия");
		Room rooms = new Room("комнаты",Mest.ONI);
		Room corridors = new Room("коридоры", Mest.ONI);
		Room halls = new Room("залы", Mest.ONI);
		Room downs = new Room("подвалы", Mest.ONI);
		Room elevators = new Room("лифты", Mest.ONI);
		Room callbox = new Room("телефонные будки", Mest.ONI);
		Room hutch = new Room("закрома", Mest.ONI);
		Room storage = new Room("склады", Mest.ONI);
		Room photolab = new Room("фотолаборатории", Mest.ONI);
		Room nii = new Room("научно-исследовательские институты", Mest.ONI);
		Room railway = new Room("подлунная железная дорога", Mest.ONA);
		Project project = new Project("проект");


		kubik.think("FAST");
		System.out.print("и ");
		kubik.startCreate();
		project.print("LONG");
		cave.reform(moon.print(Predlog.NA));
		System.out.println("");

		project.print("THIS");
		System.out.print(": ");
		entrance.found(wall.getName());
		System.out.print("в которой ");
		door.place();
		System.out.print(" и ");
		sluice.place();
		cave.fill("AFTER");
		System.out.println("");

		wallsfloor.facing(granit.getName());
		System.out.print(" или ");
		wallsfloor.facing(otherstone.getName());
		System.out.println("");

		cave.nearby(moon.cover(Predlog.NA));
		solarbatteries.place();
		solarbatteries.produce(electricity.light(cave.getName()));
		System.out.print(" и");
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
		System.out.print("и ");
		vintikandshpuntik.thinkLaunch(rocket.getName(),moon.print(Predlog.INSIDE));
		System.out.println("");

		vintikandshpuntik.finishedThink("LONG",tale.attach(rocket.getName()));
		System.out.println("");
		vintikandshpuntik.finishedThink("LONG",wheels.attach(rocket.getName()));
		System.out.println("чтобы ");
		rocket.freeRide(moon.print(Predlog.PO));
		trubolet.like();
		System.out.println("");

		vintikandshpuntik.notThink("ONLY",wheels.whereTake(moon.print(Predlog.NA)));

	}

}
