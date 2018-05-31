import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("g")
   static int[][][] field534;
   @ObfuscatedName("w")
   @Export("isRunning")
   boolean isRunning;
   @ObfuscatedName("m")
   @Export("lock")
   Object lock;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -528874791
   )
   @Export("index")
   int index;
   @ObfuscatedName("b")
   @Export("xs")
   int[] xs;
   @ObfuscatedName("f")
   @Export("ys")
   int[] ys;

   MouseRecorder() {
      this.isRunning = true;
      this.lock = new Object();
      this.index = 0;
      this.xs = new int[500];
      this.ys = new int[500];
   }

   public void run() {
      for(; this.isRunning; WorldMapType1.method218(50L)) {
         Object var1 = this.lock;
         Object var2 = this.lock;
         synchronized(this.lock) {
            if(this.index < 500) {
               this.xs[this.index] = MouseInput.mouseLastX;
               this.ys[this.index] = MouseInput.mouseLastY;
               ++this.index;
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lbr;II)V",
      garbageValue = "-406786730"
   )
   @Export("runScript")
   static void runScript(ScriptEvent var0, int var1) {
      Object[] var2 = var0.params;
      Script var3;
      int var4;
      if(FileSystem.method4620(var0.field518)) {
         class173.scriptMapIconReference = (MapIconReference)var2[0];
         Area var5 = Area.mapAreaType[class173.scriptMapIconReference.areaId];
         var3 = WorldMapType2.method495(var0.field518, var5.id, var5.field3277);
      } else {
         var4 = ((Integer)var2[0]).intValue();
         var3 = GraphicsObject.method1806(var4);
      }

      if(var3 != null) {
         class45.intStackSize = 0;
         class83.scriptStringStackSize = 0;
         var4 = -1;
         int[] var24 = var3.instructions;
         int[] var6 = var3.intOperands;
         byte var7 = -1;
         class69.scriptStackCount = 0;

         int var8;
         try {
            class69.scriptLocalInts = new int[var3.localIntCount];
            int var9 = 0;
            class69.scriptLocalStrings = new String[var3.localStringCount];
            int var25 = 0;

            int var11;
            String var12;
            for(var8 = 1; var8 < var2.length; ++var8) {
               if(var2[var8] instanceof Integer) {
                  var11 = ((Integer)var2[var8]).intValue();
                  if(var11 == -2147483647) {
                     var11 = var0.mouseX;
                  }

                  if(var11 == -2147483646) {
                     var11 = var0.mouseY;
                  }

                  if(var11 == -2147483645) {
                     var11 = var0.source != null?var0.source.id:-1;
                  }

                  if(var11 == -2147483644) {
                     var11 = var0.op;
                  }

                  if(var11 == -2147483643) {
                     var11 = var0.source != null?var0.source.index:-1;
                  }

                  if(var11 == -2147483642) {
                     var11 = var0.target != null?var0.target.id:-1;
                  }

                  if(var11 == -2147483641) {
                     var11 = var0.target != null?var0.target.index:-1;
                  }

                  if(var11 == -2147483640) {
                     var11 = var0.typedKeyCode;
                  }

                  if(var11 == -2147483639) {
                     var11 = var0.typedKeyChar;
                  }

                  class69.scriptLocalInts[var9++] = var11;
               } else if(var2[var8] instanceof String) {
                  var12 = (String)var2[var8];
                  if(var12.equals("event_opbase")) {
                     var12 = var0.opbase;
                  }

                  class69.scriptLocalStrings[var25++] = var12;
               }
            }

            var8 = 0;
            class69.field1025 = var0.field519;

            while(true) {
               while(true) {
                  while(true) {
                     while(true) {
                        while(true) {
                           while(true) {
                              while(true) {
                                 while(true) {
                                    while(true) {
                                       while(true) {
                                          while(true) {
                                             while(true) {
                                                while(true) {
                                                   while(true) {
                                                      while(true) {
                                                         while(true) {
                                                            while(true) {
                                                               while(true) {
                                                                  while(true) {
                                                                     while(true) {
                                                                        while(true) {
                                                                           while(true) {
                                                                              while(true) {
                                                                                 while(true) {
                                                                                    while(true) {
                                                                                       label249:
                                                                                       while(true) {
                                                                                          ++var8;
                                                                                          if(var8 > var1) {
                                                                                             throw new RuntimeException();
                                                                                          }

                                                                                          ++var4;
                                                                                          int var13 = var24[var4];
                                                                                          int var14;
                                                                                          if(var13 < 100) {
                                                                                             if(var13 != 0) {
                                                                                                if(var13 != 1) {
                                                                                                   if(var13 != 2) {
                                                                                                      if(var13 != 3) {
                                                                                                         if(var13 != 6) {
                                                                                                            if(var13 != 7) {
                                                                                                               if(var13 != 8) {
                                                                                                                  if(var13 != 9) {
                                                                                                                     if(var13 != 10) {
                                                                                                                        if(var13 != 21) {
                                                                                                                           if(var13 != 25) {
                                                                                                                              if(var13 != 27) {
                                                                                                                                 if(var13 != 31) {
                                                                                                                                    if(var13 != 32) {
                                                                                                                                       if(var13 != 33) {
                                                                                                                                          if(var13 != 34) {
                                                                                                                                             if(var13 != 35) {
                                                                                                                                                if(var13 != 36) {
                                                                                                                                                   int var27;
                                                                                                                                                   if(var13 != 37) {
                                                                                                                                                      if(var13 != 38) {
                                                                                                                                                         if(var13 != 39) {
                                                                                                                                                            if(var13 != 40) {
                                                                                                                                                               if(var13 != 42) {
                                                                                                                                                                  if(var13 != 43) {
                                                                                                                                                                     if(var13 == 44) {
                                                                                                                                                                        var11 = var6[var4] >> 16;
                                                                                                                                                                        var14 = var6[var4] & 65535;
                                                                                                                                                                        int var30 = class69.intStack[--class45.intStackSize];
                                                                                                                                                                        if(var30 >= 0 && var30 <= 5000) {
                                                                                                                                                                           class69.field1019[var11] = var30;
                                                                                                                                                                           byte var33 = -1;
                                                                                                                                                                           if(var14 == 105) {
                                                                                                                                                                              var33 = 0;
                                                                                                                                                                           }

                                                                                                                                                                           var27 = 0;

                                                                                                                                                                           while(true) {
                                                                                                                                                                              if(var27 >= var30) {
                                                                                                                                                                                 continue label249;
                                                                                                                                                                              }

                                                                                                                                                                              class69.SHAPE_VERTICES[var11][var27] = var33;
                                                                                                                                                                              ++var27;
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        throw new RuntimeException();
                                                                                                                                                                     } else if(var13 == 45) {
                                                                                                                                                                        var11 = var6[var4];
                                                                                                                                                                        var14 = class69.intStack[--class45.intStackSize];
                                                                                                                                                                        if(var14 < 0 || var14 >= class69.field1019[var11]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        class69.intStack[++class45.intStackSize - 1] = class69.SHAPE_VERTICES[var11][var14];
                                                                                                                                                                     } else if(var13 == 46) {
                                                                                                                                                                        var11 = var6[var4];
                                                                                                                                                                        class45.intStackSize -= 2;
                                                                                                                                                                        var14 = class69.intStack[class45.intStackSize];
                                                                                                                                                                        if(var14 < 0 || var14 >= class69.field1019[var11]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        class69.SHAPE_VERTICES[var11][var14] = class69.intStack[class45.intStackSize + 1];
                                                                                                                                                                     } else if(var13 == 47) {
                                                                                                                                                                        var12 = Permission.varcs.getVarcString(var6[var4]);
                                                                                                                                                                        if(var12 == null) {
                                                                                                                                                                           var12 = "null";
                                                                                                                                                                        }

                                                                                                                                                                        class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var12;
                                                                                                                                                                     } else if(var13 == 48) {
                                                                                                                                                                        Permission.varcs.putVarcString(var6[var4], class69.scriptStringStack[--class83.scriptStringStackSize]);
                                                                                                                                                                     } else {
                                                                                                                                                                        if(var13 != 60) {
                                                                                                                                                                           throw new IllegalStateException();
                                                                                                                                                                        }

                                                                                                                                                                        IterableHashTable var29 = var3.switches[var6[var4]];
                                                                                                                                                                        IntegerNode var32 = (IntegerNode)var29.get((long)class69.intStack[--class45.intStackSize]);
                                                                                                                                                                        if(var32 != null) {
                                                                                                                                                                           var4 += var32.value;
                                                                                                                                                                        }
                                                                                                                                                                     }
                                                                                                                                                                  } else {
                                                                                                                                                                     Permission.varcs.putVarc(var6[var4], class69.intStack[--class45.intStackSize]);
                                                                                                                                                                  }
                                                                                                                                                               } else {
                                                                                                                                                                  class69.intStack[++class45.intStackSize - 1] = Permission.varcs.getVarc(var6[var4]);
                                                                                                                                                               }
                                                                                                                                                            } else {
                                                                                                                                                               var11 = var6[var4];
                                                                                                                                                               Script var28 = GraphicsObject.method1806(var11);
                                                                                                                                                               int[] var31 = new int[var28.localIntCount];
                                                                                                                                                               String[] var35 = new String[var28.localStringCount];

                                                                                                                                                               for(var27 = 0; var27 < var28.intStackCount; ++var27) {
                                                                                                                                                                  var31[var27] = class69.intStack[var27 + (class45.intStackSize - var28.intStackCount)];
                                                                                                                                                               }

                                                                                                                                                               for(var27 = 0; var27 < var28.stringStackCount; ++var27) {
                                                                                                                                                                  var35[var27] = class69.scriptStringStack[var27 + (class83.scriptStringStackSize - var28.stringStackCount)];
                                                                                                                                                               }

                                                                                                                                                               class45.intStackSize -= var28.intStackCount;
                                                                                                                                                               class83.scriptStringStackSize -= var28.stringStackCount;
                                                                                                                                                               ScriptState var36 = new ScriptState();
                                                                                                                                                               var36.invokedFromScript = var3;
                                                                                                                                                               var36.invokedFromPc = var4;
                                                                                                                                                               var36.savedLocalInts = class69.scriptLocalInts;
                                                                                                                                                               var36.savedLocalStrings = class69.scriptLocalStrings;
                                                                                                                                                               class69.scriptStack[++class69.scriptStackCount - 1] = var36;
                                                                                                                                                               var3 = var28;
                                                                                                                                                               var24 = var28.instructions;
                                                                                                                                                               var6 = var28.intOperands;
                                                                                                                                                               var4 = -1;
                                                                                                                                                               class69.scriptLocalInts = var31;
                                                                                                                                                               class69.scriptLocalStrings = var35;
                                                                                                                                                            }
                                                                                                                                                         } else {
                                                                                                                                                            --class83.scriptStringStackSize;
                                                                                                                                                         }
                                                                                                                                                      } else {
                                                                                                                                                         --class45.intStackSize;
                                                                                                                                                      }
                                                                                                                                                   } else {
                                                                                                                                                      var11 = var6[var4];
                                                                                                                                                      class83.scriptStringStackSize -= var11;
                                                                                                                                                      String[] var16 = class69.scriptStringStack;
                                                                                                                                                      int var17 = class83.scriptStringStackSize;
                                                                                                                                                      String var18;
                                                                                                                                                      if(var11 == 0) {
                                                                                                                                                         var18 = "";
                                                                                                                                                      } else if(var11 == 1) {
                                                                                                                                                         String var19 = var16[var17];
                                                                                                                                                         if(var19 == null) {
                                                                                                                                                            var18 = "null";
                                                                                                                                                         } else {
                                                                                                                                                            var18 = var19.toString();
                                                                                                                                                         }
                                                                                                                                                      } else {
                                                                                                                                                         var27 = var11 + var17;
                                                                                                                                                         int var34 = 0;

                                                                                                                                                         for(int var20 = var17; var20 < var27; ++var20) {
                                                                                                                                                            String var21 = var16[var20];
                                                                                                                                                            if(var21 == null) {
                                                                                                                                                               var34 += 4;
                                                                                                                                                            } else {
                                                                                                                                                               var34 += var21.length();
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         StringBuilder var37 = new StringBuilder(var34);

                                                                                                                                                         for(int var38 = var17; var38 < var27; ++var38) {
                                                                                                                                                            String var22 = var16[var38];
                                                                                                                                                            if(var22 == null) {
                                                                                                                                                               var37.append("null");
                                                                                                                                                            } else {
                                                                                                                                                               var37.append(var22);
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         var18 = var37.toString();
                                                                                                                                                      }

                                                                                                                                                      class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var18;
                                                                                                                                                   }
                                                                                                                                                } else {
                                                                                                                                                   class69.scriptLocalStrings[var6[var4]] = class69.scriptStringStack[--class83.scriptStringStackSize];
                                                                                                                                                }
                                                                                                                                             } else {
                                                                                                                                                class69.scriptStringStack[++class83.scriptStringStackSize - 1] = class69.scriptLocalStrings[var6[var4]];
                                                                                                                                             }
                                                                                                                                          } else {
                                                                                                                                             class69.scriptLocalInts[var6[var4]] = class69.intStack[--class45.intStackSize];
                                                                                                                                          }
                                                                                                                                       } else {
                                                                                                                                          class69.intStack[++class45.intStackSize - 1] = class69.scriptLocalInts[var6[var4]];
                                                                                                                                       }
                                                                                                                                    } else {
                                                                                                                                       class45.intStackSize -= 2;
                                                                                                                                       if(class69.intStack[class45.intStackSize] >= class69.intStack[class45.intStackSize + 1]) {
                                                                                                                                          var4 += var6[var4];
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 } else {
                                                                                                                                    class45.intStackSize -= 2;
                                                                                                                                    if(class69.intStack[class45.intStackSize] <= class69.intStack[class45.intStackSize + 1]) {
                                                                                                                                       var4 += var6[var4];
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 var11 = var6[var4];
                                                                                                                                 class187.method3844(var11, class69.intStack[--class45.intStackSize]);
                                                                                                                              }
                                                                                                                           } else {
                                                                                                                              var11 = var6[var4];
                                                                                                                              class69.intStack[++class45.intStackSize - 1] = class138.getVarbit(var11);
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           if(class69.scriptStackCount == 0) {
                                                                                                                              return;
                                                                                                                           }

                                                                                                                           ScriptState var26 = class69.scriptStack[--class69.scriptStackCount];
                                                                                                                           var3 = var26.invokedFromScript;
                                                                                                                           var24 = var3.instructions;
                                                                                                                           var6 = var3.intOperands;
                                                                                                                           var4 = var26.invokedFromPc;
                                                                                                                           class69.scriptLocalInts = var26.savedLocalInts;
                                                                                                                           class69.scriptLocalStrings = var26.savedLocalStrings;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        class45.intStackSize -= 2;
                                                                                                                        if(class69.intStack[class45.intStackSize] > class69.intStack[class45.intStackSize + 1]) {
                                                                                                                           var4 += var6[var4];
                                                                                                                        }
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     class45.intStackSize -= 2;
                                                                                                                     if(class69.intStack[class45.intStackSize] < class69.intStack[class45.intStackSize + 1]) {
                                                                                                                        var4 += var6[var4];
                                                                                                                     }
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  class45.intStackSize -= 2;
                                                                                                                  if(class69.intStack[class45.intStackSize] == class69.intStack[class45.intStackSize + 1]) {
                                                                                                                     var4 += var6[var4];
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               class45.intStackSize -= 2;
                                                                                                               if(class69.intStack[class45.intStackSize] != class69.intStack[class45.intStackSize + 1]) {
                                                                                                                  var4 += var6[var4];
                                                                                                               }
                                                                                                            }
                                                                                                         } else {
                                                                                                            var4 += var6[var4];
                                                                                                         }
                                                                                                      } else {
                                                                                                         class69.scriptStringStack[++class83.scriptStringStackSize - 1] = var3.stringOperands[var4];
                                                                                                      }
                                                                                                   } else {
                                                                                                      var11 = var6[var4];
                                                                                                      class225.clientVarps[var11] = class69.intStack[--class45.intStackSize];
                                                                                                      Widget.method4537(var11);
                                                                                                   }
                                                                                                } else {
                                                                                                   var11 = var6[var4];
                                                                                                   class69.intStack[++class45.intStackSize - 1] = class225.clientVarps[var11];
                                                                                                }
                                                                                             } else {
                                                                                                class69.intStack[++class45.intStackSize - 1] = var6[var4];
                                                                                             }
                                                                                          } else {
                                                                                             boolean var15;
                                                                                             if(var3.intOperands[var4] == 1) {
                                                                                                var15 = true;
                                                                                             } else {
                                                                                                var15 = false;
                                                                                             }

                                                                                             var14 = class126.method3072(var13, var3, var15);
                                                                                             switch(var14) {
                                                                                             case 0:
                                                                                                return;
                                                                                             case 1:
                                                                                             default:
                                                                                                break;
                                                                                             case 2:
                                                                                                throw new IllegalStateException();
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
               }
            }
         } catch (Exception var23) {
            StringBuilder var10 = new StringBuilder(30);
            var10.append("").append(var3.hash).append(" ");

            for(var8 = class69.scriptStackCount - 1; var8 >= 0; --var8) {
               var10.append("").append(class69.scriptStack[var8].invokedFromScript.hash).append(" ");
            }

            var10.append("").append(var7);
            class43.processClientError(var10.toString(), var23);
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-9"
   )
   static String method1085() {
      return ScriptState.preferences.hideUsername?TextureProvider.method2592(class78.username):class78.username;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-2106134469"
   )
   static int method1090(int var0, Script var1, boolean var2) {
      Widget var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
      } else {
         var3 = var2?class184.field2379:FriendManager.field996;
      }

      String var4 = class69.scriptStringStack[--class83.scriptStringStackSize];
      int[] var5 = null;
      if(var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = class69.intStack[--class45.intStackSize];
         if(var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = class69.intStack[--class45.intStackSize]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if(var4.charAt(var7 - 1) == 's') {
            var8[var7] = class69.scriptStringStack[--class83.scriptStringStackSize];
         } else {
            var8[var7] = new Integer(class69.intStack[--class45.intStackSize]);
         }
      }

      var7 = class69.intStack[--class45.intStackSize];
      if(var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if(var0 == 1400) {
         var3.onClickListener = var8;
      } else if(var0 == 1401) {
         var3.onHoldListener = var8;
      } else if(var0 == 1402) {
         var3.onReleaseListener = var8;
      } else if(var0 == 1403) {
         var3.onMouseOverListener = var8;
      } else if(var0 == 1404) {
         var3.onMouseLeaveListener = var8;
      } else if(var0 == 1405) {
         var3.onDragListener = var8;
      } else if(var0 == 1406) {
         var3.onTargetLeaveListener = var8;
      } else if(var0 == 1407) {
         var3.onVarTransmitListener = var8;
         var3.varTransmitTriggers = var5;
      } else if(var0 == 1408) {
         var3.onTimerListener = var8;
      } else if(var0 == 1409) {
         var3.onOpListener = var8;
      } else if(var0 == 1410) {
         var3.onDragCompleteListener = var8;
      } else if(var0 == 1411) {
         var3.onClickRepeatListener = var8;
      } else if(var0 == 1412) {
         var3.onMouseRepeatListener = var8;
      } else if(var0 == 1414) {
         var3.onInvTransmitListener = var8;
         var3.invTransmitTriggers = var5;
      } else if(var0 == 1415) {
         var3.onStatTransmitListener = var8;
         var3.statTransmitTriggers = var5;
      } else if(var0 == 1416) {
         var3.onTargetEnterListener = var8;
      } else if(var0 == 1417) {
         var3.onScrollWheelListener = var8;
      } else if(var0 == 1418) {
         var3.onChatTransmitListener = var8;
      } else if(var0 == 1419) {
         var3.onKeyListener = var8;
      } else if(var0 == 1420) {
         var3.onFriendTransmitListener = var8;
      } else if(var0 == 1421) {
         var3.onClanTransmitListener = var8;
      } else if(var0 == 1422) {
         var3.onMiscTransmitListener = var8;
      } else if(var0 == 1423) {
         var3.onDialogAbortListener = var8;
      } else if(var0 == 1424) {
         var3.onSubChangeListener = var8;
      } else if(var0 == 1425) {
         var3.onStockTransmitListener = var8;
      } else if(var0 == 1426) {
         var3.onCamFinishedListener = var8;
      } else {
         if(var0 != 1427) {
            return 2;
         }

         var3.onResizeListener = var8;
      }

      var3.hasListener = true;
      return 1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "825066086"
   )
   public static String method1089(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if(var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if(var5 != 181 && var5 != 131) {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(var5 != '.' && var5 != '?' && var5 != '!') {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }
}
