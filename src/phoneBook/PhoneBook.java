package phoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
        private final List<PhoneMemory> phoneMemories = new ArrayList<>();
        public PhoneMemory addContact(String name, String phoneNumber) {
            PhoneMemory contact = new PhoneMemory(name, phoneNumber);
            phoneMemories.add(contact);
            System.out.println("contact added successfully");
            return contact;
        }

        public PhoneMemory findName(String name) {
            for (PhoneMemory phoneMemory : phoneMemories) {
                if(name.equals(phoneMemory.getName())) return phoneMemory;
            }
            return null;
        }
        public PhoneMemory findPhoneNumber(String phoneNumber) {
            for (PhoneMemory phoneMemory : phoneMemories) {
                if (phoneNumber.equals(phoneMemory.getPhoneNumber())) return phoneMemory;
            }
            return null;
        }
        public void deleteContactName(String name) {
            PhoneMemory foundContact = null;
            for (PhoneMemory deleteContact : phoneMemories) {
                if(name.equals(deleteContact.getName())) foundContact = deleteContact;
            }
            phoneMemories.remove(foundContact);
            System.out.println("contact deleted successfully");
        }

        public void deleteAllContacts(){
            phoneMemories.clear();
        }

        public void deleteContactPhoneNumber(String phoneNumber) {
            PhoneMemory foundContactNumber = null;
            for ( PhoneMemory deleteNumber : phoneMemories ){
                if(phoneNumber.equals(deleteNumber.getPhoneNumber()))foundContactNumber = deleteNumber;
            }
            phoneMemories.remove(foundContactNumber);
            System.out.println("contact deleted successfully");
        }

    }
