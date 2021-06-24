package today_solving;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnOffButton extends JFrame {
   public OnOffButton() {
      super("라벨스위치");
      JPanel myPanel =new JPanel();
      this.setContentPane(myPanel);
      JLabel theLabel = new JLabel("On");   
      myPanel.add(theLabel);
      MouseListener bListener = new MyListener(theLabel);
      myPanel.addMouseListener(bListener);
      this.setSize(400,80);
      this.setVisible(true);
   }
   public static void main(String[] args) {
      new OnOffButton();
   }
}

class MyListener implements MouseListener {
   JLabel theLabel;
   public MyListener(JLabel theLabel){
      this.theLabel = theLabel;
   }
   public void mouseClicked (MouseEvent  e){
      if(theLabel.getText().equals("On")) {theLabel.setText("Off");}
      else { theLabel.setText("On"); }
   }

   public void mouseEntered (MouseEvent e) {
      
   }
   public void mouseExited (MouseEvent e) {
      
   }
   
   public void mousePressed (MouseEvent e) {
      
   }
      
   public void mouseReleased(MouseEvent e) {
      
   }
}