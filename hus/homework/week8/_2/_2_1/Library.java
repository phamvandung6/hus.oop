package hus.homework.week8._2._2_1;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestRent = null;
        long longestDuration = 0;

        for (Rent rent : rents) {
            long duration = rent.getEnd().getTime() - rent.getBegin().getTime();
            if (duration > longestDuration) {
                longestRent = rent;
                longestDuration = duration;
            }
        }

        return longestRent;
    }
}