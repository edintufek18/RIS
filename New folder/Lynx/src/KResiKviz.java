/***********************************************************************
 * Module:  KResiKviz.java
 * Author:  Admin
 * Purpose: Defines the Class KResiKviz
 ***********************************************************************/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/** @pdOid e5ed9e08-0e36-46a3-bfc0-9d0ed598dfb5 */
public class KResiKviz {
   /** @pdRoleInfo migr=no name=Vprasanje assc=association8 mult=1..* */
   public Vprasanje[] vprasanje;
   /** @pdRoleInfo migr=no name=Pomoc assc=association9 mult=1..1 */
   public Pomoc pomoc;
   public ZmResiKviz resi3 = new ZmResiKviz();

   /** @pdOid 0d662157-621e-4339-95be-997d5d5efa97 */
   public String vrniSeznamVprasanja(String [] ques) {
      returnQuestions(ques);


      return "vrneno";
   }
   public String[] returnQuestions(String []  ques){
      return ques;
   }
   
   /** @pdOid cfcb5411-a67a-4e7a-9ba2-ef3a1eef139d */
   public void shraniOdgovor() {
      // TODO: implement
   }
   
   /** @pdOid 1ee174f3-5160-46dd-8ac4-7c36ac792e2a */
   public String vrniRezultat() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 06c3a01f-750b-4a39-98c6-da560cb3f553 */
   public void zakjuciResevanje() {
      // TODO: implement
   }
   
   /** @pdOid 6705e016-5426-4e91-a604-2351d0df6b7c */
   public void zahtevajRezultat() {
      // TODO: implement
   }
   
   /** @pdOid 2977286e-0b48-48e0-84db-172f28e07bd0 */
   public String vrniPomoc() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 9a4d51b6-d353-478d-9d3c-90d95200c8a4 */
   public int izracunaj() {
      // TODO: implement
      return resi3.points;
   }
   
   /** @pdOid ae876c37-9d2a-49c7-bf80-e9d4eb8c819e */
   public void posljiSporociloRezultat() {
      // TODO: implement
   }

}