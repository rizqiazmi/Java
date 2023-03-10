package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormatIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        var indoensia = new Locale("id", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indoensia);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, japan);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormaParsetIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        var indoensia = new Locale("id", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indoensia);

        try {
            var date = dateFormat.parse("Minggu 05 Maret 2023");
            System.out.println(date);
        } catch (ParseException e) {
            throw new RuntimeException("Error parse : " + e.getMessage());
        }
    }


    @Test
    void testDateFormaParsetJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, japan);

        try {
            var date = dateFormat.parse("日曜日 05 3月 2023");
            System.out.println(date);
        } catch (ParseException e) {
            throw new RuntimeException("Error parse : " + e.getMessage());
        }
    }
}
