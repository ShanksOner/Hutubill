package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.panel.SpendPanel;

public class SpendPanelListener implements ActionListener{

//	单例模式下用这么麻烦
//	private SpendPanel sp;
//
//	public SpendPanelListener(SpendPanel sp) {
//		// TODO Auto-generated constructor stub
//		this.sp=sp;
//	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//出bug开一下这里
	 SpendPanel.instance.vAvgSpendPerDay.setText("xxxx");
	 
	}

}
