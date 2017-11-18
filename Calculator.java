import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

	public class Calculator implements ActionListener{
	char o;
	int ctr=0;
	String value="", cv="", oBtn;
	Double answer, v1, v2;
	Double NumberConverted;


	Frame f;
	Panel p1, p2, p3, p4, p5, p6;
	public  TextField tField;
	public  Menu EditMenu,ExitMenu;
	public  MenuBar menuBar;
	public  MenuItem fmi1, fmi2, fmi3;
	public  Button num0, num1, num2, num3, num4, num5, num6, num7, num8,
	num9;
	public  Button bAdd, bSub, bMul, bDiv, bPer, bSqrt, bFrac, bInt, bDot,
	bCE, equals, backspace, clear,Sin,Cos,Tan,Log,Fact,Pow,Exp,pi;
	

	Calculator(){
		Font font1 = new Font("SansSerif", Font.BOLD, 40);
			f = new Frame(" Scientific Calculator");
			

			menuBar = new MenuBar();
			EditMenu = new Menu ("Edit");
			ExitMenu = new Menu ("Exit");
			fmi1 = new MenuItem(" Copy   ");
			fmi2 = new MenuItem(" Paste  ");
			
			fmi3= new MenuItem(" Quit    ");

			EditMenu.add(fmi1);
			EditMenu.add(fmi2);
			ExitMenu.add(fmi3);
			

			p1 = new Panel();
			p2 = new Panel();
			p3 = new Panel();
			p4 = new Panel();
			p5 = new Panel();
			p6 = new Panel();
		

			tField = new TextField(35);
			tField.setFont(font1);

			num0 = new Button("0");
			num1 = new Button("1");
			num2 = new Button("2");
			num3 = new Button("3");
			num4 = new Button("4");
			num5 = new Button("5");
			num6 = new Button("6");
			num7 = new Button("7");
			num8 = new Button("8");
			num9 = new Button("9");
			bAdd = new Button("+");
			bSub = new Button("-");
			bMul = new Button("x");
			bDiv = new Button("/");
			bPer = new Button("%");
			bSqrt = new Button("sqrt");
			bFrac = new Button("1/x");
			bInt = new Button("+/-");
			bDot = new Button(".");
			bCE = new Button("CE");
			equals = new Button("Answer=");
			backspace = new Button("Backspace");
			clear = new Button("C");
			Sin = new Button("Sin");
			Cos = new Button("Cos");
			Tan = new Button("Tan");
			Log = new Button("Log");
			Fact= new Button("Fact");
			Pow = new Button("Pow");
			Exp= new Button("exp");
			pi= new Button("pi");
	}

	public void launchFrame(){
		f.setBackground(Color.BLUE);
		
        backspace.setBackground(Color.GRAY);
		num7.setBackground(Color.GRAY);
		
		num0.setBackground(Color.GRAY);
		num4.setBackground(Color.GRAY);
		num1.setBackground(Color.GRAY);
		num6.setBackground(Color.GRAY);
		num9.setBackground(Color.GRAY);
		num3.setBackground(Color.GRAY);
		clear.setBackground(Color.GRAY);
		bDot.setBackground(Color.GRAY);
		bFrac.setBackground(Color.GRAY);
		bPer.setBackground(Color.GRAY);
		Exp.setBackground(Color.GRAY);
		Log.setBackground(Color.GRAY);
		bSqrt.setBackground(Color.GRAY);
		clear.setBackground(Color.RED);
	    
		
			tField.setText("0.");
			tField.setEnabled(false);

			menuBar.add(EditMenu);
            menuBar.add(ExitMenu);
			
			
			p2.add(backspace);
			p2.add(bCE);
			p2.add(clear);
			p2.add(Pow);
			p2.add(Exp);
             p2.add(pi);
			 
			p3.add(num7);
			p3.add(num8);
			p3.add(num9);
			p3.add(bDiv);
			p3.add(bSqrt);
			p3.add(Sin);

			p4.add(num4);
			p4.add(num5);
			p4.add(num6);
			p4.add(bMul);
			p4.add(bPer);
			p4.add(Cos);

			p5.add(num1);
			p5.add(num2);
			p5.add(num3);
			p5.add(bSub);
			p5.add(bFrac);
			p5.add(Tan);


			p6.add(num0);
			p6.add(bInt);
			p6.add(bDot);
			p6.add(bAdd);
			p6.add(Log);

			p6.add(equals);
			
			

			p2.setLayout(new GridLayout (1, 4, 3, 3) );
			p3.setLayout(new GridLayout (1, 4, 3, 3) );
			p4.setLayout(new GridLayout (1, 4, 3, 3) );
			p5.setLayout(new GridLayout (1, 4, 3, 3) );
			p6.setLayout(new GridLayout (1, 4, 3, 3) );
			

			f.setLayout(new GridLayout (6, 1) );
			f.setResizable(false);
			f.setSize(500,400);
			f.add(tField);
			f.add(p2);
			f.add(p3);
			f.add(p4);
			f.add(p5);
			f.add(p6);
			f.setVisible(true);
			f.setMenuBar(menuBar);
			

		
			clear.addActionListener(this);
			bCE.addActionListener(this);

			num0.addActionListener(this);
			num1.addActionListener(this);
			num2.addActionListener(this);
			num3.addActionListener(this);
			num4.addActionListener(this);
			num5.addActionListener(this);
			num6.addActionListener(this);
			num7.addActionListener(this);
			num8.addActionListener(this);
			num9.addActionListener(this);

			bAdd.addActionListener(this);
			bSub.addActionListener(this);
			bMul.addActionListener(this);
			bDiv.addActionListener(this);
			bPer.addActionListener(this);
			Sin.addActionListener(this);
			Cos.addActionListener(this);
			Log.addActionListener(this);
			Tan.addActionListener(this);
			Pow.addActionListener(this);
			Exp.addActionListener(this);
			pi.addActionListener(this);

			bInt.addActionListener(this);
			bSqrt.addActionListener(this);
			bFrac.addActionListener(this);
			bDot.addActionListener(this);

			equals.addActionListener(this);
			backspace.addActionListener(this);

			fmi1.addActionListener(this);
			fmi2.addActionListener(this);
			fmi3.addActionListener(this);
		}

		public void actionPerformed(ActionEvent a){
			String s1 = tField.getText();
			
			
		try{	
			if(a.getSource()==num0){
				value+=0;
				tField.setText(value);
			}
			if(a.getSource()==num1){
				value+=1;
				tField.setText(value);
			}
			if(a.getSource()==num2){
				value+=2;
				tField.setText(value);
			}
			if(a.getSource()==num3){
				value+=3;
				tField.setText(value);
			}
			if(a.getSource()==num4){
				value+=4;
				tField.setText(value);
			}
			if(a.getSource()==num5){
				value+=5;
				tField.setText(value);
			}
			if(a.getSource()==num6){
				value+=6;
				tField.setText(value);
			}
			if(a.getSource()==num7){
				value+=7;
				tField.setText(value);
			}
			if(a.getSource()==num8){
				value+=8;
				tField.setText(value);
			}
			if(a.getSource()==num9){
				value+=9;
				tField.setText(value);
			}

			if (a.getSource() == bAdd){
				v1 = Double.parseDouble( tField.getText() );
				ctr=0;
				o = '+';
				value="";
				tField.setText("" +value);
			}

			if (a.getSource() == bSub){
					v1 = Double.parseDouble( tField.getText() );
					ctr=0;
					o = '-';
					value="";
					tField.setText("" +value);
			}
				if (a.getSource() ==Pow){
					v1 = Double.parseDouble( tField.getText() );
					ctr=0;
					o = '^';
					value="";
					tField.setText("" +value);
			}
			if (a.getSource() == bMul){
					v1 = Double.parseDouble( tField.getText() );
					ctr=0;
					o = 'x';
					value="";
					tField.setText("" +value);
			}

			if (a.getSource() == bDiv){
					v1 = Double.parseDouble( tField.getText() );
					ctr=0;
					o = '/';
					value="";
					tField.setText("" +value);
			}

			if (a.getSource() == bPer){
					v1 = Double.parseDouble( tField.getText() );
					ctr=0;
					value="";
					answer = (v1/100);
					tField.setText("" +answer);
			}
			if(a.getSource()==Sin)
			{
				
				tField.setText("" + Math.sin(Double.valueOf(s1).doubleValue()));
			}
			if(a.getSource()==pi)
			{
				
				tField.setText("" + Math.PI);
			}
			
			if(a.getSource()==Exp)
			{
				
				tField.setText("" + Math.exp(Double.valueOf(s1).doubleValue()));
			}
			if(a.getSource()==Cos)
			{
				
				tField.setText("" + Math.cos(Double.valueOf(s1).doubleValue()));
			}
			if(a.getSource()==Log)
			{
				
				tField.setText("" + Math.log(Double.valueOf(s1).doubleValue()));
			}
			if(a.getSource()==Tan)
			{
				
				tField.setText("" + Math.tan(Double.valueOf(s1).doubleValue()));
			}
			
			if(a.getSource()==equals){
						value="";
						v2 = Double.parseDouble(tField.getText());

					if(o=='+'){
						ctr=0;
						answer = v1 + v2;
						tField.setText("" +answer);
						value=""; v1=null; v2=null;
					}
					else if(o=='-'){
						ctr=0;
						answer = v1 - v2;
						tField.setText("" +answer);
						value=""; v1=null; v2=null;
					}
					else if(o=='x'){
						ctr=0;
						answer = v1 * v2;
						tField.setText("" +answer);
						value=""; v1=null; v2=null;
					}
					else if(o=='/'){
						ctr=0;
						answer = v1 / v2;
						tField.setText("" +answer);
						value=""; v1=null; v2=null;
					}
					else if(o=='%'){
						ctr=0;
						answer = v1 % v2;
						tField.setText("" +answer);
						value=""; v1=null; v2=null;
					}
					else if(o=='^'){
						ctr=0;
						answer =Math.pow(v1,v2);
						tField.setText("" +answer);
						value=""; v1=null; v2=null;
					}
					else{}
			}
			
			if(a.getSource()==clear){
				ctr=0;
				v1=null;
				v2=null;
				value="";
				answer=0.;
				tField.setText("0.");

			}

			if(a.getSource()==bCE){
				ctr=0;
				value="";
				tField.setText("0.");
			}


			if(a.getSource() == bDot){
				if(ctr==0){
						value+=".";
						ctr+=1;
						tField.setText("" +value);
				}
				else{
					System.out.print("");
				}

			}

			if(a.getSource() == backspace){
					value = value.substring(0, value.length()-1 );
					tField.setText("" +value);
			}

			if(a.getSource() == bSqrt){
				ctr=0;
				value = "";
				v1 = Math.sqrt( Double.parseDouble( tField.getText() ) );
				tField.setText("" +v1);
			}

			if(a.getSource() == bInt){
				ctr=0;
				NumberConverted = ( Double.parseDouble(tField.getText()) * -1 );
				value = "";
				tField.setText("" +NumberConverted);
			}

			if(a.getSource() == bFrac){
				ctr=0;
				value = "";
				Double NumberContainer = ( 1 / Double.parseDouble(tField.getText() ) );
				tField.setText("" +NumberContainer);
			}


			if(a.getSource() == fmi1){
				cv = tField.getText();
			}

			if(a.getSource() == fmi2){
				tField.setText("" +cv);
			}

			if(a.getSource() == fmi3){
				System.exit(0);
			}

		}	


		catch(StringIndexOutOfBoundsException str){
			
		}
		catch(NumberFormatException nfe){
			
		}
		catch(NullPointerException npe){

		}

	}	



	public static void main (String args[]){
		Calculator s = new Calculator();
		s.launchFrame();
		
 
	}
}
