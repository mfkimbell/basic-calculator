package TenthLabPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorTester {

	private double num1 = 0;
	private double num2 = 0;
	private double result = 0;
	private String operator = "";
	private String internal = "";

	public CalculatorTester() {
		// you can leave this constructor empty
		// or add things if you would like

	}

	/**
	 * <h1>start()</h1>
	 * <p>
	 * This method starts the GUI by creating the frame and panels needed to show
	 * this Java App. <br>
	 * <em>Feel free to configure the settings to match your intended output!</em>
	 * </p>
	 */
	public void start() {
		JFrame frame = new JFrame();

		// configure your frame's size, title, and close operation
		frame.setSize(500, 800);
		frame.setTitle("Lab 10 Calculator GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// add the JPanel into your JFrame
		frame.add(createPanel(), BorderLayout.CENTER);

		// uncomment if you want to pack all components closely together
		// frame.pack();

		// for some reason, a JFrame defaults to false for visibility
		frame.setVisible(true);
	}

	/**
	 * <h1>createPanel()</h1>
	 * <p>
	 * This method creates all of the necessary components needed to be added into a
	 * main JPanel object. <br>
	 * <em>You will need to add more panels and components to make complete your
	 * Java App!</em>
	 * </p>
	 * 
	 * @return a main JPanel object to be added into the JFrame
	 */
	public JPanel createPanel() {

		// this is our main panel to house other panels or components
		JPanel mainPanel = new JPanel();

		// TODO change layout if needed
		// this BoxLayout will line its components vertically on the y axis
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		// TODO add more panels and components here!

		JPanel outputPanel = new JPanel();
		outputPanel.setMaximumSize(new Dimension(500, 200));

		JTextField outputTf = new JTextField(10);
		outputTf.setFont(new Font("Times", Font.PLAIN, 48));
		outputTf.setEditable(false);
		outputTf.setHorizontalAlignment(SwingConstants.RIGHT);
		outputPanel.add(outputTf);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(0, 3));

		JButton clear = new JButton("Clear");
		JButton delete = new JButton("Delete");
		JButton add = new JButton("+");
		JButton subtract = new JButton("-");
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		JButton sqrt = new JButton("√");
		JButton equals = new JButton("=");

		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num1 = 0;
				num2 = 0;
				result = 0;
				operator = "";
				outputTf.setText("");

			}

		});

		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String currentOutput = outputTf.getText();
				if (currentOutput.length() != 0) {

					currentOutput = currentOutput.substring(0, currentOutput.length() - 1);
					outputTf.setText(currentOutput);
				}

			}

		});

		b0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "0");
				outputTf.setText(outputTf.getText() + "0");

			}

		});

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "1");
				outputTf.setText(outputTf.getText() + "1");

			}

		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "2");
				outputTf.setText(outputTf.getText() + "2");

			}

		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "3");
				outputTf.setText(outputTf.getText() + "3");

			}

		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "4");
				outputTf.setText(outputTf.getText() + "4");

			}

		});

		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "5");
				outputTf.setText(outputTf.getText() + "5");

			}

		});

		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "6");
				outputTf.setText(outputTf.getText() + "6");

			}

		});

		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "7");
				outputTf.setText(outputTf.getText() + "7");

			}

		});

		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "8");
				outputTf.setText(outputTf.getText() + "8");

			}

		});

		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setInternal(getInternal() + "9");
				outputTf.setText(outputTf.getText() + "9");

			}

		});

		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num1 = Integer.valueOf(outputTf.getText());
				outputTf.setText(outputTf.getText() + "+");
				operator = "+";
				internal = "";

			}

		});

		subtract.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num1 = Integer.valueOf(outputTf.getText());
				outputTf.setText(outputTf.getText() + "-");
				operator = "-";
				internal = "";

			}

		});

		multiply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num1 = Integer.valueOf(outputTf.getText());
				outputTf.setText(outputTf.getText() + "*");
				operator = "*";
				internal = "";

			}

		});
		
		divide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num1 = Integer.valueOf(outputTf.getText());
				outputTf.setText(outputTf.getText() + "/");
				operator = "/";
				internal = "";

			}

		});
		
		sqrt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				num1 = Integer.valueOf(outputTf.getText());
				outputTf.setText(outputTf.getText() + "√");
				operator = "sqrt";
				internal = "";

			}

		});

		equals.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operator.equals("+")) {
					num2 = Integer.valueOf(internal);
					outputTf.setText(String.valueOf(num1 + num2));
				}
				if (operator.equals("-")) {
					num2 = Integer.valueOf(internal);
					outputTf.setText(String.valueOf(num1 - num2));
				}
				if (operator.equals("*")) {
					num2 = Integer.valueOf(internal);
					outputTf.setText(String.valueOf(num1 * num2));
				}
				if (operator.equals("/")) {
					num2 = Integer.valueOf(internal);
					outputTf.setText(String.valueOf(num1 / num2));
				}
				if (operator.equals("sqrt")) {
					
					double d = num1;
					outputTf.setText(String.valueOf(Math.sqrt(d)));
				}

			}

		});

		buttonsPanel.add(b0);
		buttonsPanel.add(b1);
		buttonsPanel.add(b2);
		buttonsPanel.add(b3);
		buttonsPanel.add(b4);
		buttonsPanel.add(b5);
		buttonsPanel.add(b6);
		buttonsPanel.add(b7);
		buttonsPanel.add(b8);
		buttonsPanel.add(b9);
		buttonsPanel.add(clear);
		buttonsPanel.add(delete);
		buttonsPanel.add(subtract);
		buttonsPanel.add(add);
		buttonsPanel.add(multiply);
		buttonsPanel.add(divide);
		buttonsPanel.add(sqrt);
		buttonsPanel.add(equals);

		mainPanel.add(outputPanel);
		mainPanel.add(buttonsPanel);

		// return the entire calculator panel as a JPanel object
		return mainPanel;
	}

	/**
	 * this function keeps track of the actual numbers as opposed to the display
	 * 
	 * @return
	 */
	public String getInternal() {
		return internal;
	}

	public void setInternal(String internal) {
		this.internal = internal;
	}
}
