package programmingassignment6_1;
import javax.swing.*;
import java.awt.event.*;

public class AddressForm {

	  public static void main(String[] args) {
	        JFrame frame = new JFrame("Address Form");
	        
	        int startP1 = 10;
	        
	        final JLabel lblName = new JLabel("Name");
	        lblName.setBounds(startP1, 10, 150, 20);
	        frame.add(lblName);
	        
	        final JTextField txtName = new JTextField();
	        txtName.setBounds(startP1, 30, 150, 20);
	        txtName.setText("Dave Smith");
	        frame.add(txtName);
	        
	        // Line 1 ______________________________________________________________________________________________________
	        int Line_01=10;
	        
	        int startP2 = 200;
	        
	        final JLabel lblStreet = new JLabel("Street");
	        lblStreet.setBounds(startP2, Line_01, 150, 20);
	        frame.add(lblStreet);
	        
	        final JTextField txtStreet = new JTextField();      
	        txtStreet.setBounds(startP2, Line_01+20, 150, 20);
	        txtStreet.setText("1000 N Street");
	        frame.add(txtStreet);   
	        
	        int startP3 = 400;
	        final JLabel lblCity = new JLabel("City");
	        lblCity.setBounds(startP3, Line_01, 150, 20);
	        frame.add(lblCity);     
	        
	        final JTextField txtCity = new JTextField();
	        txtCity.setBounds(startP3, Line_01+20, 150, 20);
	        txtCity.setText("Fairfield");
	        frame.add(txtCity);

	        // Line 2 ______________________________________________________________________________________________________        
	        Line_01 += 60;
	        
	        startP2 = 90;
	        final JLabel lblState = new JLabel("State");
	        lblState.setBounds(startP2, Line_01, 150, 20);
	        frame.add(lblState);
	        
	        final JTextField txtState = new JTextField(); 
	        txtState.setBounds(startP2, Line_01+20, 150, 20);
	        txtState.setText("Iowa");
	        frame.add(txtState);
	        
	        startP2 = 350;
	        final JLabel lblZip=new JLabel("Zip");
	        lblZip.setBounds(startP2, Line_01, 150, 20);
	        frame.add(lblZip);
	        
	        final JTextField txtZip = new JTextField(); 
	        txtZip.setBounds(startP2, Line_01+20, 150, 20);
	        txtZip.setText("52557");
	        frame.add(txtZip);
	        
	        // Line 3 ______________________________________________________________________________________________________
	        Line_01 += 60;
	        
	        JButton click_button = new JButton("Submit");    
	        click_button.setBounds(240, Line_01, 75, 30);
	        frame.add(click_button);    
	        click_button.addActionListener(new ActionListener(){    
	            public void actionPerformed(ActionEvent e){
	                System.out.println(txtName.getText());
	                System.out.println(txtStreet.getText());
	                System.out.println(txtCity.getText() +", " + txtState.getText() + " " + txtZip.getText());
	            }
	        });
	               
	        frame.setSize(580, 210);
	        frame.setLayout(null);
	        frame.setVisible(true);
	    }
	}