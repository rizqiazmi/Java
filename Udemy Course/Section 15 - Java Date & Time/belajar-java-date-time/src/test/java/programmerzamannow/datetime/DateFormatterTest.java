package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {

    @Test
    void parsing() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy MM dd");

        LocalDate localDate = LocalDate.parse("2023 03 01", formatter);
        System.out.println(localDate);

    }

    @Test
    void format() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy MM dd");

        LocalDate localDate = LocalDate.parse("2023 03 01", formatter);
        String format = localDate.format(formatter);

        System.out.println(format);

    }

    @Test
    void defaultFormatter() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy MM dd");

        LocalDate localDate = LocalDate.parse("2023 03 01", formatter);
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format);

    }

    @Test
    void i18n() {

        Locale locale = new Locale("in", "ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.of(2023, 3, 1);
        String format = localDate.format(formatter);

        System.out.println(format);
    }
}
