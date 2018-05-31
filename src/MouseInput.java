import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("MouseInput")
public class MouseInput implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lar;"
   )
   @Export("mouse")
   public static MouseInput mouse = new MouseInput();
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2015453751
   )
   @Export("mouseIdleTicks")
   static volatile int mouseIdleTicks = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 6334333
   )
   @Export("MouseHandler_currentButton")
   public static volatile int MouseHandler_currentButton = 0;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 515904935
   )
   @Export("mouseX")
   public static volatile int mouseX = -1;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -720159989
   )
   @Export("mouseLastY")
   public static int mouseLastY = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1537119943
   )
   @Export("mouseY")
   public static volatile int mouseY = -1;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1911250015
   )
   @Export("mouseCurrentButton")
   public static int mouseCurrentButton = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1397497649
   )
   @Export("mouseLastX")
   public static int mouseLastX = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1538205865
   )
   @Export("MouseHandler_lastButton")
   public static volatile int MouseHandler_lastButton = 0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1951645257
   )
   @Export("MouseHandler_lastPressedX")
   public static volatile int MouseHandler_lastPressedX = 0;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -147153669
   )
   @Export("MouseHandler_lastPressedY")
   public static volatile int MouseHandler_lastPressedY = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = -3480904844589267413L
   )
   @Export("MouseHandler_lastPressedTimeMillis")
   public static volatile long MouseHandler_lastPressedTimeMillis = 0L;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 44372009
   )
   @Export("mouseLastButton")
   public static int mouseLastButton = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -2038064095
   )
   @Export("mouseLastPressedX")
   public static int mouseLastPressedX = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 994596209
   )
   @Export("mouseLastPressedY")
   public static int mouseLastPressedY = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      longValue = -7374592471024972269L
   )
   @Export("mouseLastPressedTimeMillis")
   public static long mouseLastPressedTimeMillis = 0L;
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexTrack1")
   static IndexData indexTrack1;
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexWorldMap")
   static IndexData indexWorldMap;

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1172341248"
   )
   final int method989(MouseEvent var1) {
      int var2 = var1.getButton();
      return !var1.isAltDown() && var2 != 2 ? (!var1.isMetaDown() && var2 != 3 ? 1 : 2) : 4;
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (mouse != null) {
         mouseIdleTicks = 0;
         MouseHandler_currentButton = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if (mouse != null) {
         mouseIdleTicks = 0;
         mouseX = var1.getX();
         mouseY = var1.getY();
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (mouse != null) {
         mouseIdleTicks = 0;
         mouseX = -1;
         mouseY = -1;
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (mouse != null) {
         mouseIdleTicks = 0;
         mouseX = var1.getX();
         mouseY = var1.getY();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if (mouse != null) {
         mouseIdleTicks = 0;
         mouseX = var1.getX();
         mouseY = var1.getY();
      }

   }

   @Export("mousePressed")
   @ObfuscatedName("mousePressed")
   public final synchronized void mousePressed(MouseEvent var1) {
      if (mouse != null) {
         mouseIdleTicks = 0;
         MouseHandler_lastPressedX = var1.getX();
         MouseHandler_lastPressedY = var1.getY();
         MouseHandler_lastPressedTimeMillis = class166.method3456();
         MouseHandler_lastButton = this.method989(var1);
         if (MouseHandler_lastButton != 0) {
            MouseHandler_currentButton = MouseHandler_lastButton;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (mouse != null) {
         MouseHandler_currentButton = 0;
      }

   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "(Lhl;Ljm;IIZI)V",
      garbageValue = "1492414527"
   )
   static final void method1001(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.inventoryActions;
      byte var6 = -1;
      String var7 = null;
      if (var5 != null && var5[var3] != null) {
         if (var3 == 0) {
            var6 = 33;
         } else if (var3 == 1) {
            var6 = 34;
         } else if (var3 == 2) {
            var6 = 35;
         } else if (var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if (var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if (var6 != -1 && var7 != null) {
         class98.method2289(var7, class50.getColTags(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
      }

   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "(Lhl;III)V",
      garbageValue = "1872983443"
   )
   static final void method1014(Widget var0, int var1, int var2) {
      if (var0.field2654 == 1) {
         VertexNormal.addMenuEntry(var0.tooltip, "", 24, 0, 0, var0.id);
      }

      String var3;
      if (var0.field2654 == 2 && !Client.spellSelected) {
         var3 = class11.method111(var0);
         if (var3 != null) {
            VertexNormal.addMenuEntry(var3, class50.getColTags(65280) + var0.spellName, 25, 0, -1, var0.id);
         }
      }

      if (var0.field2654 == 3) {
         VertexNormal.addMenuEntry("Close", "", 26, 0, 0, var0.id);
      }

      if (var0.field2654 == 4) {
         VertexNormal.addMenuEntry(var0.tooltip, "", 28, 0, 0, var0.id);
      }

      if (var0.field2654 == 5) {
         VertexNormal.addMenuEntry(var0.tooltip, "", 29, 0, 0, var0.id);
      }

      if (var0.field2654 == 6 && Client.field756 == null) {
         VertexNormal.addMenuEntry(var0.tooltip, "", 30, 0, -1, var0.id);
      }

      int var4;
      int var5;
      int var6;
      if (var0.type == 2) {
         var6 = 0;

         for(var4 = 0; var4 < var0.height; ++var4) {
            for(var5 = 0; var5 < var0.width; ++var5) {
               int var7 = (var0.paddingX + 32) * var5;
               int var8 = (var0.paddingY + 32) * var4;
               if (var6 < 20) {
                  var7 += var0.xSprites[var6];
                  var8 += var0.field2693[var6];
               }

               if (var1 >= var7 && var2 >= var8 && var1 < var7 + 32 && var2 < var8 + 32) {
                  Client.field703 = var6;
                  FontName.field3688 = var0;
                  if (var0.itemIds[var6] > 0) {
                     ItemComposition var9 = class120.getItemDefinition(var0.itemIds[var6] - 1);
                     if (Client.itemSelectionState == 1 && SoundTask.method2272(AbstractSoundSystem.getWidgetClickMask(var0))) {
                        if (var0.id != Huffman.field2296 || var6 != class59.selectedItemIndex) {
                           VertexNormal.addMenuEntry("Use", Client.lastSelectedItemName + " " + "->" + " " + class50.getColTags(16748608) + var9.name, 31, var9.id, var6, var0.id);
                        }
                     } else if (Client.spellSelected && SoundTask.method2272(AbstractSoundSystem.getWidgetClickMask(var0))) {
                        if ((class45.field373 & 16) == 16) {
                           VertexNormal.addMenuEntry(Client.field750, Client.field751 + " " + "->" + " " + class50.getColTags(16748608) + var9.name, 32, var9.id, var6, var0.id);
                        }
                     } else {
                        String[] var10 = var9.inventoryActions;
                        int var11 = -1;
                        if (Client.field733 && WorldMapDecoration.method220()) {
                           var11 = var9.getShiftClickActionIndex();
                        }

                        int var12;
                        if (SoundTask.method2272(AbstractSoundSystem.getWidgetClickMask(var0))) {
                           for(var12 = 4; var12 >= 3; --var12) {
                              if (var11 != var12) {
                                 method1001(var0, var9, var6, var12, false);
                              }
                           }
                        }

                        var12 = AbstractSoundSystem.getWidgetClickMask(var0);
                        boolean var13 = (var12 >> 31 & 1) != 0;
                        if (var13) {
                           VertexNormal.addMenuEntry("Use", class50.getColTags(16748608) + var9.name, 38, var9.id, var6, var0.id);
                        }

                        Object var14 = null;
                        int var15;
                        if (SoundTask.method2272(AbstractSoundSystem.getWidgetClickMask(var0))) {
                           for(var15 = 2; var15 >= 0; --var15) {
                              if (var11 != var15) {
                                 method1001(var0, var9, var6, var15, false);
                              }
                           }

                           if (var11 >= 0) {
                              method1001(var0, var9, var6, var11, true);
                           }
                        }

                        var10 = var0.configActions;
                        if (var10 != null) {
                           for(var15 = 4; var15 >= 0; --var15) {
                              if (var10[var15] != null) {
                                 byte var16 = 0;
                                 if (var15 == 0) {
                                    var16 = 39;
                                 }

                                 if (var15 == 1) {
                                    var16 = 40;
                                 }

                                 if (var15 == 2) {
                                    var16 = 41;
                                 }

                                 if (var15 == 3) {
                                    var16 = 42;
                                 }

                                 if (var15 == 4) {
                                    var16 = 43;
                                 }

                                 VertexNormal.addMenuEntry(var10[var15], class50.getColTags(16748608) + var9.name, var16, var9.id, var6, var0.id);
                              }
                           }
                        }

                        VertexNormal.addMenuEntry("Examine", class50.getColTags(16748608) + var9.name, 1005, var9.id, var6, var0.id);
                     }
                  }
               }

               ++var6;
            }
         }
      }

      if (var0.hasScript) {
         boolean var17;
         if (Client.spellSelected) {
            var4 = AbstractSoundSystem.getWidgetClickMask(var0);
            var17 = (var4 >> 21 & 1) != 0;
            if (var17 && (class45.field373 & 32) == 32) {
               VertexNormal.addMenuEntry(Client.field750, Client.field751 + " " + "->" + " " + var0.opBase, 58, 0, var0.index, var0.id);
            }
         } else {
            String var18;
            for(var6 = 9; var6 >= 5; --var6) {
               if (!MilliTimer.method3219(AbstractSoundSystem.getWidgetClickMask(var0), var6) && var0.onOpListener == null) {
                  var18 = null;
               } else if (var0.actions != null && var0.actions.length > var6 && var0.actions[var6] != null && var0.actions[var6].trim().length() != 0) {
                  var18 = var0.actions[var6];
               } else {
                  var18 = null;
               }

               if (var18 != null) {
                  VertexNormal.addMenuEntry(var18, var0.opBase, 1007, var6 + 1, var0.index, var0.id);
               }
            }

            var3 = class11.method111(var0);
            if (var3 != null) {
               VertexNormal.addMenuEntry(var3, var0.opBase, 25, 0, var0.index, var0.id);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               if (!MilliTimer.method3219(AbstractSoundSystem.getWidgetClickMask(var0), var4) && var0.onOpListener == null) {
                  var18 = null;
               } else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
                  var18 = var0.actions[var4];
               } else {
                  var18 = null;
               }

               if (var18 != null) {
                  VertexNormal.addMenuEntry(var18, var0.opBase, 57, var4 + 1, var0.index, var0.id);
               }
            }

            var5 = AbstractSoundSystem.getWidgetClickMask(var0);
            var17 = (var5 & 1) != 0;
            if (var17) {
               VertexNormal.addMenuEntry("Continue", "", 30, 0, var0.index, var0.id);
            }
         }
      }

   }
}
