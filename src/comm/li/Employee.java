package comm.li;

public class Employee {
	/*public Employee()
	{
		System.out.print("�̳��˸���");
	}*/
	 String name;
	 int age;
	 String departement;
	 public Employee() 
	 {
		 System.out.print("�����˸������");
	 }
	 public Employee(String name, int age, String department)
	 {
		 this.name =name;
		 this.age=age;
		 this.departement=department;
	 }
	public void work ()
	{
		System.out.println("worker");
		System.out.print(name+"\n");
		System.out.print(age+"\n");
		System.out.print(departement+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


}
}