package week9.library;

import java.util.Date;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }
    public Rent getLongestRent() {
        Rent maxRent = rents[0];
        for (int i = 0; i < rents.length; i++) {
            Date currentDate = new Date(rents[i].getEnd().getTime() - rents[i].getBegin().getTime());
            Date maxDate = new Date(maxRent.getEnd().getTime() - maxRent.getBegin().getTime());
            if (currentDate.getTime() > maxDate.getTime()) {
                maxRent = rents[i];
            }
        }
        return maxRent;
    }
}
