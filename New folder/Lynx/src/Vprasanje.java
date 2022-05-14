/***********************************************************************
 * Module:  Vprasanje.java
 * Author:  Admin
 * Purpose: Defines the Class Vprasanje
 ***********************************************************************/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

/** @pdOid 5efa07b1-83d8-49ae-acb2-7778adb8101a */
public class Vprasanje {
   /** @pdOid 2f6d641a-5041-4cc4-b46a-4a724a162e5d */
   private String tip;
   /** @pdOid 8b32d766-b087-4234-8860-717927c7dc1f */
   private int id;
   KResiKviz resi2 = new KResiKviz();
   /** @pdOid 7e045cdf-c930-4e7d-9e31-fead576984cc */
   public String vrniSeznamVprasanja(String [] ques) {
      String b = resi2.vrniSeznamVprasanja(ques);
      return b;
   }

}