package com.dunky.scopes;

/**
 * Created by Geoffrey Duncan Opiyo on 6/6/2023.
 */
public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }


}
