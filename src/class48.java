import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class48 implements MouseListener, MouseMotionListener, FocusListener {

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lar;"
   )
   public static class48 field419 = new class48();
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2015453751
   )
   static volatile int field426 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 6334333
   )
   public static volatile int field420 = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 515904935
   )
   public static volatile int field421 = -1;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -720159989
   )
   public static int field417 = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1537119943
   )
   public static volatile int field423 = -1;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1911250015
   )
   public static int field424 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1397497649
   )
   public static int field425 = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1538205865
   )
   public static volatile int field427 = 0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1951645257
   )
   public static volatile int field428 = 0;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -147153669
   )
   public static volatile int field433 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = -3480904844589267413L
   )
   public static volatile long field430 = 0L;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 44372009
   )
   public static int field431 = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -2038064095
   )
   public static int field432 = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 994596209
   )
   public static int field437 = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      longValue = -7374592471024972269L
   )
   public static long field434 = 0L;
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field436;
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field435;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1172341248"
   )
   final int method989(MouseEvent var1) {
      int var2 = var1.getButton();
      return !var1.isAltDown() && var2 != 2?(!var1.isMetaDown() && var2 != 3?1:2):4;
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if(field419 != null) {
         field426 = 0;
         field420 = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if(field419 != null) {
         field426 = 0;
         field421 = var1.getX();
         field423 = var1.getY();
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if(field419 != null) {
         field426 = 0;
         field421 = -1;
         field423 = -1;
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if(field419 != null) {
         field426 = 0;
         field421 = var1.getX();
         field423 = var1.getY();
      }

   }

   public final void focusGained(FocusEvent var1) {}

   public final synchronized void mouseDragged(MouseEvent var1) {
      if(field419 != null) {
         field426 = 0;
         field421 = var1.getX();
         field423 = var1.getY();
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if(field419 != null) {
         field426 = 0;
         field428 = var1.getX();
         field433 = var1.getY();
         field430 = class166.method3456();
         field427 = this.method989(var1);
         if(field427 != 0) {
            field420 = field427;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if(field419 != null) {
         field420 = 0;
      }

   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "(Lhl;Ljm;IIZI)V",
      garbageValue = "1492414527"
   )
   static final void method1001(class230 var0, class269 var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.field3464;
      byte var6 = -1;
      String var7 = null;
      if(var5 != null && var5[var3] != null) {
         if(var3 == 0) {
            var6 = 33;
         } else if(var3 == 1) {
            var6 = 34;
         } else if(var3 == 2) {
            var6 = 35;
         } else if(var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if(var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if(var6 != -1 && var7 != null) {
         class98.method2289(var7, class50.method1060(16748608) + var1.field3449, var6, var1.field3484, var2, var0.field2623, var4);
      }

   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "(Lhl;III)V",
      garbageValue = "1872983443"
   )
   static final void method1014(class230 var0, int var1, int var2) {
      if(var0.field2654 == 1) {
         class121.method2816(var0.field2741, "", 24, 0, 0, var0.field2623);
      }

      String var3;
      if(var0.field2654 == 2 && !client.field813) {
         var3 = class11.method111(var0);
         if(var3 != null) {
            class121.method2816(var3, class50.method1060('\uff00') + var0.field2710, 25, 0, -1, var0.field2623);
         }
      }

      if(var0.field2654 == 3) {
         class121.method2816("Close", "", 26, 0, 0, var0.field2623);
      }

      if(var0.field2654 == 4) {
         class121.method2816(var0.field2741, "", 28, 0, 0, var0.field2623);
      }

      if(var0.field2654 == 5) {
         class121.method2816(var0.field2741, "", 29, 0, 0, var0.field2623);
      }

      if(var0.field2654 == 6 && client.field756 == null) {
         class121.method2816(var0.field2741, "", 30, 0, -1, var0.field2623);
      }

      int var4;
      int var5;
      int var15;
      if(var0.field2625 == 2) {
         var15 = 0;

         for(var4 = 0; var4 < var0.field2639; ++var4) {
            for(var5 = 0; var5 < var0.field2627; ++var5) {
               int var6 = (var0.field2690 + 32) * var5;
               int var7 = (var0.field2691 + 32) * var4;
               if(var15 < 20) {
                  var6 += var0.field2692[var15];
                  var7 += var0.field2693[var15];
               }

               if(var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
                  client.field703 = var15;
                  class295.field3688 = var0;
                  if(var0.field2758[var15] > 0) {
                     class269 var8 = class120.method2784(var0.field2758[var15] - 1);
                     if(client.field771 == 1 && class97.method2272(class95.method2252(var0))) {
                        if(var0.field2623 != class174.field2296 || var15 != class59.field554) {
                           class121.method2816("Use", client.field759 + " " + "->" + " " + class50.method1060(16748608) + var8.field3449, 31, var8.field3484, var15, var0.field2623);
                        }
                     } else if(client.field813 && class97.method2272(class95.method2252(var0))) {
                        if((class45.field373 & 16) == 16) {
                           class121.method2816(client.field750, client.field751 + " " + "->" + " " + class50.method1060(16748608) + var8.field3449, 32, var8.field3484, var15, var0.field2623);
                        }
                     } else {
                        String[] var9 = var8.field3464;
                        int var10 = -1;
                        if(client.field733 && class19.method220()) {
                           var10 = var8.method5112();
                        }

                        if(class97.method2272(class95.method2252(var0))) {
                           for(int var11 = 4; var11 >= 3; --var11) {
                              if(var10 != var11) {
                                 method1001(var0, var8, var15, var11, false);
                              }
                           }
                        }

                        int var12 = class95.method2252(var0);
                        boolean var20 = (var12 >> 31 & 1) != 0;
                        if(var20) {
                           class121.method2816("Use", class50.method1060(16748608) + var8.field3449, 38, var8.field3484, var15, var0.field2623);
                        }

                        Object var10000 = null;
                        int var13;
                        if(class97.method2272(class95.method2252(var0))) {
                           for(var13 = 2; var13 >= 0; --var13) {
                              if(var10 != var13) {
                                 method1001(var0, var8, var15, var13, false);
                              }
                           }

                           if(var10 >= 0) {
                              method1001(var0, var8, var15, var10, true);
                           }
                        }

                        var9 = var0.field2695;
                        if(var9 != null) {
                           for(var13 = 4; var13 >= 0; --var13) {
                              if(var9[var13] != null) {
                                 byte var14 = 0;
                                 if(var13 == 0) {
                                    var14 = 39;
                                 }

                                 if(var13 == 1) {
                                    var14 = 40;
                                 }

                                 if(var13 == 2) {
                                    var14 = 41;
                                 }

                                 if(var13 == 3) {
                                    var14 = 42;
                                 }

                                 if(var13 == 4) {
                                    var14 = 43;
                                 }

                                 class121.method2816(var9[var13], class50.method1060(16748608) + var8.field3449, var14, var8.field3484, var15, var0.field2623);
                              }
                           }
                        }

                        class121.method2816("Examine", class50.method1060(16748608) + var8.field3449, 1005, var8.field3484, var15, var0.field2623);
                     }
                  }
               }

               ++var15;
            }
         }
      }

      if(var0.field2622) {
         if(client.field813) {
            var4 = class95.method2252(var0);
            boolean var21 = (var4 >> 21 & 1) != 0;
            if(var21 && (class45.field373 & 32) == 32) {
               class121.method2816(client.field750, client.field751 + " " + "->" + " " + var0.field2697, 58, 0, var0.field2633, var0.field2623);
            }
         } else {
            for(var15 = 9; var15 >= 5; --var15) {
               String var16;
               if(!class150.method3219(class95.method2252(var0), var15) && var0.field2610 == null) {
                  var16 = null;
               } else if(var0.field2698 != null && var0.field2698.length > var15 && var0.field2698[var15] != null && var0.field2698[var15].trim().length() != 0) {
                  var16 = var0.field2698[var15];
               } else {
                  var16 = null;
               }

               if(var16 != null) {
                  class121.method2816(var16, var0.field2697, 1007, var15 + 1, var0.field2633, var0.field2623);
               }
            }

            var3 = class11.method111(var0);
            if(var3 != null) {
               class121.method2816(var3, var0.field2697, 25, 0, var0.field2633, var0.field2623);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               String var17;
               if(!class150.method3219(class95.method2252(var0), var4) && var0.field2610 == null) {
                  var17 = null;
               } else if(var0.field2698 != null && var0.field2698.length > var4 && var0.field2698[var4] != null && var0.field2698[var4].trim().length() != 0) {
                  var17 = var0.field2698[var4];
               } else {
                  var17 = null;
               }

               if(var17 != null) {
                  class121.method2816(var17, var0.field2697, 57, var4 + 1, var0.field2633, var0.field2623);
               }
            }

            var5 = class95.method2252(var0);
            boolean var19 = (var5 & 1) != 0;
            if(var19) {
               class121.method2816("Continue", "", 30, 0, var0.field2633, var0.field2623);
            }
         }
      }

   }
}
