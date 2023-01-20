package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	ArrayList<String>names= new ArrayList<String>();
	JFrame frame= new JFrame ();
	JPanel panel= new JPanel();
	JButton button= new JButton("Add Name");
	JButton button2= new JButton("View Names");
	
	public static void main(String[] args) {
		
_02_GuestBook something= new _02_GuestBook();
something.start();
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	
    // 2. Add five Strings to your list

	}
	void start() {
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		frame.setVisible(true);
		frame.add(panel);
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button);
		panel.add(button2);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			String username =JOptionPane.showInputDialog("Enter a name: ");
			names.add(username);
		}
		if(e.getSource()==button2) {
			for(int i = 0; i < names.size(); i++){
	            String s = names.get(i);
	            System.out.println("Guest #"+i+": " + s);
		}
	}
	
}
}
