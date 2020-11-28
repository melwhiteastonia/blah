package StrategyDesign;

import java.util.List;
import java.util.Collections; 


public class Average2 implements AverageStrategy {
	
	
public int calculate(List<Integer> scores) throws EmptyListException {
		
	   
  	  
  	 
		
		
		
	if (scores.isEmpty()) {
			
			throw new EmptyListException(null); 
		}
			
		
	else {
		
		 int sum = 0; 
			
		    Collections.sort(scores);
		    scores.remove(0);
			scores.remove(1); 
			
		       for(int i=0; i < scores.size(); i++) {
		    	   
		    	   
		    	   
		    	   
		    	  sum += scores.get(i);
		    	  
		    	  
		    	   }
			
		
			
			
		return sum/scores.size(); 
			
		}
		
		
		
		
	
			
				
		
		
		
	}

}



