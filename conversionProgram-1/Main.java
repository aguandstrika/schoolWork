import java.awt.Menu;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class Main {
  public static void main(String[] args) {

    Conn convert = new Conn();
    convert.menu();


  }
}
class Conn{

//The main Menu 
  public void menu(){
  Scanner userInPut = new Scanner(System.in);
  int exit = 4;

    System.out.print("Enter any amount of distance, it will be in meters: ");
      double numMeters = userInPut.nextDouble();

//main loop
    while (true) {
      System.out.println("1.Convert to kilometers");
      System.out.println("2.Convert to inches");
      System.out.println("3.Convert to feet");
      System.out.println("4.Quit the program");
        int menuSelect = userInPut.nextInt();
      
    if(menuSelect == 1){
     showKilometers(numMeters);
    }
    if(menuSelect == 2){
     showInches(numMeters);
    }
    if(menuSelect == 3){
     showFeet(numMeters);
    }

    if (exit == 4) {
      
        exit();
        break;
    }
    
  }
}

//Meters Math Convertion
  public void showKilometers(double numMeters){
    double kiloM = numMeters * 0.001;
      System.out.println(numMeters+" is "+kiloM+" Kilometers");
}

//Inches Math Convertion
  public void showInches(double numMeters){
   double inches = numMeters * 39.37;
    System.out.println(numMeters+" is "+inches+" Kilometers");
}
//Feet Math Convertion
  public void showFeet(double numMeters){
   double feet = numMeters * 3.281;
    System.out.println(numMeters+" is "+feet+" Kilometers");
}

public void exit(){
 
  System.out.print("Fuck off");
  
 }
}