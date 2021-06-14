package src.GUIs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import src.Nodes.*;
import src.DBs.*;



public class Messagerie extends JFrame implements PapotageListener,ActionListener{
	private JPanel pan = new JPanel();
	
	private JButton bouton = new JButton("Save Data");
	private JButton bouton1 = new JButton("Log out");
	
	private JLabel label = new JLabel();
	private JPanel container = new JPanel();

	
	private String text;
	private JTextField textField = new JTextField(20);
	
	private JTextArea textField2=new JTextArea();
	private JTextArea area=new JTextArea();
	public static JTextArea area2=new JTextArea();
	
	
    
	
	private User A;
	private UsersDB db;
	
	public Messagerie(User B,UsersDB users){
		this.A=B;
		this.cons=cons;
		
		this.setTitle("Bonjour "+A.getLogin());
		this.setSize(350,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		this.setResizable(false);
		label.setText("Bienvenu: " + B.getLogin());


		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());

		container.add(pan, BorderLayout.CENTER);


		JLabel label1 = new JLabel("Title of data");
		
		textField.setBounds(25,140,280,20);
		textField.setToolTipText("Input title of data");
		pan.add(textField);

		JLabel label2 = new JLabel("data details");
		pan.add(label2);
		
		textField2.setLineWrap(true);
		textField2.setWrapStyleWord(true);
		textField2.setBounds(30,75,280,80); 
		textField2.setToolTipText("Input Data details");
		container.add(textField2);
		

		bouton.setBounds(25,170,280,20);
		container.add(bouton, BorderLayout.CENTER); 
		container.add(bouton1, BorderLayout.SOUTH); 
		
		Font police = new Font("Tahoma", Font.BOLD, 16);
		label.setFont(police);  
		label.setForeground(Color.blue); 
		label.setHorizontalAlignment(JLabel.CENTER);
		container.add(label, BorderLayout.NORTH);

		
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setEditable(false);
		Color c = new Color(200,200,200);
		area.setBackground(c);
		area.setForeground(Color.black);
		area.setBounds(30,200, 280,280); 
		container.add(area);
		
		
		
		area2.setLineWrap(true);
		area2.setWrapStyleWord(true);
		area2.setEditable(false);
		area2.setForeground(Color.RED);
		area2.setBounds(30,500,280,80);
		container.add(area2);
		
		pan.add(label1);
		label4.setBounds(30,585,280,20);
		container.add(label4);
		
		container.add(pan, BorderLayout.CENTER);
		this.setContentPane(container);
		this.setVisible(true);

		bouton1.addActionListener(this);
		bouton.addActionListener(this);
		
		
	}
	
	
	/**
	 * handling events
	 */
	
	public void actionPerformed(ActionEvent e){
		String component=e.getActionCommand();
		if (component=="Log out") {
			setVisible(false);
			}
		else if (component=="") {
		
		}
		
    // In pregress
		
  }
	
}

