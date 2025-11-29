import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void testBox(){
        Box<Integer> box1 = new Box<>(1,2,3);
        Box<Float> box2 = new Box<>(1f,2f,3f);
        assertEquals(0, box1.compare(box2));
    }

}