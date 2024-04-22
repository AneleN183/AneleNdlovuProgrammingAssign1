/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ndlovuaneleprogrammingassignment;

/**
 *
 * @author RC_Student_lab
 */
public class NdlovuAneleProgrammingAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
         ckage ndlovuaneleprogrammingassignment1;

import javax.swing.JOptionPane;
public class NdlovuAneleProgrammingAssignment1 {

   
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Welcome please enter in your details for your registration");
       String username = JOptionPane.showInputDialog("Enter your username:"); 
       String password = JOptionPane.showInputDialog("Enter your username");
       
       if (isValidUsername(username) && username.length() <=5) {
       JOptionPane.showMessageDialog(null, "Username successfully captured");
       
    } else {
       JOptionPane.showMessageDialog(null, "Username is not correctly formatted, " + "Please ensure that your username contains an underscore and is no more than 5 characters in length");
    }
       if (isValidPassword (password)) {
           JOptionPane.showMessageDialog(null, "Password successfully captured");
       } else { 
           JOptionPane.showMessageDialog(null, "Password is not correctly formatted," + " Please ensure that the password contains at least eight characters, a capital letter, a number and a special character");
       }
       JOptionPane.showMessageDialog(null, "Log in to your account using the same username and password");
       String usernameOfUser = JOptionPane.showInputDialog("Enter your username to be able to log in:");
       String passwordOfUser = JOptionPane.showInputDialog("Enter your password to be able to log in"); 
    }
    public static boolean checkUserName (String username){
    return username.contains("_");
    }
    public static boolean checkPasswordComplexity(String password) {
        //Check if password length is at least 6 characters
        boolean hasMinimumLength = password.length()>=8;
        
        //check if password contains at least one digit
        boolean hasUppercaseLetter = password.equals(password.toLowerCase);
        
        //check if password contains at least one digit
        boolean hasDigit = password.matches("[a-zA-Z0-9]*");
        
        //check if password contains at least one special character
        boolean hasSpecialCharacter = password.matches("[a-zA-Z0-9]*");
        
        //Return true if all conditions are met
        return hasMinimumLength && hasDigit && hasSpecialCharacter;
        
    }
    public static void login () {
        //Prompt user to enter login credentials
        String enteredUsername = JOptionPane.showInputDialog("Enter your username for login");
        String enteredPassword = JOptionPane.showInputDialog("Enter your password for login");
        
        //Check if entered credentials match the registered ones 
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) { 
            JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastSurname +", you have successfully logged in, it is");
        } else {
            JOptionPane.showMessageDialog(null, "Faled login, Username or password incorrect, please try again");
        }
    }
    public static boolean loginUser (String enteredUsername,String enteredPassword) {
        //Verify login details
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }
    public static void returnloginStatus(boolean loginSuccess){
    
} 


}
