package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class TempratureConverter implements ActionListener{
	JFrame frame;
	JMenu back,goTo;
	JMenuItem btm,gtavc,gtbmi,gtgpac,gtnsc,gtuc;
	JMenuItem item[] = new JMenuItem[6];
	JMenuBar bar;
	
	JLabel title,text,from,to,answer;
	JTextField textTF,answerTF;
	JButton convert,reset,exit;
	
	JComboBox<String> fromComboBox,toComboBox; 

	Border border1 = BorderFactory.createLineBorder(Color.GREEN,3);
    Border border2 = BorderFactory.createLineBorder(Color.CYAN,3);
    
    Font myfont1= new Font("MV Boli",Font.BOLD,30);
	Font myfont2= new Font("Consolas",Font.PLAIN,20);
	Font myfont3= new Font("MV Boli",Font.BOLD,20);
	
	
	TempratureConverter(){
		
		frame = new JFrame("Biniam's Temprature Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(560,670);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		goTo = new JMenu("Go To");
		back = new JMenu("Back");
		
        btm = new JMenuItem("back to Calculator Collection");
		gtavc = new JMenuItem("Area and Volume Calculator -->");
		gtbmi = new JMenuItem("Body Mass Index -->");
		gtgpac = new JMenuItem("GPA Calculator -->");
		gtnsc = new JMenuItem("Number System Converter -->");
		gtuc = new JMenuItem("Unit Converter-->");
		
		goTo.add(gtbmi);
		goTo.add(gtnsc);
		goTo.add(gtuc);
		goTo.add(gtavc);
		goTo.add(gtgpac);
		back.add(btm);
		
		bar = new JMenuBar();
		bar.add(back);
		bar.add(goTo);
		
		
		item[0] = btm;
		item[1] = gtuc;
		item[2] = gtnsc;
		item[3] = gtbmi;
		item[4] = gtavc;
		item[5] = gtgpac;
		
		for(int i =0; i<item.length;i++) {
			item[i].addActionListener(this);
		}
		
		fromComboBox = new JComboBox<>(new  String[] {"Celsius","Fahrenheit","Kelvin"} );
		fromComboBox.setBounds(300, 270, 100, 50);
		toComboBox = new JComboBox<>(new String[] {"Celsius","Fahrenheit","Kelvin"});
		toComboBox.setBounds(300,330,100,50);
		
		title = new JLabel("Biniam Temprature Converter");
		title.setHorizontalTextPosition(JLabel.CENTER);
		title.setVerticalTextPosition(JLabel.TOP);
        title.setForeground(Color.GREEN);
        title.setBackground(Color.WHITE);
        title.setOpaque(true);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(30,30,500,80);
        title.setFont(myfont1);
        title.setBorder(border1);
        
        text = new JLabel("Enter the temprature");
        text.setForeground(Color.CYAN);
        text.setBackground(Color.WHITE);
        text.setOpaque(true);
        text.setVerticalAlignment(JLabel.CENTER);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setBounds(30,140,250,50);
        text.setFont(myfont2);
        text.setBorder(border1);
        
        textTF = new JTextField();
        textTF.setEnabled(true);
        textTF.setBackground(Color.BLACK);
        textTF.setForeground(Color.GREEN);
        textTF.setCaretColor(Color.WHITE);
        textTF.setBounds(300,140,200,50);
        textTF.setFont(myfont3);
        
        answer = new JLabel("Required Result is: ");
        answer.setForeground(Color.CYAN);
        answer.setBackground(Color.WHITE);
        answer.setOpaque(true);
        answer.setVerticalAlignment(JLabel.CENTER);
        answer.setHorizontalAlignment(JLabel.CENTER);
        answer.setBounds(30,200,250,50);
        answer.setFont(myfont2);
        answer.setBorder(border1);
        
        answerTF = new JTextField();
        answerTF.setEnabled(false);
        answerTF.setBackground(Color.BLACK);
        answerTF.setForeground(Color.GREEN);
        answerTF.setCaretColor(Color.WHITE);
        answerTF.setBounds(300,200,200,50);
        answerTF.setFont(myfont3);
        
        from = new JLabel("From:");
        from.setForeground(Color.CYAN);
        from.setBackground(Color.BLACK);
        from.setOpaque(true);
        from.setVerticalAlignment(JLabel.CENTER);
        from.setHorizontalAlignment(JLabel.CENTER);
        from.setBounds(180,270,100,50);
        from.setFont(myfont3);
        from.setBorder(border2);
        
        to = new JLabel("To:");
        to.setForeground(Color.CYAN);
        to.setBackground(Color.BLACK);
        to.setOpaque(true);
        to.setVerticalAlignment(JLabel.CENTER);
        to.setHorizontalAlignment(JLabel.CENTER);
        to.setBounds(180,330,100,50);
        to.setFont(myfont3);
        to.setBorder(border2);
        
        convert = new JButton("Convert");
        convert.setFocusable(false);
        convert.setBounds(50,450,130,50);
        convert.addActionListener(this);
        
        reset = new JButton("Reset");
        reset.setFocusable(false);
        reset.setBounds(200,450,130,50);
        reset.addActionListener(this);
        
        exit = new JButton("Exit");
        exit.setFocusable(false);
        exit.setBounds(350,450,130,50);
        exit.addActionListener(this);
        
        
        frame.add(answer);
        frame.add(answerTF);
        frame.add(fromComboBox);
        frame.add(toComboBox);
        frame.add(from);
        frame.add(to);
        frame.add(convert);
        frame.add(reset);
        frame.add(exit);
		frame.add(textTF);
		frame.add(text);
		frame.add(title);
		frame.setJMenuBar(bar);
		frame.setVisible(true);
		
	}
	
	
	private void convert() {
	    double temperature = Double.parseDouble(textTF.getText());
	    String fromCombo = (String) fromComboBox.getSelectedItem();
	    String toCombo = (String) toComboBox.getSelectedItem();

	    double result;

	    if (fromCombo.equals("Celsius")) {
	        if (toCombo.equals("Celsius")) {
	            result = temperature;
	            answerTF.setText(String.format("%.2f °C", result));
	        } else if (toCombo.equals("Fahrenheit")) {
	            result = (9.0 / 5.0 * temperature) + 32;
	            answerTF.setText(String.format("%.2f °F", result));
	        } else if (toCombo.equals("Kelvin")) {
	            result = temperature + 273.15;
	            answerTF.setText(String.format("%.2f K", result));
	        } else {
	            answerTF.setText("Invalid");
	        }
	    } else if (fromCombo.equals("Fahrenheit")) {
	        if (toCombo.equals("Celsius")) {
	            result = (5.0 / 9.0 * (temperature - 32));
	            answerTF.setText(String.format("%.2f °C", result));
	        } else if (toCombo.equals("Fahrenheit")) {
	            result = temperature;
	            answerTF.setText(String.format("%.2f °F", result));
	        } else if (toCombo.equals("Kelvin")) {
	            result = (5.0 / 9.0 * (temperature - 32)) + 273.15;
	            answerTF.setText(String.format("%.2f K", result));
	        } else {
	            answerTF.setText("Invalid");
	        }
	    } else if (fromCombo.equals("Kelvin")) {
	        if (toCombo.equals("Celsius")) {
	            result = temperature - 273.15;
	            answerTF.setText(String.format("%.2f °C", result));
	        } else if (toCombo.equals("Fahrenheit")) {
	            result = (9.0 / 5.0 * (temperature - 273.15)) + 32;
	            answerTF.setText(String.format("%.2f °F", result));
	        } else if (toCombo.equals("Kelvin")) {
	            result = temperature;
	            answerTF.setText(String.format("%.2f K", result));
	        } else {
	            answerTF.setText("Invalid");
	        }
	    } else {
	        answerTF.setText("Invalid");
	    }

	    answerTF.setEnabled(true);
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
		if(e.getSource()==gtnsc) {
			frame.dispose();
			new NumberSystemConverter();
		}
		if(e.getSource()==gtuc) {
			frame.dispose();
			new UnitConverter();
		}
		if(e.getSource()==gtavc) {
			frame.dispose();
			new AreaVolumeCalculator();
		}
		if(e.getSource()==convert) {
			convert();
		}
		if(e.getSource()==reset) {
			 
			textTF.setText("");
			answerTF.setText("");
			answerTF.setEnabled(false);
		}
		if(e.getSource()==exit) {
			frame.setVisible(false);
		}
		
		
	}

		
	}

