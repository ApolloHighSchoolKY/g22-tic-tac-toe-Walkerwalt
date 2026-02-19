//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		//I don't know what to do with the five so i skipped it
		file.nextLine();

		while (file.hasNextLine())
		{
			//Test print
			//System.out.println(file.nextLine()); 
			
			TicTacToe game = new TicTacToe(file.nextLine());

			System.out.println(game);
		}

		/*Test array population 
		TicTacToe mine = new TicTacToe("XXOXOXXOO");

		System.out.println(mine);
		*/
		file.close();
	}
}



