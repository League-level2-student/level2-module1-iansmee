package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	
	void run(){
		frame.setVisible(true);
		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		addName.setText("Add Name");
		viewNames.setText("View Names");
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(addName==e.getSource()) {
		String Name =JOptionPane.showInputDialog("What name would you like to add to the list?");
		names.add(Name);
		}
		if(viewNames==e.getSource()) {
			System.out.println(names);
		}
	}
}
