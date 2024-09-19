import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {
    static ArrayList<String> list;

    @BeforeEach
    public void setUp(){
        // Initialize a new ArrayList
        list = new ArrayList<String>();

        // Add values to the list
        list.add("alpha"); // at index 0
        list.add("beta"); // at index 1
    }

    @Test
    public void insertTest(){
        assertEquals(2, list.size(), "Wrong Size");
        list.add(2, "Gamma");
        assertEquals(3, list.size(), "Wrong Size");

    }

    @Test
    public void replaceTest(){
        assertEquals(2, list.size(), "Wrong Size");
        list.set(1, "Fe");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("Fe", list.get(1), "Wrong element");
    }
}
