package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

public class KeyboardListener implements KeyListener {

	private static KeyboardListener listener;
	
	private KeyboardListener() {
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
//		if ( e.getKeyCode() == KeyEvent.VK_DELETE ) {
//			
//		} else {
		
		char result = (char) e.getKeyChar();
		
		switch ( result ) {
		case '+':
		case '-':
		case '/':
		case 'x':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
		case '0':
		case 'i':
		case '.':
		case '\u0008':
		case '\u007F':
			break;
		case '=':
			break;
		default:
		
			CalcPanel calc = CalcPanel.getInstance();
			String bad = "Invalid Input";
		
			calc.setDisplay( ( calc.getDisplay().length() - 1 ) );
	    	JOptionPane.showMessageDialog( null, bad, "Invalid Input", 
	    			JOptionPane.PLAIN_MESSAGE );
		}
	}
	
   /**
    * Singleton method.
	* 
	* @return instance of ButtonListener
	*/
	public static KeyboardListener getInstance() {
	    // TODO Auto-generated method stub
	    if ( listener == null ) {
	         
	    	listener = new KeyboardListener();
	    }
	        
	    return listener;  
	}
}