package Exo2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends Frame{
	
	public Fenetre() {
		setSize(400,300);
		setLayout(new BorderLayout());
		TextField tf=new TextField();
		add(tf,BorderLayout.NORTH);
		Panel f=new Panel();
		f.setLayout(new GridLayout(4,3));
		add(f,BorderLayout.CENTER);
		Button buttons[]=new Button[10];
		for(int i=0;i<10;i++) {
			buttons[i]=new Button(String.valueOf(i));
			buttons[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					tf.setText(tf.getText()+((Button)e.getSource()).getLabel());
				}
			});
		}
		for (int i = 1; i <=9; i++) {
			
			f.add(buttons[i]);
			
		}
		Button reset=new Button("reset");
		f.add(reset);
		f.add(buttons[0]);
		Button bis=new Button("bis");
		f.add(bis);
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText("");
			}
		});
		
		bis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=tf.getText();
				if(s.length()!=0)
					tf.setText(s.substring(0, s.length()-1));
			}
		});
		
		setVisible(true);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenetre f=new Fenetre();

	}

}
