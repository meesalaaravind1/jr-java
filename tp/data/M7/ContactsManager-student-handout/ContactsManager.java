/**
 * This class maintains the contacts of your friends / relations / wellwishers
 * et.
 * 
 * The following are the opertaions that this ContactManager application can
 * perform.
 * 
 * You can create a contact of your choice. Creates a contact and keep this in
 * the ContactManager list. You can search for a contact by name Search for a
 * contact based on the name in the ContactManager list. You can search for a
 * contact by email. Search for a contact based on email in the ContactManager
 * list. You can delete a contact by name. Search for a contact based on name of
 * the contact and delete from the ContactManager list.
 * 
 * @author Siva Sankar
 */

class ContactsManager {

    /**
     * Define a variable myFriends which is an array that can hold the contacts of
     * your friends.
     */
    private Contact [] myFriends;

    /**
     * Define a variable friendsCount of type int maintain the number of contacts of
     * your friends.
     */
    private int friendsCount;

    /**
     * When the object of ContactManager is created, the constructor should
     * constrcut the object initialy with the following requirements.
     * 
     * 1. Initializes the friendsCount to 0 as there no contacts in the list. 2.
     * myFriends with array initial size of 500
     */

    public ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    /**
     * The addContact method takes in a parameter of type contact object and adds
     * this to the contact list.
     * 
     * @param contact, to be added.
     */
    public void addContact(Contact contact) {
        myFriends[friendsCount++] = contact;
    }

    /**
     * This method search for the contact based on the name of your friend and gives
     * the first occurance of the contact in your friends list.
     * 
     * @param searchName, the name of the contact to be searched in the friends
     *                    list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContact(String searchName) {
        int index = getIndex(searchName);

        if (index < 0)
            return null;
        return myFriends[index];
    }

    /**
     * This method search for the contact based on the email of your friend and
     * gives the first occurance of the contact in your friends list.
     * 
     * @param searchName, the email of the contact to be searched in the friends
     *                    list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContactByEmail(String email) {
        for(int i=0; i<friendsCount; i++) {
            if(myFriends[i].getEmail().equals(email)) {
                return myFriends[i];
            }
        }
        return null;
    }

    /**
     * This method deletes the contact based on the name of your friend and returns
     * true on success and false if failure in deleting the contact.
     * 
     * @param searchName, the name of the contact to be searched in the friends
     *                    list.
     * @return true if contact has been removed successfully and false otherwise.
     */
    public boolean deleteContact(String searchName) {
        int index = getIndex(searchName);

        if(index > -1) {
            for(int i = index; i<friendsCount; i++) {
                myFriends[i] = myFriends[i+1];
            }
            friendsCount -= 1;
            return true;
        }
        return false;
    }

    private int getIndex(String searchName) {
        for(int i=0; i<friendsCount; i++) {
            if(myFriends[i].getName().equals(searchName)) {
                return i;
            }
        }
        return -1;
    }
}