package javatests.com.foo;

import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FooTest {

  @Test
  public void assertThrowsTest() {
    assertThrows(IllegalArgumentException.class,
        () -> {
          throw new IllegalArgumentException("foo");
        });
  }

}
