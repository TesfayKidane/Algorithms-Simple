/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mum.entrytest.ConsecutiveFactored;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tesfay
 */
public class TestConsecutiveFactored {
    
    public TestConsecutiveFactored() {
    }
    
    @Test
    public void testConsecutiveFactored(){
        ConsecutiveFactored consecutiveFactored = new ConsecutiveFactored();
        
        assertEquals(1, consecutiveFactored.isConsectiveFactored(24));
        assertEquals(0, consecutiveFactored.isConsectiveFactored(105));
        assertEquals(1, consecutiveFactored.isConsectiveFactored(90));
        assertEquals(0, consecutiveFactored.isConsectiveFactored(23));
        assertEquals(0, consecutiveFactored.isConsectiveFactored(15));
        assertEquals(0, consecutiveFactored.isConsectiveFactored(2));
        assertEquals(0, consecutiveFactored.isConsectiveFactored(0));
        assertEquals(0, consecutiveFactored.isConsectiveFactored(-12));
        assertEquals(0, consecutiveFactored.isConsectiveFactored(23));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(105));
        assertEquals(0, consecutiveFactored.isConsectiveFactored(Integer.MAX_VALUE));
    }
    
      @Test
    public void testConsecutiveFactored2(){
        ConsecutiveFactored consecutiveFactored = new ConsecutiveFactored();
        
        assertEquals(1, consecutiveFactored.isConsectiveFactored(24));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(105));
        assertEquals(1, consecutiveFactored.isConsectiveFactored2(90));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(23));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(15));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(2));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(0));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(-12));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(23));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(105));
        assertEquals(0, consecutiveFactored.isConsectiveFactored2(Integer.MAX_VALUE));
    }
}
