/******** Made by Jose Rosado
 *        Date: 9/13/2020
 *        purpose: Generate Random Number and change **/
//import everything
import java.util.*;

public class Randomnumber 
{
public static void main(String[] args) {
//set up Scanner
Scanner userInput=new Scanner(System.in);

//declaring variables
int totalChange = 0, num = 0, quarters = 0, pennies = 0, nickels = 0, dimes = 0, halfDollars = 0;

//Generating random number between 0 and 99
        Random rand =  new Random();
        final int MIN = 0;
        final int MAX = 99;
        // Below generates a random number between MAX and MIN
        // includes the end points of MAX and MIN
        totalChange= (int)(Math.random() * (MAX - MIN + 1) + MIN);
       System.out.println("Total Change: " + totalChange);

	//Regulate the least amount needed for random number

 halfDollars = totalChange / 50;
        totalChange %= 50;
        quarters = totalChange / 25;
        totalChange %= 25;
        dimes =totalChange / 10;
        totalChange %= 10;
        nickels = totalChange / 5;
        totalChange %= 5;
        pennies = totalChange / 1;


	//shows how much change needed to user
	if (halfDollars <= 1) {
		 System.out.println("Half Dollar: "+ halfDollars); }
	else {
		System.out.println("Half Dollars: "+ halfDollars); }

	if (quarters <= 1) {
		 System.out.println("Quarter: "+ quarters); }
	else {
		 System.out.println("Quarters: "+ quarters); }

	if (dimes <= 1) {
		 System.out.println("Dime: "+ dimes); }
	else {
		 System.out.println("Dimes: "+ dimes); }

	if (nickels <= 1) {
		 System.out.println("Nickel: "+ nickels); }
	else {
		 System.out.println("Nickels: "+ nickels); }

	if (pennies <= 1) {
		 System.out.println("Penny: "+ pennies); }
	else {
		 System.out.println("Pennies: "+ pennies);}
	}	 
}
