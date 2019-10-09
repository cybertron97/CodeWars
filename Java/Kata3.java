/* In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. For example: 5! = 5 * 4 * 3 * 2 * 1 = 120. By convention the value of 0! is 1.

Write a function to calculate factorial for a given input. If input is below 0 or above 12 throw an exception of type ArgumentOutOfRangeException (C#) or IllegalArgumentException (Java) or RangeException (PHP) or throw a RangeError (JavaScript) or ValueError (Python).

More details about factorial can be found online.

*/
//Solution 
public class Factorial {
  public int factorial(int n) {
    if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
    return n <= 1 ? 1 : n * factorial(n - 1);
  }
}




/**************************************/



/***************************************/
//tests
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class FactorialTests {

  private Factorial fact;

  @Before
  public void initFactorial() {
    fact = new Factorial();
  }
  
  @After
  public void afterFactorial() {
    fact = null;
  }

  @Test
  public void test_factorial0() {
    assertEquals(1, fact.factorial(0));
  }
  
  @Test
  public void test_factorial3() {
    assertEquals(6, fact.factorial(3));
  }
  
  @Test
  public void test_factorial5() {
    assertEquals(120, fact.factorial(5));
  }
}




