package beerData.dao;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import com.prominteotech.Beer;

public class BeerOptional {

  public static void main(String[] args) {
     anotherBeerMethod();   

  }

  private static void anotherBeerMethod() {
    Beer beer = beerMethod(Optional.of(new Beer("McMenamins", "A Beer Called Death", 27, "Stout")));
    System.out.println(beer);
    try {
      beerMethod(Optional.empty());
    } catch (NoSuchElementException e) {
      System.out.println((e.getMessage()));
    }
    
  }

  public static Beer beerMethod(Optional<Beer> optionalBeer) {
    return optionalBeer.orElseThrow(() -> new NoSuchElementException("No Beer for You!"));
      }
  

}
