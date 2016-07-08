package bank;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import bank.AccountServiceImpl;
import grade.GradeServiceImpl;

/**
 * @date   : 2016. 7. 8.
 * @author : 신재현
 * @file   : BankUI.java
 * @story   :
 */

public class BankUI extends JFrame{
	private static final long serialVersionUID = 1L;

	JPanel wrapper_panel, flow_panel;
	JList<String> itemList;

	@SuppressWarnings("static-access")
	public BankUI() {
		setLayout();
		this.setResizable(false);// frame abort resize
		this.setLocationRelativeTo(null);// frame load at center of screen
		this.setSize(400, 300);// frame set size width, height
		this.setVisible(true);// frame set visible mode (false - non-visible)
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);// x btn of frame is
															// end of frame

	}

	private void setLayout() {
		wrapper_panel = new JPanel();
		flow_panel = new JPanel(new FlowLayout());
		itemList = new JList(AccountServiceImpl.getInstance().list().toArray());
		itemList.setSelectedIndex(0);
		itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		wrapper_panel.add(itemList);
		this.add(wrapper_panel);

	}

	
}
