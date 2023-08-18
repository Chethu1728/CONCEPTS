package objectCreation;

public class FanApp {

	public static void main(String[] args) {
		Fan f1=new Fan();
		Fan f2=new Fan();
		Fan f3=new Fan();
		f1.no_of_wings=3;
		f1.color="white";
		f1.cost=5000;
		f1.brand="crompton";
		System.out.println(f1.no_of_wings+" "+f1.color+" "+f1.cost+" "+f1.brand);
		f1.rotate();
		f1.airBlow();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		f2.no_of_wings=4;
		f2.color="blue";
		f2.cost=4500;
		f2.brand="usha";
		System.out.println(f2.no_of_wings+" "+f2.color+" "+f2.cost+" "+f2.brand);
		f2.rotate();
		f2.airBlow();
		System.out.println("________________________________________________________________________________________________");
		f3.no_of_wings=5;
		f3.color="black";
		f3.cost=7000;
		f3.brand="havells";
		System.out.println(f3.no_of_wings+" "+f3.color+" "+f3.cost+" "+f3.brand);
		f3.rotate();
		f3.airBlow();
	}

}
