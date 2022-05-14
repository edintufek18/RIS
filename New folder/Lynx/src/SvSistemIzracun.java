/***********************************************************************
 * Module:  SvSistemIzracun.java
 * Author:  Admin
 * Purpose: Defines the Class SvSistemIzracun
 ***********************************************************************/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/** @pdOid 2363900d-2a34-4066-a82b-4c1c8da22d75 */
public class SvSistemIzracun {
   /** @pdRoleInfo migr=no name=KResiKviz assc=association7 mult=1..1 */
   public KResiKviz kResiKviz;
   
   /** @pdOid 8bce5597-da23-4925-ae0f-1adb87995b28 */
   public int izracunaj() {

      return kResiKviz.izracunaj();
   }

}