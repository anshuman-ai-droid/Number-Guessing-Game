import java.util.*;
class NumberGuessingGame
{
    void game()//Function to Check if the Number Inputted by the Player is Correct or Not
    {
        Scanner sc=new Scanner(System.in);
        //Taking a Random Number
        int no=(int)(Math.random()*101);
        int f=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter your guess : ");
            int guess=sc.nextInt();
            if(guess==no)
            {
                f=1;
                System.out.println("You Guessed the number correctly in "+(i)+" move(s)");
                break;
            }
            else if(guess>no)
            {
                System.out.println("Wrong Guess !");
                System.out.println("Guess is High");
                System.out.println((10-i)+" Move(s) Left");
            }
            else if(guess<no)
            {
                System.out.println("Wrong Guess !");
                System.out.println("Guess is Low");
                System.out.println((10-i)+" Move(s) Left");
            }
            else if((guess-no)>=1 && (guess-no)<=5)
            {
                System.out.println("Very Close!");
                System.out.println((10-i)+" Move(s) Left");
            }
            else if((guess-no)>=50)
            {
                System.out.println("Very Far!");
                System.out.println((10-i)+" Move(s) Left");
            }
            else
            {
                System.out.println("Wrong Guess !");
                System.out.println((10-i)+" Move(s) Left");
            }
            if(i==8 && f!=1)//Hinting the Player about their Guess on the 8th Move
            {
                if(no<=10)
                System.out.println("HINT: The number lies between (0-10)");
                else
                System.out.println("HINT: The number lies between ("+(no-10)+"-"+(no+15)+")"); 
            }
        }
    }
    void display()//To Display the Basic Rules of the Game
    {
        System.out.println("You have 5 tries to guess the number");
        System.out.println("The number could be any number between 0-100");
        System.out.println("Best of Luck!");
        System.out.println("*****************************************************");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        NumberGuessingGame obj=new NumberGuessingGame();//Creating an object of the Class
        obj.display();
        int ch;
        for(;;)//Infinite Loop to Enter the Choice of the Player
        {
            System.out.println("Enter \n1-Enter the game \n2-Exit");
            ch=sc.nextInt();
            if(ch==1)
            obj.game();
            else if(ch==2)
            {
                System.out.println("Thank You!");
                break;
            }
        }
    }
}