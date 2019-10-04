import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BabySitterTest {

    private BabySitter babySitter;
    private Family family;

    @Test
    public void whenBabysitterWorksFivePmToFivePmForFamilyAZeroDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.fivePm());
        family = new FamilyA();
        assertEquals(0, babySitter.total(family));
    }
}
