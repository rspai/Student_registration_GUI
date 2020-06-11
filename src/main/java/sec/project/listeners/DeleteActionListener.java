package sec.project.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sec.project.constants.GlobalConstants;

public class DeleteActionListener implements ActionListener {
	private JTable table;
	private JButton pause;
	private JButton unpause;
	private JButton delete;
	private GlobalConstants gc = new GlobalConstants();
	public DeleteActionListener(JTable table, JButton pause, JButton unpause, JButton delete) {
		this.table = table;
		this.pause = pause;
		this.unpause = unpause;
		this.delete = delete;
	}

	public void actionPerformed(ActionEvent evt) {
		deleteActionPerformed(evt);
	}

	private void deleteActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i = table.getSelectedRow();
		JPasswordField message = new JPasswordField(10);
		JOptionPane.showConfirmDialog(null, message, gc.PASSWORD_DIALOGUE, JOptionPane.OK_CANCEL_OPTION);
		if (i != -1) {
			model.removeRow(i);
		}
		pause.setEnabled(false);
		unpause.setEnabled(false);
		delete.setEnabled(false);
	}
}
