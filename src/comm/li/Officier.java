package comm.li;

public class Officier extends Employee{
	double vehicleAllowance;
	/*public double getVehicAllowance()
	
	{
		System.out.print("zileifangfa");
		return this.vehicleAllowance;
	}*/
   public  void test() {
	/*System.out.print(super.name+","+super.age+","+super.departement);
	System.out.print(this.name+","+this.age+","+this.departement);*/
	   
	   this.work();
	   super.work();
   
   }
   public Officier()
   {  this(100);
   System.out.print("officier");
   
	   }
   
   public Officier(double  vehicleAllowance) 
   {   
	this.vehicleAllowance=vehicleAllowance;
}
   public Officier(String name, int age, String department,int vehicleAllowance)
   {
	   super(name,age,department);
	   this.vehicleAllowance=vehicleAllowance;
   }
   public double getVehicAllowance()
   {
	   return this.getVehicAllowance();
   }
   
public void work () {
	   System.out.print("work-officier"+"\n");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Officier o=new Officier();
o.name="ÕÅÈý";
o.age=73;
o.departement="research";
o.vehicleAllowance=200;
o.test();
/*o.work();
o.getVehicAllowance();*/
	}

}
