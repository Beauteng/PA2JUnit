import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Collection;
import java.util.LinkedList;

//*********************************************************
//Code created on: 5/24/2019
//Code last edited on: 5/31/2019
//Code created by: Spencer Raymond
//Associated with: MSU CSCI-232
//Description: Testing program functions with JUnit to make
//sure the output is what we expect. For this project, we
//are testing a greedy algorithm using JUnit testing. I
//wrote the code for the greedy algorithm in a separate
//class and this class will be the tester. By initializing
//a new array and a goal amount, we create a list of what
//it would take to come to the goal amount using denominations
//of the values in the array. We start with the highest
//denomination possible first, working our way down to make
//sure we are using the smallest number of currency tokens
//as possible.
//*********************************************************

public class TestJunit {
	int arr[];
	int i;
	Collection<Integer> List = new LinkedList<>();

	@After
	public void reset() {
		int arr[] = null;
		List = null;
		i = 0;
	}
	
	@Test(expected = NullPointerException.class)
	public void testGreedy1() {
		int arr[] = {};
		i = 32;
		assertEquals(List, GreedyUtil.GreedyUtil(arr, i));
	}
	
	@Test(expected = NullPointerException.class)
	public void testGreedy2() {
		int arr[] = {1,5,10,25,50};
		i = -1;
		assertEquals(List, GreedyUtil.GreedyUtil(arr, i));
	}
	
	@Test
	public void testGreedy3() {
		int arr[] = {1,5,10,25,50};
		i = 42;
		List.add(25);
		List.add(10);
		List.add(5);
		List.add(1);
		List.add(1);
		assertEquals(List, GreedyUtil.GreedyUtil(arr, i));
	}
	
	@Test
	public void testGreedy4() {
		int arr[] = {1,2,4,8,16,32,64};
		i = 73;
		List.add(64);
		List.add(8);
		List.add(1);
		assertEquals(List, GreedyUtil.GreedyUtil(arr, i));
	}
}
