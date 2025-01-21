package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class BMITabel implements ActionListener{
	
	JFrame frame1;
	JMenu back;
	JMenuItem btm;
	
	JMenuBar bar;
	JLabel label;
	JTable table;
	Border border1 = BorderFactory.createLineBorder(Color.GREEN,3);
	
	JButton button1,button2;
	
	Font myfont1= new Font("MV Boli",Font.BOLD,30);
	
	BMITabel(){
		
		frame1 = new JFrame("Biniam's Body Mass Index Table");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setBackground(Color.BLACK);
		frame1.setSize(560,670);
		frame1.setLocationRelativeTo(null);
		frame1.setLayout(null);
		
        back = new JMenu("Back");
	    btm = new JMenuItem("back to BMI Calculator");
	    back.add(btm);
	    btm.addActionListener(this);
		bar = new JMenuBar();
		bar.add(back);
		
		label = new JLabel("Body Mass Index Table");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(60,30,440,80);
        label.setFont(myfont1);
        label.setBorder(border1);
        
        String values[][] = {{"Under Weight","0 - 18.5"},
        		{"Normal Weight","18.5 - 25"},
        		{"Over Weight","25 - 30"},
        		{"Obesity level 1","30 - 35"},
        		{"Obesity level 2","35 - 40"},
        		{"Obesity level 3","Above 40"}};
        String catagories[] = {"Catagories","BMI Ranges"};
        
        
        table = new JTable(values,catagories);
        table.setBounds(60,140,440,300);
        
        button1 = new JButton("Exit");
        button1.setFocusable(false);
        button1.setBounds(440,500,80,40);
        button1.addActionListener(this);
        
        button2 = new JButton("Back");
        button2.setFocusable(false);
        button2.setBounds(350,500,80,40);
        button2.addActionListener(this);
       
		frame1.add(button1);
		frame1.add(button2);
        frame1.setJMenuBar(bar);
        frame1.add(table);
        frame1.add(label);
		frame1.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btm) {
			frame1.dispose();
			new BodyMassIndexCalculator();
			}
		if(e.getSource()==button1) {
			frame1.setVisible(false);
			
			}
		if(e.getSource()==button2) {
			frame1.dispose();
			new BodyMassIndexCalculator();
			}
		
	}

}
