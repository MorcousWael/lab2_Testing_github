package classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class min_maxTest {

        min_max x = new min_max();
        ArrayList<Integer> arr = new ArrayList<Integer>();

    @Nested
    class Max{
        @Test
        public void EMPTY(){
            assertEquals(x.max(arr), null);
        }
        @Test
        public void Only_one_elem(){
            arr.add(10);
            assertEquals(x.max(arr), 10);
        }
        @Test
        public void many_elem(){
            for (int i= 1;i<100;i++) {
                arr.add(i);
            }
            assertEquals(x.max(arr), 99);
        }
        @Test
        public void many_elem_comp_with_built_in(){
            for (int i= -1000;i<1000;i+=6) {
                arr.add(i);
            }
            assertEquals(x.max(arr), Collections.max(arr));
        }
        @AfterEach
        public void after(){
            arr.clear();
        }
    }
    @Nested
    class Min{
        @Test
        public void EMPTY(){
            assertEquals(x.min(arr), null);
        }
        @Test
        public void Only_one_elem(){
            arr.add(10);
            assertEquals(x.min(arr), 10);
        }
        @Test
        public void many_elem(){
            for (int i= 1;i<100;i++) {
                arr.add(i);
            }
            assertEquals(x.min(arr), 1);
        }
        @Test
        public void many_elem_comp_with_built_in(){
            for (int i= -1000;i<1000;i+=6) {
                arr.add(i);
            }
            assertEquals(x.min(arr), Collections.min(arr));
        }
        @AfterEach
        public void after(){
            arr.clear();
        }
    }
}
