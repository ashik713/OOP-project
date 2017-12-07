package ProjectAddressBook;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class CreatingAnewAddress extends JFrame {
	Container c;
	JButton oButton, tButton, ofButton, submitButton;
	JTextField field2, field1;
	Font f1, f2, buttonFont;
	Cursor cursor;
	ImageIcon img1, img2;
	JScrollPane scroll;
	JRadioButton male, female;
	ButtonGroup grp;
	JLabel name, phone, city, mail, website;
	JTextArea nameArea, phoneArea, cityArea, mailArea, websiteArea;
	JComboBox cb;
	static String nameString, phoneString, websiteString, cityString, mailString;
	private Formatter x;

	CreatingAnewAddress() {
		initComponents();
	}

	public void initComponents() {
		c = this.getContentPane();
		c.setLayout(null);
		// c.setBackground(Color.ORANGE);
		this.setBounds(100, 100, 500, 500);
		f1 = new Font("Candara", Font.BOLD, 20);
		f2 = new Font("Arial", Font.PLAIN, 19);
		buttonFont = new Font("Candara", Font.BOLD, 13);

		phone = new JLabel("Enter phone number: ");
		phone.setBounds(110, 90, 300, 30);
		phone.setFont(f1);
		c.add(phone);
		phoneArea = new JTextArea();
		phoneArea.setBounds(300, 90, 280, 30);
		phoneArea.setFont(f2);
		c.add(phoneArea);

		name = new JLabel("Enter your name: ");
		name.setBounds(110, 50, 300, 30);
		name.setFont(f1);
		c.add(name);
		nameArea = new JTextArea();
		nameArea.setBounds(300, 50, 280, 30);
		nameArea.setFont(f2);
		c.add(nameArea);

		city = new JLabel("Enter city: ");
		city.setBounds(110, 130, 300, 30);
		city.setFont(f1);
		c.add(city);
		cityArea = new JTextArea();
		cityArea.setBounds(300, 130, 280, 30);
		cityArea.setFont(f2);
		c.add(cityArea);

		mail = new JLabel("Enter mail: ");
		mail.setBounds(110, 170, 300, 30);
		mail.setFont(f1);
		c.add(mail);
		mailArea = new JTextArea();
		mailArea.setBounds(300, 170, 280, 30);
		mailArea.setFont(f2);
		c.add(mailArea);

		website = new JLabel("Enter website: ");
		website.setBounds(110, 210, 300, 30);
		website.setFont(f1);
		c.add(website);
		websiteArea = new JTextArea();
		websiteArea.setBounds(300, 210, 280, 30);
		websiteArea.setFont(f2);
		c.add(websiteArea);

		submitButton = new JButton("Submit");
		submitButton.setBounds(120, 250, 100, 30);
		submitButton.setFont(f1);
		c.add(submitButton);

		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				nameString = nameArea.getText();
				phoneString = phoneArea.getText();
				websiteString = websiteArea.getText();
				cityString = cityArea.getText();
				mailString = mailArea.getText();
				try {
					File fl = new File("C:\\All codes\\Java\\eclipse\\OOPprojectCourse\\src\\ProjectAddressBook\\file");
					write("\n",nameString,phoneString,cityString,mailString,websiteString, fl);
				} catch (IOException e1) {

				}
			}// actionPerformed
		});
	}

	static void write(String s1,String s2,String s3,String s4,String s5,String s6, File f) throws IOException {
		FileWriter fw = new FileWriter(f, true);
		String s = s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6;
		fw.write(s);
		fw.close();
	}

	public static void main(String[] args) {
		CreatingAnewAddress frame = new CreatingAnewAddress();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 10, 700, 600); // (x,upor,dan)
		frame.setTitle("Address Creation");

	}

}// class
