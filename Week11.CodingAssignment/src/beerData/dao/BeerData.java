package beerData.dao;

import java.util.ArrayList;
import java.util.List;
import com.prominteotech.Beer;

public class BeerData {
  
  private static List<Beer> beer = new ArrayList<Beer> (
    List.of(
        new Beer("McMenamins", "A Beer Called Death", 27, "Stout"), 
        new Beer("McMenamins", "Hi-Chew Chew Choose You", 5, "Sour"),
        new Beer("McMenamins", "Fluffy Cloud", 34, "IPA"), 
        new Beer("Paradise Creek Brewery", "MooJoo Coffee Milk Stout", 31, "Stout"),
        new Beer("Paradise Creek Brewery", "Huckleberry Pucker", 3, "Sour"),
        new Beer("Paradise Creek Brewery", "Over the Hop", 70, "IPA")));
  
  public static List<Beer> getBeer() {
    return beer;
  }
}

