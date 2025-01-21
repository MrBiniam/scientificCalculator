package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class NumberSystemConverter implements ActionListener{
	JFrame frame;
	JMenu back,goTo,binary,octal,decimal,hexa,reset,exit;
	JMenuItem btm,gtavc,gttc,gtgpac,gtbmi,gtuc,resetMI,exitMI;
	JMenuItem binaryToOctal,binaryToDecimal,binaryToHexa,octalToBinary,octalToDecimal,octalToHexa,decimalToBinary,decimalToOctal,decimalToHexa,hexaToBinary,hexaToOctal,hexaToDecimal;
	JMenuItem item[] = new JMenuItem[20];
	JMenuBar bar;
	JPanel panel;
	ImageIcon icon;
	
	JLabel label;
	
	JLabel title,text,answer;
	JTextField textTF,answerTF;
	
	Border border1 = BorderFactory.createLineBorder(Color.GREEN,3);
    Border border2 = BorderFactory.createLineBorder(Color.CYAN,3);
    
    Font myfont1= new Font("MV Boli",Font.BOLD,30);
	Font myfont2= new Font("Consolas",Font.PLAIN,20);
	Font myfont3= new Font("MV Boli",Font.BOLD,20);

	
	
	
	NumberSystemConverter(){
		
		frame = new JFrame("Biniam's Number System Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(560,670);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		goTo = new JMenu("Go To");
		back = new JMenu("Back");
		binary = new JMenu("Binary");
		octal = new JMenu("Octal");
		decimal = new JMenu("Decimal");
		hexa = new JMenu("Hexa Decimal");
		reset = new JMenu("Reset");
		exit = new JMenu("Exit");
		
		btm = new JMenuItem("back to Calculator Collection");
		gtavc = new JMenuItem("Area and Volume Calculator -->");
		gttc = new JMenuItem("Temprature Converter -->");
		gtgpac = new JMenuItem("GPA Calculator -->");
		gtbmi = new JMenuItem("Body Mass Index -->");
		gtuc = new JMenuItem("Unit Converter-->");
		resetMI = new JMenuItem("Reset");
		exitMI = new JMenuItem("Exit");
		
		binaryToOctal = new JMenuItem("binary to octal");
		binaryToDecimal = new JMenuItem("binary to decimal");
		binaryToHexa = new JMenuItem("binary to hexa decimal");
		octalToBinary = new JMenuItem("octal to binary");
		octalToDecimal = new JMenuItem("octal to decimal");
		octalToHexa = new JMenuItem("octal to hexa decimal");
		decimalToBinary = new JMenuItem("decimal to binary");
		decimalToOctal = new JMenuItem("decimal to octal");
		decimalToHexa = new JMenuItem("decimal to hexa decimal");
		hexaToBinary = new JMenuItem("hexa decimal to binary");
		hexaToOctal = new JMenuItem("hexa decimal to octal");
		hexaToDecimal = new JMenuItem("hexa decimal to decimal");
		
		goTo.add(gtbmi);
		goTo.add(gtuc);
		goTo.add(gttc);
		goTo.add(gtavc);
		goTo.add(gtgpac);
		back.add(btm);
		reset.add(resetMI);
		exit.add(exitMI);
		
		binary.add(binaryToOctal);
		binary.add(binaryToDecimal);
		binary.add(binaryToHexa);
		octal.add(octalToBinary);
		octal.add(octalToDecimal);
		octal.add(octalToHexa);
		decimal.add(decimalToBinary);
		decimal.add(decimalToOctal);
		decimal.add(decimalToHexa);
		hexa.add(hexaToBinary);
		hexa.add(hexaToOctal);
		hexa.add(hexaToDecimal);
		
		bar = new JMenuBar();
		bar.add(back);
		bar.add(goTo);
		bar.add(binary);
		bar.add(octal);
		bar.add(decimal);
		bar.add(hexa);
		bar.add(reset);
		bar.add(exit);
		
		item[0] = btm;
		item[1] = gtuc;
		item[2] = gtbmi;
		item[3] = gttc;
		item[4] = gtavc;
		item[5] = gtgpac;
		item[6] = binaryToOctal;
		item[7] = binaryToDecimal;
		item[8] = binaryToHexa;
		item[9] = octalToBinary;
		item[10] = octalToDecimal;
		item[11] = octalToHexa;
		item[12] = decimalToBinary;
		item[13] = decimalToOctal;
		item[14] = decimalToHexa;
		item[15] = hexaToBinary;
		item[16] = hexaToOctal;
		item[17] = hexaToDecimal;
		item[18] = resetMI;
		item[19] = exitMI;
		
		for(int i =0; i<item.length;i++) {
			item[i].addActionListener(this);
		}
		
		
		title = new JLabel("Biniam Number System Converter");
		title.setHorizontalTextPosition(JLabel.CENTER);
		title.setVerticalTextPosition(JLabel.TOP);
        title.setForeground(Color.GREEN);
        title.setBackground(Color.WHITE);
        title.setOpaque(true);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(30,20,470,70);
        title.setFont(myfont1);
        title.setBorder(border1);
        
        text = new JLabel("Enter the value");
        text.setForeground(Color.CYAN);
        text.setBackground(Color.WHITE);
        text.setOpaque(true);
        text.setVerticalAlignment(JLabel.CENTER);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setBounds(30,110,250,50);
        text.setFont(myfont2);
        text.setBorder(border1);
        
        textTF = new JTextField();
        textTF.setEnabled(true);
        textTF.setBackground(Color.BLACK);
        textTF.setForeground(Color.GREEN);
        textTF.setCaretColor(Color.WHITE);
        textTF.setBounds(300,110,200,50);
        textTF.setFont(myfont3);
        
        answer = new JLabel("Required Result is: ");
        answer.setForeground(Color.CYAN);
        answer.setBackground(Color.WHITE);
        answer.setOpaque(true);
        answer.setVerticalAlignment(JLabel.CENTER);
        answer.setHorizontalAlignment(JLabel.CENTER);
        answer.setBounds(30,180,250,50);
        answer.setFont(myfont2);
        answer.setBorder(border1);
        
        answerTF = new JTextField();
        answerTF.setEnabled(false);
        answerTF.setBackground(Color.BLACK);
        answerTF.setForeground(Color.CYAN);
        answerTF.setCaretColor(Color.WHITE);
        answerTF.setBounds(300,180,200,50);
        answerTF.setFont(myfont3);
        
        icon = new ImageIcon("10 things.jpg");
		
		panel = new JPanel();
		panel.setBounds(30,250,470,360);
		label = new JLabel(icon);
		panel.add(label);
		panel.setBackground(Color.BLACK);
		
		frame.add(panel);
		frame.add(title);
		frame.add(answer);
		frame.add(answerTF);
		frame.add(text);
		frame.add(textTF);
		frame.setJMenuBar(bar);
		frame.setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btm) {
			frame.dispose();
			new Calculator_Collection();
		}
		if(e.getSource()==gtbmi) {
			frame.dispose();
			new BodyMassIndexCalculator();
		}
		if(e.getSource()==gtgpac) {
			frame.dispose();
			new GPACalculator();
		}
		if(e.getSource()==gtuc) {
			frame.dispose();
			new UnitConverter();
		}
		if(e.getSource()==gttc) {
			frame.dispose();
			new TempratureConverter();
		}
		if(e.getSource()==gtavc) {
			frame.dispose();
			new AreaVolumeCalculator();
		}
		if(e.getSource()==resetMI) {
			
			textTF.setText("");
			answerTF.setText("");
		}
		if(e.getSource()==exitMI) {
			int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
	        if (result == JOptionPane.YES_OPTION) {
	            System.exit(0);
	        }
		}
		
	
		
	   if(e.getSource()==binaryToOctal) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[01]+")) {
               int decimal = Integer.parseInt(input, 2);
               String result = Integer.toOctalString(decimal);
              answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid binary input.");
           }
			
		}
	   if(e.getSource()==binaryToDecimal) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[01]+")) {
               int decimal = Integer.parseInt(input, 2);
               String result = String.valueOf(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid binary input.");
           }
			
		}
	   if(e.getSource()==binaryToHexa) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[01]+")) {
               int decimal = Integer.parseInt(input, 2);
               String result = Integer.toHexString(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid binary input.");
           }
			
		}
	   if(e.getSource()==octalToBinary) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[0-7]+")) {
               int decimal = Integer.parseInt(input, 8);
               String result = Integer.toBinaryString(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid octal input.");
           }
			
		}
	   if(e.getSource()==octalToDecimal) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[0-7]+")) {
               int decimal = Integer.parseInt(input, 8);
               String result = String.valueOf(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid octal input.");
           }
		}
	   if(e.getSource()==octalToHexa) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[0-7]+")) {
               int decimal = Integer.parseInt(input, 8);
               String result = Integer.toHexString(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid octal input.");
           }
		}
	   if(e.getSource()==decimalToBinary) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("\\d+")) {
               int decimal = Integer.parseInt(input);
               String result = Integer.toBinaryString(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid decimal input.");
           }
			
		}
	   if(e.getSource()==decimalToOctal) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("\\d+")) {
               int decimal = Integer.parseInt(input);
               String result = Integer.toOctalString(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid decimal input.");
           }
		}
	   if(e.getSource()==decimalToHexa) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("\\d+")) {
               int decimal = Integer.parseInt(input);
               String result = Integer.toHexString(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid decimal input.");
           }
		}
	   if(e.getSource()==hexaToBinary) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[0-9A-F]+")) {
               int decimal = Integer.parseInt(input, 16);
               String result = Integer.toBinaryString(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid hexadecimal input.");
           }
		}
	   if(e.getSource()==binaryToOctal) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[0-9A-F]+")) {
               int decimal = Integer.parseInt(input, 16);
               String result = Integer.toOctalString(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid hexadecimal input.");
           }
		}
	   if(e.getSource()==hexaToDecimal) {
			
		   answerTF.setEnabled(true);
		   String input = textTF.getText();
           if (input.matches("[0-9A-F]+")) {
               int decimal = Integer.parseInt(input, 16);
               String result = String.valueOf(decimal);
               answerTF.setText(result);
           } else {
               JOptionPane.showMessageDialog(null, "Invalid hexadecimal input.");
           }
		}
	   
	   
	  
		
	}

		
	}

