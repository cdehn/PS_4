package MainPackage;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import MainPackage1.calculateFV;

public class practiceSet4 {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtF;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practiceSet4 window = new practiceSet4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public practiceSet4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double investmentAmount = Double.parseDouble(textField.getText());
				double years = Double.parseDouble(textField_3.getText()) ;
				double annualInterestRate = Double.parseDouble(txtF.getText());
				calculateFV fv = new calculateFV(investmentAmount, years, annualInterestRate);
				double futureValue1 = fv.getFutureValue();
				textField_2.setText("$" + futureValue1);
			}
		});
		
		//text field for investment amount
		textField = new JTextField();
		textField.setColumns(10);
		
		//text field for annual interest rate
		txtF = new JTextField();
		txtF.setColumns(10);
		
		//text field for future value
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		//text field for years
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Investment Amount");
		
		JLabel lblYears = new JLabel("Years");
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		
		JLabel lblFutureValue = new JLabel("Future Value");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAnnualInterestRate)
						.addComponent(lblYears, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFutureValue))
					.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtF)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(textField, Alignment.TRAILING)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(27))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYears))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAnnualInterestRate))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFutureValue))
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnCalculate)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}

