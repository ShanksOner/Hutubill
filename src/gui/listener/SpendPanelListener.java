package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.panel.SpendPanel;

public class SpendPanelListener implements ActionListener{

//	����ģʽ������ô�鷳
//	private SpendPanel sp;
//
//	public SpendPanelListener(SpendPanel sp) {
//		// TODO Auto-generated constructor stub
//		this.sp=sp;
//	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//��bug��һ������
	 SpendPanel.instance.vAvgSpendPerDay.setText("xxxx");
	 
	}

}
