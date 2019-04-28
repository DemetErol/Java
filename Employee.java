
public class Employee {

private long employeeNbr; 
private String name;
private double wage; 
private String st; //employee status: full time,part time, unknown e.g.

//return employee number
public long getEmployeeNbr()
{
	return employeeNbr;
}
//end method getEmployeeNbr

//set employee number
public void setEmployeeNbr (long employeeNbr)
{
	this.employeeNbr=employeeNbr;
}
//end method setEmployeeNbr

//return employee name
public String getName()
{
	return name;
}
//end method getName

//set employee name
public void setName (String name)
{
	this.name=name;
}
//end method setName

//return wage
public double getWage()
{
	return wage;
}
//end method getWage

//set wage
public void setWage (double wage)
{
	this.wage=wage;
}
//end method setWage

//return employee status
public String getSt()
{
	return st;
}
//end method getSt

//set employee status
public void setSt(String st)
{
	this.st=st;	
}
//end method setSt

//Four argument constructor
//implicit call to Object constructor occurs here 
public Employee(long employeeNbr,String name,double wage,String st){
	this.employeeNbr=employeeNbr;
	this.name=name;
	this.wage=wage;
	this.st=st;		
}
//end Employee constructor
}          //end class Employee            
