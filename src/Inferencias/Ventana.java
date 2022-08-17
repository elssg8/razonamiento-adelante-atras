package Inferencias;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel lb1;
    private JLabel lb2;
    private JButton btn_iniciar;
    private JComboBox cb1;
    private JComboBox cb2;
    private JComboBox cb3;
    private JTextArea txtA_1;

    public Ventana(){
        this.setSize(1300,700);//Se crea una ventana de 500x500 px
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("holi");
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    public void iniciarComponentes(){
       panel();
       etiquetas();
       botones();
       comboBox();
       textArea();
    }

    public void panel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void etiquetas(){
        lb1 = new JLabel("Selecciona la meta: ");
        lb1.setBounds(10, 10, 160, 30);

        lb2 = new JLabel("<html>Selecciona 2 elementos en la base de conocimiento: </html>");
        lb2.setBounds(10, 40, 160, 60);

        panel.add(lb1);
        panel.add(lb2);
    }

    public void botones(){
        btn_iniciar = new JButton("Iniciar");
        btn_iniciar.setBounds(800, 40, 100, 30);
        panel.add(btn_iniciar);

        //Action Listener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String meta = (String)cb1.getSelectedItem();
                String conocimiento_1 = (String)cb2.getSelectedItem();
                String conocimiento_2 = (String)cb3.getSelectedItem();
                (new Thread(new HaciaAdelante(meta, conocimiento_1, conocimiento_2))).start();
            }
        };

        btn_iniciar.addActionListener(listener);
    }

    public void comboBox(){
        String[] base_conocimiento = {"h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9"};
        cb1 = new JComboBox(base_conocimiento);
        cb1.setBounds(200, 10, 110, 30);

        cb2 = new JComboBox<>(base_conocimiento);
        cb2.setBounds(200, 50, 50, 30);

        cb3 = new JComboBox(base_conocimiento);
        cb3.setBounds(260, 50, 50, 30);

        panel.add(cb1);
        panel.add(cb2);
        panel.add(cb3);
    }

    public void textArea(){
        txtA_1 = new JTextArea();
        txtA_1.setBounds(10, 100, 100, 100);

        panel.add(txtA_1);
    }
}
