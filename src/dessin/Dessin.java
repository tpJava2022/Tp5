package dessin;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Dessin extends Canvas{
	private String choix;
	private int x;
	private int y;
	private int xc;
	private int yc;
	public int getXc() {
		return xc;
	}

	public void setXc(int xc) {
		this.xc = xc;
	}

	public int getYc() {
		return yc;
	}

	public void setYc(int yc) {
		this.yc = yc;
	}

	private int w=150;
	private int h=100;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public Dessin(String choix) {
		// TODO Auto-generated constructor stub
		this.choix=choix;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		if(choix=="rectangle") {
			g.setColor(Color.red);
			g.drawRect(x, y, xc-x, yc-y);
			
		}else {
			g.drawOval(x, y, xc-x, yc-y);
		}
		
	}

	public String getChoix() {
		return choix;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}

}
