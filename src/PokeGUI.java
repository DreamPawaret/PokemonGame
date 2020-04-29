import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.EventQueue;


public class PokeGUI extends JFrame {

    public ArrayList<Pokemon> bag = new ArrayList<>();

    public void start(){

        JFrame frame = new JFrame("PokémonGame");

        JLabel t1 = new JLabel();
        t1.setText("PokémonGame");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,50));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokedex();
                frame.setVisible(false);
            }
        });
        b1.setBounds(20,480,150,40);
        b1.setText("Pokédex");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        JButton b2 = new JButton();
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                item();
                frame.setVisible(false);
            }
        });
        b2.setBounds(20,530,150,40);
        b2.setText("Item");
        b2.setFont(new java.awt.Font("Tahoma",1,18));

        JButton b3 = new JButton();
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                battle();
                frame.setVisible(false);
            }
        });
        b3.setBounds(190,480,150,40);
        b3.setText("Battle");
        b3.setFont(new java.awt.Font("Tahoma",1,18));

        JButton b4 = new JButton();
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shop();
                frame.setVisible(false);
            }
        });
        b4.setBounds(190,530,150,40);
        b4.setText("Shop");
        b4.setFont(new java.awt.Font("Tahoma",1,18));

        JButton b5 = new JButton();
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
        b5.setBounds(29,580,300,40);
        b5.setText("Quit Game");
        b5.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void pokedex(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Pokédex");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,50));

        JButton b2 = new JButton();
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pikachu();
                frame.setVisible(false);
            }
        });
        b2.setBounds(200,130,140,35);
        b2.setText("Pikachu");
        b2.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b3 = new JButton();
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                balbasaur();
                frame.setVisible(false);
            }
        });
        b3.setBounds(200,210,140,35);
        b3.setText("Balbasaur");
        b3.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b4 = new JButton();
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                charmander();
                frame.setVisible(false);
            }
        });
        b4.setBounds(200,290,140,35);
        b4.setText("Charmander");
        b4.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b5 = new JButton();
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                squirtle();
                frame.setVisible(false);
            }
        });
        b5.setBounds(200,370,140,35);
        b5.setText("Squirtle");
        b5.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b6 = new JButton();
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                magikarp();
                frame.setVisible(false);
            }
        });
        b6.setBounds(200,450,140,35);
        b6.setText("Magikarp");
        b6.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void shop(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Shop");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,50));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void item(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Item");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,50));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void battle(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Battle");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,50));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void pikachu(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Pikachu");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,30));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokedex();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));



        frame.add(t1);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void balbasaur(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Balbasaur");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,30));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokedex();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void charmander(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Charmander");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,30));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokedex();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void squirtle(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Squirtle");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,30));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokedex();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void magikarp(){

        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Magikarp");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,30));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokedex();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

}
