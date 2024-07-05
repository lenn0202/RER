package exercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class ex4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel IblNome = new JLabel("Início da Frase (LC)");
	private JTextField txtNome;
	private JTextField textSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex4 frame = new ex4();
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
	public ex4() {
		setTitle("Lennon Camargo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setToolTipText("Lennon Camargo");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		IblNome.setBounds(25, 53, 177, 36);
		contentPane.add(IblNome);
		IblNome.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		txtNome = new JTextField();
		txtNome.setBounds(25, 91, 376, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Final da Frase (LC) ");
		lblSobrenome.setBounds(25, 137, 90, 13);
		contentPane.add(lblSobrenome);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(25, 160, 376, 19);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		JButton btnJuntar = new JButton("Juntar");
		btnJuntar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Texto Unido: "+ txtNome.getText()+" "+textSobrenome.getText());
				
			}
		});
		btnJuntar.setBounds(117, 206, 85, 21);
		contentPane.add(btnJuntar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				textSobrenome.setText("");
			}
		});
		btnLimpar.setBounds(212, 206, 85, 21);
		contentPane.add(btnLimpar);
		
		JPanel panel = new JPanel();
		panel.setBounds(177, 53, 10, 10);
		contentPane.add(panel);
	}
}
