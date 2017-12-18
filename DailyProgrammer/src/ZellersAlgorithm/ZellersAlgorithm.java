package ZellersAlgorithm;

public class ZellersAlgorithm {

    /**
     * returns the day of the week from a date
     * @param year int
     * @param month int
     * @param day int
     * @return day of week
     */
    public String ZellersAlgorithm(int year, int month, int day){
        if(month == 1){
            month = 13;
            year--;
        }
        if(month == 2) {
            month = 14;
            year--;
        }

        int dayOfMonth = day;
        int monthOfYear = month;
        int yearOfCentury = year % 100;
        int zeroBasedYear = year / 100;
        int dayOfWeek = (int)(dayOfMonth + Math.floor(13*(monthOfYear+1)/5) + yearOfCentury + Math.floor(yearOfCentury/4) + Math.floor(zeroBasedYear/4) + 5*zeroBasedYear);
        dayOfWeek = dayOfWeek % 7;
        String finalDay = "";
        switch(dayOfWeek){
            case 0: finalDay = "Saturday";
            case 1: finalDay = "Sunday";
            case 2: finalDay = "Monday";
            case 3: finalDay = "Tuesday";
            case 4: finalDay = "Wednessday";
            case 5: finalDay = "Thursday";
            case 6: finalDay = "Friday";
        }
        return finalDay;
    }

}
