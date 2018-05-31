import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("WorldMapType3")
public class WorldMapType3 implements WorldMapSectionBase {
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = 1313573881
   )
   @Export("cameraX")
   static int cameraX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1132759595
   )
   int field112;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1416784301
   )
   int field111;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 308760233
   )
   int field108;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1016991907
   )
   int field107;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 839121669
   )
   int field109;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1944673831
   )
   int field106;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1530611787
   )
   int field120;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1695570431
   )
   int field113;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1267510081
   )
   int field114;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 167534849
   )
   int field115;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1314401979
   )
   int field116;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1229192741
   )
   int field117;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -402631621
   )
   int field110;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2030373513
   )
   int field119;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Li;I)V",
      garbageValue = "-1657983190"
   )
   public void vmethod692(WorldMapData var1) {
      if(var1.minX > this.field109) {
         var1.minX = this.field109;
      }

      if(var1.field177 < this.field109) {
         var1.field177 = this.field109;
      }

      if(var1.minY > this.field106) {
         var1.minY = this.field106;
      }

      if(var1.field179 < this.field106) {
         var1.field179 = this.field106;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "1329615536"
   )
   public boolean containsCoord(int var1, int var2, int var3) {
      return var1 >= this.field112 && var1 < this.field112 + this.field111?var2 >= (this.field108 << 6) + (this.field120 << 3) && var2 <= (this.field108 << 6) + (this.field114 << 3) + 7 && var3 >= (this.field107 << 6) + (this.field113 << 3) && var3 <= (this.field107 << 6) + (this.field115 << 3) + 7:false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1150064833"
   )
   public boolean vmethod694(int var1, int var2) {
      return var1 >= (this.field109 << 6) + (this.field116 << 3) && var1 <= (this.field109 << 6) + (this.field110 << 3) + 7 && var2 >= (this.field106 << 6) + (this.field117 << 3) && var2 <= (this.field106 << 6) + (this.field119 << 3) + 7;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-1657440355"
   )
   public int[] vmethod712(int var1, int var2, int var3) {
      if(!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field109 * 64 - this.field108 * 64 + var2 + (this.field116 * 8 - this.field120 * 8), var3 + (this.field106 * 64 - this.field107 * 64) + (this.field117 * 8 - this.field113 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(III)Lhh;",
      garbageValue = "2126255726"
   )
   public Coordinates vmethod707(int var1, int var2) {
      if(!this.vmethod694(var1, var2)) {
         return null;
      } else {
         int var3 = this.field108 * 64 - this.field109 * 64 + (this.field120 * 8 - this.field116 * 8) + var1;
         int var4 = this.field107 * 64 - this.field106 * 64 + var2 + (this.field113 * 8 - this.field117 * 8);
         return new Coordinates(this.field112, var3, var4);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgy;S)V",
      garbageValue = "255"
   )
   public void vmethod697(Buffer var1) {
      this.field112 = var1.readUnsignedByte();
      this.field111 = var1.readUnsignedByte();
      this.field108 = var1.readUnsignedShort();
      this.field120 = var1.readUnsignedByte();
      this.field114 = var1.readUnsignedByte();
      this.field107 = var1.readUnsignedShort();
      this.field113 = var1.readUnsignedByte();
      this.field115 = var1.readUnsignedByte();
      this.field109 = var1.readUnsignedShort();
      this.field116 = var1.readUnsignedByte();
      this.field110 = var1.readUnsignedByte();
      this.field106 = var1.readUnsignedShort();
      this.field117 = var1.readUnsignedByte();
      this.field119 = var1.readUnsignedByte();
      this.method133();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-98"
   )
   void method133() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;III)Lft;",
      garbageValue = "1392861920"
   )
   public static class157 method154(Socket var0, int var1, int var2) throws IOException {
      return new class159(var0, var1, var2);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1825420386"
   )
   @Export("sendConInfo")
   public static void sendConInfo(boolean var0) {
      if(class250.NetCache_socket != null) {
         try {
            Buffer var1 = new Buffer(4);
            var1.putByte(var0?2:3);
            var1.put24bitInt(0);
            class250.NetCache_socket.vmethod3385(var1.payload, 0, 4);
         } catch (IOException var4) {
            try {
               class250.NetCache_socket.vmethod3368();
            } catch (Exception var3) {
               ;
            }

            ++class250.field3227;
            class250.NetCache_socket = null;
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SIII)V",
      garbageValue = "-25845431"
   )
   static void method155(String[] var0, short[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method155(var0, var1, var2, var5 - 1);
         method155(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      signature = "([Lhl;IIIIIIIII)V",
      garbageValue = "1015784875"
   )
   @Export("gameDraw")
   static final void gameDraw(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
      Graphics3D.Rasterizer3D_method1();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         Widget var10 = var0[var9];
         if(var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.draggedWidget)) {
            int var11;
            if(var8 == -1) {
               Client.widgetPositionX[Client.widgetCount] = var10.relativeX + var6;
               Client.widgetPositionY[Client.widgetCount] = var7 + var10.relativeY;
               Client.widgetBoundsWidth[Client.widgetCount] = var10.width;
               Client.widgetBoundsHeight[Client.widgetCount] = var10.height;
               var11 = ++Client.widgetCount - 1;
            } else {
               var11 = var8;
            }

            var10.boundsIndex = var11;
            var10.loopCycle = Client.gameCycle;
            if(var10.hasScript) {
               boolean var12 = var10.isHidden;
               if(var12) {
                  continue;
               }
            }

            int var49;
            if(var10.contentType > 0) {
               var49 = var10.contentType;
               if(var49 == 324) {
                  if(Client.field783 == -1) {
                     Client.field783 = var10.spriteId;
                     Client.field854 = var10.field2616;
                  }

                  if(Client.field853.isFemale) {
                     var10.spriteId = Client.field783;
                  } else {
                     var10.spriteId = Client.field854;
                  }
               } else if(var49 == 325) {
                  if(Client.field783 == -1) {
                     Client.field783 = var10.spriteId;
                     Client.field854 = var10.field2616;
                  }

                  if(Client.field853.isFemale) {
                     var10.spriteId = Client.field854;
                  } else {
                     var10.spriteId = Client.field783;
                  }
               } else if(var49 == 327) {
                  var10.rotationX = 150;
                  var10.rotationZ = (int)(Math.sin((double)Client.gameCycle / 40.0D) * 256.0D) & 2047;
                  var10.modelType = 5;
                  var10.modelId = 0;
               } else if(var49 == 328) {
                  var10.rotationX = 150;
                  var10.rotationZ = (int)(Math.sin((double)Client.gameCycle / 40.0D) * 256.0D) & 2047;
                  var10.modelType = 5;
                  var10.modelId = 1;
               }
            }

            var49 = var10.relativeX + var6;
            int var13 = var7 + var10.relativeY;
            int var14 = var10.opacity;
            int var15;
            int var16;
            if(var10 == Client.draggedWidget) {
               if(var1 != -1412584499 && !var10.dragRenderBehavior) {
                  class25.field226 = var0;
                  class184.field2378 = var6;
                  WorldMapManager.field268 = var7;
                  continue;
               }

               if(Client.draggingWidget && Client.field594) {
                  var15 = MouseInput.mouseLastX;
                  var16 = MouseInput.mouseLastY;
                  var15 -= Client.field685;
                  var16 -= Client.field766;
                  if(var15 < Client.field769) {
                     var15 = Client.field769;
                  }

                  if(var15 + var10.width > Client.field769 + Client.field639.width) {
                     var15 = Client.field769 + Client.field639.width - var10.width;
                  }

                  if(var16 < Client.field770) {
                     var16 = Client.field770;
                  }

                  if(var16 + var10.height > Client.field770 + Client.field639.height) {
                     var16 = Client.field770 + Client.field639.height - var10.height;
                  }

                  var49 = var15;
                  var13 = var16;
               }

               if(!var10.dragRenderBehavior) {
                  var14 = 128;
               }
            }

            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            if(var10.type == 2) {
               var15 = var2;
               var16 = var3;
               var17 = var4;
               var18 = var5;
            } else if(var10.type == 9) {
               var22 = var49;
               var19 = var13;
               var20 = var49 + var10.width;
               var21 = var13 + var10.height;
               if(var20 < var49) {
                  var22 = var20;
                  var20 = var49;
               }

               if(var21 < var13) {
                  var19 = var21;
                  var21 = var13;
               }

               ++var20;
               ++var21;
               var15 = var22 > var2?var22:var2;
               var16 = var19 > var3?var19:var3;
               var17 = var20 < var4?var20:var4;
               var18 = var21 < var5?var21:var5;
            } else {
               var22 = var49 + var10.width;
               var19 = var13 + var10.height;
               var15 = var49 > var2?var49:var2;
               var16 = var13 > var3?var13:var3;
               var17 = var22 < var4?var22:var4;
               var18 = var19 < var5?var19:var5;
            }

            if(!var10.hasScript || var15 < var17 && var16 < var18) {
               int var23;
               int var24;
               int var25;
               int var26;
               int var27;
               int var28;
               boolean var68;
               if(var10.contentType != 0) {
                  if(var10.contentType == 1336) {
                     if(Client.displayFps) {
                        var13 += 15;
                        ScriptEvent.font_p12full.method5543("Fps:" + GameEngine.FPS, var49 + var10.width, var13, 16776960, -1);
                        var13 += 15;
                        Runtime var51 = Runtime.getRuntime();
                        var19 = (int)((var51.totalMemory() - var51.freeMemory()) / 1024L);
                        var20 = 16776960;
                        if(var19 > 327680 && !Client.lowMemory) {
                           var20 = 16711680;
                        }

                        ScriptEvent.font_p12full.method5543("Mem:" + var19 + "k", var49 + var10.width, var13, var20, -1);
                        var13 += 15;
                     }
                     continue;
                  }

                  if(var10.contentType == 1337) {
                     Client.field741 = var49;
                     Client.field667 = var13;
                     class35.method682(var49, var13, var10.width, var10.height);
                     Client.field795[var10.boundsIndex] = true;
                     Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                     continue;
                  }

                  if(var10.contentType == 1338) {
                     Varbit.method4951();
                     class224 var50 = var10.method4561(false);
                     if(var50 != null) {
                        Rasterizer2D.setDrawRegion(var49, var13, var49 + var50.field2570, var13 + var50.field2575);
                        if(Client.field822 != 2 && Client.field822 != 5) {
                           var19 = Client.mapAngle & 2047;
                           var20 = MilliTimer.localPlayer.x / 32 + 48;
                           var21 = 464 - MilliTimer.localPlayer.y / 32;
                           class283.minimapSprite.method5948(var49, var13, var50.field2570, var50.field2575, var20, var21, var19, 256, var50.field2573, var50.field2572);

                           for(var23 = 0; var23 < Client.field651; ++var23) {
                              var24 = Client.field817[var23] * 4 + 2 - MilliTimer.localPlayer.x / 32;
                              var25 = Client.field818[var23] * 4 + 2 - MilliTimer.localPlayer.y / 32;
                              InvType.drawDot(var49, var13, var24, var25, Client.mapIcons[var23], var50);
                           }

                           var23 = 0;

                           while(true) {
                              if(var23 >= 104) {
                                 for(var23 = 0; var23 < Client.npcIndexesCount; ++var23) {
                                    NPC var61 = Client.cachedNPCs[Client.npcIndices[var23]];
                                    if(var61 != null && var61.hasConfig()) {
                                       NPCComposition var55 = var61.composition;
                                       if(var55 != null && var55.configs != null) {
                                          var55 = var55.transform();
                                       }

                                       if(var55 != null && var55.isMinimapVisible && var55.field3535) {
                                          var26 = var61.x / 32 - MilliTimer.localPlayer.x / 32;
                                          var27 = var61.y / 32 - MilliTimer.localPlayer.y / 32;
                                          InvType.drawDot(var49, var13, var26, var27, class81.mapDots[1], var50);
                                       }
                                    }
                                 }

                                 var23 = class81.playerIndexesCount;
                                 int[] var62 = class81.playerIndices;

                                 Player var57;
                                 for(var25 = 0; var25 < var23; ++var25) {
                                    var57 = Client.cachedPlayers[var62[var25]];
                                    if(var57 != null && var57.hasConfig() && !var57.hidden && var57 != MilliTimer.localPlayer) {
                                       var27 = var57.x / 32 - MilliTimer.localPlayer.x / 32;
                                       var28 = var57.y / 32 - MilliTimer.localPlayer.y / 32;
                                       var68 = false;
                                       if(MilliTimer.localPlayer.team != 0 && var57.team != 0 && var57.team == MilliTimer.localPlayer.team) {
                                          var68 = true;
                                       }

                                       if(var57.isFriend()) {
                                          InvType.drawDot(var49, var13, var27, var28, class81.mapDots[3], var50);
                                       } else if(var68) {
                                          InvType.drawDot(var49, var13, var27, var28, class81.mapDots[4], var50);
                                       } else if(var57.isClanMember()) {
                                          InvType.drawDot(var49, var13, var27, var28, class81.mapDots[5], var50);
                                       } else {
                                          InvType.drawDot(var49, var13, var27, var28, class81.mapDots[2], var50);
                                       }
                                    }
                                 }

                                 if(Client.hintArrowTargetType != 0 && Client.gameCycle % 20 < 10) {
                                    if(Client.hintArrowTargetType == 1 && Client.hintArrowNpcTargetIdx >= 0 && Client.hintArrowNpcTargetIdx < Client.cachedNPCs.length) {
                                       NPC var58 = Client.cachedNPCs[Client.hintArrowNpcTargetIdx];
                                       if(var58 != null) {
                                          var26 = var58.x / 32 - MilliTimer.localPlayer.x / 32;
                                          var27 = var58.y / 32 - MilliTimer.localPlayer.y / 32;
                                          MapIcon.worldToMinimap(var49, var13, var26, var27, class217.mapMarkers[1], var50);
                                       }
                                    }

                                    if(Client.hintArrowTargetType == 2) {
                                       var25 = Client.hintArrowX * 4 - class178.baseX * 4 + 2 - MilliTimer.localPlayer.x / 32;
                                       var26 = Client.hintArrowY * 4 - CombatInfoListHolder.baseY * 4 + 2 - MilliTimer.localPlayer.y / 32;
                                       MapIcon.worldToMinimap(var49, var13, var25, var26, class217.mapMarkers[1], var50);
                                    }

                                    if(Client.hintArrowTargetType == 10 && Client.hintArrowPlayerTargetIdx >= 0 && Client.hintArrowPlayerTargetIdx < Client.cachedPlayers.length) {
                                       var57 = Client.cachedPlayers[Client.hintArrowPlayerTargetIdx];
                                       if(var57 != null) {
                                          var26 = var57.x / 32 - MilliTimer.localPlayer.x / 32;
                                          var27 = var57.y / 32 - MilliTimer.localPlayer.y / 32;
                                          MapIcon.worldToMinimap(var49, var13, var26, var27, class217.mapMarkers[1], var50);
                                       }
                                    }
                                 }

                                 if(Client.destinationX != 0) {
                                    var25 = Client.destinationX * 4 + 2 - MilliTimer.localPlayer.x / 32;
                                    var26 = Client.destinationY * 4 + 2 - MilliTimer.localPlayer.y / 32;
                                    InvType.drawDot(var49, var13, var25, var26, class217.mapMarkers[0], var50);
                                 }

                                 if(!MilliTimer.localPlayer.hidden) {
                                    Rasterizer2D.Rasterizer2D_fillRectangle(var50.field2570 / 2 + var49 - 1, var50.field2575 / 2 + var13 - 1, 3, 3, 16777215);
                                 }
                                 break;
                              }

                              for(var24 = 0; var24 < 104; ++var24) {
                                 Deque var59 = Client.groundItemDeque[class192.plane][var23][var24];
                                 if(var59 != null) {
                                    var26 = var23 * 4 + 2 - MilliTimer.localPlayer.x / 32;
                                    var27 = var24 * 4 + 2 - MilliTimer.localPlayer.y / 32;
                                    InvType.drawDot(var49, var13, var26, var27, class81.mapDots[0], var50);
                                 }
                              }

                              ++var23;
                           }
                        } else {
                           Rasterizer2D.method5786(var49, var13, 0, var50.field2573, var50.field2572);
                        }

                        Client.field796[var11] = true;
                     }

                     Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                     continue;
                  }

                  if(var10.contentType == 1339) {
                     GrandExchangeOffer.method57(var10, var49, var13, var11);
                     Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                     continue;
                  }

                  if(var10.contentType == 1400) {
                     Preferences.renderOverview.extractWorldmap(var49, var13, var10.width, var10.height, Client.gameCycle);
                  }

                  if(var10.contentType == 1401) {
                     Preferences.renderOverview.extractData(var49, var13, var10.width, var10.height);
                  }
               }

               boolean var29;
               if(var10.type == 0) {
                  if(!var10.hasScript) {
                     var29 = var10.isHidden;
                     if(var29 && var10 != class37.field329) {
                        continue;
                     }
                  }

                  if(!var10.hasScript) {
                     if(var10.scrollY > var10.scrollHeight - var10.height) {
                        var10.scrollY = var10.scrollHeight - var10.height;
                     }

                     if(var10.scrollY < 0) {
                        var10.scrollY = 0;
                     }
                  }

                  gameDraw(var0, var10.id, var15, var16, var17, var18, var49 - var10.scrollX, var13 - var10.scrollY, var11);
                  if(var10.children != null) {
                     gameDraw(var10.children, var10.id, var15, var16, var17, var18, var49 - var10.scrollX, var13 - var10.scrollY, var11);
                  }

                  WidgetNode var30 = (WidgetNode)Client.componentTable.get((long)var10.id);
                  if(var30 != null) {
                     class218.method4359(var30.id, var15, var16, var17, var18, var49, var13, var11);
                  }

                  Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                  Graphics3D.Rasterizer3D_method1();
               }

               if(Client.isResized || Client.field797[var11] || Client.gameDrawingMode > 1) {
                  if(var10.type == 0 && !var10.hasScript && var10.scrollHeight > var10.height) {
                     var22 = var49 + var10.width;
                     var19 = var10.scrollY;
                     var20 = var10.height;
                     var21 = var10.scrollHeight;
                     CombatInfoListHolder.scrollbarSprites[0].method5873(var22, var13);
                     CombatInfoListHolder.scrollbarSprites[1].method5873(var22, var13 + var20 - 16);
                     Rasterizer2D.Rasterizer2D_fillRectangle(var22, var13 + 16, 16, var20 - 32, Client.field655);
                     var23 = var20 * (var20 - 32) / var21;
                     if(var23 < 8) {
                        var23 = 8;
                     }

                     var24 = var19 * (var20 - 32 - var23) / (var21 - var20);
                     Rasterizer2D.Rasterizer2D_fillRectangle(var22, var24 + var13 + 16, 16, var23, Client.field656);
                     Rasterizer2D.method5842(var22, var24 + var13 + 16, var23, Client.field658);
                     Rasterizer2D.method5842(var22 + 1, var13 + var24 + 16, var23, Client.field658);
                     Rasterizer2D.method5780(var22, var13 + var24 + 16, 16, Client.field658);
                     Rasterizer2D.method5780(var22, var24 + var13 + 17, 16, Client.field658);
                     Rasterizer2D.method5842(var22 + 15, var24 + var13 + 16, var23, Client.field731);
                     Rasterizer2D.method5842(var22 + 14, var13 + var24 + 17, var23 - 1, Client.field731);
                     Rasterizer2D.method5780(var22, var23 + var13 + var24 + 15, 16, Client.field731);
                     Rasterizer2D.method5780(var22 + 1, var13 + var24 + var23 + 14, 15, Client.field731);
                  }

                  if(var10.type != 1) {
                     int var52;
                     if(var10.type == 2) {
                        var22 = 0;

                        for(var19 = 0; var19 < var10.originalHeight; ++var19) {
                           for(var20 = 0; var20 < var10.originalWidth; ++var20) {
                              var21 = var49 + var20 * (var10.paddingX + 32);
                              var23 = var13 + var19 * (var10.paddingY + 32);
                              if(var22 < 20) {
                                 var21 += var10.xSprites[var22];
                                 var23 += var10.field2693[var22];
                              }

                              if(var10.itemIds[var22] <= 0) {
                                 if(var10.field2750 != null && var22 < 20) {
                                    SpritePixels var54 = var10.method4528(var22);
                                    if(var54 != null) {
                                       var54.drawAt(var21, var23);
                                    } else if(Widget.field2621) {
                                       DState.method3548(var10);
                                    }
                                 }
                              } else {
                                 boolean var53 = false;
                                 var68 = false;
                                 var26 = var10.itemIds[var22] - 1;
                                 if(var21 + 32 > var2 && var21 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class49.field442 && var22 == Client.field597) {
                                    SpritePixels var71;
                                    if(Client.itemSelectionState == 1 && var22 == class59.selectedItemIndex && var10.id == Huffman.field2296) {
                                       var71 = class171.createSprite(var26, var10.itemQuantities[var22], 2, 0, 2, false);
                                    } else {
                                       var71 = class171.createSprite(var26, var10.itemQuantities[var22], 1, 3153952, 2, false);
                                    }

                                    if(var71 != null) {
                                       if(var10 == class49.field442 && var22 == Client.field597) {
                                          var24 = MouseInput.mouseLastX - Client.field701;
                                          var25 = MouseInput.mouseLastY - Client.field640;
                                          if(var24 < 5 && var24 > -5) {
                                             var24 = 0;
                                          }

                                          if(var25 < 5 && var25 > -5) {
                                             var25 = 0;
                                          }

                                          if(Client.itemPressedDuration < 5) {
                                             var24 = 0;
                                             var25 = 0;
                                          }

                                          var71.drawAtOpacity(var24 + var21, var25 + var23, 128);
                                          if(var1 != -1) {
                                             Widget var72 = var0[var1 & 65535];
                                             if(var25 + var23 < Rasterizer2D.drawingAreaTop && var72.scrollY > 0) {
                                                var52 = (Rasterizer2D.drawingAreaTop - var23 - var25) * Client.field654 / 3;
                                                if(var52 > Client.field654 * 10) {
                                                   var52 = Client.field654 * 10;
                                                }

                                                if(var52 > var72.scrollY) {
                                                   var52 = var72.scrollY;
                                                }

                                                var72.scrollY -= var52;
                                                Client.field640 += var52;
                                                DState.method3548(var72);
                                             }

                                             if(var23 + var25 + 32 > Rasterizer2D.drawingAreaRight && var72.scrollY < var72.scrollHeight - var72.height) {
                                                var52 = (var23 + var25 + 32 - Rasterizer2D.drawingAreaRight) * Client.field654 / 3;
                                                if(var52 > Client.field654 * 10) {
                                                   var52 = Client.field654 * 10;
                                                }

                                                if(var52 > var72.scrollHeight - var72.height - var72.scrollY) {
                                                   var52 = var72.scrollHeight - var72.height - var72.scrollY;
                                                }

                                                var72.scrollY += var52;
                                                Client.field640 -= var52;
                                                DState.method3548(var72);
                                             }
                                          }
                                       } else if(var10 == class144.field1921 && var22 == Client.pressedItemIndex) {
                                          var71.drawAtOpacity(var21, var23, 128);
                                       } else {
                                          var71.drawAt(var21, var23);
                                       }
                                    } else {
                                       DState.method3548(var10);
                                    }
                                 }
                              }

                              ++var22;
                           }
                        }
                     } else if(var10.type == 3) {
                        if(class9.method96(var10)) {
                           var22 = var10.field2640;
                           if(var10 == class37.field329 && var10.field2651 != 0) {
                              var22 = var10.field2651;
                           }
                        } else {
                           var22 = var10.textColor;
                           if(var10 == class37.field329 && var10.field2650 != 0) {
                              var22 = var10.field2650;
                           }
                        }

                        if(var10.filled) {
                           switch(var10.field2700.field3776) {
                           case 1:
                              Rasterizer2D.method5772(var49, var13, var10.width, var10.height, var10.textColor, var10.field2640, 256 - (var10.opacity & 255), 256 - (var10.field2649 & 255));
                              break;
                           case 2:
                              Rasterizer2D.method5773(var49, var13, var10.width, var10.height, var10.textColor, var10.field2640, 256 - (var10.opacity & 255), 256 - (var10.field2649 & 255));
                              break;
                           case 3:
                              Rasterizer2D.method5774(var49, var13, var10.width, var10.height, var10.textColor, var10.field2640, 256 - (var10.opacity & 255), 256 - (var10.field2649 & 255));
                              break;
                           case 4:
                              Rasterizer2D.method5838(var49, var13, var10.width, var10.height, var10.textColor, var10.field2640, 256 - (var10.opacity & 255), 256 - (var10.field2649 & 255));
                              break;
                           default:
                              if(var14 == 0) {
                                 Rasterizer2D.Rasterizer2D_fillRectangle(var49, var13, var10.width, var10.height, var22);
                              } else {
                                 Rasterizer2D.fillRectangle(var49, var13, var10.width, var10.height, var22, 256 - (var14 & 255));
                              }
                           }
                        } else if(var14 == 0) {
                           Rasterizer2D.drawRectangle(var49, var13, var10.width, var10.height, var22);
                        } else {
                           Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var49, var13, var10.width, var10.height, var22, 256 - (var14 & 255));
                        }
                     } else {
                        Font var31;
                        if(var10.type == 4) {
                           var31 = var10.getFont();
                           if(var31 == null) {
                              if(Widget.field2621) {
                                 DState.method3548(var10);
                              }
                           } else {
                              String var60 = var10.text;
                              if(class9.method96(var10)) {
                                 var19 = var10.field2640;
                                 if(var10 == class37.field329 && var10.field2651 != 0) {
                                    var19 = var10.field2651;
                                 }

                                 if(var10.string1.length() > 0) {
                                    var60 = var10.string1;
                                 }
                              } else {
                                 var19 = var10.textColor;
                                 if(var10 == class37.field329 && var10.field2650 != 0) {
                                    var19 = var10.field2650;
                                 }
                              }

                              if(var10.hasScript && var10.itemId != -1) {
                                 ItemComposition var69 = class120.getItemDefinition(var10.itemId);
                                 var60 = var69.name;
                                 if(var60 == null) {
                                    var60 = "null";
                                 }

                                 if((var69.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
                                    var60 = class50.getColTags(16748608) + var60 + "</col>" + " " + 'x' + class49.method1016(var10.itemQuantity);
                                 }
                              }

                              if(var10 == Client.field756) {
                                 var60 = "Please wait...";
                                 var19 = var10.textColor;
                              }

                              if(!var10.hasScript) {
                                 var60 = FileRequest.method4621(var60, var10);
                              }

                              var31.method5595(var60, var49, var13, var10.width, var10.height, var19, var10.textShadowed?0:-1, var10.field2747, var10.field2688, var10.field2686);
                           }
                        } else if(var10.type == 5) {
                           SpritePixels var56;
                           if(!var10.hasScript) {
                              var56 = var10.method4562(class9.method96(var10));
                              if(var56 != null) {
                                 var56.drawAt(var49, var13);
                              } else if(Widget.field2621) {
                                 DState.method3548(var10);
                              }
                           } else {
                              if(var10.itemId != -1) {
                                 var56 = class171.createSprite(var10.itemId, var10.itemQuantity, var10.borderThickness, var10.sprite2, var10.field2645, false);
                              } else {
                                 var56 = var10.method4562(false);
                              }

                              if(var56 == null) {
                                 if(Widget.field2621) {
                                    DState.method3548(var10);
                                 }
                              } else {
                                 var19 = var56.maxWidth;
                                 var20 = var56.maxHeight;
                                 if(!var10.spriteTiling) {
                                    var21 = var10.width * 4096 / var19;
                                    if(var10.textureId != 0) {
                                       var56.method5998(var10.width / 2 + var49, var10.height / 2 + var13, var10.textureId, var21);
                                    } else if(var14 != 0) {
                                       var56.method5903(var49, var13, var10.width, var10.height, 256 - (var14 & 255));
                                    } else if(var19 == var10.width && var20 == var10.height) {
                                       var56.drawAt(var49, var13);
                                    } else {
                                       var56.method5897(var49, var13, var10.width, var10.height);
                                    }
                                 } else {
                                    Rasterizer2D.setInnerDrawRegion(var49, var13, var49 + var10.width, var13 + var10.height);
                                    var21 = (var19 - 1 + var10.width) / var19;
                                    var23 = (var20 - 1 + var10.height) / var20;

                                    for(var24 = 0; var24 < var21; ++var24) {
                                       for(var25 = 0; var25 < var23; ++var25) {
                                          if(var10.textureId != 0) {
                                             var56.method5998(var19 / 2 + var49 + var19 * var24, var20 / 2 + var13 + var25 * var20, var10.textureId, 4096);
                                          } else if(var14 != 0) {
                                             var56.drawAtOpacity(var49 + var24 * var19, var13 + var20 * var25, 256 - (var14 & 255));
                                          } else {
                                             var56.drawAt(var49 + var24 * var19, var13 + var20 * var25);
                                          }
                                       }
                                    }

                                    Rasterizer2D.setDrawRegion(var2, var3, var4, var5);
                                 }
                              }
                           }
                        } else {
                           ItemComposition var32;
                           if(var10.type == 6) {
                              var29 = class9.method96(var10);
                              if(var29) {
                                 var19 = var10.field2671;
                              } else {
                                 var19 = var10.field2670;
                              }

                              Model var65 = null;
                              var21 = 0;
                              if(var10.itemId != -1) {
                                 var32 = class120.getItemDefinition(var10.itemId);
                                 if(var32 != null) {
                                    var32 = var32.method5105(var10.itemQuantity);
                                    var65 = var32.getModel(1);
                                    if(var65 != null) {
                                       var65.calculateBoundsCylinder();
                                       var21 = var65.modelHeight / 2;
                                    } else {
                                       DState.method3548(var10);
                                    }
                                 }
                              } else if(var10.modelType == 5) {
                                 if(var10.modelId == 0) {
                                    var65 = Client.field853.getModel((Sequence)null, -1, (Sequence)null, -1);
                                 } else {
                                    var65 = MilliTimer.localPlayer.getModel();
                                 }
                              } else if(var19 == -1) {
                                 var65 = var10.getModel((Sequence)null, -1, var29, MilliTimer.localPlayer.composition);
                                 if(var65 == null && Widget.field2621) {
                                    DState.method3548(var10);
                                 }
                              } else {
                                 Sequence var70 = class137.getAnimation(var19);
                                 var65 = var10.getModel(var70, var10.field2746, var29, MilliTimer.localPlayer.composition);
                                 if(var65 == null && Widget.field2621) {
                                    DState.method3548(var10);
                                 }
                              }

                              Graphics3D.method2821(var10.width / 2 + var49, var10.height / 2 + var13);
                              var23 = Graphics3D.SINE[var10.rotationX] * var10.modelZoom >> 16;
                              var24 = Graphics3D.COSINE[var10.rotationX] * var10.modelZoom >> 16;
                              if(var65 != null) {
                                 if(!var10.hasScript) {
                                    var65.method2738(0, var10.rotationZ, 0, var10.rotationX, 0, var23, var24);
                                 } else {
                                    var65.calculateBoundsCylinder();
                                    if(var10.field2699) {
                                       var65.method2746(0, var10.rotationZ, var10.rotationY, var10.rotationX, var10.offsetX2d, var23 + var21 + var10.offsetY2d, var24 + var10.offsetY2d, var10.modelZoom);
                                    } else {
                                       var65.method2738(0, var10.rotationZ, var10.rotationY, var10.rotationX, var10.offsetX2d, var23 + var21 + var10.offsetY2d, var24 + var10.offsetY2d);
                                    }
                                 }
                              }

                              Graphics3D.Rasterizer3D_method3();
                           } else {
                              if(var10.type == 7) {
                                 var31 = var10.getFont();
                                 if(var31 == null) {
                                    if(Widget.field2621) {
                                       DState.method3548(var10);
                                    }
                                    continue;
                                 }

                                 var19 = 0;

                                 for(var20 = 0; var20 < var10.originalHeight; ++var20) {
                                    for(var21 = 0; var21 < var10.originalWidth; ++var21) {
                                       if(var10.itemIds[var19] > 0) {
                                          var32 = class120.getItemDefinition(var10.itemIds[var19] - 1);
                                          String var33;
                                          if(var32.isStackable != 1 && var10.itemQuantities[var19] == 1) {
                                             var33 = class50.getColTags(16748608) + var32.name + "</col>";
                                          } else {
                                             var33 = class50.getColTags(16748608) + var32.name + "</col>" + " " + 'x' + class49.method1016(var10.itemQuantities[var19]);
                                          }

                                          var25 = var49 + var21 * (var10.paddingX + 115);
                                          var26 = var13 + (var10.paddingY + 12) * var20;
                                          if(var10.field2747 == 0) {
                                             var31.method5541(var33, var25, var26, var10.textColor, var10.textShadowed?0:-1);
                                          } else if(var10.field2747 == 1) {
                                             var31.drawTextCentered(var33, var10.width / 2 + var25, var26, var10.textColor, var10.textShadowed?0:-1);
                                          } else {
                                             var31.method5543(var33, var25 + var10.width - 1, var26, var10.textColor, var10.textShadowed?0:-1);
                                          }
                                       }

                                       ++var19;
                                    }
                                 }
                              }

                              if(var10.type == 8 && var10 == class7.field42 && Client.field744 == Client.field747) {
                                 var22 = 0;
                                 var19 = 0;
                                 Font var63 = ScriptEvent.font_p12full;
                                 String var34 = var10.text;

                                 String var35;
                                 for(var34 = FileRequest.method4621(var34, var10); var34.length() > 0; var19 = var19 + var63.verticalSpace + 1) {
                                    var24 = var34.indexOf("<br>");
                                    if(var24 != -1) {
                                       var35 = var34.substring(0, var24);
                                       var34 = var34.substring(var24 + 4);
                                    } else {
                                       var35 = var34;
                                       var34 = "";
                                    }

                                    var25 = var63.getTextWidth(var35);
                                    if(var25 > var22) {
                                       var22 = var25;
                                    }
                                 }

                                 var22 += 6;
                                 var19 += 7;
                                 var24 = var49 + var10.width - 5 - var22;
                                 var25 = var13 + var10.height + 5;
                                 if(var24 < var49 + 5) {
                                    var24 = var49 + 5;
                                 }

                                 if(var22 + var24 > var4) {
                                    var24 = var4 - var22;
                                 }

                                 if(var25 + var19 > var5) {
                                    var25 = var5 - var19;
                                 }

                                 Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var22, var19, 16777120);
                                 Rasterizer2D.drawRectangle(var24, var25, var22, var19, 0);
                                 var34 = var10.text;
                                 var26 = var25 + var63.verticalSpace + 2;

                                 for(var34 = FileRequest.method4621(var34, var10); var34.length() > 0; var26 = var26 + var63.verticalSpace + 1) {
                                    var27 = var34.indexOf("<br>");
                                    if(var27 != -1) {
                                       var35 = var34.substring(0, var27);
                                       var34 = var34.substring(var27 + 4);
                                    } else {
                                       var35 = var34;
                                       var34 = "";
                                    }

                                    var63.method5541(var35, var24 + 3, var26, 0, -1);
                                 }
                              }

                              if(var10.type == 9) {
                                 if(var10.field2657) {
                                    var22 = var49;
                                    var19 = var13 + var10.height;
                                    var20 = var49 + var10.width;
                                    var21 = var13;
                                 } else {
                                    var22 = var49;
                                    var19 = var13;
                                    var20 = var49 + var10.width;
                                    var21 = var13 + var10.height;
                                 }

                                 if(var10.lineWidth == 1) {
                                    Rasterizer2D.drawLine(var22, var19, var20, var21, var10.textColor);
                                 } else {
                                    var25 = var10.textColor;
                                    var26 = var10.lineWidth;
                                    var27 = var20 - var22;
                                    var28 = var21 - var19;
                                    var52 = var27 >= 0?var27:-var27;
                                    int var64 = var28 >= 0?var28:-var28;
                                    int var66 = var52;
                                    if(var52 < var64) {
                                       var66 = var64;
                                    }

                                    if(var66 != 0) {
                                       int var67 = (var27 << 16) / var66;
                                       int var36 = (var28 << 16) / var66;
                                       if(var36 <= var67) {
                                          var67 = -var67;
                                       } else {
                                          var36 = -var36;
                                       }

                                       int var37 = var36 * var26 >> 17;
                                       int var38 = var36 * var26 + 1 >> 17;
                                       int var39 = var26 * var67 >> 17;
                                       int var40 = var26 * var67 + 1 >> 17;
                                       var23 = var22 - Rasterizer2D.draw_region_x;
                                       var24 = var19 - Rasterizer2D.drawingAreaTop;
                                       int var41 = var23 + var37;
                                       int var42 = var23 - var38;
                                       int var43 = var23 + var27 - var38;
                                       int var44 = var23 + var27 + var37;
                                       int var45 = var24 + var39;
                                       int var46 = var24 - var40;
                                       int var47 = var28 + var24 - var40;
                                       int var48 = var24 + var28 + var39;
                                       Graphics3D.setRasterClippingEnabled(var41, var42, var43);
                                       Graphics3D.rasterFlat(var45, var46, var47, var41, var42, var43, var25);
                                       Graphics3D.setRasterClippingEnabled(var41, var43, var44);
                                       Graphics3D.rasterFlat(var45, var47, var48, var41, var43, var44, var25);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
