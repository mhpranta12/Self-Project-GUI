package RegForm;

import java.awt.event.*;
import java.awt.font.*;
import javax.swing.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.*;
public class RegForm extends JFrame{
	
	

		JFrame frame; //declaring a variable of frame to display frame
		JLabel data,firsttimeerror,regf;
		JLabel fnameer,lnameer,emailerror,perror,dateerror,montherror,yearerror,genderer,depter;  //Variables of the error segment
		JLabel fname,lname,email,password,cpassword,data1,dob,dept,gender; //Variables of Label(Text) 
		JTextArea tadata; // Variables of textarea
		JPasswordField tpassword,tcpassword;
		JTextField tfname,tlname,temail,tdata2; //Variables of the textfields
		JButton submit,cancel;  //Variables of Buttons
		JComboBox daybox,monthbox,yearbox; //Variables of combobox
		ButtonGroup btngpdept,btngpgender;  // variables of button group
		JRadioButton male,female;
		String sfname,slname,semail,spassword,scpassword;  
		private String date[] 
				= {"date","1","2","3","4","5","6","7","8","9","10",
				"11","12","13","14","15","16","17","18","19",
				"20","21","22","23","24","25","26","27","28","29",
				"30","31"};
		
		 private String months[] 
		            = { "month","Jan", "Feb", "Mar", "Apr", 
		                "May", "Jun", "July", "Aug", 
		                "Sup", "Oct", "Nov", "Dec" }; 
		 
		 private String years[] 
		            = { "year","1995", "1996", "1997", "1998", 
		                "1999", "2000", "2001", "2002", 
		                "2003", "2004", "2005", "2006", 
		                "2007", "2008", "2009", "2010", 
		                "2011", "2012", "2013", "2014", 
		                "2015", "2016", "2017", "2018", 
		                "2019" }; 
		
		
		public RegForm()
		{
			frame = new JFrame("Registration Page"); //setting the frame & details to display 
			frame.setSize(1000, 700);
			
			frame.setLayout(null);
			frame.setLocationRelativeTo(null);
			frame.setBackground(Color.GREEN);
			frame.setForeground(Color.GREEN);
			frame.setVisible(true);
			
			
			regf=new JLabel("Farmer  Registration  Form");  // registration text in the top to display
			regf.setBounds(700,4,170,20);
			regf.setForeground(Color.GREEN);
			
			frame.add(regf);
			
		
			fname=new JLabel("First Name"); //text of first name
			fname.setBounds(10,30,120,20);
			fname.setForeground(Color.BLACK);
			
			frame.add(fname);
			
			tfname=new JTextField();
			tfname.setBounds(160,30,250,20);
			tfname.setVisible(true);
			frame.add(tfname);
			
			tfname.addFocusListener(new FocusListener () {
			public void focusGained(FocusEvent arg0)
			{
				
			}
			public void focusLost(FocusEvent arg0)
			{
				if(tfname.getText().equals(""))
				{
					fnameer.setVisible(true);    // set the first name error Label
					tfname.requestFocus(true);   //  to request to enter first name  in tffname 
					
					
				}
				else
				{
					fnameer.setVisible(false);  // hiding the error message when user entered
				}
			}
			}
			);
			
			
			lname=new JLabel ("Last Name");   //text of last name
			lname.setBounds(10, 60, 120, 20);
			frame.add(lname);
			
			tlname=new JTextField();         // text field to enter the last name
			tlname.setBounds(160, 60, 250, 20);
			frame.add(tlname);
			
			tlname.addFocusListener(new FocusListener () {
				public void focusGained(FocusEvent arg0)
				{
					
				}
				public void focusLost(FocusEvent arg0)
				{
					if(tlname.getText().equals("") )
					{
						lnameer.setVisible(true);
						if(tfname.getText().equals("")!=true)
						{
							tlname.requestFocus(true);
						}
						
					}
					else
					{
						lnameer.setVisible(false);
						
					}
					
				}
				}
				);
			email=new JLabel ("Email");  //Label of email
			email.setBounds(10, 90, 120, 20);
			frame.add(email);
			
			temail=new JTextField();   //  text field to enter the email
			temail.setBounds(160, 90, 250, 20);
			frame.add(temail);
			
			temail.addFocusListener(new FocusListener () {
				public void focusGained(FocusEvent arg0)
				{
					
				}
				public void focusLost(FocusEvent arg0)
				{
					if(temail.getText().equals("") )
					{
						emailerror.setVisible(true);
						if(tlname.getText().equals("")!=true)
						{
							temail.requestFocus(true);
						}
						
					}
					else
					{
						emailerror.setVisible(false);
						
					}
					
				}
				}
				);
			
			
			password=new JLabel ("Password"); 		//Label of password
			password.setBounds(10, 120, 120, 20);
			frame.add(password);
			
			
			tpassword=new JPasswordField();     //text field to enter the password
			tpassword.setBounds(160, 120, 250, 20);
			tpassword.setEchoChar('*');
			frame.add(tpassword);
			
			cpassword=new JLabel ("Confirm Password");	 	//text field to enter the confirm password
			cpassword.setBounds(10, 150, 120, 20);
			frame.add(cpassword);
			
			tcpassword=new JPasswordField();
			tcpassword.setBounds(160, 150, 250, 20);
			tcpassword.setEchoChar('*');
			frame.add(tcpassword);
			
			tcpassword.addFocusListener(new FocusListener()  // focus listener of confirm password field
					{
				public void focusGained(FocusEvent a)  //method of focus gained
				{
					
				}
				public void focusLost(FocusEvent a)  //method of focus lost
				{
					if (tpassword.getText().equals(tcpassword.getText())!=true)
					{
					perror.setVisible(true);
					if (temail.getText().equals("")!=true)
					{
						tcpassword.requestFocus(true);
					}
					}
					else
					{
						perror.setVisible(false);
					}
				}
					}
					);
			
			
			
			dob=new JLabel("Date of birth");
			dob.setBounds(10,210,300,20);
			frame.add(dob);
			
			daybox=new JComboBox<String>(date);  //Date combobox
			daybox.setBounds(160,220,300,20);
			frame.add(daybox);
			
			daybox.addFocusListener(new FocusListener()
			{
		public void focusGained(FocusEvent e)
		{
			
		}
		public void focusLost(FocusEvent e)
		{
			if(daybox.getSelectedItem().equals("date"))
			{
				dateerror.setVisible(true);
				if(tpassword.getText().equals(tcpassword.getText()))
				{
					daybox.requestFocus(true);
				}
			}
			else
			{
				dateerror.setVisible(false);
			}
		   }
			});
			
			monthbox=new JComboBox<String>(months);  //month combobox
			monthbox.setBounds(500,220,300,20);
			frame.add(monthbox);
			monthbox.addFocusListener(new FocusListener()     //focus listener of month
			{ 
		public void focusGained(FocusEvent e)
		{
			
		}
		public void focusLost(FocusEvent e)
		{
			if(monthbox.getSelectedItem().equals("month"))
			{
				montherror.setVisible(true);
				if(daybox.getSelectedItem().equals("date")!=true && tpassword.getText().equals(tcpassword.getText()))
				{
					monthbox.requestFocus(true);
				}
			}
			else
				
			{
				montherror.setVisible(false);
			}
		   }
			});
			
			yearbox=new JComboBox<String>(years);
			yearbox.setBounds(840,220,300,20);
			frame.add(yearbox);
			yearbox.addFocusListener(new FocusListener()
			{
		public void focusGained(FocusEvent e)
		{
			
		}
		public void focusLost(FocusEvent e)
		{
			if(yearbox.getSelectedItem().equals("year"))
			{
				yearerror.setVisible(true);
				if(monthbox.getSelectedItem().equals("month")!=true && tpassword.getText().equals(tcpassword.getText()))
				{
					yearbox.requestFocus(true);
				}
			}
			else
			{
				yearerror.setVisible(false);
			}
		}
			});
			
		   gender = new JLabel ("Gender");
		   gender.setBounds(840,255,300,20);
		   frame.add(gender);
		   
			male=new JRadioButton ("Male");
			male.setBounds(840,290,300,20);
			female=new JRadioButton ("Female");
			female.setBounds(840,330,300,20);
			btngpgender=new ButtonGroup();
			btngpgender.add(male);
			btngpgender.add(female);
			frame.add(male);
			frame.add(female);
			
			
			dept=new JLabel("Department");
			dept.setBounds(80,300,300,20);
			frame.add(dept);
			
		
			data1=new JLabel ("Your Data :");
			data1.setBounds(900, 380, 120, 20);
			data1.setForeground(Color.BLUE);
			frame.add(data1);
			
			tadata=new JTextArea(""); //data textfield
			tadata.setBounds(900, 420, 550, 220);
			frame.add(tadata);
			
			
			// the work of optional error button
			
						fnameer=new JLabel("First name can't be empty");  //first name error button to display
						fnameer.setBounds(450, 30, 300, 20);
						fnameer.setForeground(Color.RED);
						frame.add(fnameer);
						fnameer.setVisible(false);
						
						lnameer=new JLabel("Last name can't be empty"); //last name error button to display
						lnameer.setBounds(450,60,300,20);
						lnameer.setForeground(Color.RED);
						frame.add(lnameer);
						lnameer.setVisible(false);
						
						emailerror=new JLabel("You must enter email");   //email error button to display
						emailerror.setBounds(450,90,300,20);
						emailerror.setForeground(Color.RED);
						emailerror.setVisible(false);
						frame.add(emailerror);
						
						perror=new JLabel("Password and Confirm Password doesn't match");  //password error button to display
						perror.setBounds(450, 150, 300, 20);
						perror.setForeground(Color.RED);
						frame.add(perror);
						perror.setVisible(false);
						
						dateerror=new JLabel("Please select  date");   //date error button to display
						dateerror.setBounds(160,270,300,20);
						dateerror.setForeground(Color.RED);
						dateerror.setVisible(false);
						frame.add(dateerror);
						
						
						montherror=new JLabel("Please select  month");   //month error button to display
						montherror.setBounds(500,250,300,20);
					
						montherror.setForeground(Color.RED);
						montherror.setVisible(false);
						frame.add(montherror);
						
						yearerror=new JLabel("Please select  year");   //year error button to display
						yearerror.setBounds(840, 250, 300, 20);
						yearerror.setForeground(Color.RED);
						yearerror.setVisible(false);
						frame.add(yearerror);
						
						
						genderer=new JLabel("Please select gender");
					    genderer.setBounds(840,350,300,20);
					    genderer.setForeground(Color.RED);
					    frame.add(genderer);
			
			submit=new JButton("Submit ");
			submit.setBounds(160, 650, 85, 25);
			
			
			cancel=new JButton("Cancel");
			cancel.setBounds(300,650 ,85, 25);
			frame.add(cancel);
			
			
			
			
			cancel.addActionListener(new ActionListener()  //execution of cancel button
					{
				public void actionPerformed(ActionEvent e)
				{
					slname=(tlname.getText());
					semail=(temail.getText());
					tfname.setText("");
					tlname.setText("");
					temail.setText("");
					tpassword.setText("");
					tcpassword.setText("");
					daybox.setSelectedItem("date");
					monthbox.setSelectedItem("month");
					yearbox.setSelectedItem("year");
					tadata.setText("");
				
				}
					}
					);
			
			
			 submit.addActionListener(new ActionListener()  //execution of submit button
			 {
		         
		          public void actionPerformed(ActionEvent evt) {
		        	  tfname.getText();
		        	  if(tfname.getText().equals("") || tlname.getText().equals("")    ||
		        	    temail.getText().equals("")  || tpassword.getText().equals("") || 
		        		tcpassword.getText().equals(""))
		  			{
		  				JOptionPane.showMessageDialog(null,"Any Field Can't Be Empty","Error",JOptionPane.ERROR_MESSAGE);
		  			}
		        	  
		        		  else if(daybox.getSelectedItem().equals("date") || monthbox.getSelectedItem().equals("month")
		        				  || yearbox.getSelectedItem().equals("year"))
		        		  {
		        			  dateerror.setVisible(true);
		        			  montherror.setVisible(true);
		        			  yearerror.setVisible(true);
		        		  }
		        		  else if (male.isSelected()!=true ||male.isSelected()!=true)
		        		  {
		        			  genderer.setVisible(true);
		        		  }
		        		  else
		        		  {
		  			sfname=(tfname.getText());
					slname=(tlname.getText());
					semail=(temail.getText());
					spassword=(tpassword.getText());
					scpassword=(tcpassword.getText());
					daybox.getSelectedItem();
					btngpgender.getSelection().getActionCommand();
		             tadata.setText("Name : "+tfname.getText()+"\n "
		             		 +"Surname : "+tlname.getText()+   "    \n" 
				               +"Email : "+temail.getText()+   "    \n" 
				               +"Password: "+tpassword.getText()+"   \n"
				               +"Date of Birth : "+daybox.getSelectedItem()+"  " +monthbox.getSelectedItem()+"  " +yearbox.getSelectedItem()+"\n" 
				               +"Gender : "+ btngpgender.getSelection().getActionCommand()+"\n" 
		 					);
		             
		             JOptionPane.showMessageDialog(null, "Congrats U have been Registered ","Success",JOptionPane.PLAIN_MESSAGE);
		        		  }
		          }
		       });
		          
			frame.add(submit) ;   
		}		           
			
		

public static void main (String [] args)
{

	RegForm l=new RegForm();
	
}
}
