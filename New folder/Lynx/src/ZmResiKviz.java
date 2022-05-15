/***********************************************************************
 * Module:  ZmResiKviz.java
 * Author:  Admin
 * Purpose: Defines the Class ZmResiKviz
 ***********************************************************************/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/** @pdOid 05ea39cb-c529-4abf-b00c-409f0cba183c */
public class ZmResiKviz {
   /** @pdRoleInfo migr=no name=KResiKviz assc=association5 mult=1..1 */
   public KResiKviz kResiKviz;

   public JFrame f = new JFrame();
   public JLabel l = new JLabel();

   public JPanel p = new JPanel();
   public JButton but = new JButton("START");
   public JButton yes = new JButton("YES");
   public JButton no = new JButton("NO");
   public JTextField  t1= new JTextField("Ime");
   public JTextField t2= new JTextField("Prezime");

   public JButton submit = new JButton("SUBMIT");
   public ggg main = new ggg();
   public int count = 0;
   public int strCount = 1;
   public int points = 0;
   public boolean isFinished = false;
   public String name = "";
   public String surname = "";

   /** @pdOid d77c97a0-bcc3-450d-9a10-d6846137d27d */
   public void zacniResevanje() {
      t1.setVisible(false);
      t2.setVisible(false);
      f.setTitle("Love questionaire");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
      //APPROACH - 1 : Using getScreenSize() method
      Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
      Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.
      f.setSize(screenSize.width,screenSize.height); //Set the width and height of the JFrame.
      //APPROACH - 2 : Using MAXIMIZED_BOTH
      f.setExtendedState(JFrame.MAXIMIZED_BOTH);


      l.setLocation(800, 50);
      l.setSize(1000,500);
      // add text to label
      l.setText("To start the question please set the start button");
      l.setFont(new Font("Serif", Font.PLAIN, 24));

      but.setLocation(900,600);
      but.setSize(80,50);
      // create a panel

      p.setLayout(null);
      p.setBackground(Color.pink);
      // add label to panel
      p.add(l);
      p.add(but);
      // add panel to frame
      f.add(p);
   }
   
   /** @pdOid de621ad3-e42c-4f62-9c32-e80de94c37af */
   public boolean odgovoriVprasanja() {


         yes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               points+=33;
               count++;

               if(strCount <= 2){
                  l.setText(ggg.ques[strCount]);
               }
               strCount++;
               if(count > 2) {
                  yes.setVisible(false);
                  no.setVisible(false);
                  yes.setEnabled(false);
                  no.setEnabled(false);

               }
               if(count == 3){
                  zakljuciResevanje();
                  vnesiImeInPriimek();
                  zahtevajVnosImeInPriimek();
               }

            }

         });
         no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               count++;
               if(strCount <= 2){
                  l.setText(ggg.ques[strCount]);
               }
               strCount++;
               if(count > 2) {
                  no.setVisible(false);
                  yes.setVisible(false);

               }
               if(count == 3){
                  zakljuciResevanje();
                  vnesiImeInPriimek();
                  zahtevajVnosImeInPriimek();
               }
            }
         });




         if(count > 2) isFinished = true;

      return true;
   }
   
   /** @pdOid b2c680ad-c0e1-4da9-8bf7-9bf45eb95ad5 */
   public void zahtevajVnosImeInPriimek() {
      submit.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            name = t1.getText();
            surname = t2.getText();
            t1.setVisible(false);
            t2.setVisible(false);
            submit.setVisible(false);
            count++;
            prikaziRezultat();
         }
      });

   }
   
   /** @pdOid c8060d13-34cf-49a7-b43d-a91460e31816 */
   public String vnesiImeInPriimek() {





         t2.setBounds(1150, 700, 300, 30);
         t1.setBackground(Color.white);
         t2.setBackground(Color.white);
         t2.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
         t1.setBounds(450, 700, 300, 30);
         t1.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
         submit.setBounds(900, 500, 100, 100);
         t1.setFont(new Font("Serif", Font.PLAIN, 16));
         t2.setFont(new Font("Serif", Font.PLAIN, 16));

         p.add(t1);
         p.add(t2);
         p.add(submit);
      t1.setVisible(true);
      t2.setVisible(true);
      submit.setVisible(true);

      return null;
   }
   
   /** @pdOid f975971f-eb95-4b39-8285-42df563d3759 */
   public void obvestiOUspesenZakljucek() {
      // TODO: implement
   }
   
   /** @pdOid ba13fa0e-0f99-425f-b85a-76533c5f0aa3 */
   public void obvestiONapako() {
      // TODO: implement
   }
   
   /** @pdOid 51da916c-61b4-4c5d-bcee-434e9bf0d7fd */
   public void prikaziVprasanja() {
      but.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            but.setVisible(false);


            l.setText(main.quest[0]);
            yes.setLocation(800,600);
            yes.setSize(80,50);
            no.setLocation(1000,600);
            no.setSize(80,50);
            p.add(no);
            p.add(yes);

         }
      });
   }
   
   /** @pdOid 68f170cd-a943-452d-873f-163fd5839cd7 */
   public void prikaziPomoc() {
      // TODO: implement
   }
   
   /** @pdOid 5b19c9be-4fc0-46f9-ba00-0dbb45fd46a7 */
   public void zahtevajPomoc() {
      // TODO: implement
   }
   
   /** @pdOid 1b412d7b-fee1-49ef-ae86-71ba6bd27334 */
   public void zakljuciResevanje() {

      l.setText("Hooray you finished! Now write your name and surname!");
   }
   
   /** @pdOid c2c1264e-e54c-4b50-afb8-23b86eabf6ea */
   public void zahtevajRezultat() {
      // TODO: implement
   }
   
   /** @pdOid 04cecd53-6022-401a-b171-9f401596e8e5 */
   public void prikaziRezultat() {

      if(points >=50)
      l.setText(name + " " + surname + " you are in love");
      else l.setText(name + " " + surname + " you are not in love");
      System.out.println(count);
   }

}