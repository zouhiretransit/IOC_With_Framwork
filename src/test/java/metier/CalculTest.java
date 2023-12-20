package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=150;
        double b=50;
        double expected=200;
        double res= calcul.somme(a,b);
        Assert.assertTrue(res==expected);


    }
}
