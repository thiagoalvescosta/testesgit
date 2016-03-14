package com.example;

//oi thiago local 8fsdfdfadsadasd
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {
//Thiago
  private Greeter greeter;

  @Before
  public void setup() {
    //teste
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";
//Tete
    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
