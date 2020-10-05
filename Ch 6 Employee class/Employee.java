public class Employee{
 // declearing 
   String employeeName;
   String employeeNumber;
   int hireDate;


  //Constructor
   public Employee(String employeeName, String employeeNumber, int hireDate ){

     this.employeeName = employeeName;
     this.employeeNumber = employeeNumber;
     this.hireDate =  hireDate;

   }

   //Accessor
    public String getEmployeeName(){
      return employeeName;
    }
     public String getEmployeeNumber(){
      return employeeNumber;
    }
     public int getHireDate(){
      return hireDate;
    }
  //Mutator
    public void setEmployeeName(String newEmployeeName){
      this.employeeName = newEmployeeName;
    }
    public void setEmployeeNumber(String newEmployeeNumber){
      this.employeeNumber = newEmployeeNumber;
    }
    public void setHireDate(int newHireDate){
      this.hireDate = newHireDate;
    }

  //toSring
    public String toString(){
    return ("Name " + this.employeeName +
              "\n Number " + this.employeeNumber +
             "\n Date of hire " + this.hireDate );
  }

}