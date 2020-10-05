/*
conversion programWrite a program that asks the user to enter a distance in meters. 
The program will then pre-sent the following menu of selections:1. 
Convert to kilometers2.  Convert to inches3.  Convert to feet4.  
Quit the programThe program will convert the distance to kilometers, inches, or feet,
depending on the user’s selection. Here are the specific requirements:•  Write avoid method named showKilometers,
which accepts the number of meters as an argument. The method should display the
argument converted to kilometers. Con-vert the meters to kilometers using the
following formula:kilometers = meters * 0.001•  Write a void method named showInches,
which accepts the number of meters as an argument. The method should display the argument converted to inches. 
Convert the meters to inches using the following formula:inches = meters * 39.37•  Write a void method named showFeet,
which accepts the number of meters as an argument. The method should display the argument converted to feet. 
Convert the meters to feet using the following formula:feet = meters * 3.281•  Write a void method named menu
that displays the menu of selections. This method should not accept any arguments.•  The program should continue to display 
the menu until the user enters 4 to quit the program.•  The program should not accept negative numbers for the distance in meters.•  
If theuserselectsaninvalidchoicefromthemenu,theprogramshoulddisplayanerror message.Here is an example session with the program, using console input.
The user’s input is shown in bold.Enter a distance in meters: 500 [enter]1. Convert to kilometers2. Convert to inches3. Convert to feet4.
Quit the programEnter your choice: 1 [enter]500 meters is 0.5 kilometers.1. Convert to kilometers2. Convert to inches3. Convert to feet4. Quit the program
+

*/
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
