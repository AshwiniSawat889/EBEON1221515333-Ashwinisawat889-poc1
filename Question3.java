class Car 
{
	int wheels;
	string model;

	Car(int wheels,String model)
	{
		this.wheels=wheels;
		this.model=model;
		System.out.println("Wheels of the Car is:\t"+wheels);
	}
	public static void main(String[] args) 
	{
		Car obj=new Car(5,"Marazo");
		System.out.println("Models of the Car is:\t"+obj.model);
	}
}
