package lessonSecond;

/**
 * Created by Hillel8 on 26.11.2017.
 */
public class Switch {
    public static void main(String[] args){
        int x = 4;
        String dayString;

        switch (x)
        {
            case 1: dayString = "Monday";
            break;
            case 2: dayString = "Tuesday";
            break;
            case 3: dayString = "Wedneday";
            break;
            case 4: dayString = "Thursday";
            break;
            case 5: dayString = "Friday";
            break;
            case 6: dayString = "Saturday";
            break;
            case 7: dayString = "Sunday";
            break;
            default: dayString = "This day of week does not exist";
        }

        System.out.println(dayString);
    }
}
