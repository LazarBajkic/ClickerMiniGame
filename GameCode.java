import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameCode extends JFrame implements ActionListener{

    int counter=0;
    int upgrade=0;
    JLabel instructions=new JLabel();
    JLabel counterLbl=new JLabel();
    JButton click=new JButton();
    JButton clickUpgrade1=new JButton("+2 on click");
    JButton clickUpgrade2=new JButton("+5 on click");
    JButton clickUpgrade3=new JButton("+10 on click");
    Icon btnIcon=new ImageIcon("Gent.jpg");

    GameCode(){
        this.setSize(530,600);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        instructions.setText("To increase your score simply click on the gentleman!");
        instructions.setSize(360,30);
        instructions.setVisible(true);
        instructions.setLocation(10, 30);
        instructions.setFont(new Font("Tahoma",Font.BOLD,13));

        click.setIcon(btnIcon);
        click.setSize(250,250);
        click.setLocation(65,200);
        click.addActionListener(this);

        clickUpgrade1.setSize(110,25);
        clickUpgrade1.setLocation(400,100);
        clickUpgrade1.addActionListener(this);
        clickUpgrade1.setEnabled(false);

        clickUpgrade2.setSize(110,25);
        clickUpgrade2.setLocation(400,150);
        clickUpgrade2.addActionListener(this);
        clickUpgrade2.setEnabled(false);

        clickUpgrade3.setSize(110,25);
        clickUpgrade3.setLocation(400,200);
        clickUpgrade3.addActionListener(this);
        clickUpgrade3.setEnabled(false);

        counterLbl.setText("Your score: ");
        counterLbl.setLocation(10,70);
        counterLbl.setSize(150, 30);
        counterLbl.setVisible(true);
        counterLbl.setFont(new Font("Tahoma",Font.BOLD,13));

        this.add(click);
        this.add(clickUpgrade1);
        this.add(clickUpgrade2);
        this.add(clickUpgrade3);
        this.add(instructions);
        this.add(counterLbl);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==click){
            if(counter >= 25){
                clickUpgrade1.setEnabled(true);
            }
            if(counter>=50){
                clickUpgrade2.setEnabled(true);
            }
            if(counter>=500){
                clickUpgrade3.setEnabled(true);
            }
            counter++;
            counterLbl.setText("Your score: "+counter);
        }
        if(e.getSource()==clickUpgrade1){
            upgrade=2;
            clickUpgrade1.setEnabled(false);
        }
        if(e.getSource()==click && upgrade==2){
            counter=counter+upgrade-1;
            clickUpgrade1.setEnabled(false);
            counterLbl.setText("Your score: "+counter);
        }
        if(e.getSource()==clickUpgrade2){
            upgrade=5;
            clickUpgrade2.setEnabled(false);
        }
        if(e.getSource()==click&& upgrade==5){
            counter=counter+upgrade-1;
            clickUpgrade2.setEnabled(false);
            clickUpgrade1.setEnabled(false);
            counterLbl.setText("Your score: "+counter);
        }
        if(e.getSource()==clickUpgrade3){
            upgrade=10;
            clickUpgrade3.setEnabled(false);
        }
        if(e.getSource()==click&& upgrade==10){
            counter=counter+upgrade-1;
            clickUpgrade3.setEnabled(false);
            clickUpgrade2.setEnabled(false);
            clickUpgrade1.setEnabled(false);
            counterLbl.setText("Your score: "+counter);
        }
    }
}
