package StrategyDesign;

import java.util.List;

public class Average1 implements AverageStrategy {
	
	
	public int calculate(List<Integer> scores) throws EmptyListException {
		
		int sum = 0; 
		
		
		
		if (scores.isEmpty()) {
				
				throw new EmptyListException(null); 
			}
				
			
		else {
				
			       for(int i=0; i < scores.size(); i++) {
			    	   
			    	  sum += scores.get(i);
			       }
				
				
				
			return sum/scores.size(); 	
				
			}
			
			
			
				
		
		
		
	}

}
