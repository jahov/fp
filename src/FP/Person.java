/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FP;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lycantrophe
 */
public class Person {
    
    private String username;
    private String firstname;
    private String surname;
    private String email;
    private String phoneNumber;
    
    private Queue<Object> notifications;
    
    
    public Person( String username, String firstname, String surname, String email, String phoneNumber ){
        
        this.username = username;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        
        notifications = new LinkedList<Object>();
    }
    
    
    
}
