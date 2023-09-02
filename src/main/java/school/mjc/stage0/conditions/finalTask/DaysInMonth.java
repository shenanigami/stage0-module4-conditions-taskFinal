package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {

    public boolean isLeapYear(int year) {

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return true;
        else
            return false;
    }
    public void printDays(int year, int month) {

        if (month > 12 || month < 1 || year < 0) {
            System.out.println("invalid date");
            return;
        }

        if (month == 2) {
            if (isLeapYear(year))
                System.out.println(29);
            else
                System.out.println(28);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }
    }
}
