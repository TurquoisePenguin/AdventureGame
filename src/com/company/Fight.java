package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Fight {
    PlayerCharacter mainCharacter;  //taken through constructor //Player Character that is fighting
    EnemyClass[] enemies;   //taken through constructor, expected to change as needed   //enemy or enemies that are fighting PC
    static String[] mainActions = {"Attack", "Skills", "Item", "Run"}; //First level options for fighting, may change as needed?

    public Fight(PlayerCharacter mainCharacter, EnemyClass[] enemies) {
        this.mainCharacter = mainCharacter;
        this.enemies = enemies;
    }

    //returns true if still alive
    public boolean fighting(){
        boolean fighting = true;
        while (fighting){

            String playerAction = "";

            //print characters and status
            System.out.println(mainCharacter.getPlayerName());
            System.out.println("HP: " + mainCharacter.getCurHP() + "/ " + mainCharacter.getMaxHP() + "\n");

            /*for (int i=0; i<enemies.length; i++)
            {
                System.out.println(enemies[i].getName());
                System.out.println("HP: " + enemies[i].getHP() + "/ " + enemies[i].getMaxHP());
            }*/
            printEnemies(enemies);

            //choose action
            playerAction = selectAction(mainActions);
            if (playerAction.equalsIgnoreCase("Attack"))
            {
                //select target
                //Attack
                // (Player Attack)/(Enemy Defense)
            }
            if (playerAction.equalsIgnoreCase("Skills"))
            {
                //select skill
                //select target
                //Skills
            }
            if (playerAction.equalsIgnoreCase("Items"))
            {
                //select item
                //?select target
                //Items
            }
            if (playerAction.equalsIgnoreCase("Runs"))
            {
                //Run
            }


            fighting=false;
        }
        return true;
    }

    /*//helper method for printing available actions
    private static void printSelection(){
        System.out.println(Arrays.toString(mainActions));
        System.out.print("What would you like to do: ");
        //System.out.println("Attack\tSkills\tItem\tRun");
    }*/

    //Format and print enemies
    private void printEnemies(EnemyClass[] enemies)
    {
        String enemyNames = "";
        String enemyHPs = "";
        for (int i=0; i<enemies.length; i++)    //DONE: Clean up print format
        {
            if (enemies[i].getHP()>0)       //make sure enemy isn't dead    //BROKEN
            {
                if ((i+1)<enemies.length)   //before the last enemy, tab
                {
                    enemyNames += enemies[i].getName() + i +"\t\t";
                    enemyHPs += "HP: " + enemies[i].getHP() + "/ " + enemies[i].getMaxHP() + "\t";
                } else        //no tab
                {
                    enemyNames += enemies[i].getName() +i;
                    enemyHPs += "HP: " + enemies[i].getHP() + "/ " + enemies[i].getMaxHP() + "\n";
                }
            }
        }
        System.out.println(enemyNames); //fix these with printf
        System.out.println(enemyHPs);
    }

    //Prints available actions and waits for user input
    //When user makes appropriate choice, returns string of action chosen
    //DONE: Make non-static. Vary actions taken to verify.
    private String selectAction(String[] actions){
        Scanner scan = new Scanner(System.in);
        boolean selected = false;
        String choice = "";

        //infinite loop to take selection
        do{
            System.out.println(Arrays.toString(actions));
            System.out.print("What would you like to do: ");
            //Read choice
            choice = scan.nextLine();

            /*TODO:
            store options in array      array:mainActions, array:skills, array:items, etc
use for loop to go through array to check if options are valid
if not, ask for input again
bonus: can use 1234
options[] = [Attack, Skills, Items, Run]
Skills[] = [Water Gun, Tackle, etc]
Items[][] = [Potions[2], Ethers[0], etc] - //show items>0
             */
            if (Arrays.asList(actions).contains(choice))    //validation
                return choice;
            else if (isInteger(choice))  //if choice is an integer
            {
                int intChoice = Integer.parseInt(choice);   //convert choice to int
                if (intChoice>0 && intChoice<=actions.length)   //choice is between 1 and # of choices eg 1-4
                {
                    return actions[intChoice-1];    //returns choice, eg 1=Attack, 2=Skills, etc
                }
            }
            else
                    System.out.println("Please select an appropriate action");

        } while (!selected);
        return choice;  //TODO: useless, awful
    }

    //Method to verify if string is integer
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    //Method to select target of skills/attacks.
    //Returns in of array of targets
    //TODO: unfinished
    private int selectTarget(EnemyClass[] enemies)
    {
        Scanner scan = new Scanner(System.in);
        String choice = ""; //temp choice variable

        boolean selected = false;
        while (!selected)
        {
            //Print targets
            printEnemies(enemies);

            //Prompt user
            System.out.print("Please select a target:");

            //Take input
            choice = scan.nextLine();

            //Validate
            //EX:   Started fight with Skel1, Skel2, Bat1, Bat2.
            //      Killed Skel2.
            //      Enemies remaining: Skel1, Bat1, Bat2
            //      Player selects 2, should return Bat1.

        }
        return 1;   //error
    }

    //returns number of living/active enemies
    private static int getActiveEnemies(EnemyClass[] enemies)
    {
        int count = 0;   //counts the number of enemies alive
        for (int i=0; i<enemies.length; i++)
        {
            if (enemies[i].getHP()>0)
            {
                count++;
            }
        }
        return count;
    }

    //TODO: Actually TODO: Take selected action, take target, perform appropriate action to target,
    // have enemies act (determine order of attacks), finalize or continue combat
}
