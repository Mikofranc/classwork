package CheckOutApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemsTest {
    private  Items items;
    @BeforeEach
    public void startWith(){
        items = new Items();
    }
    @Test
    public void testToCreate_Item(){
        items.addItem("milo",2500,2);
        assertEquals(1, items.size());
    }
    @Test
    public void testToCreateMultiple_Item(){
        items.addItem("milo",2500, 4);
        items.addItem("milo",2500, 1);
        assertEquals(2,items.size());
    }
//    @Test
//    public void testToShowItemId(){
//        items.addItem("pant", 3000,3);
//        items.addItem("milo",2500, 4);
//        items.addItem("milo",2500, 1);
//        assertSame("                               pant            3           3000                 9000.0", items.findById(1));
//    }
    @Test
    public void subTotalPrice(){
        items.addItem("milo",2500, 2);
        items.addItem("milo",2500, 1);
        assertEquals(7500,items.getTotalPrice());
    }
    @Test
    public void testToDisplayAllItems(){
        items.addItem("milo",2500, 2);
        items.addItem("Rice",200, 1);
        System.out.println(items.size());
    }
}