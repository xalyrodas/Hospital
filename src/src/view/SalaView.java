package view;
import model.Sala;
import services.bdSalas;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

    public class SalaView extends JPanel {
private ArrayList<Sala>listaSalas;

SalaView(ArrayList<Sala>listaSalas){
    this.listaSalas=listaSalas;
    iniciopanel();
        }
        public void  iniciopanel(){
    setLayout(new GridLayout(4 , 4));

    for (Sala salas:listaSalas){
        JPanel panelsalas=crearpanelsalas(salas.getNombre(),salas.getEstado());
        add(panelsalas);
    }
        }

    public  JPanel crearpanelsalas(String nomvre,String  estafdo){
    JPanel panelsalas=new JPanel();
    panelsalas.setLayout(new BorderLayout());
    JLabel nombresalaslabel=new JLabel(nomvre,SwingConstants.CENTER);
    panelsalas.add(nombresalaslabel,BorderLayout.CENTER);

    switch (estafdo){
        case "en uso":
            panelsalas.setBackground(Color.BLUE);
            break;
        case "fuera de servicio":
            panelsalas.setBackground(Color.CYAN);
            break;
        case "disponobles":
            panelsalas.setBackground(Color.GRAY);
         break;
    }
    panelsalas.setBorder(BorderFactory.createLineBorder(Color.RED));
return panelsalas;
}

    }
