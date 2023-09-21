package makingDiff;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int yearOfBirth;
    private int dayOfBirth;
    private double targetMaximumRange1;
    private double targetMaximumRange2;

    public HeartRate(String firstName, String lastName, int monthOfBirth, int yearOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }
    public  int calculateAge(){
        int constant = 2023;
        return constant - yearOfBirth;
    }

    public double maximumHeartRate() {
        int minute = 220;
        int maximumHeart;
        maximumHeart = minute - calculateAge();
        return maximumHeart;
    }
    public double TargetMaximumRate(int excercise) {
        double targetMaximumRange1 = 0;
        if (excercise == 50) {
            targetMaximumRange1 = maximumHeartRate() * 0.50;
        }
        if (excercise == 70) {
            targetMaximumRange1 = maximumHeartRate() * 0.70;
        }
        String theTarget =  String.format("%.2f", targetMaximumRange1);
        return Double.parseDouble(theTarget);
    }

    public double TargetMaximumRate2(int excercise2) {
        double targetMaximumRange2 = 0;
        if (excercise2 == 70) {
            targetMaximumRange2 = maximumHeartRate() * 0.70;
        }
        if (excercise2 == 85) {
            targetMaximumRange2 = maximumHeartRate() * 0.85;
        }
        String theTarget =  String.format("%.2f", targetMaximumRange2);
        return Double.parseDouble(theTarget);
    }

}
