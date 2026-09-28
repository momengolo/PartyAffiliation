import java.util.Scanner;

public class Task3_partyAfil 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       String partyAfil = "";
       
        System.out.println("Enter your Party (D, R, I): ");
        partyAfil = in.nextLine();
        partyAfil = partyAfil.toUpperCase();
        
        // This whole section can be coded with cascaded if then else
        
        if (partyAfil.equals("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (partyAfil.equals("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (partyAfil.equals("I"))
        {
            System.out.println("You get an Anonymous Mask!");
        }
        else
        {
            System.out.println("Not sure what " + partyAfil + " is!");
        }
       
    }
    
}
