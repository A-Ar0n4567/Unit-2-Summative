/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rock.paper.scissors.summative;
import java.util.Scanner;
import java.util.Random;
/**
 *Rock Paper Scissors Summative Program
 * @author aamir7110
 */
public class RockPaperScissorsSummative {

    /**
     * This Program Plays Rock, Paper, Scissors With You
     * @param args the command line arguments
     */
    public static void main(String[] args) {             
        //runs the userMenu method
        userMenu();
        
       }
    public static void userMenu(){
        //variable Declaration
        String choice;
        String bot;
        
        //make a new scanner
        Scanner keyedInput = new Scanner(System.in);
        //promts the user to play the game or exit
        System.out.println("Type Rock, Paper, Or Scissors To Play. or Type End To Exit.");
        //variable assignment
        choice = keyedInput.nextLine();
        
        bot = userChoice(choice);
        //displays the random choice the bot came up with
        System.out.println(bot);

        //if player chooses Rock it decides the outcome from what the bot chooses
        if(choice.equals("Rock")){
            if(bot.equals("Rock")){
                System.out.println("You Tied!");
                userMenu();
            }
            if(bot.equals("Paper")){
                System.out.println("You Lose");
                userMenu();
            }
            if(bot.equals("Scissors")){
                System.out.println("You Win");
                userMenu();
            }
        }
        //if player chooses Paper it decides the outcome from what the bot chooses
        if(choice.equals("Paper")){
            if(bot.equals("Rock")){
                System.out.println("You Win!");
                userMenu();
            }
            if(bot.equals("Paper")){
                System.out.println("You Tied");
                userMenu();
            }
            if(bot.equals("Scissors")){
                System.out.println("You Lose");
                userMenu();
            }
        }
        //if player chooses Scissors it decides the outcome from what the bot chooses
        if(choice.equals("Scissors")){
            if(bot.equals("Rock")){
                System.out.println("You Lose!");
                userMenu();
            }
            if(bot.equals("Paper")){
                System.out.println("You Win");
                userMenu();
            }
            if(bot.equals("Scissors")){
                System.out.println("You Tied!");
                userMenu();
            }
            //Stops The program
            if(choice.equals("end")){
                System.out.println("GoodBye.");
            }
        }
        
       
       
    }

    /**
     *Chooses a random number and assigns a String Based on the number.
     * @param choice
     * @return - Returns Rock,Paper, Or Scissors
     */
    public static String userChoice(String choice){
        Random rand = new Random();
      //creates a random number
        int n = rand.nextInt(3) + 1;
        
        String botChoice = "";
        
        double rnd;
        //chooses rock, paper, or scissors based on the value of n
        if(choice.equals("Rock")){

            if(n==1){
                botChoice ="Rock";
            }
            if(n==2){
                botChoice ="Paper";
            }
            if(n==3){
                botChoice ="Scissors";
            }    
        }
        if(choice.equals("Scissors")){

            if(n==1){
                botChoice ="Rock";
            }
            if(n==2){
                botChoice ="Paper";
            }
            if(n==3){
                botChoice ="Scissors";
            }    
        }
        if(choice.equals("Paper")){

            if(n==1){
                botChoice ="Rock";
            }
            if(n==2){
                botChoice ="Paper";
            }
            if(n==3){
                botChoice ="Scissors";
            }    
        }
        return botChoice;
    }
    
}
