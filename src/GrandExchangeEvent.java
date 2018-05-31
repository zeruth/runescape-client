import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
   @ObfuscatedName("pl")
   @ObfuscatedSignature(
      signature = "Lcc;"
   )
   @Export("soundSystem0")
   static AbstractSoundSystem soundSystem0;
   @ObfuscatedName("pz")
   @ObfuscatedGetter(
      intValue = -881463437
   )
   static int field19;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -842420131
   )
   @Export("world")
   public final int world;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = 2380918939930674867L
   )
   public final long field10;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lf;"
   )
   @Export("grandExchangeOffer")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("b")
   @Export("string1")
   String string1;
   @ObfuscatedName("f")
   @Export("string2")
   String string2;

   @ObfuscatedSignature(
      signature = "(Lgy;BI)V"
   )
   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.string1 = var1.readString();
      this.string2 = var1.readString();
      this.world = var1.readUnsignedShort();
      this.field10 = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method52(2);
      this.grandExchangeOffer.method36(var2);
      this.grandExchangeOffer.price = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.quantitySold = 0;
      this.grandExchangeOffer.spent = 0;
      this.grandExchangeOffer.itemId = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(S)Ljava/lang/String;",
      garbageValue = "255"
   )
   public String method16() {
      return this.string1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-1"
   )
   public String method17() {
      return this.string2;
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(ZLge;B)V",
      garbageValue = "0"
   )
   @Hook("onNpcUpdate")
   @Export("updateNpcs")
   static final void updateNpcs(boolean var0, PacketBuffer var1) {
      Client.field713 = 0;
      Client.pendingNpcFlagsCount = 0;
      PacketBuffer var2 = Client.field739.packetBuffer;
      var2.bitAccess();
      int var3 = var2.getBits(8);
      int var4;
      if (var3 < Client.npcIndexesCount) {
         for(var4 = var3; var4 < Client.npcIndexesCount; ++var4) {
            Client.field714[++Client.field713 - 1] = Client.npcIndices[var4];
         }
      }

      if (var3 > Client.npcIndexesCount) {
         throw new RuntimeException("");
      } else {
         Client.npcIndexesCount = 0;

         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = Client.npcIndices[var4];
            NPC var11 = Client.cachedNPCs[var5];
            var6 = var2.getBits(1);
            if (var6 == 0) {
               Client.npcIndices[++Client.npcIndexesCount - 1] = var5;
               var11.npcCycle = Client.gameCycle;
            } else {
               var7 = var2.getBits(2);
               if (var7 == 0) {
                  Client.npcIndices[++Client.npcIndexesCount - 1] = var5;
                  var11.npcCycle = Client.gameCycle;
                  Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var5;
               } else if (var7 == 1) {
                  Client.npcIndices[++Client.npcIndexesCount - 1] = var5;
                  var11.npcCycle = Client.gameCycle;
                  var8 = var2.getBits(3);
                  var11.method1824(var8, (byte)1);
                  var9 = var2.getBits(1);
                  if (var9 == 1) {
                     Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var5;
                  }
               } else if (var7 == 2) {
                  Client.npcIndices[++Client.npcIndexesCount - 1] = var5;
                  var11.npcCycle = Client.gameCycle;
                  var8 = var2.getBits(3);
                  var11.method1824(var8, (byte)2);
                  var9 = var2.getBits(3);
                  var11.method1824(var9, (byte)2);
                  var10 = var2.getBits(1);
                  if (var10 == 1) {
                     Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var5;
                  }
               } else if (var7 == 3) {
                  Client.field714[++Client.field713 - 1] = var5;
               }
            }
         }

         Frames.method3096(var0, var1);

         int var16;
         for(var16 = 0; var16 < Client.pendingNpcFlagsCount; ++var16) {
            var3 = Client.pendingNpcFlagsIndices[var16];
            NPC var12 = Client.cachedNPCs[var3];
            var5 = var1.readUnsignedByte();
            if ((var5 & 2) != 0) {
               var12.interacting = var1.method3784();
               if (var12.interacting == 65535) {
                  var12.interacting = -1;
               }
            }

            int var13;
            if ((var5 & 32) != 0) {
               var13 = var1.method3597();
               int var14;
               if (var13 > 0) {
                  for(var6 = 0; var6 < var13; ++var6) {
                     var8 = -1;
                     var9 = -1;
                     var10 = -1;
                     var7 = var1.getUSmart();
                     if (var7 == 32767) {
                        var7 = var1.getUSmart();
                        var9 = var1.getUSmart();
                        var8 = var1.getUSmart();
                        var10 = var1.getUSmart();
                     } else if (var7 != 32766) {
                        var9 = var1.getUSmart();
                     } else {
                        var7 = -1;
                     }

                     var14 = var1.getUSmart();
                     var12.applyActorHitsplat(var7, var9, var8, var10, Client.gameCycle, var14);
                  }
               }

               var6 = var1.method3553();
               if (var6 > 0) {
                  for(var7 = 0; var7 < var6; ++var7) {
                     var8 = var1.getUSmart();
                     var9 = var1.getUSmart();
                     if (var9 != 32767) {
                        var10 = var1.getUSmart();
                        var14 = var1.method3553();
                        int var15 = var9 > 0 ? var1.method3553() : var14;
                        var12.setCombatInfo(var8, Client.gameCycle, var9, var10, var14, var15);
                     } else {
                        var12.method1579(var8);
                     }
                  }
               }
            }

            if ((var5 & 8) != 0) {
               var13 = var1.readUnsignedShort();
               var6 = var1.method3784();
               var7 = var12.x - (var13 - class178.baseX - class178.baseX) * 64;
               var8 = var12.y - (var6 - CombatInfoListHolder.baseY - CombatInfoListHolder.baseY) * 64;
               if (var7 != 0 || var8 != 0) {
                  var12.field897 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
               }
            }

            if ((var5 & 16) != 0) {
               var12.graphic = var1.readUnsignedShort();
               var13 = var1.method3618();
               var12.field924 = var13 >> 16;
               var12.graphicsDelay = (var13 & '\uffff') + Client.gameCycle;
               var12.spotAnimFrame = 0;
               var12.spotAnimFrameCycle = 0;
               if (var12.graphicsDelay > Client.gameCycle) {
                  var12.spotAnimFrame = -1;
               }

               if (var12.graphic == 65535) {
                  var12.graphic = -1;
               }
            }

            if ((var5 & 4) != 0) {
               var13 = var1.method3676();
               if (var13 == 65535) {
                  var13 = -1;
               }

               var6 = var1.method3597();
               if (var13 == var12.animation && var13 != -1) {
                  var7 = class137.getAnimation(var13).replyMode;
                  if (var7 == 1) {
                     var12.actionFrame = 0;
                     var12.actionFrameCycle = 0;
                     var12.actionAnimationDisable = var6;
                     var12.field919 = 0;
                  }

                  if (var7 == 2) {
                     var12.field919 = 0;
                  }
               } else if (var13 == -1 || var12.animation == -1 || class137.getAnimation(var13).forcedPriority >= class137.getAnimation(var12.animation).forcedPriority) {
                  var12.animation = var13;
                  var12.actionFrame = 0;
                  var12.actionFrameCycle = 0;
                  var12.actionAnimationDisable = var6;
                  var12.field919 = 0;
                  var12.field942 = var12.queueSize;
               }
            }

            if ((var5 & 64) != 0) {
               var12.composition = class59.getNpcDefinition(var1.readUnsignedShort());
               var12.field885 = var12.composition.size;
               var12.field929 = var12.composition.rotation;
               var12.field890 = var12.composition.walkingAnimation;
               var12.field891 = var12.composition.rotate180Animation;
               var12.field882 = var12.composition.rotate90RightAnimation;
               var12.field893 = var12.composition.rotate90LeftAnimation;
               var12.idlePoseAnimation = var12.composition.standingAnimation;
               var12.field892 = var12.composition.field3509;
               var12.field889 = var12.composition.field3499;
            }

            if ((var5 & 1) != 0) {
               var12.overhead = var1.readString();
               var12.overheadTextCyclesRemaining = 100;
            }
         }

         for(var16 = 0; var16 < Client.field713; ++var16) {
            var3 = Client.field714[var16];
            if (Client.cachedNPCs[var3].npcCycle != Client.gameCycle) {
               Client.cachedNPCs[var3].composition = null;
               Client.cachedNPCs[var3] = null;
            }
         }

         if (var1.offset != Client.field739.packetLength) {
            throw new RuntimeException(var1.offset + "," + Client.field739.packetLength);
         } else {
            for(var16 = 0; var16 < Client.npcIndexesCount; ++var16) {
               if (Client.cachedNPCs[Client.npcIndices[var16]] == null) {
                  throw new RuntimeException(var16 + "," + Client.npcIndexesCount);
               }
            }

         }
      }
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      signature = "([Lhl;IIIIIIII)V",
      garbageValue = "-59285692"
   )
   static final void method25(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Widget var9 = var0[var8];
         if (var9 != null && (!var9.hasScript || var9.type == 0 || var9.hasListener || AbstractSoundSystem.getWidgetClickMask(var9) != 0 || var9 == Client.field639 || var9.contentType == 1338) && var9.parentId == var1) {
            if (var9.hasScript) {
               boolean var10 = var9.isHidden;
               if (var10) {
                  continue;
               }
            }

            int var30 = var9.relativeX + var6;
            int var11 = var7 + var9.relativeY;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var19;
            if (var9.type == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else if (var9.type == 9) {
               var16 = var30;
               var17 = var11;
               int var18 = var30 + var9.width;
               var19 = var11 + var9.height;
               if (var18 < var30) {
                  var16 = var18;
                  var18 = var30;
               }

               if (var19 < var11) {
                  var17 = var19;
                  var19 = var11;
               }

               ++var18;
               ++var19;
               var12 = var16 > var2 ? var16 : var2;
               var13 = var17 > var3 ? var17 : var3;
               var14 = var18 < var4 ? var18 : var4;
               var15 = var19 < var5 ? var19 : var5;
            } else {
               var16 = var30 + var9.width;
               var17 = var11 + var9.height;
               var12 = var30 > var2 ? var30 : var2;
               var13 = var11 > var3 ? var11 : var3;
               var14 = var16 < var4 ? var16 : var4;
               var15 = var17 < var5 ? var17 : var5;
            }

            if (var9 == Client.draggedWidget) {
               Client.field860 = true;
               Client.field772 = var30;
               Client.field773 = var11;
            }

            if (!var9.hasScript || var12 < var14 && var13 < var15) {
               var16 = MouseInput.mouseLastX;
               var17 = MouseInput.mouseLastY;
               if (MouseInput.mouseLastButton != 0) {
                  var16 = MouseInput.mouseLastPressedX;
                  var17 = MouseInput.mouseLastPressedY;
               }

               boolean var31 = var16 >= var12 && var17 >= var13 && var16 < var14 && var17 < var15;
               if (var9.contentType == 1337) {
                  if (!Client.field603 && !Client.isMenuOpen && var31) {
                     BuildType.method4609(var16, var17, var12, var13);
                  }
               } else {
                  int var20;
                  int var21;
                  int var22;
                  if (var9.contentType == 1338) {
                     if ((Client.field822 == 0 || Client.field822 == 3) && (MouseInput.mouseLastButton == 1 || !class8.middleMouseMovesCamera && MouseInput.mouseLastButton == 4)) {
                        class224 var33 = var9.method4561(true);
                        if (var33 != null) {
                           var19 = MouseInput.mouseLastPressedX - var30;
                           var22 = MouseInput.mouseLastPressedY - var11;
                           if (var33.method4459(var19, var22)) {
                              var19 -= var33.field2570 / 2;
                              var22 -= var33.field2575 / 2;
                              var20 = Client.mapAngle & 2047;
                              var21 = Graphics3D.SINE[var20];
                              int var34 = Graphics3D.COSINE[var20];
                              int var36 = var34 * var19 + var22 * var21 >> 11;
                              int var39 = var22 * var34 - var21 * var19 >> 11;
                              int var37 = var36 + MilliTimer.localPlayer.x >> 7;
                              int var38 = MilliTimer.localPlayer.y - var39 >> 7;
                              PacketNode var29 = DecorativeObject.method3115(ClientPacket.field2243, Client.field739.field1250);
                              var29.packetBuffer.putByte(18);
                              var29.packetBuffer.method3605(var37 + class178.baseX);
                              var29.packetBuffer.method3707(var38 + CombatInfoListHolder.baseY);
                              var29.packetBuffer.method3596(KeyFocusListener.keyPressed[82] ? (KeyFocusListener.keyPressed[81] ? 2 : 1) : 0);
                              var29.packetBuffer.putByte(var19);
                              var29.packetBuffer.putByte(var22);
                              var29.packetBuffer.putShort(Client.mapAngle);
                              var29.packetBuffer.putByte(57);
                              var29.packetBuffer.putByte(0);
                              var29.packetBuffer.putByte(0);
                              var29.packetBuffer.putByte(89);
                              var29.packetBuffer.putShort(MilliTimer.localPlayer.x);
                              var29.packetBuffer.putShort(MilliTimer.localPlayer.y);
                              var29.packetBuffer.putByte(63);
                              Client.field739.method2019(var29);
                              Client.destinationX = var37;
                              Client.destinationY = var38;
                           }
                        }
                     }
                  } else {
                     if (var9.contentType == 1400) {
                        Preferences.renderOverview.method6162(MouseInput.mouseLastX, MouseInput.mouseLastY, var31, var30, var11, var9.width, var9.height);
                     }

                     if (!Client.isMenuOpen && var31) {
                        if (var9.contentType == 1400) {
                           Preferences.renderOverview.method6216(var30, var11, var9.width, var9.height, var16, var17);
                        } else {
                           MouseInput.method1014(var9, var16 - var30, var17 - var11);
                        }
                     }

                     boolean var23;
                     if (var9.type == 0) {
                        if (!var9.hasScript) {
                           var23 = var9.isHidden;
                           if (var23 && var9 != class37.field329) {
                              continue;
                           }
                        }

                        method25(var0, var9.id, var12, var13, var14, var15, var30 - var9.scrollX, var11 - var9.scrollY);
                        if (var9.children != null) {
                           method25(var9.children, var9.id, var12, var13, var14, var15, var30 - var9.scrollX, var11 - var9.scrollY);
                        }

                        WidgetNode var24 = (WidgetNode)Client.componentTable.get((long)var9.id);
                        if (var24 != null) {
                           if (var24.owner == 0 && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15 && !Client.isMenuOpen) {
                              for(ScriptEvent var25 = (ScriptEvent)Client.field755.getFront(); var25 != null; var25 = (ScriptEvent)Client.field755.getNext()) {
                                 if (var25.boolean1) {
                                    var25.unlink();
                                    var25.source.field2749 = false;
                                 }
                              }

                              if (DecorativeObject.field1860 == 0) {
                                 Client.draggedWidget = null;
                                 Client.field639 = null;
                              }

                              if (!Client.isMenuOpen) {
                                 Actor.method1597();
                              }
                           }

                           var19 = var24.id;
                           if (GameCanvas.loadWidget(var19)) {
                              method25(Widget.widgets[var19], -1, var12, var13, var14, var15, var30, var11);
                           }
                        }
                     }

                     if (var9.hasScript) {
                        ScriptEvent var32;
                        if (!var9.noClickThrough) {
                           if (var9.noScrollThrough && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                              for(var32 = (ScriptEvent)Client.field755.getFront(); var32 != null; var32 = (ScriptEvent)Client.field755.getNext()) {
                                 if (var32.boolean1 && var32.source.onScrollWheelListener == var32.params) {
                                    var32.unlink();
                                 }
                              }
                           }
                        } else if (MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                           for(var32 = (ScriptEvent)Client.field755.getFront(); var32 != null; var32 = (ScriptEvent)Client.field755.getNext()) {
                              if (var32.boolean1) {
                                 var32.unlink();
                                 var32.source.field2749 = false;
                              }
                           }

                           if (DecorativeObject.field1860 == 0) {
                              Client.draggedWidget = null;
                              Client.field639 = null;
                           }

                           if (!Client.isMenuOpen) {
                              Actor.method1597();
                           }
                        }

                        if (MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                           var31 = true;
                        } else {
                           var31 = false;
                        }

                        var23 = false;
                        if ((MouseInput.mouseCurrentButton == 1 || !class8.middleMouseMovesCamera && MouseInput.mouseCurrentButton == 4) && var31) {
                           var23 = true;
                        }

                        boolean var35 = false;
                        if ((MouseInput.mouseLastButton == 1 || !class8.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) && MouseInput.mouseLastPressedX >= var12 && MouseInput.mouseLastPressedY >= var13 && MouseInput.mouseLastPressedX < var14 && MouseInput.mouseLastPressedY < var15) {
                           var35 = true;
                        }

                        if (var35) {
                           class35.method685(var9, MouseInput.mouseLastPressedX - var30, MouseInput.mouseLastPressedY - var11);
                        }

                        if (var9.contentType == 1400) {
                           Preferences.renderOverview.method6051(var16, var17, var31 & var23, var31 & var35);
                        }

                        if (Client.draggedWidget != null && var9 != Client.draggedWidget && var31 && DecorativeObject.method3114(AbstractSoundSystem.getWidgetClickMask(var9))) {
                           Client.draggedOnWidget = var9;
                        }

                        if (var9 == Client.field639) {
                           Client.field594 = true;
                           Client.field769 = var30;
                           Client.field770 = var11;
                        }

                        if (var9.hasListener) {
                           ScriptEvent var26;
                           if (var31 && Client.mouseWheelRotation != 0 && var9.onScrollWheelListener != null) {
                              var26 = new ScriptEvent();
                              var26.boolean1 = true;
                              var26.source = var9;
                              var26.mouseY = Client.mouseWheelRotation;
                              var26.params = var9.onScrollWheelListener;
                              Client.field755.addFront(var26);
                           }

                           if (Client.draggedWidget != null || class49.field442 != null || Client.isMenuOpen) {
                              var35 = false;
                              var23 = false;
                              var31 = false;
                           }

                           if (!var9.field2682 && var35) {
                              var9.field2682 = true;
                              if (var9.onClickListener != null) {
                                 var26 = new ScriptEvent();
                                 var26.boolean1 = true;
                                 var26.source = var9;
                                 var26.mouseX = MouseInput.mouseLastPressedX - var30;
                                 var26.mouseY = MouseInput.mouseLastPressedY - var11;
                                 var26.params = var9.onClickListener;
                                 Client.field755.addFront(var26);
                              }
                           }

                           if (var9.field2682 && var23 && var9.onClickRepeatListener != null) {
                              var26 = new ScriptEvent();
                              var26.boolean1 = true;
                              var26.source = var9;
                              var26.mouseX = MouseInput.mouseLastX - var30;
                              var26.mouseY = MouseInput.mouseLastY - var11;
                              var26.params = var9.onClickRepeatListener;
                              Client.field755.addFront(var26);
                           }

                           if (var9.field2682 && !var23) {
                              var9.field2682 = false;
                              if (var9.onReleaseListener != null) {
                                 var26 = new ScriptEvent();
                                 var26.boolean1 = true;
                                 var26.source = var9;
                                 var26.mouseX = MouseInput.mouseLastX - var30;
                                 var26.mouseY = MouseInput.mouseLastY - var11;
                                 var26.params = var9.onReleaseListener;
                                 Client.field791.addFront(var26);
                              }
                           }

                           if (var23 && var9.onHoldListener != null) {
                              var26 = new ScriptEvent();
                              var26.boolean1 = true;
                              var26.source = var9;
                              var26.mouseX = MouseInput.mouseLastX - var30;
                              var26.mouseY = MouseInput.mouseLastY - var11;
                              var26.params = var9.onHoldListener;
                              Client.field755.addFront(var26);
                           }

                           if (!var9.field2749 && var31) {
                              var9.field2749 = true;
                              if (var9.onMouseOverListener != null) {
                                 var26 = new ScriptEvent();
                                 var26.boolean1 = true;
                                 var26.source = var9;
                                 var26.mouseX = MouseInput.mouseLastX - var30;
                                 var26.mouseY = MouseInput.mouseLastY - var11;
                                 var26.params = var9.onMouseOverListener;
                                 Client.field755.addFront(var26);
                              }
                           }

                           if (var9.field2749 && var31 && var9.onMouseRepeatListener != null) {
                              var26 = new ScriptEvent();
                              var26.boolean1 = true;
                              var26.source = var9;
                              var26.mouseX = MouseInput.mouseLastX - var30;
                              var26.mouseY = MouseInput.mouseLastY - var11;
                              var26.params = var9.onMouseRepeatListener;
                              Client.field755.addFront(var26);
                           }

                           if (var9.field2749 && !var31) {
                              var9.field2749 = false;
                              if (var9.onMouseLeaveListener != null) {
                                 var26 = new ScriptEvent();
                                 var26.boolean1 = true;
                                 var26.source = var9;
                                 var26.mouseX = MouseInput.mouseLastX - var30;
                                 var26.mouseY = MouseInput.mouseLastY - var11;
                                 var26.params = var9.onMouseLeaveListener;
                                 Client.field791.addFront(var26);
                              }
                           }

                           if (var9.onTimerListener != null) {
                              var26 = new ScriptEvent();
                              var26.source = var9;
                              var26.params = var9.onTimerListener;
                              Client.field790.addFront(var26);
                           }

                           ScriptEvent var27;
                           if (var9.onVarTransmitListener != null && Client.pendingVarbitCount > var9.field2752) {
                              if (var9.varTransmitTriggers != null && Client.pendingVarbitCount - var9.field2752 <= 32) {
                                 label517:
                                 for(var22 = var9.field2752; var22 < Client.pendingVarbitCount; ++var22) {
                                    var20 = Client.pendingVarbitChanges[var22 & 31];

                                    for(var21 = 0; var21 < var9.varTransmitTriggers.length; ++var21) {
                                       if (var20 == var9.varTransmitTriggers[var21]) {
                                          var27 = new ScriptEvent();
                                          var27.source = var9;
                                          var27.params = var9.onVarTransmitListener;
                                          Client.field755.addFront(var27);
                                          break label517;
                                       }
                                    }
                                 }
                              } else {
                                 var26 = new ScriptEvent();
                                 var26.source = var9;
                                 var26.params = var9.onVarTransmitListener;
                                 Client.field755.addFront(var26);
                              }

                              var9.field2752 = Client.pendingVarbitCount;
                           }

                           if (var9.onInvTransmitListener != null && Client.field779 > var9.field2753) {
                              if (var9.invTransmitTriggers != null && Client.field779 - var9.field2753 <= 32) {
                                 label493:
                                 for(var22 = var9.field2753; var22 < Client.field779; ++var22) {
                                    var20 = Client.interfaceItemTriggers[var22 & 31];

                                    for(var21 = 0; var21 < var9.invTransmitTriggers.length; ++var21) {
                                       if (var20 == var9.invTransmitTriggers[var21]) {
                                          var27 = new ScriptEvent();
                                          var27.source = var9;
                                          var27.params = var9.onInvTransmitListener;
                                          Client.field755.addFront(var27);
                                          break label493;
                                       }
                                    }
                                 }
                              } else {
                                 var26 = new ScriptEvent();
                                 var26.source = var9;
                                 var26.params = var9.onInvTransmitListener;
                                 Client.field755.addFront(var26);
                              }

                              var9.field2753 = Client.field779;
                           }

                           if (var9.onStatTransmitListener != null && Client.changedSkillsCount > var9.field2725) {
                              if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2725 <= 32) {
                                 label469:
                                 for(var22 = var9.field2725; var22 < Client.changedSkillsCount; ++var22) {
                                    var20 = Client.changedSkills[var22 & 31];

                                    for(var21 = 0; var21 < var9.statTransmitTriggers.length; ++var21) {
                                       if (var20 == var9.statTransmitTriggers[var21]) {
                                          var27 = new ScriptEvent();
                                          var27.source = var9;
                                          var27.params = var9.onStatTransmitListener;
                                          Client.field755.addFront(var27);
                                          break label469;
                                       }
                                    }
                                 }
                              } else {
                                 var26 = new ScriptEvent();
                                 var26.source = var9;
                                 var26.params = var9.onStatTransmitListener;
                                 Client.field755.addFront(var26);
                              }

                              var9.field2725 = Client.changedSkillsCount;
                           }

                           if (Client.chatCycle > var9.field2733 && var9.onChatTransmitListener != null) {
                              var26 = new ScriptEvent();
                              var26.source = var9;
                              var26.params = var9.onChatTransmitListener;
                              Client.field755.addFront(var26);
                           }

                           if (Client.field742 > var9.field2733 && var9.onFriendTransmitListener != null) {
                              var26 = new ScriptEvent();
                              var26.source = var9;
                              var26.params = var9.onFriendTransmitListener;
                              Client.field755.addFront(var26);
                           }

                           if (Client.field784 > var9.field2733 && var9.onClanTransmitListener != null) {
                              var26 = new ScriptEvent();
                              var26.source = var9;
                              var26.params = var9.onClanTransmitListener;
                              Client.field755.addFront(var26);
                           }

                           if (Client.field785 > var9.field2733 && var9.onStockTransmitListener != null) {
                              var26 = new ScriptEvent();
                              var26.source = var9;
                              var26.params = var9.onStockTransmitListener;
                              Client.field755.addFront(var26);
                           }

                           if (Client.field789 > var9.field2733 && var9.onCamFinishedListener != null) {
                              var26 = new ScriptEvent();
                              var26.source = var9;
                              var26.params = var9.onCamFinishedListener;
                              Client.field755.addFront(var26);
                           }

                           if (Client.field787 > var9.field2733 && var9.onMiscTransmitListener != null) {
                              var26 = new ScriptEvent();
                              var26.source = var9;
                              var26.params = var9.onMiscTransmitListener;
                              Client.field755.addFront(var26);
                           }

                           var9.field2733 = Client.cycleCntr;
                           if (var9.onKeyListener != null) {
                              for(var22 = 0; var22 < Client.field845; ++var22) {
                                 ScriptEvent var28 = new ScriptEvent();
                                 var28.source = var9;
                                 var28.typedKeyCode = Client.field865[var22];
                                 var28.typedKeyChar = Client.field812[var22];
                                 var28.params = var9.onKeyListener;
                                 Client.field755.addFront(var28);
                              }
                           }
                        }
                     }

                     if (!var9.hasScript && Client.draggedWidget == null && class49.field442 == null && !Client.isMenuOpen) {
                        if ((var9.field2739 >= 0 || var9.field2650 != 0) && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                           if (var9.field2739 >= 0) {
                              class37.field329 = var0[var9.field2739];
                           } else {
                              class37.field329 = var9;
                           }
                        }

                        if (var9.type == 8 && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                           class7.field42 = var9;
                        }

                        if (var9.scrollHeight > var9.height) {
                           FileSystem.method4618(var9, var30 + var9.width, var11, var9.height, var9.scrollHeight, MouseInput.mouseLastX, MouseInput.mouseLastY);
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
