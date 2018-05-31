import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("MessageNode")
public class MessageNode extends CacheableNode {
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1469915221
   )
   static int field549;
   @ObfuscatedName("fa")
   @ObfuscatedGetter(
      intValue = 728143065
   )
   static int field545;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 752906733
   )
   @Export("id")
   int id;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1104949363
   )
   @Export("tick")
   int tick;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 730027175
   )
   @Export("type")
   int type;
   @ObfuscatedName("b")
   @Export("name")
   String name;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   Name field540;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lke;"
   )
   class289 field541;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lke;"
   )
   class289 field551;
   @ObfuscatedName("x")
   @Export("sender")
   String sender;
   @ObfuscatedName("j")
   @Export("value")
   String value;

   @Hook(
      value = "setMessage",
      end = true
   )
   MessageNode(int var1, String var2, String var3, String var4) {
      this.field541 = class289.field3652;
      this.field551 = class289.field3652;
      int var5 = ++class83.field1208 - 1;
      this.id = var5;
      this.tick = Client.gameCycle;
      this.type = var1;
      this.name = var2;
      this.method1101();
      this.sender = var3;
      this.value = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1484040489"
   )
   @Export("setMessage")
   @Hook(
      value = "setMessage",
      end = true
   )
   void setMessage(int var1, String var2, String var3, String var4) {
      int var5 = ++class83.field1208 - 1;
      this.id = var5;
      this.tick = Client.gameCycle;
      this.type = var1;
      this.name = var2;
      this.method1101();
      this.sender = var3;
      this.value = var4;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "910932872"
   )
   void method1095() {
      this.field541 = class289.field3652;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-116601790"
   )
   final boolean method1096() {
      if(this.field541 == class289.field3652) {
         this.method1109();
      }

      return this.field541 == class289.field3651;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "295077887"
   )
   void method1109() {
      this.field541 = CacheFile.friendManager.friendContainer.isMember(this.field540)?class289.field3651:class289.field3650;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   void method1098() {
      this.field551 = class289.field3652;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "14"
   )
   final boolean method1099() {
      if(this.field551 == class289.field3652) {
         this.method1100();
      }

      return this.field551 == class289.field3651;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-98"
   )
   void method1100() {
      this.field551 = CacheFile.friendManager.ignoreContainer.isMember(this.field540)?class289.field3651:class289.field3650;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1378703733"
   )
   final void method1101() {
      if(this.name != null) {
         this.field540 = new Name(class9.method97(this.name), WorldMapDecoration.loginType);
      } else {
         this.field540 = null;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-22422"
   )
   static final void method1105() {
      short var0 = 256;
      int var1;
      if(class78.field1114 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class78.field1114 > 768) {
               class45.field376[var1] = WorldMapManager.method559(WorldComparator.field4[var1], class81.field1178[var1], 1024 - class78.field1114);
            } else if(class78.field1114 > 256) {
               class45.field376[var1] = class81.field1178[var1];
            } else {
               class45.field376[var1] = WorldMapManager.method559(class81.field1178[var1], WorldComparator.field4[var1], 256 - class78.field1114);
            }
         }
      } else if(class78.field1138 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class78.field1138 > 768) {
               class45.field376[var1] = WorldMapManager.method559(WorldComparator.field4[var1], DynamicObject.field1228[var1], 1024 - class78.field1138);
            } else if(class78.field1138 > 256) {
               class45.field376[var1] = DynamicObject.field1228[var1];
            } else {
               class45.field376[var1] = WorldMapManager.method559(DynamicObject.field1228[var1], WorldComparator.field4[var1], 256 - class78.field1138);
            }
         }
      } else {
         for(var1 = 0; var1 < 256; ++var1) {
            class45.field376[var1] = WorldComparator.field4[var1];
         }
      }

      Rasterizer2D.setDrawRegion(class78.field1104, 9, class78.field1104 + 128, var0 + 7);
      class78.field1107.method5893(class78.field1104, 0);
      Rasterizer2D.noClip();
      var1 = 0;
      int var2 = class50.rasterProvider.width * 9 + class78.field1104;

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = class78.field1128[var3] * (var0 - var3) / var0;
         var5 = var4 + 22;
         if(var5 < 0) {
            var5 = 0;
         }

         var1 += var5;

         for(var6 = var5; var6 < 128; ++var6) {
            var7 = class297.field3701[var1++];
            if(var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = class45.field376[var7];
               var10 = class50.rasterProvider.pixels[var2];
               class50.rasterProvider.pixels[var2++] = (var8 * (var7 & 65280) + var9 * (var10 & 65280) & 16711680) + ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) >> 8;
            } else {
               ++var2;
            }
         }

         var2 += var5 + class50.rasterProvider.width - 128;
      }

      Rasterizer2D.setDrawRegion(class78.field1104 + 765 - 128, 9, class78.field1104 + 765, var0 + 7);
      class24.field224.method5893(class78.field1104 + 382, 0);
      Rasterizer2D.noClip();
      var1 = 0;
      var2 = class50.rasterProvider.width * 9 + class78.field1104 + 637 + 24;

      for(var3 = 1; var3 < var0 - 1; ++var3) {
         var4 = class78.field1128[var3] * (var0 - var3) / var0;
         var5 = 103 - var4;
         var2 += var4;

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = class297.field3701[var1++];
            if(var7 != 0) {
               var8 = var7;
               var9 = 256 - var7;
               var7 = class45.field376[var7];
               var10 = class50.rasterProvider.pixels[var2];
               class50.rasterProvider.pixels[var2++] = (var9 * (var10 & 65280) + var8 * (var7 & 65280) & 16711680) + ((var10 & 16711935) * var9 + (var7 & 16711935) * var8 & -16711936) >> 8;
            } else {
               ++var2;
            }
         }

         var1 += 128 - var5;
         var2 += class50.rasterProvider.width - var5 - var4;
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ILcs;ZS)I",
      garbageValue = "-11807"
   )
   static int method1118(int var0, Script var1, boolean var2) {
      int var3;
      if(var0 == 3200) {
         class45.intStackSize -= 3;
         var3 = class69.intStack[class45.intStackSize];
         int var4 = class69.intStack[class45.intStackSize + 1];
         int var5 = class69.intStack[class45.intStackSize + 2];
         if(Client.field768 != 0 && var4 != 0 && Client.queuedSoundEffectCount < 50) {
            Client.queuedSoundEffectIDs[Client.queuedSoundEffectCount] = var3;
            Client.unknownSoundValues1[Client.queuedSoundEffectCount] = var4;
            Client.unknownSoundValues2[Client.queuedSoundEffectCount] = var5;
            Client.audioEffects[Client.queuedSoundEffectCount] = null;
            Client.soundLocations[Client.queuedSoundEffectCount] = 0;
            ++Client.queuedSoundEffectCount;
         }

         return 1;
      } else if(var0 != 3201) {
         if(var0 == 3202) {
            class45.intStackSize -= 2;
            FloorUnderlayDefinition.method4879(class69.intStack[class45.intStackSize], class69.intStack[class45.intStackSize + 1]);
            return 1;
         } else {
            return 2;
         }
      } else {
         var3 = class69.intStack[--class45.intStackSize];
         if(var3 == -1 && !Client.field825) {
            class37.method721();
         } else if(var3 != -1 && var3 != Client.field824 && Client.field693 != 0 && !Client.field825) {
            ClientPacket.method3459(2, MouseInput.indexTrack1, var3, 0, Client.field693, false);
         }

         Client.field824 = var3;
         return 1;
      }
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(Lfr;I)V",
      garbageValue = "1845437737"
   )
   static final void method1117(class171 var0) {
      PacketBuffer var1 = Client.field739.packetBuffer;
      int var2;
      int var3;
      int var4;
      Item var5;
      int var6;
      int var7;
      if(class171.field2267 == var0) {
         var6 = var1.readUnsignedShort();
         var2 = var1.readUnsignedShortOb1();
         var7 = (var2 >> 4 & 7) + field545;
         var3 = (var2 & 7) + Script.field1219;
         var4 = var1.readUnsignedShort();
         if(var7 >= 0 && var3 >= 0 && var7 < 104 && var3 < 104) {
            var5 = new Item();
            var5.id = var6;
            var5.quantity = var4;
            if(Client.groundItemDeque[class192.plane][var7][var3] == null) {
               Client.groundItemDeque[class192.plane][var7][var3] = new Deque();
            }

            Client.groundItemDeque[class192.plane][var7][var3].addFront(var5);
            class171.groundItemSpawned(var7, var3);
         }
      } else {
         byte var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         byte var17;
         if(class171.field2274 == var0) {
            var8 = var1.method3702();
            var2 = var1.readUnsignedShort();
            byte var15 = var1.readByte();
            var3 = var1.method3553();
            var4 = (var3 >> 4 & 7) + field545;
            var14 = (var3 & 7) + Script.field1219;
            var9 = var1.method3784();
            var10 = var1.method3562();
            byte var16 = var1.method3765();
            var11 = var1.readUnsignedShort();
            var17 = var1.method3600();
            var12 = var1.readUnsignedByte();
            var13 = var12 >> 2;
            int var18 = var12 & 3;
            int var19 = Client.field653[var13];
            Player var20;
            if(var10 == Client.localInteractingIndex) {
               var20 = MilliTimer.localPlayer;
            } else {
               var20 = Client.cachedPlayers[var10];
            }

            if(var20 != null) {
               ObjectComposition var21 = SoundTaskDataProvider.getObjectDefinition(var9);
               int var22;
               int var23;
               if(var18 != 1 && var18 != 3) {
                  var22 = var21.width;
                  var23 = var21.length;
               } else {
                  var22 = var21.length;
                  var23 = var21.width;
               }

               int var24 = var4 + (var22 >> 1);
               int var25 = var4 + (var22 + 1 >> 1);
               int var26 = var14 + (var23 >> 1);
               int var27 = var14 + (var23 + 1 >> 1);
               int[][] var28 = class50.tileHeights[class192.plane];
               int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
               int var30 = (var4 << 7) + (var22 << 6);
               int var31 = (var14 << 7) + (var23 << 6);
               Model var32 = var21.method5052(var13, var18, var28, var30, var29, var31);
               if(var32 != null) {
                  class222.method4447(class192.plane, var4, var14, var19, -1, 0, 0, var11 + 1, var2 + 1);
                  var20.animationCycleStart = var11 + Client.gameCycle;
                  var20.animationCycleEnd = var2 + Client.gameCycle;
                  var20.model = var32;
                  var20.field571 = var4 * 128 + var22 * 64;
                  var20.field582 = var14 * 128 + var23 * 64;
                  var20.field562 = var29;
                  byte var33;
                  if(var16 > var17) {
                     var33 = var16;
                     var16 = var17;
                     var17 = var33;
                  }

                  if(var8 > var15) {
                     var33 = var8;
                     var8 = var15;
                     var15 = var33;
                  }

                  var20.field568 = var16 + var4;
                  var20.field577 = var17 + var4;
                  var20.field573 = var14 + var8;
                  var20.field578 = var14 + var15;
               }
            }
         }

         if(class171.field2269 == var0) {
            var6 = var1.readUnsignedByte();
            var2 = (var6 >> 4 & 7) + field545;
            var7 = (var6 & 7) + Script.field1219;
            var3 = var1.method3553();
            var4 = var3 >> 2;
            var14 = var3 & 3;
            var9 = Client.field653[var4];
            if(var2 >= 0 && var7 >= 0 && var2 < 104 && var7 < 104) {
               class222.method4447(class192.plane, var2, var7, var9, -1, var4, var14, 0, -1);
            }
         } else if(class171.field2272 == var0) {
            var6 = var1.method3784();
            var2 = var1.method3597();
            var7 = (var2 >> 4 & 7) + field545;
            var3 = (var2 & 7) + Script.field1219;
            if(var7 >= 0 && var3 >= 0 && var7 < 104 && var3 < 104) {
               Deque var34 = Client.groundItemDeque[class192.plane][var7][var3];
               if(var34 != null) {
                  for(var5 = (Item)var34.getFront(); var5 != null; var5 = (Item)var34.getNext()) {
                     if((var6 & 32767) == var5.id) {
                        var5.unlink();
                        break;
                     }
                  }

                  if(var34.getFront() == null) {
                     Client.groundItemDeque[class192.plane][var7][var3] = null;
                  }

                  class171.groundItemSpawned(var7, var3);
               }
            }
         } else {
            int var35;
            if(class171.field2276 == var0) {
               var6 = var1.method3597();
               var2 = var1.method3597();
               var7 = var2 >> 4 & 15;
               var3 = var2 & 7;
               var4 = var1.readUnsignedShort();
               var14 = var1.method3553();
               var9 = (var14 >> 4 & 7) + field545;
               var10 = (var14 & 7) + Script.field1219;
               if(var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                  var35 = var7 + 1;
                  if(MilliTimer.localPlayer.pathX[0] >= var9 - var35 && MilliTimer.localPlayer.pathX[0] <= var9 + var35 && MilliTimer.localPlayer.pathY[0] >= var10 - var35 && MilliTimer.localPlayer.pathY[0] <= var35 + var10 && Client.field827 != 0 && var3 > 0 && Client.queuedSoundEffectCount < 50) {
                     Client.queuedSoundEffectIDs[Client.queuedSoundEffectCount] = var4;
                     Client.unknownSoundValues1[Client.queuedSoundEffectCount] = var3;
                     Client.unknownSoundValues2[Client.queuedSoundEffectCount] = var6;
                     Client.audioEffects[Client.queuedSoundEffectCount] = null;
                     Client.soundLocations[Client.queuedSoundEffectCount] = var7 + (var10 << 8) + (var9 << 16);
                     ++Client.queuedSoundEffectCount;
                  }
               }
            }

            if(class171.field2271 == var0) {
               var8 = var1.method3765();
               var2 = var1.readUnsignedByte();
               var7 = var1.method3609();
               var3 = var1.method3676();
               var4 = var1.readUnsignedByte() * 4;
               var14 = var1.method3676();
               var9 = var1.method3553() * 4;
               var10 = var1.method3597();
               var35 = (var10 >> 4 & 7) + field545;
               var11 = (var10 & 7) + Script.field1219;
               int var36 = var1.method3553();
               var17 = var1.method3765();
               var13 = var1.readUnsignedShort();
               var12 = var17 + var35;
               var6 = var8 + var11;
               if(var35 >= 0 && var11 >= 0 && var35 < 104 && var11 < 104 && var12 >= 0 && var6 >= 0 && var12 < 104 && var6 < 104 && var13 != 65535) {
                  var35 = var35 * 128 + 64;
                  var11 = var11 * 128 + 64;
                  var12 = var12 * 128 + 64;
                  var6 = var6 * 128 + 64;
                  Projectile var40 = new Projectile(var13, class192.plane, var35, var11, class264.getTileHeight(var35, var11, class192.plane) - var9, var14 + Client.gameCycle, var3 + Client.gameCycle, var36, var2, var7, var4);
                  var40.moveProjectile(var12, var6, class264.getTileHeight(var12, var6, class192.plane) - var4, var14 + Client.gameCycle);
                  Client.projectiles.addFront(var40);
               }
            } else if(class171.field2275 == var0) {
               var6 = var1.readUnsignedByte();
               var2 = (var6 >> 4 & 7) + field545;
               var7 = (var6 & 7) + Script.field1219;
               var3 = var1.readUnsignedShort();
               var4 = var1.method3553();
               var14 = var4 >> 2;
               var9 = var4 & 3;
               var10 = Client.field653[var14];
               if(var2 >= 0 && var7 >= 0 && var2 < 104 && var7 < 104) {
                  class222.method4447(class192.plane, var2, var7, var10, var3, var14, var9, 0, -1);
               }
            } else if(class171.field2270 == var0) {
               var6 = var1.readUnsignedShortOb1();
               var2 = (var6 >> 4 & 7) + field545;
               var7 = (var6 & 7) + Script.field1219;
               var3 = var1.method3784();
               var4 = var1.readUnsignedShortOb1();
               var14 = var4 >> 2;
               var9 = var4 & 3;
               var10 = Client.field653[var14];
               if(var2 >= 0 && var7 >= 0 && var2 < 103 && var7 < 103) {
                  if(var10 == 0) {
                     WallObject var37 = ScriptEvent.region.method3049(class192.plane, var2, var7);
                     if(var37 != null) {
                        var11 = class8.method93(var37.hash);
                        if(var14 == 2) {
                           var37.renderable1 = new DynamicObject(var11, 2, var9 + 4, class192.plane, var2, var7, var3, false, var37.renderable1);
                           var37.renderable2 = new DynamicObject(var11, 2, var9 + 1 & 3, class192.plane, var2, var7, var3, false, var37.renderable2);
                        } else {
                           var37.renderable1 = new DynamicObject(var11, var14, var9, class192.plane, var2, var7, var3, false, var37.renderable1);
                        }
                     }
                  }

                  if(var10 == 1) {
                     DecorativeObject var38 = ScriptEvent.region.method2924(class192.plane, var2, var7);
                     if(var38 != null) {
                        var11 = class8.method93(var38.hash);
                        if(var14 != 4 && var14 != 5) {
                           if(var14 == 6) {
                              var38.renderable1 = new DynamicObject(var11, 4, var9 + 4, class192.plane, var2, var7, var3, false, var38.renderable1);
                           } else if(var14 == 7) {
                              var38.renderable1 = new DynamicObject(var11, 4, (var9 + 2 & 3) + 4, class192.plane, var2, var7, var3, false, var38.renderable1);
                           } else if(var14 == 8) {
                              var38.renderable1 = new DynamicObject(var11, 4, var9 + 4, class192.plane, var2, var7, var3, false, var38.renderable1);
                              var38.renderable2 = new DynamicObject(var11, 4, (var9 + 2 & 3) + 4, class192.plane, var2, var7, var3, false, var38.renderable2);
                           }
                        } else {
                           var38.renderable1 = new DynamicObject(var11, 4, var9, class192.plane, var2, var7, var3, false, var38.renderable1);
                        }
                     }
                  }

                  if(var10 == 2) {
                     GameObject var39 = ScriptEvent.region.method2925(class192.plane, var2, var7);
                     if(var14 == 11) {
                        var14 = 10;
                     }

                     if(var39 != null) {
                        var39.renderable = new DynamicObject(class8.method93(var39.hash), var14, var9, class192.plane, var2, var7, var3, false, var39.renderable);
                     }
                  }

                  if(var10 == 3) {
                     GroundObject var42 = ScriptEvent.region.getFloorDecoration(class192.plane, var2, var7);
                     if(var42 != null) {
                        var42.renderable = new DynamicObject(class8.method93(var42.hash), 22, var9, class192.plane, var2, var7, var3, false, var42.renderable);
                     }
                  }
               }
            } else if(class171.field2268 == var0) {
               var6 = var1.method3597();
               var2 = (var6 >> 4 & 7) + field545;
               var7 = (var6 & 7) + Script.field1219;
               var3 = var1.method3676();
               var4 = var1.readUnsignedShort();
               var14 = var1.readUnsignedShortOb1();
               if(var2 >= 0 && var7 >= 0 && var2 < 104 && var7 < 104) {
                  var2 = var2 * 128 + 64;
                  var7 = var7 * 128 + 64;
                  GraphicsObject var43 = new GraphicsObject(var3, class192.plane, var2, var7, class264.getTileHeight(var2, var7, class192.plane) - var14, var4, Client.gameCycle);
                  Client.graphicsObjectDeque.addFront(var43);
               }
            } else if(class171.field2273 == var0) {
               var6 = var1.method3784();
               var2 = var1.method3562();
               var7 = var1.readUnsignedByte();
               var3 = (var7 >> 4 & 7) + field545;
               var4 = (var7 & 7) + Script.field1219;
               var14 = var1.readUnsignedShort();
               if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  Deque var44 = Client.groundItemDeque[class192.plane][var3][var4];
                  if(var44 != null) {
                     for(Item var41 = (Item)var44.getFront(); var41 != null; var41 = (Item)var44.getNext()) {
                        if((var2 & 32767) == var41.id && var14 == var41.quantity) {
                           var41.quantity = var6;
                           break;
                        }
                     }

                     class171.groundItemSpawned(var3, var4);
                  }
               }
            }
         }
      }

   }
}
