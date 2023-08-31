package CheckOutApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
        private  Item item;
        @BeforeEach
        public void beforeEach(){
            item = new Item("milo",2500,2);
        }
        @Test
    public  void total(){
            assertEquals(5000,item.getTotal());
        }


}