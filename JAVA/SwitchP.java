public class SwitchP {
    public static void main(String args[]){
        int day = 3;
        String DayString ;
        switch(day){
            case 1: DayString = "Sunday";
                break;
            case 2: DayString = "Monday";
                break;
            case 3: DayString = "Tuesday";
                break;
            case 4: DayString = "Wednesday";
                break;
            case 5: DayString = "Thursday";
                break;
            case 6: DayString = "Friday";
                break;
            case 7: DayString = "Suturday";
                break;
            default: DayString = "Invalid Day";
                break;                            
        }
        System.out.println(DayString);
    }
}
