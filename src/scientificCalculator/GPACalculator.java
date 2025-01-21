package scientificCalculator;



import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

public class GPACalculator {
	
	JFrame frame;
	JLabel gpa_calc,grade,courseAverage,databaseCourse,javaCourse,softwareCourse,osCourse,mpalCourse,actCourse,average,gpa;
	JTextField databaseTF,javaTF,softwareTF,osTF,mpalTF,actTF,averageTF,gpaTF;
	JTextField databaseGradeTF,javaGradeTF,softwareGradeTF,osGradeTF,mpalGradeTF,actGradeTF;
	JButton calculateButton;
	JMenu back,goTo;
	JMenuItem btm,gtavc,gttc,gtbmi,gtnsc,gtuc;
	JMenuItem item[] = new JMenuItem[6];
	JMenuBar bar;

	

	GPACalculator(){
		
		frame = new JFrame("Biniam GPA Calculator Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(560,620);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout(null);
		
		LinclonLegacy lived = new LinclonLegacy();
		
		Border border = BorderFactory.createLineBorder(Color.GREEN);
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		
		goTo = new JMenu("Go To");
		back = new JMenu("Back");
		
		
		
		btm = new JMenuItem("back to Calculator Collection");
		gtavc = new JMenuItem("Area and Volume Calculator -->");
		gttc = new JMenuItem("Temprature Converter -->");
		gtbmi = new JMenuItem("Body Mass Index -->");
		gtnsc = new JMenuItem("Number System Converter -->");
		gtuc = new JMenuItem("Unit Converter-->");
		
		goTo.add(gtbmi);
		goTo.add(gtnsc);
		goTo.add(gttc);
		goTo.add(gtavc);
		goTo.add(gtuc);
		back.add(btm);
		
		bar = new JMenuBar();
		bar.add(back);
		bar.add(goTo);
		
		item[0] = btm;
		item[1] = gtuc;
		item[2] = gtnsc;
		item[3] = gttc;
		item[4] = gtavc;
		item[5] = gtbmi;
		
		for(int i =0; i<item.length;i++) {
			item[i].addActionListener(lived);
		}
		
		
		
		
		
		
		gpa_calc = new JLabel("GPA Calculator");
		gpa_calc.setBounds(150,10,200,50);
		gpa_calc.setHorizontalTextPosition(JLabel.CENTER);
		gpa_calc.setVerticalTextPosition(JLabel.CENTER);
		gpa_calc.setForeground(Color.GREEN);
		gpa_calc.setBackground(Color.DARK_GRAY);
		gpa_calc.setOpaque(true);
		gpa_calc.setBorder(border);
		gpa_calc.setFont(new Font("MV Boli",Font.BOLD,25));
		
		courseAverage = new JLabel("Result");
		courseAverage.setFont(new Font("MV Boli",Font.BOLD,15));
		courseAverage.setForeground(Color.GREEN);
		courseAverage.setBackground(Color.DARK_GRAY);
		courseAverage.setOpaque(true);
		courseAverage.setBorder(border);
		courseAverage.setBounds(110,80,75,35);
		
		grade = new JLabel("Grade");
		grade.setFont(new Font("MV Boli",Font.BOLD,15));
		grade.setForeground(Color.GREEN);
		grade.setBackground(Color.DARK_GRAY);
		grade.setOpaque(true);
		grade.setBorder(border);
		grade.setBounds(190,80,75,35);
		
		databaseCourse = new JLabel("Database");
		databaseCourse.setFont(new Font("MV Boli",Font.BOLD,15));
		databaseCourse.setForeground(Color.BLACK);
		databaseCourse.setBackground(Color.LIGHT_GRAY);
		databaseCourse.setOpaque(true);
		databaseCourse.setBounds(5,140,90,30);
		
		javaCourse = new JLabel("Java");
		javaCourse.setFont(new Font("MV Boli",Font.BOLD,15));
		javaCourse.setForeground(Color.BLACK);
		javaCourse.setBackground(Color.LIGHT_GRAY);
		javaCourse.setOpaque(true);
		javaCourse.setBounds(5,180,90,30);
		
		softwareCourse = new JLabel("Software");
		softwareCourse.setFont(new Font("MV Boli",Font.BOLD,15));
		softwareCourse.setForeground(Color.BLACK);
		softwareCourse.setBackground(Color.LIGHT_GRAY);
		softwareCourse.setOpaque(true);
		softwareCourse.setBounds(5,220,90,30);
		
		osCourse = new JLabel("Operating");
		osCourse.setFont(new Font("MV Boli",Font.BOLD,15));
		osCourse.setForeground(Color.BLACK);
		osCourse.setBackground(Color.LIGHT_GRAY);
		osCourse.setOpaque(true);
		osCourse.setBounds(5,260,90,30);
		
		mpalCourse = new JLabel("MPAL");
		mpalCourse.setFont(new Font("MV Boli",Font.BOLD,15));
		mpalCourse.setForeground(Color.BLACK);
		mpalCourse.setBackground(Color.LIGHT_GRAY);
		mpalCourse.setOpaque(true);
		mpalCourse.setBounds(5,300,90,30);
		
		actCourse = new JLabel("Awtomata");
		actCourse.setFont(new Font("MV Boli",Font.BOLD,15));
		actCourse.setForeground(Color.BLACK);
		actCourse.setBackground(Color.LIGHT_GRAY);
		actCourse.setOpaque(true);
		actCourse.setBounds(5,340,90,30);
		
		average = new JLabel("Average");
		average.setFont(new Font("MV Boli",Font.BOLD,20));
		average.setForeground(Color.BLACK);
		average.setBackground(Color.LIGHT_GRAY);
		average.setOpaque(true);
		average.setBounds(350,180,100,30);
		
	    gpa = new JLabel("GPA");
	    gpa.setFont(new Font("MV Boli",Font.BOLD,20));
	    gpa.setForeground(Color.BLACK);
	    gpa.setBackground(Color.LIGHT_GRAY);
	    gpa.setOpaque(true);
	    gpa.setBounds(350,260,100,30);
	    
	    databaseTF = new JTextField();
	    databaseTF.setFont(new Font("MV Boli",Font.PLAIN,20));
	    databaseTF.setForeground(Color.GREEN);
	    databaseTF.setBackground(Color.LIGHT_GRAY);
	    databaseTF.setBounds(110, 140, 75, 30);
	    
	    javaTF = new JTextField();
	    javaTF.setFont(new Font("MV Boli",Font.PLAIN,20));
	    javaTF.setForeground(Color.GREEN);
	    javaTF.setBackground(Color.LIGHT_GRAY);
	    javaTF.setBounds(110, 180, 75, 30);
	    
	    softwareTF = new JTextField();
	    softwareTF.setFont(new Font("MV Boli",Font.PLAIN,20));
	    softwareTF.setForeground(Color.GREEN);
	    softwareTF.setBackground(Color.LIGHT_GRAY);
	    softwareTF.setBounds(110, 220, 75, 30);
	    
	    osTF = new JTextField();
	    osTF.setFont(new Font("MV Boli",Font.PLAIN,20));
	    osTF.setForeground(Color.GREEN);
	    osTF.setBackground(Color.LIGHT_GRAY);
	    osTF.setBounds(110, 260, 75, 30);
	    
	    mpalTF = new JTextField();
	    mpalTF.setFont(new Font("MV Boli",Font.PLAIN,20));
	    mpalTF.setForeground(Color.GREEN);
	    mpalTF.setBackground(Color.LIGHT_GRAY);
	    mpalTF.setBounds(110, 300, 75, 30);
	    
	    actTF = new JTextField();
	    actTF.setFont(new Font("MV Boli",Font.PLAIN,20));
	    actTF.setForeground(Color.GREEN);
	    actTF.setBackground(Color.LIGHT_GRAY);
	    actTF.setBounds(110, 340, 75, 30);
	    
	    databaseGradeTF = new JTextField();
	    databaseGradeTF.setBounds(190, 140, 75, 30);
	    databaseGradeTF.setBackground(Color.LIGHT_GRAY);
	    databaseGradeTF.setForeground(Color.GREEN);
	    databaseGradeTF.setFont(new Font("Consolas",Font.BOLD,20));
	    databaseGradeTF.setEditable(false);
	    
	    javaGradeTF = new JTextField();
	    javaGradeTF.setBounds(190, 180, 75, 30);
	    javaGradeTF.setBackground(Color.LIGHT_GRAY);
	    javaGradeTF.setForeground(Color.GREEN);
	    javaGradeTF.setFont(new Font("Consolas",Font.BOLD,20));
	    javaGradeTF.setEditable(false);
	    
	    softwareGradeTF = new JTextField();
	    softwareGradeTF.setBounds(190, 220, 75, 30);
	    softwareGradeTF.setBackground(Color.LIGHT_GRAY);
	    softwareGradeTF.setForeground(Color.GREEN);
	    softwareGradeTF.setFont(new Font("Consolas",Font.BOLD,20));
	    softwareGradeTF.setEditable(false);
	    
	    osGradeTF = new JTextField();
	    osGradeTF.setBounds(190, 260, 75, 30);
	    osGradeTF.setBackground(Color.LIGHT_GRAY);
	    osGradeTF.setForeground(Color.GREEN);
	    osGradeTF.setFont(new Font("Consolas",Font.BOLD,20));
	    osGradeTF.setEditable(false);
	    
	    mpalGradeTF = new JTextField();
	    mpalGradeTF.setBounds(190, 300, 75, 30);
	    mpalGradeTF.setBackground(Color.LIGHT_GRAY);
	    mpalGradeTF.setForeground(Color.GREEN);
	    mpalGradeTF.setFont(new Font("Consolas",Font.BOLD,20));
	    mpalGradeTF.setEditable(false);
	    
	    actGradeTF = new JTextField();
	    actGradeTF.setBounds(190, 340, 75, 30);
	    actGradeTF.setBackground(Color.LIGHT_GRAY);
	    actGradeTF.setForeground(Color.GREEN);
	    actGradeTF.setFont(new Font("Consolas",Font.BOLD,20));
	    actGradeTF.setEditable(false);
	    
	    averageTF = new JTextField();
	    averageTF.setForeground(Color.GREEN);
	    averageTF.setBackground(Color.LIGHT_GRAY);
	    averageTF.setBounds(350, 220, 100, 30);
	    averageTF.setFont(new Font("Consolas",Font.BOLD,20));
	    averageTF.setEditable(false);
	    
	    gpaTF = new JTextField();
	    gpaTF.setForeground(Color.GREEN);
	    gpaTF.setBackground(Color.LIGHT_GRAY);
	    gpaTF.setBounds(350, 300, 100, 30);
	    gpaTF.setFont(new Font("Consolas",Font.BOLD,20));
	    gpaTF.setEditable(false);
	    
	    
	    
	    calculateButton = new JButton("Calculate");	
	    calculateButton.setFocusable(false);
	    calculateButton.setBounds(350, 370, 100, 30);
	    calculateButton.addActionListener(lived);
	    
	    
	    frame.setJMenuBar(bar);
	    frame.add(calculateButton);
		frame.add(databaseTF);
		frame.add(javaTF);
		frame.add(softwareTF);
		frame.add(osTF);
		frame.add(mpalTF);
		frame.add(actTF);
		frame.add(databaseGradeTF);
		frame.add(javaGradeTF);
		frame.add(softwareGradeTF);
		frame.add(osGradeTF);
		frame.add(mpalGradeTF);
		frame.add(actGradeTF);
		frame.add(averageTF);
		frame.add(gpaTF);
		frame.add(average);
		frame.add(gpa);
		frame.add(javaCourse);
		frame.add(softwareCourse);
		frame.add(osCourse);
		frame.add(mpalCourse);
		frame.add(actCourse);
		frame.add(databaseCourse);
		frame.add(grade);
		frame.add(courseAverage);
		frame.add(gpa_calc);
		
		frame.setVisible(true);
		
		
	}
	
	private class LinclonLegacy implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==btm) {
				frame.dispose();
				new Calculator_Collection();
			}
			if(e.getSource()==gtbmi) {
				frame.dispose();
				new BodyMassIndexCalculator();
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
		

			
			if(e.getSource()==calculateButton) {
				
				try {
					
				
				
				String databaseCourse,javaCourse,softwareCourse,osCourse,mpalCourse,actCourse;
				double average;
				double gpa = 0;
				
				databaseCourse = databaseTF.getText();
				javaCourse = javaTF.getText();
				softwareCourse = softwareTF.getText();
				osCourse = osTF.getText();
				mpalCourse = mpalTF.getText();
				actCourse = actTF.getText();
				
				double database = Double.parseDouble(databaseCourse);
				double java = Double.parseDouble(javaCourse);
				double software = Double.parseDouble(softwareCourse);
				double os = Double.parseDouble(osCourse);
				double mpal = Double.parseDouble(mpalCourse);
				double act = Double.parseDouble(actCourse);
				
				average = ((database+java+software+os+mpal+act)/6);
				
				if(database >= 90 && database <= 100) {
					
					databaseGradeTF.setText("A+");
					gpa = gpa + 4.0;
				}
				else if(database >= 85 && database < 90) {
					databaseGradeTF.setText("A");
					gpa = gpa + 4.0;
				}
				else if(database >= 80 && database < 85) {
					databaseGradeTF.setText("A-");
					gpa = gpa + 3.75;
				}
				else if(database >= 75 && database < 80) {
					databaseGradeTF.setText("B+");
					gpa+=3.5;
				}
				else if(database >= 70 && database < 75) {
					databaseGradeTF.setText("B");
					gpa+=3.0;
				}
				else if(database >= 65 && database < 70) {
					databaseGradeTF.setText("B-");
					gpa+=2.75;
				}
				else if(database >= 60 && database < 65) {
					databaseGradeTF.setText("C+");
					gpa+=2.5;
				}
				else if(database >= 50 && database < 60) {
					databaseGradeTF.setText("C");
					gpa+=2.0;
				}
				else if(database >= 40 && database < 50) {
					databaseGradeTF.setText("D");
					gpa+=1.0;
				}
				else if(database >= 0 && database < 40) {
					databaseGradeTF.setText("F");
					gpa+=0;
				}
				else {
					databaseGradeTF.setText("None");
					gpa+=0;
				}
                if(java >= 90 && java <= 100) {
					
					javaGradeTF.setText("A+");
					gpa+=4.0;
				}
				else if(java >= 85 && java < 90) {
					javaGradeTF.setText("A");
					gpa+=4.0;
				}
				else if(java >= 80 && java < 85) {
					javaGradeTF.setText("A-");
					gpa+=3.75;
				}
				else if(java >= 75 && java < 80) {
					javaGradeTF.setText("B+");
					gpa+=3.5;
				}
				else if(java >= 70 && java < 75) {
					javaGradeTF.setText("B");
					gpa+=3.0;
				}
				else if(java >= 65 && java < 70) {
					javaGradeTF.setText("B-");
					gpa+=2.75;
				}
				else if(java >= 60 && java < 65) {
					javaGradeTF.setText("C+");
					gpa+=2.5;
				}
				else if(java >= 50 && java < 60) {
					javaGradeTF.setText("C");
					gpa+=2.0;
				}
				else if(java >= 40 && java < 50) {
					javaGradeTF.setText("D");
					gpa+=1.0;
				}
				else if(java >= 0 && java < 40) {
					javaGradeTF.setText("F");
					gpa+=0;
				}
				else {
					javaGradeTF.setText("None");
					gpa+=0;
				}
               if(software >= 90 && software <= 100) {
					
					softwareGradeTF.setText("A+");
					gpa+=4.0;
				}
				else if(software >= 85 && software < 90) {
					softwareGradeTF.setText("A");
					gpa+=4.0;
				}
				else if(software >= 80 && software < 85) {
					softwareGradeTF.setText("A-");
					gpa+=3.75;
				}
				else if(software >= 75 && software < 80) {
					softwareGradeTF.setText("B+");
					gpa+=3.5;
				}
				else if(software >= 70 && software < 75) {
					softwareGradeTF.setText("B");
					gpa+=3.0;
				}
				else if(software >= 65 && software < 70) {
					softwareGradeTF.setText("B-");
					gpa+=2.75;
				}
				else if(software >= 60 && software < 65) {
					softwareGradeTF.setText("C+");
					gpa+=2.5;
				}
				else if(software >= 50 && software < 60) {
					softwareGradeTF.setText("C");
					gpa+=2.0;
				}
				else if(software >= 40 && software < 50) {
					softwareGradeTF.setText("D");
					gpa+=1.0;
				}
				else if(software >= 0 && software < 40) {
					softwareGradeTF.setText("F");
					gpa+=0;
				}
				else {
					softwareGradeTF.setText("None");
					gpa+=0;
				}
               if(os >= 90 && os <= 100) {
					
					osGradeTF.setText("A+");
					gpa+=4.0;
				}
				else if(os >= 85 && os < 90) {
					osGradeTF.setText("A");
					gpa+=4.0;
				}
				else if(os >= 80 && os < 85) {
					osGradeTF.setText("A-");
					gpa+=3.75;
				}
				else if(os >= 75 && os < 80) {
					osGradeTF.setText("B+");
					gpa+=3.5;
				}
				else if(os >= 70 && os < 75) {
					osGradeTF.setText("B");
					gpa+=3.0;
				}
				else if(os >= 65 && os < 70) {
					osGradeTF.setText("B-");
					gpa+=2.75;
				}
				else if(os >= 60 && os < 65) {
					osGradeTF.setText("C+");
					gpa+=2.5;
				}
				else if(os >= 50 && os < 60) {
					osGradeTF.setText("C");
					gpa+=2.0;
				}
				else if(os >= 40 && os < 50) {
					osGradeTF.setText("D");
					gpa+=1.0;
				}
				else if(os >= 0 && os < 40) {
					osGradeTF.setText("F");
					gpa+=0;
				}
				else {
					osGradeTF.setText("None");
					gpa+=0;
				}
               if(mpal >= 90 && mpal <= 100) {
					
					mpalGradeTF.setText("A+");
					gpa+=4.0;
				}
				else if(mpal >= 85 && mpal < 90) {
					mpalGradeTF.setText("A");
					gpa+=4.0;
				}
				else if(mpal >= 80 && mpal < 85) {
					mpalGradeTF.setText("A-");
					gpa+=3.75;
				}
				else if(mpal >= 75 && mpal < 80) {
					mpalGradeTF.setText("B+");
					gpa+=3.5;
				}
				else if(mpal >= 70 && mpal < 75) {
					mpalGradeTF.setText("B");
					gpa+=3.0;
				}
				else if(mpal >= 65 && mpal < 70) {
					mpalGradeTF.setText("B-");
					gpa+=2.75;
				}
				else if(mpal >= 60 && mpal < 65) {
					mpalGradeTF.setText("C+");
					gpa+=2.5;
				}
				else if(mpal >= 50 && mpal < 60) {
					mpalGradeTF.setText("C");
					gpa+=2.0;
				}
				else if(mpal >= 40 && mpal < 50) {
					mpalGradeTF.setText("D");
					gpa+=1.0;
				}
				else if(mpal >= 0 && mpal < 40) {
					mpalGradeTF.setText("F");
					gpa+=0;
				}
				else {
					mpalGradeTF.setText("None");
					gpa+=0;
				}
               if(act >= 90 && act <= 100) {
					
					actGradeTF.setText("A+");
					gpa+=4.0;
				}
				else if(act >= 85 && act < 90) {
					actGradeTF.setText("A");
					gpa+=4.0;
				}
				else if(act >= 80 && act < 85) {
					actGradeTF.setText("A-");
					gpa+=3.75;
				}
				else if(act >= 75 && act < 80) {
					actGradeTF.setText("B+");
					gpa+=3.5;
				}
				else if(act >= 70 && act < 75) {
					actGradeTF.setText("B");
					gpa+=3.0;
				}
				else if(act >= 65 && act < 70) {
					actGradeTF.setText("B-");
					gpa+=2.75;
				}
				else if(act >= 60 && act < 65) {
					actGradeTF.setText("C+");
					gpa+=2.5;
				}
				else if(act >= 50 && act < 60) {
					actGradeTF.setText("C");
					gpa+=2.0;
				}
				else if(act >= 40 && act < 50) {
					actGradeTF.setText("D");
					gpa+=1.0;
				}
				else if(act >= 0 && act < 40) {
					actGradeTF.setText("F");
					gpa+=0;
				}
				else {
					actGradeTF.setText("None");
					gpa+=0;
				}
               
               gpa/=6;
               
               gpaTF.setText(Double.toString(Math.round(gpa*100)/100.0));
               averageTF.setText(Double.toString(Math.round(average*100.0)/100.0));
				
			}
				catch(InputMismatchException e1) {
					JOptionPane.showMessageDialog(null,"You can't  enter a string","this is Mismatch Exception",JOptionPane.ERROR_MESSAGE);
					
				}
				catch(Exception e2) {
					
					JOptionPane.showMessageDialog(null,"Something went wrong!","this is an error",JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
			
		}
		
		
	}
	
	

}

