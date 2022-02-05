package EXO1;

import java.awt.*;

public class Fenetre {
	Frame f;

	public Fenetre() {
		// TODO Auto-generated constructor stub
		f=new Frame();
		f.setLayout(new GridLayout(4,3));
		Button buttons[]=new Button[9];
		for (int i = 0; i < 9; i++) {
			buttons[i]=new Button(String.valueOf(i+1));
			f.add(buttons[i]);
		}
		f.add(new Button("reset"));
		f.add(new Button("0"));
		f.add(new Button("bis"));
		
		//f.add(b,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	
}
