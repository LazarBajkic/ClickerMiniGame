import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameCode extends JFrame implements ActionListener{

    int counter=0;
    JLabel instructions=new JLabel();
    JLabel counterLbl=new JLabel();
    JButton click=new JButton();
    ImageIcon btnIcon=new ImageIcon();

    GameCode(){
        this.setSize(400,600);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        instructions.setText("To increase your score simply click on the cookie!");
        instructions.setSize(250,30);
        instructions.setVisible(true);
        instructions.setLocation(10, 30);

        click.setIcon(btnIcon);
        click.setSize(250,250);
        click.setLocation(100,300);
        click.addActionListener(this);

        counterLbl.setText("Your score: ");
        counterLbl.setLocation(10,40);
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
