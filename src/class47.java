import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public abstract class class47 extends Applet implements Runnable, FocusListener, WindowListener {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lea;"
   )
   protected static class154 field409;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Laa;"
   )
   static class47 field391 = null;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1361678311
   )
   static int field382 = 0;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 2836813929099139673L
   )
   static long field383 = 0L;
   @ObfuscatedName("n")
   static boolean field384 = false;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1689766149
   )
   static int field386 = 20;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1392235875
   )
   static int field387 = 1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1564891621
   )
   protected static int field388 = 0;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfg;"
   )
   static class160 field389;
   @ObfuscatedName("g")
   static long[] field390 = new long[32];
   @ObfuscatedName("e")
   static long[] field397 = new long[32];
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -698610971
   )
   static int field413;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -741352333
   )
   static int field400 = 500;
   @ObfuscatedName("au")
   static volatile boolean field399 = true;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = 7031479172029741533L
   )
   protected static long field412 = -1L;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      longValue = 1019046935399526603L
   )
   protected static long field380 = -1L;
   @ObfuscatedName("br")
   static String field414;
   @ObfuscatedName("fg")
   static int[][] field404;
   @ObfuscatedName("h")
   boolean field385 = false;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1359376647
   )
   protected int field393;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -699256651
   )
   protected int field415;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 914914601
   )
   int field395 = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1335456885
   )
   int field396 = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -541578041
   )
   int field392;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1973436221
   )
   int field398;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 970051927
   )
   int field405;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1582770673
   )
   int field407;
   @ObfuscatedName("an")
   Frame field401;
   @ObfuscatedName("as")
   Canvas field402;
   @ObfuscatedName("aw")
   volatile boolean field403 = true;
   @ObfuscatedName("az")
   boolean field381 = false;
   @ObfuscatedName("ao")
   volatile boolean field406 = false;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = 8431450235844399711L
   )
   volatile long field394 = 0L;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "Lap;"
   )
   class38 field408;
   @ObfuscatedName("aj")
   Clipboard field411;
   @ObfuscatedName("ae")
   final EventQueue field410;


   protected class47() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field410 = var1;
      class240.method4598(new class40());
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "114"
   )
   public final void method896(int var1, int var2) {
      if(this.field405 != var1 || var2 != this.field407) {
         this.method836();
      }

      this.field405 = var1;
      this.field407 = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;I)V",
      garbageValue = "-1496637941"
   )
   final void method844(Object var1) {
      if(this.field410 != null) {
         for(int var2 = 0; var2 < 50 && this.field410.peekEvent() != null; ++var2) {
            class18.method218(1L);
         }

         if(var1 != null) {
            this.field410.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Lfp;",
      garbageValue = "-24"
   )
   protected class156 method838() {
      if(this.field408 == null) {
         this.field408 = new class38();
         this.field408.method723(this.field402);
      }

      return this.field408;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "648845159"
   )
   protected void method839() {
      this.field411 = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1271957491"
   )
   protected void method929(String var1) {
      this.field411.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1606203667"
   )
   protected final void method973() {
      class262.method4940();
      Canvas var1 = this.field402;
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(class39.field350);
      var1.addFocusListener(class39.field350);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "19804"
   )
   protected final void method837() {
      Canvas var1 = this.field402;
      var1.addMouseListener(class48.field419);
      var1.addMouseMotionListener(class48.field419);
      var1.addFocusListener(class48.field419);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1973501131"
   )
   final void method888() {
      Container var1 = this.method856();
      if(var1 != null) {
         class310 var2 = this.method860();
         this.field393 = Math.max(var2.field3750, this.field392);
         this.field415 = Math.max(var2.field3751, this.field398);
         if(this.field393 <= 0) {
            this.field393 = 1;
         }

         if(this.field415 <= 0) {
            this.field415 = 1;
         }

         class9.field70 = Math.min(this.field393, this.field405);
         class37.field326 = Math.min(this.field415, this.field407);
         this.field395 = (this.field393 - class9.field70) / 2;
         this.field396 = 0;
         this.field402.setSize(class9.field70, class37.field326);
         class50.field455 = new class46(class9.field70, class37.field326, this.field402);
         if(var1 == this.field401) {
            Insets var3 = this.field401.getInsets();
            this.field402.setLocation(this.field395 + var3.left, var3.top + this.field396);
         } else {
            this.field402.setLocation(this.field395, this.field396);
         }

         this.field403 = true;
         this.vmethod1203();
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   protected abstract void vmethod1203();

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "592579589"
   )
   void method845() {
      int var1 = this.field395;
      int var2 = this.field396;
      int var3 = this.field393 - class9.field70 - var1;
      int var4 = this.field415 - class37.field326 - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method856();
            int var6 = 0;
            int var7 = 0;
            if(var5 == this.field401) {
               Insets var8 = this.field401.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field415);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, this.field393, var2);
            }

            if(var3 > 0) {
               var10.fillRect(var6 + this.field393 - var3, var7, var3, this.field415);
            }

            if(var4 > 0) {
               var10.fillRect(var6, var7 + this.field415 - var4, this.field393, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1870127336"
   )
   final void method859() {
      class4.method53(this.field402);
      Canvas var1 = this.field402;
      var1.removeMouseListener(class48.field419);
      var1.removeMouseMotionListener(class48.field419);
      var1.removeFocusListener(class48.field419);
      class48.field420 = 0;
      if(this.field408 != null) {
         this.field408.method722(this.field402);
      }

      this.method848();
      Canvas var2 = this.field402;
      var2.setFocusTraversalKeysEnabled(false);
      var2.addKeyListener(class39.field350);
      var2.addFocusListener(class39.field350);
      Canvas var3 = this.field402;
      var3.addMouseListener(class48.field419);
      var3.addMouseMotionListener(class48.field419);
      var3.addFocusListener(class48.field419);
      if(this.field408 != null) {
         this.field408.method723(this.field402);
      }

      this.method836();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "112"
   )
   protected final void method847(int var1, int var2, int var3) {
      try {
         if(field391 != null) {
            ++field382;
            if(field382 >= 3) {
               this.method867("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field391 = this;
         class9.field70 = var1;
         class37.field326 = var2;
         class54.field485 = var3;
         class152.field1957 = this;
         if(field409 == null) {
            field409 = new class154();
         }

         field409.method3252(this, 1);
      } catch (Exception var5) {
         class43.method786((String)null, var5);
         this.method867("crash");
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1810851436"
   )
   final synchronized void method848() {
      Container var1 = this.method856();
      if(this.field402 != null) {
         this.field402.removeFocusListener(this);
         var1.remove(this.field402);
      }

      class9.field70 = Math.max(var1.getWidth(), this.field392);
      class37.field326 = Math.max(var1.getHeight(), this.field398);
      Insets var2;
      if(this.field401 != null) {
         var2 = this.field401.getInsets();
         class9.field70 -= var2.left + var2.right;
         class37.field326 -= var2.top + var2.bottom;
      }

      this.field402 = new class42(this);
      var1.add(this.field402);
      this.field402.setSize(class9.field70, class37.field326);
      this.field402.setVisible(true);
      this.field402.setBackground(Color.BLACK);
      if(var1 == this.field401) {
         var2 = this.field401.getInsets();
         this.field402.setLocation(var2.left + this.field395, this.field396 + var2.top);
      } else {
         this.field402.setLocation(this.field395, this.field396);
      }

      this.field402.addFocusListener(this);
      this.field402.requestFocus();
      this.field403 = true;
      if(class50.field455 != null && class9.field70 == class50.field455.field3774 && class37.field326 == class50.field455.field3775) {
         ((class46)class50.field455).method832(this.field402);
         class50.field455.vmethod5851(0, 0);
      } else {
         class50.field455 = new class46(class9.field70, class37.field326, this.field402);
      }

      this.field406 = false;
      this.field394 = class166.method3456();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "753677261"
   )
   protected final boolean method849() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if(!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if(!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if(var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= 48 && var1.charAt(var1.length() - 1) <= 57) {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if(var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method867("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2031567293"
   )
   void method851() {
      long var1 = class166.method3456();
      long var3 = field397[field413];
      field397[field413] = var1;
      field413 = field413 + 1 & 31;
      if(var3 != 0L && var1 > var3) {
         ;
      }

      synchronized(this) {
         class66.field978 = field399;
      }

      this.vmethod1195();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2093614494"
   )
   void method914() {
      Container var1 = this.method856();
      long var2 = class166.method3456();
      long var4 = field390[class5.field35];
      field390[class5.field35] = var2;
      class5.field35 = class5.field35 + 1 & 31;
      if(var4 != 0L && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field388 = ((var6 >> 1) + 32000) / var6;
      }

      if(++field400 - 1 > 50) {
         field400 -= 50;
         this.field403 = true;
         this.field402.setSize(class9.field70, class37.field326);
         this.field402.setVisible(true);
         if(var1 == this.field401) {
            Insets var7 = this.field401.getInsets();
            this.field402.setLocation(this.field395 + var7.left, this.field396 + var7.top);
         } else {
            this.field402.setLocation(this.field395, this.field396);
         }
      }

      if(this.field406) {
         this.method859();
      }

      this.method853();
      this.vmethod1196(this.field403);
      if(this.field403) {
         this.method845();
      }

      this.field403 = false;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1806849065"
   )
   final void method853() {
      class310 var1 = this.method860();
      if(this.field393 != var1.field3750 || var1.field3751 != this.field415 || this.field381) {
         this.method888();
         this.field381 = false;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-370826843"
   )
   final void method836() {
      this.field381 = true;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1316647126"
   )
   final synchronized void method855() {
      if(!field384) {
         field384 = true;

         try {
            this.field402.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.vmethod1197();
         } catch (Exception var4) {
            ;
         }

         if(this.field401 != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if(field409 != null) {
            try {
               field409.method3241();
            } catch (Exception var2) {
               ;
            }
         }

         this.vmethod1192();
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-81564058"
   )
   protected abstract void vmethod1521();

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1245920510"
   )
   protected abstract void vmethod1195();

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-2135258546"
   )
   protected abstract void vmethod1196(boolean var1);

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "949470738"
   )
   protected abstract void vmethod1197();

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;ZI)V",
      garbageValue = "-2016466129"
   )
   protected final void method898(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.field402.getGraphics();
         if(class110.field1455 == null) {
            class110.field1455 = new Font("Helvetica", 1, 13);
            class37.field322 = this.field402.getFontMetrics(class110.field1455);
         }

         if(var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, class9.field70, class37.field326);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if(class234.field2799 == null) {
               class234.field2799 = this.field402.createImage(304, 34);
            }

            Graphics var6 = class234.field2799.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class110.field1455);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - class37.field322.stringWidth(var2)) / 2, 22);
            var4.drawImage(class234.field2799, class9.field70 / 2 - 152, class37.field326 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = class9.field70 / 2 - 152;
            int var8 = class37.field326 / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class110.field1455);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class37.field322.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.field402.repaint();
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1761915639"
   )
   protected final void method866() {
      class234.field2799 = null;
      class110.field1455 = null;
      class37.field322 = null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "15040"
   )
   protected void method867(String var1) {
      if(!this.field385) {
         this.field385 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)Ljava/awt/Container;",
      garbageValue = "-1376238359"
   )
   Container method856() {
      return (Container)(this.field401 != null?this.field401:this);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)Lka;",
      garbageValue = "1409221587"
   )
   class310 method860() {
      Container var1 = this.method856();
      int var2 = Math.max(var1.getWidth(), this.field392);
      int var3 = Math.max(var1.getHeight(), this.field398);
      if(this.field401 != null) {
         Insets var4 = this.field401.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      return new class310(var2, var3);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1818111363"
   )
   protected final boolean method979() {
      return this.field401 != null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1726845378"
   )
   protected abstract void vmethod1192();

   public final void destroy() {
      if(this == field391 && !field384) {
         field383 = class166.method3456();
         class18.method218(5000L);
         this.method855();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if(this == field391 && !field384) {
         this.field403 = true;
         if(class166.method3456() - this.field394 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= class9.field70 && var2.height >= class37.field326) {
               this.field406 = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
      field399 = true;
      this.field403 = true;
   }

   public final void start() {
      if(this == field391 && !field384) {
         field383 = 0L;
      }
   }

   public final void stop() {
      if(this == field391 && !field384) {
         field383 = class166.method3456() + 4000L;
      }
   }

   public final void focusLost(FocusEvent var1) {
      field399 = false;
   }

   public final void windowActivated(WindowEvent var1) {}

   public final void windowClosed(WindowEvent var1) {}

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {}

   public final void windowOpened(WindowEvent var1) {}

   public abstract void init();

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void windowIconified(WindowEvent var1) {}

   public final void windowDeiconified(WindowEvent var1) {}

   public void run() {
      try {
         if(class154.field1972 != null) {
            String var1 = class154.field1972.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class154.field1971;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method867("wrongjava");
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class184.method3830(var2.charAt(var3)); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  boolean var7 = false;
                  boolean var8 = false;
                  int var9 = 0;
                  int var10 = var4.length();
                  int var11 = 0;

                  boolean var6;
                  while(true) {
                     if(var11 >= var10) {
                        var6 = var8;
                        break;
                     }

                     label168: {
                        char var12 = var4.charAt(var11);
                        if(var11 == 0) {
                           if(var12 == 45) {
                              var7 = true;
                              break label168;
                           }

                           if(var12 == 43) {
                              break label168;
                           }
                        }

                        int var19;
                        if(var12 >= 48 && var12 <= 57) {
                           var19 = var12 - 48;
                        } else if(var12 >= 65 && var12 <= 90) {
                           var19 = var12 - 55;
                        } else {
                           if(var12 < 97 || var12 > 122) {
                              var6 = false;
                              break;
                           }

                           var19 = var12 - 87;
                        }

                        if(var19 >= 10) {
                           var6 = false;
                           break;
                        }

                        if(var7) {
                           var19 = -var19;
                        }

                        int var13 = var9 * 10 + var19;
                        if(var9 != var13 / 10) {
                           var6 = false;
                           break;
                        }

                        var9 = var13;
                        var8 = true;
                     }

                     ++var11;
                  }

                  if(var6) {
                     int var18 = class1.method13(var4, 10, true);
                     if(var18 < 10) {
                        this.method867("wrongjava");
                        return;
                     }
                  }
               }

               field387 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method848();
         this.vmethod1521();

         Object var17;
         try {
            var17 = new class149();
         } catch (Throwable var15) {
            var17 = new class150();
         }

         field389 = (class160)var17;

         while(field383 == 0L || class166.method3456() < field383) {
            class286.field3645 = field389.vmethod3348(field386, field387);

            for(int var14 = 0; var14 < class286.field3645; ++var14) {
               this.method851();
            }

            this.method914();
            this.method844(this.field402);
         }
      } catch (Exception var16) {
         class43.method786((String)null, var16);
         this.method867("crash");
      }

      this.method855();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Liv;Ljava/lang/String;Ljava/lang/String;I)Llh;",
      garbageValue = "1889737035"
   )
   public static class317 method984(class247 var0, String var1, String var2) {
      int var3 = var0.method4644(var1);
      int var4 = var0.method4693(var3, var2);
      return class72.method1842(var0, var3, var4);
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1616251664"
   )
   static final void method983(int var0) {
      int[] var1 = class283.field3633.field3798;
      int var2 = var1.length;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         var1[var3] = 0;
      }

      int var4;
      int var5;
      for(var3 = 1; var3 < 103; ++var3) {
         var4 = (103 - var3) * 2048 + 24628;

         for(var5 = 1; var5 < 103; ++var5) {
            if((class50.field445[var0][var5][var3] & 24) == 0) {
               class56.field523.method3026(var1, var4, 512, var0, var5, var3);
            }

            if(var0 < 3 && (class50.field445[var0 + 1][var5][var3] & 8) != 0) {
               class56.field523.method3026(var1, var4, 512, var0 + 1, var5, var3);
            }

            var4 += 4;
         }
      }

      var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
      var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
      class283.field3633.method5886();

      int var6;
      for(var5 = 1; var5 < 103; ++var5) {
         for(var6 = 1; var6 < 103; ++var6) {
            if((class50.field445[var0][var6][var5] & 24) == 0) {
               class63.method1596(var0, var6, var5, var3, var4);
            }

            if(var0 < 3 && (class50.field445[var0 + 1][var6][var5] & 8) != 0) {
               class63.method1596(var0 + 1, var6, var5, var3, var4);
            }
         }
      }

      client.field651 = 0;

      for(var5 = 0; var5 < 104; ++var5) {
         for(var6 = 0; var6 < 104; ++var6) {
            long var7 = class56.field523.method2930(class192.field2415, var5, var6);
            if(var7 != 0L) {
               int var9 = class8.method93(var7);
               int var10 = class40.method766(var9).field3417;
               if(var10 >= 0) {
                  client.field819[client.field651] = class255.field3274[var10].method4829(false);
                  client.field817[client.field651] = var5;
                  client.field818[client.field651] = var6;
                  ++client.field651;
               }
            }
         }
      }

      class50.field455.method5852();
   }
}
