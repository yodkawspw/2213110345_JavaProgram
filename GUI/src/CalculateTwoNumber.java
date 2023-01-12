import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(33, 21, 91, 23);
		contentPane.add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(170, 21, 127, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(33, 55, 91, 14);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(170, 51, 127, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResult.setBounds(326, 188, 76, 14);
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(33, 91, 91, 14);
		contentPane.add(lblOperator);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(170, 87, 56, 22);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		JLabel rdbOperator = new JLabel("How to show Digit");
		rdbOperator.setBounds(33, 123, 127, 14);
		contentPane.add(rdbOperator);
		
		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(170, 119, 109, 23);
		contentPane.add(oneDigit);
		
		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(170, 143, 109, 23);
		contentPane.add(twoDigit);

		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		JLabel lblNewLabel = new JLabel("Option to show");
		lblNewLabel.setBounds(33, 173, 109, 14);
		contentPane.add(lblNewLabel);
		
		final JCheckBox chkDialogBox = new JCheckBox("Show Result at DialogBox");
		chkDialogBox.setBounds(170, 169, 163, 23);
		contentPane.add(chkDialogBox);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					//JComboBox
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(twoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					lblResult.setText(frmNumber.format(sum));
					
					//JCheckBox
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
					}
				}
			}
		});
		btnOK.setBounds(134, 227, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(244, 227, 89, 23);
		contentPane.add(btnExit);
	}
}
