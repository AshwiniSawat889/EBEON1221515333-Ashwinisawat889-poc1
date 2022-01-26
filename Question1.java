class Student 
{
	int rollno;
	String name;

	public static void main(String[] args) 
	{
		Student student1=new Student();
		student student2=new Student();

		student1.rollno=1;
		student1.name="Ashwini";
		student2.rollno=2;
		student2.name="payal";

		System.out.println("Roll no of the student1 is:\t"+student1.rollno);
		System.out.println("Name of the student1 is:\t"+student1.name);
		System.out.println("Roll no of the student2 is:\t"+student2.rollno);
		System.out.println("Name of the student2 is:\t"+student2.name);
	}
}
