import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Calculator GUI
 */

public class calculator extends JFrame {
	/**
	 * Sets the calculator frame to visible
	 * @param args
	 */

	public static void main(String[] args) {

		calculator c = new calculator();
		c.setVisible(true);
		c.setTitle("Calculator");
		c.setSize(300,400);
	} 
	/**
	 * Constructor method for calculator
	 */

	public calculator() {

		/**
		 * Initializes the two display frame with an empty string
		 */

		JLabel display = new JLabel("");
		JLabel displayAnswer = new JLabel("");

		/**
		 * Initializes the buttons with the appropriate string
		 */

		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton divide = new JButton("/");
		JButton equal = new JButton("=");
		JButton times = new JButton("*");
		JButton clear = new JButton("C");

		/**
		 * Positions the buttons according to the sample calculator
		 */

		JPanel buttonPosition = new JPanel();
		buttonPosition.setLayout(new GridLayout(4, 5));
		buttonPosition.add(seven);
		buttonPosition.add(eight);
		buttonPosition.add(nine);
		buttonPosition.add(divide);
		buttonPosition.add(clear);

		buttonPosition.add(four);
		buttonPosition.add(five);
		buttonPosition.add(six);
		buttonPosition.add(times);
		buttonPosition.add(new JButton()); // empty button

		buttonPosition.add(one);
		buttonPosition.add(two);
		buttonPosition.add(three);
		buttonPosition.add(minus);
		buttonPosition.add(new JButton());

		buttonPosition.add(new JButton());
		buttonPosition.add(zero);
		buttonPosition.add(new JButton());
		buttonPosition.add(plus);
		buttonPosition.add(equal);

		/**
		 * Positions each of the three panels according
		 */

		setLayout(new BorderLayout());
		add(display, BorderLayout.NORTH);
		add(displayAnswer, BorderLayout.CENTER);
		add(buttonPosition, BorderLayout.SOUTH);

		/**
		 * Adds action listeners to each button
		 */

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "0");
			}
		});
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "1");
			}
		});
		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "2");
			}
		});
		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "3");
			}
		});
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "4");
			}
		});
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "5");
			}
		});
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "6");
			}
		});
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "7");
			}
		});
		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "8");
			}
		});
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "9");
			}
		});
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + " + ");
			}
		});
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + " - ");
			}
		});
		times.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + " * ");
			}
		});
		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + " / ");
			}
		});
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText("");
				displayAnswer.setText("");
			}
		});
		equal.addActionListener(new ActionListener() {
			/**
			 * Calculates and displays the answer to the answerDisplay panel
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double answer = 0;
					String[] equation = display.getText().split(" ");
					double a = Double.parseDouble(equation[0]);
					double b = Double.parseDouble(equation[2]);

					if (equation[1].equals("+")) {
						answer = a + b;
					} else if (equation[1].equals("-")) {
						answer = a - b;
					} else if (equation[1].equals("/")) {
						answer = a / b;
					} else if (equation[1].equals("*")) {
						answer = a * b;
					}
					displayAnswer.setText(Double.toString(answer));
				}

				/**
				 * Catches any exceptions
				 */

				catch (ArithmeticException a) {
					System.out.println("Division by zero: " + a);
				}
				catch (NumberFormatException a) {
					System.out.println("Improper Format: " + a);
				} 
				catch (ArrayIndexOutOfBoundsException a) {
					System.out.println("Error: " + a);
				}
				catch (Exception a) {
					System.out.println("Error: " + a);
				}
			}
		});
	}
}