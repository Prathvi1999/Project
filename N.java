import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class E implements ActionListener
{

JLabel l1=new JLabel("1st no");
JLabel l2=new JLabel("2nd no");
JLabel l3=new JLabel("3rd no");


JTextField t1=new JTextField(15);
JTextField t2=new JTextField(15);
JTextField t3=new JTextField(15);

JButton b=new JButton("calculate");
E()
{
	

JFrame jf=new JFrame("calculating");
jf.setLayout(new FlowLayout());
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.add(l1);
jf.add(t1);

jf.add(l2);
jf.add(t2);

jf.add(l3);
jf.add(t3);

jf.add(b);
b.addActionListener(this);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
	float a=Float.parseFloat(t1.getText());
	float b=Float.parseFloat(t2.getText());
	float c=Float.parseFloat(t3.getText());
	
	if(ae.getActionCommand().equals("calculate"))
	{
		float sum=a+b+c;
		float avg=sum/3;
		float large=Math.max((Math.max(a,b)),c);
		
	
	JOptionPane.showMessageDialog(null,"sum="+sum+"avg="+avg+"large="+large);
	}
	
}
}

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
E e1=new E();
	}

}
