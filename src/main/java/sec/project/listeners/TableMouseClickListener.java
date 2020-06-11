package sec.project.listeners;

import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JTable;

public class TableMouseClickListener extends MouseAdapter {
	private JButton pause;
	private JButton unpause;
	private JButton delete;

	public TableMouseClickListener(JButton pause, JButton unpause, JButton delete) {
		this.pause = pause;
		this.unpause = unpause;
		this.delete = delete;
	}

	public void mouseClicked(java.awt.event.MouseEvent evt) {
		tableMouseClicked(evt);
	}

	private void tableMouseClicked(java.awt.event.MouseEvent evt) {
		JTable source = (JTable) evt.getSource();
		int row = source.rowAtPoint(evt.getPoint());
		String s1 = source.getModel().getValueAt(row, 1) + "";
		String s2 = "Unpaused";
		if (s1.equalsIgnoreCase(s2)) {
			pause.setEnabled(true);
			unpause.setEnabled(false);
		}
		String s3 = "Paused";
		if (s1.equalsIgnoreCase(s3)) {
			unpause.setEnabled(true);
			pause.setEnabled(false);
		}
		delete.setEnabled(true);

	}
}
