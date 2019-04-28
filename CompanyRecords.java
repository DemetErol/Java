
public class CompanyRecords {
	
	 
	Employee [] employees= new Employee [4];
	
	//CompanyRecords constructor method
	public CompanyRecords() 
	{	employees[0]=new Employee(70234,"Frank Denson",5000,"FullTime");
		employees[1]=new Employee(70235,"Harmony Clay",1700,"PartTime");
		employees[2]=new Employee(70236,"Harry Field",3500,"Unknown");
		employees[3]=new Employee(70237,"Jennifer Bennett",7000,"FullTime");		
	}	
	//end constructor method
	
	//print method
	public void showRecords() 
	
	{	
		for(int i=0; i<4;i++)
	{System.out.println("Employee: "+ employees[i].getEmployeeNbr());
		System.out.println("Name: "+ employees[i].getName());
	    System.out.println("Status: " +employees[i].getSt());
	    System.out.println("Wage: " + employees[i].getWage());
		}
	}//end showRecords method

}//end class CompanyRecords
