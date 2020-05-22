import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NumberFormatException;



public class JFromClass implements ActionListener{
    JFrame mainWindow=new JFrame("Decimal to Binary Conveter");
    JTextField decimal=new JTextField("Enter the decimal");
    //JTextField binary=new JTextField();
    JButton converion=new JButton("convert");
    JPanel pannel=new JPanel();
    JPanel panne2=new JPanel();
    StackArray stack1=new StackArray();

    public JFromClass() {
    }
    
    public void creatGUI(){
        
        //pannels
        pannel.add(decimal);
        //pannel.add(binary);
        pannel.setSize(100, 50);
        
        panne2.setBorder(new TitledBorder("Click Convert button to convert !!"));
        panne2.add(converion);
        
        //frames
        mainWindow.add(pannel);
        mainWindow.add(panne2);
        mainWindow.setSize(600,400);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setLayout(new GridLayout(4, 8));
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        
          
          converion.addActionListener(this);
    }
    
    @Override
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == converion) {
            
            int intialDecimal;
            try{
                intialDecimal = Integer.parseInt(decimal.getText());
                while (true) {

                    if (intialDecimal == 1) {
    
                        stack1.push(1);
                        break;
                    } else {
    
                        stack1.push(intialDecimal % 2);
                        intialDecimal = intialDecimal / 2;
                    }
    
                }
                String result = "";
                while (stack1.getTop() > -1) {
                    result = result + stack1.pop();
                }
                decimal.setText(result);
            }
            catch(NumberFormatException ex){
                decimal.setText("Not a number");
            }
            
            
        }

    }
    
    
    
}
