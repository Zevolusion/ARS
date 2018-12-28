/*
 * Administrator.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import db.Factory;

import model.Admin;
import model.User_info;

/**
 *
 * @author  __USER__
 */
public class Administrator extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void List2() throws SQLException, ClassNotFoundException {
		jList2.setModel(new javax.swing.AbstractListModel() {
			private static final long serialVersionUID = 1L;
			String[] strings = db.Factory.showcom();

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
	}

	public static void List1() throws SQLException, ClassNotFoundException {
		jList1.setModel(new javax.swing.AbstractListModel() {
			private static final long serialVersionUID = 1L;
			String[] strings = db.Factory.shownotice2();

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
	}

	public static Admin au;

	public static void getTable() throws SQLException, ClassNotFoundException {
		String title[] = { "邮箱", "姓名", "电话", "身份证号", "密码" };
		ArrayList<Admin> users = Factory.ViewAllUser(au);
		Object detail[][] = new Object[users.size()][5];
		for (int i = 0; i < users.size(); i++) {
			detail[i][0] = users.get(i).getU_email();
			detail[i][1] = users.get(i).getU_name();
			detail[i][2] = users.get(i).getU_phone();
			detail[i][3] = users.get(i).getU_IDNumber();
			detail[i][4] = users.get(i).getU_pw();
		}
		jTable5.setModel(new DefaultTableModel(detail, title));
	}

	@SuppressWarnings("static-access")
	public void getTable(User_info a) throws SQLException,
			ClassNotFoundException {
		Object title[] = { "邮箱", "姓名", "电话", "身份证号", "密码" };
		ArrayList<Admin> users = Factory.ViewAllUser(au);
		Object detail[][] = new Object[users.size()][5];

		detail[0][0] = a.getU_email();
		detail[0][1] = a.getU_name();
		detail[0][2] = a.getU_phone();
		detail[0][3] = a.getU_IDNumber();
		detail[0][4] = a.getU_pw();

		this.jTable5.setModel(new DefaultTableModel(detail, title));
	}

	@SuppressWarnings("static-access")
	public Administrator(Admin au) {
		this.au = au;
		try {
			initComponents();
			this.setResizable(false);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setLocationRelativeTo(null);
		try {
			getTable();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			e.printStackTrace();
		}
	}

	/** Creates new form Administrator */
	public Administrator() {
		try {
			initComponents();
			this.setLocationRelativeTo(null);
			this.setResizable(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Enter回车事件
		jList1.addKeyListener(new java.awt.event.KeyAdapter() {

			@SuppressWarnings("static-access")
			public void keyPressed(KeyEvent e) {
				int k = e.getKeyCode();
				if (k == e.VK_ENTER) {
					try {
						jButton2ActionPerformed(null);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
	}
	//设置Jpanel背景
	@SuppressWarnings("serial")
	public class HomePanel extends JPanel {
		ImageIcon icon;
		Image img;
		public HomePanel() {
			icon = new ImageIcon(getClass().getResource("/img/main-bg-1.jpg"));
			img = icon.getImage();
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 下面这行是为了背景图片可以跟随窗口自行调整大小，可以自己设置成固定大小
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() throws SQLException, ClassNotFoundException {

		jPanel2 = new HomePanel();
		jPanel1 = new javax.swing.JPanel();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jPanel5 = new javax.swing.JPanel();
		jButton7 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTable5 = new javax.swing.JTable();
		jPanel6 = new javax.swing.JPanel();
		jButton11 = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		jList2 = new javax.swing.JList();
		jButton3 = new javax.swing.JButton();
		jPanel7 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		jButton5 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton7.setText("\u67e5\u8be2\u7528\u6237\u4fe1\u606f");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton9.setText("\u5220\u9664\u7528\u6237\u4fe1\u606f");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jTable5.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { "", "", "", "", null },
						{ "", "", "", "", null }, { "", "", "", "", null },
						{ "", "", "", "", null } }, new String[] { "用户ID",
						"姓名", "电话", "登录密码", "邮箱" }));
		jScrollPane5.setViewportView(jTable5);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																540,
																Short.MAX_VALUE)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton7)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton9)))
										.addContainerGap()));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jScrollPane5,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												333, Short.MAX_VALUE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton9)
														.addComponent(jButton7))
										.addGap(30, 30, 30)));

		jTabbedPane2.addTab("\u7528\u6237\u7ba1\u7406", jPanel5);

		jButton11.setText("\u5220\u9664\u516c\u53f8");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton11ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		List2();
		jScrollPane2.setViewportView(jList2);

		jButton3.setText("\u65b0\u5efa\u516c\u53f8");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																540,
																Short.MAX_VALUE)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton3)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton11)))
										.addContainerGap()));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												344,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(jButton11))
										.addGap(26, 26, 26)));

		jTabbedPane2.addTab("\u516c\u53f8\u7ba1\u7406", jPanel6);

		jButton1.setText("\u65b0\u5efa\u516c\u544a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5220\u9664\u516c\u544a");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton2ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		List1();
		jScrollPane1.setViewportView(jList1);

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout
				.setHorizontalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																540,
																Short.MAX_VALUE)
														.addGroup(
																jPanel7Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton2)))
										.addContainerGap()));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel7Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												347,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addGap(23, 23, 23)));

		jTabbedPane2.addTab("\u516c\u544a\u7ba1\u7406", jPanel7);

		jButton5.setText("\u9000\u51fa");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTabbedPane2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																575,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jTabbedPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												460,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton5)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(307, 307, 307)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addGap(310, 310, 310)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel2Layout.createSequentialGroup().addContainerGap(76,
						Short.MAX_VALUE).addComponent(jPanel1,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(73, 73,
						73)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException, ClassNotFoundException {
		db.Factory.delCom(jList2.getSelectedValue().toString());
		JOptionPane.showMessageDialog(null, "成功删除公司："
				+ jList2.getSelectedValue(), null,
				JOptionPane.INFORMATION_MESSAGE);
		List2();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new AddCom().setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException, ClassNotFoundException {
		db.Factory.delNoti2(jList1.getSelectedValue().toString());
		JOptionPane.showMessageDialog(null, "成功删除公告："
				+ jList1.getSelectedValue(), null,
				JOptionPane.INFORMATION_MESSAGE);
		List1();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new AddNotice2().setVisible(true);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Login().setVisible(true);
		this.dispose();
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		new UserDel().setVisible(true);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String name = JOptionPane.showInputDialog("请输入用户姓名");
		User_info a = null;
		if (name.equals("")) {
			try {
				getTable();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
				e.printStackTrace();
			}
			return;
		}
		try {
			a = Factory.ViewUserResult(au, name);
			if (a == null)
				throw new Exception("无此用户");
			getTable(a);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Administrator().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton9;
	private static javax.swing.JList jList1;
	private static javax.swing.JList jList2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JTabbedPane jTabbedPane2;
	private static javax.swing.JTable jTable5;
	// End of variables declaration//GEN-END:variables

}