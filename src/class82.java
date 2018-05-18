import java.io.EOFException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class82 {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field1201;
   @ObfuscatedName("q")
   boolean[] field1198;
   @ObfuscatedName("b")
   boolean[] field1194;
   @ObfuscatedName("f")
   int[] field1193;
   @ObfuscatedName("n")
   String[] field1197;
   @ObfuscatedName("h")
   boolean field1195 = false;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 2432140607770714695L
   )
   long field1199;


   class82() {
      this.field1193 = new int[class9.field62.method4638(19)];
      this.field1197 = new String[class9.field62.method4638(15)];
      this.field1198 = new boolean[this.field1193.length];

      int var1;
      for(var1 = 0; var1 < this.field1193.length; ++var1) {
         class256 var2 = class269.method5162(var1);
         this.field1198[var1] = var2.field3280;
      }

      this.field1194 = new boolean[this.field1197.length];

      for(var1 = 0; var1 < this.field1197.length; ++var1) {
         class257 var3 = (class257)class257.field3285.method4023((long)var1);
         class257 var5;
         if(var3 != null) {
            var5 = var3;
         } else {
            byte[] var4 = class257.field3283.method4626(15, var1);
            var3 = new class257();
            if(var4 != null) {
               var3.method4856(new class182(var4));
            }

            class257.field3285.method4028(var3, (long)var1);
            var5 = var3;
         }

         this.field1194[var1] = var5.field3284;
      }

      for(var1 = 0; var1 < this.field1193.length; ++var1) {
         this.field1193[var1] = -1;
      }

      this.method1956();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1690799990"
   )
   void method1953(int var1, int var2) {
      this.field1193[var1] = var2;
      if(this.field1198[var1]) {
         this.field1195 = true;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-142550563"
   )
   int method1925(int var1) {
      return this.field1193[var1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)V",
      garbageValue = "-70"
   )
   void method1927(int var1, String var2) {
      this.field1197[var1] = var2;
      if(this.field1194[var1]) {
         this.field1195 = true;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-832363602"
   )
   String method1928(int var1) {
      return this.field1197[var1];
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "6"
   )
   void method1963() {
      int var1;
      for(var1 = 0; var1 < this.field1193.length; ++var1) {
         if(!this.field1198[var1]) {
            this.field1193[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.field1197.length; ++var1) {
         if(!this.field1194[var1]) {
            this.field1197[var1] = null;
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ZI)Ldw;",
      garbageValue = "694169563"
   )
   class110 method1930(boolean var1) {
      return class240.method4600("2", class170.field2265.field3160, var1);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1372754296"
   )
   void method1931() {
      class110 var1 = this.method1930(true);

      try {
         int var2 = 3;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.field1193.length; ++var4) {
            if(this.field1198[var4] && this.field1193[var4] != -1) {
               var2 += 6;
               ++var3;
            }
         }

         var2 += 2;
         var4 = 0;

         for(int var5 = 0; var5 < this.field1197.length; ++var5) {
            if(this.field1194[var5] && this.field1197[var5] != null) {
               var2 += 2 + class12.method123(this.field1197[var5]);
               ++var4;
            }
         }

         class182 var9 = new class182(var2);
         var9.method3552(1);
         var9.method3602(var3);

         int var6;
         for(var6 = 0; var6 < this.field1193.length; ++var6) {
            if(this.field1198[var6] && this.field1193[var6] != -1) {
               var9.method3602(var6);
               var9.method3555(this.field1193[var6]);
            }
         }

         var9.method3602(var4);

         for(var6 = 0; var6 < this.field1197.length; ++var6) {
            if(this.field1194[var6] && this.field1197[var6] != null) {
               var9.method3602(var6);
               var9.method3549(this.field1197[var6]);
            }
         }

         var1.method2556(var9.field2365, 0, var9.field2359);
      } catch (Exception var17) {
         ;
      } finally {
         try {
            var1.method2564();
         } catch (Exception var16) {
            ;
         }

      }

      this.field1195 = false;
      this.field1199 = class166.method3456();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-918064895"
   )
   void method1956() {
      class110 var1 = this.method1930(false);

      try {
         byte[] var2 = new byte[(int)var1.method2574()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var1.method2560(var2, var3, var2.length - var3);
            if(var4 == -1) {
               throw new EOFException();
            }
         }

         class182 var13 = new class182(var2);
         if(var13.field2365.length - var13.field2359 < 1) {
            return;
         }

         int var14 = var13.method3742();
         if(var14 < 0 || var14 > 1) {
            return;
         }

         int var15 = var13.method3574();

         int var7;
         int var8;
         int var9;
         for(var7 = 0; var7 < var15; ++var7) {
            var8 = var13.method3574();
            var9 = var13.method3573();
            if(this.field1198[var8]) {
               this.field1193[var8] = var9;
            }
         }

         var7 = var13.method3574();

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var13.method3574();
            String var10 = var13.method3577();
            if(this.field1194[var9]) {
               this.field1197[var9] = var10;
            }
         }
      } catch (Exception var24) {
         ;
      } finally {
         try {
            var1.method2564();
         } catch (Exception var23) {
            ;
         }

      }

      this.field1195 = false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-684314641"
   )
   void method1933() {
      if(this.field1195 && this.field1199 < class166.method3456() - 60000L) {
         this.method1931();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "7"
   )
   boolean method1926() {
      return this.field1195;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "-82"
   )
   static int method1943(int var0, class84 var1, boolean var2) {
      class230 var3 = var2?class184.field2379:class67.field996;
      if(var0 == 1500) {
         class69.field1026[++class45.field377 - 1] = var3.field2636;
         return 1;
      } else if(var0 == 1501) {
         class69.field1026[++class45.field377 - 1] = var3.field2637;
         return 1;
      } else if(var0 == 1502) {
         class69.field1026[++class45.field377 - 1] = var3.field2627;
         return 1;
      } else if(var0 == 1503) {
         class69.field1026[++class45.field377 - 1] = var3.field2639;
         return 1;
      } else if(var0 == 1504) {
         class69.field1026[++class45.field377 - 1] = var3.field2643?1:0;
         return 1;
      } else if(var0 == 1505) {
         class69.field1026[++class45.field377 - 1] = var3.field2642;
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
   static void method1960(class298 var0, class298 var1) {
      if(class51.field469 == null) {
         class51.field469 = class36.method689(class59.field553, "sl_back", "");
      }

      if(class13.field104 == null) {
         class13.field104 = class278.method5253(class59.field553, "sl_flags", "");
      }

      if(class189.field2398 == null) {
         class189.field2398 = class278.method5253(class59.field553, "sl_arrows", "");
      }

      if(class9.field61 == null) {
         class9.field61 = class278.method5253(class59.field553, "sl_stars", "");
      }

      class314.method5835(class78.field1104, 23, 765, 480, 0);
      class314.method5811(class78.field1104, 0, 125, 23, 12425273, 9135624);
      class314.method5811(class78.field1104 + 125, 0, 640, 23, 5197647, 2697513);
      var0.method5567("Select a world", class78.field1104 + 62, 15, 0, -1);
      if(class9.field61 != null) {
         class9.field61[1].method5873(class78.field1104 + 140, 1);
         var1.method5541("Members only world", class78.field1104 + 152, 10, 16777215, -1);
         class9.field61[0].method5873(class78.field1104 + 140, 12);
         var1.method5541("Free world", class78.field1104 + 152, 21, 16777215, -1);
      }

      int var4;
      int var5;
      if(class189.field2398 != null) {
         int var2 = class78.field1104 + 280;
         if(class65.field958[0] == 0 && class65.field969[0] == 0) {
            class189.field2398[2].method5873(var2, 4);
         } else {
            class189.field2398[0].method5873(var2, 4);
         }

         if(class65.field958[0] == 0 && class65.field969[0] == 1) {
            class189.field2398[3].method5873(var2 + 15, 4);
         } else {
            class189.field2398[1].method5873(var2 + 15, 4);
         }

         var0.method5541("World", var2 + 32, 17, 16777215, -1);
         int var3 = class78.field1104 + 390;
         if(class65.field958[0] == 1 && class65.field969[0] == 0) {
            class189.field2398[2].method5873(var3, 4);
         } else {
            class189.field2398[0].method5873(var3, 4);
         }

         if(class65.field958[0] == 1 && class65.field969[0] == 1) {
            class189.field2398[3].method5873(var3 + 15, 4);
         } else {
            class189.field2398[1].method5873(var3 + 15, 4);
         }

         var0.method5541("Players", var3 + 32, 17, 16777215, -1);
         var4 = class78.field1104 + 500;
         if(class65.field958[0] == 2 && class65.field969[0] == 0) {
            class189.field2398[2].method5873(var4, 4);
         } else {
            class189.field2398[0].method5873(var4, 4);
         }

         if(class65.field958[0] == 2 && class65.field969[0] == 1) {
            class189.field2398[3].method5873(var4 + 15, 4);
         } else {
            class189.field2398[1].method5873(var4 + 15, 4);
         }

         var0.method5541("Location", var4 + 32, 17, 16777215, -1);
         var5 = class78.field1104 + 610;
         if(class65.field958[0] == 3 && class65.field969[0] == 0) {
            class189.field2398[2].method5873(var5, 4);
         } else {
            class189.field2398[0].method5873(var5, 4);
         }

         if(class65.field958[0] == 3 && class65.field969[0] == 1) {
            class189.field2398[3].method5873(var5 + 15, 4);
         } else {
            class189.field2398[1].method5873(var5 + 15, 4);
         }

         var0.method5541("Type", var5 + 32, 17, 16777215, -1);
      }

      class314.method5835(class78.field1104 + 708, 4, 50, 16, 0);
      var1.method5567("Cancel", class78.field1104 + 708 + 25, 16, 16777215, -1);
      class78.field1137 = -1;
      if(class51.field469 != null) {
         byte var21 = 88;
         byte var22 = 19;
         var4 = 765 / (var21 + 1);
         var5 = 480 / (var22 + 1);

         int var6;
         int var7;
         do {
            do {
               var6 = var5;
               var7 = var4;
               if(var5 * (var4 - 1) >= class65.field955) {
                  --var4;
               }

               if(var4 * (var5 - 1) >= class65.field955) {
                  --var5;
               }

               if(var4 * (var5 - 1) >= class65.field955) {
                  --var5;
               }
            } while(var5 != var6);
         } while(var4 != var7);

         var6 = (765 - var4 * var21) / (var4 + 1);
         if(var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var5 * var22) / (var5 + 1);
         if(var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var4 * var21 - var6 * (var4 - 1)) / 2;
         int var9 = (480 - var22 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = var9 + 23;
         int var11 = var8 + class78.field1104;
         int var12 = 0;
         boolean var13 = false;

         int var14;
         for(var14 = 0; var14 < class65.field955; ++var14) {
            class65 var15 = class143.field1914[var14];
            boolean var16 = true;
            String var17 = Integer.toString(var15.field957);
            if(var15.field957 == -1) {
               var17 = "OFF";
               var16 = false;
            } else if(var15.field957 > 1980) {
               var17 = "FULL";
               var16 = false;
            }

            int var19 = 0;
            byte var18;
            if(var15.method1607()) {
               if(var15.method1603()) {
                  var18 = 7;
               } else {
                  var18 = 6;
               }
            } else if(var15.method1639()) {
               var19 = 16711680;
               if(var15.method1603()) {
                  var18 = 5;
               } else {
                  var18 = 4;
               }
            } else if(var15.method1605()) {
               if(var15.method1603()) {
                  var18 = 3;
               } else {
                  var18 = 2;
               }
            } else if(var15.method1603()) {
               var18 = 1;
            } else {
               var18 = 0;
            }

            if(class48.field425 >= var11 && class48.field417 >= var10 && class48.field425 < var21 + var11 && class48.field417 < var10 + var22 && var16) {
               class78.field1137 = var14;
               class51.field469[var18].method5916(var11, var10, 128, 16777215);
               var13 = true;
            } else {
               class51.field469[var18].method5893(var11, var10);
            }

            if(class13.field104 != null) {
               class13.field104[(var15.method1603()?8:0) + var15.field952].method5873(var11 + 29, var10);
            }

            var0.method5567(Integer.toString(var15.field960), var11 + 15, var22 / 2 + var10 + 5, var19, -1);
            var1.method5567(var17, var11 + 60, var22 / 2 + var10 + 5, 268435455, -1);
            var10 = var10 + var22 + var7;
            ++var12;
            if(var12 >= var5) {
               var10 = var9 + 23;
               var11 = var11 + var6 + var21;
               var12 = 0;
            }
         }

         if(var13) {
            var14 = var1.method5536(class143.field1914[class78.field1137].field964) + 6;
            int var20 = var1.field3713 + 8;
            class314.method5835(class48.field425 - var14 / 2, class48.field417 + 20 + 5, var14, var20, 16777120);
            class314.method5778(class48.field425 - var14 / 2, class48.field417 + 20 + 5, var14, var20, 0);
            var1.method5567(class143.field1914[class78.field1137].field964, class48.field425, class48.field417 + var1.field3713 + 20 + 5 + 4, 0, -1);
         }
      }

      class50.field455.vmethod5851(0, 0);
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "292053091"
   )
   static final void method1959() {
      client.field739.method2023();
      class55.method1074();
      class56.field523.method2901();

      for(int var0 = 0; var0 < 4; ++var0) {
         client.field666[var0].method3413();
      }

      System.gc();
      class190.method3911(2);
      client.field824 = -1;
      client.field825 = false;
      class59.method1126();
      class102.method2310(10);
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1469338263"
   )
   static final void method1932() {
      for(class79 var0 = (class79)client.field722.method4113(); var0 != null; var0 = (class79)client.field722.method4104()) {
         if(var0.field1144 == class192.field2415 && client.field679 <= var0.field1158) {
            if(client.field679 >= var0.field1150) {
               if(var0.field1154 > 0) {
                  class72 var1 = client.field807[var0.field1154 - 1];
                  if(var1 != null && var1.field900 >= 0 && var1.field900 < 13312 && var1.field918 >= 0 && var1.field918 < 13312) {
                     var0.method1890(var1.field900, var1.field918, class264.method4955(var1.field900, var1.field918, var0.field1144) - var0.field1156, client.field679);
                  }
               }

               if(var0.field1154 < 0) {
                  int var2 = -var0.field1154 - 1;
                  class60 var3;
                  if(var2 == client.field709) {
                     var3 = class150.field1948;
                  } else {
                     var3 = client.field806[var2];
                  }

                  if(var3 != null && var3.field900 >= 0 && var3.field900 < 13312 && var3.field918 >= 0 && var3.field918 < 13312) {
                     var0.method1890(var3.field900, var3.field918, class264.method4955(var3.field900, var3.field918, var0.field1144) - var0.field1156, client.field679);
                  }
               }

               var0.method1894(client.field654);
               class56.field523.method2945(class192.field2415, (int)var0.field1151, (int)var0.field1169, (int)var0.field1155, 60, var0, var0.field1164, -1L, false);
            }
         } else {
            var0.method4098();
         }
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(Lbu;IIIB)V",
      garbageValue = "50"
   )
   static final void method1942(class60 var0, int var1, int var2, int var3) {
      if(class150.field1948 != var0) {
         if(client.field657 < 400) {
            String var4;
            if(var0.field576 == 0) {
               var4 = var0.field565[0] + var0.field587 + var0.field565[1] + class32.method598(var0.field566, class150.field1948.field566) + " " + " (" + "level-" + var0.field566 + ")" + var0.field565[2];
            } else {
               var4 = var0.field565[0] + var0.field587 + var0.field565[1] + " " + " (" + "skill-" + var0.field576 + ")" + var0.field565[2];
            }

            int var5;
            if(client.field771 == 1) {
               class121.method2816("Use", client.field759 + " " + "->" + " " + class50.method1060(16777215) + var4, 14, var1, var2, var3);
            } else if(client.field813) {
               if((class45.field373 & 8) == 8) {
                  class121.method2816(client.field750, client.field751 + " " + "->" + " " + class50.method1060(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var5 = 7; var5 >= 0; --var5) {
                  if(client.field650[var5] != null) {
                     short var6 = 0;
                     if(client.field650[var5].equalsIgnoreCase("Attack")) {
                        if(client.field620 == class77.field1094) {
                           continue;
                        }

                        if(class77.field1097 == client.field620 || class77.field1098 == client.field620 && var0.field566 > class150.field1948.field566) {
                           var6 = 2000;
                        }

                        if(class150.field1948.field569 != 0 && var0.field569 != 0) {
                           if(var0.field569 == class150.field1948.field569) {
                              var6 = 2000;
                           } else {
                              var6 = 0;
                           }
                        }
                     } else if(client.field850[var5]) {
                        var6 = 2000;
                     }

                     boolean var7 = false;
                     int var8 = client.field833[var5] + var6;
                     class121.method2816(client.field650[var5], class50.method1060(16777215) + var4, var8, var1, var2, var3);
                  }
               }
            }

            for(var5 = 0; var5 < client.field657; ++var5) {
               if(client.field702[var5] == 23) {
                  client.field735[var5] = class50.method1060(16777215) + var4;
                  break;
               }
            }

         }
      }
   }
}
