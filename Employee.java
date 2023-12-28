package Example;

public class Employee {

	// auto generation id
	String id;
	static	int count=101; //consider a static variable 

	Employee()
	{
		this.id="JS"+count+"P"; // initialize the counter variavle
		count++; // increment the counter variable 
	}

	public static void main(String[] args) {

		Employee e1= new Employee();
		Employee e2=new Employee();
		Employee e3= new Employee();

		System.out.println(e1.id+" ,"+e2.id+" ,"+e3.id);

	}

}
