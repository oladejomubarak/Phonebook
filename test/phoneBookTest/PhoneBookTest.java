package phoneBookTest;

import phoneBook.PhoneBook;
import phoneBook.PhoneMemory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions .*;

    public class PhoneBookTest {
        private PhoneBook phoneBook;

        @BeforeEach
        void alwaysDoThisFirst() {
            phoneBook = new PhoneBook();
        }

        @Test
        void testThatWeCanAddContactToPhoneBook() {
            phoneBook.addContact("Lekan", "0804 765 4320");
            PhoneMemory findContactName = phoneBook.findName("Lekan");
            assertEquals("Lekan", findContactName.getName());
            PhoneMemory findContactNumber = phoneBook.findPhoneNumber("0804 765 4320");
            assertEquals("0804 765 4320", findContactNumber.getPhoneNumber());
        }

        @Test
        void testThatContactCanBeDeletedFromPhoneBookWithName() {
            phoneBook.addContact("Mub", "081");
            phoneBook.addContact("Mub2", "080");
            phoneBook.deleteContactName("Mub2");
            var findContactName = phoneBook.findName("Mub2");
            assertNull(findContactName);
        }

        @Test
        void testThatContactCanBeDeletedFromPhoneBookWithPhoneNumber() {
            phoneBook.addContact("Mub", "081");
            phoneBook.deleteContactPhoneNumber("081");
            PhoneMemory findContactNumber = phoneBook.findPhoneNumber("081");
            assertNull(findContactNumber);
        }
        @Test
        void testThatAllContactsCanBeDeleted() {
            phoneBook.addContact("Mub", "081");
            phoneBook.addContact("Mub2", "080");
            phoneBook.deleteAllContacts();
            PhoneMemory find = phoneBook.findName("Mub2");
            assertNull(find);

        }

        @Test
        void testThatContactCanBeEditedByName() {

        }

    }

