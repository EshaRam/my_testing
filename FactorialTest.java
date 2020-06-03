import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

  @Test
  public void positiveNonrecursiveTest() {
	  
	  int result = Factorial.nonrecursive(5);
	  Assert.assertEquals(result,120);
  }

  @Test
  public void recursiveTest() {
	  int result = Factorial.recursive(6);
	  Assert.assertEquals(result,720);
  }
}
