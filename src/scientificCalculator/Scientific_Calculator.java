package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

import javax.swing.*;
import javax.swing.border.Border;

public class Scientific_Calculator implements ActionListener {
	
	JFrame frame;
	JTextField textfield1;
	JPanel panel;
	JButton numberButton[] = new JButton[10];
	JButton operatorButton[] = new JButton[10];
	JButton negButton,decimalButton,equaltoButton;
	JButton percentButton,clearButton,bracketButton;
	JButton addButton,subButton,mulButton,divButton,deleteButton;
	JButton Calculator_CollectionButton,advancedCalculatorButton;
	JRadioButton on,off; 
	JMenuBar bar;
	JMenu openMenu,helpMenu,aboutMenu;
	JMenuItem CCButton,advancedCalculator,exit,units,about,whatiswrong,info;
	ButtonGroup onoff;
	
	boolean isOperatorClicked = false;
	
	Font myfont1 = new Font("Ink Free",Font.PLAIN,30);
	Font myfont2 = new Font("Consolas",Font.BOLD,30);
	Font myfont3 = new Font("MV Bolo",Font.BOLD,12);
	
	Border border1 = BorderFactory.createLineBorder(Color.GREEN,3);
	double expression;
	char operator1;
	
	double num1=0,num2=0,result=0;
    char operator;
	
	
	Scientific_Calculator(){
		
		frame = new JFrame("Biniam's Scientific Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(560,670);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		bar = new JMenuBar();
		openMenu = new JMenu("Open");
		helpMenu = new JMenu("Help");
		aboutMenu = new JMenu("About");
		
		CCButton = new JMenuItem("Calculator_Collection");
		CCButton.addActionListener(this);
		CCButton.setEnabled(false);
		advancedCalculator = new JMenuItem("AdvancedCalculator");
		advancedCalculator.addActionListener(this);
		advancedCalculator.setEnabled(false);
		exit = new JMenuItem("EXIT");
		exit.addActionListener(this);
		about = new JMenuItem("about");
		about.addActionListener(this);
		units = new JMenuItem("Unit standards");
		units.addActionListener(this);
		info = new JMenuItem("Info");
		info.addActionListener(this);
		whatiswrong = new JMenuItem("What do you want?");
		whatiswrong.addActionListener(this);
		
		openMenu.add(units);
		openMenu.add(CCButton);
		openMenu.add(advancedCalculator);
		openMenu.add(exit);
		helpMenu.add(info);
		helpMenu.add(whatiswrong);
		aboutMenu.add(about);
		
		
		bar.add(openMenu);
		bar.add(helpMenu);
		bar.add(aboutMenu);
		
		
		textfield1 = new JTextField();
		textfield1.setBounds(60,20,440,80);
		textfield1.setEditable(false);
		textfield1.setFont(myfont2);
		textfield1.setHorizontalAlignment(JTextField.RIGHT);
		
		
		
		clearButton = new JButton("C");
		bracketButton = new JButton("()");
		percentButton = new JButton("%");
		negButton = new JButton("+/-");
		decimalButton = new JButton(".");
		equaltoButton = new JButton("=");
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		
		
		operatorButton[0] = addButton;
		operatorButton[1] = subButton;
		operatorButton[2] = mulButton;
		operatorButton[3] = divButton;
		operatorButton[4] = percentButton;
		operatorButton[5] = clearButton;
		operatorButton[6] = bracketButton;
		operatorButton[7] = negButton;
		operatorButton[8] = decimalButton;
		operatorButton[9] = equaltoButton;
		
		for(int i=0;i<=9;i++) {
			
			operatorButton[i].addActionListener(this);
			operatorButton[i].setFont(myfont2);
			operatorButton[i].setFocusable(false);
			operatorButton[i].setForeground(Color.GREEN);
			operatorButton[i].setBackground(Color.BLACK);
			operatorButton[i].setEnabled(false);
		}
		
		for(int i=0;i<10;i++) {
			
			numberButton[i] = new JButton(String.valueOf(i));
			numberButton[i].addActionListener(this);
			numberButton[i].setFocusable(false);
			numberButton[i].setFont(myfont1);
			numberButton[i].setForeground(Color.CYAN);
			numberButton[i].setBackground(Color.BLACK);
			numberButton[i].setEnabled(false);
		}
		
		deleteButton = new JButton("<--");
		deleteButton.setBounds(395,140,90,20);
		deleteButton.addActionListener(this);
		deleteButton.setFocusable(false);
		deleteButton.setFont(myfont2);
		deleteButton.setForeground(Color.GREEN);
		deleteButton.setBackground(Color.BLACK);
		deleteButton.setEnabled(false);
		
		
		
		Calculator_CollectionButton = new JButton("Calculator Collection");
	    Calculator_CollectionButton.addActionListener(this);
		Calculator_CollectionButton.setBounds(60,140,130,20);
		Calculator_CollectionButton.setFocusable(false);
		Calculator_CollectionButton.setFont(myfont3);
		Calculator_CollectionButton.setForeground(Color.GREEN);
		Calculator_CollectionButton.setBackground(Color.BLACK);
		Calculator_CollectionButton.setEnabled(false);
		
		
		advancedCalculatorButton = new JButton("Others");
		advancedCalculatorButton.setBounds(200,140,130,20);
		advancedCalculatorButton.addActionListener(this);
		advancedCalculatorButton.setFocusable(false);
		advancedCalculatorButton.setFont(myfont3);
		advancedCalculatorButton.setForeground(Color.GREEN);
		advancedCalculatorButton.setBackground(Color.BLACK);        
		advancedCalculatorButton.setEnabled(false);
		
		
		
		on = new JRadioButton();
		on.setFocusable(false);
		on.setText("ON");
		on.setForeground(Color.LIGHT_GRAY);
		on.setBackground(Color.BLACK);
		on.setBounds(60, 105, 60, 20);
		on.setFont(new Font("Consolas",Font.PLAIN,20));
		on.addActionListener(this);
	
		
		
		 
		off = new JRadioButton();
		off.setFocusable(false);
		off.setText("OFF");
		off.setForeground(Color.GREEN);
		off.setBackground(Color.BLACK);
		off.setBounds(120, 105, 60, 20);
		off.setFont(new Font("Consolas",Font.PLAIN,20));
		off.addActionListener(this);
		off.setSelected(true);
		
		onoff = new ButtonGroup();
		onoff.add(on);
		onoff.add(off);
		
		
	     
		panel = new JPanel();
		panel.setBounds(60,170,440,400);
		panel.setLayout(new GridLayout(5,4,5,5));
		
		panel.add(clearButton);
		panel.add(bracketButton);
		panel.add(percentButton);
		panel.add(divButton);
		panel.add(numberButton[7]);
		panel.add(numberButton[8]);
		panel.add(numberButton[9]);
		panel.add(mulButton);
		panel.add(numberButton[4]);
		panel.add(numberButton[5]);
		panel.add(numberButton[6]);
		panel.add(subButton);
		panel.add(numberButton[1]);
		panel.add(numberButton[2]);
		panel.add(numberButton[3]);
		panel.add(addButton);
		panel.add(negButton);
		panel.add(numberButton[0]);
		panel.add(decimalButton);
		panel.add(equaltoButton);
		
		 
		
		frame.setJMenuBar(bar);
		frame.add(advancedCalculatorButton);
		frame.add(Calculator_CollectionButton);
		frame.add(on);
		frame.add(off);
		frame.add(panel);
		frame.add(deleteButton);
		frame.add(textfield1);
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		 new Scientific_Calculator();
	        
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==on) {
			
			
			on.setForeground(Color.GREEN);
			off.setForeground(Color.LIGHT_GRAY);
			
			deleteButton.setEnabled(true);
			advancedCalculatorButton.setEnabled(true);
			Calculator_CollectionButton.setEnabled(true);
			CCButton.setEnabled(true);
			advancedCalculator.setEnabled(true);
			
			for(int i=0;i<numberButton.length;i++) {
				numberButton[i].setEnabled(true);
			}
			for(int i=0;i<operatorButton.length;i++) {
        		operatorButton[i].setEnabled(true);
        	}
			textfield1.setEnabled(true);
		
		}
        if (e.getSource()==off) {
        	
        	textfield1.setText(null);
        	on.setForeground(Color.LIGHT_GRAY);
        	off.setForeground(Color.GREEN);
        	
        	deleteButton.setEnabled(false);
        	advancedCalculatorButton.setEnabled(false);
  		    Calculator_CollectionButton.setEnabled(false);
  		    CCButton.setEnabled(false);
  		    advancedCalculator.setEnabled(false);
  		    
        	for(int i=0;i<numberButton.length;i++) {
        		numberButton[i].setEnabled(false);
        	}
        	for(int i=0;i<operatorButton.length;i++) {
        		operatorButton[i].setEnabled(false);
        	}
        	
        	textfield1.setEnabled(false);
	     }
		
		
		if (e.getSource()==advancedCalculatorButton) {
	    	   
			  frame.dispose();
	    	  new AdvancedCalculator();
	    	  
	    	  
				
			}
		if (e.getSource()==Calculator_CollectionButton) {
			
			    
			frame.dispose();
			new Calculator_Collection();
			
			}
		
		for(int i =0;i<numberButton.length;i++) {
			if(e.getSource()==numberButton[i]) {
				textfield1.setBackground(Color.WHITE);
				textfield1.setForeground(Color.BLACK);
				textfield1.setText(textfield1.getText().concat(String.valueOf(i)));
			}
			
		}
		
		if(e.getSource()==negButton) {
			
			double temp = Double.parseDouble(textfield1.getText());
			temp = temp*-1;
			textfield1.setText(String.valueOf(temp));
		}
		if(e.getSource()==decimalButton) {
			
			textfield1.setText(textfield1.getText().concat("."));
			
		}
		
		if(e.getSource()==deleteButton) {
			
			String deletedNumber = textfield1.getText();
			textfield1.setText("");
	        for(int i =0;i<deletedNumber.length()-1; i++) {
	        	textfield1.setText(textfield1.getText()+deletedNumber.charAt(i));
	        
		}
		
		}
	
		
       if(e.getSource()==clearButton) {
			textfield1.setText("");
		}
       
       if(e.getSource()==exit) {
    	   
    	  frame.setVisible(false);
    	   
       }
       if(e.getSource()==units) {
    	   
     	 JOptionPane.showMessageDialog(null,"All Units are in the Standared form","this is information",JOptionPane.INFORMATION_MESSAGE);
     	   
        }
       if(e.getSource()==CCButton ) {
    	   
    	  new Calculator_Collection();
    	  frame.setVisible(false);
       }
       if(e.getSource()==advancedCalculator ) {
    	   
     	  new AdvancedCalculator();
     	  frame.setVisible(false);
        }
       if(e.getSource()==about) {
    	   
       	 JOptionPane.showMessageDialog(null,"This Calculator is made by Biniam Shimeles Who is third year Computer Science student in Dilla unniversity!\n Biniam's Calculator has:\n I.Simple Arithemetic tools\n II.Scientific Calculator\n III.Unit Converter \n Hope this Calculator app is really helpfull to you and what can i say Enjoy!  ","About Biniam's Scientific Calculator",JOptionPane.INFORMATION_MESSAGE);
       	   
          }
       if(e.getSource()==info) {
    	   
    	   JOptionPane.showMessageDialog(null,"If you want to get more info about this app and other Biniam's application go to http//www.Biniam's Dream.com","Biniam's info",JOptionPane.INFORMATION_MESSAGE);  
    	   
       }
       if(e.getSource()==whatiswrong) {
    	   
    	   JOptionPane.showMessageDialog(null,"How can i help you?\n If you got trubble using this app go to official website!","What is wrong? ",JOptionPane.QUESTION_MESSAGE);  
    	   
       }
       if (e.getSource() == bracketButton) {
    	    String currentText = textfield1.getText();

    	    
    	    if (currentText.isEmpty() || currentText.endsWith("(")) {
    	       
    	        textfield1.setText(currentText + ")");
    	    } else if (currentText.endsWith(")")) {
    	      
    	        textfield1.setText("(" + currentText);
    	    } else {
    	     
    	        textfield1.setText("(" + currentText + ")");
    	    }
    	}


      
       
      if(e.getSource()==percentButton) {
    	  
    	  double number = Double.parseDouble(textfield1.getText());
    	  double num = number*1/100;
    	  
    	   textfield1.setText(String.valueOf(num));
       }
      if(e.getSource()==addButton) {
    	  num1 = Double.parseDouble(textfield1.getText());
	    	operator = '+';
	    	textfield1.setText("");
    	  
      }
      if(e.getSource()==subButton) {
    	  num1 = Double.parseDouble(textfield1.getText());
	    	operator = '-';
	    	textfield1.setText("");
      }
       if(e.getSource()==mulButton) {
    	   num1 = Double.parseDouble(textfield1.getText());
	    	operator = '*';
	    	textfield1.setText("");
      }
      if(e.getSource()==divButton) {
    	  num1 = Double.parseDouble(textfield1.getText());
	    	operator = '/';
	    	textfield1.setText("");
      }
      if(e.getSource()==equaltoButton) {
    	  num2 = Double.parseDouble(textfield1.getText());
	        
	        switch(operator) {
	        
	        case'+':
	        	result = num1 + num2 ;
	        	break;
	        case'-':
	        	result = num1 - num2 ;
	        	break;
	        case'*':
	        	result = num1 * num2 ;
	        	break;
	        case'/':
	        	result = num1 / num2 ;
	        	break; 
      
	}
	        textfield1.setText(String.valueOf(result));
		    	num1 = result;
		
	
       }
	
	}

}
	            

