package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Equação2Grau {
	JLabel lblA = new JLabel("A");
	JLabel lblB = new JLabel("B");
	JLabel lblNewLabel_5 = new JLabel(".");
	JLabel lblC = new JLabel("C");
	JLabel lblRaiz = new JLabel("0");
	JLabel lblDelta = new JLabel("0");
	JPanel panelResultado = new JPanel();
	JButton btnCalcular = new JButton("<html> Calculcar &Delta ; </html>");

	public static JFrame frame;

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Equação2Grau window = new Equação2Grau();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	public Equação2Grau() {
		initialize();
		panelResultado.setBounds(41, 236, 383, 101);
		panelResultado.setVisible(false);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 450, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSpinner txtA = new JSpinner();
		txtA.setBounds(62, 67, 30, 20);
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());	
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(txtA);
		
		JLabel lblNewLabel = new JLabel("X\u00B2");
		lblNewLabel.setBounds(97, 67, 41, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner txtB = new JSpinner();
		txtB.setBounds(203, 67, 30, 20);
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());			
			}
		});
		frame.getContentPane().add(txtB);
		
		JLabel lblNewLabel_1 = new JLabel("X+");
		lblNewLabel_1.setBounds(238, 67, 41, 22);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1);
		
		JSpinner txtC = new JSpinner();
		txtC.setBounds(318, 67, 30, 20);
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		frame.getContentPane().add(txtC);
		
		JLabel lblNewLabel_2 = new JLabel("=0");
		lblNewLabel_2.setBounds(353, 67, 46, 22);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("<html>&Delta;=</html>=");
		lblNewLabel_6.setBounds(68, 138, 24, 22);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("<html><sup>2</sup>-4.</html>");
		lblNewLabel_8.setBounds(126, 130, 41, 30);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_8);
		lblB.setBounds(97, 139, 63, 22);
		
		
		lblB.setForeground(Color.RED);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblB);
		lblA.setBounds(177, 129, 24, 40);
		
		
		lblA.setForeground(Color.RED);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblA);
		lblC.setBounds(224, 138, 132, 22);
		
	
		lblC.setForeground(Color.RED);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblC);
		lblNewLabel_5.setBounds(203, 139, 11, 20);
		
		
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_5);
		btnCalcular.setBounds(107, 180, 126, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a =Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());	
				
				Double d = Math.pow(b,2)-4*a*c;
				
				lblDelta.setText(String.format("%.1f",d));
				
				if (d < 0 ) {
					lblRaiz.setText("não existe raizes reais");
				}else {
					lblRaiz.setText("Existem raizes reais ");
				}
				panelResultado.setVisible(true);
				
				
			}
		});
		frame.getContentPane().add(btnCalcular);
		frame.getContentPane().add(panelResultado);
		panelResultado.setLayout(null);
		
		JLabel lblValor = new JLabel("<html>Valor &Delta;</html>");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValor.setBounds(10, 35, 70, 28);
		panelResultado.add(lblValor);
		
		JLabel lbl = new JLabel("tipo de raizes");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl.setBounds(10, 74, 108, 25);
		panelResultado.add(lbl);
		
		
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDelta.setBounds(159, 45, 46, 14);
		panelResultado.add(lblDelta);
		
		
		lblRaiz.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRaiz.setBounds(159, 75, 214, 14);
		panelResultado.add(lblRaiz);
	}
}
