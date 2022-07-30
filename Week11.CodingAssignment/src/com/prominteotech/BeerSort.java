package com.prominteotech;

import java.util.List;
import beerData.dao.BeerData;

public class BeerSort {
  private BeerData beerData = new BeerData();
  
  public static List<Beer> sortBeer() {
    List<Beer> beerList = BeerData.getBeer();
    beerList.sort((b1,b2) -> Beer.compareBeer(b1, b2));
    
    return beerList;
  }
  
  public static List<Beer> sortMethodReference() {
    
    List<Beer> beerList = BeerData.getBeer();
    beerList.sort(Beer::compareBeer);
    return beerList;
  }
}
