package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class BodyMassIndexCalculator implements ActionListener{
	JFrame frame;
	JMenu back,goTo;
	JMenuItem btm,gtavc,gttc,gtgpac,gtnsc,gtuc;
	JMenuItem item[] = new JMenuItem[6];
	JMenuBar bar;
	JLabel label1,label2,label3,label4,label5,label6,label7;
	JTextField textField1,textField2,textField3,textField4,textField5,textField6;
	JButton button1,button2,button3,button4;
	
	
	Border border1 = BorderFactory.createLineBorder(Color.GREEN,3);
	
	ImageIcon icon;
	Timer imageTimer;
	Font myfont1= new Font("MV Boli",Font.BOLD,30);
	Font myfont2= new Font("Consolas",Font.PLAIN,20);
	Font myfont3= new Font("MV Boli",Font.BOLD,20);
	

	
	BodyMassIndexCalculator(){
		
		
		frame = new JFrame("Biniam's Body Mass Index Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(560,670);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		icon = new ImageIcon("schewashinger.jpg");
		showImage();
		
		goTo = new JMenu("Go To");
		back = new JMenu("Back");
		
		btm = new JMenuItem("back to Calculator Collection");
		gtavc = new JMenuItem("Area and Volume Calculator -->");
		gttc = new JMenuItem("Temprature Converter -->");
		gtgpac = new JMenuItem("GPA Calculator -->");
		gtnsc = new JMenuItem("Number System Converter -->");
		gtuc = new JMenuItem("Unit Converter-->");
		
		goTo.add(gtuc);
		goTo.add(gtnsc);
		goTo.add(gttc);
		goTo.add(gtavc);
		goTo.add(gtgpac);
		back.add(btm);
		
		bar = new JMenuBar();
		bar.add(back);
		bar.add(goTo);
		
		item[0] = btm;
		item[1] = gtuc;
		item[2] = gtnsc;
		item[3] = gttc;
		item[4] = gtavc;
		item[5] = gtgpac;
		
		for(int i =0; i<item.length;i++) {
			item[i].addActionListener(this);
		}
		
		label1 = new JLabel("Body Mass Index");
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
        label1.setForeground(Color.GREEN);
        label1.setBackground(Color.WHITE);
        label1.setOpaque(true);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBounds(60,30,440,80);
        label1.setFont(myfont1);
        label1.setBorder(border1);
        
        label6 = new JLabel("Name: ");
        label6.setForeground(Color.GREEN);
        label6.setBackground(Color.WHITE);
        label6.setOpaque(true);
        label6.setVerticalAlignment(JLabel.CENTER);
        label6.setHorizontalAlignment(JLabel.CENTER);
        label6.setBounds(30,140,180,40);
        label6.setFont(myfont2);
        label6.setBorder(border1);
        
        label7 = new JLabel("Age: ");
        label7.setForeground(Color.GREEN);
        label7.setBackground(Color.WHITE);
        label7.setOpaque(true);
        label7.setVerticalAlignment(JLabel.CENTER);
        label7.setHorizontalAlignment(JLabel.CENTER);
        label7.setBounds(30,190,180,40);
        label7.setFont(myfont2);
        label7.setBorder(border1);
        
        label2 = new JLabel("Weight in KG: ");
        label2.setForeground(Color.GREEN);
        label2.setBackground(Color.WHITE);
        label2.setOpaque(true);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setBounds(30,240,180,40);
        label2.setFont(myfont2);
        label2.setBorder(border1);
        
        
        label3 = new JLabel("Height in Meter: ");
        label3.setForeground(Color.GREEN);
        label3.setBackground(Color.WHITE);
        label3.setOpaque(true);
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setBounds(30,290,180,40);
        label3.setFont(myfont2);
        label3.setBorder(border1);
        
        label4 = new JLabel("BMI: ");
        label4.setForeground(Color.GREEN);
        label4.setBackground(Color.WHITE);
        label4.setOpaque(true);
        label4.setVerticalAlignment(JLabel.CENTER);
        label4.setHorizontalAlignment(JLabel.CENTER);
        label4.setBounds(30,340,180,40);
        label4.setFont(myfont2);
        label4.setBorder(border1);
        
        label5 = new JLabel("Description: ");
        label5.setForeground(Color.GREEN);
        label5.setBackground(Color.WHITE);
        label5.setOpaque(true);
        label5.setVerticalAlignment(JLabel.CENTER);
        label5.setHorizontalAlignment(JLabel.CENTER);
        label5.setBounds(30,390,180,40);
        label5.setFont(myfont2);
        label5.setBorder(border1);
        
        
        textField5 = new JTextField();
        textField5.setEnabled(true);
        textField5.setBackground(Color.BLACK);
        textField5.setForeground(Color.GREEN);
        textField5.setCaretColor(Color.WHITE);
        textField5.setBounds(230,140,180,40);
        textField5.setFont(myfont1);
        
        textField6 = new JTextField();
        textField6.setEnabled(true);
        textField6.setBackground(Color.BLACK);
        textField6.setForeground(Color.GREEN);
        textField6.setCaretColor(Color.WHITE);
        textField6.setBounds(230,190,180,40);
        textField6.setFont(myfont1);
        
        textField1 = new JTextField();
        textField1.setEnabled(true);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.GREEN);
        textField1.setCaretColor(Color.WHITE);
        textField1.setBounds(230,240,180,40);
        textField1.setFont(myfont1);
        
        textField2 = new JTextField();
        textField2.setEnabled(true);
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.GREEN);
        textField2.setCaretColor(Color.WHITE);
        textField2.setBounds(230,290,180,40);
        textField2.setFont(myfont1);
        
        textField3 = new JTextField();
        textField3.setEnabled(false);
        textField3.setBackground(Color.BLACK);
        textField3.setForeground(Color.GREEN);
        textField3.setBounds(230,340,180,40);
        textField3.setFont(myfont1);
        
        textField4 = new JTextField();
        textField4.setEnabled(false);
        textField4.setBackground(Color.BLACK);
        textField4.setForeground(Color.GREEN);
        textField4.setBounds(230,390,180,40);
        textField4.setFont(myfont3);
        
        button1 = new JButton("Calculate BMI");
        button1.setFocusable(false);
        button1.setBounds(30,500,120,40);
        button1.addActionListener(this);
        
        button2 = new JButton("BMI Tabel");
        button2.setFocusable(false);
        button2.setBounds(160,500,110,40);
        button2.addActionListener(this);

        
        button3 = new JButton("Reset");
        button3.setFocusable(false);
        button3.setBounds(280,500,110,40);
        button3.addActionListener(this);
        
        button4 = new JButton("Exit");
        button4.setFocusable(false);
        button4.setBounds(400,500,110,40);
        button4.addActionListener(this);


        
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(textField4);
        frame.add(textField5);
        frame.add(textField6);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.setJMenuBar(bar);
		frame.setVisible(true);
		
	}
	
	private void showImage() {
		JLabel imageLabel = new JLabel(icon);
        imageLabel.setBounds(60,110,440,400);
        frame.add(imageLabel);     
		
        frame.revalidate();
        frame.repaint();

        imageTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(imageLabel);
                frame.revalidate();
                frame.repaint();
                imageTimer.stop();
            }
        });

        imageTimer.start();
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btm) {
			frame.dispose();
			new Calculator_Collection();
		}
		if(e.getSource()==gtuc) {
			frame.dispose();
			new UnitConverter();
		}
		if(e.getSource()==gtgpac) {
			frame.dispose();
			new GPACalculator();
		}
		if(e.getSource()==gtnsc) {
			frame.dispose();
			new NumberSystemConverter();
		}
		if(e.getSource()==gttc) {
			frame.dispose();
			new TempratureConverter();
		}
		if(e.getSource()==gtavc) {
			frame.dispose();
			new AreaVolumeCalculator();
		}
		if(e.getSource()==button1) {
			
			try {
				
				double weight = Double.parseDouble(textField1.getText());
				double height = Double.parseDouble(textField2.getText());
				String name = textField5.getText().toString();
				int age = Integer.parseInt(textField6.getText());
				
				double bmi = weight /(height*height);
				
				textField3.setText(String.format("%.2f", bmi));
				
				String description;
				
				if(bmi>0 && bmi<18.5  ) {
					description = "UnderWeight";
					JOptionPane.showMessageDialog(null,name+" you are "+ age + " years old and you are under weight! so EAT!");
				}
				else if(bmi>=18.5 && bmi<25) {
					description = "Normal Weight";
					JOptionPane.showMessageDialog(null,name+" you are "+ age + " years old and you are in Normal weight! Good!");
				}
				else if(bmi>=25 && bmi<30) {
					description = "Over Weight";
					JOptionPane.showMessageDialog(null,name+" you are "+ age + " years old and you are Over weight! Go to GYM man!");
				}
				else if(bmi>=30 && bmi<100) {
					description = "Obesity";
					JOptionPane.showMessageDialog(null,name+" you are "+ age + " years old but you are in Obesty! you should start Excersing right now!");
				}
				else {
					description = "Wrong BMI";
				}
				
				textField4.setText(description);
				
				textField3.setEnabled(true);
				textField4.setEnabled(true);
			}catch(NumberFormatException EX){
				
				textField3.setFont(myfont3);
				textField3.setText("Invalid Input");
				textField4.setText("");
				
			}
			
		}
        if(e.getSource()==button2) {
			
        	
			frame.dispose();
			new BMITabel();
			
		}
       if(e.getSource()==button3) {
    	   
			 textField1.setText("");
			 textField2.setText("");
			 textField3.setText("");
			 textField4.setText("");
			 textField5.setText("");
			 textField6.setText("");
			
			
			
		}
       if(e.getSource()==button4) {
			
			frame.setVisible(false);
			
		}
	}

		
	}

