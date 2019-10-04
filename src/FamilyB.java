public class FamilyB implements Family {

    @Override
    public int money(int hours) {
        if (hours < PaidHours.tenPm()) {
            return 12;
        }else if (hours < PaidHours.twelveAm()) {
            return 8;
        } else {
            return 16;
        }
    }
}
