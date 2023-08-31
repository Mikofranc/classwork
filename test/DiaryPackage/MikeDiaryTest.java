package DiaryPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MikeDiaryTest {
    MikeDiary mikeDiary;
    @BeforeEach
    public void startWith(){
        mikeDiary = new MikeDiary("username", "password");
    }
    @Test
    public  void testThat_DiaryExist(){
        MikeDiary mikeDiary = new MikeDiary("username", "password");
        assertNotNull(mikeDiary);
    }
    @Test
    public void testThat_DiaryIsLocked(){
        mikeDiary.lockDiary();
        assertTrue(mikeDiary.isLocked());
    }
    @Test
    public void checkPasswordCorrect(){
//        boolean password =mikeDiary.checkPassword("password");
//        assertTrue(password);
    }
    @Test
    public void checkPassword_Is_InCorrect(){
//        boolean password =mikeDiary.checkPassword("passwod");
//        assertFalse(password);
    }
    @Test
    public  void userCanCreateEntry(){
        mikeDiary.createEntry("my Story", "loremmmmmmmmmm");
        mikeDiary.createEntry("my Story", "loremmmmmmmmmm");
        mikeDiary.createEntry("my Story", "loremmmmmmmmmm");
        int z = mikeDiary.sizeOfEntries();
        assertEquals(3, z);
    }
}