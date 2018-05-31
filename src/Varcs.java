import java.io.EOFException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Varcs")
public class Varcs {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   @Export("SpotAnimationDefinition_modelIndexCache")
   static IndexDataBase SpotAnimationDefinition_modelIndexCache;
   @ObfuscatedName("q")
   @Export("varcSerials")
   boolean[] varcSerials;
   @ObfuscatedName("b")
   @Export("varcstringSerials")
   boolean[] varcstringSerials;
   @ObfuscatedName("f")
   @Export("varCInts")
   int[] varCInts;
   @ObfuscatedName("n")
   @Export("varCStrings")
   String[] varCStrings;
   @ObfuscatedName("h")
   @Export("changed")
   boolean changed;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 2432140607770714695L
   )
   long field1199;

   Varcs() {
      this.changed = false;
      this.varCInts = new int[class9.configsIndex.fileCount(19)];
      this.varCStrings = new String[class9.configsIndex.fileCount(15)];
      this.varcSerials = new boolean[this.varCInts.length];

      int var1;
      for(var1 = 0; var1 < this.varCInts.length; ++var1) {
         VarCInt var2 = ItemComposition.method5162(var1);
         this.varcSerials[var1] = var2.field3280;
      }

      this.varcstringSerials = new boolean[this.varCStrings.length];

      for(var1 = 0; var1 < this.varCStrings.length; ++var1) {
         VarCString var5 = (VarCString)VarCString.field3285.get((long)var1);
         VarCString var3;
         if(var5 != null) {
            var3 = var5;
         } else {
            byte[] var4 = VarCString.field3283.getConfigData(15, var1);
            var5 = new VarCString();
            if(var4 != null) {
               var5.method4856(new Buffer(var4));
            }

            VarCString.field3285.put(var5, (long)var1);
            var3 = var5;
         }

         this.varcstringSerials[var1] = var3.field3284;
      }

      for(var1 = 0; var1 < this.varCInts.length; ++var1) {
         this.varCInts[var1] = -1;
      }

      this.deserialize();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1690799990"
   )
   @Export("putVarc")
   void putVarc(int var1, int var2) {
      this.varCInts[var1] = var2;
      if(this.varcSerials[var1]) {
         this.changed = true;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-142550563"
   )
   @Export("getVarc")
   int getVarc(int var1) {
      return this.varCInts[var1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)V",
      garbageValue = "-70"
   )
   @Export("putVarcString")
   void putVarcString(int var1, String var2) {
      this.varCStrings[var1] = var2;
      if(this.varcstringSerials[var1]) {
         this.changed = true;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-832363602"
   )
   @Export("getVarcString")
   String getVarcString(int var1) {
      return this.varCStrings[var1];
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "6"
   )
   @Export("reset")
   void reset() {
      int var1;
      for(var1 = 0; var1 < this.varCInts.length; ++var1) {
         if(!this.varcSerials[var1]) {
            this.varCInts[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.varCStrings.length; ++var1) {
         if(!this.varcstringSerials[var1]) {
            this.varCStrings[var1] = null;
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ZI)Ldw;",
      garbageValue = "694169563"
   )
   @Export("getVarPrefs")
   FileOnDisk getVarPrefs(boolean var1) {
      return class240.getPreferencesFile("2", LoginPacket.field2265.name, var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1372754296"
   )
   @Export("serialize")
   void serialize() {
      FileOnDisk var1 = this.getVarPrefs(true);

      try {
         int var2 = 3;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.varCInts.length; ++var4) {
            if(this.varcSerials[var4] && this.varCInts[var4] != -1) {
               var2 += 6;
               ++var3;
            }
         }

         var2 += 2;
         var4 = 0;

         for(int var5 = 0; var5 < this.varCStrings.length; ++var5) {
            if(this.varcstringSerials[var5] && this.varCStrings[var5] != null) {
               var2 += 2 + Size.getLength(this.varCStrings[var5]);
               ++var4;
            }
         }

         Buffer var17 = new Buffer(var2);
         var17.putByte(1);
         var17.putShort(var3);

         int var6;
         for(var6 = 0; var6 < this.varCInts.length; ++var6) {
            if(this.varcSerials[var6] && this.varCInts[var6] != -1) {
               var17.putShort(var6);
               var17.putInt(this.varCInts[var6]);
            }
         }

         var17.putShort(var4);

         for(var6 = 0; var6 < this.varCStrings.length; ++var6) {
            if(this.varcstringSerials[var6] && this.varCStrings[var6] != null) {
               var17.putShort(var6);
               var17.putString(this.varCStrings[var6]);
            }
         }

         var1.write(var17.payload, 0, var17.offset);
      } catch (Exception var15) {
         ;
      } finally {
         try {
            var1.close();
         } catch (Exception var14) {
            ;
         }

      }

      this.changed = false;
      this.field1199 = class166.method3456();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-918064895"
   )
   @Export("deserialize")
   void deserialize() {
      FileOnDisk var1 = this.getVarPrefs(false);

      label197: {
         try {
            byte[] var2 = new byte[(int)var1.length()];

            int var3;
            for(int var4 = 0; var4 < var2.length; var4 += var3) {
               var3 = var1.read(var2, var4, var2.length - var4);
               if(var3 == -1) {
                  throw new EOFException();
               }
            }

            Buffer var23 = new Buffer(var2);
            if(var23.payload.length - var23.offset >= 1) {
               int var5 = var23.readUnsignedByte();
               if(var5 >= 0 && var5 <= 1) {
                  int var6 = var23.readUnsignedShort();

                  int var7;
                  int var8;
                  int var9;
                  for(var7 = 0; var7 < var6; ++var7) {
                     var8 = var23.readUnsignedShort();
                     var9 = var23.readInt();
                     if(this.varcSerials[var8]) {
                        this.varCInts[var8] = var9;
                     }
                  }

                  var7 = var23.readUnsignedShort();
                  var8 = 0;

                  while(true) {
                     if(var8 >= var7) {
                        break label197;
                     }

                     var9 = var23.readUnsignedShort();
                     String var10 = var23.readString();
                     if(this.varcstringSerials[var9]) {
                        this.varCStrings[var9] = var10;
                     }

                     ++var8;
                  }
               }

               return;
            }
         } catch (Exception var21) {
            break label197;
         } finally {
            try {
               var1.close();
            } catch (Exception var20) {
               ;
            }

         }

         return;
      }

      this.changed = false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-684314641"
   )
   @Export("process")
   void process() {
      if(this.changed && this.field1199 < class166.method3456() - 60000L) {
         this.serialize();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "7"
   )
   @Export("changed")
   boolean changed() {
      return this.changed;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "-82"
   )
   static int method1943(int var0, Script var1, boolean var2) {
      Widget var3 = var2?class184.field2379:FriendManager.field996;
      if(var0 == 1500) {
         class69.intStack[++class45.intStackSize - 1] = var3.relativeX;
         return 1;
      } else if(var0 == 1501) {
         class69.intStack[++class45.intStackSize - 1] = var3.relativeY;
         return 1;
      } else if(var0 == 1502) {
         class69.intStack[++class45.intStackSize - 1] = var3.width;
         return 1;
      } else if(var0 == 1503) {
         class69.intStack[++class45.intStackSize - 1] = var3.height;
         return 1;
      } else if(var0 == 1504) {
         class69.intStack[++class45.intStackSize - 1] = var3.isHidden?1:0;
         return 1;
      } else if(var0 == 1505) {
         class69.intStack[++class45.intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Lkr;Lkr;B)V",
      garbageValue = "113"
   )
   static void method1960(Font var0, Font var1) {
      if(ScriptState.field469 == null) {
         ScriptState.field469 = MapIconReference.getSprites(class59.indexSprites, "sl_back", "");
      }

      if(class13.slFlagSprites == null) {
         class13.slFlagSprites = class278.getIndexedSprites(class59.indexSprites, "sl_flags", "");
      }

      if(PacketBuffer.slArrowSprites == null) {
         PacketBuffer.slArrowSprites = class278.getIndexedSprites(class59.indexSprites, "sl_arrows", "");
      }

      if(class9.slStarSprites == null) {
         class9.slStarSprites = class278.getIndexedSprites(class59.indexSprites, "sl_stars", "");
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(class78.field1104, 23, 765, 480, 0);
      Rasterizer2D.method5811(class78.field1104, 0, 125, 23, 12425273, 9135624);
      Rasterizer2D.method5811(class78.field1104 + 125, 0, 640, 23, 5197647, 2697513);
      var0.drawTextCentered("Select a world", class78.field1104 + 62, 15, 0, -1);
      if(class9.slStarSprites != null) {
         class9.slStarSprites[1].method5873(class78.field1104 + 140, 1);
         var1.method5541("Members only world", class78.field1104 + 152, 10, 16777215, -1);
         class9.slStarSprites[0].method5873(class78.field1104 + 140, 12);
         var1.method5541("Free world", class78.field1104 + 152, 21, 16777215, -1);
      }

      int var2;
      int var3;
      if(PacketBuffer.slArrowSprites != null) {
         int var4 = class78.field1104 + 280;
         if(World.field958[0] == 0 && World.field969[0] == 0) {
            PacketBuffer.slArrowSprites[2].method5873(var4, 4);
         } else {
            PacketBuffer.slArrowSprites[0].method5873(var4, 4);
         }

         if(World.field958[0] == 0 && World.field969[0] == 1) {
            PacketBuffer.slArrowSprites[3].method5873(var4 + 15, 4);
         } else {
            PacketBuffer.slArrowSprites[1].method5873(var4 + 15, 4);
         }

         var0.method5541("World", var4 + 32, 17, 16777215, -1);
         int var5 = class78.field1104 + 390;
         if(World.field958[0] == 1 && World.field969[0] == 0) {
            PacketBuffer.slArrowSprites[2].method5873(var5, 4);
         } else {
            PacketBuffer.slArrowSprites[0].method5873(var5, 4);
         }

         if(World.field958[0] == 1 && World.field969[0] == 1) {
            PacketBuffer.slArrowSprites[3].method5873(var5 + 15, 4);
         } else {
            PacketBuffer.slArrowSprites[1].method5873(var5 + 15, 4);
         }

         var0.method5541("Players", var5 + 32, 17, 16777215, -1);
         var2 = class78.field1104 + 500;
         if(World.field958[0] == 2 && World.field969[0] == 0) {
            PacketBuffer.slArrowSprites[2].method5873(var2, 4);
         } else {
            PacketBuffer.slArrowSprites[0].method5873(var2, 4);
         }

         if(World.field958[0] == 2 && World.field969[0] == 1) {
            PacketBuffer.slArrowSprites[3].method5873(var2 + 15, 4);
         } else {
            PacketBuffer.slArrowSprites[1].method5873(var2 + 15, 4);
         }

         var0.method5541("Location", var2 + 32, 17, 16777215, -1);
         var3 = class78.field1104 + 610;
         if(World.field958[0] == 3 && World.field969[0] == 0) {
            PacketBuffer.slArrowSprites[2].method5873(var3, 4);
         } else {
            PacketBuffer.slArrowSprites[0].method5873(var3, 4);
         }

         if(World.field958[0] == 3 && World.field969[0] == 1) {
            PacketBuffer.slArrowSprites[3].method5873(var3 + 15, 4);
         } else {
            PacketBuffer.slArrowSprites[1].method5873(var3 + 15, 4);
         }

         var0.method5541("Type", var3 + 32, 17, 16777215, -1);
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(class78.field1104 + 708, 4, 50, 16, 0);
      var1.drawTextCentered("Cancel", class78.field1104 + 708 + 25, 16, 16777215, -1);
      class78.field1137 = -1;
      if(ScriptState.field469 != null) {
         byte var20 = 88;
         byte var21 = 19;
         var2 = 765 / (var20 + 1);
         var3 = 480 / (var21 + 1);

         int var6;
         int var7;
         do {
            var6 = var3;
            var7 = var2;
            if(var3 * (var2 - 1) >= World.worldCount) {
               --var2;
            }

            if(var2 * (var3 - 1) >= World.worldCount) {
               --var3;
            }

            if(var2 * (var3 - 1) >= World.worldCount) {
               --var3;
            }
         } while(var3 != var6 || var2 != var7);

         var6 = (765 - var2 * var20) / (var2 + 1);
         if(var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var3 * var21) / (var3 + 1);
         if(var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var2 * var20 - var6 * (var2 - 1)) / 2;
         int var9 = (480 - var21 * var3 - var7 * (var3 - 1)) / 2;
         int var10 = var9 + 23;
         int var11 = var8 + class78.field1104;
         int var12 = 0;
         boolean var13 = false;

         int var14;
         for(var14 = 0; var14 < World.worldCount; ++var14) {
            World var15 = class143.worldList[var14];
            boolean var16 = true;
            String var17 = Integer.toString(var15.playerCount);
            if(var15.playerCount == -1) {
               var17 = "OFF";
               var16 = false;
            } else if(var15.playerCount > 1980) {
               var17 = "FULL";
               var16 = false;
            }

            int var18 = 0;
            byte var19;
            if(var15.method1607()) {
               if(var15.method1603()) {
                  var19 = 7;
               } else {
                  var19 = 6;
               }
            } else if(var15.method1639()) {
               var18 = 16711680;
               if(var15.method1603()) {
                  var19 = 5;
               } else {
                  var19 = 4;
               }
            } else if(var15.method1605()) {
               if(var15.method1603()) {
                  var19 = 3;
               } else {
                  var19 = 2;
               }
            } else if(var15.method1603()) {
               var19 = 1;
            } else {
               var19 = 0;
            }

            if(MouseInput.mouseLastX >= var11 && MouseInput.mouseLastY >= var10 && MouseInput.mouseLastX < var20 + var11 && MouseInput.mouseLastY < var10 + var21 && var16) {
               class78.field1137 = var14;
               ScriptState.field469[var19].method5916(var11, var10, 128, 16777215);
               var13 = true;
            } else {
               ScriptState.field469[var19].method5893(var11, var10);
            }

            if(class13.slFlagSprites != null) {
               class13.slFlagSprites[(var15.method1603()?8:0) + var15.location].method5873(var11 + 29, var10);
            }

            var0.drawTextCentered(Integer.toString(var15.id), var11 + 15, var21 / 2 + var10 + 5, var18, -1);
            var1.drawTextCentered(var17, var11 + 60, var21 / 2 + var10 + 5, 268435455, -1);
            var10 = var10 + var21 + var7;
            ++var12;
            if(var12 >= var3) {
               var10 = var9 + 23;
               var11 = var11 + var6 + var20;
               var12 = 0;
            }
         }

         if(var13) {
            var14 = var1.getTextWidth(class143.worldList[class78.field1137].activity) + 6;
            int var22 = var1.verticalSpace + 8;
            Rasterizer2D.Rasterizer2D_fillRectangle(MouseInput.mouseLastX - var14 / 2, MouseInput.mouseLastY + 20 + 5, var14, var22, 16777120);
            Rasterizer2D.drawRectangle(MouseInput.mouseLastX - var14 / 2, MouseInput.mouseLastY + 20 + 5, var14, var22, 0);
            var1.drawTextCentered(class143.worldList[class78.field1137].activity, MouseInput.mouseLastX, MouseInput.mouseLastY + var1.verticalSpace + 20 + 5 + 4, 0, -1);
         }
      }

      class50.rasterProvider.drawFull(0, 0);
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "292053091"
   )
   static final void method1959() {
      Client.field739.close();
      WidgetNode.method1074();
      ScriptEvent.region.reset();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.collisionMaps[var0].reset();
      }

      System.gc();
      ISAACCipher.method3911(2);
      Client.field824 = -1;
      Client.field825 = false;
      class59.method1126();
      Resampler.setGameState(10);
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1469338263"
   )
   static final void method1932() {
      for(Projectile var0 = (Projectile)Client.projectiles.getFront(); var0 != null; var0 = (Projectile)Client.projectiles.getNext()) {
         if(var0.floor == class192.plane && Client.gameCycle <= var0.endCycle) {
            if(Client.gameCycle >= var0.startMovementCycle) {
               if(var0.interacting > 0) {
                  NPC var1 = Client.cachedNPCs[var0.interacting - 1];
                  if(var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
                     var0.moveProjectile(var1.x, var1.y, class264.getTileHeight(var1.x, var1.y, var0.floor) - var0.endHeight, Client.gameCycle);
                  }
               }

               if(var0.interacting < 0) {
                  int var3 = -var0.interacting - 1;
                  Player var2;
                  if(var3 == Client.localInteractingIndex) {
                     var2 = MilliTimer.localPlayer;
                  } else {
                     var2 = Client.cachedPlayers[var3];
                  }

                  if(var2 != null && var2.x >= 0 && var2.x < 13312 && var2.y >= 0 && var2.y < 13312) {
                     var0.moveProjectile(var2.x, var2.y, class264.getTileHeight(var2.x, var2.y, var0.floor) - var0.endHeight, Client.gameCycle);
                  }
               }

               var0.update(Client.field654);
               ScriptEvent.region.method2945(class192.plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.rotationX, -1L, false);
            }
         } else {
            var0.unlink();
         }
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(Lbu;IIIB)V",
      garbageValue = "50"
   )
   static final void method1942(Player var0, int var1, int var2, int var3) {
      if(MilliTimer.localPlayer != var0 && Client.menuOptionCount < 400) {
         String var4;
         if(var0.totalLevel == 0) {
            var4 = var0.actions[0] + var0.name + var0.actions[1] + class32.method598(var0.combatLevel, MilliTimer.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
         } else {
            var4 = var0.actions[0] + var0.name + var0.actions[1] + " " + " (" + "skill-" + var0.totalLevel + ")" + var0.actions[2];
         }

         int var5;
         if(Client.itemSelectionState == 1) {
            VertexNormal.addMenuEntry("Use", Client.lastSelectedItemName + " " + "->" + " " + class50.getColTags(16777215) + var4, 14, var1, var2, var3);
         } else if(Client.spellSelected) {
            if((class45.field373 & 8) == 8) {
               VertexNormal.addMenuEntry(Client.field750, Client.field751 + " " + "->" + " " + class50.getColTags(16777215) + var4, 15, var1, var2, var3);
            }
         } else {
            for(var5 = 7; var5 >= 0; --var5) {
               if(Client.playerOptions[var5] != null) {
                  short var6 = 0;
                  if(Client.playerOptions[var5].equalsIgnoreCase("Attack")) {
                     if(Client.playerAttackOption == AttackOption.AttackOption_hidden) {
                        continue;
                     }

                     if(AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > MilliTimer.localPlayer.combatLevel) {
                        var6 = 2000;
                     }

                     if(MilliTimer.localPlayer.team != 0 && var0.team != 0) {
                        if(var0.team == MilliTimer.localPlayer.team) {
                           var6 = 2000;
                        } else {
                           var6 = 0;
                        }
                     }
                  } else if(Client.playerOptionsPriorities[var5]) {
                     var6 = 2000;
                  }

                  boolean var7 = false;
                  int var8 = Client.playerMenuTypes[var5] + var6;
                  VertexNormal.addMenuEntry(Client.playerOptions[var5], class50.getColTags(16777215) + var4, var8, var1, var2, var3);
               }
            }
         }

         for(var5 = 0; var5 < Client.menuOptionCount; ++var5) {
            if(Client.menuTypes[var5] == 23) {
               Client.menuTargets[var5] = class50.getColTags(16777215) + var4;
               break;
            }
         }
      }

   }
}
