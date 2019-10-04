public class BabySitter {

    int startTime;
    int endTime;

    public BabySitter(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int total(Family family) {
        int totalAmount = 0;

        for(int i = startTime; i < endTime; i++){
            totalAmount += family.money(i);
        }

        return totalAmount;
    }
}
