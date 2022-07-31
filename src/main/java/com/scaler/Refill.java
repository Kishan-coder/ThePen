package com.scaler;

public class Refill {

    public Refill(Nib nib) {
        this.nib = nib;
    }

    private Nib nib;
    private Ink ink;
    private RefillType type;

    public Nib getNib() {
        return nib;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public RefillType getType() {
        return type;
    }

    public void setType(RefillType type) {
        this.type = type;
    }
}
