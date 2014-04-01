package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        String lastName = null;
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        try{
        lastName = nameService.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        }catch(CustomException ce){
            JOptionPane.showMessageDialog(null, ce.getMessage());
        }
        
        
    }
     
}
