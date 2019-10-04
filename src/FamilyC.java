public class FamilyC implements Family {

    @Override
    public int money(int hours){
        if(hours < PaidHours.ninePm()) {
            return 21;
        }else
            return 15;
    }
}
