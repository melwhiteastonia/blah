package StrategyDesign;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestAverageStrategy {

	@Test
	public void testaverage1() throws EmptyListException {
		Average1 context = new Average1();
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6); 
		
		Assert.assertEquals(3, context.calculate(nums));
	}
	
	
	@Test
	public void testaverage2() throws EmptyListException {
		Average2 ctxt = new Average2();
		
		List<Integer> nums2 = new ArrayList<>();
		
		nums2.add(1);
		nums2.add(2);
		nums2.add(3);
		nums2.add(4);
		nums2.add(5);
		nums2.add(6); 
		
		Assert.assertEquals(4, ctxt.calculate(nums2));
	}
	
	
	@Test
	public void median() throws EmptyListException {
		Median ctxt = new Median();
		
		List<Integer> nums2 = new ArrayList<>();
		
		nums2.add(4);
		nums2.add(5);
		nums2.add(6);
		nums2.add(7);
		nums2.add(10);
		nums2.add(9); 
		
		Assert.assertEquals(6, ctxt.calculate(nums2));
		
		
		List<Integer> nums3 = new ArrayList<>();
		
		nums3.add(1);
		nums3.add(2);
		nums3.add(3);
		nums3.add(4);
		nums3.add(5);
		 
		
		Assert.assertEquals(3, ctxt.calculate(nums3));
		
		
		
	}
	
	
	
	@Test (expected = EmptyListException.class)
	  public void testException() throws Exception{
		AverageContext ctx = new AverageContext();
	   

	    List<Integer> empty = new ArrayList<>();
	    
	    ctx.calculate(empty);

	}

	private void assertEquals(int i, int calculate) {
		// TODO Auto-generated method stub
		
	}

}
