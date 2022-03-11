package fstm.projet.view;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class FRclient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRclient frame = new FRclient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
		Socket socket = new Socket("172.17.36.233", 7000);
		System.out.println("Connected.................");

		boolean fini = false;

		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);

		ArrayList<String> ss = new ArrayList<String>();
		ss.add("dssf");
		ss.add("dssf");
		oos.writeObject(ss);
		System.out.println("Sending values to the ServerSocket");
	}

	
	public FRclient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Date de naissance");
		lblNewLabel.setBounds(44, 47, 95, 24);
		contentPane.add(lblNewLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(169, 51, 147, 20);
		contentPane.add(dateChooser);
		
		JButton Ajouter = new JButton("Ajouter");
		Ajouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*Calendar date= (Calendar) dateChooser.getCalendar();
				Client c= new Client(1,"hi","hi",true,38,null,date);
				if(c.getage()!=-1) {
					double resu=0;
					DroolsTest	d= new DroolsTest();
					resu=d.Start_Rules(c);
					System.out.println(resu);
					JOptionPane.showMessageDialog(Ajouter, "possibilite de presence : " + resu*100 + " %100", "Diagnostic", JOptionPane.INFORMATION_MESSAGE);
				}
				else	JOptionPane.showMessageDialog(Ajouter, "date de naissance nvalide", "Warnings", JOptionPane.ERROR_MESSAGE);
	
					*/
				
						
			}
		});
		Ajouter.setBounds(239, 141, 89, 23);
		contentPane.add(Ajouter);
	}
}
