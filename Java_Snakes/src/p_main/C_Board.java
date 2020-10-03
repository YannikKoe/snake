package p_main;

import javax.swing.JPanel;

/**
 * This class builds the play board.
 * 
<<<<<<< HEAD
 * @author Yannik Kösling
=======
 * @author Yannik Koesling, Stephan Schellenberg, Jacob Waniekle
>>>>>>> refs/heads/master
 * @version 1.0
 */
public class C_Board {
	
	/**
	 * Declaration and initialization of the objects
	 */
	JPanel o_boardPanel = new JPanel();
	
	/**
	 * Constructor
	 */
	public C_Board() {
<<<<<<< HEAD
		m_buildBoard();
	}
	
	/**
	 * Methode baut Fensterumgebung auf
	 */
	private void m_buildBoard() {
	
		setTitle("Welcome to Snake!");	
		setSize(k_width, k_height); 					//Fenstergröße
		setLocationRelativeTo(null); 			 		//Platziert Fenster in der Mitte
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 		//Beendet Applikation sobald auf 'x'-Knopf gedrÃ¼ckt wird
		setResizable(true);   							// Damit Fenster vergroessert/verkleinert werden kann
=======
>>>>>>> refs/heads/master
		
		
		
	}
<<<<<<< HEAD
	
	/**
	 * FÃ¼gt die Bedienelemente hinzu
	 */
	private void m_setControls() {
		o_panel.add(o_cb_sound);
		o_cb_sound.setForeground(Color.yellow);
		o_cb_sound.setEnabled(true);
		o_cb_sound.addItemListener(this);
	}

	/**
	 * Eventhandler beziehungsweise Behandler für ItemListener
	 */
	public void itemStateChanged(ItemEvent e) {
		
		Object source = e.getItemSelectable();
		
		if(source == o_cb_sound) {
			System.out.println("hihi");
		}
		
	}
	
=======
>>>>>>> refs/heads/master
}
