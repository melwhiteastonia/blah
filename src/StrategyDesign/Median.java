package StrategyDesign;

import java.util.Collections;
import java.util.List;

public class Median implements AverageStrategy {
	
	
	public int calculate(List<Integer> scores) throws EmptyListException {
		
		int median = 0; 
		int i = 0; 
		
		Collections.sort(scores);
		
		if (scores.size() % 2 == 0) {
			
			
			median += scores.size()/2;
			median -= 1; 
			
			
			
					
			 
		}
		
		else 
			
		{
		 median += 1;
		 median += scores.size()/2;
		 median -= 1; 
				 
		
			
		}
		
		
		
		
		
		return scores.get(median);
		
		
		
	}

}
