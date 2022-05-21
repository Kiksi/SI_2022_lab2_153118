package SI_lab2_153118;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SILab2Test {
    @Test
    public void test1() {
        assertEquals(SILab2.function(Arrays.asList("0", "#", "#", "#", "0", "#", "0", "0","#")), Arrays.asList("2", "#", "#", "#", "3", "#", "1", "1", "#"));  
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        assertEquals(SILab2.function(new ArrayList<String>()), new IllegalArgumentException("List length should be greater than 0"));
         
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        assertEquals(SILab2.function(Arrays.asList("0", "#", "#", "#", "0", "#", "0", "0")), new IllegalArgumentException("List length should be a perfect square"));
         
    }
}
