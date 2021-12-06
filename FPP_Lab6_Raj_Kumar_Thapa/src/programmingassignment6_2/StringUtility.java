package programmingassignment6_2;
import javax.swing.*;
import java.awt.event.*;

public class StringUtility {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("String Utility");
		
		// Line 1 ______________________________________________________________________________________________________
		int Line_01 = 30;
        int startP1 = 240;
        
        final JLabel lblInput = new JLabel("Input");
        lblInput.setBounds(startP1, Line_01, 150, 20);
        frame.add(lblInput);
        
        final JTextField txtInput = new JTextField();
        txtInput.setBounds(startP1, Line_01 + 20, 150, 20);
        //txtName.setText("");
        frame.add(txtInput);
        
        // Line 2 ______________________________________________________________________________________________________
        int Line_02 = 70;    
        
        final JLabel lblOutput = new JLabel("Output");
        lblOutput.setBounds(startP1, Line_02, 180, 20);
        frame.add(lblOutput);
        
        final JTextField txtOutput = new JTextField();      
        txtOutput.setBounds(startP1, Line_02 + 20, 150, 20);
        //txtStreet.setText("1000 N Street");
        frame.add(txtOutput);   
        
        // Line 1 ______________________________________________________________________________________________________
        Line_01 -= 10;
        
        JButton count_button = new JButton("Count Letters");    
        count_button.setBounds(50, Line_01, 170, 25);
        frame.add(count_button);    
        count_button.addActionListener(new ActionListener(){    
            public void actionPerformed(ActionEvent e){
				String input = txtInput.getText();
				Integer count = input.length();
				String output = count.toString();
				txtOutput.setText(output);
			}
        });
	    // Line 2 ______________________________________________________________________________________________________
        Line_02 -= 10;
        
        JButton reverse_button = new JButton("Reverse Letters");    
        reverse_button.setBounds(50, Line_02, 170, 25);
        frame.add(reverse_button);    
        reverse_button.addActionListener(new ActionListener(){    
            public void actionPerformed(ActionEvent e){
				String input = txtInput.getText();
				int length = input.length();	
				StringBuilder output = new StringBuilder();
				for(int i = length - 1; i >= 0; i--) {		
					output.append(input.charAt(i));
				}
				txtOutput.setText(output.toString());
			}
        });
     // Line 3 ______________________________________________________________________________________________________
        Line_02 += 40;
        
        JButton remove_dups_button = new JButton("Removing Duplicates");    
        remove_dups_button.setBounds(50, Line_02, 170, 25);
        frame.add(remove_dups_button);    
        remove_dups_button.addActionListener(new ActionListener(){    
            public void actionPerformed(ActionEvent e){
				char[] input = txtInput.getText().toCharArray();
				char[] resultArray = new char[input.length];
				StringBuilder output = new StringBuilder();
				for (int i = 0; i < input.length; i++) {
					if (!checkPresent(resultArray, input[i])) {
						resultArray[i] = input[i];	
						output.append(resultArray[i]);
					}
				}
				txtOutput.setText(output.toString());
			}
            public boolean checkPresent(char[] array, char value) {
        		for (char element : array) {
        			if (value == element) {
        				return true;
        			}
        		}
        		return false;
        	}
        });     
               
        frame.setSize(450, 200);
        frame.setLayout(null);
        frame.setVisible(true);
	}
}