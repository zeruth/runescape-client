import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("BuildType")
public class BuildType {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   @Export("RC")
   static final BuildType RC = new BuildType("LIVE", 0);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   @Export("WIP")
   static final BuildType WIP = new BuildType("BUILDLIVE", 3);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   @Export("LIVE")
   static final BuildType LIVE = new BuildType("RC", 1);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   @Export("BUILD_LIVE")
   static final BuildType BUILD_LIVE = new BuildType("WIP", 2);
   @ObfuscatedName("f")
   @Export("identifier")
   public final String identifier;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1213546159
   )
   public final int field3149;

   BuildType(String var1, int var2) {
      this.identifier = var1;
      this.field3149 = var2;
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1240991873"
   )
   static final void method4608(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.widgetCount; ++var4) {
         if (Client.widgetPositionX[var4] + Client.widgetBoundsWidth[var4] > var0 && Client.widgetPositionX[var4] < var0 + var2 && Client.widgetPositionY[var4] + Client.widgetBoundsHeight[var4] > var1 && Client.widgetPositionY[var4] < var3 + var1) {
            Client.field796[var4] = true;
         }
      }

   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1551283972"
   )
   static final void method4609(int var0, int var1, int var2, int var3) {
      if (Client.itemSelectionState == 0 && !Client.spellSelected) {
         VertexNormal.addMenuEntry("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while(true) {
         int var9 = class120.Viewport_entityCountAtMouse;
         if (var8 >= var9) {
            if (-1L != var4) {
               var8 = (int)(var4 >>> 0 & 127L);
               var9 = UnitPriceComparator.method59(var4);
               Player var30 = Client.cachedPlayers[Client.field719];
               Varcs.method1942(var30, Client.field719, var8, var9);
            }

            return;
         }

         long var10 = CacheFile.method2522(var8);
         if (var6 != var10) {
            label276: {
               var6 = var10;
               long var12 = class120.field1688[var8];
               int var14 = (int)(var12 >>> 0 & 127L);
               var14 = var14;
               int var15 = class177.method3533(var8);
               int var16 = class59.method1122(var8);
               int var17 = class8.method93(class120.field1688[var8]);
               int var18 = var17;
               if (var16 == 2 && ScriptEvent.region.method2931(class192.plane, var14, var15, var10) >= 0) {
                  ObjectComposition var19 = SoundTaskDataProvider.getObjectDefinition(var17);
                  if (var19.impostorIds != null) {
                     var19 = var19.getImpostor();
                  }

                  if (var19 == null) {
                     break label276;
                  }

                  if (Client.itemSelectionState == 1) {
                     VertexNormal.addMenuEntry("Use", Client.lastSelectedItemName + " " + "->" + " " + class50.getColTags(65535) + var19.name, 1, var17, var14, var15);
                  } else if (Client.spellSelected) {
                     if ((class45.field373 & 4) == 4) {
                        VertexNormal.addMenuEntry(Client.field750, Client.field751 + " " + "->" + " " + class50.getColTags(65535) + var19.name, 2, var17, var14, var15);
                     }
                  } else {
                     String[] var20 = var19.actions;
                     if (var20 != null) {
                        for(int var21 = 4; var21 >= 0; --var21) {
                           if (var20[var21] != null) {
                              short var22 = 0;
                              if (var21 == 0) {
                                 var22 = 3;
                              }

                              if (var21 == 1) {
                                 var22 = 4;
                              }

                              if (var21 == 2) {
                                 var22 = 5;
                              }

                              if (var21 == 3) {
                                 var22 = 6;
                              }

                              if (var21 == 4) {
                                 var22 = 1001;
                              }

                              VertexNormal.addMenuEntry(var20[var21], class50.getColTags(65535) + var19.name, var22, var18, var14, var15);
                           }
                        }
                     }

                     VertexNormal.addMenuEntry("Examine", class50.getColTags(65535) + var19.name, 1002, var19.id, var14, var15);
                  }
               }

               int var23;
               int var31;
               NPC var32;
               Player var33;
               int[] var35;
               if (var16 == 1) {
                  NPC var24 = Client.cachedNPCs[var18];
                  if (var24 == null) {
                     break label276;
                  }

                  if (var24.composition.size == 1 && (var24.x & 127) == 64 && (var24.y & 127) == 64) {
                     for(var31 = 0; var31 < Client.npcIndexesCount; ++var31) {
                        var32 = Client.cachedNPCs[Client.npcIndices[var31]];
                        if (var32 != null && var32 != var24 && var32.composition.size == 1 && var32.x == var24.x && var32.y == var24.y) {
                           class184.method3829(var32.composition, Client.npcIndices[var31], var14, var15);
                        }
                     }

                     var31 = class81.playerIndexesCount;
                     var35 = class81.playerIndices;

                     for(var23 = 0; var23 < var31; ++var23) {
                        var33 = Client.cachedPlayers[var35[var23]];
                        if (var33 != null && var33.x == var24.x && var24.y == var33.y) {
                           Varcs.method1942(var33, var35[var23], var14, var15);
                        }
                     }
                  }

                  class184.method3829(var24.composition, var18, var14, var15);
               }

               if (var16 == 0) {
                  Player var34 = Client.cachedPlayers[var18];
                  if (var34 == null) {
                     break label276;
                  }

                  if ((var34.x & 127) == 64 && (var34.y & 127) == 64) {
                     for(var31 = 0; var31 < Client.npcIndexesCount; ++var31) {
                        var32 = Client.cachedNPCs[Client.npcIndices[var31]];
                        if (var32 != null && var32.composition.size == 1 && var32.x == var34.x && var32.y == var34.y) {
                           class184.method3829(var32.composition, Client.npcIndices[var31], var14, var15);
                        }
                     }

                     var31 = class81.playerIndexesCount;
                     var35 = class81.playerIndices;

                     for(var23 = 0; var23 < var31; ++var23) {
                        var33 = Client.cachedPlayers[var35[var23]];
                        if (var33 != null && var33 != var34 && var33.x == var34.x && var33.y == var34.y) {
                           Varcs.method1942(var33, var35[var23], var14, var15);
                        }
                     }
                  }

                  if (var18 != Client.field719) {
                     Varcs.method1942(var34, var18, var14, var15);
                  } else {
                     var4 = var10;
                  }
               }

               if (var16 == 3) {
                  Deque var36 = Client.groundItemDeque[class192.plane][var14][var15];
                  if (var36 != null) {
                     for(Item var25 = (Item)var36.getTail(); var25 != null; var25 = (Item)var36.getPrevious()) {
                        ItemComposition var26 = class120.getItemDefinition(var25.id);
                        if (Client.itemSelectionState == 1) {
                           VertexNormal.addMenuEntry("Use", Client.lastSelectedItemName + " " + "->" + " " + class50.getColTags(16748608) + var26.name, 16, var25.id, var14, var15);
                        } else if (Client.spellSelected) {
                           if ((class45.field373 & 1) == 1) {
                              VertexNormal.addMenuEntry(Client.field750, Client.field751 + " " + "->" + " " + class50.getColTags(16748608) + var26.name, 17, var25.id, var14, var15);
                           }
                        } else {
                           String[] var27 = var26.groundActions;

                           for(int var28 = 4; var28 >= 0; --var28) {
                              if (var27 != null && var27[var28] != null) {
                                 byte var29 = 0;
                                 if (var28 == 0) {
                                    var29 = 18;
                                 }

                                 if (var28 == 1) {
                                    var29 = 19;
                                 }

                                 if (var28 == 2) {
                                    var29 = 20;
                                 }

                                 if (var28 == 3) {
                                    var29 = 21;
                                 }

                                 if (var28 == 4) {
                                    var29 = 22;
                                 }

                                 VertexNormal.addMenuEntry(var27[var28], class50.getColTags(16748608) + var26.name, var29, var25.id, var14, var15);
                              } else if (var28 == 2) {
                                 VertexNormal.addMenuEntry("Take", class50.getColTags(16748608) + var26.name, 20, var25.id, var14, var15);
                              }
                           }

                           VertexNormal.addMenuEntry("Examine", class50.getColTags(16748608) + var26.name, 1004, var25.id, var14, var15);
                        }
                     }
                  }
               }
            }
         }

         ++var8;
      }
   }
}
