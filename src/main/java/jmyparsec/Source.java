package jmyparsec;

public class Source {

  private final String s;
  private int pos;

  public Source(String s) {
    this.s = s;
  }

  public final char peek() {
    return s.charAt(pos);
  }

  public final void next() {
    ++pos;
  }

}
