package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {

	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("ID Search");
	JButton button3 = new JButton("View List");
	JButton button4 = new JButton("Remove Entry");

	public void setup() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();
	}

	public static void main(String[] args) {
		_02_LogSearch search = new _02_LogSearch();
		search.setup();
	}

	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		if (pressed == button1) {
			String idnumber = JOptionPane.showInputDialog("Enter an ID Number!");
			int idnum = Integer.parseInt(idnumber);
			String name = JOptionPane.showInputDialog("Enter a Name!");
			hash.put(idnum, name);
		}
		if (pressed == button2) {
			String searched = JOptionPane.showInputDialog("Enter an ID Number to Search For!");
			int search = Integer.parseInt(searched);
			if (hash.containsKey(search)) {
				JOptionPane.showMessageDialog(null, hash.get(search));
			} else {
				JOptionPane.showMessageDialog(null, "This user does not exist!");
			}
		}
		if (pressed == button3) {
			for (int key : hash.keySet()) {
				JOptionPane.showMessageDialog(null, "ID: " + key + "  Name: " + hash.get(key));
			}
			// need to add full list
		}
		if (pressed == button4) {
			String removed = JOptionPane.showInputDialog("Enter an ID to remove!");
			int remover = Integer.parseInt(removed);
			if (hash.containsKey(remover)) {
				hash.remove(remover);
			} else {
				JOptionPane.showMessageDialog(null, "This user does not exist!");
			}
		}
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number.
	 *
	 * After an ID is entered, use another input dialog to ask the user to enter a
	 * name. Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 */

}
