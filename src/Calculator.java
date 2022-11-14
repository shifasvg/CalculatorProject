import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class Calculator implements ActionListener{

	
	double num1=0, num2=0, result=0;
	int calculation;
	
	
	JFrame frame;
	JLabel label;
	JTextField textfield; 
	JButton sevenButton; JButton eightButton; JButton nineButton; JButton fourButton;JButton fiveButton; 
	JButton sixButton; JButton oneButton; JButton twoButton; JButton threeButton; JButton zeroButton;
	JButton dotButton; JButton equalButton; JButton multiButton; JButton subtractionButton; JButton additionButton;
	JButton divisionButton; JButton percentageButton; JButton backButton; JButton clearButton;
	public Calculator() {
		frame=new JFrame("Calculator");
		frame.setLayout(null);
		frame.setSize(341, 486);
		frame.setLocation(302, 151);
		frame.getContentPane().setBackground(Color.BLACK);
		
		
		label=new JLabel();
		label.setBounds(0, 0, 327, 72);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.white);
		label.setFont(new Font("Arial", Font.PLAIN, 31));
		frame.add(label);
		
		textfield=new JTextField();
		textfield.setBounds(0, 72, 327, 37);
		textfield.setBackground(Color.black);
		textfield.setHorizontalAlignment(SwingConstants.RIGHT);
		textfield.setForeground(Color.white);
		textfield.setFont(new Font("Arial", Font.PLAIN, 31));
		textfield.setEditable(false);
		frame.add(textfield);
		
		clearButton=new JButton("AC");
		clearButton.setBounds(0, 109, 82, 68);
		clearButton.setBackground(Color.GRAY);
		clearButton.setForeground(Color.orange);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 25));
		clearButton.addActionListener(this);
		frame.add(clearButton);
		
		
		backButton=new JButton("←");
		backButton.setBounds(82, 109, 82, 68);
		backButton.setBackground(Color.GRAY);
		backButton.setForeground(Color.ORANGE);
		backButton.setFont(new Font("Arial", Font.PLAIN, 30));
		backButton.addActionListener(this);
		frame.add(backButton);
		
		percentageButton=new JButton("%");
		percentageButton.setBounds(164, 109, 82, 68);
		percentageButton.setBackground(Color.GRAY);
		percentageButton.setForeground(Color.orange);
		percentageButton.setFont(new Font("Arial", Font.PLAIN, 25));
		percentageButton.addActionListener(this);
		frame.add(percentageButton);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(0, 177, 82, 68);
		sevenButton.setBackground(Color.darkGray);
		sevenButton.setForeground(Color.white);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 25));
		sevenButton.addActionListener(this);
		frame.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(82, 177, 82, 68);
		eightButton.setBackground(Color.darkGray);
		eightButton.setForeground(Color.white);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 25));
		eightButton.addActionListener(this);
		frame.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(164, 177, 82, 68);
		nineButton.setBackground(Color.darkGray);
		nineButton.setForeground(Color.white);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 25));
		nineButton.addActionListener(this);
		frame.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(0, 245, 82, 68);
		fourButton.setBackground(Color.darkGray);
		fourButton.setForeground(Color.white);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 25));
		fourButton.addActionListener(this);
		frame.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(82, 245, 82, 68);
		fiveButton.setBackground(Color.darkGray);
		fiveButton.setForeground(Color.white);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 25));
		fiveButton.addActionListener(this);
		frame.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(164, 245, 82, 68);
		sixButton.setBackground(Color.darkGray);
		sixButton.setForeground(Color.white);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 25));
		sixButton.addActionListener(this);
		frame.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(0, 313, 82, 68);
		oneButton.setBackground(Color.darkGray);
		oneButton.setForeground(Color.white);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 25));
		oneButton.addActionListener(this);
		frame.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(82, 313, 82, 68);
		twoButton.setBackground(Color.darkGray);
		twoButton.setForeground(Color.white);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 25));
		twoButton.addActionListener(this);
		frame.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(164, 313, 82, 68);
		threeButton.setBackground(Color.darkGray);
		threeButton.setForeground(Color.white);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 25));
		threeButton.addActionListener(this);
		frame.add(threeButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(0, 381, 164, 68);
		zeroButton.setBackground(Color.darkGray);
		zeroButton.setForeground(Color.white);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 25));
		zeroButton.addActionListener(this);
		frame.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(164, 381, 82, 68);
		dotButton.setBackground(Color.darkGray);
		dotButton.setForeground(Color.white);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.addActionListener(this);
		frame.add(dotButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(246, 381, 82, 68);
		equalButton.setBackground(Color.orange);
		equalButton.setForeground(Color.white);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalButton.addActionListener(this);
		frame.add(equalButton);
		
		divisionButton=new JButton("÷");
		divisionButton.setBounds(246, 109, 82, 68);
		divisionButton.setBackground(Color.orange);
		divisionButton.setForeground(Color.white);
		divisionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divisionButton.addActionListener(this);
		frame.add(divisionButton);
		
		multiButton=new JButton("×");
		multiButton.setBounds(246, 177, 82, 68);
		multiButton.setBackground(Color.orange);
		multiButton.setForeground(Color.white);
		multiButton.setFont(new Font("Arial", Font.PLAIN, 30));
		multiButton.addActionListener(this);
		frame.add(multiButton);
		
		subtractionButton=new JButton("–");
		subtractionButton.setBounds(246, 245, 82, 68);
		subtractionButton.setBackground(Color.orange);
		subtractionButton.setForeground(Color.white);
		subtractionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		subtractionButton.addActionListener(this);
		frame.add(subtractionButton);
		
		additionButton=new JButton("+");
		additionButton.setBounds(246, 313, 82, 68);
		additionButton.setBackground(Color.orange);
		additionButton.setForeground(Color.white);
		additionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		additionButton.addActionListener(this);
		frame.add(additionButton);
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
public static void main(String[] args) {
	new Calculator();
}


@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==sevenButton) {
		textfield.setText(textfield.getText()+"7");
	}
	
	else if(e.getSource()==eightButton) {
		textfield.setText(textfield.getText() + "8");
		}
		
	else if(e.getSource()==nineButton) {
		textfield.setText(textfield.getText() + "9");
	}
	
	else if(e.getSource()==fourButton) {
		textfield.setText(textfield.getText() + "4");;
	}
	else if(e.getSource()==fiveButton) {
		textfield.setText(textfield.getText() + "5");
	}
	else if(e.getSource()==sixButton) {
		textfield.setText(textfield.getText() + "6");
	}
	else if(e.getSource()==oneButton) {
		textfield.setText(textfield.getText() + "1");
	}
	else if(e.getSource()==twoButton) {
		textfield.setText(textfield.getText() + "2");
	}
	else if(e.getSource()==threeButton) {
		textfield.setText(textfield.getText() + "3");
	}
	
	else if(e.getSource()==zeroButton) {
		if(textfield.getText().equals("0")) {
			return;
		}
		else {
			textfield.setText(textfield.getText() + "0");
		}
		
	}
	else if(e.getSource()==dotButton) {
		if(textfield.getText().contains(".")) {
			return;
		}else {
			textfield.setText(textfield.getText() + ".");
		}
		}
	
    else if(e.getSource()==clearButton) {
	label.setText("");
	textfield.setText("");
}
    else if(e.getSource()==backButton) {
	int length=textfield.getText().length();
	int number=length-1;
	if(length>0) {
		StringBuilder back=new StringBuilder(textfield.getText());
		back.deleteCharAt(number);
		textfield.setText(back.toString());
	}
	if(textfield.getText().endsWith(""));
	label.setText("");
}
	
	else if(e.getSource()==percentageButton) {
       num1=Double.parseDouble(textfield.getText());
       result=num1/100;
       textfield.setText("");
	   label.setText(result+"%");
}
	
	else if(e.getSource()==divisionButton) {
		String str=textfield.getText();
		num1=Double.parseDouble(textfield.getText());
		calculation=4;
		textfield.setText("");
		label.setText(label.getText()+str+"÷");
	}
	else if(e.getSource()==multiButton) {
		String str=textfield.getText();
		num1=Double.parseDouble(textfield.getText());
		calculation=3;
		textfield.setText("");
		label.setText(label.getText()+str+"×");
	}
	
	else if(e.getSource()==subtractionButton) {
		String str=textfield.getText();
		num1=Double.parseDouble(textfield.getText());
		calculation=2;
		textfield.setText("");
		label.setText(label.getText()+str+"-");
	}
	else if(e.getSource()==additionButton) {
	String str=textfield.getText();
	num1=Double.parseDouble(textfield.getText());
	calculation=1;
	textfield.setText("");
	label.setText(label.getText()+str+ "+");	
	}
	else if(e.getSource()==equalButton) {
		num2=Double.parseDouble(textfield.getText());
		switch(calculation) {
		case 1:
			result=num1+num2;
			break;
		case 2:
			result=num1-num2;
			break;
		case 3:
			result=num1*num2;
			break;
		case 4:
			result=num1/num2;
			break;
		
		}if(Double.toString(result).endsWith(".0")){
				textfield.setText(Double.toString(result).replace(".0",""));
	}else {
		textfield.setText(Double.toString(result));
	}
		label.setText("");
		num1=result;
		}

	
}
}
