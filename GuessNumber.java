import java.util.Scanner;
import javax.swing.*;
public class GuessGame{
	public static void main(String[]args){
		int computerNumber=(int)
			(Math.random()*100+1);
		int userAnswer=0;
		int count=1;
		while(userAnswer!=computerNumber){
			String responce=JOptionPane.showInputDialog(null,"Guess a number between 1 to 100");
			userAnswer=Integer.parseInt(responce);
			JOptionPane.showMessageDialog(null," "+determineGuess(userAnswer,computerNumber,count));
			count++;
			
		}
		}
	public static String determineGuess(int userAnswer,int computerNumber,int count){
		if(userAnswer<=0 || userAnswer>100){
			return "your guess is invalid";
		}
		else if(userAnswer==computerNumber){
			return "Correct Guess\n Total Guesses:" +count;
		}
		else if(userAnswer>computerNumber){
			return "Your Guess is greater than computer number,Try Again.\n Try Number:"+count;
		}
		else if(userAnswer<computerNumber){
			return "Your Guess is less than computer number,Try Again.\n Try Number:"+count;
		}
		else{
			return "Your guess is incorrect\n,Try Number:"+count;
			}
	}
}
