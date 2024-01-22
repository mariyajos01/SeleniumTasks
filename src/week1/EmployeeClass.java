package week1;

public class EmployeeClass {
	
	//Data
	int emp_id;
	String emp_name;
	
	//Function
	
	public void display()
	{
	System.out.println("Emp id:"+emp_id);
	System.out.println("Emp name:" +emp_name);
	}
	

	public static void main(String[] args) {
		
		
		System.out.println("Employee Data");
		System.out.println("");
		
		//Data 1
		EmployeeClass a1=new EmployeeClass();
		a1.emp_id=100;
		a1.emp_name="Mariya";
		a1.display();
		
		System.out.println("***********************");
		
		//Data 2
		EmployeeClass a2=new EmployeeClass();
		a2.emp_id=101;
		a2.emp_name="Henna";
		a2.display();
		
		System.out.println("***********************");
		
		//Data 3
		EmployeeClass a3=new EmployeeClass();
		a3.emp_id=102;
		a3.emp_name="Antony";
		a3.display();
		
		System.out.println("***********************");
		
		//Data 4
		EmployeeClass a4=new EmployeeClass();
		a4.emp_id=103;
		a4.emp_name="Rani";
		a4.display();
		
		System.out.println("***********************");
		
		//Data 5
		EmployeeClass a5=new EmployeeClass();
		a5.emp_id=104;
		a5.emp_name="Jose";
		a5.display();

	}

}
