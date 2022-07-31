package com.scaler.pen;

import com.scaler.DigitalColor;

public class DigitalPen{

    public DigitalPen(DigitalColor dc) {
        this.dc = dc;
    }

    private DigitalColor dc;

    public void write() {
        System.out.println(String.format("I am writing with my %s coloured digital pen on my digital-slate.", dc.toString()));
    }

    public String getDigitalColor() {
        return dc.toString();
    }
}
