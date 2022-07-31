package com.scaler.pen;

import com.scaler.Ink;
import com.scaler.InkColor;

public class FountainPen implements Pen {

    private Ink ink;

    public FountainPen(Ink ink) {
        this.ink = ink;
    }

    @Override
    public void write() {
        System.out.println(String.format("You're writing with %s fountain Pen on the paper.", ink.getInkColor()));
    }

    @Override
    public InkColor getInkColor() {
        return ink.getInkColor();
    }
}
