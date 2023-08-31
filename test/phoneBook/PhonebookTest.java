package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {
    Phonebook phonebook;
    @BeforeEach
    public void beforeEachTest(){
        phonebook = new Phonebook();
    }
    @Test
    public void testThatPhoneBookIsNotEmpty(){
        assertNotNull(phonebook);
    }
    @Test
    public void testThatContactCanBeAdded(){
        phonebook.addcontacts("micheal", "09011480776");
        phonebook.addcontacts("john", "1430990540");
        phonebook.amountOfContacts();
        assertEquals(2,phonebook.amountOfContacts());
    }
    @Test
    public  void testToGetSavedContactInformationByName(){
        phonebook.addcontacts("micheal", "09011490776");
        phonebook.addcontacts("micheal", "09011489776");
        phonebook.addcontacts("micheal", "09011480778");

        phonebook.searchForContactsByName("micheal");
//        assertEquals("micheal  09011480776", );
    }
    @Test
    public void testThatYouCanGetUserInfoByNumber(){
        phonebook.addcontacts("micheal", "09011480776");
        phonebook.searchForContactsByNumber("09011480776");
//        assertEquals("micheal  09011480776", z);
    }
    @Test
    public void testThatContactCanBeDeleted(){
        phonebook.addcontacts("micheal", "09011480776");
        phonebook.addcontacts("john", "1430990540");
        phonebook.deleteContact("john");
        int z = phonebook.amountOfContacts();
        assertEquals(1, z);
    }
    @Test
    public void makeCall(){
        phonebook.addcontacts("micheal", "09011480776");
        phonebook.callNumber("micheal");
        assertEquals( "Calling\n09011480776", phonebook.callNumber("micheal"));
    }
    @Test
    public void testThatContactsCanBeEdited(){
        phonebook.addcontacts("micheal", "09011480776");
        phonebook.editName("micheal", "john");
//        assertEquals("john  090114807);
    }
    @Test
    public void testToShowAllContacts(){
        phonebook.addcontacts("micheal", "09011480776");
        phonebook.addcontacts("john", "1430990540");
        phonebook.addcontacts("john", "1430990540");
        phonebook.displayAllContacts();
        int z =phonebook.amountOfContacts();
        assertEquals(3, z);
    }


}