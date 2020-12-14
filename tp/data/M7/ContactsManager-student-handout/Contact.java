/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar, Sridevi
 */

//  Your code goes here... For Contact class
class Contact{
    String name;
    String email;
    String phoneNumber;
    
    public Contact(String name, String email, String phoneNumber)
    {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String toString()
    {
        return "{ Name = "+this.getName()+", Email = "+this.getEmail()+", Phone Number = "+this.getPhoneNumber()+" }";
    }
}