package com.baoshan.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.baoshan.print.PrintName;

public class WaitingPicApplet extends Applet {

	private String name = "xjx";
	private int xLoaction = 5;
	private int yLoaction = 35;

	private static final long serialVersionUID = 1L;
	Logger logger=Logger.getLogger(WaitingPicApplet.class);
	 
	@Override
	public void paint(Graphics g) {
		PrintName.printName();
		g.drawString("helloworld", getxLoaction(), getyLoaction());
	}

	public void openApp() {
		String url = "C:\\WINDOWS\\system32\\calc.exe";
		System.out.println("url=" + url);
		try {
			Runtime.getRuntime().exec(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showName(){
		logger.warn("showName method is invoked...");
	}

	public int getxLoaction() {
		return xLoaction;
	}

	public void setxLoaction(int xLoaction) {
		this.xLoaction = xLoaction;
	}

	public int getyLoaction() {
		return yLoaction;
	}

	public void setyLoaction(int yLoaction) {
		this.yLoaction = yLoaction;
	}

	@Override
	public void init() {
		Button button=new Button("beep");
		this.add(button);
		button.addActionListener(new BeepListener());
	}

}
