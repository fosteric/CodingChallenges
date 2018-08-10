package Challenge1Test;

import Challenge1.GoodWizard;
import org.junit.Test;

public class GoodWizardTest {

    @Test
    public void findMagicNumbersTest1000(){
        GoodWizard goodWizard = new GoodWizard();
        goodWizard.findMagicNumbers(100,1000);
    }

    @Test
    public void findMagicNumbersTest10000(){
        GoodWizard goodWizard = new GoodWizard();
        goodWizard.findMagicNumbers(100,10000);
    }

    @Test
    public void findMagicNumbersTest100000(){
        GoodWizard goodWizard = new GoodWizard();
        goodWizard.findMagicNumbers(100,100000);
    }

}
