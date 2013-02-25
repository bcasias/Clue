/* Names: Brendan Casias, Luke Dunekacke
 * 
 * This is the IntBoard Class
 * 
 *  Here we are assuming that the board is a 4 by 4 square consisting of number 0 to 15
 *  
 */

package Experiment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class IntBoard {
	
	private Map<Integer, LinkedList<Integer>> adjMtx;
	private boolean[] visited;
	private static final int HEIGHT = 4;
	private static final int WIDTH = 4;
	
	// Resets all the varables to defult for tests
	public IntBoard() {
		adjMtx = new HashMap();
		visited = new boolean[HEIGHT * WIDTH];
		for(boolean b : visited)
			b = false;		
		calcAdjacencies();
	}

	// This calculates the adjacent squares at a given cell
	public void calcAdjacencies() {
		int[][] board = new int[HEIGHT][WIDTH];
		for(int i = 0; i < HEIGHT; i++)
		{
			for(int j = 0; j < WIDTH; j++)
			{
				LinkedList<Integer> temp = new LinkedList<Integer>();
				if(i - 1 >= 0)
					temp.add(calcIndex(i-1, j));
				if(i + 1 < WIDTH)
					temp.add(calcIndex(i + 1, j));
				if(j - 1 >= 0)
					temp.add(calcIndex(i, j-1));
				if(j + 1 < HEIGHT)
					temp.add(calcIndex(i, j+1));
				adjMtx.put(calcIndex(i,j), temp);
			}
		}
		
	}
	// Make a list of targets from a location on the board
	public void startTargets(int location, int steps) {
		
		
	}
	
	//returns a set of targets
	public HashSet getTargets() {
		HashSet returnSet = new HashSet();
		return returnSet;
	}
	
	// returns the adjacent board locations at a given position on the board
	public LinkedList<Integer> getAdjList(int number) {
		
		return adjMtx.get(number);
	}
	
	// returns the location of the row and column in a linear format
	public int calcIndex(int row, int column) {
		return column + row * HEIGHT;
	}

	// main function Empty for now
	public static void main(String[] args) {

	}

}
