package StrategyDesign;

import java.util.List;



public interface AverageStrategy {
	public int calculate(List<Integer> scores) throws EmptyListException;
}