package JUnit;

import java.util.HashSet;
import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Experiment.IntBoard;

public class IntBoardTests {
	IntBoard board;
	
	public IntBoardTests() {
	}

	@Before
	public void intializeTestBoard() {
		board = new IntBoard();
	}
	
	@Test
	public void testCalcIndex() {
		//Assume a 4 by 4 board
		int b = board.calcIndex(0, 0);
		Assert.assertTrue(b == 0);
		b = board.calcIndex(1, 1);
		Assert.assertTrue(b == 5);
		b = board.calcIndex(1, 3);
		Assert.assertTrue(b == 7);
	}
	
	@Test
	public void testAdjacency0() {
		LinkedList testList = board.getAdjList(0);
		Assert.assertTrue(testList.contains(4));
		Assert.assertTrue(testList.contains(1));
		Assert.assertEquals(2, testList.size());
	}
	
	@Test
	public void testAdjacency15() {
		LinkedList testList = board.getAdjList(15);
		Assert.assertTrue(testList.contains(11));
		Assert.assertTrue(testList.contains(14));
		Assert.assertEquals(2, testList.size());
	}
	
	@Test
	public void testAdjacency7() {
		LinkedList testList = board.getAdjList(7);
		Assert.assertTrue(testList.contains(11));
		Assert.assertTrue(testList.contains(6));
		Assert.assertTrue(testList.contains(3));
		Assert.assertEquals(3, testList.size());
	}

	@Test
	public void testAdjacency8() {
		LinkedList testList = board.getAdjList(8);
		Assert.assertTrue(testList.contains(4));
		Assert.assertTrue(testList.contains(9));
		Assert.assertTrue(testList.contains(12));
		Assert.assertEquals(3, testList.size());
	}
	
	@Test
	public void testAdjacency10() {
		LinkedList testList = board.getAdjList(10);
		Assert.assertTrue(testList.contains(14));
		Assert.assertTrue(testList.contains(9));
		Assert.assertTrue(testList.contains(6));
		Assert.assertTrue(testList.contains(11));
		Assert.assertEquals(4, testList.size());
	}
	
	@Test
	public void testAdjacency5() {
		LinkedList testList = board.getAdjList(5);
		Assert.assertTrue(testList.contains(1));
		Assert.assertTrue(testList.contains(4));
		Assert.assertTrue(testList.contains(6));
		Assert.assertTrue(testList.contains(9));
		Assert.assertEquals(4, testList.size());
	}
	
	@Test
	public void testTargets0_3() {
		board.startTargets(0, 3);
		HashSet targets= board.getTargets();
		Assert.assertEquals(6, targets.size());
		Assert.assertTrue(targets.contains(12));
		Assert.assertTrue(targets.contains(9));
		Assert.assertTrue(targets.contains(1));
		Assert.assertTrue(targets.contains(6));
		Assert.assertTrue(targets.contains(3));
		Assert.assertTrue(targets.contains(4));
	}
	
	@Test
	public void testTargets1_4() {
		board.startTargets(1, 4);
		HashSet targets= board.getTargets();
		Assert.assertEquals(8, targets.size());
		Assert.assertTrue(targets.contains(12));
		Assert.assertTrue(targets.contains(9));
		Assert.assertTrue(targets.contains(6));
		Assert.assertTrue(targets.contains(3));
		Assert.assertTrue(targets.contains(4));
		Assert.assertTrue(targets.contains(14));
		Assert.assertTrue(targets.contains(7));
		Assert.assertTrue(targets.contains(1));
	}

	@Test
	public void testTargets15_1() {
		board.startTargets(15, 1);
		HashSet targets= board.getTargets();
		Assert.assertEquals(2, targets.size());
		Assert.assertTrue(targets.contains(14));
		Assert.assertTrue(targets.contains(11));
	}

	@Test
	public void testTargets4_2() {
		board.startTargets(4, 2);
		HashSet targets= board.getTargets();
		Assert.assertEquals(4, targets.size());
		Assert.assertTrue(targets.contains(1));
		Assert.assertTrue(targets.contains(9));
		Assert.assertTrue(targets.contains(12));
		Assert.assertTrue(targets.contains(6));
	}

	@Test
	public void testTargets9_5() {
		board.startTargets(9, 5);
		HashSet targets= board.getTargets();
		Assert.assertEquals(8, targets.size());
		Assert.assertTrue(targets.contains(0));
		Assert.assertTrue(targets.contains(8));
		Assert.assertTrue(targets.contains(5));
		Assert.assertTrue(targets.contains(13));
		Assert.assertTrue(targets.contains(2));
		Assert.assertTrue(targets.contains(10));
		Assert.assertTrue(targets.contains(7));
		Assert.assertTrue(targets.contains(15));
	}

	public void testTargets12_6() {
		board.startTargets(12, 6);
		HashSet targets= board.getTargets();
		Assert.assertEquals(7, targets.size());
		Assert.assertTrue(targets.contains(9));
		Assert.assertTrue(targets.contains(4));
		Assert.assertTrue(targets.contains(1));
		Assert.assertTrue(targets.contains(6));
		Assert.assertTrue(targets.contains(14));
		Assert.assertTrue(targets.contains(3));
		Assert.assertTrue(targets.contains(11));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
