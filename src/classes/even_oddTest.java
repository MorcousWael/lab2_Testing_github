package classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;


public class even_oddTest {
    @Nested
    class positive{
        @Test
        public void Zero(){
            String data = "0\n";
            System.setIn(new ByteArrayInputStream((data.getBytes())));
            assertEquals(even_odd.checkeven(),"Even");
        }
        @Test
        public void Odd(){
            String data = "1\n";
            System.setIn(new ByteArrayInputStream((data.getBytes())));
            assertEquals(even_odd.checkeven(),"Odd");
        }
        @Test
        public void even(){
            String data = "2\n";
            System.setIn(new ByteArrayInputStream((data.getBytes())));
            assertEquals(even_odd.checkeven(),"Even");
        }
    }
    @Nested
    class negative{
        @Test
        public void Odd(){
            String data = "-5\n";
            System.setIn(new ByteArrayInputStream((data.getBytes())));
            assertEquals(even_odd.checkeven(),"Odd");
        }
        @Test
        public void even(){
            String data = "-10\n";
            System.setIn(new ByteArrayInputStream((data.getBytes())));
            assertEquals(even_odd.checkeven(),"Even");
        }
    }

}