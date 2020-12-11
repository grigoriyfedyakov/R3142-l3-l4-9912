
public class Main {
	public static void main(String[] args) {
		Human kubik = new Human("Кубик", Mest.он);
		Human vintikandshpuntik = new Human("Винтик и Шпунтик", Mest.они);
		Moon moon = new Moon("Луна");
		Cave cave = new Cave("пещера");
		Cave othercave = new Cave("другая пещера");
		Stone granit = new Stone("гранит");
		Stone otherstone = new Stone("какой-нибудь другой красивый камень");
		Entrance entrance = new Entrance("вход в пещеру");
		WallsFloor wallsfloor = new WallsFloor("Стены и потолок пещеры");
		Inners inners = new Inners("Внутренность пещеры");
		Rocket rocket = new Rocket("ракета", Mest.она);
		RocketPart wheels = new RocketPart("колеса");
		RocketPart tale = new RocketPart("хвост");
		Trubolet trubolet = new Trubolet("реактивный роликовый труболет");
		Wall wall = new Wall("воздухонепроницаемая стенка", Mest.она);
		Door door = new Door("герметически закрывающаяся дверь", Mest.она);
		Sluice sluice = new Sluice("шлюзовое устройство", Mest.оно);
		SolarBatteries solarbatteries = new SolarBatteries("солнечные батареи", Mest.они);
		Electricity electricity = new Electricity("электроэнергия");
		
		kubik.print();
		kubik.think("FAST"); 
		System.out.print("и ");
		kubik.startCreate();
		Project.print("LONG");
		cave.print();
		moon.print(Predlog.на);
		System.out.println("");
		
		Project.print("THIS");
		entrance.found();
		wall.print();
		System.out.print("в которой ");
		door.place();
		System.out.print(" и ");
		sluice.place();
		System.out.println(" после чего ");
		cave.fill();		
		System.out.println("");
		
		wallsfloor.facing();
		granit.print();
		System.out.print("или ");
		otherstone.print();
		System.out.println("");
		
		System.out.print("Рядом с ");
		cave.print();
		moon.cover(Predlog.на);
		solarbatteries.place();
		solarbatteries.produce();
		electricity.print();
		electricity.light();
		System.out.print("и ");
		electricity.heat();
		cave.print();
		System.out.println("");
		
		inners.convert("SLOW");
		System.out.println(": ");
		Room.appear("комнаты", Mest.они);
		Room.appear("коридоры", Mest.они);
		Room.appear("залы", Mest.они);
		Room.appear("подвалы", Mest.они);
		Room.appear("лифты", Mest.они);
		Room.appear("телефонные будки", Mest.они);
		Room.appear("закрома", Mest.они);
		Room.appear("склады", Mest.они);
		Room.appear("фотолаборатории", Mest.они);
		Room.appear("научно-исследовательские институты", Mest.они);
		Room.appear("подлунная железная дорога", Mest.она);
		System.out.print(" для связи с ");
		othercave.print();
		System.out.println("");
		
		Project.improve("FAST");
		System.out.println("");
		
		vintikandshpuntik.print();
		vintikandshpuntik.thinkDeliever();
		System.out.print("в ");
		cave.print();
		rocket.print();
		System.out.print("и ");
		vintikandshpuntik.thinkLaunch();
		rocket.print();
		moon.print(Predlog.внутрь);
		System.out.println("");
		
		vintikandshpuntik.print();
		vintikandshpuntik.finishedThink("LONG");
		tale.attach();
		System.out.print(" и ");
		wheels.attach();
		System.out.print(" к ");
		rocket.print();
		System.out.print("чтобы ");
		rocket.freeRide();
		moon.print(Predlog.по);
		trubolet.like();
		System.out.println("");
		
		vintikandshpuntik.notThink("ONLY");
		System.out.print(" это ");
		wheels.whereTake();
		moon.print(Predlog.на);
	}

}
