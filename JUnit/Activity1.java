import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    static ArrayList<String> list;

    @BeforeAll
    void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("alpha"); 
        list.add("beta");
    }

    @Test
    public void insertTest() {
        
        assertEquals(2, list.size(), "Wrong size");
        list.add(2, "charlie");
        assertEquals(3, list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
    }

    @Test
    public void replaceTest() {
    	assertEquals(2, list.size(), "Wrong size");
    	list.add(3, "Gamma");
        assertEquals(4, list.size(), "Wrong size");
        list.set(1, "charlie");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
    }
}