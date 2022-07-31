import com.scaler.*;
import com.scaler.pen.DigitalPen;
import com.scaler.pen.FountainPen;
import com.scaler.pen.Pen;
import com.scaler.pen.RefillPen;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//Extracting behaviors out of implementations/ models
// and having abstract strategy composed in parent class with different impl/ algos.
//refill pen write strategy

//<---Very Important--->
// one of the most common combination of patterns is
// STRATEGY + FACTORY
// here client doesn't know about your strategies just call the abstract method and
// the required behaviorable class implement the behavior by getting the strategy based on
// some parameter usually some type registered in the factory.
public class TestingPen {

    Pen pen;

    Nib nib;

    Ink ink;

    Refill refill;

    @Before
    public void setUp(){
        nib = new Nib(MaterialType.metal);
        refill = new Refill(nib);
    }

    @Test
    public void testBlackGelPen(){
        refill.setType(RefillType.gel);
        ink = new Ink(InkColor.black);
        refill.setInk(ink);
        pen = new RefillPen(refill);
        pen.write();
        Assert.assertEquals(InkColor.black, pen.getInkColor());
    }

    @Test
    public void testGreenBallPen(){
        refill.setType(RefillType.ball);
        ink = new Ink(InkColor.green);
        refill.setInk(ink);
        pen = new RefillPen(refill);
        pen.write();
        Assert.assertEquals(InkColor.green, pen.getInkColor());
        ((RefillPen)pen).erase();
    }

    @Test
    public void testBlueFountainPen(){
        ink = new Ink(InkColor.blue);
        pen = new FountainPen(ink);
        pen.write();
        Assert.assertEquals(InkColor.blue, pen.getInkColor());
    }

    @Test
    public void testDigitalPen(){
        DigitalPen digitalPen = new DigitalPen(new DigitalColor(100,2,222));
        digitalPen.write();
        Assert.assertTrue("Somethign went wrongg!!", digitalPen.getDigitalColor().contains("r=100"));
    }
}
