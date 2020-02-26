package interest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CompoundInterest {
	
	 void ci(int p,int r,int t,int n)
		{
			double amount= p* Math.pow(1+(r/n), n*t);
			double b=(amount-p);
	                
	               Logger logger= Logger.getLogger(CompoundInterest.class.getName());
	               logger.log(Level.INFO,"The compound interest is "+b);
	         }

}
