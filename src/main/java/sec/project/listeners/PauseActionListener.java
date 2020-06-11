package sec.project.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sec.project.constants.GlobalConstants;

public class PauseActionListener implements ActionListener {

	private JTable table;
	private JButton pause;
	private JButton unpause;
	private GlobalConstants gc = new GlobalConstants();
	public PauseActionListener(JTable table, JButton pause, JButton unpause) {
		this.table = table;
		this.pause = pause;
		this.unpause = unpause;
	}

	public void actionPerformed(ActionEvent evt) {
		pauseActionPerformed(evt);
	}

	private void pauseActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i = table.getSelectedRow();
		/*
		 * table.removeColumn(table.getColumnModel().getColumn(0));
		 * table.getModel().getValueAt(table.getSelectedRow(),0);
		 * System.out.print("   "+table.getModel().getValueAt(table.getSelectedRow(),0))
		 * ;
		 */
		JPasswordField message = new JPasswordField(10);
		JOptionPane.showConfirmDialog(null, message, gc.PASSWORD_DIALOGUE, JOptionPane.OK_CANCEL_OPTION,3);
		Object s = "Paused";
		model.setValueAt((Object) s, i, 1);
		
		pause.setEnabled(false);
		unpause.setEnabled(true);
	}
}
