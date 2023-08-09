import javax.swing.*;
import java.awt.*;
public class Calculator 
{
	JFrame frame=new JFrame("Calculator");
	JTextField textbox=new JTextField("0");
	JPanel panel=new JPanel();
	JButton[] buttons=new JButton[20];
	public Calculator()
	{
		frame.setSize(400,440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		addTextBox();
		frame.setVisible(true);
	}
	private void addTextBox()
	{
		textbox.setBounds(20,20,360,40);
		frame.add(textbox);
		textbox.setFont(new Font("arial",Font.PLAIN,25));
		textbox.setHorizontalAlignment(JTextField.RIGHT);
		textbox.setEditable(false);
		textbox.setBackground(Color.white);
		textbox.setBorder(BorderFactory.createLineBorder(Color.black,1));
		addPanel();
	}
	private void addPanel()
	{
		panel.setBounds(20,90,360,300);
		frame.add(panel);
		//panel.setBackground(Color.black);
		addButtons();
	}
	private void addButtons()
	{
		panel.setLayout(new GridLayout(5,4,5,5));
		Font font=new Font("arial",Font.PLAIN,20);
		String[] str= {"Back","CE","C","%","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
		for(int i=0;i<20;i++)
		{
			buttons[i]=new JButton(str[i]);
			buttons[i].setFont(font);
			panel.add(buttons[i]);
			if(i==3||i==7||i==11||i==15||i==19)
			{
				buttons[i].setForeground(Color.red);
			}
			else
			{
				buttons[i].setForeground(Color.blue);
			}
		}
		buttons[17].setFont(new Font("elephant",Font.PLAIN,25));
	}
	public static void main(String[] args) 
	{
		new Calculator();
	}
}
