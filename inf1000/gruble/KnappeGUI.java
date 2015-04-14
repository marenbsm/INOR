import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KnappeGUI {

    JFrame ramme;
    JPanel panel;
    JTextField innTekst;
    JLabel utTekst;
    JButton knapp;


    KnappeGUI() {
	ramme = new JFrame("Program-med-knapp");
	panel = new JPanel();
	innTekst = new JTextField(5);
	utTekst = new JLabel();
	knapp = new JButton(" <- Beregn fakultet ->");

	panel.add(innTekst);
	panel.add(knapp);
	panel.add(utTekst);

	knapp.addActionListener (new Lytter ());

	ramme.add(panel);

	ramme.setSize (300,300);
	ramme.setVisible(true);
	ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    class Lytter implements ActionListener {
	public void actionPerformed(ActionEvent e){
	    String str = innTekst.getText();
	    int i = Integer.parseInt(str);
	    String fac  = Integer.toString(fac(i));
	    utTekst.setText("Fakultet av " +i+ " er " +fac);

	}
    }

    int fac(int n){

	if (n > 0 ){
	    return n*fac(n-1);
	}

	return 1;

    }
}
