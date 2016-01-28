package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculatorView extends JFrame implements ActionListener,MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ta;
	private JButton btAC;
    public CalculatorView(){
    	setTitle("Calculator");
		setLayout(new GridLayout(2,1) );
		setSize(500,500);
		
		
		
		JPanel panel1= new JPanel(new BorderLayout());
		
		JPanel panel2= new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton  btMode= new JButton("Mode");
		btMode.addMouseListener(this);
		JButton btSetting= new JButton("Setting");
		panel2.add(btMode);
		panel2.add(btSetting);
		panel1.add(panel2,BorderLayout.NORTH);
		
		
		JScrollPane scroll= new JScrollPane(ta= new JTextArea(4,5));
		panel1.add(scroll,BorderLayout.CENTER);
		
		JTextField textField2= new JTextField(10);
		panel1.add(textField2,BorderLayout.SOUTH);
		add(panel1);
		
		JPanel panel3= new JPanel(new GridLayout(6,1));
		
		JPanel panel31= new JPanel(new FlowLayout(FlowLayout.LEFT));
		btAC= new JButton("AC");
		btAC.addActionListener(this);
		JButton btDel= new JButton("Del");
		btDel.addActionListener(this);
		panel31.add(btAC);
		panel31.add(btDel);
		panel3.add(panel31);
		
		JPanel panel32= new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton bt7= new JButton("7");
		bt7.addActionListener(this);
		JButton bt8= new JButton("8");
		bt8.addActionListener(this);
		JButton bt9= new JButton("9");
		bt9.addActionListener(this);
		JButton bt_ngoac1 = new JButton("(");
		bt_ngoac1.addActionListener(this);
		JButton bt_ngoac2 = new JButton(")");
		bt_ngoac2.addActionListener(this);
		JButton bt_ngoacNhon1= new JButton("{   ");
		bt_ngoacNhon1.addActionListener(this);
		JButton bt_ngoacNhon2= new JButton("}   ");
		bt_ngoacNhon2.addActionListener(this);
		panel32.add(bt7);
		panel32.add(bt8);
		panel32.add(bt9);
		panel32.add(bt_ngoac1);
		panel32.add(bt_ngoac2);
		panel32.add(bt_ngoacNhon1);
		panel32.add(bt_ngoacNhon2);
		panel3.add(panel32);
		
		JPanel panel33= new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton bt_cong= new JButton("+");
		bt_cong.addActionListener(this);
		JButton bt_tru= new JButton("-");
		bt_tru.addActionListener(this);
		JButton bt4= new JButton("4");
		bt4.addActionListener(this);
		JButton bt5= new JButton("5");
		bt5.addActionListener(this);
		JButton bt6= new JButton("6");
		bt6.addActionListener(this);
		JButton btSin= new JButton("Sin");
		btSin.addActionListener(this);
		JButton btArsin= new JButton("arsin");
		btArsin.addActionListener(this);
		panel33.add(bt_cong);
		panel33.add(bt_tru);
		panel33.add(bt4);
		panel33.add(bt5);
		panel33.add(bt6);
		panel33.add(btSin);
		panel33.add(btArsin);
		panel3.add(panel33);
		
		JPanel panel34= new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton bt_nhan= new JButton("*");
		bt_nhan.addActionListener(this);
		JButton bt_chia= new JButton("/ ");
		bt_chia.addActionListener(this);
		JButton bt1= new JButton("1");
		bt1.addActionListener(this);
		JButton bt2= new JButton("2");
		bt2.addActionListener(this);
		JButton bt3= new JButton("3");
		bt3.addActionListener(this);
		JButton btCos= new JButton("Cos");
		btCos.addActionListener(this);
		JButton btArcos= new JButton("Arcos");
		btArcos.addActionListener(this);
		panel34.add(bt_nhan);
		panel34.add(bt_chia);
		panel34.add(bt1);
		panel34.add(bt2);
		panel34.add(bt3);
		panel34.add(btCos);
		panel34.add(btArcos);
		panel3.add(panel34);
		
		JPanel panel35= new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton bt0= new JButton("0");
		bt0.addActionListener(this);
		JButton bt_bang = new JButton("=");
		bt_bang.addActionListener(this);
		JButton bt_cham= new JButton(".");
		bt_cham.addActionListener(this);
		panel35.add(bt_cham);
		panel35.add(bt_bang);
		panel35.add(bt0);
		panel3.add(panel35);
		
		add(panel3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
    }
	public static void main(String[] args) {
		new CalculatorView();
	}
	
	
	public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand()=="=" ) System.out.println(ta.getTabSize());
	else if(e.getSource()== btAC ) ta.setText(null);
		 
		 else if (e.getActionCommand()=="Del") {
	    String a=ta.getText();
	    
		ta.replaceRange(null,a.length()-1,a.length());
	//ystem.out.println(e.getModifiers());
		}
		 else{
		 String act= e.getActionCommand();
		 ta.append(act);
		 }
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		ta.append("Mode");
		
	}
	@Override
	public void mouseEntered(MouseEvent e){
		System.out.println(getTitle());
	
		
	}
	
		
	
}
