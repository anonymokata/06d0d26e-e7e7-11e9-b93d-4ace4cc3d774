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

    @Test
    public void whenBabysitterWorksFivePmToElevenPmForFamilyANinetyDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.elevenPm());
        family = new FamilyA();
        assertEquals(90, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksElevenPmToFourAmForFamilyAOneHundredDollars() {
        babySitter = new BabySitter(PaidHours.elevenPm(), PaidHours.fourAm());
        family = new FamilyA();
        assertEquals(100, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksFivePmToFourAmForFamilyAOneHundredAndNinetyDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.fourAm());
        family = new FamilyA();
        assertEquals(190, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksEightPmToOneAmForFamilyAEightyFiveDollars() {
        babySitter = new BabySitter(PaidHours.eightPm(), PaidHours.oneAm());
        family = new FamilyA();
        assertEquals(85, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksFivePmToFivePmForFamilyBZeroDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.fivePm());
        family = new FamilyB();
        assertEquals(0, babySitter.total(family));
    }
}
