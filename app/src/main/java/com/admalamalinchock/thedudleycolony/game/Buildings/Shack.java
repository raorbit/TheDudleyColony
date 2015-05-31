package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/19/15.
 */

import java.math.BigDecimal;        //importing the BigDecimal so java can handle hugely ridiculous numbers
public class Shack extends Building
{
  public final int ID = 1;
       //like the getPrice method but we can change this for different buildings later in the main class
  public Shack()
  {
    super(new BigDecimal(1),new BigDecimal("1.1"),new BigDecimal("5"),"Shack",2);
  }
}
