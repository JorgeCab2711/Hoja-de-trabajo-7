/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testss.testshd7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author GAMING
 */
public class VectorHeapTest {
    
    

    @Test
    public void testRemove() {
        VectorHeap<String> vh = new VectorHeap<String>();
        String expected = null;
        vh.add("SUCCESS");
        vh.remove();
        
        assertEquals(expected,vh.getFirst());
    }
    
    @Test
    public void testADD(){
        VectorHeap vh = new VectorHeap();
        String expected = "SUCCESS";
        vh.add("SUCCESS");
        assertEquals(expected,vh.getFirst());
        
    }
    
}
