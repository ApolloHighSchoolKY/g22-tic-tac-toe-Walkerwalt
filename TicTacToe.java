//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];

		for(int r = 0; r < mat.length; r++)
		{
			for (int c = 0; c < mat[r].length; c++)
			{
				mat[r][c] = 'x';
			}
		}

	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];

		for(int r = 0; r < mat.length; r++)
		{
			for (int c = 0; c < mat[r].length; c++)
			{
				mat[r][c] = game.charAt(c + r * 3);
			}
		}



	}

	public String getWinner()
	{
		//Check for horizontal wins
		if (mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2])
			return "Horizontal win " + mat[0][0];
		else if (mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2])
			return "Horizontal win " + mat[1][0];
		else if (mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2])
			return "Horizontal win " + mat[2][0];
		//Check for vertical wins
		else if (mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0])
			return "Vertical win " + mat[0][0];
		else if (mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1])
			return "Vertical win " + mat[0][1];
		else if (mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2])
			return "Vertical win " + mat[0][2];
		//Check for diagonal wins
		else if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
			return "Diagonal win " + mat[1][1];
		else if (mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2])
			return "Diagonal win " + mat[1][1];
		else
			return "Cat's game, Tie.";
	}

	public String toString()
	{
		String output="";

		for(int r = 0; r < mat.length; r++)
		{
			for (int c = 0; c < mat[r].length; c++)
			{
				output += mat[r][c] + " ";
				
				if (c==2)
					output += "\n";
			}
		}

		return output + getWinner() + "\n\n";
	}

}
