package com.scaler.pen;

import com.scaler.*;

public class RefillPen implements Pen, Erasable {
    public RefillPen(Refill refill) {
        this.refill = refill;
    }

    public Refill getRefill() {
        return refill;
    }

    private Refill refill;

    @Override
    public void write() {
        System.out.println(String.format("A %s refill pen with %s nib point is scribbling the paper with %s colour.",
                refill.getType(), refill.getNib().getMaterialType(), refill.getInk().getInkColor()));
    }

    @Override
    public InkColor getInkColor() {
        return refill.getInk().getInkColor();
    }

    @Override
    public void erase() {
        //---the old way---
        // EraseStrategyFactory.getEraseStrategy(refill.getType()).erase();
        EraseStrategyFactory.getEraseStrategy(this).erase();
    }


}
