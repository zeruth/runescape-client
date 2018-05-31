import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("ItemLayer")
public final class ItemLayer {
   @ObfuscatedName("ff")
   static byte[][] field1475;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1016013399
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   @Export("middle")
   Renderable middle;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 152782163
   )
   @Export("x")
   int x;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -736197147
   )
   @Export("y")
   int y;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   @Export("bottom")
   Renderable bottom;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   @Export("top")
   Renderable top;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 7654269406186050467L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1231787727
   )
   @Export("height")
   int height;

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-1308565855"
   )
   static int method2617(int var0, Script var1, boolean var2) {
      String var3;
      int var4;
      if (var0 == 4100) {
         var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
         var4 = class69.intStack[--class45.intStackSize];
         class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3 + var4;
         return 1;
      } else {
         String var5;
         if (var0 == 4101) {
            class83.scriptStringStackSize -= 2;
            var3 = class69.scriptStringStack[class83.scriptStringStackSize];
            var5 = class69.scriptStringStack[class83.scriptStringStackSize + 1];
            class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3 + var5;
            return 1;
         } else if (var0 == 4102) {
            var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
            var4 = class69.intStack[--class45.intStackSize];
            class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3 + MapIcon.method517(var4, true);
            return 1;
         } else if (var0 == 4103) {
            var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
            class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var7;
            int var8;
            if (var0 == 4104) {
               var7 = class69.intStack[--class45.intStackSize];
               long var28 = (11745L + (long)var7) * 86400000L;
               class69.field1024.setTime(new Date(var28));
               var8 = class69.field1024.get(5);
               int var26 = class69.field1024.get(2);
               var6 = class69.field1024.get(1);
               class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var8 + "-" + class69.field1018[var26] + "-" + var6;
               return 1;
            } else if (var0 == 4105) {
               class83.scriptStringStackSize -= 2;
               var3 = class69.scriptStringStack[class83.scriptStringStackSize];
               var5 = class69.scriptStringStack[class83.scriptStringStackSize + 1];
               if (MilliTimer.localPlayer.composition != null && MilliTimer.localPlayer.composition.isFemale) {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var5;
               } else {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == 4106) {
               var7 = class69.intStack[--class45.intStackSize];
               class69.scriptStringStack[++class83.scriptStringStackSize - 1] = Integer.toString(var7);
               return 1;
            } else {
               int var9;
               if (var0 == 4107) {
                  class83.scriptStringStackSize -= 2;
                  int[] var24 = class69.intStack;
                  var4 = ++class45.intStackSize - 1;
                  String var25 = class69.scriptStringStack[class83.scriptStringStackSize];
                  String var27 = class69.scriptStringStack[class83.scriptStringStackSize + 1];
                  var6 = Client.languageId;
                  int var30 = var25.length();
                  int var31 = var27.length();
                  int var15 = 0;
                  int var16 = 0;
                  char var17 = 0;
                  char var18 = 0;

                  label210:
                  while(true) {
                     char var32;
                     if (var15 - var17 >= var30 && var16 - var18 >= var31) {
                        int var33 = Math.min(var30, var31);

                        int var34;
                        for(var34 = 0; var34 < var33; ++var34) {
                           char var22 = var25.charAt(var34);
                           var32 = var27.charAt(var34);
                           if (var32 != var22 && Character.toUpperCase(var22) != Character.toUpperCase(var32)) {
                              var22 = Character.toLowerCase(var22);
                              var32 = Character.toLowerCase(var32);
                              if (var22 != var32) {
                                 var9 = class236.method4597(var22, var6) - class236.method4597(var32, var6);
                                 break label210;
                              }
                           }
                        }

                        var34 = var30 - var31;
                        if (var34 != 0) {
                           var9 = var34;
                        } else {
                           for(int var35 = 0; var35 < var33; ++var35) {
                              var32 = var25.charAt(var35);
                              char var23 = var27.charAt(var35);
                              if (var23 != var32) {
                                 var9 = class236.method4597(var32, var6) - class236.method4597(var23, var6);
                                 break label210;
                              }
                           }

                           var9 = 0;
                        }
                        break;
                     }

                     if (var15 - var17 >= var30) {
                        var9 = -1;
                        break;
                     }

                     if (var16 - var18 >= var31) {
                        var9 = 1;
                        break;
                     }

                     char var19;
                     if (var17 != 0) {
                        var19 = var17;
                        boolean var20 = false;
                     } else {
                        var19 = var25.charAt(var15++);
                     }

                     if (var18 != 0) {
                        var32 = var18;
                        boolean var21 = false;
                     } else {
                        var32 = var27.charAt(var16++);
                     }

                     var17 = class76.method1850(var19);
                     var18 = class76.method1850(var32);
                     var19 = class222.method4446(var19, var6);
                     var32 = class222.method4446(var32, var6);
                     if (var32 != var19 && Character.toUpperCase(var19) != Character.toUpperCase(var32)) {
                        var19 = Character.toLowerCase(var19);
                        var32 = Character.toLowerCase(var32);
                        if (var32 != var19) {
                           var9 = class236.method4597(var19, var6) - class236.method4597(var32, var6);
                           break;
                        }
                     }
                  }

                  var24[var4] = class183.method3824(var9);
                  return 1;
               } else {
                  byte[] var10;
                  Font var11;
                  if (var0 == 4108) {
                     var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                     class45.intStackSize -= 2;
                     var4 = class69.intStack[class45.intStackSize];
                     var9 = class69.intStack[class45.intStackSize + 1];
                     var10 = TotalQuantityComparator.indexCache13.getConfigData(var9, 0);
                     var11 = new Font(var10);
                     class69.intStack[++class45.intStackSize - 1] = var11.method5539(var3, var4);
                     return 1;
                  } else if (var0 == 4109) {
                     var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                     class45.intStackSize -= 2;
                     var4 = class69.intStack[class45.intStackSize];
                     var9 = class69.intStack[class45.intStackSize + 1];
                     var10 = TotalQuantityComparator.indexCache13.getConfigData(var9, 0);
                     var11 = new Font(var10);
                     class69.intStack[++class45.intStackSize - 1] = var11.method5538(var3, var4);
                     return 1;
                  } else if (var0 == 4110) {
                     class83.scriptStringStackSize -= 2;
                     var3 = class69.scriptStringStack[class83.scriptStringStackSize];
                     var5 = class69.scriptStringStack[class83.scriptStringStackSize + 1];
                     if (class69.intStack[--class45.intStackSize] == 1) {
                        class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3;
                     } else {
                        class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var5;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                     class69.scriptStringStack[++class83.scriptStringStackSize - 1] = FontTypeFace.appendTags(var3);
                     return 1;
                  } else if (var0 == 4112) {
                     var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                     var4 = class69.intStack[--class45.intStackSize];
                     class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3 + (char)var4;
                     return 1;
                  } else {
                     char var12;
                     boolean var14;
                     if (var0 != 4113) {
                        if (var0 == 4114) {
                           var7 = class69.intStack[--class45.intStackSize];
                           class69.intStack[++class45.intStackSize - 1] = class148.method3206((char)var7) ? 1 : 0;
                           return 1;
                        } else if (var0 == 4115) {
                           var7 = class69.intStack[--class45.intStackSize];
                           class69.intStack[++class45.intStackSize - 1] = Frames.method3095((char)var7) ? 1 : 0;
                           return 1;
                        } else if (var0 == 4116) {
                           var7 = class69.intStack[--class45.intStackSize];
                           class69.intStack[++class45.intStackSize - 1] = class184.method3830((char)var7) ? 1 : 0;
                           return 1;
                        } else if (var0 == 4117) {
                           var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                           if (var3 != null) {
                              class69.intStack[++class45.intStackSize - 1] = var3.length();
                           } else {
                              class69.intStack[++class45.intStackSize - 1] = 0;
                           }

                           return 1;
                        } else if (var0 == 4118) {
                           var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                           class45.intStackSize -= 2;
                           var4 = class69.intStack[class45.intStackSize];
                           var9 = class69.intStack[class45.intStackSize + 1];
                           class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3.substring(var4, var9);
                           return 1;
                        } else if (var0 == 4119) {
                           var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                           StringBuilder var29 = new StringBuilder(var3.length());
                           var14 = false;

                           for(var8 = 0; var8 < var3.length(); ++var8) {
                              var12 = var3.charAt(var8);
                              if (var12 == '<') {
                                 var14 = true;
                              } else if (var12 == '>') {
                                 var14 = false;
                              } else if (!var14) {
                                 var29.append(var12);
                              }
                           }

                           class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var29.toString();
                           return 1;
                        } else if (var0 == 4120) {
                           var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                           var4 = class69.intStack[--class45.intStackSize];
                           class69.intStack[++class45.intStackSize - 1] = var3.indexOf(var4);
                           return 1;
                        } else if (var0 == 4121) {
                           class83.scriptStringStackSize -= 2;
                           var3 = class69.scriptStringStack[class83.scriptStringStackSize];
                           var5 = class69.scriptStringStack[class83.scriptStringStackSize + 1];
                           var9 = class69.intStack[--class45.intStackSize];
                           class69.intStack[++class45.intStackSize - 1] = var3.indexOf(var5, var9);
                           return 1;
                        } else {
                           return 2;
                        }
                     } else {
                        var7 = class69.intStack[--class45.intStackSize];
                        int[] var13 = class69.intStack;
                        var9 = ++class45.intStackSize - 1;
                        var12 = (char)var7;
                        if (var12 >= ' ' && var12 <= '~') {
                           var14 = true;
                        } else if (var12 >= 160 && var12 <= 255) {
                           var14 = true;
                        } else if (var12 != 8364 && var12 != 338 && var12 != 8212 && var12 != 339 && var12 != 376) {
                           var14 = false;
                        } else {
                           var14 = true;
                        }

                        var13[var9] = var14 ? 1 : 0;
                        return 1;
                     }
                  }
               }
            }
         }
      }
   }
}
