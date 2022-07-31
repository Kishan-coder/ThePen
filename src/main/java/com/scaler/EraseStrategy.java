package com.scaler;

//only refill pens can be erased!
//Gel Pens writes can only be erased by rubber
//Ball Pens writes can only be erased by fluid
public interface EraseStrategy {
    void erase();
}
