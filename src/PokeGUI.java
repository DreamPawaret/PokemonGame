import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PokeGUI extends JFrame {

    private GamePlay game;

    public void start(){
        JFrame frame = new JFrame();
        frame.setTitle("Pokemon Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(375, 667);
        frame.setResizable(false);

        JPanel top = new JPanel();
        JPanel input = new JPanel(new FlowLayout());
        JLabel t1 = new JLabel("Enter your name ");
        JTextField inputName = new JTextField(15);

        JButton b1 = new JButton("START");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.removeAll();
                frame.setVisible(false);
                main();
            }
        });

        input.add(t1);
        input.add(inputName);
        input.add(b1);
        top.add(input);

        frame.getContentPane().add(top);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void  main(){

        JFrame frame = new JFrame("PokémonGame");

        JPanel p6 = new JPanel();
        p6.setLayout(new BoxLayout(p6,BoxLayout.Y_AXIS));

        JLabel t1 = new JLabel();
        t1.setText("PokémonGame");
        //t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,45));

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(false);
                pokedex();
            }
        });
        //b1.setBounds(20,480,150,40);
        b1.setText("Pokédex");
        b1.setFont(new java.awt.Font("Tahoma",1,18));
        JButton b2 = new JButton();
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(false);
                item();
            }
        });
        //b2.setBounds(20,530,150,40);
        b2.setText("Item");
        b2.setFont(new java.awt.Font("Tahoma",1,18));
        p1.add(b1);
        p1.add(b2);

        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
        JButton b3 = new JButton();
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(false);
                battle();
            }
        });
        //b3.setBounds(190,480,150,40);
        b3.setText("Battle");
        b3.setFont(new java.awt.Font("Tahoma",1,18));
        JButton b4 = new JButton();
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(false);
                shop();
            }
        });
        //b4.setBounds(190,530,150,40);
        b4.setText("Shop");
        b4.setFont(new java.awt.Font("Tahoma",1,18));
        p2.add(b3);
        p2.add(b4);

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p3.add(p1);
        p3.add(p2);

        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
        p4.add(t1);

        JPanel p5 = new JPanel();
        p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
        JLabel p = new JLabel(new ImageIcon(getClass().getResource("img/trainer.gif")));
        p5.add(p);

        JButton b5 = new JButton();
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(false);
                System.exit(0);
            }
        });
        //b5.setBounds(29,580,300,40);
        b5.setText("Quit Game");
        b5.setFont(new java.awt.Font("Tahoma",1,18));

        p6.add(p4);
        p6.add(p5);
        p6.add(p3);
        p6.add(b5);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                main();
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        JLabel t2 = new JLabel();
        t2.setText("POTION");
        t2.setBounds(10,150,400,100);
        t2.setFont(new java.awt.Font("Tahoma",1,20));

        JLabel t3 = new JLabel();
        t3.setText("SUPER POTION");
        t3.setBounds(10,210,400,100);
        t3.setFont(new java.awt.Font("Tahoma",1,20));

        JLabel t4 = new JLabel();
        t4.setText("RAZZ BERRY");
        t4.setBounds(10,270,400,100);
        t4.setFont(new java.awt.Font("Tahoma",1,20));

        JLabel t5 = new JLabel();
        t5.setText("NANAB BERRY");
        t5.setBounds(10,330,400,100);
        t5.setFont(new java.awt.Font("Tahoma",1,20));

        JLabel t6 = new JLabel();
        t6.setText("PINAP BERRY");
        t6.setBounds(10,390,400,100);
        t6.setFont(new java.awt.Font("Tahoma",1,20));

        JButton b2 = new JButton();
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //frame.setVisible(false);
            }
        });
        b2.setBounds(230,180,100,30);
        b2.setText("BUY");
        b2.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b3 = new JButton();
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //frame.setVisible(false);
            }
        });
        b3.setBounds(230,240,100,30);
        b3.setText("BUY");
        b3.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b4 = new JButton();
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //frame.setVisible(false);
            }
        });
        b4.setBounds(230,300,100,30);
        b4.setText("BUY");
        b4.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b5 = new JButton();
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //frame.setVisible(false);
            }
        });
        b5.setBounds(230,360,100,30);
        b5.setText("BUY");
        b5.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b6 = new JButton();
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //frame.setVisible(false);
            }
        });
        b6.setBounds(230,420,100,30);
        b6.setText("BUY");
        b6.setFont(new java.awt.Font("Tahoma",1,16));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main();
                frame.setVisible(false);
            }
        });
        b1.setBounds(29,580,300,40);
        b1.setText("Back");
        b1.setFont(new java.awt.Font("Tahoma",1,18));

        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
        frame.add(t6);
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

    public void status(){
        JFrame frame = new JFrame();

        JLabel t1 = new JLabel();
        t1.setText("Status");
        t1.setBounds(10,20,400,100);
        t1.setFont(new java.awt.Font("Tahoma",1,50));

        JButton b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                item();
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
                main();
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
                main();
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
        t1.setFont(new java.awt.Font("Tahoma",1,20));

        JLabel t2 = new JLabel();
        t2.setText("WEIGHT : 9 kg");
        t2.setBounds(20,320,200,100);
        t2.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t3 = new JLabel();
        t3.setText("HEIGHT : 0.4 m");
        t3.setBounds(20,360,200,100);
        t3.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t4 = new JLabel();
        t4.setText("TYPE : ELECTRIC");
        t4.setBounds(20,400,200,100);
        t4.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t5 = new JLabel();
        t5.setText("MOUSE POKEMON");
        t5.setBounds(20,440,200,100);
        t5.setFont(new java.awt.Font("Tahoma",1,17));

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
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
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

        JLabel t2 = new JLabel();
        t2.setText("WEIGHT : 6.9 kg");
        t2.setBounds(20,320,200,100);
        t2.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t3 = new JLabel();
        t3.setText("HEIGHT : 0.7 m");
        t3.setBounds(20,360,200,100);
        t3.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t4 = new JLabel();
        t4.setText("TYPE : GRASS/POISON");
        t4.setBounds(20,400,200,100);
        t4.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t5 = new JLabel();
        t5.setText("SEED POKEMON");
        t5.setBounds(20,440,200,100);
        t5.setFont(new java.awt.Font("Tahoma",1,17));

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
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
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

        JLabel t2 = new JLabel();
        t2.setText("WEIGHT : 8.5 kg");
        t2.setBounds(20,320,200,100);
        t2.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t3 = new JLabel();
        t3.setText("HEIGHT : 0.6 m");
        t3.setBounds(20,360,200,100);
        t3.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t4 = new JLabel();
        t4.setText("TYPE : FIRE");
        t4.setBounds(20,400,200,100);
        t4.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t5 = new JLabel();
        t5.setText("LIZARD POKEMON");
        t5.setBounds(20,440,200,100);
        t5.setFont(new java.awt.Font("Tahoma",1,17));

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
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
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

        JLabel t2 = new JLabel();
        t2.setText("WEIGHT : 9 kg");
        t2.setBounds(20,320,200,100);
        t2.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t3 = new JLabel();
        t3.setText("HEIGHT : 0.5 m");
        t3.setBounds(20,360,200,100);
        t3.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t4 = new JLabel();
        t4.setText("TYPE : WATER");
        t4.setBounds(20,400,200,100);
        t4.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t5 = new JLabel();
        t5.setText("TINY TURTLE POKEMON");
        t5.setBounds(20,440,300,100);
        t5.setFont(new java.awt.Font("Tahoma",1,17));

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
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
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

        JLabel t2 = new JLabel();
        t2.setText("WEIGHT : 10 kg");
        t2.setBounds(20,320,200,100);
        t2.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t3 = new JLabel();
        t3.setText("HEIGHT : 0.9 m");
        t3.setBounds(20,360,200,100);
        t3.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t4 = new JLabel();
        t4.setText("TYPE : WATER");
        t4.setBounds(20,400,200,100);
        t4.setFont(new java.awt.Font("Tahoma",1,17));

        JLabel t5 = new JLabel();
        t5.setText("FISH POKEMON");
        t5.setBounds(20,440,200,100);
        t5.setFont(new java.awt.Font("Tahoma",1,17));

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
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
        frame.add(b1);

        frame.setSize(375,667);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

}
