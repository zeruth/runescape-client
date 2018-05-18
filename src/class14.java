import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class14 implements class31 {

   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = 1313573881
   )
   static int field118;
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
   public void vmethod692(class20 var1) {
      if(var1.field176 > this.field109) {
         var1.field176 = this.field109;
      }

      if(var1.field177 < this.field109) {
         var1.field177 = this.field109;
      }

      if(var1.field178 > this.field106) {
         var1.field178 = this.field106;
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
   public boolean vmethod693(int var1, int var2, int var3) {
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
      if(!this.vmethod693(var1, var2, var3)) {
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
   public class226 vmethod707(int var1, int var2) {
      if(!this.vmethod694(var1, var2)) {
         return null;
      } else {
         int var3 = this.field108 * 64 - this.field109 * 64 + (this.field120 * 8 - this.field116 * 8) + var1;
         int var4 = this.field107 * 64 - this.field106 * 64 + var2 + (this.field113 * 8 - this.field117 * 8);
         return new class226(this.field112, var3, var4);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgy;S)V",
      garbageValue = "255"
   )
   public void vmethod697(class182 var1) {
      this.field112 = var1.method3742();
      this.field111 = var1.method3742();
      this.field108 = var1.method3574();
      this.field120 = var1.method3742();
      this.field114 = var1.method3742();
      this.field107 = var1.method3574();
      this.field113 = var1.method3742();
      this.field115 = var1.method3742();
      this.field109 = var1.method3574();
      this.field116 = var1.method3742();
      this.field110 = var1.method3742();
      this.field106 = var1.method3574();
      this.field117 = var1.method3742();
      this.field119 = var1.method3742();
      this.method133();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-98"
   )
   void method133() {}

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
   public static void method139(boolean var0) {
      if(class250.field3217 != null) {
         try {
            class182 var1 = new class182(4);
            var1.method3552(var0?2:3);
            var1.method3554(0);
            class250.field3217.vmethod3385(var1.field2365, 0, 4);
         } catch (IOException var4) {
            try {
               class250.field3217.vmethod3368();
            } catch (Exception var3) {
               ;
            }

            ++class250.field3227;
            class250.field3217 = null;
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
   static final void method148(class230[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class314.method5763(var2, var3, var4, var5);
      class122.method2850();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         class230 var10 = var0[var9];
         if(var10 != null && (var10.field2642 == var1 || var1 == -1412584499 && var10 == client.field763)) {
            int var11;
            if(var8 == -1) {
               client.field798[client.field793] = var10.field2636 + var6;
               client.field799[client.field793] = var7 + var10.field2637;
               client.field800[client.field793] = var10.field2627;
               client.field604[client.field793] = var10.field2639;
               var11 = ++client.field793 - 1;
            } else {
               var11 = var8;
            }

            var10.field2755 = var11;
            var10.field2756 = client.field679;
            if(var10.field2622) {
               boolean var12 = var10.field2643;
               if(var12) {
                  continue;
               }
            }

            int var55;
            if(var10.field2711 > 0) {
               var55 = var10.field2711;
               if(var55 == 324) {
                  if(client.field783 == -1) {
                     client.field783 = var10.field2658;
                     client.field854 = var10.field2616;
                  }

                  if(client.field853.field2595) {
                     var10.field2658 = client.field783;
                  } else {
                     var10.field2658 = client.field854;
                  }
               } else if(var55 == 325) {
                  if(client.field783 == -1) {
                     client.field783 = var10.field2658;
                     client.field854 = var10.field2616;
                  }

                  if(client.field853.field2595) {
                     var10.field2658 = client.field854;
                  } else {
                     var10.field2658 = client.field783;
                  }
               } else if(var55 == 327) {
                  var10.field2675 = 150;
                  var10.field2707 = (int)(Math.sin((double)client.field679 / 40.0D) * 256.0D) & 2047;
                  var10.field2666 = 5;
                  var10.field2757 = 0;
               } else if(var55 == 328) {
                  var10.field2675 = 150;
                  var10.field2707 = (int)(Math.sin((double)client.field679 / 40.0D) * 256.0D) & 2047;
                  var10.field2666 = 5;
                  var10.field2757 = 1;
               }
            }

            var55 = var10.field2636 + var6;
            int var13 = var7 + var10.field2637;
            int var14 = var10.field2638;
            int var15;
            int var16;
            if(var10 == client.field763) {
               if(var1 != -1412584499 && !var10.field2702) {
                  class25.field226 = var0;
                  class184.field2378 = var6;
                  class30.field268 = var7;
                  continue;
               }

               if(client.field774 && client.field594) {
                  var15 = class48.field425;
                  var16 = class48.field417;
                  var15 -= client.field685;
                  var16 -= client.field766;
                  if(var15 < client.field769) {
                     var15 = client.field769;
                  }

                  if(var15 + var10.field2627 > client.field769 + client.field639.field2627) {
                     var15 = client.field769 + client.field639.field2627 - var10.field2627;
                  }

                  if(var16 < client.field770) {
                     var16 = client.field770;
                  }

                  if(var16 + var10.field2639 > client.field770 + client.field639.field2639) {
                     var16 = client.field770 + client.field639.field2639 - var10.field2639;
                  }

                  var55 = var15;
                  var13 = var16;
               }

               if(!var10.field2702) {
                  var14 = 128;
               }
            }

            int var17;
            int var18;
            int var20;
            int var21;
            int var22;
            int var46;
            if(var10.field2625 == 2) {
               var15 = var2;
               var16 = var3;
               var17 = var4;
               var18 = var5;
            } else if(var10.field2625 == 9) {
               var46 = var55;
               var20 = var13;
               var21 = var55 + var10.field2627;
               var22 = var13 + var10.field2639;
               if(var21 < var55) {
                  var46 = var21;
                  var21 = var55;
               }

               if(var22 < var13) {
                  var20 = var22;
                  var22 = var13;
               }

               ++var21;
               ++var22;
               var15 = var46 > var2?var46:var2;
               var16 = var20 > var3?var20:var3;
               var17 = var21 < var4?var21:var4;
               var18 = var22 < var5?var22:var5;
            } else {
               var46 = var55 + var10.field2627;
               var20 = var13 + var10.field2639;
               var15 = var55 > var2?var55:var2;
               var16 = var13 > var3?var13:var3;
               var17 = var46 < var4?var46:var4;
               var18 = var20 < var5?var20:var5;
            }

            if(!var10.field2622 || var15 < var17 && var16 < var18) {
               int var23;
               int var24;
               int var25;
               int var26;
               int var49;
               int var53;
               if(var10.field2711 != 0) {
                  if(var10.field2711 == 1336) {
                     if(client.field610) {
                        var13 += 15;
                        class56.field524.method5543("Fps:" + class47.field388, var55 + var10.field2627, var13, 16776960, -1);
                        var13 += 15;
                        Runtime var59 = Runtime.getRuntime();
                        var20 = (int)((var59.totalMemory() - var59.freeMemory()) / 1024L);
                        var21 = 16776960;
                        if(var20 > 327680 && !client.field708) {
                           var21 = 16711680;
                        }

                        class56.field524.method5543("Mem:" + var20 + "k", var55 + var10.field2627, var13, var21, -1);
                        var13 += 15;
                     }
                     continue;
                  }

                  if(var10.field2711 == 1337) {
                     client.field741 = var55;
                     client.field667 = var13;
                     class35.method682(var55, var13, var10.field2627, var10.field2639);
                     client.field795[var10.field2755] = true;
                     class314.method5763(var2, var3, var4, var5);
                     continue;
                  }

                  if(var10.field2711 == 1338) {
                     class263.method4951();
                     class224 var58 = var10.method4561(false);
                     if(var58 != null) {
                        class314.method5763(var55, var13, var55 + var58.field2570, var13 + var58.field2575);
                        if(client.field822 != 2 && client.field822 != 5) {
                           var20 = client.field662 & 2047;
                           var21 = class150.field1948.field900 / 32 + 48;
                           var22 = 464 - class150.field1948.field918 / 32;
                           class283.field3633.method5948(var55, var13, var58.field2570, var58.field2575, var21, var22, var20, 256, var58.field2573, var58.field2572);

                           for(var23 = 0; var23 < client.field651; ++var23) {
                              var24 = client.field817[var23] * 4 + 2 - class150.field1948.field900 / 32;
                              var25 = client.field818[var23] * 4 + 2 - class150.field1948.field918 / 32;
                              class253.method4812(var55, var13, var24, var25, client.field819[var23], var58);
                           }

                           for(var23 = 0; var23 < 104; ++var23) {
                              for(var24 = 0; var24 < 104; ++var24) {
                                 class205 var48 = client.field720[class192.field2415][var23][var24];
                                 if(var48 != null) {
                                    var26 = var23 * 4 + 2 - class150.field1948.field900 / 32;
                                    var49 = var24 * 4 + 2 - class150.field1948.field918 / 32;
                                    class253.method4812(var55, var13, var26, var49, class81.field1190[0], var58);
                                 }
                              }
                           }

                           for(var23 = 0; var23 < client.field635; ++var23) {
                              class72 var66 = client.field807[client.field636[var23]];
                              if(var66 != null && var66.vmethod1828()) {
                                 class271 var64 = var66.field1058;
                                 if(var64 != null && var64.field3529 != null) {
                                    var64 = var64.method5186();
                                 }

                                 if(var64 != null && var64.field3520 && var64.field3535) {
                                    var26 = var66.field900 / 32 - class150.field1948.field900 / 32;
                                    var49 = var66.field918 / 32 - class150.field1948.field918 / 32;
                                    class253.method4812(var55, var13, var26, var49, class81.field1190[1], var58);
                                 }
                              }
                           }

                           var23 = class81.field1180;
                           int[] var67 = class81.field1181;

                           for(var25 = 0; var25 < var23; ++var25) {
                              class60 var52 = client.field806[var67[var25]];
                              if(var52 != null && var52.vmethod1828() && !var52.field567 && var52 != class150.field1948) {
                                 var49 = var52.field900 / 32 - class150.field1948.field900 / 32;
                                 var53 = var52.field918 / 32 - class150.field1948.field918 / 32;
                                 boolean var62 = false;
                                 if(class150.field1948.field569 != 0 && var52.field569 != 0 && var52.field569 == class150.field1948.field569) {
                                    var62 = true;
                                 }

                                 if(var52.method1133()) {
                                    class253.method4812(var55, var13, var49, var53, class81.field1190[3], var58);
                                 } else if(var62) {
                                    class253.method4812(var55, var13, var49, var53, class81.field1190[4], var58);
                                 } else if(var52.method1136()) {
                                    class253.method4812(var55, var13, var49, var53, class81.field1190[5], var58);
                                 } else {
                                    class253.method4812(var55, var13, var49, var53, class81.field1190[2], var58);
                                 }
                              }
                           }

                           if(client.field858 != 0 && client.field679 % 20 < 10) {
                              if(client.field858 == 1 && client.field613 >= 0 && client.field613 < client.field807.length) {
                                 class72 var68 = client.field807[client.field613];
                                 if(var68 != null) {
                                    var26 = var68.field900 / 32 - class150.field1948.field900 / 32;
                                    var49 = var68.field918 / 32 - class150.field1948.field918 / 32;
                                    class28.method505(var55, var13, var26, var49, class217.field2488[1], var58);
                                 }
                              }

                              if(client.field858 == 2) {
                                 var25 = client.field612 * 4 - class178.field2315 * 4 + 2 - class150.field1948.field900 / 32;
                                 var26 = client.field616 * 4 - class71.field1051 * 4 + 2 - class150.field1948.field918 / 32;
                                 class28.method505(var55, var13, var25, var26, class217.field2488[1], var58);
                              }

                              if(client.field858 == 10 && client.field614 >= 0 && client.field614 < client.field806.length) {
                                 class60 var69 = client.field806[client.field614];
                                 if(var69 != null) {
                                    var26 = var69.field900 / 32 - class150.field1948.field900 / 32;
                                    var49 = var69.field918 / 32 - class150.field1948.field918 / 32;
                                    class28.method505(var55, var13, var26, var49, class217.field2488[1], var58);
                                 }
                              }
                           }

                           if(client.field820 != 0) {
                              var25 = client.field820 * 4 + 2 - class150.field1948.field900 / 32;
                              var26 = client.field821 * 4 + 2 - class150.field1948.field918 / 32;
                              class253.method4812(var55, var13, var25, var26, class217.field2488[0], var58);
                           }

                           if(!class150.field1948.field567) {
                              class314.method5835(var58.field2570 / 2 + var55 - 1, var58.field2575 / 2 + var13 - 1, 3, 3, 16777215);
                           }
                        } else {
                           class314.method5786(var55, var13, 0, var58.field2573, var58.field2572);
                        }

                        client.field796[var11] = true;
                     }

                     class314.method5763(var2, var3, var4, var5);
                     continue;
                  }

                  if(var10.field2711 == 1339) {
                     class4.method57(var10, var55, var13, var11);
                     class314.method5763(var2, var3, var4, var5);
                     continue;
                  }

                  if(var10.field2711 == 1400) {
                     class66.field987.method6066(var55, var13, var10.field2627, var10.field2639, client.field679);
                  }

                  if(var10.field2711 == 1401) {
                     class66.field987.method6134(var55, var13, var10.field2627, var10.field2639);
                  }
               }

               boolean var63;
               if(var10.field2625 == 0) {
                  if(!var10.field2622) {
                     var63 = var10.field2643;
                     if(var63 && var10 != class37.field329) {
                        continue;
                     }
                  }

                  if(!var10.field2622) {
                     if(var10.field2611 > var10.field2647 - var10.field2639) {
                        var10.field2611 = var10.field2647 - var10.field2639;
                     }

                     if(var10.field2611 < 0) {
                        var10.field2611 = 0;
                     }
                  }

                  method148(var0, var10.field2623, var15, var16, var17, var18, var55 - var10.field2644, var13 - var10.field2611, var11);
                  if(var10.field2626 != null) {
                     method148(var10.field2626, var10.field2623, var15, var16, var17, var18, var55 - var10.field2644, var13 - var10.field2611, var11);
                  }

                  class55 var19 = (class55)client.field826.method4064((long)var10.field2623);
                  if(var19 != null) {
                     class218.method4359(var19.field506, var15, var16, var17, var18, var55, var13, var11);
                  }

                  class314.method5763(var2, var3, var4, var5);
                  class122.method2850();
               }

               if(client.field675 || client.field797[var11] || client.field802 > 1) {
                  if(var10.field2625 == 0 && !var10.field2622 && var10.field2647 > var10.field2639) {
                     var46 = var55 + var10.field2627;
                     var20 = var10.field2611;
                     var21 = var10.field2639;
                     var22 = var10.field2647;
                     class71.field1049[0].method5873(var46, var13);
                     class71.field1049[1].method5873(var46, var13 + var21 - 16);
                     class314.method5835(var46, var13 + 16, 16, var21 - 32, client.field655);
                     var23 = var21 * (var21 - 32) / var22;
                     if(var23 < 8) {
                        var23 = 8;
                     }

                     var24 = var20 * (var21 - 32 - var23) / (var22 - var21);
                     class314.method5835(var46, var24 + var13 + 16, 16, var23, client.field656);
                     class314.method5842(var46, var24 + var13 + 16, var23, client.field658);
                     class314.method5842(var46 + 1, var13 + var24 + 16, var23, client.field658);
                     class314.method5780(var46, var13 + var24 + 16, 16, client.field658);
                     class314.method5780(var46, var24 + var13 + 17, 16, client.field658);
                     class314.method5842(var46 + 15, var24 + var13 + 16, var23, client.field731);
                     class314.method5842(var46 + 14, var13 + var24 + 17, var23 - 1, client.field731);
                     class314.method5780(var46, var23 + var13 + var24 + 15, 16, client.field731);
                     class314.method5780(var46 + 1, var13 + var24 + var23 + 14, 15, client.field731);
                  }

                  if(var10.field2625 != 1) {
                     int var29;
                     if(var10.field2625 == 2) {
                        var46 = 0;

                        for(var20 = 0; var20 < var10.field2635; ++var20) {
                           for(var21 = 0; var21 < var10.field2634; ++var21) {
                              var22 = var55 + var21 * (var10.field2690 + 32);
                              var23 = var13 + var20 * (var10.field2691 + 32);
                              if(var46 < 20) {
                                 var22 += var10.field2692[var46];
                                 var23 += var10.field2693[var46];
                              }

                              if(var10.field2758[var46] > 0) {
                                 boolean var60 = false;
                                 boolean var61 = false;
                                 var26 = var10.field2758[var46] - 1;
                                 if(var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class49.field442 && var46 == client.field597) {
                                    class318 var27;
                                    if(client.field771 == 1 && var46 == class59.field554 && var10.field2623 == class174.field2296) {
                                       var27 = class171.method3467(var26, var10.field2743[var46], 2, 0, 2, false);
                                    } else {
                                       var27 = class171.method3467(var26, var10.field2743[var46], 1, 3153952, 2, false);
                                    }

                                    if(var27 != null) {
                                       if(var10 == class49.field442 && var46 == client.field597) {
                                          var24 = class48.field425 - client.field701;
                                          var25 = class48.field417 - client.field640;
                                          if(var24 < 5 && var24 > -5) {
                                             var24 = 0;
                                          }

                                          if(var25 < 5 && var25 > -5) {
                                             var25 = 0;
                                          }

                                          if(client.field705 < 5) {
                                             var24 = 0;
                                             var25 = 0;
                                          }

                                          var27.method5901(var24 + var22, var25 + var23, 128);
                                          if(var1 != -1) {
                                             class230 var28 = var0[var1 & '\uffff'];
                                             if(var25 + var23 < class314.field3769 && var28.field2611 > 0) {
                                                var29 = (class314.field3769 - var23 - var25) * client.field654 / 3;
                                                if(var29 > client.field654 * 10) {
                                                   var29 = client.field654 * 10;
                                                }

                                                if(var29 > var28.field2611) {
                                                   var29 = var28.field2611;
                                                }

                                                var28.field2611 -= var29;
                                                client.field640 += var29;
                                                class181.method3548(var28);
                                             }

                                             if(var23 + var25 + 32 > class314.field3768 && var28.field2611 < var28.field2647 - var28.field2639) {
                                                var29 = (var23 + var25 + 32 - class314.field3768) * client.field654 / 3;
                                                if(var29 > client.field654 * 10) {
                                                   var29 = client.field654 * 10;
                                                }

                                                if(var29 > var28.field2647 - var28.field2639 - var28.field2611) {
                                                   var29 = var28.field2647 - var28.field2639 - var28.field2611;
                                                }

                                                var28.field2611 += var29;
                                                client.field640 -= var29;
                                                class181.method3548(var28);
                                             }
                                          }
                                       } else if(var10 == class144.field1921 && var46 == client.field699) {
                                          var27.method5901(var22, var23, 128);
                                       } else {
                                          var27.method5891(var22, var23);
                                       }
                                    } else {
                                       class181.method3548(var10);
                                    }
                                 }
                              } else if(var10.field2750 != null && var46 < 20) {
                                 class318 var65 = var10.method4528(var46);
                                 if(var65 != null) {
                                    var65.method5891(var22, var23);
                                 } else if(class230.field2621) {
                                    class181.method3548(var10);
                                 }
                              }

                              ++var46;
                           }
                        }
                     } else if(var10.field2625 == 3) {
                        if(class9.method96(var10)) {
                           var46 = var10.field2640;
                           if(var10 == class37.field329 && var10.field2651 != 0) {
                              var46 = var10.field2651;
                           }
                        } else {
                           var46 = var10.field2648;
                           if(var10 == class37.field329 && var10.field2650 != 0) {
                              var46 = var10.field2650;
                           }
                        }

                        if(var10.field2652) {
                           switch(var10.field2700.field3776) {
                           case 1:
                              class314.method5772(var55, var13, var10.field2627, var10.field2639, var10.field2648, var10.field2640, 256 - (var10.field2638 & 255), 256 - (var10.field2649 & 255));
                              break;
                           case 2:
                              class314.method5773(var55, var13, var10.field2627, var10.field2639, var10.field2648, var10.field2640, 256 - (var10.field2638 & 255), 256 - (var10.field2649 & 255));
                              break;
                           case 3:
                              class314.method5774(var55, var13, var10.field2627, var10.field2639, var10.field2648, var10.field2640, 256 - (var10.field2638 & 255), 256 - (var10.field2649 & 255));
                              break;
                           case 4:
                              class314.method5838(var55, var13, var10.field2627, var10.field2639, var10.field2648, var10.field2640, 256 - (var10.field2638 & 255), 256 - (var10.field2649 & 255));
                              break;
                           default:
                              if(var14 == 0) {
                                 class314.method5835(var55, var13, var10.field2627, var10.field2639, var46);
                              } else {
                                 class314.method5834(var55, var13, var10.field2627, var10.field2639, var46, 256 - (var14 & 255));
                              }
                           }
                        } else if(var14 == 0) {
                           class314.method5778(var55, var13, var10.field2627, var10.field2639, var46);
                        } else {
                           class314.method5779(var55, var13, var10.field2627, var10.field2639, var46, 256 - (var14 & 255));
                        }
                     } else {
                        class298 var56;
                        if(var10.field2625 == 4) {
                           var56 = var10.method4527();
                           if(var56 == null) {
                              if(class230.field2621) {
                                 class181.method3548(var10);
                              }
                           } else {
                              String var72 = var10.field2684;
                              if(class9.method96(var10)) {
                                 var20 = var10.field2640;
                                 if(var10 == class37.field329 && var10.field2651 != 0) {
                                    var20 = var10.field2651;
                                 }

                                 if(var10.field2685.length() > 0) {
                                    var72 = var10.field2685;
                                 }
                              } else {
                                 var20 = var10.field2648;
                                 if(var10 == class37.field329 && var10.field2650 != 0) {
                                    var20 = var10.field2650;
                                 }
                              }

                              if(var10.field2622 && var10.field2754 != -1) {
                                 class269 var74 = class120.method2784(var10.field2754);
                                 var72 = var74.field3449;
                                 if(var72 == null) {
                                    var72 = "null";
                                 }

                                 if((var74.field3482 == 1 || var10.field2677 != 1) && var10.field2677 != -1) {
                                    var72 = class50.method1060(16748608) + var72 + "</col>" + " " + 'x' + class49.method1016(var10.field2677);
                                 }
                              }

                              if(var10 == client.field756) {
                                 var72 = "Please wait...";
                                 var20 = var10.field2648;
                              }

                              if(!var10.field2622) {
                                 var72 = class246.method4621(var72, var10);
                              }

                              var56.method5595(var72, var55, var13, var10.field2627, var10.field2639, var20, var10.field2689?0:-1, var10.field2747, var10.field2688, var10.field2686);
                           }
                        } else if(var10.field2625 == 5) {
                           class318 var57;
                           if(!var10.field2622) {
                              var57 = var10.method4562(class9.method96(var10));
                              if(var57 != null) {
                                 var57.method5891(var55, var13);
                              } else if(class230.field2621) {
                                 class181.method3548(var10);
                              }
                           } else {
                              if(var10.field2754 != -1) {
                                 var57 = class171.method3467(var10.field2754, var10.field2677, var10.field2662, var10.field2742, var10.field2645, false);
                              } else {
                                 var57 = var10.method4562(false);
                              }

                              if(var57 == null) {
                                 if(class230.field2621) {
                                    class181.method3548(var10);
                                 }
                              } else {
                                 var20 = var57.field3796;
                                 var21 = var57.field3792;
                                 if(!var10.field2729) {
                                    var22 = var10.field2627 * 4096 / var20;
                                    if(var10.field2660 != 0) {
                                       var57.method5998(var10.field2627 / 2 + var55, var10.field2639 / 2 + var13, var10.field2660, var22);
                                    } else if(var14 != 0) {
                                       var57.method5903(var55, var13, var10.field2627, var10.field2639, 256 - (var14 & 255));
                                    } else if(var20 == var10.field2627 && var21 == var10.field2639) {
                                       var57.method5891(var55, var13);
                                    } else {
                                       var57.method5897(var55, var13, var10.field2627, var10.field2639);
                                    }
                                 } else {
                                    class314.method5830(var55, var13, var55 + var10.field2627, var13 + var10.field2639);
                                    var22 = (var20 - 1 + var10.field2627) / var20;
                                    var23 = (var21 - 1 + var10.field2639) / var21;

                                    for(var24 = 0; var24 < var22; ++var24) {
                                       for(var25 = 0; var25 < var23; ++var25) {
                                          if(var10.field2660 != 0) {
                                             var57.method5998(var20 / 2 + var55 + var20 * var24, var21 / 2 + var13 + var25 * var21, var10.field2660, 4096);
                                          } else if(var14 != 0) {
                                             var57.method5901(var55 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
                                          } else {
                                             var57.method5891(var55 + var24 * var20, var13 + var21 * var25);
                                          }
                                       }
                                    }

                                    class314.method5763(var2, var3, var4, var5);
                                 }
                              }
                           }
                        } else {
                           class269 var51;
                           if(var10.field2625 == 6) {
                              var63 = class9.method96(var10);
                              if(var63) {
                                 var20 = var10.field2671;
                              } else {
                                 var20 = var10.field2670;
                              }

                              class119 var70 = null;
                              var22 = 0;
                              if(var10.field2754 != -1) {
                                 var51 = class120.method2784(var10.field2754);
                                 if(var51 != null) {
                                    var51 = var51.method5105(var10.field2677);
                                    var70 = var51.method5104(1);
                                    if(var70 != null) {
                                       var70.method2725();
                                       var22 = var70.field1805 / 2;
                                    } else {
                                       class181.method3548(var10);
                                    }
                                 }
                              } else if(var10.field2666 == 5) {
                                 if(var10.field2757 == 0) {
                                    var70 = client.field853.method4506((class273)null, -1, (class273)null, -1);
                                 } else {
                                    var70 = class150.field1948.vmethod3078();
                                 }
                              } else if(var20 == -1) {
                                 var70 = var10.method4529((class273)null, -1, var63, class150.field1948.field561);
                                 if(var70 == null && class230.field2621) {
                                    class181.method3548(var10);
                                 }
                              } else {
                                 class273 var73 = class137.method3151(var20);
                                 var70 = var10.method4529(var73, var10.field2746, var63, class150.field1948.field561);
                                 if(var70 == null && class230.field2621) {
                                    class181.method3548(var10);
                                 }
                              }

                              class122.method2821(var10.field2627 / 2 + var55, var10.field2639 / 2 + var13);
                              var23 = class122.field1702[var10.field2675] * var10.field2701 >> 16;
                              var24 = class122.field1708[var10.field2675] * var10.field2701 >> 16;
                              if(var70 != null) {
                                 if(!var10.field2622) {
                                    var70.method2738(0, var10.field2707, 0, var10.field2675, 0, var23, var24);
                                 } else {
                                    var70.method2725();
                                    if(var10.field2699) {
                                       var70.method2746(0, var10.field2707, var10.field2676, var10.field2675, var10.field2672, var23 + var22 + var10.field2673, var24 + var10.field2673, var10.field2701);
                                    } else {
                                       var70.method2738(0, var10.field2707, var10.field2676, var10.field2675, var10.field2672, var23 + var22 + var10.field2673, var24 + var10.field2673);
                                    }
                                 }
                              }

                              class122.method2818();
                           } else {
                              if(var10.field2625 == 7) {
                                 var56 = var10.method4527();
                                 if(var56 == null) {
                                    if(class230.field2621) {
                                       class181.method3548(var10);
                                    }
                                    continue;
                                 }

                                 var20 = 0;

                                 for(var21 = 0; var21 < var10.field2635; ++var21) {
                                    for(var22 = 0; var22 < var10.field2634; ++var22) {
                                       if(var10.field2758[var20] > 0) {
                                          var51 = class120.method2784(var10.field2758[var20] - 1);
                                          String var47;
                                          if(var51.field3482 != 1 && var10.field2743[var20] == 1) {
                                             var47 = class50.method1060(16748608) + var51.field3449 + "</col>";
                                          } else {
                                             var47 = class50.method1060(16748608) + var51.field3449 + "</col>" + " " + 'x' + class49.method1016(var10.field2743[var20]);
                                          }

                                          var25 = var55 + var22 * (var10.field2690 + 115);
                                          var26 = var13 + (var10.field2691 + 12) * var21;
                                          if(var10.field2747 == 0) {
                                             var56.method5541(var47, var25, var26, var10.field2648, var10.field2689?0:-1);
                                          } else if(var10.field2747 == 1) {
                                             var56.method5567(var47, var10.field2627 / 2 + var25, var26, var10.field2648, var10.field2689?0:-1);
                                          } else {
                                             var56.method5543(var47, var25 + var10.field2627 - 1, var26, var10.field2648, var10.field2689?0:-1);
                                          }
                                       }

                                       ++var20;
                                    }
                                 }
                              }

                              if(var10.field2625 == 8 && var10 == class7.field42 && client.field744 == client.field747) {
                                 var46 = 0;
                                 var20 = 0;
                                 class298 var50 = class56.field524;
                                 String var54 = var10.field2684;

                                 String var71;
                                 for(var54 = class246.method4621(var54, var10); var54.length() > 0; var20 = var20 + var50.field3713 + 1) {
                                    var24 = var54.indexOf("<br>");
                                    if(var24 != -1) {
                                       var71 = var54.substring(0, var24);
                                       var54 = var54.substring(var24 + 4);
                                    } else {
                                       var71 = var54;
                                       var54 = "";
                                    }

                                    var25 = var50.method5536(var71);
                                    if(var25 > var46) {
                                       var46 = var25;
                                    }
                                 }

                                 var46 += 6;
                                 var20 += 7;
                                 var24 = var55 + var10.field2627 - 5 - var46;
                                 var25 = var13 + var10.field2639 + 5;
                                 if(var24 < var55 + 5) {
                                    var24 = var55 + 5;
                                 }

                                 if(var46 + var24 > var4) {
                                    var24 = var4 - var46;
                                 }

                                 if(var25 + var20 > var5) {
                                    var25 = var5 - var20;
                                 }

                                 class314.method5835(var24, var25, var46, var20, 16777120);
                                 class314.method5778(var24, var25, var46, var20, 0);
                                 var54 = var10.field2684;
                                 var26 = var25 + var50.field3713 + 2;

                                 for(var54 = class246.method4621(var54, var10); var54.length() > 0; var26 = var26 + var50.field3713 + 1) {
                                    var49 = var54.indexOf("<br>");
                                    if(var49 != -1) {
                                       var71 = var54.substring(0, var49);
                                       var54 = var54.substring(var49 + 4);
                                    } else {
                                       var71 = var54;
                                       var54 = "";
                                    }

                                    var50.method5541(var71, var24 + 3, var26, 0, -1);
                                 }
                              }

                              if(var10.field2625 == 9) {
                                 if(var10.field2657) {
                                    var46 = var55;
                                    var20 = var13 + var10.field2639;
                                    var21 = var55 + var10.field2627;
                                    var22 = var13;
                                 } else {
                                    var46 = var55;
                                    var20 = var13;
                                    var21 = var55 + var10.field2627;
                                    var22 = var13 + var10.field2639;
                                 }

                                 if(var10.field2656 == 1) {
                                    class314.method5784(var46, var20, var21, var22, var10.field2648);
                                 } else {
                                    var25 = var10.field2648;
                                    var26 = var10.field2656;
                                    var49 = var21 - var46;
                                    var53 = var22 - var20;
                                    var29 = var49 >= 0?var49:-var49;
                                    int var30 = var53 >= 0?var53:-var53;
                                    int var31 = var29;
                                    if(var29 < var30) {
                                       var31 = var30;
                                    }

                                    if(var31 != 0) {
                                       int var32 = (var49 << 16) / var31;
                                       int var33 = (var53 << 16) / var31;
                                       if(var33 <= var32) {
                                          var32 = -var32;
                                       } else {
                                          var33 = -var33;
                                       }

                                       int var34 = var33 * var26 >> 17;
                                       int var35 = var33 * var26 + 1 >> 17;
                                       int var36 = var26 * var32 >> 17;
                                       int var37 = var26 * var32 + 1 >> 17;
                                       var23 = var46 - class314.field3771;
                                       var24 = var20 - class314.field3769;
                                       int var38 = var23 + var34;
                                       int var39 = var23 - var35;
                                       int var40 = var23 + var49 - var35;
                                       int var41 = var23 + var49 + var34;
                                       int var42 = var24 + var36;
                                       int var43 = var24 - var37;
                                       int var44 = var53 + var24 - var37;
                                       int var45 = var24 + var53 + var36;
                                       class122.method2826(var38, var39, var40);
                                       class122.method2862(var42, var43, var44, var38, var39, var40, var25);
                                       class122.method2826(var38, var40, var41);
                                       class122.method2862(var42, var44, var45, var38, var40, var41, var25);
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
