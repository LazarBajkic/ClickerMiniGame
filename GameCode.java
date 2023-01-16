import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameCode extends JFrame implements ActionListener{

    int counter=0;
    JLabel instructions=new JLabel();
    JLabel counterLbl=new JLabel();
    JButton click=new JButton();
    Icon btnIcon=new ImageIcon("Gent.jpg");

    GameCode(){
        this.setSize(400,600);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        instructions.setText("To increase your score simply click on the gentleman!");
        instructions.setSize(350,30);
        instructions.setVisible(true);
        instructions.setLocation(10, 30);

        click.setIcon(btnIcon);
        click.setSize(250,250);
        click.setLocation(65,200);
        click.addActionListener(this);

        counterLbl.setText("Your score: ");
        counterLbl.setLocation(10,70);
        counterLbl.setSize(150, 30);
        counterLbl.setVisible(true);

        this.add(click);
        this.add(instructions);
        this.add(counterLbl);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==click){
            counter++;
            counterLbl.setText("Your score: "+counter);
        }
    }
}
