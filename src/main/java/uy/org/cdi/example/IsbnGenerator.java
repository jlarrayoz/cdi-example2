package uy.org.cdi.example;

import java.util.Random;

public class IsbnGenerator implements NumberGenerator {

	  public String generateNumber() {
			return "13-84356-" + Math.abs(new Random().nextInt());
	  }
}