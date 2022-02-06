package dessin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.ComboBoxEditor;
import javax.swing.JColorChooser;
import javax.swing.colorchooser.ColorChooserComponentFactory;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorChooserUI;
import javax.swing.plaf.basic.BasicColorChooserUI;

public class Planche extends Frame {

	
	public Planche() throws HeadlessException {
		// TODO Auto-generated constructor stub
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		setSize(500,400);
		setTitle("planche");
		setLayout(new BorderLayout());
		MenuBar menuBar=new MenuBar();
		setMenuBar(menuBar);
		Menu menu=new Menu("File");
		MenuItem menuItem=new MenuItem("exit");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(ABORT);
			}
		});
		menu.add(menuItem);
		menuBar.add(menu);
		Dessin d=new Dessin("rectangle");
		Panel p=new Panel();
		p.setBackground(Color.white);
		d.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Pressed :("+d.getX()+","+d.getY()+")");
				d.setX(e.getX());
				d.setY(e.getY());
				d.setXc(e.getX());
				d.setYc(e.getY());
				d.repaint();
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("realeased");
				int x=d.getX();
				int y=d.getY();
				int xc=e.getX();
				int yc=e.getY();
				if(xc<x) {
					int aux;
					aux=xc;
					xc=x;
					x=aux;
				}
				if(yc<y) {
					int aux;
					aux=yc;
					yc=y;
					y=aux;
				}
				d.setX(x);
				d.setY(y);
				d.setXc(xc);
				d.setYc(yc);
				d.repaint();
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("dragged");
				int x=d.getX();
				int y=d.getY();
				int xc=e.getX();
				int yc=e.getY();
				if(xc<x) {
					int aux;
					aux=xc;
					xc=x;
					x=aux;
				}
				if(yc<y) {
					int aux;
					aux=yc;
					yc=y;
					y=aux;
				}
				d.setX(x);
				d.setY(y);
				d.setXc(xc);
				d.setYc(yc);
				d.repaint();
			}
		});
		add(d,BorderLayout.CENTER);
		Panel p2=new Panel();
		p2.setBackground(Color.gray);
		Choice c=new Choice();
		c.add("rectangle");
		c.add("eclipse");
		p2.add(c);
		c.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String choix=c.getSelectedItem();
				d.setChoix(choix);
			}
		});
		//JColorChooser colorChooser=new JColorChooser();
		//colorChooser.setSize(30,40);
		//p2.add(colorChooser);
		Button b=new Button();
		b.setBackground(Color.black);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Frame f=new Frame();
				f.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						f.dispose();
					}
				});
				f.setSize(300,200);
				f.setLayout(new BorderLayout());
				JColorChooser colorer=new JColorChooser();
				f.add(colorer,BorderLayout.CENTER);
				colorer.getSelectionModel().addChangeListener(new ChangeListener() {
					
					@Override
					public void stateChanged(ChangeEvent e) {
						// TODO Auto-generated method stub
						Color c=colorer.getColor();
						d.setColor(c);
						b.setBackground(c);
					}
				});
				//colorer.setVisible(true);
				f.setVisible(true);
			}
		});
		p2.add(b);
		this.add(p2,BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planche p=new Planche();
	}

}
