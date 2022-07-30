package beerData.stream;

import java.util.List;
import java.util.stream.Collectors;
import com.prominteotech.Beer;
import beerData.dao.BeerData;

public class BeerStream {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    BeerData beerMe = new BeerData();
    List<Beer> beer = beerMe.getBeer();
    String beerString = beer.stream()
        .map(String::valueOf)
        .sorted()
        .collect(Collectors.joining(","));
    System.out.println(beerString);
    }

}
