package test;

import java.util.HashMap;
import java.util.Map;

public class Dinner {

	Map<String, Integer> expensesType;
	
	public Dinner(){
		expensesType = new HashMap<>();
	}
	 public void addExpense(String type, int amount) {
		 expensesType.put(type, amount);
	    }
	 
	 public int getMealExpense() {
	        int mealExpense = 0;
	        if (expensesType.containsKey("dinner")) {
	            mealExpense += expensesType.get("dinner");
	        }
	        if (expensesType.containsKey("breakfast")) {
	            mealExpense += expensesType.get("breakfast");
	        }
	        return mealExpense;
	    }

	    // Calculate total expense
	    public int getTotalExpense() {
	        int total = 0;
	        for (int amount : expensesType.values()) {
	            total += amount;
	        }
	        return total;
	    }
	    public static void main(String[] args) {
	    	Dinner obj = new Dinner();
	        
	        // Adding expenses
	    	obj.addExpense("Dinner", 1000);
	    	obj.addExpense("breakfast", 2000);
	    	obj.addExpense("car rental", 3000);

	        // Output
	        System.out.println("meal expense = " + obj.getMealExpense());
	        System.out.println("Total Expense = " + obj.getTotalExpense());
	    }

}
