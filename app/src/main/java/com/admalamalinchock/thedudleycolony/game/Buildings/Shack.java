package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/19/15.
 */

import java.math.BigDecimal;        //importing the BigDecimal so java can handle hugely ridiculous numbers
public class Shack extends Building
{
  public final int ID = 1;

  public Shack()
  {
    super(new BigDecimal(200),new BigDecimal("1.1"),new BigDecimal("5"),"Shack",2,1);   //using the super constructor
  }
}
