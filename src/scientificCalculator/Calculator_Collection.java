package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Calculator_Collection implements ActionListener {
	
	JFrame frame;
	JButton calculatorButton[] = new JButton[8];
	JMenuItem item[] = new JMenuItem[8];
	JButton btmb,gtacb,gtucb,gtnscb,gttcb,gtavcb,gtbmib,gtgpacb;
	JPanel ccp;
	JLabel label , label2;
	JMenu back,goTo;
	JMenuItem btm,gtac,gtuc,gtnsc,gttc,gtavc,gtbmi,gtgpac;
	JMenuBar bar;
	ImageIcon icon;
	Timer imageTimer;
	
	
	Font myfont1 = new Font("Ink Free",Font.PLAIN,30);
	Font myfont2 = new Font("MV Boli",Font.BOLD,15);
	Font myfont3 = new Font("MV Boli",Font.BOLD,12);
	Font myfont4 = new Font("MV Boli",Font.BOLD,28);
	
	Border border1 = BorderFactory.createLineBorder(Color.GREEN,3);
	double expression;
	char operator;
	
	Calculator_Collection(){
		
		frame = new JFrame("Biniam's Calculator Collections ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(560,620);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		icon = new ImageIcon("Java.jpg");
		showImage();
		
		
		
		back = new JMenu("Back");
		goTo = new JMenu("Go to");
		
		btm = new JMenuItem("Back to Scientific Calculator");
		gtac = new JMenuItem("Advanced Calculator-->");
		gtuc = new JMenuItem("Unit Converter-->");
		gtnsc = new JMenuItem("Number System-->");
		gttc = new JMenuItem("Temperature Converter-->");
		gtavc = new JMenuItem("area and volume calculator-->");
		gtbmi = new JMenuItem("Body Mass Index-->");
		gtgpac = new JMenuItem("GPA Calculator-->");
		
		
		
		back.add(btm);
		goTo.add(gtac);
		goTo.add(gtuc);
		goTo.add(gtnsc);
		goTo.add(gttc);
		goTo.add(gtavc);
		goTo.add(gtbmi);
		goTo.add(gtgpac);
		
		
		bar = new JMenuBar();
		bar.add(back);
		bar.add(goTo);
		
		item[0] = btm;
		item[1] = gtac;
		item[2] = gtuc;
		item[3] = gtnsc;
		item[4] = gttc;
		item[5] = gtavc;
		item[6] = gtbmi;
		item[7] = gtgpac;
		
		for(int i =0; i<item.length;i++) {
			item[i].addActionListener(this);
		}
		
		label = new JLabel("Biniam's Calculator Collections");
		label.setBounds(60,20, 440,80);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setFont(myfont4);
		label.setForeground(Color.GREEN);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBorder(border1);
		
		
		btmb = new JButton("Scientific Calculator");
		gtacb = new JButton("Advanced Calculator");
		gtucb = new JButton("Unit Converter");
		gtnscb = new JButton("Number System Converter");
		gttcb = new JButton("Temprature Converter");
		gtavcb = new JButton("Area and Volume Calculator");
		gtbmib = new JButton("Body mass index ");
		gtgpacb = new JButton("GPA Calculator");
		
		
		calculatorButton[0] = btmb;
		calculatorButton[1] = gtacb;
		calculatorButton[2] = gtucb;
		calculatorButton[3] = gtnscb;
		calculatorButton[4] = gttcb;
		calculatorButton[5] = gtavcb;
		calculatorButton[6] = gtbmib;
		calculatorButton[7] = gtgpacb;
		
		for(int i=0;i<calculatorButton.length;i++) {
			
			calculatorButton[i].addActionListener(this);
			calculatorButton[i].setFocusable(false);
			calculatorButton[i].setFont(myfont2);
			calculatorButton[i].setBackground(Color.BLACK);
			calculatorButton[i].setForeground(Color.GREEN);
			
		}
		
		ccp = new JPanel();
		ccp.setFont(myfont2);
		ccp.setBounds(60,110,440,400);
		ccp.setLayout(new GridLayout(4,2,5,5));
		
		
		ccp.add(btmb);
		ccp.add(gtacb);
		ccp.add(gtucb);
		ccp.add(gtnscb);
		ccp.add(gttcb);
		ccp.add(gtavcb);
		ccp.add(gtbmib);
		ccp.add(gtgpacb);
		
	
		frame.add(label);
		frame.add(ccp);
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
			new Scientific_Calculator();
			
		}
		if(e.getSource()==gtac) {
			frame.dispose();
			new AdvancedCalculator();
			
		}
			if(e.getSource()==gtuc) {
			frame.dispose();
			new UnitConverter();
			
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
		if(e.getSource()==gtbmi) {
			frame.dispose();
			new BodyMassIndexCalculator();
			
		}
		if(e.getSource()==gtgpac) {
			frame.dispose();
			new GPACalculator();
			
		}                 
		
		if(e.getSource()==btmb) {
			frame.dispose();
			new Scientific_Calculator();
			
		}
		if(e.getSource()==gtacb) {
			frame.dispose();
			new AdvancedCalculator();
			
		}
		if(e.getSource()==gtucb) {
			frame.dispose();
			new UnitConverter();
			
		}
		if(e.getSource()==gtnscb) {
			frame.dispose();
			new NumberSystemConverter();
			
		}
		if(e.getSource()==gttcb) {
			frame.dispose();
			new TempratureConverter();
			
		}
		if(e.getSource()==gtavcb) {
			frame.dispose();
			new AreaVolumeCalculator();
			
		}
		if(e.getSource()==gtbmib) {
			frame.dispose();
			new BodyMassIndexCalculator();
			
		}
		if(e.getSource()==gtgpacb) {
			frame.dispose();
			new GPACalculator();
			
		}                
		
		
	}

}
