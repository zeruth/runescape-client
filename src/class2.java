import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class2 {

   @ObfuscatedName("pl")
   @ObfuscatedSignature(
      signature = "Lcc;"
   )
   static class95 field11;
   @ObfuscatedName("pz")
   @ObfuscatedGetter(
      intValue = -881463437
   )
   static int field19;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -842420131
   )
   public final int field17;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = 2380918939930674867L
   )
   public final long field10;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lf;"
   )
   public final class4 field13;
   @ObfuscatedName("b")
   String field12;
   @ObfuscatedName("f")
   String field14;


   @ObfuscatedSignature(
      signature = "(Lgy;BI)V"
   )
   class2(class182 var1, byte var2, int var3) {
      this.field12 = var1.method3577();
      this.field14 = var1.method3577();
      this.field17 = var1.method3574();
      this.field10 = var1.method3792();
      int var4 = var1.method3573();
      int var5 = var1.method3573();
      this.field13 = new class4();
      this.field13.method52(2);
      this.field13.method36(var2);
      this.field13.field27 = var4;
      this.field13.field28 = var5;
      this.field13.field29 = 0;
      this.field13.field30 = 0;
      this.field13.field26 = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(S)Ljava/lang/String;",
      garbageValue = "255"
   )
   public String method16() {
      return this.field12;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-1"
   )
   public String method17() {
      return this.field14;
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(ZLge;B)V",
      garbageValue = "0"
   )
   static final void method24(boolean var0, class189 var1) {
      client.field713 = 0;
      client.field637 = 0;
      class189 var2 = client.field739.field1254;
      var2.method3898();
      int var3 = var2.method3871(8);
      int var4;
      if(var3 < client.field635) {
         for(var4 = var3; var4 < client.field635; ++var4) {
            client.field714[++client.field713 - 1] = client.field636[var4];
         }
      }

      if(var3 > client.field635) {
         throw new RuntimeException("");
      } else {
         client.field635 = 0;

         int var5;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = client.field636[var4];
            class72 var6 = client.field807[var5];
            var7 = var2.method3871(1);
            if(var7 == 0) {
               client.field636[++client.field635 - 1] = var5;
               var6.field932 = client.field679;
            } else {
               var8 = var2.method3871(2);
               if(var8 == 0) {
                  client.field636[++client.field635 - 1] = var5;
                  var6.field932 = client.field679;
                  client.field638[++client.field637 - 1] = var5;
               } else if(var8 == 1) {
                  client.field636[++client.field635 - 1] = var5;
                  var6.field932 = client.field679;
                  var9 = var2.method3871(3);
                  var6.method1824(var9, (byte)1);
                  var10 = var2.method3871(1);
                  if(var10 == 1) {
                     client.field638[++client.field637 - 1] = var5;
                  }
               } else if(var8 == 2) {
                  client.field636[++client.field635 - 1] = var5;
                  var6.field932 = client.field679;
                  var9 = var2.method3871(3);
                  var6.method1824(var9, (byte)2);
                  var10 = var2.method3871(3);
                  var6.method1824(var10, (byte)2);
                  var11 = var2.method3871(1);
                  if(var11 == 1) {
                     client.field638[++client.field637 - 1] = var5;
                  }
               } else if(var8 == 3) {
                  client.field714[++client.field713 - 1] = var5;
               }
            }
         }

         class130.method3096(var0, var1);

         int var14;
         for(var14 = 0; var14 < client.field637; ++var14) {
            var3 = client.field638[var14];
            class72 var15 = client.field807[var3];
            var5 = var1.method3742();
            if((var5 & 2) != 0) {
               var15.field935 = var1.method3784();
               if(var15.field935 == '\uffff') {
                  var15.field935 = -1;
               }
            }

            int var16;
            if((var5 & 32) != 0) {
               var16 = var1.method3597();
               int var12;
               if(var16 > 0) {
                  for(var7 = 0; var7 < var16; ++var7) {
                     var9 = -1;
                     var10 = -1;
                     var11 = -1;
                     var8 = var1.method3599();
                     if(var8 == 32767) {
                        var8 = var1.method3599();
                        var10 = var1.method3599();
                        var9 = var1.method3599();
                        var11 = var1.method3599();
                     } else if(var8 != 32766) {
                        var10 = var1.method3599();
                     } else {
                        var8 = -1;
                     }

                     var12 = var1.method3599();
                     var15.method1582(var8, var10, var9, var11, client.field679, var12);
                  }
               }

               var7 = var1.method3553();
               if(var7 > 0) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var1.method3599();
                     var10 = var1.method3599();
                     if(var10 != 32767) {
                        var11 = var1.method3599();
                        var12 = var1.method3553();
                        int var13 = var10 > 0?var1.method3553():var12;
                        var15.method1583(var9, client.field679, var10, var11, var12, var13);
                     } else {
                        var15.method1579(var9);
                     }
                  }
               }
            }

            if((var5 & 8) != 0) {
               var16 = var1.method3574();
               var7 = var1.method3784();
               var8 = var15.field900 - (var16 - class178.field2315 - class178.field2315) * 64;
               var9 = var15.field918 - (var7 - class71.field1051 - class71.field1051) * 64;
               if(var8 != 0 || var9 != 0) {
                  var15.field897 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
               }
            }

            if((var5 & 16) != 0) {
               var15.field920 = var1.method3574();
               var16 = var1.method3618();
               var15.field924 = var16 >> 16;
               var15.field923 = (var16 & '\uffff') + client.field679;
               var15.field921 = 0;
               var15.field903 = 0;
               if(var15.field923 > client.field679) {
                  var15.field921 = -1;
               }

               if(var15.field920 == '\uffff') {
                  var15.field920 = -1;
               }
            }

            if((var5 & 4) != 0) {
               var16 = var1.method3676();
               if(var16 == '\uffff') {
                  var16 = -1;
               }

               var7 = var1.method3597();
               if(var16 == var15.field915 && var16 != -1) {
                  var8 = class137.method3151(var16).field3566;
                  if(var8 == 1) {
                     var15.field916 = 0;
                     var15.field917 = 0;
                     var15.field913 = var7;
                     var15.field919 = 0;
                  }

                  if(var8 == 2) {
                     var15.field919 = 0;
                  }
               } else if(var16 == -1 || var15.field915 == -1 || class137.method3151(var16).field3560 >= class137.method3151(var15.field915).field3560) {
                  var15.field915 = var16;
                  var15.field916 = 0;
                  var15.field917 = 0;
                  var15.field913 = var7;
                  var15.field919 = 0;
                  var15.field942 = var15.field937;
               }
            }

            if((var5 & 64) != 0) {
               var15.field1058 = class59.method1125(var1.method3574());
               var15.field885 = var15.field1058.field3519;
               var15.field929 = var15.field1058.field3528;
               var15.field890 = var15.field1058.field3511;
               var15.field891 = var15.field1058.field3512;
               var15.field882 = var15.field1058.field3518;
               var15.field893 = var15.field1058.field3514;
               var15.field909 = var15.field1058.field3517;
               var15.field892 = var15.field1058.field3509;
               var15.field889 = var15.field1058.field3499;
            }

            if((var5 & 1) != 0) {
               var15.field895 = var1.method3577();
               var15.field898 = 100;
            }
         }

         for(var14 = 0; var14 < client.field713; ++var14) {
            var3 = client.field714[var14];
            if(client.field807[var3].field932 != client.field679) {
               client.field807[var3].field1058 = null;
               client.field807[var3] = null;
            }
         }

         if(var1.field2359 != client.field739.field1247) {
            throw new RuntimeException(var1.field2359 + "," + client.field739.field1247);
         } else {
            for(var14 = 0; var14 < client.field635; ++var14) {
               if(client.field807[client.field636[var14]] == null) {
                  throw new RuntimeException(var14 + "," + client.field635);
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
   static final void method25(class230[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         class230 var9 = var0[var8];
         if(var9 != null && (!var9.field2622 || var9.field2625 == 0 || var9.field2704 || class95.method2252(var9) != 0 || var9 == client.field639 || var9.field2711 == 1338) && var9.field2642 == var1) {
            if(var9.field2622) {
               boolean var10 = var9.field2643;
               if(var10) {
                  continue;
               }
            }

            int var35 = var9.field2636 + var6;
            int var11 = var7 + var9.field2637;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            if(var9.field2625 == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else if(var9.field2625 == 9) {
               var16 = var35;
               var17 = var11;
               int var18 = var35 + var9.field2627;
               int var19 = var11 + var9.field2639;
               if(var18 < var35) {
                  var16 = var18;
                  var18 = var35;
               }

               if(var19 < var11) {
                  var17 = var19;
                  var19 = var11;
               }

               ++var18;
               ++var19;
               var12 = var16 > var2?var16:var2;
               var13 = var17 > var3?var17:var3;
               var14 = var18 < var4?var18:var4;
               var15 = var19 < var5?var19:var5;
            } else {
               var16 = var35 + var9.field2627;
               var17 = var11 + var9.field2639;
               var12 = var35 > var2?var35:var2;
               var13 = var11 > var3?var11:var3;
               var14 = var16 < var4?var16:var4;
               var15 = var17 < var5?var17:var5;
            }

            if(var9 == client.field763) {
               client.field860 = true;
               client.field772 = var35;
               client.field773 = var11;
            }

            if(!var9.field2622 || var12 < var14 && var13 < var15) {
               var16 = class48.field425;
               var17 = class48.field417;
               if(class48.field431 != 0) {
                  var16 = class48.field432;
                  var17 = class48.field437;
               }

               boolean var36 = var16 >= var12 && var17 >= var13 && var16 < var14 && var17 < var15;
               if(var9.field2711 == 1337) {
                  if(!client.field603 && !client.field846 && var36) {
                     class243.method4609(var16, var17, var12, var13);
                  }
               } else {
                  int var20;
                  int var22;
                  int var23;
                  int var32;
                  if(var9.field2711 == 1338) {
                     if((client.field822 == 0 || client.field822 == 3) && (class48.field431 == 1 || !class8.field57 && class48.field431 == 4)) {
                        class224 var40 = var9.method4561(true);
                        if(var40 != null) {
                           var20 = class48.field432 - var35;
                           var32 = class48.field437 - var11;
                           if(var40.method4459(var20, var32)) {
                              var20 -= var40.field2570 / 2;
                              var32 -= var40.field2575 / 2;
                              var22 = client.field662 & 2047;
                              var23 = class122.field1702[var22];
                              int var34 = class122.field1708[var22];
                              int var25 = var34 * var20 + var32 * var23 >> 11;
                              int var26 = var32 * var34 - var23 * var20 >> 11;
                              int var27 = var25 + class150.field1948.field900 >> 7;
                              int var28 = class150.field1948.field918 - var26 >> 7;
                              class172 var29 = class133.method3115(class169.field2243, client.field739.field1250);
                              var29.field2279.method3552(18);
                              var29.field2279.method3605(var27 + class178.field2315);
                              var29.field2279.method3707(var28 + class71.field1051);
                              var29.field2279.method3596(class39.field340[82]?(class39.field340[81]?2:1):0);
                              var29.field2279.method3552(var20);
                              var29.field2279.method3552(var32);
                              var29.field2279.method3602(client.field662);
                              var29.field2279.method3552(57);
                              var29.field2279.method3552(0);
                              var29.field2279.method3552(0);
                              var29.field2279.method3552(89);
                              var29.field2279.method3602(class150.field1948.field900);
                              var29.field2279.method3602(class150.field1948.field918);
                              var29.field2279.method3552(63);
                              client.field739.method2019(var29);
                              client.field820 = var27;
                              client.field821 = var28;
                           }
                        }
                     }
                  } else {
                     if(var9.field2711 == 1400) {
                        class66.field987.method6162(class48.field425, class48.field417, var36, var35, var11, var9.field2627, var9.field2639);
                     }

                     if(!client.field846 && var36) {
                        if(var9.field2711 == 1400) {
                           class66.field987.method6216(var35, var11, var9.field2627, var9.field2639, var16, var17);
                        } else {
                           class48.method1014(var9, var16 - var35, var17 - var11);
                        }
                     }

                     boolean var37;
                     if(var9.field2625 == 0) {
                        if(!var9.field2622) {
                           var37 = var9.field2643;
                           if(var37 && var9 != class37.field329) {
                              continue;
                           }
                        }

                        method25(var0, var9.field2623, var12, var13, var14, var15, var35 - var9.field2644, var11 - var9.field2611);
                        if(var9.field2626 != null) {
                           method25(var9.field2626, var9.field2623, var12, var13, var14, var15, var35 - var9.field2644, var11 - var9.field2611);
                        }

                        class55 var30 = (class55)client.field826.method4064((long)var9.field2623);
                        if(var30 != null) {
                           if(var30.field503 == 0 && class48.field425 >= var12 && class48.field417 >= var13 && class48.field425 < var14 && class48.field417 < var15 && !client.field846) {
                              for(class56 var31 = (class56)client.field755.method4113(); var31 != null; var31 = (class56)client.field755.method4104()) {
                                 if(var31.field526) {
                                    var31.method4098();
                                    var31.field511.field2749 = false;
                                 }
                              }

                              if(class133.field1860 == 0) {
                                 client.field763 = null;
                                 client.field639 = null;
                              }

                              if(!client.field846) {
                                 class63.method1597();
                              }
                           }

                           var20 = var30.field506;
                           if(class42.method785(var20)) {
                              method25(class230.field2615[var20], -1, var12, var13, var14, var15, var35, var11);
                           }
                        }
                     }

                     if(var9.field2622) {
                        class56 var39;
                        if(var9.field2731) {
                           if(class48.field425 >= var12 && class48.field417 >= var13 && class48.field425 < var14 && class48.field417 < var15) {
                              for(var39 = (class56)client.field755.method4113(); var39 != null; var39 = (class56)client.field755.method4104()) {
                                 if(var39.field526) {
                                    var39.method4098();
                                    var39.field511.field2749 = false;
                                 }
                              }

                              if(class133.field1860 == 0) {
                                 client.field763 = null;
                                 client.field639 = null;
                              }

                              if(!client.field846) {
                                 class63.method1597();
                              }
                           }
                        } else if(var9.field2663 && class48.field425 >= var12 && class48.field417 >= var13 && class48.field425 < var14 && class48.field417 < var15) {
                           for(var39 = (class56)client.field755.method4113(); var39 != null; var39 = (class56)client.field755.method4104()) {
                              if(var39.field526 && var39.field511.field2630 == var39.field525) {
                                 var39.method4098();
                              }
                           }
                        }

                        if(class48.field425 >= var12 && class48.field417 >= var13 && class48.field425 < var14 && class48.field417 < var15) {
                           var36 = true;
                        } else {
                           var36 = false;
                        }

                        var37 = false;
                        if((class48.field424 == 1 || !class8.field57 && class48.field424 == 4) && var36) {
                           var37 = true;
                        }

                        boolean var38 = false;
                        if((class48.field431 == 1 || !class8.field57 && class48.field431 == 4) && class48.field432 >= var12 && class48.field437 >= var13 && class48.field432 < var14 && class48.field437 < var15) {
                           var38 = true;
                        }

                        if(var38) {
                           class35.method685(var9, class48.field432 - var35, class48.field437 - var11);
                        }

                        if(var9.field2711 == 1400) {
                           class66.field987.method6051(var16, var17, var36 & var37, var36 & var38);
                        }

                        if(client.field763 != null && var9 != client.field763 && var36 && class133.method3114(class95.method2252(var9))) {
                           client.field700 = var9;
                        }

                        if(var9 == client.field639) {
                           client.field594 = true;
                           client.field769 = var35;
                           client.field770 = var11;
                        }

                        if(var9.field2704) {
                           class56 var21;
                           if(var36 && client.field788 != 0 && var9.field2630 != null) {
                              var21 = new class56();
                              var21.field526 = true;
                              var21.field511 = var9;
                              var21.field513 = client.field788;
                              var21.field525 = var9.field2630;
                              client.field755.method4126(var21);
                           }

                           if(client.field763 != null || class49.field442 != null || client.field846) {
                              var38 = false;
                              var37 = false;
                              var36 = false;
                           }

                           if(!var9.field2682 && var38) {
                              var9.field2682 = true;
                              if(var9.field2706 != null) {
                                 var21 = new class56();
                                 var21.field526 = true;
                                 var21.field511 = var9;
                                 var21.field512 = class48.field432 - var35;
                                 var21.field513 = class48.field437 - var11;
                                 var21.field525 = var9.field2706;
                                 client.field755.method4126(var21);
                              }
                           }

                           if(var9.field2682 && var37 && var9.field2659 != null) {
                              var21 = new class56();
                              var21.field526 = true;
                              var21.field511 = var9;
                              var21.field512 = class48.field425 - var35;
                              var21.field513 = class48.field417 - var11;
                              var21.field525 = var9.field2659;
                              client.field755.method4126(var21);
                           }

                           if(var9.field2682 && !var37) {
                              var9.field2682 = false;
                              if(var9.field2708 != null) {
                                 var21 = new class56();
                                 var21.field526 = true;
                                 var21.field511 = var9;
                                 var21.field512 = class48.field425 - var35;
                                 var21.field513 = class48.field417 - var11;
                                 var21.field525 = var9.field2708;
                                 client.field791.method4126(var21);
                              }
                           }

                           if(var37 && var9.field2709 != null) {
                              var21 = new class56();
                              var21.field526 = true;
                              var21.field511 = var9;
                              var21.field512 = class48.field425 - var35;
                              var21.field513 = class48.field417 - var11;
                              var21.field525 = var9.field2709;
                              client.field755.method4126(var21);
                           }

                           if(!var9.field2749 && var36) {
                              var9.field2749 = true;
                              if(var9.field2705 != null) {
                                 var21 = new class56();
                                 var21.field526 = true;
                                 var21.field511 = var9;
                                 var21.field512 = class48.field425 - var35;
                                 var21.field513 = class48.field417 - var11;
                                 var21.field525 = var9.field2705;
                                 client.field755.method4126(var21);
                              }
                           }

                           if(var9.field2749 && var36 && var9.field2724 != null) {
                              var21 = new class56();
                              var21.field526 = true;
                              var21.field511 = var9;
                              var21.field512 = class48.field425 - var35;
                              var21.field513 = class48.field417 - var11;
                              var21.field525 = var9.field2724;
                              client.field755.method4126(var21);
                           }

                           if(var9.field2749 && !var36) {
                              var9.field2749 = false;
                              if(var9.field2712 != null) {
                                 var21 = new class56();
                                 var21.field526 = true;
                                 var21.field511 = var9;
                                 var21.field512 = class48.field425 - var35;
                                 var21.field513 = class48.field417 - var11;
                                 var21.field525 = var9.field2712;
                                 client.field791.method4126(var21);
                              }
                           }

                           if(var9.field2723 != null) {
                              var21 = new class56();
                              var21.field511 = var9;
                              var21.field525 = var9.field2723;
                              client.field790.method4126(var21);
                           }

                           class56 var24;
                           if(var9.field2726 != null && client.field777 > var9.field2752) {
                              if(var9.field2748 != null && client.field777 - var9.field2752 <= 32) {
                                 label778:
                                 for(var32 = var9.field2752; var32 < client.field777; ++var32) {
                                    var22 = client.field593[var32 & 31];

                                    for(var23 = 0; var23 < var9.field2748.length; ++var23) {
                                       if(var22 == var9.field2748[var23]) {
                                          var24 = new class56();
                                          var24.field511 = var9;
                                          var24.field525 = var9.field2726;
                                          client.field755.method4126(var24);
                                          break label778;
                                       }
                                    }
                                 }
                              } else {
                                 var21 = new class56();
                                 var21.field511 = var9;
                                 var21.field525 = var9.field2726;
                                 client.field755.method4126(var21);
                              }

                              var9.field2752 = client.field777;
                           }

                           if(var9.field2719 != null && client.field779 > var9.field2753) {
                              if(var9.field2720 != null && client.field779 - var9.field2753 <= 32) {
                                 label759:
                                 for(var32 = var9.field2753; var32 < client.field779; ++var32) {
                                    var22 = client.field778[var32 & 31];

                                    for(var23 = 0; var23 < var9.field2720.length; ++var23) {
                                       if(var22 == var9.field2720[var23]) {
                                          var24 = new class56();
                                          var24.field511 = var9;
                                          var24.field525 = var9.field2719;
                                          client.field755.method4126(var24);
                                          break label759;
                                       }
                                    }
                                 }
                              } else {
                                 var21 = new class56();
                                 var21.field511 = var9;
                                 var21.field525 = var9.field2719;
                                 client.field755.method4126(var21);
                              }

                              var9.field2753 = client.field779;
                           }

                           if(var9.field2721 != null && client.field781 > var9.field2725) {
                              if(var9.field2722 != null && client.field781 - var9.field2725 <= 32) {
                                 label740:
                                 for(var32 = var9.field2725; var32 < client.field781; ++var32) {
                                    var22 = client.field810[var32 & 31];

                                    for(var23 = 0; var23 < var9.field2722.length; ++var23) {
                                       if(var22 == var9.field2722[var23]) {
                                          var24 = new class56();
                                          var24.field511 = var9;
                                          var24.field525 = var9.field2721;
                                          client.field755.method4126(var24);
                                          break label740;
                                       }
                                    }
                                 }
                              } else {
                                 var21 = new class56();
                                 var21.field511 = var9;
                                 var21.field525 = var9.field2721;
                                 client.field755.method4126(var21);
                              }

                              var9.field2725 = client.field781;
                           }

                           if(client.field633 > var9.field2733 && var9.field2680 != null) {
                              var21 = new class56();
                              var21.field511 = var9;
                              var21.field525 = var9.field2680;
                              client.field755.method4126(var21);
                           }

                           if(client.field742 > var9.field2733 && var9.field2728 != null) {
                              var21 = new class56();
                              var21.field511 = var9;
                              var21.field525 = var9.field2728;
                              client.field755.method4126(var21);
                           }

                           if(client.field784 > var9.field2733 && var9.field2751 != null) {
                              var21 = new class56();
                              var21.field511 = var9;
                              var21.field525 = var9.field2751;
                              client.field755.method4126(var21);
                           }

                           if(client.field785 > var9.field2733 && var9.field2734 != null) {
                              var21 = new class56();
                              var21.field511 = var9;
                              var21.field525 = var9.field2734;
                              client.field755.method4126(var21);
                           }

                           if(client.field789 > var9.field2733 && var9.field2735 != null) {
                              var21 = new class56();
                              var21.field511 = var9;
                              var21.field525 = var9.field2735;
                              client.field755.method4126(var21);
                           }

                           if(client.field787 > var9.field2733 && var9.field2730 != null) {
                              var21 = new class56();
                              var21.field511 = var9;
                              var21.field525 = var9.field2730;
                              client.field755.method4126(var21);
                           }

                           var9.field2733 = client.field775;
                           if(var9.field2727 != null) {
                              for(var32 = 0; var32 < client.field845; ++var32) {
                                 class56 var33 = new class56();
                                 var33.field511 = var9;
                                 var33.field520 = client.field865[var32];
                                 var33.field510 = client.field812[var32];
                                 var33.field525 = var9.field2727;
                                 client.field755.method4126(var33);
                              }
                           }
                        }
                     }

                     if(!var9.field2622 && client.field763 == null && class49.field442 == null && !client.field846) {
                        if((var9.field2739 >= 0 || var9.field2650 != 0) && class48.field425 >= var12 && class48.field417 >= var13 && class48.field425 < var14 && class48.field417 < var15) {
                           if(var9.field2739 >= 0) {
                              class37.field329 = var0[var9.field2739];
                           } else {
                              class37.field329 = var9;
                           }
                        }

                        if(var9.field2625 == 8 && class48.field425 >= var12 && class48.field417 >= var13 && class48.field425 < var14 && class48.field417 < var15) {
                           class7.field42 = var9;
                        }

                        if(var9.field2647 > var9.field2639) {
                           class245.method4618(var9, var35 + var9.field2627, var11, var9.field2639, var9.field2647, class48.field425, class48.field417);
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
