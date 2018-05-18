import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class57 implements Runnable {

   @ObfuscatedName("g")
   static int[][][] field534;
   @ObfuscatedName("w")
   boolean field531 = true;
   @ObfuscatedName("m")
   Object field528 = new Object();
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -528874791
   )
   int field533 = 0;
   @ObfuscatedName("b")
   int[] field530 = new int[500];
   @ObfuscatedName("f")
   int[] field529 = new int[500];


   public void run() {
      for(; this.field531; class18.method218(50L)) {
         Object var1 = this.field528;
         synchronized(this.field528) {
            if(this.field533 < 500) {
               this.field530[this.field533] = class48.field425;
               this.field529[this.field533] = class48.field417;
               ++this.field533;
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lbr;II)V",
      garbageValue = "-406786730"
   )
   static void method1092(class56 var0, int var1) {
      Object[] var2 = var0.field525;
      class84 var3;
      int var20;
      if(class245.method4620(var0.field518)) {
         class173.field2293 = (class36)var2[0];
         class255 var4 = class255.field3274[class173.field2293.field312];
         var3 = class27.method495(var0.field518, var4.field3261, var4.field3277);
      } else {
         var20 = ((Integer)var2[0]).intValue();
         var3 = class70.method1806(var20);
      }

      if(var3 != null) {
         class45.field377 = 0;
         class83.field1207 = 0;
         var20 = -1;
         int[] var5 = var3.field1211;
         int[] var6 = var3.field1216;
         byte var7 = -1;
         class69.field1022 = 0;

         int var10;
         try {
            class69.field1016 = new int[var3.field1213];
            int var8 = 0;
            class69.field1017 = new String[var3.field1210];
            int var9 = 0;

            int var11;
            String var21;
            for(var10 = 1; var10 < var2.length; ++var10) {
               if(var2[var10] instanceof Integer) {
                  var11 = ((Integer)var2[var10]).intValue();
                  if(var11 == -2147483647) {
                     var11 = var0.field512;
                  }

                  if(var11 == -2147483646) {
                     var11 = var0.field513;
                  }

                  if(var11 == -2147483645) {
                     var11 = var0.field511 != null?var0.field511.field2623:-1;
                  }

                  if(var11 == -2147483644) {
                     var11 = var0.field514;
                  }

                  if(var11 == -2147483643) {
                     var11 = var0.field511 != null?var0.field511.field2633:-1;
                  }

                  if(var11 == -2147483642) {
                     var11 = var0.field515 != null?var0.field515.field2623:-1;
                  }

                  if(var11 == -2147483641) {
                     var11 = var0.field515 != null?var0.field515.field2633:-1;
                  }

                  if(var11 == -2147483640) {
                     var11 = var0.field520;
                  }

                  if(var11 == -2147483639) {
                     var11 = var0.field510;
                  }

                  class69.field1016[var8++] = var11;
               } else if(var2[var10] instanceof String) {
                  var21 = (String)var2[var10];
                  if(var21.equals("event_opbase")) {
                     var21 = var0.field509;
                  }

                  class69.field1017[var9++] = var21;
               }
            }

            var10 = 0;
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
                                                                                       label315:
                                                                                       while(true) {
                                                                                          ++var10;
                                                                                          if(var10 > var1) {
                                                                                             throw new RuntimeException();
                                                                                          }

                                                                                          ++var20;
                                                                                          int var31 = var5[var20];
                                                                                          int var26;
                                                                                          if(var31 < 100) {
                                                                                             if(var31 != 0) {
                                                                                                if(var31 != 1) {
                                                                                                   if(var31 != 2) {
                                                                                                      if(var31 != 3) {
                                                                                                         if(var31 != 6) {
                                                                                                            if(var31 != 7) {
                                                                                                               if(var31 != 8) {
                                                                                                                  if(var31 != 9) {
                                                                                                                     if(var31 != 10) {
                                                                                                                        if(var31 != 21) {
                                                                                                                           if(var31 != 25) {
                                                                                                                              if(var31 != 27) {
                                                                                                                                 if(var31 != 31) {
                                                                                                                                    if(var31 != 32) {
                                                                                                                                       if(var31 != 33) {
                                                                                                                                          if(var31 != 34) {
                                                                                                                                             if(var31 != 35) {
                                                                                                                                                if(var31 != 36) {
                                                                                                                                                   int var22;
                                                                                                                                                   if(var31 != 37) {
                                                                                                                                                      if(var31 != 38) {
                                                                                                                                                         if(var31 != 39) {
                                                                                                                                                            if(var31 != 40) {
                                                                                                                                                               if(var31 != 42) {
                                                                                                                                                                  if(var31 != 43) {
                                                                                                                                                                     if(var31 == 44) {
                                                                                                                                                                        var11 = var6[var20] >> 16;
                                                                                                                                                                        var26 = var6[var20] & '\uffff';
                                                                                                                                                                        int var27 = class69.field1026[--class45.field377];
                                                                                                                                                                        if(var27 >= 0 && var27 <= 5000) {
                                                                                                                                                                           class69.field1019[var11] = var27;
                                                                                                                                                                           byte var35 = -1;
                                                                                                                                                                           if(var26 == 105) {
                                                                                                                                                                              var35 = 0;
                                                                                                                                                                           }

                                                                                                                                                                           var22 = 0;

                                                                                                                                                                           while(true) {
                                                                                                                                                                              if(var22 >= var27) {
                                                                                                                                                                                 continue label315;
                                                                                                                                                                              }

                                                                                                                                                                              class69.field1015[var11][var22] = var35;
                                                                                                                                                                              ++var22;
                                                                                                                                                                           }
                                                                                                                                                                        }

                                                                                                                                                                        throw new RuntimeException();
                                                                                                                                                                     } else if(var31 == 45) {
                                                                                                                                                                        var11 = var6[var20];
                                                                                                                                                                        var26 = class69.field1026[--class45.field377];
                                                                                                                                                                        if(var26 < 0 || var26 >= class69.field1019[var11]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        class69.field1026[++class45.field377 - 1] = class69.field1015[var11][var26];
                                                                                                                                                                     } else if(var31 == 46) {
                                                                                                                                                                        var11 = var6[var20];
                                                                                                                                                                        class45.field377 -= 2;
                                                                                                                                                                        var26 = class69.field1026[class45.field377];
                                                                                                                                                                        if(var26 < 0 || var26 >= class69.field1019[var11]) {
                                                                                                                                                                           throw new RuntimeException();
                                                                                                                                                                        }

                                                                                                                                                                        class69.field1015[var11][var26] = class69.field1026[class45.field377 + 1];
                                                                                                                                                                     } else if(var31 == 47) {
                                                                                                                                                                        var21 = class242.field3144.method1928(var6[var20]);
                                                                                                                                                                        if(var21 == null) {
                                                                                                                                                                           var21 = "null";
                                                                                                                                                                        }

                                                                                                                                                                        class69.field1021[++class83.field1207 - 1] = var21;
                                                                                                                                                                     } else if(var31 == 48) {
                                                                                                                                                                        class242.field3144.method1927(var6[var20], class69.field1021[--class83.field1207]);
                                                                                                                                                                     } else {
                                                                                                                                                                        if(var31 != 60) {
                                                                                                                                                                           throw new IllegalStateException();
                                                                                                                                                                        }

                                                                                                                                                                        class197 var39 = var3.field1217[var6[var20]];
                                                                                                                                                                        class211 var34 = (class211)var39.method3991((long)class69.field1026[--class45.field377]);
                                                                                                                                                                        if(var34 != null) {
                                                                                                                                                                           var20 += var34.field2464;
                                                                                                                                                                        }
                                                                                                                                                                     }
                                                                                                                                                                  } else {
                                                                                                                                                                     class242.field3144.method1953(var6[var20], class69.field1026[--class45.field377]);
                                                                                                                                                                  }
                                                                                                                                                               } else {
                                                                                                                                                                  class69.field1026[++class45.field377 - 1] = class242.field3144.method1925(var6[var20]);
                                                                                                                                                               }
                                                                                                                                                            } else {
                                                                                                                                                               var11 = var6[var20];
                                                                                                                                                               class84 var33 = class70.method1806(var11);
                                                                                                                                                               int[] var32 = new int[var33.field1213];
                                                                                                                                                               String[] var25 = new String[var33.field1210];

                                                                                                                                                               for(var22 = 0; var22 < var33.field1215; ++var22) {
                                                                                                                                                                  var32[var22] = class69.field1026[var22 + (class45.field377 - var33.field1215)];
                                                                                                                                                               }

                                                                                                                                                               for(var22 = 0; var22 < var33.field1209; ++var22) {
                                                                                                                                                                  var25[var22] = class69.field1021[var22 + (class83.field1207 - var33.field1209)];
                                                                                                                                                               }

                                                                                                                                                               class45.field377 -= var33.field1215;
                                                                                                                                                               class83.field1207 -= var33.field1209;
                                                                                                                                                               class51 var36 = new class51();
                                                                                                                                                               var36.field467 = var3;
                                                                                                                                                               var36.field464 = var20;
                                                                                                                                                               var36.field465 = class69.field1016;
                                                                                                                                                               var36.field466 = class69.field1017;
                                                                                                                                                               class69.field1023[++class69.field1022 - 1] = var36;
                                                                                                                                                               var3 = var33;
                                                                                                                                                               var5 = var33.field1211;
                                                                                                                                                               var6 = var33.field1216;
                                                                                                                                                               var20 = -1;
                                                                                                                                                               class69.field1016 = var32;
                                                                                                                                                               class69.field1017 = var25;
                                                                                                                                                            }
                                                                                                                                                         } else {
                                                                                                                                                            --class83.field1207;
                                                                                                                                                         }
                                                                                                                                                      } else {
                                                                                                                                                         --class45.field377;
                                                                                                                                                      }
                                                                                                                                                   } else {
                                                                                                                                                      var11 = var6[var20];
                                                                                                                                                      class83.field1207 -= var11;
                                                                                                                                                      String[] var13 = class69.field1021;
                                                                                                                                                      int var14 = class83.field1207;
                                                                                                                                                      String var12;
                                                                                                                                                      if(var11 == 0) {
                                                                                                                                                         var12 = "";
                                                                                                                                                      } else if(var11 == 1) {
                                                                                                                                                         String var15 = var13[var14];
                                                                                                                                                         if(var15 == null) {
                                                                                                                                                            var12 = "null";
                                                                                                                                                         } else {
                                                                                                                                                            var12 = var15.toString();
                                                                                                                                                         }
                                                                                                                                                      } else {
                                                                                                                                                         var22 = var11 + var14;
                                                                                                                                                         int var16 = 0;

                                                                                                                                                         for(int var17 = var14; var17 < var22; ++var17) {
                                                                                                                                                            String var18 = var13[var17];
                                                                                                                                                            if(var18 == null) {
                                                                                                                                                               var16 += 4;
                                                                                                                                                            } else {
                                                                                                                                                               var16 += var18.length();
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         StringBuilder var23 = new StringBuilder(var16);

                                                                                                                                                         for(int var24 = var14; var24 < var22; ++var24) {
                                                                                                                                                            String var19 = var13[var24];
                                                                                                                                                            if(var19 == null) {
                                                                                                                                                               var23.append("null");
                                                                                                                                                            } else {
                                                                                                                                                               var23.append(var19);
                                                                                                                                                            }
                                                                                                                                                         }

                                                                                                                                                         var12 = var23.toString();
                                                                                                                                                      }

                                                                                                                                                      class69.field1021[++class83.field1207 - 1] = var12;
                                                                                                                                                   }
                                                                                                                                                } else {
                                                                                                                                                   class69.field1017[var6[var20]] = class69.field1021[--class83.field1207];
                                                                                                                                                }
                                                                                                                                             } else {
                                                                                                                                                class69.field1021[++class83.field1207 - 1] = class69.field1017[var6[var20]];
                                                                                                                                             }
                                                                                                                                          } else {
                                                                                                                                             class69.field1016[var6[var20]] = class69.field1026[--class45.field377];
                                                                                                                                          }
                                                                                                                                       } else {
                                                                                                                                          class69.field1026[++class45.field377 - 1] = class69.field1016[var6[var20]];
                                                                                                                                       }
                                                                                                                                    } else {
                                                                                                                                       class45.field377 -= 2;
                                                                                                                                       if(class69.field1026[class45.field377] >= class69.field1026[class45.field377 + 1]) {
                                                                                                                                          var20 += var6[var20];
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 } else {
                                                                                                                                    class45.field377 -= 2;
                                                                                                                                    if(class69.field1026[class45.field377] <= class69.field1026[class45.field377 + 1]) {
                                                                                                                                       var20 += var6[var20];
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              } else {
                                                                                                                                 var11 = var6[var20];
                                                                                                                                 class187.method3844(var11, class69.field1026[--class45.field377]);
                                                                                                                              }
                                                                                                                           } else {
                                                                                                                              var11 = var6[var20];
                                                                                                                              class69.field1026[++class45.field377 - 1] = class138.method3159(var11);
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                           if(class69.field1022 == 0) {
                                                                                                                              return;
                                                                                                                           }

                                                                                                                           class51 var38 = class69.field1023[--class69.field1022];
                                                                                                                           var3 = var38.field467;
                                                                                                                           var5 = var3.field1211;
                                                                                                                           var6 = var3.field1216;
                                                                                                                           var20 = var38.field464;
                                                                                                                           class69.field1016 = var38.field465;
                                                                                                                           class69.field1017 = var38.field466;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        class45.field377 -= 2;
                                                                                                                        if(class69.field1026[class45.field377] > class69.field1026[class45.field377 + 1]) {
                                                                                                                           var20 += var6[var20];
                                                                                                                        }
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     class45.field377 -= 2;
                                                                                                                     if(class69.field1026[class45.field377] < class69.field1026[class45.field377 + 1]) {
                                                                                                                        var20 += var6[var20];
                                                                                                                     }
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  class45.field377 -= 2;
                                                                                                                  if(class69.field1026[class45.field377] == class69.field1026[class45.field377 + 1]) {
                                                                                                                     var20 += var6[var20];
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               class45.field377 -= 2;
                                                                                                               if(class69.field1026[class45.field377] != class69.field1026[class45.field377 + 1]) {
                                                                                                                  var20 += var6[var20];
                                                                                                               }
                                                                                                            }
                                                                                                         } else {
                                                                                                            var20 += var6[var20];
                                                                                                         }
                                                                                                      } else {
                                                                                                         class69.field1021[++class83.field1207 - 1] = var3.field1212[var20];
                                                                                                      }
                                                                                                   } else {
                                                                                                      var11 = var6[var20];
                                                                                                      class225.field2578[var11] = class69.field1026[--class45.field377];
                                                                                                      class230.method4537(var11);
                                                                                                   }
                                                                                                } else {
                                                                                                   var11 = var6[var20];
                                                                                                   class69.field1026[++class45.field377 - 1] = class225.field2578[var11];
                                                                                                }
                                                                                             } else {
                                                                                                class69.field1026[++class45.field377 - 1] = var6[var20];
                                                                                             }
                                                                                          } else {
                                                                                             boolean var37;
                                                                                             if(var3.field1216[var20] == 1) {
                                                                                                var37 = true;
                                                                                             } else {
                                                                                                var37 = false;
                                                                                             }

                                                                                             var26 = class126.method3072(var31, var3, var37);
                                                                                             switch(var26) {
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
         } catch (Exception var30) {
            StringBuilder var29 = new StringBuilder(30);
            var29.append("").append(var3.field2449).append(" ");

            for(var10 = class69.field1022 - 1; var10 >= 0; --var10) {
               var29.append("").append(class69.field1023[var10].field467.field2449).append(" ");
            }

            var29.append("").append(var7);
            class43.method786(var29.toString(), var30);
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-9"
   )
   static String method1085() {
      return class51.field468.field977?class111.method2592(class78.field1127):class78.field1127;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-2106134469"
   )
   static int method1090(int var0, class84 var1, boolean var2) {
      class230 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class61.method1188(class69.field1026[--class45.field377]);
      } else {
         var3 = var2?class184.field2379:class67.field996;
      }

      String var4 = class69.field1021[--class83.field1207];
      int[] var5 = null;
      if(var4.length() > 0 && var4.charAt(var4.length() - 1) == 89) {
         int var6 = class69.field1026[--class45.field377];
         if(var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = class69.field1026[--class45.field377]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if(var4.charAt(var7 - 1) == 115) {
            var8[var7] = class69.field1021[--class83.field1207];
         } else {
            var8[var7] = new Integer(class69.field1026[--class45.field377]);
         }
      }

      var7 = class69.field1026[--class45.field377];
      if(var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if(var0 == 1400) {
         var3.field2706 = var8;
      } else if(var0 == 1401) {
         var3.field2709 = var8;
      } else if(var0 == 1402) {
         var3.field2708 = var8;
      } else if(var0 == 1403) {
         var3.field2705 = var8;
      } else if(var0 == 1404) {
         var3.field2712 = var8;
      } else if(var0 == 1405) {
         var3.field2717 = var8;
      } else if(var0 == 1406) {
         var3.field2716 = var8;
      } else if(var0 == 1407) {
         var3.field2726 = var8;
         var3.field2748 = var5;
      } else if(var0 == 1408) {
         var3.field2723 = var8;
      } else if(var0 == 1409) {
         var3.field2610 = var8;
      } else if(var0 == 1410) {
         var3.field2714 = var8;
      } else if(var0 == 1411) {
         var3.field2659 = var8;
      } else if(var0 == 1412) {
         var3.field2724 = var8;
      } else if(var0 == 1414) {
         var3.field2719 = var8;
         var3.field2720 = var5;
      } else if(var0 == 1415) {
         var3.field2721 = var8;
         var3.field2722 = var5;
      } else if(var0 == 1416) {
         var3.field2715 = var8;
      } else if(var0 == 1417) {
         var3.field2630 = var8;
      } else if(var0 == 1418) {
         var3.field2680 = var8;
      } else if(var0 == 1419) {
         var3.field2727 = var8;
      } else if(var0 == 1420) {
         var3.field2728 = var8;
      } else if(var0 == 1421) {
         var3.field2751 = var8;
      } else if(var0 == 1422) {
         var3.field2730 = var8;
      } else if(var0 == 1423) {
         var3.field2713 = var8;
      } else if(var0 == 1424) {
         var3.field2732 = var8;
      } else if(var0 == 1425) {
         var3.field2734 = var8;
      } else if(var0 == 1426) {
         var3.field2735 = var8;
      } else {
         if(var0 != 1427) {
            return 2;
         }

         var3.field2745 = var8;
      }

      var3.field2704 = true;
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
         } else if(var5 != 46 && var5 != 63 && var5 != 33) {
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
