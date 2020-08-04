package comm.li;

public class Worker extends  Employee{
	double dressAllowance;
	public double getDressAlowance()
	{System.out.println("子类方法");
		return this.dressAllowance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w=new Worker();
		w.name="小红";
		w.age=18;
	    w.departement="research";
		w.dressAllowance=200;
		w.work();
		w. getDressAlowance();
		

	}

}
