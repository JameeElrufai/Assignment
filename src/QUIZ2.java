
import static QUIZ2.answers;
import static QUIZ2.answers;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AZIZA
 */
public class QUIZ2 {
    static String Questions [] = {"what is the name of the president of nigeria?","what is the name of your state governor?"};
    static String answers [] = {"Buhari","Aminu"};
    static Random myRandom = new Random();
    static Scanner myInput = new Scanner(System.in);
    int userchoice;
    static String answer;
    
        public static void main (String [] args){
            int userchoice = myRandom.nextInt(2);
            if(userchoice > 0)
            {
                System.out.println("question[userchoice]");
                answers = myInput.next();
            }
            if (answers.equals(answers[userchoice]))
            {
                System.out.println("correct");
            }
            else
                System.out.println("incorrect");
                
                
                
            }
        }
    

