package view;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.CosNaming.NamingContextExtOperations;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntefaceIdade {

	private JFrame frame;
	private JTextField textAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntefaceIdade window = new IntefaceIdade();
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
	public IntefaceIdade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 188, 252);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de naci:");
		lblNewLabel.setBounds(0, 66, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textAno = new JTextField();
		textAno.setBounds(76, 63, 86, 20);
		frame.getContentPane().add(textAno);
		textAno.setColumns(10);
		
		JLabel lblR = new JLabel("Resultado");
		lblR.setBounds(49, 188, 66, 14);
		frame.getContentPane().add(lblR);
		
		JButton btn = new JButton("Posso votar");
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textAno.getText());
				int i = 2022 - a;
				
				if (i < 16 ) {
				lblR.setText("nao votar");
					
				System.out.println("não votar");
				}else if ((i>=16 && i<18) || (i>70)) {
						lblR.setText("voto opsional");
						System.out.println("voto opsional");
					}else {
						lblR.setText("voto obrigatorio");
						System.out.println("voto obrigatorio");
					}
				
				
				
			}
		});
		btn.setBounds(38, 119, 89, 23);
		frame.getContentPane().add(btn);
	}
}
