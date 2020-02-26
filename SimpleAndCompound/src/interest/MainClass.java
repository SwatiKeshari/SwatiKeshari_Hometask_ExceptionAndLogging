package interest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {

	public static void main(String args[])
	 {
	  SimpleInterest s= new SimpleInterest();
	  int a= s.si(1000,15,20);

	  Logger logger= Logger.getLogger(MainClass.class.getName());

	  logger.log(Level.INFO,"The simple interest is "+a);

	  CompoundInterest c= new CompoundInterest();
	   c.ci(1000,15,10,6);

	  
	 }
}
