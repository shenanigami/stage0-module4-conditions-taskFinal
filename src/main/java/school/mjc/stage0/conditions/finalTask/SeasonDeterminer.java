package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Wrong month number");
        } else if (monthNumber == 12 || monthNumber < 3) {
            System.out.println("Winter");
        } else if (monthNumber >= 9) {
            System.out.println("Autumn");
        } else if (monthNumber >= 6) {
            System.out.println("Summer");
        } else {
            System.out.println("Spring");
        }
    }
}
