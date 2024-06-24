package Part1.IntroduceLocalExtension;

import java.util.Date;

public class DateHelperExtended extends  DateHelper {

    public static int getDaysDifference(Date startDate, Date endDate) {
        long difference = endDate.getTime() - startDate.getTime();
        return (int) (difference / (1000 * 60 * 60 * 24)); // Конвертація мілісекунд у дні
    }
}
