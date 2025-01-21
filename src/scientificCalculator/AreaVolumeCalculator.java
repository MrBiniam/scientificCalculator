package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class AreaVolumeCalculator implements ActionListener{
	JFrame frame;
	JMenu back,goTo;
	JMenuItem btm,gtbmi,gttc,gtgpac,gtnsc,gtuc;
	JMenuItem item[] = new JMenuItem[6];
	JMenuBar bar;
	JLabel title,areaLabel,volumeLabel,densityLabel,accelerationLabel,forceLabel;
	JLabel areaLength,areaWidth,volumeLength,volumeWidth,volumeHeight,densityMass,densityVolume;
	JLabel accelerationFV,accelerationIV,accelerationFT,accelerationIT,forceMass,forceAcceleration;
	JTextField areaLengthTF,areaWidthTF,areaAnswer,volumeLengthTF,volumeWidthTF,volumeHeightTF,volumeAnswer,densityMassTF,densityVolumeTF,densityAnswer;
    JTextField accelerationFVTF,accelerationIVTF,accelerationFTTF,accelerationITTF,accelerationAnswer,forceMassTF,forceAccelerationTF,forceAnswer;
    JButton areaButton,volumeButton,densityButton,accelerationButton,forceButton,exitButton,resetButton;
	
	
    
    Border border1 = BorderFactory.createLineBorder(Color.GREEN,3);
    Border border2 = BorderFactory.createLineBorder(Color.CYAN,3);
    
    Font myfont1= new Font("MV Boli",Font.BOLD,30);
	Font myfont2= new Font("Consolas",Font.PLAIN,20);
	Font myfont3= new Font("MV Boli",Font.BOLD,20);
	
	AreaVolumeCalculator(){
		
		frame = new JFrame("Biniam's Area and Volume Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(560,900);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		goTo = new JMenu("Go To");
		back = new JMenu("Back");
		
		
		
		
		btm = new JMenuItem("back to Calculator Collection");
		gtbmi = new JMenuItem("Body Mass Index -->");
		gttc = new JMenuItem("Temprature Converter -->");
		gtgpac = new JMenuItem("GPA Calculator -->");
		gtnsc = new JMenuItem("Number System Converter -->");
		gtuc = new JMenuItem("Unit Converter-->");
		
		goTo.add(gtbmi);
		goTo.add(gtnsc);
		goTo.add(gttc);
		goTo.add(gtuc);
		goTo.add(gtgpac);
		back.add(btm);
		
		bar = new JMenuBar();
		bar.add(back);
		bar.add(goTo);
		
		item[0] = btm;
		item[1] = gtuc;
		item[2] = gtnsc;
		item[3] = gttc;
		item[4] = gtbmi;
		item[5] = gtgpac;
		
		for(int i =0; i<item.length;i++) {
			item[i].addActionListener(this);
		}
		
		title = new JLabel("Biniam Simple Physics LOL");
		title.setHorizontalTextPosition(JLabel.CENTER);
		title.setVerticalTextPosition(JLabel.TOP);
        title.setForeground(Color.GREEN);
        title.setBackground(Color.WHITE);
        title.setOpaque(true);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(60,30,440,80);
        title.setFont(myfont1);
        title.setBorder(border1);
        
        areaLabel = new JLabel("Area");
        areaLabel.setForeground(Color.CYAN);
        areaLabel.setBackground(Color.WHITE);
        areaLabel.setOpaque(true);
        areaLabel.setVerticalAlignment(JLabel.CENTER);
        areaLabel.setHorizontalAlignment(JLabel.CENTER);
        areaLabel.setBounds(20,120,100,30);
        areaLabel.setFont(myfont2);
        areaLabel.setBorder(border1);
        
        areaLength = new JLabel("Length:");
        areaLength.setForeground(Color.CYAN);
        areaLength.setBackground(Color.BLACK);
        areaLength.setOpaque(true);
        areaLength.setVerticalAlignment(JLabel.CENTER);
        areaLength.setHorizontalAlignment(JLabel.CENTER);
        areaLength.setBounds(130,160,100,30);
        areaLength.setFont(myfont3);
        areaLength.setBorder(border2);
        
        areaLengthTF = new JTextField();
        areaLengthTF.setEnabled(true);
        areaLengthTF.setBackground(Color.BLACK);
        areaLengthTF.setForeground(Color.GREEN);
        areaLengthTF.setCaretColor(Color.WHITE);
        areaLengthTF.setBounds(240,160,100,30);
        areaLengthTF.setFont(myfont3);
        
        areaWidth = new JLabel("Width:");
        areaWidth.setForeground(Color.CYAN);
        areaWidth.setBackground(Color.BLACK);
        areaWidth.setOpaque(true);
        areaWidth.setVerticalAlignment(JLabel.CENTER);
        areaWidth.setHorizontalAlignment(JLabel.CENTER);
        areaWidth.setBounds(130,200,100,30);
        areaWidth.setFont(myfont3);
        areaWidth.setBorder(border2);
        
        areaWidthTF = new JTextField();
        areaWidthTF.setEnabled(true);
        areaWidthTF.setBackground(Color.BLACK);
        areaWidthTF.setForeground(Color.GREEN);
        areaWidthTF.setCaretColor(Color.WHITE);
        areaWidthTF.setBounds(240,200,100,30);
        areaWidthTF.setFont(myfont3);
        
        areaButton = new JButton("Calculate");
        areaButton.setFocusable(false);
        areaButton.setBounds(350,160,100,30);
        areaButton.addActionListener(this);
        
        areaAnswer = new JTextField();
        areaAnswer.setEnabled(false);
        areaAnswer.setBackground(Color.GREEN);
        areaAnswer.setForeground(Color.BLACK);
        areaAnswer.setCaretColor(Color.BLACK);
        areaAnswer.setBounds(350,200,100,30);
        areaAnswer.setFont(myfont3);
        
        
        volumeLabel = new JLabel("Volume");
        volumeLabel.setForeground(Color.CYAN);
        volumeLabel.setBackground(Color.WHITE);
        volumeLabel.setOpaque(true);
        volumeLabel.setVerticalAlignment(JLabel.CENTER);
        volumeLabel.setHorizontalAlignment(JLabel.CENTER);
        volumeLabel.setBounds(20,240,100,30);
        volumeLabel.setFont(myfont2);
        volumeLabel.setBorder(border1);
        
        volumeLength = new JLabel("Length:");
        volumeLength.setForeground(Color.CYAN);
        volumeLength.setBackground(Color.BLACK);
        volumeLength.setOpaque(true);
        volumeLength.setVerticalAlignment(JLabel.CENTER);
        volumeLength.setHorizontalAlignment(JLabel.CENTER);
        volumeLength.setBounds(130,280,100,30);
        volumeLength.setFont(myfont3);
        volumeLength.setBorder(border2);
        
        volumeLengthTF = new JTextField();
        volumeLengthTF.setEnabled(true);
        volumeLengthTF.setBackground(Color.BLACK);
        volumeLengthTF.setForeground(Color.GREEN);
        volumeLengthTF.setCaretColor(Color.WHITE);
        volumeLengthTF.setBounds(240,280,100,30);
        volumeLengthTF.setFont(myfont3);
        
        volumeWidth = new JLabel("Width:");
        volumeWidth.setForeground(Color.CYAN);
        volumeWidth.setBackground(Color.BLACK);
        volumeWidth.setOpaque(true);
        volumeWidth.setVerticalAlignment(JLabel.CENTER);
        volumeWidth.setHorizontalAlignment(JLabel.CENTER);
        volumeWidth.setBounds(130,320,100,30);
        volumeWidth.setFont(myfont3);
        volumeWidth.setBorder(border2);
        
        volumeWidthTF = new JTextField();
        volumeWidthTF.setEnabled(true);
        volumeWidthTF.setBackground(Color.BLACK);
        volumeWidthTF.setForeground(Color.GREEN);
        volumeWidthTF.setCaretColor(Color.WHITE);
        volumeWidthTF.setBounds(240,320,100,30);
        volumeWidthTF.setFont(myfont3);
        
        volumeHeight = new JLabel("Height:");
        volumeHeight.setForeground(Color.CYAN);
        volumeHeight.setBackground(Color.BLACK);
        volumeHeight.setOpaque(true);
        volumeHeight.setVerticalAlignment(JLabel.CENTER);
        volumeHeight.setHorizontalAlignment(JLabel.CENTER);
        volumeHeight.setBounds(130,360,100,30);
        volumeHeight.setFont(myfont3);
        volumeHeight.setBorder(border2);
        
        volumeHeightTF = new JTextField();
        volumeHeightTF.setEnabled(true);
        volumeHeightTF.setBackground(Color.BLACK);
        volumeHeightTF.setForeground(Color.GREEN);
        volumeHeightTF.setCaretColor(Color.WHITE);
        volumeHeightTF.setBounds(240,360,100,30);
        volumeHeightTF.setFont(myfont3);
        
        
        volumeButton = new JButton("Calculate");
        volumeButton.setFocusable(false);
        volumeButton.setBounds(350,280,100,30);
        volumeButton.addActionListener(this);
        
        volumeAnswer = new JTextField();
        volumeAnswer.setEnabled(false);
        volumeAnswer.setBackground(Color.GREEN);
        volumeAnswer.setForeground(Color.BLACK);
        volumeAnswer.setCaretColor(Color.BLACK);
        volumeAnswer.setBounds(350,320,100,30);
        volumeAnswer.setFont(myfont3);
        
        densityLabel = new JLabel("Density");
        densityLabel.setForeground(Color.CYAN);
        densityLabel.setBackground(Color.WHITE);
        densityLabel.setOpaque(true);
        densityLabel.setVerticalAlignment(JLabel.CENTER);
        densityLabel.setHorizontalAlignment(JLabel.CENTER);
        densityLabel.setBounds(20,400,100,30);
        densityLabel.setFont(myfont2);
        densityLabel.setBorder(border1);
        
        densityMass = new JLabel("Mass:");
        densityMass.setForeground(Color.CYAN);
        densityMass.setBackground(Color.BLACK);
        densityMass.setOpaque(true);
        densityMass.setVerticalAlignment(JLabel.CENTER);
        densityMass.setHorizontalAlignment(JLabel.CENTER);
        densityMass.setBounds(130,440,100,30);
        densityMass.setFont(myfont3);
        densityMass.setBorder(border2);
        
        densityMassTF = new JTextField();
        densityMassTF.setEnabled(true);
        densityMassTF.setBackground(Color.BLACK);
        densityMassTF.setForeground(Color.GREEN);
        densityMassTF.setCaretColor(Color.WHITE);
        densityMassTF.setBounds(240,440,100,30);
        densityMassTF.setFont(myfont3);
        
        densityVolume = new JLabel("Volume:");
        densityVolume.setForeground(Color.CYAN);
        densityVolume.setBackground(Color.BLACK);
        densityVolume.setOpaque(true);
        densityVolume.setVerticalAlignment(JLabel.CENTER);
        densityVolume.setHorizontalAlignment(JLabel.CENTER);
        densityVolume.setBounds(130,480,100,30);
        densityVolume.setFont(myfont3);
        densityVolume.setBorder(border2);
        
        densityVolumeTF = new JTextField();
        densityVolumeTF.setEnabled(true);
        densityVolumeTF.setBackground(Color.BLACK);
        densityVolumeTF.setForeground(Color.GREEN);
        densityVolumeTF.setCaretColor(Color.WHITE);
        densityVolumeTF.setBounds(240,480,100,30);
        densityVolumeTF.setFont(myfont3);
        
        densityButton = new JButton("Calculate");
        densityButton.setFocusable(false);
        densityButton.setBounds(350,440,100,30);
        densityButton.addActionListener(this);
        
        densityAnswer = new JTextField();
        densityAnswer.setEnabled(false);
        densityAnswer.setBackground(Color.GREEN);
        densityAnswer.setForeground(Color.BLACK);
        densityAnswer.setCaretColor(Color.BLACK);
        densityAnswer.setBounds(350,480,100,30);
        densityAnswer.setFont(myfont3);
        
        
        
        accelerationLabel = new JLabel("Acceleration");
        accelerationLabel.setForeground(Color.CYAN);
        accelerationLabel.setBackground(Color.WHITE);
        accelerationLabel.setOpaque(true);
        accelerationLabel.setVerticalAlignment(JLabel.CENTER);
        accelerationLabel.setHorizontalAlignment(JLabel.CENTER);
        accelerationLabel.setBounds(20,520,100,30);
        accelerationLabel.setFont(myfont2);
        accelerationLabel.setBorder(border1);
        
        accelerationIV = new JLabel("Initial Velocity:");
        accelerationIV.setForeground(Color.CYAN);
        accelerationIV.setBackground(Color.BLACK);
        accelerationIV.setOpaque(true);
        accelerationIV.setVerticalAlignment(JLabel.CENTER);
        accelerationIV.setHorizontalAlignment(JLabel.CENTER);
        accelerationIV.setBounds(130,560,100,30);
        accelerationIV.setFont(myfont3);
        accelerationIV.setBorder(border2);
        
        accelerationIVTF = new JTextField();
        accelerationIVTF.setEnabled(true);
        accelerationIVTF.setBackground(Color.BLACK);
        accelerationIVTF.setForeground(Color.GREEN);
        accelerationIVTF.setCaretColor(Color.WHITE);
        accelerationIVTF.setBounds(240,560,100,30);
        accelerationIVTF.setFont(myfont3);
        
        accelerationFV = new JLabel("Final Velocity:");
        accelerationFV.setForeground(Color.CYAN);
        accelerationFV.setBackground(Color.BLACK);
        accelerationFV.setOpaque(true);
        accelerationFV.setVerticalAlignment(JLabel.CENTER);
        accelerationFV.setHorizontalAlignment(JLabel.CENTER);
        accelerationFV.setBounds(130,600,100,30);
        accelerationFV.setFont(myfont3);
        accelerationFV.setBorder(border2);
        
        accelerationFVTF = new JTextField();
        accelerationFVTF.setEnabled(true);
        accelerationFVTF.setBackground(Color.BLACK);
        accelerationFVTF.setForeground(Color.GREEN);
        accelerationFVTF.setCaretColor(Color.WHITE);
        accelerationFVTF.setBounds(240,600,100,30);
        accelerationFVTF.setFont(myfont3);
        
        accelerationIT = new JLabel("Initial Second:");
        accelerationIT.setForeground(Color.CYAN);
        accelerationIT.setBackground(Color.BLACK);
        accelerationIT.setOpaque(true);
        accelerationIT.setVerticalAlignment(JLabel.CENTER);
        accelerationIT.setHorizontalAlignment(JLabel.CENTER);
        accelerationIT.setBounds(130,640,100,30);
        accelerationIT.setFont(myfont3);
        accelerationIT.setBorder(border2);
        
        accelerationITTF = new JTextField();
        accelerationITTF.setEnabled(true);
        accelerationITTF.setBackground(Color.BLACK);
        accelerationITTF.setForeground(Color.GREEN);
        accelerationITTF.setCaretColor(Color.WHITE);
        accelerationITTF.setBounds(240,640,100,30);
        accelerationITTF.setFont(myfont3);
        
        accelerationFT = new JLabel("Final Second:");
        accelerationFT.setForeground(Color.CYAN);
        accelerationFT.setBackground(Color.BLACK);
        accelerationFT.setOpaque(true);
        accelerationFT.setVerticalAlignment(JLabel.CENTER);
        accelerationFT.setHorizontalAlignment(JLabel.CENTER);
        accelerationFT.setBounds(130,680,100,30);
        accelerationFT.setFont(myfont3);
        accelerationFT.setBorder(border2);
        
        accelerationFTTF = new JTextField();
        accelerationFTTF.setEnabled(true);
        accelerationFTTF.setBackground(Color.BLACK);
        accelerationFTTF.setForeground(Color.GREEN);
        accelerationFTTF.setCaretColor(Color.WHITE);
        accelerationFTTF.setBounds(240,680,100,30);
        accelerationFTTF.setFont(myfont3);
        
        
        accelerationButton = new JButton("Calculate");
        accelerationButton.setFocusable(false);
        accelerationButton.setBounds(350,560,100,30);
        accelerationButton.addActionListener(this);
        
        accelerationAnswer = new JTextField();
        accelerationAnswer.setEnabled(false);
        accelerationAnswer.setBackground(Color.GREEN);
        accelerationAnswer.setForeground(Color.BLACK);
        accelerationAnswer.setCaretColor(Color.BLACK);
        accelerationAnswer.setBounds(350,600,100,30);
        accelerationAnswer.setFont(myfont3);
        

        
        forceLabel = new JLabel("Force");
        forceLabel.setForeground(Color.CYAN);
        forceLabel.setBackground(Color.WHITE);
        forceLabel.setOpaque(true);
        forceLabel.setVerticalAlignment(JLabel.CENTER);
        forceLabel.setHorizontalAlignment(JLabel.CENTER);
        forceLabel.setBounds(20,720,100,30);
        forceLabel.setFont(myfont2);
        forceLabel.setBorder(border1);
        
        forceMass = new JLabel("Mass:");
        forceMass.setForeground(Color.CYAN);
        forceMass.setBackground(Color.BLACK);
        forceMass.setOpaque(true);
        forceMass.setVerticalAlignment(JLabel.CENTER);
        forceMass.setHorizontalAlignment(JLabel.CENTER);
        forceMass.setBounds(130,760,100,30);
        forceMass.setFont(myfont3);
        forceMass.setBorder(border2);
        
        forceMassTF = new JTextField();
        forceMassTF.setEnabled(true);
        forceMassTF.setBackground(Color.BLACK);
        forceMassTF.setForeground(Color.GREEN);
        forceMassTF.setCaretColor(Color.WHITE);
        forceMassTF.setBounds(240,760,100,30);
        forceMassTF.setFont(myfont3);
        
        forceAcceleration = new JLabel("Acceleration:");
        forceAcceleration.setForeground(Color.CYAN);
        forceAcceleration.setBackground(Color.BLACK);
        forceAcceleration.setOpaque(true);
        forceAcceleration.setVerticalAlignment(JLabel.CENTER);
        forceAcceleration.setHorizontalAlignment(JLabel.CENTER);
        forceAcceleration.setBounds(130,800,100,30);
        forceAcceleration.setFont(myfont3);
        forceAcceleration.setBorder(border2);
        
        forceAccelerationTF = new JTextField();
        forceAccelerationTF.setEnabled(true);
        forceAccelerationTF.setBackground(Color.BLACK);
        forceAccelerationTF.setForeground(Color.GREEN);
        forceAccelerationTF.setCaretColor(Color.WHITE);
        forceAccelerationTF.setBounds(240,800,100,30);
        forceAccelerationTF.setFont(myfont3);
        
        forceButton = new JButton("Calculate");
        forceButton.setFocusable(false);
        forceButton.setBounds(350,760,100,30);
        forceButton.addActionListener(this);
        
        forceAnswer = new JTextField();
        forceAnswer.setEnabled(false);
        forceAnswer.setBackground(Color.GREEN);
        forceAnswer.setForeground(Color.BLACK);
        forceAnswer.setCaretColor(Color.BLACK);
        forceAnswer.setBounds(350,800,100,30);
        forceAnswer.setFont(myfont3);
        
        
        frame.add(forceLabel);
		frame.add(forceMass);
		frame.add(forceAcceleration);
		frame.add(forceMassTF);
		frame.add(forceAccelerationTF);
		frame.add(forceButton);
		frame.add(forceAnswer);
        frame.add(accelerationLabel);
        frame.add(accelerationIV);
        frame.add(accelerationFV);
        frame.add(accelerationIT);
        frame.add(accelerationFT);
        frame.add(accelerationButton);
        frame.add(accelerationAnswer);
        frame.add(accelerationIVTF);
        frame.add(accelerationFVTF);
        frame.add(accelerationITTF);
        frame.add(accelerationFTTF);
		frame.add(densityLabel);
		frame.add(densityMass);
		frame.add(densityMassTF);
		frame.add(densityVolumeTF);
		frame.add(densityVolume);
		frame.add(densityButton);
		frame.add(densityAnswer);
		frame.add(volumeLabel);
		frame.add(volumeLength);
		frame.add(volumeWidth);
		frame.add(volumeHeight);
		frame.add(volumeHeightTF);
		frame.add(volumeWidthTF);
		frame.add(volumeLengthTF);
		frame.add(volumeAnswer);
		frame.add(volumeButton);
		frame.add(areaAnswer);
		frame.add(areaWidth);
		frame.add(areaWidthTF);
		frame.add(areaButton);
		frame.add(areaLabel);
		frame.add(areaLength);
		frame.add(areaLengthTF);
		frame.add(title);
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
		if(e.getSource()==gtnsc) {
			frame.dispose();
			new NumberSystemConverter();
		}
		if(e.getSource()==gttc) {
			frame.dispose();
			new TempratureConverter();
		}
		if(e.getSource()==gtuc) {
			frame.dispose();
			new UnitConverter();
		}
		if(e.getSource()==areaButton) {
			try {
				
				double length = Double.parseDouble(areaLengthTF.getText());
				double width = Double.parseDouble(areaWidthTF.getText());
				
				double area = length * width;
				
				areaAnswer.setText(String.format("%.2f", area));
				
				areaAnswer.setEnabled(true);
				
				
				
			}catch(NumberFormatException EX) {
				
				areaAnswer.setText("Wrong Input");
				
			}catch(Exception ex) {
				
				areaAnswer.setText("Invalid Input");
			}
			
			
			
			
		}
		if(e.getSource()==volumeButton) {
			try {
				double length = Double.parseDouble(volumeLengthTF.getText());
				double width = Double.parseDouble(volumeWidthTF.getText());
				double height = Double.parseDouble(volumeHeightTF.getText());
				
				double volume = length * width * height;
				
				volumeAnswer.setText(String.format("%.2f", volume));
				
				volumeAnswer.setEnabled(true);
                
			}catch(NumberFormatException EX) {
				
				volumeAnswer.setText("Wrong Input");
				
			}catch(Exception ex) {
				
				volumeAnswer.setText("Invalid Input");
			}
			
			
			
			
		}
		if(e.getSource()==densityButton) {
			try {
				double mass = Double.parseDouble(densityMassTF.getText());
				double volume = Double.parseDouble(densityVolumeTF.getText());
				
				double density = mass / volume;
				
				densityAnswer.setText(String.format("%.2f", density));
				
				densityAnswer.setEnabled(true);
				
            }catch(NumberFormatException EX) {
				
            	densityAnswer.setText("Wrong Input");
				
			}catch(Exception ex) {
				
				densityAnswer.setText("Invalid Input");
			}
			
			
			
			
		}
		if(e.getSource()==accelerationButton) {
			try {
				
				double accelerationIV = Double.parseDouble(accelerationIVTF.getText());
				double accelerationFV = Double.parseDouble(accelerationFVTF.getText());
				double accelerationIT = Double.parseDouble(accelerationITTF.getText());
				double accelerationFT = Double.parseDouble(accelerationFTTF.getText());
				
				double acceleration = (accelerationFV - accelerationIV)/(accelerationFT - accelerationIT);
				
				accelerationAnswer.setText(String.format("%.2f", acceleration));
				
				accelerationAnswer.setEnabled(true);
            }catch(NumberFormatException EX) {
				
            	accelerationAnswer.setText("Wrong Input");
				
			}catch(Exception ex) {
				
				accelerationAnswer.setText("Invalid Input");
			}
			
			
			
			
		}
		if(e.getSource()==forceButton) {
			try {
				double mass = Double.parseDouble(forceMassTF.getText());
				double acceleration = Double.parseDouble(forceAccelerationTF.getText());
				
				double force = mass * acceleration;
				
				forceAnswer.setText(String.format("%.2f", force));
				
				forceAnswer.setEnabled(true);
				
             }catch(NumberFormatException EX) {
				
            	 forceAnswer.setText("Wrong Input");
				
			}catch(Exception ex) {
				
				forceAnswer.setText("Invalid Input");
			}
			
			
			
			
			
		}
		
        
		
	}

		
	}
	
	


