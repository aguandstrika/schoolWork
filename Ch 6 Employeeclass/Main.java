import java.util.Random;
class Main {
  public static void main(String[] args) {
    

  int employeeNumX = randomNumGen(); 
  char employeeNumY = randomCharGen();
  String employxToEmployy = Integer.toString(employeeNumX);
  String employyToEmployx = Character.toString(employeeNumY);

  String employeeNum = ( employxToEmployy + "-" + employyToEmployx); 
 // int hireDateRand = randomDateGen();
  int hireDate = randomDateGen();
//  System.out.print(employeeNum);
    //new Employee object
    Employee eOne = new Employee("Jack", employeeNum,hireDate );

    System.out.println(eOne.toString());

  }

//Random Num Method
  public static int randomNumGen(){
    Random rand = new Random();
    int randomNum;
    return randomNum = rand.nextInt(1000);

  }
  public static char randomCharGen(){
    Random rand = new Random();
   char randomChar;
   return randomChar = (char) ('a' + rand.nextInt(13)); 
  }
  //Random Num Method
  public static int randomDateGen(){
    Random rand = new Random();
    int randomDate;
    randomDate = rand.nextInt(70);
    return(1950+randomDate);
  }

}