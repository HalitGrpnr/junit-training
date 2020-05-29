import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HamcrestTest {

    @Test
    public void testBasic(){

        String text1 = "Unit";
        String text2 = "Test";

        assertEquals("Unit", text1);

        assertThat(text2, is(equalTo("Test")));
        assertThat(text1, is(notNullValue()));
        assertThat(text1, containsString("nit"));
        assertThat(text1, anyOf(containsString("Un"), containsString("it")));
    }

    @Test
    public void testList(){
        List<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Trabzon", "Bursa"));

        assertThat(cities, hasItem("Trabzon"));
        assertThat(cities, hasItems("Istanbul", "Trabzon"));
        assertThat(cities, allOf(hasItems("Istanbul", "Bursa"), not(hasItem("Ankara"))));
        assertThat(cities, either(hasItems("Istanbul", "Trabzon")).or(not(hasItem("Ankara"))));
        assertThat(cities, either(hasItem("Izmir")).or(not(hasItem("Ankara"))));
    }

}
