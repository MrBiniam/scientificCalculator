package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class UnitConverter implements ActionListener {
	
	JFrame frame;
	JMenu back,goTo;
	JMenuItem btm,gtavc,gttc,gtgpac,gtnsc,gtbmi;
	JMenuItem item[] = new JMenuItem[6];
	JMenuBar bar;
	
	JLabel title,text,from,to,answer;
	JTextField textTF,answerTF;
	
    JButton convertDistance,convertTime,convertMass,reset,exit,backButton;
	
	JComboBox<String> distanceFCB,distanceTCB,timeFCB,timeTCB,massFCB ,massTCB;

	Border border1 = BorderFactory.createLineBorder(Color.GREEN,3);
    Border border2 = BorderFactory.createLineBorder(Color.CYAN,3);
    
    Font myfont1= new Font("MV Boli",Font.BOLD,30);
	Font myfont2= new Font("Consolas",Font.PLAIN,20);
	Font myfont3= new Font("MV Boli",Font.BOLD,20);
	
	

	
	UnitConverter(){
		
		frame = new JFrame("Biniam's Unit Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(560,670);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		goTo = new JMenu("Go To");
		back = new JMenu("Back");
		
		
		
		btm = new JMenuItem("back to Calculator Collection");
		gtavc = new JMenuItem("Area and Volume Calculator -->");
		gttc = new JMenuItem("Temprature Converter -->");
		gtgpac = new JMenuItem("GPA Calculator -->");
		gtnsc = new JMenuItem("Number System Converter -->");
		gtbmi = new JMenuItem("Body Mass Index-->");
		
		goTo.add(gtbmi);
		goTo.add(gtnsc);
		goTo.add(gttc);
		goTo.add(gtavc);
		goTo.add(gtgpac);
		back.add(btm);
		
		bar = new JMenuBar();
		bar.add(back);
		bar.add(goTo);
		
		item[0] = btm;
		item[1] = gtbmi;
		item[2] = gtnsc;
		item[3] = gttc;
		item[4] = gtavc;
		item[5] = gtgpac;
		
		for(int i =0; i<item.length;i++) {
			item[i].addActionListener(this);
		}
		
		title = new JLabel("Biniam Unit Converter");
		title.setHorizontalTextPosition(JLabel.CENTER);
		title.setVerticalTextPosition(JLabel.TOP);
        title.setForeground(Color.GREEN);
        title.setBackground(Color.WHITE);
        title.setOpaque(true);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(60,30,440,50);
        title.setFont(myfont1);
        title.setBorder(border1);
        
        text = new JLabel("Enter the value");
        text.setForeground(Color.CYAN);
        text.setBackground(Color.WHITE);
        text.setOpaque(true);
        text.setVerticalAlignment(JLabel.CENTER);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setBounds(30,90,220,30);
        text.setFont(myfont2);
        text.setBorder(border1);
        
        textTF = new JTextField();
        textTF.setEnabled(true);
        textTF.setBackground(Color.BLACK);
        textTF.setForeground(Color.GREEN);
        textTF.setCaretColor(Color.WHITE);
        textTF.setBounds(270,90,220,30);
        textTF.setFont(myfont3);
        
        answer = new JLabel("Required Result is: ");
        answer.setForeground(Color.CYAN);
        answer.setBackground(Color.WHITE);
        answer.setOpaque(true);
        answer.setVerticalAlignment(JLabel.CENTER);
        answer.setHorizontalAlignment(JLabel.CENTER);
        answer.setBounds(30,130,220,30);
        answer.setFont(myfont2);
        answer.setBorder(border1);
        
        answerTF = new JTextField();
        answerTF.setEnabled(false);
        answerTF.setBackground(Color.BLACK);
        answerTF.setForeground(Color.CYAN);
        answerTF.setCaretColor(Color.WHITE);
        answerTF.setBounds(270,130,220,30);
        answerTF.setFont(myfont3);
        
        from = new JLabel("From:");
        from.setForeground(Color.CYAN);
        from.setBackground(Color.BLACK);
        from.setOpaque(true);
        from.setVerticalAlignment(JLabel.CENTER);
        from.setHorizontalAlignment(JLabel.CENTER);
        from.setBounds(30,200,100,40);
        from.setFont(myfont3);
        from.setBorder(border2);
        
        to = new JLabel("To:");
        to.setForeground(Color.CYAN);
        to.setBackground(Color.BLACK);
        to.setOpaque(true);
        to.setVerticalAlignment(JLabel.CENTER);
        to.setHorizontalAlignment(JLabel.CENTER);
        to.setBounds(30,280,100,40);
        to.setFont(myfont3);
        to.setBorder(border2);
        
        convertDistance = new JButton("Distance Converter");
        convertDistance.setFocusable(false);
        convertDistance.setBounds(30,400,150,50);
        convertDistance.addActionListener(this);
        
        convertMass = new JButton("Mass Converter");
        convertMass.setFocusable(false);
        convertMass.setBounds(350,400,150,50);
        convertMass.addActionListener(this);
        
        convertTime = new JButton("time Converter");
        convertTime.setFocusable(false);
        convertTime.setBounds(190,400,150,50);
        convertTime.addActionListener(this);
        
        reset = new JButton("Reset");
        reset.setFocusable(false);
        reset.setBounds(30,480,150,50);
        reset.addActionListener(this);
        
        exit = new JButton("Exit");
        exit.setFocusable(false);
        exit.setBounds(190,480,150,50);
        exit.addActionListener(this);
        
        backButton = new JButton("Back");
        backButton.setFocusable(false);
        backButton.setBounds(350,480,150,50);
        backButton.addActionListener(this);
        
        distanceFCB = new JComboBox<>(new String[] {"meter","kilometer","centimeter","mile"});
        distanceTCB = new JComboBox<>(new String[] {"meter","kilometer","centimeter","mile"});
     
        timeFCB = new JComboBox<>(new String[] {"second","minute","hour","day","week","month","year"});
        timeTCB = new JComboBox<>(new String[] {"second","minute","hour","day","week","month","year"});
        
        massFCB = new JComboBox<>(new String[] {"kilogram","gram","centigram","ton"});
        massTCB = new JComboBox<>(new String[] {"kilogram","gram","centigram","ton"});
        
        distanceFCB.setBounds(150, 200, 100, 40);
        distanceTCB.setBounds(150, 280, 100, 40); 

        timeFCB.setBounds(260, 200, 100, 40);
        timeTCB.setBounds(260, 280, 100, 40);  

        massFCB.setBounds(370, 200, 100, 40);
        massTCB.setBounds(370, 280, 100, 40); 

        
        frame.add(massFCB);
        frame.add(massTCB);
        frame.add(distanceFCB);
        frame.add(distanceTCB);
        frame.add(timeFCB);
        frame.add(timeTCB);
        frame.add(exit);
        frame.add(reset);
        frame.add(convertDistance);
        frame.add(convertMass);
        frame.add(convertTime);
        frame.add(backButton);
        frame.add(title);
        frame.add(text);
        frame.add(textTF);
        frame.add(from);
        frame.add(to);
        frame.add(answer);
        frame.add(answerTF);
		frame.setJMenuBar(bar);
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
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
			if(e.getSource()==gtavc) {
				frame.dispose();
				new AreaVolumeCalculator();
			}
			if(e.getSource()==reset) {
				textTF.setText("");
				answerTF.setText("");
			}
			
			if(e.getSource()==exit) {

	          frame.setVisible(false);
			}
			if(e.getSource()==backButton) {
				frame.dispose();
				new Calculator_Collection();
			}
			if (e.getSource() == convertDistance) {
				
				try {
					
					answerTF.setEnabled(true);
				    
			        double value = Double.parseDouble(textTF.getText());

			        String fromDistance = (String) distanceFCB.getSelectedItem();
			        String toDistance = (String) distanceTCB.getSelectedItem();

			        String fromMass = (String) massFCB.getSelectedItem();
			        String toMass = (String) massTCB.getSelectedItem();

			        String fromTime = (String) timeFCB.getSelectedItem();
			        String toTime = (String) timeTCB.getSelectedItem();

			        double result = 0.0;

			        // Distance conversion
			        if (fromDistance.equals("meter")){
			        	if(toDistance.equals("meter")) {
			        		
			        		result = value ;
			        		answerTF.setText(result+ "m");
			        		
			        	}else if(toDistance.equals("kilometer")) {
			        		result = value / 1000;
			        		answerTF.setText(result+ "km");
			        		
			        	}
			        	else if(toDistance.equals("centimeter")) {
			        		result = value * 100;
			        		answerTF.setText(result+ "cm");
			        		
			        	}
			        	else if(toDistance.equals("mile")) {
			        		result = value / 1609.34;
			        		answerTF.setText(result+ "mile");
			        		
			        	}
			        }
			        else if (fromDistance.equals("kilometer")){
			        	if(toDistance.equals("meter")) {
			        		
			        		result = value * 1000 ;
			        		answerTF.setText(result+ "m");
			        		
			        	}else if(toDistance.equals("kilometer")) {
			        		result = value;
			        		answerTF.setText(result+ "km");
			        		
			        	}
			        	else if(toDistance.equals("centimeter")) {
			        		result = value * 100000;
			        		answerTF.setText(result+ "cm");
			        		
			        	}
			        	else if(toDistance.equals("mile")) {
			        		result = value / 1.60934;
			        		answerTF.setText(result+ "mile");
			        		
			        	}
			        }
			        else if (fromDistance.equals("centimeter")) {
			            
			            if (toDistance.equals("meter")) {
			                result = value / 100;
			                answerTF.setText(result + "m");
			            } else if (toDistance.equals("kilometer")) {
			                result = value / 100000;
			                answerTF.setText(result + "km");
			            } else if (toDistance.equals("centimeter")) {
			                result = value;
			                answerTF.setText(result + "cm");
			            } else if (toDistance.equals("mile")) {
			            	result = value / 160934;
			            	answerTF.setText(result + "mile");
			               
			            }
			        } else {
			          
			            if (toDistance.equals("meter")) {
			                result = value * 1609.34;
			                answerTF.setText(result + "m");
			            } else if (toDistance.equals("kilometer")) {
			                result = value * 1.60934;
			                answerTF.setText(result + "km");
			            } else if (toDistance.equals("centimeter")) {
			                result = value * 160934;
			                answerTF.setText(result + "cm");
			            } else if (toDistance.equals("mile")) {
			                result = value;
			                answerTF.setText(result + "mile");
			            }
			        }
			         
			  
			        
			        
			        
			        

					
					
				}catch(NumberFormatException ex) {
					
					JOptionPane.showMessageDialog(null, "Error in actionPerformed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		                   
				}
				
				
			     
			       
			}
			if(e.getSource()==convertMass) {
				
				answerTF.setEnabled(true);
			    
		        double value = Double.parseDouble(textTF.getText());

		        String fromDistance = (String) distanceFCB.getSelectedItem();
		        String toDistance = (String) distanceTCB.getSelectedItem();

		        String fromMass = (String) massFCB.getSelectedItem();
		        String toMass = (String) massTCB.getSelectedItem();

		        String fromTime = (String) timeFCB.getSelectedItem();
		        String toTime = (String) timeTCB.getSelectedItem();

		        double result = 0.0;
				
				
				 if (fromMass.equals("kilogram")) {
			            if (toMass.equals("kilogram")) {
			                result = value;
			                answerTF.setText(result + "kg");
			            } else if (toMass.equals("gram")) {
			                result = value * 1000;
			                answerTF.setText(result + "g");
			            } else if (toMass.equals("centigram")) {
			                result = value * 100000;
			                answerTF.setText(result + "cg");
			            } else if (toMass.equals("ton")) {
			                result = value / 1000;
			                answerTF.setText(result + "ton");
			            }
			        } else if (fromMass.equals("gram")) {
			            
			         if (toMass.equals("kilogram")) {
			                result = value / 1000;
			                answerTF.setText(result + "kg");
			            } else if (toMass.equals("gram")) {
			                result = value;
			                answerTF.setText(result + "g");
			            } else if (toMass.equals("centigram")) {
			                result = value * 100;
			                answerTF.setText(result + "cg");
			            } else if (toMass.equals("ton")) {
			                result = value / 1000000;
			                answerTF.setText(result + "ton");
			            }
			        } else if (fromMass.equals("centigram")) {
			            
			            if (toMass.equals("kilogram")) {
			                result = value / 100000;
			                answerTF.setText(result + "kg");
			            } else if (toMass.equals("gram")) {
			                result = value / 100;
			                answerTF.setText(result + "g");
			            } else if (toMass.equals("centigram")) {
			                result = value;
			                answerTF.setText(result + "cg");
			            } else if (toMass.equals("ton")) {
			                result = value / 100000000;
			                answerTF.setText(result + "ton");
			            }
			        } else {
			           
			            if (toMass.equals("kilogram")) {
			                result = value * 1000;
			                answerTF.setText(result + "kg");
			            } else if (toMass.equals("gram")) {
			                result = value * 1000000;
			                answerTF.setText(result + "g");
			            } else if (toMass.equals("centigram")) {
			                result = value * 100000000;
			                answerTF.setText(result + "cg");
			            } else if (toMass.equals("ton")) {
			                result = value;
			                answerTF.setText(result + "ton");
			            }
			        }
				
			}
	        if(e.getSource()==convertTime) {
	        	
	        	answerTF.setEnabled(true);
			    
		        double value = Double.parseDouble(textTF.getText());

		        String fromDistance = (String) distanceFCB.getSelectedItem();
		        String toDistance = (String) distanceTCB.getSelectedItem();

		        String fromMass = (String) massFCB.getSelectedItem();
		        String toMass = (String) massTCB.getSelectedItem();

		        String fromTime = (String) timeFCB.getSelectedItem();
		        String toTime = (String) timeTCB.getSelectedItem();

		        double result = 0.0;
		        
		        
		        if (fromTime.equals("second")) {
		            if (toTime.equals("second")) {
		                result = value;
		                answerTF.setText(result + "s");
		            } else if (toTime.equals("minute")) {
		                result = value / 60;
		                answerTF.setText(result + "min");
		            } else if (toTime.equals("hour")) {
		                result = value / 3600;
		                answerTF.setText(result + "h");
		            } else if (toTime.equals("day")) {
		                result = value / 86400;
		                answerTF.setText(result + "day");
		            } else if (toTime.equals("week")) {
		                result = value / 604800;
		                answerTF.setText(result + "wk");
		            } else if (toTime.equals("month")) {
		                result = value / 2.628e+6;
		                answerTF.setText(result + "mo");
		            } else if (toTime.equals("year")) {
		                result = value / 3.154e+7;
		                answerTF.setText(result + "yr");
		            }
		        } else if (fromTime.equals("minute")) {
		            if (toTime.equals("second")) {
		                result = value * 60;
		                answerTF.setText(result + "s");
		            } else if (toTime.equals("minute")) {
		                result = value;
		                answerTF.setText(result + "min");
		            } else if (toTime.equals("hour")) {
		                result = value / 60;
		                answerTF.setText(result + "h");
		            } else if (toTime.equals("day")) {
		                result = value / 1440;
		                answerTF.setText(result + "day");
		            } else if (toTime.equals("week")) {
		                result = value / 10080;
		                answerTF.setText(result + "wk");
		            } else if (toTime.equals("month")) {
		                result = value / 43800;
		                answerTF.setText(result + "mo");
		            } else if (toTime.equals("year")) {
		                result = value / 525600;
		                answerTF.setText(result + "yr");
		            }
		        }
		        else if (fromTime.equals("hour")) {
		            if (toTime.equals("second")) {
		                result = value * 3600;
		                answerTF.setText(result + "s");
		            } else if (toTime.equals("minute")) {
		                result = value * 60;
		                answerTF.setText(result + "min");
		            } else if (toTime.equals("hour")) {
		                result = value;
		                answerTF.setText(result + "h");
		            } else if (toTime.equals("day")) {
		                result = value / 24;
		                answerTF.setText(result + "day");
		            } else if (toTime.equals("week")) {
		                result = value / 168;
		                answerTF.setText(result + "wk");
		            } else if (toTime.equals("month")) {
		                result = value / 730.5;
		                answerTF.setText(result + "mo");
		            } else if (toTime.equals("year")) {
		                result = value / 8760;
		                answerTF.setText(result + "yr");
		            }
		        }
		        else if (fromTime.equals("day")) {
	                if (toTime.equals("second")) {
	                    result = value * 86400;
	                    answerTF.setText(result + "s");
	                } else if (toTime.equals("minute")) {
	                    result = value * 1440;
	                    answerTF.setText(result + "min");
	                } else if (toTime.equals("hour")) {
	                    result = value * 24;
	                    answerTF.setText(result + "h");
	                } else if (toTime.equals("day")) {
	                    result = value;
	                    answerTF.setText(result + "day");
	                } else if (toTime.equals("week")) {
	                    result = value / 7;
	                    answerTF.setText(result + "wk");
	                } else if (toTime.equals("month")) {
	                    result = value / 30.44;
	                    answerTF.setText(result + "mo");
	                } else if (toTime.equals("year")) {
	                    result = value / 365.25;
	                    answerTF.setText(result + "yr");
	                }
	            }
		        else if (fromTime.equals("week")) {
		            if (toTime.equals("second")) {
		                result = value * 604800; 
		                answerTF.setText(result + "s");
		            } else if (toTime.equals("minute")) {
		                result = value * 10080; 
		                answerTF.setText(result + "min");
		            } else if (toTime.equals("hour")) {
		                result = value * 168; 
		                answerTF.setText(result + "h");
		            } else if (toTime.equals("day")) {
		                result = value * 7;
		                answerTF.setText(result + "day");
		            } else if (toTime.equals("week")) {
		                result = value; 
		                answerTF.setText(result + "wk");
		            } else if (toTime.equals("month")) {
		                result = value / 4.34524; 
		                answerTF.setText(result + "mo");
		            } else if (toTime.equals("year")) {
		                result = value / 52.1775; 
		                answerTF.setText(result + "yr");
		            }
		        } else if (fromTime.equals("month")) {
		            if (toTime.equals("second")) {
		                result = value * 2.628e+6; 
		                answerTF.setText(result + "s");
		            } else if (toTime.equals("minute")) {
		                result = value * 43800;
		                answerTF.setText(result + "min");
		            } else if (toTime.equals("hour")) {
		                result = value * 730.5; 
		                answerTF.setText(result + "h");
		            } else if (toTime.equals("day")) {
		                result = value * 30.44; 
		                answerTF.setText(result + "day");
		            } else if (toTime.equals("week")) {
		                result = value / 4.34524; 
		                answerTF.setText(result + "wk");
		            } else if (toTime.equals("month")) {
		                result = value;
		                answerTF.setText(result + "mo");
		            } else if (toTime.equals("year")) {
		                result = value / 12; 
		                answerTF.setText(result + "yr");
		            }
		        } else  {
		            if (toTime.equals("second")) {
		                result = value * 3.154e+7; 
		                answerTF.setText(result + "s");
		            } else if (toTime.equals("minute")) {
		                result = value * 525600; 
		                answerTF.setText(result + "min");
		            } else if (toTime.equals("hour")) {
		                result = value * 8760;
		                answerTF.setText(result + "h");
		            } else if (toTime.equals("day")) {
		                result = value * 365.25; 
		                answerTF.setText(result + "day");
		            } else if (toTime.equals("week")) {
		                result = value * 52.1775; 
		                answerTF.setText(result + "wk");
		            } else if (toTime.equals("month")) {
		                result = value * 12; 
		                answerTF.setText(result + "mo");
		            } else if (toTime.equals("year")) {
		                result = value;
		                answerTF.setText(result + "yr");
		            }
		        }
		         
			}
			
			
		}catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }
		
		
	}
}
	
		

		
	


