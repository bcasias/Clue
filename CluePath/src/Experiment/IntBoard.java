/* Names: Brendan Casias, Luke Dunekacke
 * 
 * This is the failing tests code
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
	
	public IntBoard() {
		adjMtx = new HashMap();
		visited = new boolean[HEIGHT * WIDTH];
		for(boolean b : visited)
			b = false;		
		calcAdjacencies();
	}

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
	
	public void startTargets(int location, int steps) {
		
		
	}
	
	public HashSet getTargets() {
		HashSet returnSet = new HashSet();
		return returnSet;
	}
	
	public LinkedList<Integer> getAdjList(int number) {
		
		return adjMtx.get(number);
	}
	
	public int calcIndex(int row, int column) {
		return column + row * HEIGHT;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
