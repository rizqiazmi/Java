package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocalTest {

    @Test
    void testNewLocal() {
        var languange = "en";
        var country = "US";
        var locale = new Locale(languange, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
