package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Telavalores {

	private JFrame frame;
	private JTextField textNum;
	private JTextField textDen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telavalores window = new Telavalores();
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
	public Telavalores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 244, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(92, 57, 86, 20);
		frame.getContentPane().add(textNum);
		textNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(113, 182, 72, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(113, 222, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textDen = new JTextField();
		textDen.setBounds(92, 102, 86, 20);
		frame.getContentPane().add(textDen);
		textDen.setColumns(10);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(textNum.getText());
				int d = Integer.parseInt(textDen.getText());
				float div = n / d;
				float res = n % d;
			
				 lblNewLabel.setText(Float.toString(div));
				 lblNewLabel_1.setText(Float.toString(res));
				
				
			}
		});
		btnDividir.setBounds(58, 148, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		JLabel lblNewLabel_2 = new JLabel("Divis\u00E3o");
		lblNewLabel_2.setBounds(27, 168, 34, 43);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Resto");
		lblNewLabel_6.setBounds(27, 222, 28, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Numerador");
		lblNewLabel_3.setBounds(10, 60, 74, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Denominador");
		lblNewLabel_4.setBounds(10, 105, 72, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
