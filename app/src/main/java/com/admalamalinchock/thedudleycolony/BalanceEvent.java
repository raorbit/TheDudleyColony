package com.admalamalinchock.thedudleycolony;

/**
 * Created by Raorbit on 6/6/2015.
 */
//This class is used for communication from an anonymous thread to tell the MainActivity that the balance has changed
public class BalanceEvent {
    //in order to preserve accuracy the BigDecimal holding the Balance is converted to a String and passed.
    public final String message;
    public BalanceEvent(String message) {
        this.message = message;
    }
}