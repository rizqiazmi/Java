package programmer.zaman.now.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
@DisplayName("information test")
public class InformationTest {

    @Test
    @Tags({
            @Tag("one"),
            @Tag("two")
    })
    @DisplayName("this is test 1")
    void test1(TestInfo info) {
        System.out.println(info.getDisplayName());
        System.out.println(info.getTags());
        System.out.println(info.getTestClass().orElse(null));
        System.out.println(info.getTestMethod().orElse(null));
    }
}
