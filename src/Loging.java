import javax.swing.*;

public class Loging  extends JFrame {

    public Loging(){

        //miventana
        this.setLayout(null);
        this.setBounds(0,0, 800, 500);

        //credenciales
        JTextField usuario = new JTextField();
        usuario.setBounds(300, 20, 200, 50);

        this.add(usuario);
        this.setVisible(true);
    }


}
