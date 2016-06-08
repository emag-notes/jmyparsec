package jmyparsec;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserCombinatorTest {

  static char anyChar(Source s) {
    char ret = s.peek();
    s.next();
    return ret;
  }

  @Test
  public void test() throws Exception {
    Source s = new Source("abc");

    assertThat(anyChar(s)).isEqualTo('a');
    assertThat(anyChar(s)).isEqualTo('b');
  }

}
