package classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class Q3Test {
    @Nested
    class EdgeCoverage{
        Q3 x;
        @BeforeEach
        public void init(){
            x = new Q3();
        }
        @Test
        public void Edge_Coverage_test1(){
            String[] result = x.input('a');
            assertEquals("NORMAL", result[0]);
            assertEquals("DATE", result[1]);
            assertEquals("2001-5-27", result[2]);
            assertEquals("0:0", result[3]);
        }
        @Test
        public void Edge_Coverage_test2(){
            x.input('a');
            x.input('a');
            x.input('b');
            x.input('a');
            x.input('d');
            String[] res = x.input('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-5-27", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void Edge_Coverage_test3(){
            x.input('a');
            x.input('a');
            x.input('c');
            x.input('d');
            String[] res = x.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("DATE", res[1]);
            assertEquals("2001-5-27", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void Edge_Coverage_test4(){
            x.input('a');
            x.input('a');
            x.input('c');
            x.input('b');
            x.input('a');
            x.input('b');
            x.input('a');
            x.input('b');
            x.input('a');
            x.input('b');
            x.input('a');
            x.input('b');
            x.input('a');
            x.input('c');
            x.input('d');
            x.input('b');
            x.input('a');
            String[] res = x.input('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2002-6-28", res[2]);
            assertEquals("1:1", res[3]);
        }
    }
    @Nested
    class ADUP {
        Q3 x;

        @BeforeEach
        public void setup() {
            x = new Q3();
        }

        @Test
        public void ADUP_test1() {
            String[] res = x.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2001-5-27", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void ADUP_test2() {
            x.input('c');
            String[] res = x.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2001-5-27", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void ADUP_test3() {
            x.input('c');
            x.input('b'); // since m++ is def and use we will loop on each state from min to year
            x.input('b'); // from b to b
            x.input('a'); // from b to a
            String[] res = x.input('d'); // from a to d(will mak only 1 test case for this assuming hours is used)
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-5-27", res[2]);
            assertEquals("0:2", res[3]);
        }
        @Test
        public void ADUP_test4() {
            x.input('c');
            x.input('b'); // since m++ is def and use we will loop on each state from min to year
            x.input('b'); // from b to b
            x.input('a'); // from b to a
            x.input('b');
            x.input('b');
            x.input('a');
            x.input('b');
            String[] res = x.input('d'); // from b to d(will mak only 1 test case for this assuming days is used)
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-5-28", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void ADUP_test5() {
            x.input('c');
            x.input('b'); // since m++ is def and use we will loop on each state from min to year
            x.input('b'); // from b to b
            x.input('a'); // from b to a
            x.input('b');
            x.input('b');
            x.input('a');
            x.input('b');
            x.input('b');
            x.input('a');
            x.input('b');
            x.input('b');
            x.input('a');
            x.input('b');
            String[] res = x.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2003-7-29", res[2]);
            assertEquals("2:2", res[3]);
        }
    }
}
