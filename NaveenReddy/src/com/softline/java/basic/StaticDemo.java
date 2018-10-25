package com.softline.java.basic;

class Emp{
	int eid ; 
	int salary ; 
	static String ceo ;
	
	static {
		ceo = "Veli7"; 
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", salary=" + salary + " Ceo =" + ceo + "]";
	}
	
}

public class StaticDemo {
	
    public static void main (String[] args) {
    
    	Emp emp1 = new Emp() ;
    	emp1.eid = 6 ; 
    	emp1.salary=4000 ; 
    	emp1.ceo = "Ali" ; 
    	 
    	
    	System.out.println(emp1);
    }
	 
	
	

}
