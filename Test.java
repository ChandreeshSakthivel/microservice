package com.wipro.java.microservices.solid;

class Test {
<<<<<<< Updated upstream
 
=======
	 
>>>>>>> Stashed changes
	  static void getAreaTest(Rectangle r) {
	      int width = r.getWidth();
	      r.setHeight(10);
	      System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
	  }
<<<<<<< Updated upstream
 
	  public static void main(String[] args) {
	      Rectangle rc = new Rectangle(2, 3);
	      getAreaTest(rc);
 
=======

	  public static void main(String[] args) {
	      Rectangle rc = new Rectangle(2, 3);
	      getAreaTest(rc);

>>>>>>> Stashed changes
	      Rectangle sq = new Square();
	      sq.setWidth(5);
	      getAreaTest(sq);
	  }
	}