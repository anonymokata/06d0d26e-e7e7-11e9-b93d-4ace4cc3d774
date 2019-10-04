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

    @Test
    public void whenBabysitterWorksFivePmToTenPmForFamilyBSixtyDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.tenPm());
        family = new FamilyB();
        assertEquals(60, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksTenPmToTwelveAmForFamilyBSixteenDollars() {
        babySitter = new BabySitter(PaidHours.tenPm(), PaidHours.twelveAm());
        family = new FamilyB();
        assertEquals(16, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksTwelveAmToFourAmForFamilyBSixtyFourDollars() {
        babySitter = new BabySitter(PaidHours.twelveAm(), PaidHours.fourAm());
        family = new FamilyB();
        assertEquals(64, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksTenPmToTwoAmForFamilyBFortyEightDollars() {
        babySitter = new BabySitter(PaidHours.tenPm(), PaidHours.twoAm());
        family = new FamilyB();
        assertEquals(48, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksFivePmToFivePmForFamilyCZeroDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.fivePm());
        family = new FamilyC();
        assertEquals(0, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksFivePmToNinePmForFamilyCEightyFourDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.ninePm());
        family = new FamilyC();
        assertEquals(84, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksNinePmToFourAmForFamilyCOneHundredAndFiveDollars() {
        babySitter = new BabySitter(PaidHours.ninePm(), PaidHours.fourAm());
        family =  new FamilyC();
        assertEquals(105, babySitter.total(family));
    }
}
