public class FamilyA implements Family {

    @Override
    public int money(int hours) {
        if(hours < PaidHours.elevenPm()) {
            return 15;
        }   else
            return 20;
    }
}
