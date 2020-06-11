package sec.project.frames;

import sec.project.constants.GlobalConstants;
import sec.project.listeners.DeleteActionListener;
import sec.project.listeners.PauseActionListener;
import sec.project.listeners.TableMouseClickListener;
import sec.project.listeners.UnPauseActionListener;

public class Main extends javax.swing.JFrame {

	public Main() {
		initComponents();
		setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		add = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		pause = new javax.swing.JButton();
		unpause = new javax.swing.JButton();
		delete = new javax.swing.JButton();
		gc = new GlobalConstants();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jScrollPane2.setViewportView(table);

		add.setText(gc.ADD);
		pause.setText(gc.PAUSE);
		pause.setEnabled(false);
		unpause.setText(gc.UNPAUSE);
		unpause.setEnabled(false);
		delete.setText(gc.DELETE);
		delete.setEnabled(false);
		add.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new Book(table).setVisible(true);
			}
		});
		delete.addActionListener(new DeleteActionListener(table, pause, unpause, delete));
		pause.addActionListener(new PauseActionListener(table, pause, unpause));
		table.addMouseListener(new TableMouseClickListener(pause, unpause, delete));
		unpause.addActionListener(new UnPauseActionListener(table, pause, unpause));

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { "Rohit", "Unpaused" },
				{ "Aswin", "Unpaused" }, { "Rasita", "Unpaused" }, { "Bala", "Unpaused" } },
				new String[] { gc.NAME, gc.STATUS }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		table.setDefaultEditor(Object.class, null);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(31, 31, 31)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
												false))))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97,
										Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(unpause, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(add, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pause, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
				.addGroup(layout.createSequentialGroup().addGap(183, 183, 183)))
				.addGap(85, 85, 85));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(26, 26, 26)
				.addGap(19, 19, 19)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(55, 55, 55).addComponent(jScrollPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(123, 123, 123)
								.addComponent(add)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(pause)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(unpause)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(delete)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	private javax.swing.JButton add;
	private javax.swing.JButton delete;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JButton pause;
	private javax.swing.JTable table;
	private javax.swing.JButton unpause;
	private GlobalConstants gc;

}
