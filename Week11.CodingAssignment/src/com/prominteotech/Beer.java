package com.prominteotech;

public class Beer {
  
  private final String brewery;
  private final String name;
  private final int ibu;
  private final String style;
 
  public Beer(String brewery, String name, int ibu, String style) {
    this.brewery = brewery;
    this.name = name;
    this.ibu = ibu;
    this.style = style;    
  }

   public String toString() {
   return brewery + " " + name +", " + ibu + ", " + style; 
  }
  
  public static int compareBeer(Beer b1, Beer b2) {
    return b1.style.compareTo(b2.style);
  }
  
  public String getBrewery() {
    return brewery;
  }

  public String getName() {
    return name;
  }

  public float getIbu() {
    return ibu;
  }

  public String getStyle() {
    return style;
  }
  
  

}
