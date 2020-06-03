import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumberTest {


  @Test
  public void PositiveprimeNumberTest() {
	  
	       
	        boolean result = PrimeNumber.primeNumber(5);
	        Assert.assertEquals(result, true);
			
  }
  @Test
  public void NegativeprimeNumberTest() {
	  
	       
	        boolean result = PrimeNumber.primeNumber(-5);
	        Assert.assertEquals(result, false);
			
  }
  
  }
  

