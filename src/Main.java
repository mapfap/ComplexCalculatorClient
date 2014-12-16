import java.rmi.RemoteException;

import ku.ske.calculator.Complex;
import ku.ske.calculator.ComplexCalculator;
import ku.ske.calculator.ComplexCalculatorProxy;

public class Main {
	
	public static void main(String[] args) {
//		System.out.println("a");
//		SwingUtilities.invokeLater(new Runnable() {
//		      @Override
//		      public void run() {
//		    	  for (int i = 0; i < 10000; i++) {		    		  
//		    		  System.out.println(i);
//		    	  }
//		      }
//		    });
//		System.out.println("b");
		
		ComplexCalculatorProxy proxy = new ComplexCalculatorProxy();
		ComplexCalculator cc = proxy.getComplexCalculator();
		try {
			Complex add = cc.add(new Complex(5,2), new Complex(2,2));
			System.out.println(add.getReal() + " + " + add.getImag() + "i");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
}
