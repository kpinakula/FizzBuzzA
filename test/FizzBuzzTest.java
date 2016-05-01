import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void returnFizzIfDivisibleBy3(){
    Assert.assertEquals("3 should return fizz", "fizz", new FizzBuzz().play(3));
    Assert.assertEquals("6 should return fizz", "fizz", new FizzBuzz().play(6));
  }

  @Test
  public void returnBuzzIfDivisibleBy5() {
    Assert.assertEquals("5 should return buzz", "buzz", new FizzBuzz().play(5));
  }

  @Test
  public void returnFizzBuzzIfDivisibleBy15() {
    Assert.assertEquals("15 should return fizzbuzz", "fizzbuzz", new FizzBuzz().play(15));
  }

  @Test
  public void returnInputIfNotDivisibleBy3Or5() {
    Assert.assertEquals("7 should return 7", "7", new FizzBuzz().play(7));
  }
}