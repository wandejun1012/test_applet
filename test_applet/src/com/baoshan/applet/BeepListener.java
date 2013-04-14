package com.baoshan.applet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeepListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("beep is invoked");
	}

}
