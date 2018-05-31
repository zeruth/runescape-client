import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class126 {
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "2146503778"
   )
   static int method3072(int var0, Script var1, boolean var2) {
      byte var3;
      int var4;
      int var5;
      int var6;
      int var7;
      Widget var8;
      Widget var9;
      if(var0 < 1000) {
         Widget var37;
         if(var0 == 100) {
            class45.intStackSize -= 3;
            var4 = class69.intStack[class45.intStackSize];
            var7 = class69.intStack[class45.intStackSize + 1];
            var5 = class69.intStack[class45.intStackSize + 2];
            if(var7 == 0) {
               throw new RuntimeException();
            }

            var37 = OwnWorldComparator.getWidget(var4);
            if(var37.children == null) {
               var37.children = new Widget[var5 + 1];
            }

            if(var37.children.length <= var5) {
               Widget[] var30 = new Widget[var5 + 1];

               for(var6 = 0; var6 < var37.children.length; ++var6) {
                  var30[var6] = var37.children[var6];
               }

               var37.children = var30;
            }

            if(var5 > 0 && var37.children[var5 - 1] == null) {
               throw new RuntimeException("" + (var5 - 1));
            }

            Widget var31 = new Widget();
            var31.type = var7;
            var31.parentId = var31.id = var37.id;
            var31.index = var5;
            var31.hasScript = true;
            var37.children[var5] = var31;
            if(var2) {
               class184.field2379 = var31;
            } else {
               FriendManager.field996 = var31;
            }

            DState.method3548(var37);
            var3 = 1;
         } else if(var0 == 101) {
            var9 = var2?class184.field2379:FriendManager.field996;
            var8 = OwnWorldComparator.getWidget(var9.id);
            var8.children[var9.index] = null;
            DState.method3548(var8);
            var3 = 1;
         } else if(var0 == 102) {
            var9 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
            var9.children = null;
            DState.method3548(var9);
            var3 = 1;
         } else if(var0 == 200) {
            class45.intStackSize -= 2;
            var4 = class69.intStack[class45.intStackSize];
            var7 = class69.intStack[class45.intStackSize + 1];
            var37 = class21.getWidgetChild(var4, var7);
            if(var37 != null && var7 != -1) {
               class69.intStack[++class45.intStackSize - 1] = 1;
               if(var2) {
                  class184.field2379 = var37;
               } else {
                  FriendManager.field996 = var37;
               }
            } else {
               class69.intStack[++class45.intStackSize - 1] = 0;
            }

            var3 = 1;
         } else if(var0 == 201) {
            var9 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
            if(var9 != null) {
               class69.intStack[++class45.intStackSize - 1] = 1;
               if(var2) {
                  class184.field2379 = var9;
               } else {
                  FriendManager.field996 = var9;
               }
            } else {
               class69.intStack[++class45.intStackSize - 1] = 0;
            }

            var3 = 1;
         } else {
            var3 = 2;
         }

         return var3;
      } else if(var0 < 1100) {
         return NetWriter.method2047(var0, var1, var2);
      } else if(var0 < 1200) {
         return UrlRequest.method3138(var0, var1, var2);
      } else if(var0 < 1300) {
         return ScriptState.method1062(var0, var1, var2);
      } else if(var0 < 1400) {
         return NPC.method1831(var0, var1, var2);
      } else if(var0 < 1500) {
         return MouseRecorder.method1090(var0, var1, var2);
      } else if(var0 < 1600) {
         return Varcs.method1943(var0, var1, var2);
      } else if(var0 < 1700) {
         return class52.method1066(var0, var1, var2);
      } else if(var0 < 1800) {
         return class25.method464(var0, var1, var2);
      } else {
         int var10;
         int var11;
         int[] var12;
         if(var0 < 1900) {
            var9 = var2?class184.field2379:FriendManager.field996;
            if(var0 == 1800) {
               var12 = class69.intStack;
               var5 = ++class45.intStackSize - 1;
               var10 = AbstractSoundSystem.getWidgetClickMask(var9);
               var11 = var10 >> 11 & 63;
               var12[var5] = var11;
               var3 = 1;
            } else if(var0 == 1801) {
               var7 = class69.intStack[--class45.intStackSize];
               --var7;
               if(var9.actions != null && var7 < var9.actions.length && var9.actions[var7] != null) {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var9.actions[var7];
               } else {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
               }

               var3 = 1;
            } else if(var0 == 1802) {
               if(var9.opBase == null) {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
               } else {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var9.opBase;
               }

               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 2000) {
            var4 = var0;
            if(var0 >= 2000) {
               var4 = var0 - 1000;
               var8 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
            } else {
               var8 = var2?class184.field2379:FriendManager.field996;
            }

            if(var4 == 1927) {
               if(class69.field1025 >= 10) {
                  throw new RuntimeException();
               }

               if(var8.onResizeListener == null) {
                  var3 = 0;
               } else {
                  ScriptEvent var28 = new ScriptEvent();
                  var28.source = var8;
                  var28.params = var8.onResizeListener;
                  var28.field519 = class69.field1025 + 1;
                  Client.field755.addFront(var28);
                  var3 = 1;
               }
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 2100) {
            return NetWriter.method2047(var0, var1, var2);
         } else if(var0 < 2200) {
            return UrlRequest.method3138(var0, var1, var2);
         } else if(var0 < 2300) {
            return ScriptState.method1062(var0, var1, var2);
         } else if(var0 < 2400) {
            return NPC.method1831(var0, var1, var2);
         } else if(var0 < 2500) {
            return MouseRecorder.method1090(var0, var1, var2);
         } else if(var0 < 2600) {
            var9 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
            if(var0 == 2500) {
               class69.intStack[++class45.intStackSize - 1] = var9.relativeX;
               var3 = 1;
            } else if(var0 == 2501) {
               class69.intStack[++class45.intStackSize - 1] = var9.relativeY;
               var3 = 1;
            } else if(var0 == 2502) {
               class69.intStack[++class45.intStackSize - 1] = var9.width;
               var3 = 1;
            } else if(var0 == 2503) {
               class69.intStack[++class45.intStackSize - 1] = var9.height;
               var3 = 1;
            } else if(var0 == 2504) {
               class69.intStack[++class45.intStackSize - 1] = var9.isHidden?1:0;
               var3 = 1;
            } else if(var0 == 2505) {
               class69.intStack[++class45.intStackSize - 1] = var9.parentId;
               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 2700) {
            return class32.method600(var0, var1, var2);
         } else if(var0 < 2800) {
            if(var0 == 2700) {
               var9 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
               class69.intStack[++class45.intStackSize - 1] = var9.itemId;
               var3 = 1;
            } else if(var0 == 2701) {
               var9 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
               if(var9.itemId != -1) {
                  class69.intStack[++class45.intStackSize - 1] = var9.itemQuantity;
               } else {
                  class69.intStack[++class45.intStackSize - 1] = 0;
               }

               var3 = 1;
            } else if(var0 == 2702) {
               var4 = class69.intStack[--class45.intStackSize];
               WidgetNode var27 = (WidgetNode)Client.componentTable.get((long)var4);
               if(var27 != null) {
                  class69.intStack[++class45.intStackSize - 1] = 1;
               } else {
                  class69.intStack[++class45.intStackSize - 1] = 0;
               }

               var3 = 1;
            } else if(var0 == 2706) {
               class69.intStack[++class45.intStackSize - 1] = Client.widgetRoot;
               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 2900) {
            var9 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
            if(var0 == 2800) {
               var12 = class69.intStack;
               var5 = ++class45.intStackSize - 1;
               var10 = AbstractSoundSystem.getWidgetClickMask(var9);
               var11 = var10 >> 11 & 63;
               var12[var5] = var11;
               var3 = 1;
            } else if(var0 == 2801) {
               var7 = class69.intStack[--class45.intStackSize];
               --var7;
               if(var9.actions != null && var7 < var9.actions.length && var9.actions[var7] != null) {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var9.actions[var7];
               } else {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
               }

               var3 = 1;
            } else if(var0 == 2802) {
               if(var9.opBase == null) {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
               } else {
                  class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var9.opBase;
               }

               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 3000) {
            return class98.method2285(var0, var1, var2);
         } else if(var0 < 3200) {
            return WorldMapManager.method528(var0, var1, var2);
         } else if(var0 < 3300) {
            return MessageNode.method1118(var0, var1, var2);
         } else {
            int var13;
            int[] var14;
            if(var0 < 3400) {
               if(var0 == 3300) {
                  class69.intStack[++class45.intStackSize - 1] = Client.gameCycle;
                  var3 = 1;
               } else {
                  ItemContainer var34;
                  if(var0 == 3301) {
                     class45.intStackSize -= 2;
                     var4 = class69.intStack[class45.intStackSize];
                     var7 = class69.intStack[class45.intStackSize + 1];
                     var14 = class69.intStack;
                     var11 = ++class45.intStackSize - 1;
                     var34 = (ItemContainer)ItemContainer.itemContainers.get((long)var4);
                     if(var34 == null) {
                        var10 = -1;
                     } else if(var7 >= 0 && var7 < var34.itemIds.length) {
                        var10 = var34.itemIds[var7];
                     } else {
                        var10 = -1;
                     }

                     var14[var11] = var10;
                     var3 = 1;
                  } else if(var0 == 3302) {
                     class45.intStackSize -= 2;
                     var4 = class69.intStack[class45.intStackSize];
                     var7 = class69.intStack[class45.intStackSize + 1];
                     var14 = class69.intStack;
                     var11 = ++class45.intStackSize - 1;
                     var34 = (ItemContainer)ItemContainer.itemContainers.get((long)var4);
                     if(var34 == null) {
                        var10 = 0;
                     } else if(var7 >= 0 && var7 < var34.stackSizes.length) {
                        var10 = var34.stackSizes[var7];
                     } else {
                        var10 = 0;
                     }

                     var14[var11] = var10;
                     var3 = 1;
                  } else {
                     int var32;
                     if(var0 == 3303) {
                        class45.intStackSize -= 2;
                        var4 = class69.intStack[class45.intStackSize];
                        var7 = class69.intStack[class45.intStackSize + 1];
                        var14 = class69.intStack;
                        var11 = ++class45.intStackSize - 1;
                        var34 = (ItemContainer)ItemContainer.itemContainers.get((long)var4);
                        if(var34 == null) {
                           var10 = 0;
                        } else if(var7 == -1) {
                           var10 = 0;
                        } else {
                           var13 = 0;

                           for(var32 = 0; var32 < var34.stackSizes.length; ++var32) {
                              if(var7 == var34.itemIds[var32]) {
                                 var13 += var34.stackSizes[var32];
                              }
                           }

                           var10 = var13;
                        }

                        var14[var11] = var10;
                        var3 = 1;
                     } else if(var0 == 3304) {
                        var4 = class69.intStack[--class45.intStackSize];
                        class69.intStack[++class45.intStackSize - 1] = FileRequest.method4622(var4).size;
                        var3 = 1;
                     } else if(var0 == 3305) {
                        var4 = class69.intStack[--class45.intStackSize];
                        class69.intStack[++class45.intStackSize - 1] = Client.boostedSkillLevels[var4];
                        var3 = 1;
                     } else if(var0 == 3306) {
                        var4 = class69.intStack[--class45.intStackSize];
                        class69.intStack[++class45.intStackSize - 1] = Client.realSkillLevels[var4];
                        var3 = 1;
                     } else if(var0 == 3307) {
                        var4 = class69.intStack[--class45.intStackSize];
                        class69.intStack[++class45.intStackSize - 1] = Client.skillExperiences[var4];
                        var3 = 1;
                     } else if(var0 == 3308) {
                        var4 = class192.plane;
                        var7 = (MilliTimer.localPlayer.x >> 7) + class178.baseX;
                        var5 = (MilliTimer.localPlayer.y >> 7) + CombatInfoListHolder.baseY;
                        class69.intStack[++class45.intStackSize - 1] = (var7 << 14) + var5 + (var4 << 28);
                        var3 = 1;
                     } else if(var0 == 3309) {
                        var4 = class69.intStack[--class45.intStackSize];
                        class69.intStack[++class45.intStackSize - 1] = var4 >> 14 & 16383;
                        var3 = 1;
                     } else if(var0 == 3310) {
                        var4 = class69.intStack[--class45.intStackSize];
                        class69.intStack[++class45.intStackSize - 1] = var4 >> 28;
                        var3 = 1;
                     } else if(var0 == 3311) {
                        var4 = class69.intStack[--class45.intStackSize];
                        class69.intStack[++class45.intStackSize - 1] = var4 & 16383;
                        var3 = 1;
                     } else if(var0 == 3312) {
                        class69.intStack[++class45.intStackSize - 1] = Client.isMembers?1:0;
                        var3 = 1;
                     } else if(var0 == 3313) {
                        class45.intStackSize -= 2;
                        var4 = class69.intStack[class45.intStackSize] + 32768;
                        var7 = class69.intStack[class45.intStackSize + 1];
                        var14 = class69.intStack;
                        var11 = ++class45.intStackSize - 1;
                        var34 = (ItemContainer)ItemContainer.itemContainers.get((long)var4);
                        if(var34 == null) {
                           var10 = -1;
                        } else if(var7 >= 0 && var7 < var34.itemIds.length) {
                           var10 = var34.itemIds[var7];
                        } else {
                           var10 = -1;
                        }

                        var14[var11] = var10;
                        var3 = 1;
                     } else if(var0 == 3314) {
                        class45.intStackSize -= 2;
                        var4 = class69.intStack[class45.intStackSize] + 32768;
                        var7 = class69.intStack[class45.intStackSize + 1];
                        var14 = class69.intStack;
                        var11 = ++class45.intStackSize - 1;
                        var34 = (ItemContainer)ItemContainer.itemContainers.get((long)var4);
                        if(var34 == null) {
                           var10 = 0;
                        } else if(var7 >= 0 && var7 < var34.stackSizes.length) {
                           var10 = var34.stackSizes[var7];
                        } else {
                           var10 = 0;
                        }

                        var14[var11] = var10;
                        var3 = 1;
                     } else if(var0 == 3315) {
                        class45.intStackSize -= 2;
                        var4 = class69.intStack[class45.intStackSize] + 32768;
                        var7 = class69.intStack[class45.intStackSize + 1];
                        var14 = class69.intStack;
                        var11 = ++class45.intStackSize - 1;
                        var34 = (ItemContainer)ItemContainer.itemContainers.get((long)var4);
                        if(var34 == null) {
                           var10 = 0;
                        } else if(var7 == -1) {
                           var10 = 0;
                        } else {
                           var13 = 0;

                           for(var32 = 0; var32 < var34.stackSizes.length; ++var32) {
                              if(var7 == var34.itemIds[var32]) {
                                 var13 += var34.stackSizes[var32];
                              }
                           }

                           var10 = var13;
                        }

                        var14[var11] = var10;
                        var3 = 1;
                     } else if(var0 == 3316) {
                        if(Client.rights >= 2) {
                           class69.intStack[++class45.intStackSize - 1] = Client.rights;
                        } else {
                           class69.intStack[++class45.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3317) {
                        class69.intStack[++class45.intStackSize - 1] = Client.field643;
                        var3 = 1;
                     } else if(var0 == 3318) {
                        class69.intStack[++class45.intStackSize - 1] = Client.world;
                        var3 = 1;
                     } else if(var0 == 3321) {
                        class69.intStack[++class45.intStackSize - 1] = Client.energy;
                        var3 = 1;
                     } else if(var0 == 3322) {
                        class69.intStack[++class45.intStackSize - 1] = Client.weight;
                        var3 = 1;
                     } else if(var0 == 3323) {
                        if(Client.field761) {
                           class69.intStack[++class45.intStackSize - 1] = 1;
                        } else {
                           class69.intStack[++class45.intStackSize - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3324) {
                        class69.intStack[++class45.intStackSize - 1] = Client.flags;
                        var3 = 1;
                     } else if(var0 == 3325) {
                        class45.intStackSize -= 4;
                        var4 = class69.intStack[class45.intStackSize];
                        var7 = class69.intStack[class45.intStackSize + 1];
                        var5 = class69.intStack[class45.intStackSize + 2];
                        var11 = class69.intStack[class45.intStackSize + 3];
                        var4 += var7 << 14;
                        var4 += var5 << 28;
                        var4 += var11;
                        class69.intStack[++class45.intStackSize - 1] = var4;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }
                  }
               }

               return var3;
            } else if(var0 < 3500) {
               Enum var29;
               if(var0 == 3400) {
                  class45.intStackSize -= 2;
                  var4 = class69.intStack[class45.intStackSize];
                  var7 = class69.intStack[class45.intStackSize + 1];
                  var29 = ScriptState.method1063(var4);
                  if(var29.valType != 's') {
                     ;
                  }

                  for(var11 = 0; var11 < var29.size; ++var11) {
                     if(var7 == var29.keys[var11]) {
                        class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var29.stringVals[var11];
                        var29 = null;
                        break;
                     }
                  }

                  if(var29 != null) {
                     class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var29.defaultString;
                  }

                  var3 = 1;
               } else if(var0 == 3408) {
                  class45.intStackSize -= 4;
                  var4 = class69.intStack[class45.intStackSize];
                  var7 = class69.intStack[class45.intStackSize + 1];
                  var5 = class69.intStack[class45.intStackSize + 2];
                  var11 = class69.intStack[class45.intStackSize + 3];
                  var29 = ScriptState.method1063(var5);
                  if(var4 == var29.keyType && var7 == var29.valType) {
                     for(var6 = 0; var6 < var29.size; ++var6) {
                        if(var11 == var29.keys[var6]) {
                           if(var7 == 115) {
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var29.stringVals[var6];
                           } else {
                              class69.intStack[++class45.intStackSize - 1] = var29.intVals[var6];
                           }

                           var29 = null;
                           break;
                        }
                     }

                     if(var29 != null) {
                        if(var7 == 115) {
                           class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var29.defaultString;
                        } else {
                           class69.intStack[++class45.intStackSize - 1] = var29.defaultInt;
                        }
                     }

                     var3 = 1;
                  } else {
                     if(var7 == 115) {
                        class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "null";
                     } else {
                        class69.intStack[++class45.intStackSize - 1] = 0;
                     }

                     var3 = 1;
                  }
               } else if(var0 == 3411) {
                  var4 = class69.intStack[--class45.intStackSize];
                  var29 = ScriptState.method1063(var4);
                  class69.intStack[++class45.intStackSize - 1] = var29.method4998();
                  var3 = 1;
               } else {
                  var3 = 2;
               }

               return var3;
            } else if(var0 < 3700) {
               return LoginPacket.method3465(var0, var1, var2);
            } else {
               boolean var15;
               boolean var16;
               String var58;
               if(var0 < 4000) {
                  if(var0 == 3903) {
                     var4 = class69.intStack[--class45.intStackSize];
                     class69.intStack[++class45.intStackSize - 1] = Client.grandExchangeOffers[var4].type();
                     var3 = 1;
                  } else if(var0 == 3904) {
                     var4 = class69.intStack[--class45.intStackSize];
                     class69.intStack[++class45.intStackSize - 1] = Client.grandExchangeOffers[var4].itemId;
                     var3 = 1;
                  } else if(var0 == 3905) {
                     var4 = class69.intStack[--class45.intStackSize];
                     class69.intStack[++class45.intStackSize - 1] = Client.grandExchangeOffers[var4].price;
                     var3 = 1;
                  } else if(var0 == 3906) {
                     var4 = class69.intStack[--class45.intStackSize];
                     class69.intStack[++class45.intStackSize - 1] = Client.grandExchangeOffers[var4].totalQuantity;
                     var3 = 1;
                  } else if(var0 == 3907) {
                     var4 = class69.intStack[--class45.intStackSize];
                     class69.intStack[++class45.intStackSize - 1] = Client.grandExchangeOffers[var4].quantitySold;
                     var3 = 1;
                  } else if(var0 == 3908) {
                     var4 = class69.intStack[--class45.intStackSize];
                     class69.intStack[++class45.intStackSize - 1] = Client.grandExchangeOffers[var4].spent;
                     var3 = 1;
                  } else if(var0 == 3910) {
                     var4 = class69.intStack[--class45.intStackSize];
                     var7 = Client.grandExchangeOffers[var4].status();
                     class69.intStack[++class45.intStackSize - 1] = var7 == 0?1:0;
                     var3 = 1;
                  } else if(var0 == 3911) {
                     var4 = class69.intStack[--class45.intStackSize];
                     var7 = Client.grandExchangeOffers[var4].status();
                     class69.intStack[++class45.intStackSize - 1] = var7 == 2?1:0;
                     var3 = 1;
                  } else if(var0 == 3912) {
                     var4 = class69.intStack[--class45.intStackSize];
                     var7 = Client.grandExchangeOffers[var4].status();
                     class69.intStack[++class45.intStackSize - 1] = var7 == 5?1:0;
                     var3 = 1;
                  } else if(var0 == 3913) {
                     var4 = class69.intStack[--class45.intStackSize];
                     var7 = Client.grandExchangeOffers[var4].status();
                     class69.intStack[++class45.intStackSize - 1] = var7 == 1?1:0;
                     var3 = 1;
                  } else if(var0 == 3914) {
                     var16 = class69.intStack[--class45.intStackSize] == 1;
                     if(class173.grandExchangeEvents != null) {
                        class173.grandExchangeEvents.sort(GrandExchangeEvents.field8, var16);
                     }

                     var3 = 1;
                  } else if(var0 == 3915) {
                     var16 = class69.intStack[--class45.intStackSize] == 1;
                     if(class173.grandExchangeEvents != null) {
                        class173.grandExchangeEvents.sort(GrandExchangeEvents.field7, var16);
                     }

                     var3 = 1;
                  } else if(var0 == 3916) {
                     class45.intStackSize -= 2;
                     var16 = class69.intStack[class45.intStackSize] == 1;
                     var15 = class69.intStack[class45.intStackSize + 1] == 1;
                     if(class173.grandExchangeEvents != null) {
                        Client.field738.field591 = var15;
                        class173.grandExchangeEvents.sort(Client.field738, var16);
                     }

                     var3 = 1;
                  } else if(var0 == 3917) {
                     var16 = class69.intStack[--class45.intStackSize] == 1;
                     if(class173.grandExchangeEvents != null) {
                        class173.grandExchangeEvents.sort(GrandExchangeEvents.field5, var16);
                     }

                     var3 = 1;
                  } else if(var0 == 3918) {
                     var16 = class69.intStack[--class45.intStackSize] == 1;
                     if(class173.grandExchangeEvents != null) {
                        class173.grandExchangeEvents.sort(GrandExchangeEvents.field9, var16);
                     }

                     var3 = 1;
                  } else if(var0 == 3919) {
                     class69.intStack[++class45.intStackSize - 1] = class173.grandExchangeEvents == null?0:class173.grandExchangeEvents.events.size();
                     var3 = 1;
                  } else {
                     GrandExchangeEvent var33;
                     if(var0 == 3920) {
                        var4 = class69.intStack[--class45.intStackSize];
                        var33 = (GrandExchangeEvent)class173.grandExchangeEvents.events.get(var4);
                        class69.intStack[++class45.intStackSize - 1] = var33.world;
                        var3 = 1;
                     } else if(var0 == 3921) {
                        var4 = class69.intStack[--class45.intStackSize];
                        var33 = (GrandExchangeEvent)class173.grandExchangeEvents.events.get(var4);
                        class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var33.method16();
                        var3 = 1;
                     } else if(var0 == 3922) {
                        var4 = class69.intStack[--class45.intStackSize];
                        var33 = (GrandExchangeEvent)class173.grandExchangeEvents.events.get(var4);
                        class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var33.method17();
                        var3 = 1;
                     } else if(var0 == 3923) {
                        var4 = class69.intStack[--class45.intStackSize];
                        var33 = (GrandExchangeEvent)class173.grandExchangeEvents.events.get(var4);
                        long var35 = class166.method3456() - Client.field629 - var33.field10;
                        var10 = (int)(var35 / 3600000L);
                        var6 = (int)((var35 - (long)(var10 * 3600000)) / 60000L);
                        var13 = (int)((var35 - (long)(var10 * 3600000) - (long)(var6 * 60000)) / 1000L);
                        var58 = var10 + ":" + var6 / 10 + var6 % 10 + ":" + var13 / 10 + var13 % 10;
                        class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var58;
                        var3 = 1;
                     } else if(var0 == 3924) {
                        var4 = class69.intStack[--class45.intStackSize];
                        var33 = (GrandExchangeEvent)class173.grandExchangeEvents.events.get(var4);
                        class69.intStack[++class45.intStackSize - 1] = var33.grandExchangeOffer.totalQuantity;
                        var3 = 1;
                     } else if(var0 == 3925) {
                        var4 = class69.intStack[--class45.intStackSize];
                        var33 = (GrandExchangeEvent)class173.grandExchangeEvents.events.get(var4);
                        class69.intStack[++class45.intStackSize - 1] = var33.grandExchangeOffer.price;
                        var3 = 1;
                     } else if(var0 == 3926) {
                        var4 = class69.intStack[--class45.intStackSize];
                        var33 = (GrandExchangeEvent)class173.grandExchangeEvents.events.get(var4);
                        class69.intStack[++class45.intStackSize - 1] = var33.grandExchangeOffer.itemId;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }
                  }

                  return var3;
               } else if(var0 < 4100) {
                  return WallObject.method3081(var0, var1, var2);
               } else if(var0 < 4200) {
                  return ItemLayer.method2617(var0, var1, var2);
               } else if(var0 < 4300) {
                  return Preferences.method1661(var0, var1, var2);
               } else {
                  String var17;
                  PacketNode var18;
                  if(var0 < 5100) {
                     if(var0 == 5000) {
                        class69.intStack[++class45.intStackSize - 1] = Client.publicChatMode;
                        var3 = 1;
                     } else if(var0 == 5001) {
                        class45.intStackSize -= 3;
                        Client.publicChatMode = class69.intStack[class45.intStackSize];
                        var7 = class69.intStack[class45.intStackSize + 1];
                        class307[] var40 = class151.method3235();

                        class307 var47;
                        label1478: {
                           for(var11 = 0; var11 < var40.length; ++var11) {
                              class307 var50 = var40[var11];
                              if(var7 == var50.field3741) {
                                 var47 = var50;
                                 break label1478;
                              }
                           }

                           var47 = null;
                        }

                        WorldMapData.field170 = var47;
                        if(WorldMapData.field170 == null) {
                           WorldMapData.field170 = class307.field3740;
                        }

                        Client.field694 = class69.intStack[class45.intStackSize + 2];
                        var18 = DecorativeObject.method3115(ClientPacket.field2219, Client.field739.field1250);
                        var18.packetBuffer.putByte(Client.publicChatMode);
                        var18.packetBuffer.putByte(WorldMapData.field170.field3741);
                        var18.packetBuffer.putByte(Client.field694);
                        Client.field739.method2019(var18);
                        var3 = 1;
                     } else {
                        String var41;
                        if(var0 == 5002) {
                           var41 = class69.scriptStringStack[--class83.scriptStringStackSize];
                           class45.intStackSize -= 2;
                           var7 = class69.intStack[class45.intStackSize];
                           var5 = class69.intStack[class45.intStackSize + 1];
                           PacketNode var49 = DecorativeObject.method3115(ClientPacket.field2248, Client.field739.field1250);
                           var49.packetBuffer.putByte(Size.getLength(var41) + 2);
                           var49.packetBuffer.putString(var41);
                           var49.packetBuffer.putByte(var7 - 1);
                           var49.packetBuffer.putByte(var5);
                           Client.field739.method2019(var49);
                           var3 = 1;
                        } else if(var0 == 5003) {
                           class45.intStackSize -= 2;
                           var4 = class69.intStack[class45.intStackSize];
                           var7 = class69.intStack[class45.intStackSize + 1];
                           ChatLineBuffer var52 = (ChatLineBuffer)class83.chatLineMap.get(Integer.valueOf(var4));
                           MessageNode var53 = var52.getMessage(var7);
                           if(var53 != null) {
                              class69.intStack[++class45.intStackSize - 1] = var53.id;
                              class69.intStack[++class45.intStackSize - 1] = var53.tick;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var53.name != null?var53.name:"";
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var53.sender != null?var53.sender:"";
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var53.value != null?var53.value:"";
                              class69.intStack[++class45.intStackSize - 1] = var53.method1096()?1:(var53.method1099()?2:0);
                           } else {
                              class69.intStack[++class45.intStackSize - 1] = -1;
                              class69.intStack[++class45.intStackSize - 1] = 0;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              class69.intStack[++class45.intStackSize - 1] = 0;
                           }

                           var3 = 1;
                        } else if(var0 == 5004) {
                           var4 = class69.intStack[--class45.intStackSize];
                           MessageNode var55 = (MessageNode)class83.messages.get((long)var4);
                           if(var55 != null) {
                              class69.intStack[++class45.intStackSize - 1] = var55.type;
                              class69.intStack[++class45.intStackSize - 1] = var55.tick;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var55.name != null?var55.name:"";
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var55.sender != null?var55.sender:"";
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var55.value != null?var55.value:"";
                              class69.intStack[++class45.intStackSize - 1] = var55.method1096()?1:(var55.method1099()?2:0);
                           } else {
                              class69.intStack[++class45.intStackSize - 1] = -1;
                              class69.intStack[++class45.intStackSize - 1] = 0;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              class69.intStack[++class45.intStackSize - 1] = 0;
                           }

                           var3 = 1;
                        } else if(var0 == 5005) {
                           if(WorldMapData.field170 == null) {
                              class69.intStack[++class45.intStackSize - 1] = -1;
                           } else {
                              class69.intStack[++class45.intStackSize - 1] = WorldMapData.field170.field3741;
                           }

                           var3 = 1;
                        } else if(var0 == 5008) {
                           var41 = class69.scriptStringStack[--class83.scriptStringStackSize];
                           var7 = class69.intStack[--class45.intStackSize];
                           var58 = var41.toLowerCase();
                           byte var56 = 0;
                           if(var58.startsWith("yellow:")) {
                              var56 = 0;
                              var41 = var41.substring("yellow:".length());
                           } else if(var58.startsWith("red:")) {
                              var56 = 1;
                              var41 = var41.substring("red:".length());
                           } else if(var58.startsWith("green:")) {
                              var56 = 2;
                              var41 = var41.substring("green:".length());
                           } else if(var58.startsWith("cyan:")) {
                              var56 = 3;
                              var41 = var41.substring("cyan:".length());
                           } else if(var58.startsWith("purple:")) {
                              var56 = 4;
                              var41 = var41.substring("purple:".length());
                           } else if(var58.startsWith("white:")) {
                              var56 = 5;
                              var41 = var41.substring("white:".length());
                           } else if(var58.startsWith("flash1:")) {
                              var56 = 6;
                              var41 = var41.substring("flash1:".length());
                           } else if(var58.startsWith("flash2:")) {
                              var56 = 7;
                              var41 = var41.substring("flash2:".length());
                           } else if(var58.startsWith("flash3:")) {
                              var56 = 8;
                              var41 = var41.substring("flash3:".length());
                           } else if(var58.startsWith("glow1:")) {
                              var56 = 9;
                              var41 = var41.substring("glow1:".length());
                           } else if(var58.startsWith("glow2:")) {
                              var56 = 10;
                              var41 = var41.substring("glow2:".length());
                           } else if(var58.startsWith("glow3:")) {
                              var56 = 11;
                              var41 = var41.substring("glow3:".length());
                           } else if(Client.languageId != 0) {
                              if(var58.startsWith("yellow:")) {
                                 var56 = 0;
                                 var41 = var41.substring("yellow:".length());
                              } else if(var58.startsWith("red:")) {
                                 var56 = 1;
                                 var41 = var41.substring("red:".length());
                              } else if(var58.startsWith("green:")) {
                                 var56 = 2;
                                 var41 = var41.substring("green:".length());
                              } else if(var58.startsWith("cyan:")) {
                                 var56 = 3;
                                 var41 = var41.substring("cyan:".length());
                              } else if(var58.startsWith("purple:")) {
                                 var56 = 4;
                                 var41 = var41.substring("purple:".length());
                              } else if(var58.startsWith("white:")) {
                                 var56 = 5;
                                 var41 = var41.substring("white:".length());
                              } else if(var58.startsWith("flash1:")) {
                                 var56 = 6;
                                 var41 = var41.substring("flash1:".length());
                              } else if(var58.startsWith("flash2:")) {
                                 var56 = 7;
                                 var41 = var41.substring("flash2:".length());
                              } else if(var58.startsWith("flash3:")) {
                                 var56 = 8;
                                 var41 = var41.substring("flash3:".length());
                              } else if(var58.startsWith("glow1:")) {
                                 var56 = 9;
                                 var41 = var41.substring("glow1:".length());
                              } else if(var58.startsWith("glow2:")) {
                                 var56 = 10;
                                 var41 = var41.substring("glow2:".length());
                              } else if(var58.startsWith("glow3:")) {
                                 var56 = 11;
                                 var41 = var41.substring("glow3:".length());
                              }
                           }

                           var58 = var41.toLowerCase();
                           byte var48 = 0;
                           if(var58.startsWith("wave:")) {
                              var48 = 1;
                              var41 = var41.substring("wave:".length());
                           } else if(var58.startsWith("wave2:")) {
                              var48 = 2;
                              var41 = var41.substring("wave2:".length());
                           } else if(var58.startsWith("shake:")) {
                              var48 = 3;
                              var41 = var41.substring("shake:".length());
                           } else if(var58.startsWith("scroll:")) {
                              var48 = 4;
                              var41 = var41.substring("scroll:".length());
                           } else if(var58.startsWith("slide:")) {
                              var48 = 5;
                              var41 = var41.substring("slide:".length());
                           } else if(Client.languageId != 0) {
                              if(var58.startsWith("wave:")) {
                                 var48 = 1;
                                 var41 = var41.substring("wave:".length());
                              } else if(var58.startsWith("wave2:")) {
                                 var48 = 2;
                                 var41 = var41.substring("wave2:".length());
                              } else if(var58.startsWith("shake:")) {
                                 var48 = 3;
                                 var41 = var41.substring("shake:".length());
                              } else if(var58.startsWith("scroll:")) {
                                 var48 = 4;
                                 var41 = var41.substring("scroll:".length());
                              } else if(var58.startsWith("slide:")) {
                                 var48 = 5;
                                 var41 = var41.substring("slide:".length());
                              }
                           }

                           PacketNode var51 = DecorativeObject.method3115(ClientPacket.field2253, Client.field739.field1250);
                           var51.packetBuffer.putByte(0);
                           var13 = var51.packetBuffer.offset;
                           var51.packetBuffer.putByte(var7);
                           var51.packetBuffer.putByte(var56);
                           var51.packetBuffer.putByte(var48);
                           PacketBuffer var61 = var51.packetBuffer;
                           int var62 = var61.offset;
                           byte[] var26 = class148.method3203(var41);
                           var61.putShortSmart(var26.length);
                           var61.offset += class300.huffman.compress(var26, 0, var26.length, var61.payload, var61.offset);
                           var51.packetBuffer.method3565(var51.packetBuffer.offset - var13);
                           Client.field739.method2019(var51);
                           var3 = 1;
                        } else if(var0 == 5009) {
                           class83.scriptStringStackSize -= 2;
                           var41 = class69.scriptStringStack[class83.scriptStringStackSize];
                           var17 = class69.scriptStringStack[class83.scriptStringStackSize + 1];
                           var18 = DecorativeObject.method3115(ClientPacket.field2197, Client.field739.field1250);
                           var18.packetBuffer.putShort(0);
                           var11 = var18.packetBuffer.offset;
                           var18.packetBuffer.putString(var41);
                           PacketBuffer var60 = var18.packetBuffer;
                           var6 = var60.offset;
                           byte[] var63 = class148.method3203(var17);
                           var60.putShortSmart(var63.length);
                           var60.offset += class300.huffman.compress(var63, 0, var63.length, var60.payload, var60.offset);
                           var18.packetBuffer.method3734(var18.packetBuffer.offset - var11);
                           Client.field739.method2019(var18);
                           var3 = 1;
                        } else if(var0 == 5015) {
                           if(MilliTimer.localPlayer != null && MilliTimer.localPlayer.name != null) {
                              var41 = MilliTimer.localPlayer.name.getName();
                           } else {
                              var41 = "";
                           }

                           class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var41;
                           var3 = 1;
                        } else if(var0 == 5016) {
                           class69.intStack[++class45.intStackSize - 1] = Client.field694;
                           var3 = 1;
                        } else if(var0 == 5017) {
                           var4 = class69.intStack[--class45.intStackSize];
                           class69.intStack[++class45.intStackSize - 1] = SceneTilePaint.method2895(var4);
                           var3 = 1;
                        } else if(var0 == 5018) {
                           var4 = class69.intStack[--class45.intStackSize];
                           class69.intStack[++class45.intStackSize - 1] = class15.method157(var4);
                           var3 = 1;
                        } else if(var0 == 5019) {
                           var4 = class69.intStack[--class45.intStackSize];
                           class69.intStack[++class45.intStackSize - 1] = Projectile.method1900(var4);
                           var3 = 1;
                        } else if(var0 == 5020) {
                           var41 = class69.scriptStringStack[--class83.scriptStringStackSize];
                           class151.method3234(var41);
                           var3 = 1;
                        } else if(var0 == 5021) {
                           Client.field808 = class69.scriptStringStack[--class83.scriptStringStackSize].toLowerCase().trim();
                           var3 = 1;
                        } else if(var0 == 5022) {
                           class69.scriptStringStack[++class83.scriptStringStackSize - 1] = Client.field808;
                           var3 = 1;
                        } else {
                           var3 = 2;
                        }
                     }

                     return var3;
                  } else if(var0 < 5400) {
                     if(var0 == 5306) {
                        int[] var38 = class69.intStack;
                        var7 = ++class45.intStackSize - 1;
                        var5 = Client.isResized?2:1;
                        var38[var7] = var5;
                        var3 = 1;
                     } else if(var0 == 5307) {
                        var4 = class69.intStack[--class45.intStackSize];
                        if(var4 == 1 || var4 == 2) {
                           Client.field803 = 0L;
                           if(var4 >= 2) {
                              Client.isResized = true;
                           } else {
                              Client.isResized = false;
                           }

                           var7 = Client.isResized?2:1;
                           if(var7 == 1) {
                              class37.clientInstance.method896(765, 503);
                           } else {
                              class37.clientInstance.method896(7680, 2160);
                           }

                           if(Client.gameState >= 25) {
                              var18 = DecorativeObject.method3115(ClientPacket.field2206, Client.field739.field1250);
                              PacketBuffer var39 = var18.packetBuffer;
                              var10 = Client.isResized?2:1;
                              var39.putByte(var10);
                              var18.packetBuffer.putShort(class9.canvasWidth);
                              var18.packetBuffer.putShort(class37.canvasHeight);
                              Client.field739.method2019(var18);
                           }
                        }

                        var3 = 1;
                     } else if(var0 == 5308) {
                        class69.intStack[++class45.intStackSize - 1] = ScriptState.preferences.screenType;
                        var3 = 1;
                     } else if(var0 == 5309) {
                        var4 = class69.intStack[--class45.intStackSize];
                        if(var4 == 1 || var4 == 2) {
                           ScriptState.preferences.screenType = var4;
                           Enum.method5008();
                        }

                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 < 5600) {
                     if(var0 == 5504) {
                        class45.intStackSize -= 2;
                        var11 = class69.intStack[class45.intStackSize];
                        var10 = class69.intStack[class45.intStackSize + 1];
                        if(!Client.field746) {
                           Client.cameraPitchTarget = var11;
                           Client.mapAngle = var10;
                        }

                        var3 = 1;
                     } else if(var0 == 5505) {
                        class69.intStack[++class45.intStackSize - 1] = Client.cameraPitchTarget;
                        var3 = 1;
                     } else if(var0 == 5506) {
                        class69.intStack[++class45.intStackSize - 1] = Client.mapAngle;
                        var3 = 1;
                     } else if(var0 == 5530) {
                        var11 = class69.intStack[--class45.intStackSize];
                        if(var11 < 0) {
                           var11 = 0;
                        }

                        Client.field668 = var11;
                        var3 = 1;
                     } else if(var0 == 5531) {
                        class69.intStack[++class45.intStackSize - 1] = Client.field668;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 < 5700) {
                     if(var0 == 5630) {
                        Client.field688 = 250;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 < 6300) {
                     if(var0 == 6200) {
                        class45.intStackSize -= 2;
                        Client.field745 = (short)class69.intStack[class45.intStackSize];
                        if(Client.field745 <= 0) {
                           Client.field745 = 256;
                        }

                        Client.field841 = (short)class69.intStack[class45.intStackSize + 1];
                        if(Client.field841 <= 0) {
                           Client.field841 = 205;
                        }

                        var3 = 1;
                     } else if(var0 == 6201) {
                        class45.intStackSize -= 2;
                        Client.field842 = (short)class69.intStack[class45.intStackSize];
                        if(Client.field842 <= 0) {
                           Client.field842 = 256;
                        }

                        Client.field615 = (short)class69.intStack[class45.intStackSize + 1];
                        if(Client.field615 <= 0) {
                           Client.field615 = 320;
                        }

                        var3 = 1;
                     } else if(var0 == 6202) {
                        class45.intStackSize -= 4;
                        Client.field844 = (short)class69.intStack[class45.intStackSize];
                        if(Client.field844 <= 0) {
                           Client.field844 = 1;
                        }

                        Client.field863 = (short)class69.intStack[class45.intStackSize + 1];
                        if(Client.field863 <= 0) {
                           Client.field863 = 32767;
                        } else if(Client.field863 < Client.field844) {
                           Client.field863 = Client.field844;
                        }

                        Client.field707 = (short)class69.intStack[class45.intStackSize + 2];
                        if(Client.field707 <= 0) {
                           Client.field707 = 1;
                        }

                        Client.field847 = (short)class69.intStack[class45.intStackSize + 3];
                        if(Client.field847 <= 0) {
                           Client.field847 = 32767;
                        } else if(Client.field847 < Client.field707) {
                           Client.field847 = Client.field707;
                        }

                        var3 = 1;
                     } else if(var0 == 6203) {
                        if(Client.field776 != null) {
                           Occluder.method3113(0, 0, Client.field776.width, Client.field776.height, false);
                           class69.intStack[++class45.intStackSize - 1] = Client.viewportWidth;
                           class69.intStack[++class45.intStackSize - 1] = Client.viewportHeight;
                        } else {
                           class69.intStack[++class45.intStackSize - 1] = -1;
                           class69.intStack[++class45.intStackSize - 1] = -1;
                        }

                        var3 = 1;
                     } else if(var0 == 6204) {
                        class69.intStack[++class45.intStackSize - 1] = Client.field842;
                        class69.intStack[++class45.intStackSize - 1] = Client.field615;
                        var3 = 1;
                     } else if(var0 == 6205) {
                        class69.intStack[++class45.intStackSize - 1] = Client.field745;
                        class69.intStack[++class45.intStackSize - 1] = Client.field841;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 >= 6600) {
                     if(var0 < 6700) {
                        if(var0 == 6600) {
                           var4 = class192.plane;
                           var7 = (MilliTimer.localPlayer.x >> 7) + class178.baseX;
                           var5 = (MilliTimer.localPlayer.y >> 7) + CombatInfoListHolder.baseY;
                           CombatInfoListHolder.method1821().method6222(var4, var7, var5, true);
                           var3 = 1;
                        } else {
                           WorldMapData var36;
                           if(var0 == 6601) {
                              var4 = class69.intStack[--class45.intStackSize];
                              var17 = "";
                              var36 = CombatInfoListHolder.method1821().getWorldMapDataByFileId(var4);
                              if(var36 != null) {
                                 var17 = var36.getName();
                              }

                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var17;
                              var3 = 1;
                           } else if(var0 == 6602) {
                              var4 = class69.intStack[--class45.intStackSize];
                              CombatInfoListHolder.method1821().method6244(var4);
                              var3 = 1;
                           } else if(var0 == 6603) {
                              class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6073();
                              var3 = 1;
                           } else if(var0 == 6604) {
                              var4 = class69.intStack[--class45.intStackSize];
                              CombatInfoListHolder.method1821().method6191(var4);
                              var3 = 1;
                           } else if(var0 == 6605) {
                              class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6075()?1:0;
                              var3 = 1;
                           } else {
                              Coordinates var42;
                              if(var0 == 6606) {
                                 var42 = new Coordinates(class69.intStack[--class45.intStackSize]);
                                 CombatInfoListHolder.method1821().setWorldMapPositionTarget(var42.worldX, var42.worldY);
                                 var3 = 1;
                              } else if(var0 == 6607) {
                                 var42 = new Coordinates(class69.intStack[--class45.intStackSize]);
                                 CombatInfoListHolder.method1821().method6070(var42.worldX, var42.worldY);
                                 var3 = 1;
                              } else if(var0 == 6608) {
                                 var42 = new Coordinates(class69.intStack[--class45.intStackSize]);
                                 CombatInfoListHolder.method1821().method6224(var42.plane, var42.worldX, var42.worldY);
                                 var3 = 1;
                              } else if(var0 == 6609) {
                                 var42 = new Coordinates(class69.intStack[--class45.intStackSize]);
                                 CombatInfoListHolder.method1821().method6080(var42.plane, var42.worldX, var42.worldY);
                                 var3 = 1;
                              } else if(var0 == 6610) {
                                 class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6081();
                                 class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6218();
                                 var3 = 1;
                              } else {
                                 WorldMapData var44;
                                 if(var0 == 6611) {
                                    var4 = class69.intStack[--class45.intStackSize];
                                    var44 = CombatInfoListHolder.method1821().getWorldMapDataByFileId(var4);
                                    if(var44 == null) {
                                       class69.intStack[++class45.intStackSize - 1] = 0;
                                    } else {
                                       class69.intStack[++class45.intStackSize - 1] = var44.method244().bitpack();
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6612) {
                                    var4 = class69.intStack[--class45.intStackSize];
                                    var44 = CombatInfoListHolder.method1821().getWorldMapDataByFileId(var4);
                                    if(var44 == null) {
                                       class69.intStack[++class45.intStackSize - 1] = 0;
                                       class69.intStack[++class45.intStackSize - 1] = 0;
                                    } else {
                                       class69.intStack[++class45.intStackSize - 1] = (var44.method238() - var44.getMinX() + 1) * 64;
                                       class69.intStack[++class45.intStackSize - 1] = (var44.method270() - var44.getMinY() + 1) * 64;
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6613) {
                                    var4 = class69.intStack[--class45.intStackSize];
                                    var44 = CombatInfoListHolder.method1821().getWorldMapDataByFileId(var4);
                                    if(var44 == null) {
                                       class69.intStack[++class45.intStackSize - 1] = 0;
                                       class69.intStack[++class45.intStackSize - 1] = 0;
                                       class69.intStack[++class45.intStackSize - 1] = 0;
                                       class69.intStack[++class45.intStackSize - 1] = 0;
                                    } else {
                                       class69.intStack[++class45.intStackSize - 1] = var44.getMinX() * 64;
                                       class69.intStack[++class45.intStackSize - 1] = var44.getMinY() * 64;
                                       class69.intStack[++class45.intStackSize - 1] = var44.method238() * 64 + 64 - 1;
                                       class69.intStack[++class45.intStackSize - 1] = var44.method270() * 64 + 64 - 1;
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6614) {
                                    var4 = class69.intStack[--class45.intStackSize];
                                    var44 = CombatInfoListHolder.method1821().getWorldMapDataByFileId(var4);
                                    if(var44 == null) {
                                       class69.intStack[++class45.intStackSize - 1] = -1;
                                    } else {
                                       class69.intStack[++class45.intStackSize - 1] = var44.getInitialMapSurfaceZoom();
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6615) {
                                    var42 = CombatInfoListHolder.method1821().method6083();
                                    if(var42 == null) {
                                       class69.intStack[++class45.intStackSize - 1] = -1;
                                       class69.intStack[++class45.intStackSize - 1] = -1;
                                    } else {
                                       class69.intStack[++class45.intStackSize - 1] = var42.worldX;
                                       class69.intStack[++class45.intStackSize - 1] = var42.worldY;
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6616) {
                                    class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6060();
                                    var3 = 1;
                                 } else if(var0 == 6617) {
                                    var42 = new Coordinates(class69.intStack[--class45.intStackSize]);
                                    var44 = CombatInfoListHolder.method1821().method6061();
                                    if(var44 == null) {
                                       class69.intStack[++class45.intStackSize - 1] = -1;
                                       class69.intStack[++class45.intStackSize - 1] = -1;
                                       var3 = 1;
                                    } else {
                                       var14 = var44.method281(var42.plane, var42.worldX, var42.worldY);
                                       if(var14 == null) {
                                          class69.intStack[++class45.intStackSize - 1] = -1;
                                          class69.intStack[++class45.intStackSize - 1] = -1;
                                       } else {
                                          class69.intStack[++class45.intStackSize - 1] = var14[0];
                                          class69.intStack[++class45.intStackSize - 1] = var14[1];
                                       }

                                       var3 = 1;
                                    }
                                 } else {
                                    Coordinates var45;
                                    if(var0 == 6618) {
                                       var42 = new Coordinates(class69.intStack[--class45.intStackSize]);
                                       var44 = CombatInfoListHolder.method1821().method6061();
                                       if(var44 == null) {
                                          class69.intStack[++class45.intStackSize - 1] = -1;
                                          class69.intStack[++class45.intStackSize - 1] = -1;
                                          var3 = 1;
                                       } else {
                                          var45 = var44.method229(var42.worldX, var42.worldY);
                                          if(var45 == null) {
                                             class69.intStack[++class45.intStackSize - 1] = -1;
                                          } else {
                                             class69.intStack[++class45.intStackSize - 1] = var45.bitpack();
                                          }

                                          var3 = 1;
                                       }
                                    } else {
                                       Coordinates var46;
                                       if(var0 == 6619) {
                                          class45.intStackSize -= 2;
                                          var4 = class69.intStack[class45.intStackSize];
                                          var46 = new Coordinates(class69.intStack[class45.intStackSize + 1]);
                                          class32.method601(var4, var46, false);
                                          var3 = 1;
                                       } else if(var0 == 6620) {
                                          class45.intStackSize -= 2;
                                          var4 = class69.intStack[class45.intStackSize];
                                          var46 = new Coordinates(class69.intStack[class45.intStackSize + 1]);
                                          class32.method601(var4, var46, true);
                                          var3 = 1;
                                       } else if(var0 == 6621) {
                                          class45.intStackSize -= 2;
                                          var4 = class69.intStack[class45.intStackSize];
                                          var46 = new Coordinates(class69.intStack[class45.intStackSize + 1]);
                                          var36 = CombatInfoListHolder.method1821().getWorldMapDataByFileId(var4);
                                          if(var36 == null) {
                                             class69.intStack[++class45.intStackSize - 1] = 0;
                                             var3 = 1;
                                          } else {
                                             class69.intStack[++class45.intStackSize - 1] = var36.containsCoord(var46.plane, var46.worldX, var46.worldY)?1:0;
                                             var3 = 1;
                                          }
                                       } else if(var0 == 6622) {
                                          class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6084();
                                          class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6085();
                                          var3 = 1;
                                       } else if(var0 == 6623) {
                                          var42 = new Coordinates(class69.intStack[--class45.intStackSize]);
                                          var44 = CombatInfoListHolder.method1821().getWorldMapDataContainingCoord(var42.plane, var42.worldX, var42.worldY);
                                          if(var44 == null) {
                                             class69.intStack[++class45.intStackSize - 1] = -1;
                                          } else {
                                             class69.intStack[++class45.intStackSize - 1] = var44.getFileId();
                                          }

                                          var3 = 1;
                                       } else if(var0 == 6624) {
                                          CombatInfoListHolder.method1821().method6086(class69.intStack[--class45.intStackSize]);
                                          var3 = 1;
                                       } else if(var0 == 6625) {
                                          CombatInfoListHolder.method1821().method6087();
                                          var3 = 1;
                                       } else if(var0 == 6626) {
                                          CombatInfoListHolder.method1821().method6088(class69.intStack[--class45.intStackSize]);
                                          var3 = 1;
                                       } else if(var0 == 6627) {
                                          CombatInfoListHolder.method1821().method6203();
                                          var3 = 1;
                                       } else if(var0 == 6628) {
                                          var16 = class69.intStack[--class45.intStackSize] == 1;
                                          CombatInfoListHolder.method1821().method6058(var16);
                                          var3 = 1;
                                       } else if(var0 == 6629) {
                                          var4 = class69.intStack[--class45.intStackSize];
                                          CombatInfoListHolder.method1821().method6091(var4);
                                          var3 = 1;
                                       } else if(var0 == 6630) {
                                          var4 = class69.intStack[--class45.intStackSize];
                                          CombatInfoListHolder.method1821().method6090(var4);
                                          var3 = 1;
                                       } else if(var0 == 6631) {
                                          CombatInfoListHolder.method1821().method6093();
                                          var3 = 1;
                                       } else if(var0 == 6632) {
                                          var16 = class69.intStack[--class45.intStackSize] == 1;
                                          CombatInfoListHolder.method1821().method6094(var16);
                                          var3 = 1;
                                       } else if(var0 == 6633) {
                                          class45.intStackSize -= 2;
                                          var4 = class69.intStack[class45.intStackSize];
                                          var15 = class69.intStack[class45.intStackSize + 1] == 1;
                                          CombatInfoListHolder.method1821().method6095(var4, var15);
                                          var3 = 1;
                                       } else if(var0 == 6634) {
                                          class45.intStackSize -= 2;
                                          var4 = class69.intStack[class45.intStackSize];
                                          var15 = class69.intStack[class45.intStackSize + 1] == 1;
                                          CombatInfoListHolder.method1821().method6082(var4, var15);
                                          var3 = 1;
                                       } else if(var0 == 6635) {
                                          class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6097()?1:0;
                                          var3 = 1;
                                       } else if(var0 == 6636) {
                                          var4 = class69.intStack[--class45.intStackSize];
                                          class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6098(var4)?1:0;
                                          var3 = 1;
                                       } else if(var0 == 6637) {
                                          var4 = class69.intStack[--class45.intStackSize];
                                          class69.intStack[++class45.intStackSize - 1] = CombatInfoListHolder.method1821().method6059(var4)?1:0;
                                          var3 = 1;
                                       } else if(var0 == 6638) {
                                          class45.intStackSize -= 2;
                                          var4 = class69.intStack[class45.intStackSize];
                                          var46 = new Coordinates(class69.intStack[class45.intStackSize + 1]);
                                          var45 = CombatInfoListHolder.method1821().method6105(var4, var46);
                                          if(var45 == null) {
                                             class69.intStack[++class45.intStackSize - 1] = -1;
                                          } else {
                                             class69.intStack[++class45.intStackSize - 1] = var45.bitpack();
                                          }

                                          var3 = 1;
                                       } else {
                                          MapIcon var59;
                                          if(var0 == 6639) {
                                             var59 = CombatInfoListHolder.method1821().method6067();
                                             if(var59 == null) {
                                                class69.intStack[++class45.intStackSize - 1] = -1;
                                                class69.intStack[++class45.intStackSize - 1] = -1;
                                             } else {
                                                class69.intStack[++class45.intStackSize - 1] = var59.areaId;
                                                class69.intStack[++class45.intStackSize - 1] = var59.field247.bitpack();
                                             }

                                             var3 = 1;
                                          } else if(var0 == 6640) {
                                             var59 = CombatInfoListHolder.method1821().method6245();
                                             if(var59 == null) {
                                                class69.intStack[++class45.intStackSize - 1] = -1;
                                                class69.intStack[++class45.intStackSize - 1] = -1;
                                             } else {
                                                class69.intStack[++class45.intStackSize - 1] = var59.areaId;
                                                class69.intStack[++class45.intStackSize - 1] = var59.field247.bitpack();
                                             }

                                             var3 = 1;
                                          } else {
                                             Area var57;
                                             if(var0 == 6693) {
                                                var4 = class69.intStack[--class45.intStackSize];
                                                var57 = Area.mapAreaType[var4];
                                                if(var57.name == null) {
                                                   class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                                                } else {
                                                   class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var57.name;
                                                }

                                                var3 = 1;
                                             } else if(var0 == 6694) {
                                                var4 = class69.intStack[--class45.intStackSize];
                                                var57 = Area.mapAreaType[var4];
                                                class69.intStack[++class45.intStackSize - 1] = var57.field3276;
                                                var3 = 1;
                                             } else if(var0 == 6695) {
                                                var4 = class69.intStack[--class45.intStackSize];
                                                var57 = Area.mapAreaType[var4];
                                                if(var57 == null) {
                                                   class69.intStack[++class45.intStackSize - 1] = -1;
                                                } else {
                                                   class69.intStack[++class45.intStackSize - 1] = var57.field3277;
                                                }

                                                var3 = 1;
                                             } else if(var0 == 6696) {
                                                var4 = class69.intStack[--class45.intStackSize];
                                                var57 = Area.mapAreaType[var4];
                                                if(var57 == null) {
                                                   class69.intStack[++class45.intStackSize - 1] = -1;
                                                } else {
                                                   class69.intStack[++class45.intStackSize - 1] = var57.spriteId;
                                                }

                                                var3 = 1;
                                             } else if(var0 == 6697) {
                                                class69.intStack[++class45.intStackSize - 1] = class173.scriptMapIconReference.areaId;
                                                var3 = 1;
                                             } else if(var0 == 6698) {
                                                class69.intStack[++class45.intStackSize - 1] = class173.scriptMapIconReference.field308.bitpack();
                                                var3 = 1;
                                             } else if(var0 == 6699) {
                                                class69.intStack[++class45.intStackSize - 1] = class173.scriptMapIconReference.field309.bitpack();
                                                var3 = 1;
                                             } else {
                                                var3 = 2;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        return var3;
                     } else {
                        return 2;
                     }
                  } else {
                     if(var0 == 6500) {
                        class69.intStack[++class45.intStackSize - 1] = IndexStoreActionHandler.loadWorlds()?1:0;
                        var3 = 1;
                     } else {
                        World var19;
                        if(var0 == 6501) {
                           var19 = class294.method5520();
                           if(var19 != null) {
                              class69.intStack[++class45.intStackSize - 1] = var19.id;
                              class69.intStack[++class45.intStackSize - 1] = var19.mask;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var19.activity;
                              class69.intStack[++class45.intStackSize - 1] = var19.location;
                              class69.intStack[++class45.intStackSize - 1] = var19.playerCount;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var19.address;
                           } else {
                              class69.intStack[++class45.intStackSize - 1] = -1;
                              class69.intStack[++class45.intStackSize - 1] = 0;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              class69.intStack[++class45.intStackSize - 1] = 0;
                              class69.intStack[++class45.intStackSize - 1] = 0;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                           }

                           var3 = 1;
                        } else if(var0 == 6502) {
                           var19 = GroundObject.method2704();
                           if(var19 != null) {
                              class69.intStack[++class45.intStackSize - 1] = var19.id;
                              class69.intStack[++class45.intStackSize - 1] = var19.mask;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var19.activity;
                              class69.intStack[++class45.intStackSize - 1] = var19.location;
                              class69.intStack[++class45.intStackSize - 1] = var19.playerCount;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var19.address;
                           } else {
                              class69.intStack[++class45.intStackSize - 1] = -1;
                              class69.intStack[++class45.intStackSize - 1] = 0;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              class69.intStack[++class45.intStackSize - 1] = 0;
                              class69.intStack[++class45.intStackSize - 1] = 0;
                              class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                           }

                           var3 = 1;
                        } else {
                           World var20;
                           if(var0 == 6506) {
                              var4 = class69.intStack[--class45.intStackSize];
                              var20 = null;

                              for(var5 = 0; var5 < World.worldCount; ++var5) {
                                 if(var4 == class143.worldList[var5].id) {
                                    var20 = class143.worldList[var5];
                                    break;
                                 }
                              }

                              if(var20 != null) {
                                 class69.intStack[++class45.intStackSize - 1] = var20.id;
                                 class69.intStack[++class45.intStackSize - 1] = var20.mask;
                                 class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var20.activity;
                                 class69.intStack[++class45.intStackSize - 1] = var20.location;
                                 class69.intStack[++class45.intStackSize - 1] = var20.playerCount;
                                 class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var20.address;
                              } else {
                                 class69.intStack[++class45.intStackSize - 1] = -1;
                                 class69.intStack[++class45.intStackSize - 1] = 0;
                                 class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                                 class69.intStack[++class45.intStackSize - 1] = 0;
                                 class69.intStack[++class45.intStackSize - 1] = 0;
                                 class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              }

                              var3 = 1;
                           } else if(var0 == 6507) {
                              class45.intStackSize -= 4;
                              var4 = class69.intStack[class45.intStackSize];
                              var15 = class69.intStack[class45.intStackSize + 1] == 1;
                              var5 = class69.intStack[class45.intStackSize + 2];
                              boolean var21 = class69.intStack[class45.intStackSize + 3] == 1;
                              class138.method3160(var4, var15, var5, var21);
                              var3 = 1;
                           } else if(var0 == 6511) {
                              var4 = class69.intStack[--class45.intStackSize];
                              if(var4 >= 0 && var4 < World.worldCount) {
                                 var20 = class143.worldList[var4];
                                 class69.intStack[++class45.intStackSize - 1] = var20.id;
                                 class69.intStack[++class45.intStackSize - 1] = var20.mask;
                                 class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var20.activity;
                                 class69.intStack[++class45.intStackSize - 1] = var20.location;
                                 class69.intStack[++class45.intStackSize - 1] = var20.playerCount;
                                 class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var20.address;
                              } else {
                                 class69.intStack[++class45.intStackSize - 1] = -1;
                                 class69.intStack[++class45.intStackSize - 1] = 0;
                                 class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                                 class69.intStack[++class45.intStackSize - 1] = 0;
                                 class69.intStack[++class45.intStackSize - 1] = 0;
                                 class69.scriptStringStack[++class83.scriptStringStackSize - 1] = "";
                              }

                              var3 = 1;
                           } else if(var0 == 6512) {
                              Client.field753 = class69.intStack[--class45.intStackSize] == 1;
                              var3 = 1;
                           } else {
                              class264 var43;
                              if(var0 == 6513) {
                                 class45.intStackSize -= 2;
                                 var4 = class69.intStack[class45.intStackSize];
                                 var7 = class69.intStack[class45.intStackSize + 1];
                                 var43 = Buffer.method3811(var7);
                                 if(var43.method4956()) {
                                    class69.scriptStringStack[++class83.scriptStringStackSize - 1] = class59.getNpcDefinition(var4).method5175(var7, var43.field3347);
                                 } else {
                                    class69.intStack[++class45.intStackSize - 1] = class59.getNpcDefinition(var4).method5196(var7, var43.field3348);
                                 }

                                 var3 = 1;
                              } else if(var0 == 6514) {
                                 class45.intStackSize -= 2;
                                 var4 = class69.intStack[class45.intStackSize];
                                 var7 = class69.intStack[class45.intStackSize + 1];
                                 var43 = Buffer.method3811(var7);
                                 if(var43.method4956()) {
                                    class69.scriptStringStack[++class83.scriptStringStackSize - 1] = SoundTaskDataProvider.getObjectDefinition(var4).method5057(var7, var43.field3347);
                                 } else {
                                    class69.intStack[++class45.intStackSize - 1] = SoundTaskDataProvider.getObjectDefinition(var4).method5078(var7, var43.field3348);
                                 }

                                 var3 = 1;
                              } else if(var0 == 6515) {
                                 class45.intStackSize -= 2;
                                 var4 = class69.intStack[class45.intStackSize];
                                 var7 = class69.intStack[class45.intStackSize + 1];
                                 var43 = Buffer.method3811(var7);
                                 if(var43.method4956()) {
                                    class69.scriptStringStack[++class83.scriptStringStackSize - 1] = class120.getItemDefinition(var4).method5111(var7, var43.field3347);
                                 } else {
                                    class69.intStack[++class45.intStackSize - 1] = class120.getItemDefinition(var4).method5103(var7, var43.field3348);
                                 }

                                 var3 = 1;
                              } else if(var0 == 6516) {
                                 class45.intStackSize -= 2;
                                 var4 = class69.intStack[class45.intStackSize];
                                 var7 = class69.intStack[class45.intStackSize + 1];
                                 var43 = Buffer.method3811(var7);
                                 class265 var22;
                                 byte[] var23;
                                 class265 var24;
                                 if(var43.method4956()) {
                                    String[] var25 = class69.scriptStringStack;
                                    var10 = ++class83.scriptStringStackSize - 1;
                                    var22 = (class265)class265.field3352.get((long)var4);
                                    if(var22 != null) {
                                       var24 = var22;
                                    } else {
                                       var23 = class265.field3351.getConfigData(34, var4);
                                       var22 = new class265();
                                       if(var23 != null) {
                                          var22.method4990(new Buffer(var23));
                                       }

                                       var22.method4976();
                                       class265.field3352.put(var22, (long)var4);
                                       var24 = var22;
                                    }

                                    var25[var10] = var24.method4980(var7, var43.field3347);
                                 } else {
                                    int[] var54 = class69.intStack;
                                    var10 = ++class45.intStackSize - 1;
                                    var22 = (class265)class265.field3352.get((long)var4);
                                    if(var22 != null) {
                                       var24 = var22;
                                    } else {
                                       var23 = class265.field3351.getConfigData(34, var4);
                                       var22 = new class265();
                                       if(var23 != null) {
                                          var22.method4990(new Buffer(var23));
                                       }

                                       var22.method4976();
                                       class265.field3352.put(var22, (long)var4);
                                       var24 = var22;
                                    }

                                    var54[var10] = var24.method4982(var7, var43.field3348);
                                 }

                                 var3 = 1;
                              } else if(var0 == 6518) {
                                 class69.intStack[++class45.intStackSize - 1] = Client.field601?1:0;
                                 var3 = 1;
                              } else if(var0 == 6520) {
                                 var3 = 1;
                              } else if(var0 == 6521) {
                                 var3 = 1;
                              } else if(var0 == 6522) {
                                 --class83.scriptStringStackSize;
                                 --class45.intStackSize;
                                 var3 = 1;
                              } else if(var0 == 6523) {
                                 --class83.scriptStringStackSize;
                                 --class45.intStackSize;
                                 var3 = 1;
                              } else {
                                 var3 = 2;
                              }
                           }
                        }
                     }

                     return var3;
                  }
               }
            }
         }
      }
   }
}
