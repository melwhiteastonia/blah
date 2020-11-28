package StrategyDesign;

import java.util.List;

public class AverageContext {
	
	
	private AverageStrategy strategy;
	
	
	
	public void setAverage( AverageStrategy strategy) {
		
		this.strategy = strategy; 
	}
	
	
	
	
	public int calculate(List<Integer> scores) throws EmptyListException{
		return strategy.calculate(scores); 
	}

}
