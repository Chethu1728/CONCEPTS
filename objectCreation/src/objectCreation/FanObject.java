package objectCreation;

class Fan{
	int no_of_wings;
	String color;
	int cost;
	String brand;
	
	void rotate()
	{
		System.out.println(color+" color "+no_of_wings+" wing "+brand+" branded fan which costs "+cost+" is started rorating");
	}
	void airBlow()
	{
		System.out.println("the "+color+" coloured fan started to blow the air");
	}
}
