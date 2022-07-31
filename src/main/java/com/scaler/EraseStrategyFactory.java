package com.scaler;

import com.scaler.pen.FountainPen;
import com.scaler.pen.Pen;
import com.scaler.pen.RefillPen;

public class EraseStrategyFactory {

    public static EraseStrategy getEraseStrategy(RefillType refillType) {
        if (refillType.equals(RefillType.gel))
            return new RubberEraseStrategy();
        if (refillType.equals(RefillType.ball))
            return new FluidEraseStrategy();
        return null;
    }

    // in future, people are erasing based on pen
    public static EraseStrategy getEraseStrategy(Pen pen) {
        if (pen instanceof RefillPen && ((RefillPen)pen).getRefill().getType().equals(RefillType.gel))
            return new RubberEraseStrategy();
        if ((pen instanceof RefillPen && ((RefillPen)pen).getRefill().getType().equals(RefillType.ball))
                || pen instanceof FountainPen)
            return new FluidEraseStrategy();
        return null;
    }
}
