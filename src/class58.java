import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class class58 extends class206 {

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
   int field546;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1104949363
   )
   int field537;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 730027175
   )
   int field538;
   @ObfuscatedName("b")
   String field539;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   class291 field540;
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
   String field542;
   @ObfuscatedName("j")
   String field544;


   class58(int var1, String var2, String var3, String var4) {
      this.field541 = class289.field3652;
      this.field551 = class289.field3652;
      int var5 = ++class83.field1208 - 1;
      this.field546 = var5;
      this.field537 = client.field679;
      this.field538 = var1;
      this.field539 = var2;
      this.method1101();
      this.field542 = var3;
      this.field544 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1484040489"
   )
   void method1106(int var1, String var2, String var3, String var4) {
      int var5 = ++class83.field1208 - 1;
      this.field546 = var5;
      this.field537 = client.field679;
      this.field538 = var1;
      this.field539 = var2;
      this.method1101();
      this.field542 = var3;
      this.field544 = var4;
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
      this.field541 = class109.field1453.field989.method5343(this.field540)?class289.field3651:class289.field3650;
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
      this.field551 = class109.field1453.field993.method5343(this.field540)?class289.field3651:class289.field3650;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1378703733"
   )
   final void method1101() {
      if(this.field539 != null) {
         this.field540 = new class291(class9.method97(this.field539), class19.field168);
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
               class45.field376[var1] = class30.method559(class0.field4[var1], class81.field1178[var1], 1024 - class78.field1114);
            } else if(class78.field1114 > 256) {
               class45.field376[var1] = class81.field1178[var1];
            } else {
               class45.field376[var1] = class30.method559(class81.field1178[var1], class0.field4[var1], 256 - class78.field1114);
            }
         }
      } else if(class78.field1138 > 0) {
         for(var1 = 0; var1 < 256; ++var1) {
            if(class78.field1138 > 768) {
               class45.field376[var1] = class30.method559(class0.field4[var1], class85.field1228[var1], 1024 - class78.field1138);
            } else if(class78.field1138 > 256) {
               class45.field376[var1] = class85.field1228[var1];
            } else {
               class45.field376[var1] = class30.method559(class85.field1228[var1], class0.field4[var1], 256 - class78.field1138);
            }
         }
      } else {
         for(var1 = 0; var1 < 256; ++var1) {
            class45.field376[var1] = class0.field4[var1];
         }
      }

      class314.method5763(class78.field1104, 9, class78.field1104 + 128, var0 + 7);
      class78.field1107.method5893(class78.field1104, 0);
      class314.method5762();
      var1 = 0;
      int var2 = class50.field455.field3774 * 9 + class78.field1104;

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
               var10 = class50.field455.field3773[var2];
               class50.field455.field3773[var2++] = (var8 * (var7 & '\uff00') + var9 * (var10 & '\uff00') & 16711680) + ((var7 & 16711935) * var8 + (var10 & 16711935) * var9 & -16711936) >> 8;
            } else {
               ++var2;
            }
         }

         var2 += var5 + class50.field455.field3774 - 128;
      }

      class314.method5763(class78.field1104 + 765 - 128, 9, class78.field1104 + 765, var0 + 7);
      class24.field224.method5893(class78.field1104 + 382, 0);
      class314.method5762();
      var1 = 0;
      var2 = class50.field455.field3774 * 9 + class78.field1104 + 637 + 24;

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
               var10 = class50.field455.field3773[var2];
               class50.field455.field3773[var2++] = (var9 * (var10 & '\uff00') + var8 * (var7 & '\uff00') & 16711680) + ((var10 & 16711935) * var9 + (var7 & 16711935) * var8 & -16711936) >> 8;
            } else {
               ++var2;
            }
         }

         var1 += 128 - var5;
         var2 += class50.field455.field3774 - var5 - var4;
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ILcs;ZS)I",
      garbageValue = "-11807"
   )
   static int method1118(int var0, class84 var1, boolean var2) {
      int var3;
      if(var0 == 3200) {
         class45.field377 -= 3;
         var3 = class69.field1026[class45.field377];
         int var4 = class69.field1026[class45.field377 + 1];
         int var5 = class69.field1026[class45.field377 + 2];
         if(client.field768 != 0 && var4 != 0 && client.field598 < 50) {
            client.field829[client.field598] = var3;
            client.field695[client.field598] = var4;
            client.field831[client.field598] = var5;
            client.field762[client.field598] = null;
            client.field832[client.field598] = 0;
            ++client.field598;
         }

         return 1;
      } else if(var0 != 3201) {
         if(var0 == 3202) {
            class45.field377 -= 2;
            class259.method4879(class69.field1026[class45.field377], class69.field1026[class45.field377 + 1]);
            return 1;
         } else {
            return 2;
         }
      } else {
         var3 = class69.field1026[--class45.field377];
         if(var3 == -1 && !client.field825) {
            class37.method721();
         } else if(var3 != -1 && var3 != client.field824 && client.field693 != 0 && !client.field825) {
            class169.method3459(2, class48.field436, var3, 0, client.field693, false);
         }

         client.field824 = var3;
         return 1;
      }
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(Lfr;I)V",
      garbageValue = "1845437737"
   )
   static final void method1117(class171 var0) {
      class189 var1 = client.field739.field1254;
      int var3;
      int var5;
      int var6;
      class80 var7;
      int var37;
      int var38;
      if(class171.field2267 == var0) {
         var37 = var1.method3574();
         var3 = var1.method3730();
         var38 = (var3 >> 4 & 7) + field545;
         var5 = (var3 & 7) + class84.field1219;
         var6 = var1.method3574();
         if(var38 >= 0 && var5 >= 0 && var38 < 104 && var5 < 104) {
            var7 = new class80();
            var7.field1174 = var37;
            var7.field1172 = var6;
            if(client.field720[class192.field2415][var38][var5] == null) {
               client.field720[class192.field2415][var38][var5] = new class205();
            }

            client.field720[class192.field2415][var38][var5].method4126(var7);
            class171.method3472(var38, var5);
         }

      } else {
         byte var2;
         int var8;
         int var9;
         int var11;
         int var13;
         int var14;
         int var31;
         if(class171.field2274 == var0) {
            var2 = var1.method3702();
            var3 = var1.method3574();
            byte var4 = var1.method3569();
            var5 = var1.method3553();
            var6 = (var5 >> 4 & 7) + field545;
            var31 = (var5 & 7) + class84.field1219;
            var8 = var1.method3784();
            var9 = var1.method3562();
            byte var10 = var1.method3765();
            var11 = var1.method3574();
            byte var12 = var1.method3600();
            var13 = var1.method3742();
            var14 = var13 >> 2;
            int var15 = var13 & 3;
            int var16 = client.field653[var14];
            class60 var17;
            if(var9 == client.field709) {
               var17 = class150.field1948;
            } else {
               var17 = client.field806[var9];
            }

            if(var17 != null) {
               class268 var18 = class40.method766(var8);
               int var19;
               int var20;
               if(var15 != 1 && var15 != 3) {
                  var19 = var18.field3404;
                  var20 = var18.field3420;
               } else {
                  var19 = var18.field3420;
                  var20 = var18.field3404;
               }

               int var21 = var6 + (var19 >> 1);
               int var22 = var6 + (var19 + 1 >> 1);
               int var23 = var31 + (var20 >> 1);
               int var24 = var31 + (var20 + 1 >> 1);
               int[][] var25 = class50.field447[class192.field2415];
               int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
               int var27 = (var6 << 7) + (var19 << 6);
               int var28 = (var31 << 7) + (var20 << 6);
               class119 var29 = var18.method5052(var14, var15, var25, var27, var26, var28);
               if(var29 != null) {
                  class222.method4447(class192.field2415, var6, var31, var16, -1, 0, 0, var11 + 1, var3 + 1);
                  var17.field575 = var11 + client.field679;
                  var17.field570 = var3 + client.field679;
                  var17.field574 = var29;
                  var17.field571 = var6 * 128 + var19 * 64;
                  var17.field582 = var31 * 128 + var20 * 64;
                  var17.field562 = var26;
                  byte var30;
                  if(var10 > var12) {
                     var30 = var10;
                     var10 = var12;
                     var12 = var30;
                  }

                  if(var2 > var4) {
                     var30 = var2;
                     var2 = var4;
                     var4 = var30;
                  }

                  var17.field568 = var10 + var6;
                  var17.field577 = var12 + var6;
                  var17.field573 = var31 + var2;
                  var17.field578 = var31 + var4;
               }
            }
         }

         if(class171.field2269 == var0) {
            var37 = var1.method3742();
            var3 = (var37 >> 4 & 7) + field545;
            var38 = (var37 & 7) + class84.field1219;
            var5 = var1.method3553();
            var6 = var5 >> 2;
            var31 = var5 & 3;
            var8 = client.field653[var6];
            if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
               class222.method4447(class192.field2415, var3, var38, var8, -1, var6, var31, 0, -1);
            }

         } else if(class171.field2272 == var0) {
            var37 = var1.method3784();
            var3 = var1.method3597();
            var38 = (var3 >> 4 & 7) + field545;
            var5 = (var3 & 7) + class84.field1219;
            if(var38 >= 0 && var5 >= 0 && var38 < 104 && var5 < 104) {
               class205 var32 = client.field720[class192.field2415][var38][var5];
               if(var32 != null) {
                  for(var7 = (class80)var32.method4113(); var7 != null; var7 = (class80)var32.method4104()) {
                     if((var37 & 32767) == var7.field1174) {
                        var7.method4098();
                        break;
                     }
                  }

                  if(var32.method4113() == null) {
                     client.field720[class192.field2415][var38][var5] = null;
                  }

                  class171.method3472(var38, var5);
               }
            }

         } else {
            int var39;
            if(class171.field2276 == var0) {
               var37 = var1.method3597();
               var3 = var1.method3597();
               var38 = var3 >> 4 & 15;
               var5 = var3 & 7;
               var6 = var1.method3574();
               var31 = var1.method3553();
               var8 = (var31 >> 4 & 7) + field545;
               var9 = (var31 & 7) + class84.field1219;
               if(var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  var39 = var38 + 1;
                  if(class150.field1948.field928[0] >= var8 - var39 && class150.field1948.field928[0] <= var8 + var39 && class150.field1948.field939[0] >= var9 - var39 && class150.field1948.field939[0] <= var39 + var9 && client.field827 != 0 && var5 > 0 && client.field598 < 50) {
                     client.field829[client.field598] = var6;
                     client.field695[client.field598] = var5;
                     client.field831[client.field598] = var37;
                     client.field762[client.field598] = null;
                     client.field832[client.field598] = var38 + (var9 << 8) + (var8 << 16);
                     ++client.field598;
                  }
               }
            }

            if(class171.field2271 == var0) {
               var2 = var1.method3765();
               var3 = var1.method3742();
               var38 = var1.method3609();
               var5 = var1.method3676();
               var6 = var1.method3742() * 4;
               var31 = var1.method3676();
               var8 = var1.method3553() * 4;
               var9 = var1.method3597();
               var39 = (var9 >> 4 & 7) + field545;
               var11 = (var9 & 7) + class84.field1219;
               int var40 = var1.method3553();
               byte var41 = var1.method3765();
               var14 = var1.method3574();
               var13 = var41 + var39;
               var37 = var2 + var11;
               if(var39 >= 0 && var11 >= 0 && var39 < 104 && var11 < 104 && var13 >= 0 && var37 >= 0 && var13 < 104 && var37 < 104 && var14 != '\uffff') {
                  var39 = var39 * 128 + 64;
                  var11 = var11 * 128 + 64;
                  var13 = var13 * 128 + 64;
                  var37 = var37 * 128 + 64;
                  class79 var33 = new class79(var14, class192.field2415, var39, var11, class264.method4955(var39, var11, class192.field2415) - var8, var31 + client.field679, var5 + client.field679, var40, var3, var38, var6);
                  var33.method1890(var13, var37, class264.method4955(var13, var37, class192.field2415) - var6, var31 + client.field679);
                  client.field722.method4126(var33);
               }

            } else if(class171.field2275 == var0) {
               var37 = var1.method3742();
               var3 = (var37 >> 4 & 7) + field545;
               var38 = (var37 & 7) + class84.field1219;
               var5 = var1.method3574();
               var6 = var1.method3553();
               var31 = var6 >> 2;
               var8 = var6 & 3;
               var9 = client.field653[var31];
               if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                  class222.method4447(class192.field2415, var3, var38, var9, var5, var31, var8, 0, -1);
               }

            } else if(class171.field2270 == var0) {
               var37 = var1.method3730();
               var3 = (var37 >> 4 & 7) + field545;
               var38 = (var37 & 7) + class84.field1219;
               var5 = var1.method3784();
               var6 = var1.method3730();
               var31 = var6 >> 2;
               var8 = var6 & 3;
               var9 = client.field653[var31];
               if(var3 >= 0 && var38 >= 0 && var3 < 103 && var38 < 103) {
                  if(var9 == 0) {
                     class128 var34 = class56.field523.method3049(class192.field2415, var3, var38);
                     if(var34 != null) {
                        var11 = class8.method93(var34.field1818);
                        if(var31 == 2) {
                           var34.field1811 = new class85(var11, 2, var8 + 4, class192.field2415, var3, var38, var5, false, var34.field1811);
                           var34.field1812 = new class85(var11, 2, var8 + 1 & 3, class192.field2415, var3, var38, var5, false, var34.field1812);
                        } else {
                           var34.field1811 = new class85(var11, var31, var8, class192.field2415, var3, var38, var5, false, var34.field1811);
                        }
                     }
                  }

                  if(var9 == 1) {
                     class133 var42 = class56.field523.method2924(class192.field2415, var3, var38);
                     if(var42 != null) {
                        var11 = class8.method93(var42.field1851);
                        if(var31 != 4 && var31 != 5) {
                           if(var31 == 6) {
                              var42.field1854 = new class85(var11, 4, var8 + 4, class192.field2415, var3, var38, var5, false, var42.field1854);
                           } else if(var31 == 7) {
                              var42.field1854 = new class85(var11, 4, (var8 + 2 & 3) + 4, class192.field2415, var3, var38, var5, false, var42.field1854);
                           } else if(var31 == 8) {
                              var42.field1854 = new class85(var11, 4, var8 + 4, class192.field2415, var3, var38, var5, false, var42.field1854);
                              var42.field1855 = new class85(var11, 4, (var8 + 2 & 3) + 4, class192.field2415, var3, var38, var5, false, var42.field1855);
                           }
                        } else {
                           var42.field1854 = new class85(var11, 4, var8, class192.field2415, var3, var38, var5, false, var42.field1854);
                        }
                     }
                  }

                  if(var9 == 2) {
                     class134 var43 = class56.field523.method2925(class192.field2415, var3, var38);
                     if(var31 == 11) {
                        var31 = 10;
                     }

                     if(var43 != null) {
                        var43.field1861 = new class85(class8.method93(var43.field1863), var31, var8, class192.field2415, var3, var38, var5, false, var43.field1861);
                     }
                  }

                  if(var9 == 3) {
                     class115 var44 = class56.field523.method2926(class192.field2415, var3, var38);
                     if(var44 != null) {
                        var44.field1553 = new class85(class8.method93(var44.field1550), 22, var8, class192.field2415, var3, var38, var5, false, var44.field1553);
                     }
                  }
               }

            } else if(class171.field2268 == var0) {
               var37 = var1.method3597();
               var3 = (var37 >> 4 & 7) + field545;
               var38 = (var37 & 7) + class84.field1219;
               var5 = var1.method3676();
               var6 = var1.method3574();
               var31 = var1.method3730();
               if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                  var3 = var3 * 128 + 64;
                  var38 = var38 * 128 + 64;
                  class70 var45 = new class70(var5, class192.field2415, var3, var38, class264.method4955(var3, var38, class192.field2415) - var31, var6, client.field679);
                  client.field660.method4126(var45);
               }

            } else if(class171.field2273 == var0) {
               var37 = var1.method3784();
               var3 = var1.method3562();
               var38 = var1.method3742();
               var5 = (var38 >> 4 & 7) + field545;
               var6 = (var38 & 7) + class84.field1219;
               var31 = var1.method3574();
               if(var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                  class205 var35 = client.field720[class192.field2415][var5][var6];
                  if(var35 != null) {
                     for(class80 var36 = (class80)var35.method4113(); var36 != null; var36 = (class80)var35.method4104()) {
                        if((var3 & 32767) == var36.field1174 && var31 == var36.field1172) {
                           var36.field1172 = var37;
                           break;
                        }
                     }

                     class171.method3472(var5, var6);
                  }
               }

            }
         }
      }
   }
}
