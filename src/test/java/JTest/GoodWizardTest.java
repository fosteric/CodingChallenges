package JTest;

import J.GoodWizard;
import org.junit.Test;

public class GoodWizardTest {

    @Test
    public void findMagicNumbersTest100(){
        GoodWizard goodWizard = new GoodWizard();
        goodWizard.findMagicNumbers(100,1000);
    }

    @Test
    public void findMagicNumbersTest1000(){
        GoodWizard goodWizard = new GoodWizard();
        goodWizard.findMagicNumbers(100,10000);
    }

}
