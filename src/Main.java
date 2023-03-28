import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        LocalDate meinDate = LocalDate.of(1984, 02, 12);
        System.out.println("My birthday" + meinDate);
        System.out.println(LocalDate.now().equals(now));
        System.out.println(LocalTime.now());
        System.out.println("текущее время + 3 часа -" + LocalTime.now().plusHours(3));
        System.out.println("на неделю позже сегодняшней -" + LocalDate.now().minusWeeks(1));
        System.out.println("на год позже  сегодняшней -" + LocalDate.now().minusYears(1));
        System.out.println("на год раньше сегодняшней -" + LocalDate.now().plusYears(1));
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow -" + tomorrow);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("Yesterday -" + yesterday);
        System.out.println(tomorrow.compareTo(now));
        System.out.println(yesterday.compareTo(now));

    }


}
