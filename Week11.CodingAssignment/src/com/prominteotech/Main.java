package com.prominteotech;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Beer> lambdaSort = BeerSort.sortBeer();
    List<Beer> methodSort = BeerSort.sortMethodReference();
    
    
    System.out.println(lambdaSort);
    System.out.println(methodSort); 
  }
}
