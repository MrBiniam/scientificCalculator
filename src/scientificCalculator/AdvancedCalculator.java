package scientificCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class AdvancedCalculator {
	
	JFrame adcframe;
	JTextField adcTF1; 
	JPanel adcPanel;
	JButton numbersButton[] = new JButton[10];
	JButton functionButton[] = new JButton[37];
	JButton sinButton,cosButton,tanButton,sinhButton,coshButton,tanhButton;
	JButton radButton,logButton,numberoverxButton,exponentialButton,factorialButton,eoverxButton;
	JButton radicalButton,squareButton,radical3Button,powerButton,pieButton,eButton,lnButton;
	JButton variableovervariable,absButton,floorButton,ceilButton,maxButton,minButton;
	JButton negativeButton,dotButton,equalButton;
	JButton percButton,clrButton,brackButton;
	JButton addButton,subButton,mulButton,divButton,delButton;
	JButton backtoMain;
	
	JMenu back,goTo;
	JMenuItem btm,gtcc;
	JMenuBar bar;
	
	Font myfont4 = new Font("Ink Free",Font.PLAIN,30);
	Font myfont5 = new Font("Consolas",Font.BOLD,30);
	Font myfont6 = new Font("MV Boli",Font.BOLD,12);
	
	double expression;
	char operator1;
	
	double num1=0,num2=0,result=0;
    char operator;
        
	    AdvancedCalculator() {
		
	    adcframe = new JFrame("Biniam's Advanced Operations");
		adcframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adcframe.getContentPane().setBackground(Color.WHITE);
		adcframe.setSize(560,680);
		adcframe.setLocationRelativeTo(null);
		adcframe.setLayout(null);
		
		LinclonLegacy lived = new LinclonLegacy();
		
		back = new JMenu("Back");
		goTo = new JMenu("Go to");
		
		btm = new JMenuItem("Back to Scientific Calculator");
		btm.addActionListener(lived);
		gtcc = new JMenuItem("Calculator Collections-->");
		gtcc.addActionListener(lived);
		
		back.add(btm);
		goTo.add(gtcc);
		
		bar = new JMenuBar();
		bar.add(back);
		bar.add(goTo);
		
	    adcTF1 = new JTextField();
		adcTF1.setBounds(60,20,440,80);
		adcTF1.setEditable(false);
		adcTF1.setBackground(Color.BLACK);
		adcTF1.setForeground(Color.GREEN);
		adcTF1.setFont(myfont5);
		adcTF1.setCaretColor(Color.WHITE);
		adcTF1.setHorizontalAlignment(JTextField.RIGHT);
		
	    clrButton = new JButton("C");
        percButton = new JButton("%");
        brackButton = new JButton("()");
		negativeButton = new JButton("+/-");
		dotButton = new JButton(".");
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		equalButton = new JButton("=");
		delButton = new JButton("<---");
		sinButton = new JButton("sin");
		cosButton = new JButton("cos");
		tanButton = new JButton("tan");
		sinhButton = new JButton("sinh");
		coshButton = new JButton("cosh");
		tanhButton = new JButton("tanh");
		radButton = new JButton("Rad");
		logButton = new JButton("log");
		numberoverxButton = new JButton("1/x");
		exponentialButton = new JButton("2^x");
		factorialButton = new JButton("X!");
		eoverxButton = new JButton("e^x");
		radicalButton = new JButton("_2/");
		radical3Button = new JButton("_3/");
		powerButton = new JButton("X^n");
		pieButton = new JButton("(3.14)");
		eButton = new JButton("e");
        variableovervariable = new JButton("X^y");
        lnButton = new JButton("ln");
        absButton = new JButton("|X|");
        floorButton = new JButton("floor");
        ceilButton = new JButton("ceil");
        maxButton = new JButton("MAX");
        minButton = new JButton("min");
        backtoMain = new JButton("Back");
        squareButton = new JButton("X^2");
        
        
        
        functionButton[0] = addButton;
        functionButton[0].setBackground(Color.CYAN);
        functionButton[0].setForeground(Color.BLACK);
        functionButton[0].setFocusable(false);
        functionButton[0].addActionListener(lived);
		functionButton[1] = subButton;
		functionButton[1].setBackground(Color.CYAN);
        functionButton[1].setForeground(Color.BLACK);
        functionButton[1].setFocusable(false);
        functionButton[1].addActionListener(lived);
		functionButton[2] = mulButton;
		functionButton[2].setBackground(Color.CYAN);
        functionButton[2].setForeground(Color.BLACK);
        functionButton[2].setFocusable(false);
        functionButton[2].addActionListener(lived);
		functionButton[3] = divButton;
		functionButton[3].setBackground(Color.CYAN);
        functionButton[3].setForeground(Color.BLACK);
        functionButton[3].setFocusable(false);
        functionButton[3].addActionListener(lived);
		functionButton[4] = dotButton;
		functionButton[4].setBackground(Color.CYAN);
        functionButton[4].setForeground(Color.BLACK);
        functionButton[4].setFocusable(false);
        functionButton[4].addActionListener(lived);
		functionButton[5] = equalButton;
		functionButton[5].setBackground(Color.CYAN);
        functionButton[5].setForeground(Color.BLACK);
        functionButton[5].setFocusable(false);
        functionButton[5].addActionListener(lived);
		functionButton[6] = delButton;
		functionButton[6].setBackground(Color.CYAN);
        functionButton[6].setForeground(Color.BLACK);
        functionButton[6].setFocusable(false);
        functionButton[6].addActionListener(lived);
		functionButton[7] = clrButton;
		functionButton[7].setBackground(Color.CYAN);
        functionButton[7].setForeground(Color.BLACK);
        functionButton[7].setFocusable(false);
        functionButton[7].addActionListener(lived);
		functionButton[8] = negativeButton;
		functionButton[8].setBackground(Color.CYAN);
        functionButton[8].setForeground(Color.BLACK);
        functionButton[8].setFocusable(false);
        functionButton[8].addActionListener(lived);
		functionButton[9] = sinButton;
		functionButton[9].setBackground(Color.CYAN);
        functionButton[9].setForeground(Color.BLACK);
        functionButton[9].setFocusable(false);
        functionButton[9].addActionListener(lived);
		functionButton[10] = tanButton;
		functionButton[10].setBackground(Color.CYAN);
        functionButton[10].setForeground(Color.BLACK);
        functionButton[10].setFocusable(false);
        functionButton[10].addActionListener(lived);
		functionButton[11] = sinhButton;
		functionButton[11].setBackground(Color.CYAN);
        functionButton[11].setForeground(Color.BLACK);
        functionButton[11].setFocusable(false);
        functionButton[11].addActionListener(lived);
		functionButton[12] = coshButton;
		functionButton[12].setBackground(Color.CYAN);
        functionButton[12].setForeground(Color.BLACK);
        functionButton[12].setFocusable(false);
        functionButton[12].addActionListener(lived);
		functionButton[13] = tanhButton;
		functionButton[13].setBackground(Color.CYAN);
        functionButton[13].setForeground(Color.BLACK);
        functionButton[13].setFocusable(false);
        functionButton[13].addActionListener(lived);
		functionButton[14] = radButton;
		functionButton[14].setBackground(Color.CYAN);
        functionButton[14].setForeground(Color.BLACK);
        functionButton[14].setFocusable(false);
        functionButton[14].addActionListener(lived);
		functionButton[15] = logButton;
		functionButton[15].setBackground(Color.CYAN);
        functionButton[15].setForeground(Color.BLACK);
        functionButton[15].setFocusable(false);
        functionButton[15].addActionListener(lived);
		functionButton[16] = numberoverxButton;
		functionButton[16].setBackground(Color.CYAN);
        functionButton[16].setForeground(Color.BLACK);
        functionButton[16].setFocusable(false);
        functionButton[16].addActionListener(lived);
		functionButton[17] = exponentialButton;
		functionButton[17].setBackground(Color.CYAN);
        functionButton[17].setForeground(Color.BLACK);
        functionButton[17].setFocusable(false);
        functionButton[17].addActionListener(lived);
		functionButton[18] = factorialButton;
		functionButton[18].setBackground(Color.CYAN);
        functionButton[18].setForeground(Color.BLACK);
        functionButton[18].setFocusable(false);
        functionButton[18].addActionListener(lived);
		functionButton[19] = eoverxButton;
		functionButton[19].setBackground(Color.CYAN);
        functionButton[19].setForeground(Color.BLACK);
        functionButton[19].setFocusable(false);
        functionButton[19].addActionListener(lived);
		functionButton[20] = radicalButton;
		functionButton[20].setBackground(Color.CYAN);
        functionButton[20].setForeground(Color.BLACK);
        functionButton[20].setFocusable(false);
        functionButton[20].addActionListener(lived);
		functionButton[21] = radical3Button;
		functionButton[21].setBackground(Color.CYAN);
        functionButton[21].setForeground(Color.BLACK);
        functionButton[21].setFocusable(false);
        functionButton[21].addActionListener(lived);
		functionButton[22] = powerButton;
		functionButton[22].setBackground(Color.CYAN);
        functionButton[22].setForeground(Color.BLACK);
        functionButton[22].setFocusable(false);
        functionButton[22].addActionListener(lived);
		functionButton[23] = pieButton;
		functionButton[23].setBackground(Color.CYAN);
        functionButton[23].setForeground(Color.BLACK);
        functionButton[23].setFocusable(false);
        functionButton[23].addActionListener(lived);
		functionButton[24] = eButton;
		functionButton[24].setBackground(Color.CYAN);
        functionButton[24].setForeground(Color.BLACK);
        functionButton[24].setFocusable(false);
        functionButton[24].addActionListener(lived);
		functionButton[25] = variableovervariable;
		functionButton[25].setBackground(Color.cyan);
        functionButton[25].setForeground(Color.BLACK);
        functionButton[25].setFocusable(false);
        functionButton[25].addActionListener(lived);
		functionButton[26] = lnButton;
		functionButton[26].setBackground(Color.CYAN);
        functionButton[26].setForeground(Color.BLACK);
        functionButton[26].setFocusable(false);
        functionButton[26].addActionListener(lived);
		functionButton[27] = absButton;
		functionButton[27].setBackground(Color.CYAN);
        functionButton[27].setForeground(Color.BLACK);
        functionButton[27].setFocusable(false);
        functionButton[27].addActionListener(lived);
		functionButton[28] = floorButton;
		functionButton[28].setBackground(Color.CYAN);
        functionButton[28].setForeground(Color.BLACK);
        functionButton[28].setFocusable(false);
        functionButton[28].addActionListener(lived);
		functionButton[29] = ceilButton;
		functionButton[29].setBackground(Color.CYAN);
        functionButton[29].setForeground(Color.BLACK);
        functionButton[29].setFocusable(false);
        functionButton[29].addActionListener(lived);
		functionButton[30] = maxButton;
		functionButton[30].setBackground(Color.CYAN);
        functionButton[30].setForeground(Color.BLACK);
        functionButton[30].setFocusable(false);
        functionButton[30].addActionListener(lived);
		functionButton[31] = minButton;
		functionButton[31].setBackground(Color.CYAN);
        functionButton[31].setForeground(Color.BLACK);
        functionButton[31].setFocusable(false);
        functionButton[31].addActionListener(lived);
		functionButton[32] = backtoMain;
		functionButton[32].setBackground(Color.CYAN);
        functionButton[32].setForeground(Color.BLACK);
        functionButton[32].setFocusable(false);
        functionButton[32].addActionListener(lived);
		functionButton[33] = squareButton;
		functionButton[33].setBackground(Color.CYAN);
        functionButton[33].setForeground(Color.BLACK);
        functionButton[33].setFocusable(false);
        functionButton[33].addActionListener(lived);
		functionButton[34] = cosButton;
		functionButton[34].setBackground(Color.CYAN);
        functionButton[34].setForeground(Color.BLACK);
        functionButton[34].setFocusable(false);
        functionButton[34].addActionListener(lived);
		functionButton[35] = brackButton;
		functionButton[35].setBackground(Color.CYAN);
        functionButton[35].setForeground(Color.BLACK);
        functionButton[35].setFocusable(false);
        functionButton[35].addActionListener(lived);
	    functionButton[36] = percButton;
	    functionButton[36].setBackground(Color.CYAN);
        functionButton[36].setForeground(Color.BLACK);
        functionButton[36].setFocusable(false);
        functionButton[36].addActionListener(lived);
	
		
	
		
		
    	for(int i=0;i<functionButton.length;i++) {
			
    		functionButton[i] = new JButton();
			functionButton[i].addActionListener(lived);
			functionButton[i].setFocusable(false);
			functionButton[i].setFont(myfont5);
			functionButton[i].setForeground(Color.GREEN);
			functionButton[i].setBackground(Color.BLACK);
			
		}
      
        
	     for(int i=0;i<10;i++) {
			
			numbersButton[i] = new JButton(String.valueOf(i));
			numbersButton[i].addActionListener(lived);
			numbersButton[i].setFocusable(false);
			numbersButton[i].setFont(myfont4);
			numbersButton[i].setForeground(Color.BLACK);
			numbersButton[i].setBackground(Color.orange);
		}
        
		
		
        
        
        adcPanel = new JPanel();
		adcPanel.setBounds(60,120,440,480);
		adcPanel.setLayout(new GridLayout(8,6,5,5));
		
		
		
		adcPanel.add(backtoMain);
		adcPanel.add(sinButton);
		adcPanel.add(cosButton);
		adcPanel.add(tanButton);
		adcPanel.add(sinhButton);
		adcPanel.add(coshButton);
		adcPanel.add(tanhButton);
		adcPanel.add(radButton);
		adcPanel.add(logButton);
		adcPanel.add(numberoverxButton);
		adcPanel.add(exponentialButton);
		adcPanel.add(factorialButton);
		adcPanel.add(eoverxButton);
		adcPanel.add(radicalButton);
		adcPanel.add(squareButton);
		adcPanel.add(clrButton);
		adcPanel.add(brackButton);
		adcPanel.add(percButton);
		adcPanel.add(divButton);
		adcPanel.add(numbersButton[7]);
		adcPanel.add(numbersButton[8]);
		adcPanel.add(numbersButton[9]);
		adcPanel.add(radical3Button);
		adcPanel.add(powerButton);
        adcPanel.add(mulButton);
		adcPanel.add(numbersButton[4]);
		adcPanel.add(numbersButton[5]);
		adcPanel.add(numbersButton[6]);
		adcPanel.add(maxButton);
		adcPanel.add(pieButton);
		adcPanel.add(subButton);
		adcPanel.add(numbersButton[1]);
		adcPanel.add(numbersButton[2]);
		adcPanel.add(numbersButton[3]);
		adcPanel.add(minButton);
		adcPanel.add(eButton);
		adcPanel.add(addButton);
		adcPanel.add(variableovervariable);
		adcPanel.add(numbersButton[0]);
		adcPanel.add(lnButton);
		adcPanel.add(negativeButton);
		adcPanel.add(dotButton);
		adcPanel.add(equalButton);
		adcPanel.add(absButton);
		adcPanel.add(floorButton);
		adcPanel.add(ceilButton);
		adcPanel.add(delButton);      
		
        
		
        adcframe.setJMenuBar(bar);      
	    adcframe.add(adcTF1);
	    adcframe.add(adcPanel);
		adcframe.setVisible(true);
	
		
		
	}
	
	
	public class LinclonLegacy implements ActionListener{
		
		private double getMax(double a, double b) {
	        return Math.max(a, b);
	    }

	    private double getMin(double a, double b) {
	        return Math.min(a, b);
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btm) {
			
			adcframe.dispose();
			new Scientific_Calculator();
		}
		if(e.getSource()==gtcc) {
			
			adcframe.dispose();
			new Calculator_Collection();
		}
		
		if(e.getSource()==backtoMain) {
			
			new Scientific_Calculator();
			adcframe.dispose();
		
		} 
		for(int i =0;i<numbersButton.length;i++) {
			if(e.getSource()==numbersButton[i]) {
				adcTF1.setBackground(Color.BLACK);
				adcTF1.setForeground(Color.GREEN);
				adcTF1.setText(adcTF1.getText().concat(String.valueOf(i)));
			}
			
		}
		
		if(e.getSource()==negativeButton) {
			
			double temp = Double.parseDouble(adcTF1.getText());
			temp = temp*-1;
			adcTF1.setText(String.valueOf(temp));
		}
		if(e.getSource()==dotButton) {
			
			adcTF1.setText(adcTF1.getText().concat("."));
			
		}
		
		if(e.getSource()==delButton) {
			
			String deletedNumber = adcTF1.getText();
			adcTF1.setText("");
	        for(int i =0;i<deletedNumber.length()-1; i++) {
	        	adcTF1.setText(adcTF1.getText()+deletedNumber.charAt(i));
	        
		}
		
		}
	
		
       if(e.getSource()==clrButton) {
    	   adcTF1.setText("");
		}
       
       // YALTESERA      88888888888888888888888888888888888888888888
       if(e.getSource()==sinButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.sin(Math.toRadians(input)); 
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==cosButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
    	    double result = Math.cos(Math.toRadians(input)); 
    	    adcTF1.setText(String.valueOf(result)); 
		}
       if(e.getSource()==tanButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.tan(Math.toRadians(input)); 
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==sinhButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.sinh(input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==coshButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.cosh(input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==tanhButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.tanh(input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==radButton) {
    	   
		}
       if(e.getSource()==logButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.log10(input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==numberoverxButton) {
    	   
    	   double input = Double.parseDouble(adcTF1.getText());
           if (input != 0) {
               double result = 1 / input;
               adcTF1.setText(String.valueOf(result));
           } else {
               
               adcTF1.setText("Error");
           }
		}
       if(e.getSource()==exponentialButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.pow(2, input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==factorialButton) {
    	   int input = Integer.parseInt(adcTF1.getText());
           if (input >= 0) {
               long result = factorial(input);
               adcTF1.setText(String.valueOf(result));
           } else {
               // Handle negative input for factorial if necessary
               adcTF1.setText("Error");
           }
		}
       
       if(e.getSource()==eoverxButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.exp(input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==radicalButton) {
           double input = Double.parseDouble(adcTF1.getText());
           if (input >= 0) {
               double result = Math.sqrt(input);
               adcTF1.setText(String.valueOf(result));
           } else {
               // Handle negative input for square root if necessary
               adcTF1.setText("Error");
           }

		}
       if(e.getSource()==squareButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.pow(input, 2);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==brackButton) {
    	   String currentText = adcTF1.getText();
           adcTF1.setText(currentText + "(");
		}
       if(e.getSource()==percButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = input / 100;
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==radical3Button) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.cbrt(input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==powerButton) {
    	   double base = Double.parseDouble(adcTF1.getText());
           
           double exponent = 2;
           double result = Math.pow(base, exponent);
           adcTF1.setText(String.valueOf(result));
		}
       
       if(e.getSource()==maxButton) {
    	   double num1 = 10.5; // Replace with actual values
           double num2 = 8.7;  // Replace with actual values
           double result = getMax(num1, num2);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==pieButton) {
    	   adcTF1.setText(String.valueOf(Math.PI));
		}
       if(e.getSource()==minButton) {
    	   double num1 = 10.5; // Replace with actual values
           double num2 = 8.7;  // Replace with actual values
           double result = getMin(num1, num2);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==eButton) {
    	   adcTF1.setText(String.valueOf(Math.E));
		}
       if(e.getSource()==variableovervariable) {
    	   double base = Double.parseDouble(adcTF1.getText());
           // You would need to specify the exponent, for example, let's use 2 for demonstration
           double exponent = 2;
           double result = Math.pow(base, exponent);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==lnButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.log(input);
           adcTF1.setText(String.valueOf(result));
		}
       
       if(e.getSource()==addButton) {
	    	
	    	num1 = Double.parseDouble(adcTF1.getText());
	    	operator = '+';
	    	adcTF1.setText("");
	    	
	    }
       if(e.getSource()==subButton) {
	    	
	    	num1 = Double.parseDouble(adcTF1.getText());
	    	operator = '-';
	    	adcTF1.setText("");
	    	
	    }
       if(e.getSource()==mulButton) {

        	num1 = Double.parseDouble(adcTF1.getText());
            operator = '*';
            adcTF1.setText("");
         }
        if(e.getSource()==divButton) {
	    	
	    	num1 = Double.parseDouble(adcTF1.getText());
	    	operator = '/';
	    	adcTF1.setText("");
	    	
	    }
       if(e.getSource()==equalButton) {
    	   
    	   num2 = Double.parseDouble(adcTF1.getText());
	        
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
	    	
	        adcTF1.setText(String.valueOf(result));
	    	num1 = result;
    	   
		}
       if(e.getSource()==absButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.abs(input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==floorButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.floor(input);
           adcTF1.setText(String.valueOf(result));
		}
       if(e.getSource()==ceilButton) {
    	   double input = Double.parseDouble(adcTF1.getText());
           double result = Math.ceil(input);
           adcTF1.setText(String.valueOf(result));
		}
       
       
      
	
	}
	 private long factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return n * factorial(n - 1);
	    }
			
		}
		


	
}
