 import java.awt.*;
 import java.awt.event.*;

public class Test_Buttom {
  public static void main(String[] args) {
  Frame frm=new Frame("DataEntry frame");
//   Label lbl = new Label("Please fill this blank:");
//   frm.add(lbl);
  frm.setSize(300,250);
  frm.setVisible(true);
  frm.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent e){
  System.exit(0);
  }
  });
  Panel p = new Panel();
  Panel p1 = new Panel();
  Label jFirstName = new Label("First Name");
  TextField lFirstName = new TextField(20);
  Label jLastName =new Label("Last Name");
  TextField lLastName=new TextField(20);
  Label jID =new Label("ID");
  TextField lID=new TextField(20);
  Label jBATCH =new Label("Batch");
  TextField lBATCH=new TextField(20);
  Label jMNO =new Label("Mobile Number");
  TextField lMNO=new TextField(20);


  p.setLayout(new GridLayout(7,1));
  p.add(jFirstName);
  p.add(lFirstName);
  p.add(jLastName);
  p.add(lLastName);
  p.add(jID);
  p.add(lID);
  p.add(jBATCH);
  p.add(lBATCH);
  p.add(jMNO);
  p.add(lMNO);
  
  
  Button Submit=new Button("Submit");
  p.add(Submit);
  
  Button Button = new Button("Close");
  p.add(Button);
 // System.exit(0);
  p1.add(p);
  frm.add(p1,BorderLayout.NORTH);
  }
  
}
