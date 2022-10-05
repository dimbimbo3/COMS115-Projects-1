/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Dan
 */
public class PhoneBook {
    public static void main (String[] args){
        ArrayList<PhoneBookEntry> phonebook = new ArrayList<PhoneBookEntry>();
        phonebook.add(new PhoneBookEntry("Bob", "123-456-789"));
        phonebook.add(new PhoneBookEntry("Bill", "123-456-789"));
        phonebook.add(new PhoneBookEntry("Mike", "123-456-789"));
        phonebook.add(new PhoneBookEntry("Mitch", "123-456-789"));
        phonebook.add(new PhoneBookEntry("Dan", "123-456-789"));
        
        for(PhoneBookEntry pb: phonebook){
            System.out.println("Name:" + pb.getName() + " Number:" + pb.getNumber());
        }
    }
}
