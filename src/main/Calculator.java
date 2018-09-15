package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
	
	private static String action = "";
	private static double num1;
	private static double num2;
	private static double result;
	private static double copyBuffer;
	
	public Calculator() {
		JFrame main = new JFrame("Calculator");
		main.setSize(320, 265);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setLayout(new FlowLayout());
		JLabel output = new JLabel("");
		JLabel operation = new JLabel("");
		JLabel num1Label = new JLabel("");
		JPanel outputbox = new JPanel();
		outputbox.setBackground(Color.WHITE);
		outputbox.setPreferredSize(new Dimension(300, 25));
		outputbox.add(num1Label);
		outputbox.add(operation);
		outputbox.add(output);
		JButton zeroButton = new JButton("0");
		JButton oneButton = new JButton("1");
		JButton twoButton = new JButton("2");
		JButton threeButton = new JButton("3");
		JButton fourButton = new JButton("4");
		JButton fiveButton = new JButton("5");
		JButton sixButton = new JButton("6");
		JButton sevenButton = new JButton("7");
		JButton eightButton = new JButton("8");
		JButton nineButton = new JButton("9");
		JButton addition = new JButton("+");
		JButton subtraction = new JButton("-");
		JButton division = new JButton("/");
		JButton multiplication = new JButton("x");
		JButton equals = new JButton("=");
		JButton clear = new JButton("C");
		JButton point = new JButton(".");
		JButton copy = new JButton("Copy");
		JButton paste = new JButton("Paste");
		JLabel error = new JLabel("");
		error.setPreferredSize(new Dimension(300, 25));
		error.setForeground(Color.RED);
		main.add(outputbox);
		main.add(clear);
		main.add(copy);
		main.add(paste);
		main.add(oneButton);
		main.add(twoButton);
		main.add(threeButton);
		main.add(addition);
		main.add(fourButton);
		main.add(fiveButton);
		main.add(sixButton);
		main.add(subtraction);
		main.add(sevenButton);
		main.add(eightButton);
		main.add(nineButton);
		main.add(multiplication);
		main.add(zeroButton);
		main.add(point);
		main.add(division);
		main.add(equals);
		main.add(error);
		main.setVisible(true);
		
		equals.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (action == "add" && num1 != 0) {
					num2 = Double.parseDouble(output.getText());
					result = num1 + num2;
					num1Label.setText("");
					operation.setText("");
					output.setText(Double.toString(result));
					num1 = Double.parseDouble(output.getText());
					num2 = 0;
				}
				else if (action == "subtract" && num1 != 0) {
					num2 = Double.parseDouble(output.getText());
					result = num1 - num2;
					num1Label.setText("");
					operation.setText("");
					output.setText(Double.toString(result));
					num1 = Double.parseDouble(output.getText());
					num2 = 0;
				}
				else if (action == "divide" && num1 != 0) {
					num2 = Double.parseDouble(output.getText());
					result = num1 / num2;
					num1Label.setText("");
					operation.setText("");
					output.setText(Double.toString(result));
					num1 = Double.parseDouble(output.getText());
					num2 = 0;
				}
				else if (action == "multiply" && num1 != 0) {
					num2 = Double.parseDouble(output.getText());
					result = num1 * num2;
					num1Label.setText("");
					operation.setText("");
					output.setText(Double.toString(result));
					num1 = Double.parseDouble(output.getText());
					num2 = 0;
				}
			}
		});
		copy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					copyBuffer = Double.parseDouble(output.getText());
				}
				catch (NumberFormatException exception) {
					error.setText("You can only copy numbers!");
				}
			}
		});
		paste.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(Double.toString(copyBuffer));
			}
		});
		point.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (output.getText().indexOf(".") == -1) {
					output.setText(output.getText() + ".");
				}
			}
		});
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num1 = 0;
				num2 = 0;
				output.setText("");
				operation.setText("");
				num1Label.setText("");
				action = "";
				error.setText("");
			}
		});
		addition.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					action = "add";
					num1 = Double.parseDouble(output.getText());
					num1Label.setText(Double.toString(num1));
					output.setText("");
					operation.setText("+");
				}
				catch (Exception ae) {
					error.setText("You must enter a number");
				}
			}
		});		
		subtraction.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					action = "subtract";
					num1 = Double.parseDouble(output.getText());
					num1Label.setText(Double.toString(num1));
					output.setText("");
					operation.setText("-");
				}
				catch (Exception ae) {
					error.setText("You must enter a number");
				}
			}
		});		
		division.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					action = "divide";
					num1 = Double.parseDouble(output.getText());
					num1Label.setText(Double.toString(num1));
					output.setText("");
					operation.setText("/");
				}
				catch (Exception ae) {
					error.setText("You must enter a number");
				}
			}
		});		
		multiplication.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					action = "multiply";
					num1 = Double.parseDouble(output.getText());
					num1Label.setText(Double.toString(num1));
					output.setText("");
					operation.setText("x");
				}
				catch (Exception ae) {
					error.setText("You must enter a number");
				}
			}
		});
		zeroButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (output.getText() == "0") output.setText("0");
				else output.setText(output.getText() + "0");
			}
		});
		oneButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "1");
			}
		});
		twoButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "2");				
			}
		});
		threeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "3");
			}
		});
		fourButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "4");				
			}
		});
		fiveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "5");
			}
		});
		sixButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "6");
			}
		});
		sevenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "7");
			}
		});
		eightButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "8");
			}
		});
		nineButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText() + "9");
			}
		});
	}
	public static void main(String[] args) {
		new Calculator();
	}
}