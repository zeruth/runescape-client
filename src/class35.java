import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class35 {

   @ObfuscatedName("pn")
   @ObfuscatedGetter(
      intValue = -376980529
   )
   static int field305;
   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   static class318 field302;
   @ObfuscatedName("jw")
   @ObfuscatedGetter(
      intValue = -1976888445
   )
   static int field303;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1496637941
   )
   int field301;
   @ObfuscatedName("m")
   byte[][][] field299;


   class35(int var1) {
      this.field301 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "-870273324"
   )
   void method637(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var7 != 0 && this.field301 != 0 && this.field299 != null) {
         var8 = this.method680(var8, var7);
         var7 = this.method638(var7);
         class314.method5785(var1, var2, var5, var6, var3, var4, this.field299[var7 - 1][var8], this.field301);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-2130715732"
   )
   int method680(int var1, int var2) {
      if(var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if(var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if(var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IS)I",
      garbageValue = "4002"
   )
   int method638(int var1) {
      return var1 != 9 && var1 != 10?(var1 == 11?8:var1):1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1994719964"
   )
   void method640() {
      if(this.field299 == null) {
         this.field299 = new byte[8][4][];
         this.method673();
         this.method655();
         this.method643();
         this.method644();
         this.method645();
         this.method646();
         this.method647();
         this.method648();
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-119"
   )
   void method673() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[0][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[0][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[0][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[0][3] = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "5"
   )
   void method655() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[1][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var2 >= 0 && var2 < var1.length) {
               if(var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.field299[1][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[1][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[1][3] = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1687606976"
   )
   void method643() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[2][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[2][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[2][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[2][3] = var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-4998204"
   )
   void method644() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[3][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[3][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[3][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[3][3] = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-57"
   )
   void method645() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[4][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[4][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[4][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[4][3] = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-670542486"
   )
   void method646() {
      byte[] var1 = new byte[this.field301 * this.field301];
      boolean var2 = false;
      var1 = new byte[this.field301 * this.field301];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[5][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var3 <= this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[5][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 >= this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[5][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var3 >= this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[5][3] = var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2122508607"
   )
   void method647() {
      byte[] var1 = new byte[this.field301 * this.field301];
      boolean var2 = false;
      var1 = new byte[this.field301 * this.field301];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= var3 - this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[6][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 <= var3 - this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[6][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[6][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[6][3] = var1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "188281095"
   )
   void method648() {
      byte[] var1 = new byte[this.field301 * this.field301];
      boolean var2 = false;
      var1 = new byte[this.field301 * this.field301];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 >= var3 - this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[7][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if(var4 >= var3 - this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[7][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[7][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var5 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field301 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field299[7][3] = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIII)Llc;",
      garbageValue = "-1346052124"
   )
   static class318 method684(int var0, int var1, int var2) {
      return (class318)class23.field203.method4033(class120.method2812(var0, var1, var2));
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lz;III)V",
      garbageValue = "-120085475"
   )
   static void method665(class21 var0, int var1, int var2) {
      class23.field204.method4036(var0, class120.method2812(var1, var2, 0));
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "6"
   )
   static final void method679() {
      if(!class120.field1683) {
         int var0 = class125.field1767;
         int var1 = class125.field1768;
         int var2 = class125.field1770;
         int var3 = class125.field1784;
         byte var4 = 50;
         short var5 = 3500;
         int var6 = (class120.field1681 - class122.field1705) * var4 / class122.field1711;
         int var7 = (class120.field1680 - class122.field1713) * var4 / class122.field1711;
         int var8 = (class120.field1681 - class122.field1705) * var5 / class122.field1711;
         int var9 = (class120.field1680 - class122.field1713) * var5 / class122.field1711;
         int var10 = class122.method2840(var7, var4, var1, var0);
         int var11 = class122.method2842(var7, var4, var1, var0);
         var7 = var10;
         var10 = class122.method2840(var9, var5, var1, var0);
         int var12 = class122.method2842(var9, var5, var1, var0);
         var9 = var10;
         var10 = class122.method2838(var6, var11, var3, var2);
         var11 = class122.method2839(var6, var11, var3, var2);
         var6 = var10;
         var10 = class122.method2838(var8, var12, var3, var2);
         var12 = class122.method2839(var8, var12, var3, var2);
         class120.field1684 = (var6 + var10) / 2;
         class148.field1936 = (var9 + var7) / 2;
         class304.field3737 = (var11 + var12) / 2;
         class72.field1056 = (var10 - var6) / 2;
         class291.field3662 = (var9 - var7) / 2;
         class120.field1685 = (var12 - var11) / 2;
         class296.field3692 = Math.abs(class72.field1056);
         class154.field1980 = Math.abs(class291.field3662);
         class120.field1682 = Math.abs(class120.field1685);
      }
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1790454621"
   )
   static final void method682(int var0, int var1, int var2, int var3) {
      ++client.field690;
      if(class150.field1948.field900 >> 7 == client.field820 && class150.field1948.field918 >> 7 == client.field821) {
         client.field820 = 0;
      }

      class145.method3200();
      class1.method14();
      class120.method2813(true);
      int var4 = class81.field1180;
      int[] var5 = class81.field1181;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         if(var5[var6] != client.field719 && var5[var6] != client.field709) {
            class32.method586(client.field806[var5[var6]], true);
         }
      }

      class120.method2813(false);
      class82.method1932();
      class32.method595();
      class132.method3113(var0, var1, var2, var3, true);
      var0 = client.field848;
      var1 = client.field849;
      var2 = client.field834;
      var3 = client.field661;
      class314.method5763(var0, var1, var0 + var2, var3 + var1);
      class122.method2850();
      int var28;
      if(!client.field746) {
         var4 = client.field632;
         if(client.field723 / 256 > var4) {
            var4 = client.field723 / 256;
         }

         if(client.field835[4] && client.field837[4] + 128 > var4) {
            var4 = client.field837[4] + 128;
         }

         var28 = client.field662 & 2047;
         class132.method3111(class154.field1979, client.field857, class53.field481, var4, var28, var4 * 3 + 600);
      }

      if(!client.field746) {
         var4 = class163.method3411();
      } else {
         var4 = class187.method3860();
      }

      var28 = class14.field118;
      var6 = class12.field96;
      int var7 = class13.field102;
      int var8 = class146.field1935;
      int var9 = class55.field507;

      int var10;
      int var11;
      for(var10 = 0; var10 < 5; ++var10) {
         if(client.field835[var10]) {
            var11 = (int)(Math.random() * (double)(client.field836[var10] * 2 + 1) - (double)client.field836[var10] + Math.sin((double)client.field765[var10] * ((double)client.field855[var10] / 100.0D)) * (double)client.field837[var10]);
            if(var10 == 0) {
               class14.field118 += var11;
            }

            if(var10 == 1) {
               class12.field96 += var11;
            }

            if(var10 == 2) {
               class13.field102 += var11;
            }

            if(var10 == 3) {
               class55.field507 = var11 + class55.field507 & 2047;
            }

            if(var10 == 4) {
               class146.field1935 += var11;
               if(class146.field1935 < 128) {
                  class146.field1935 = 128;
               }

               if(class146.field1935 > 383) {
                  class146.field1935 = 383;
               }
            }
         }
      }

      var10 = class48.field425;
      var11 = class48.field417;
      if(class48.field431 != 0) {
         var10 = class48.field432;
         var11 = class48.field437;
      }

      if(var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
         class24.method460(var10 - var0, var11 - var1);
      } else {
         class219.method4362();
      }

      class263.method4951();
      class314.method5835(var0, var1, var2, var3, 0);
      class263.method4951();
      int var12 = class122.field1711;
      class122.field1711 = client.field852;
      class56.field523.method2956(class14.field118, class12.field96, class13.field102, class146.field1935, class55.field507, var4);
      class122.field1711 = var12;
      class263.method4951();
      class56.field523.method2906();
      client.field828 = 0;
      boolean var13 = false;
      int var14 = -1;
      int var15 = -1;
      int var16 = class81.field1180;
      int[] var17 = class81.field1181;

      int var18;
      for(var18 = 0; var18 < var16 + client.field635; ++var18) {
         Object var19;
         if(var18 < var16) {
            var19 = client.field806[var17[var18]];
            if(var17[var18] == client.field719) {
               var13 = true;
               var14 = var18;
               continue;
            }

            if(var19 == class150.field1948) {
               var15 = var18;
               continue;
            }
         } else {
            var19 = client.field807[client.field636[var18 - var16]];
         }

         class230.method4569((class63)var19, var18, var0, var1, var2, var3);
      }

      if(client.field711 && var15 != -1) {
         class230.method4569(class150.field1948, var15, var0, var1, var2, var3);
      }

      if(var13) {
         class230.method4569(client.field806[client.field719], var14, var0, var1, var2, var3);
      }

      for(var18 = 0; var18 < client.field828; ++var18) {
         int var29 = client.field681[var18];
         int var20 = client.field682[var18];
         int var21 = client.field684[var18];
         int var22 = client.field683[var18];
         boolean var23 = true;

         while(var23) {
            var23 = false;

            for(int var24 = 0; var24 < var18; ++var24) {
               if(var20 + 2 > client.field682[var24] - client.field683[var24] && var20 - var22 < client.field682[var24] + 2 && var29 - var21 < client.field684[var24] + client.field681[var24] && var21 + var29 > client.field681[var24] - client.field684[var24] && client.field682[var24] - client.field683[var24] < var20) {
                  var20 = client.field682[var24] - client.field683[var24];
                  var23 = true;
               }
            }
         }

         client.field691 = client.field681[var18];
         client.field692 = client.field682[var18] = var20;
         String var30 = client.field732[var18];
         if(client.field754 == 0) {
            int var25 = 16776960;
            if(client.field811[var18] < 6) {
               var25 = client.field805[client.field811[var18]];
            }

            if(client.field811[var18] == 6) {
               var25 = client.field690 % 20 < 10?16711680:16776960;
            }

            if(client.field811[var18] == 7) {
               var25 = client.field690 % 20 < 10?255:'\uffff';
            }

            if(client.field811[var18] == 8) {
               var25 = client.field690 % 20 < 10?'\ub000':8454016;
            }

            int var26;
            if(client.field811[var18] == 9) {
               var26 = 150 - client.field687[var18];
               if(var26 < 50) {
                  var25 = var26 * 1280 + 16711680;
               } else if(var26 < 100) {
                  var25 = 16776960 - (var26 - 50) * 327680;
               } else if(var26 < 150) {
                  var25 = (var26 - 100) * 5 + '\uff00';
               }
            }

            if(client.field811[var18] == 10) {
               var26 = 150 - client.field687[var18];
               if(var26 < 50) {
                  var25 = var26 * 5 + 16711680;
               } else if(var26 < 100) {
                  var25 = 16711935 - (var26 - 50) * 327680;
               } else if(var26 < 150) {
                  var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
               }
            }

            if(client.field811[var18] == 11) {
               var26 = 150 - client.field687[var18];
               if(var26 < 50) {
                  var25 = 16777215 - var26 * 327685;
               } else if(var26 < 100) {
                  var25 = (var26 - 50) * 327685 + '\uff00';
               } else if(var26 < 150) {
                  var25 = 16777215 - (var26 - 100) * 327680;
               }
            }

            if(client.field686[var18] == 0) {
               class55.field499.method5567(var30, var0 + client.field691, client.field692 + var1, var25, 0);
            }

            if(client.field686[var18] == 1) {
               class55.field499.method5546(var30, var0 + client.field691, client.field692 + var1, var25, 0, client.field690);
            }

            if(client.field686[var18] == 2) {
               class55.field499.method5547(var30, var0 + client.field691, client.field692 + var1, var25, 0, client.field690);
            }

            if(client.field686[var18] == 3) {
               class55.field499.method5548(var30, var0 + client.field691, client.field692 + var1, var25, 0, client.field690, 150 - client.field687[var18]);
            }

            if(client.field686[var18] == 4) {
               var26 = (150 - client.field687[var18]) * (class55.field499.method5536(var30) + 100) / 150;
               class314.method5830(var0 + client.field691 - 50, var1, var0 + client.field691 + 50, var3 + var1);
               class55.field499.method5541(var30, var0 + client.field691 + 50 - var26, client.field692 + var1, var25, 0);
               class314.method5763(var0, var1, var0 + var2, var3 + var1);
            }

            if(client.field686[var18] == 5) {
               var26 = 150 - client.field687[var18];
               int var27 = 0;
               if(var26 < 25) {
                  var27 = var26 - 25;
               } else if(var26 > 125) {
                  var27 = var26 - 125;
               }

               class314.method5830(var0, client.field692 + var1 - class55.field499.field3713 - 1, var0 + var2, client.field692 + var1 + 5);
               class55.field499.method5567(var30, var0 + client.field691, var27 + client.field692 + var1, var25, 0);
               class314.method5763(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class55.field499.method5567(var30, var0 + client.field691, client.field692 + var1, 16776960, 0);
         }
      }

      class65.method1647(var0, var1);
      ((class111)class122.field1712).method2590(client.field654);
      if(client.field664) {
         if(client.field696 == 1) {
            class110.field1460[client.field843 / 100].method5891(client.field743 - 8, client.field839 - 8);
         }

         if(client.field696 == 2) {
            class110.field1460[client.field843 / 100 + 4].method5891(client.field743 - 8, client.field839 - 8);
         }
      }

      client.field706 = 0;
      int var31 = (class150.field1948.field900 >> 7) + class178.field2315;
      var14 = (class150.field1948.field918 >> 7) + class71.field1051;
      if(var31 >= 3053 && var31 <= 3156 && var14 >= 3056 && var14 <= 3136) {
         client.field706 = 1;
      }

      if(var31 >= 3072 && var31 <= 3118 && var14 >= 9492 && var14 <= 9535) {
         client.field706 = 1;
      }

      if(client.field706 == 1 && var31 >= 3139 && var31 <= 3199 && var14 >= 3008 && var14 <= 3062) {
         client.field706 = 0;
      }

      class14.field118 = var28;
      class12.field96 = var6;
      class13.field102 = var7;
      class146.field1935 = var8;
      class55.field507 = var9;
      if(client.field603 && class110.method2580(true, false) == 0) {
         client.field603 = false;
      }

      if(client.field603) {
         class314.method5835(var0, var1, var2, var3, 0);
         class16.method187("Loading - please wait.", false);
      }

   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(Lhl;IIB)V",
      garbageValue = "-80"
   )
   static final void method685(class230 var0, int var1, int var2) {
      if(client.field763 == null && !client.field846) {
         if(var0 != null && class162.method3387(var0) != null) {
            client.field763 = var0;
            client.field639 = class162.method3387(var0);
            client.field685 = var1;
            client.field766 = var2;
            class133.field1860 = 0;
            client.field774 = false;
            int var3 = client.field657 - 1;
            if(var3 != -1) {
               class184.field2376 = new class75();
               class184.field2376.field1082 = client.field730[var3];
               class184.field2376.field1077 = client.field737[var3];
               class184.field2376.field1083 = client.field702[var3];
               class184.field2376.field1080 = client.field619[var3];
               class184.field2376.field1081 = client.field734[var3];
            }

         }
      }
   }
}
