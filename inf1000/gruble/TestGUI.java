import javax.swing.*;

public class TestGUI {

    JFrame ramme;
    JLabel tekst;

    public TestGUI(String str){
	int i = Integer.parseInt(str);
	String fac  = Integer.toString(fac(i));

        ramme = new JFrame ("nFac");
        tekst = new JLabel (fac);


        ramme.add(tekst);

        ramme.setSize (200, 200);
        ramme.setVisible(true);
        ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    int fac(int n){

        if (n > 0 ){
            return n*fac(n-1);
        }

        return 1;

    }
}
