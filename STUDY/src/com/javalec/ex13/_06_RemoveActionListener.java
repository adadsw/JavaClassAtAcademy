package com.javalec.ex13;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class _06_RemoveActionListener implements ActionListener{
	JTable table;

	public _06_RemoveActionListener(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		if (row == -1)
			return;
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);
	}
}
