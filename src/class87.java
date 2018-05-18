import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class87 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lft;"
   )
   class157 field1243;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   class203 field1241 = new class203();
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 327763393
   )
   int field1242 = 0;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   class182 field1244 = new class182(5000);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgh;"
   )
   public class190 field1250;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lge;"
   )
   class189 field1254 = new class189('\u9c40');
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lfk;"
   )
   class168 field1246 = null;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -937288539
   )
   int field1247 = 0;
   @ObfuscatedName("j")
   boolean field1248 = true;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1639779673
   )
   int field1249 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 443275095
   )
   int field1252 = 0;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lfk;"
   )
   class168 field1251;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfk;"
   )
   class168 field1245;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lfk;"
   )
   class168 field1253;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-40"
   )
   final void method2020() {
      this.field1241.method4080();
      this.field1242 = 0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method2034() throws IOException {
      if(this.field1243 != null && this.field1242 > 0) {
         this.field1244.field2359 = 0;

         while(true) {
            class172 var1 = (class172)this.field1241.method4072();
            if(var1 == null || var1.field2280 > this.field1244.field2365.length - this.field1244.field2359) {
               this.field1243.vmethod3385(this.field1244.field2365, 0, this.field1244.field2359);
               this.field1252 = 0;
               break;
            }

            this.field1244.method3628(var1.field2279.field2365, 0, var1.field2280);
            this.field1242 -= var1.field2280;
            var1.method4098();
            var1.field2279.method3551();
            var1.method3479();
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lfe;I)V",
      garbageValue = "-1030123495"
   )
   public final void method2019(class172 var1) {
      this.field1241.method4069(var1);
      var1.field2280 = var1.field2279.field2359;
      var1.field2279.field2359 = 0;
      this.field1242 += var1.field2280;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lft;I)V",
      garbageValue = "-512597648"
   )
   void method2022(class157 var1) {
      this.field1243 = var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-892206329"
   )
   void method2023() {
      if(this.field1243 != null) {
         this.field1243.vmethod3368();
         this.field1243 = null;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "52"
   )
   void method2024() {
      this.field1243 = null;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)Lft;",
      garbageValue = "-67"
   )
   class157 method2045() {
      return this.field1243;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-1694030093"
   )
   static int method2047(int var0, class84 var1, boolean var2) {
      int var3 = -1;
      class230 var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class69.field1026[--class45.field377];
         var4 = class61.method1188(var3);
      } else {
         var4 = var2?class184.field2379:class67.field996;
      }

      if(var0 == 1000) {
         class45.field377 -= 4;
         var4.field2632 = class69.field1026[class45.field377];
         var4.field2653 = class69.field1026[class45.field377 + 1];
         var4.field2628 = class69.field1026[class45.field377 + 2];
         var4.field2629 = class69.field1026[class45.field377 + 3];
         class181.method3548(var4);
         class37.field321.method1211(var4);
         if(var3 != -1 && var4.field2625 == 0) {
            class45.method818(class230.field2615[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1001) {
         class45.field377 -= 4;
         var4.field2634 = class69.field1026[class45.field377];
         var4.field2635 = class69.field1026[class45.field377 + 1];
         var4.field2667 = class69.field1026[class45.field377 + 2];
         var4.field2631 = class69.field1026[class45.field377 + 3];
         class181.method3548(var4);
         class37.field321.method1211(var4);
         if(var3 != -1 && var4.field2625 == 0) {
            class45.method818(class230.field2615[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1003) {
         boolean var5 = class69.field1026[--class45.field377] == 1;
         if(var5 != var4.field2643) {
            var4.field2643 = var5;
            class181.method3548(var4);
         }

         return 1;
      } else if(var0 == 1005) {
         var4.field2731 = class69.field1026[--class45.field377] == 1;
         return 1;
      } else if(var0 == 1006) {
         var4.field2663 = class69.field1026[--class45.field377] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "571124311"
   )
   static final void method2030() {
      int var0;
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      if(client.field678 == 0) {
         var0 = class150.field1948.field900;
         var1 = class150.field1948.field918;
         if(class154.field1979 - var0 < -500 || class154.field1979 - var0 > 500 || class53.field481 - var1 < -500 || class53.field481 - var1 > 500) {
            class154.field1979 = var0;
            class53.field481 = var1;
         }

         if(var0 != class154.field1979) {
            class154.field1979 += (var0 - class154.field1979) / 16;
         }

         if(var1 != class53.field481) {
            class53.field481 += (var1 - class53.field481) / 16;
         }

         var2 = class154.field1979 >> 7;
         var3 = class53.field481 >> 7;
         var4 = class264.method4955(class154.field1979, class53.field481, class192.field2415);
         var5 = 0;
         int var6;
         if(var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for(var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
               for(int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
                  int var8 = class192.field2415;
                  if(var8 < 3 && (class50.field445[1][var6][var7] & 2) == 2) {
                     ++var8;
                  }

                  int var9 = var4 - class50.field447[var8][var6][var7];
                  if(var9 > var5) {
                     var5 = var9;
                  }
               }
            }
         }

         var6 = var5 * 192;
         if(var6 > 98048) {
            var6 = 98048;
         }

         if(var6 < '\u8000') {
            var6 = '\u8000';
         }

         if(var6 > client.field723) {
            client.field723 += (var6 - client.field723) / 24;
         } else if(var6 < client.field723) {
            client.field723 += (var6 - client.field723) / 80;
         }

         client.field857 = class264.method4955(class150.field1948.field900, class150.field1948.field918, class192.field2415) - client.field668;
      } else if(client.field678 == 1) {
         class51.method1061();
         short var10 = -1;
         if(class39.field340[33]) {
            var10 = 0;
         } else if(class39.field340[49]) {
            var10 = 1024;
         }

         if(class39.field340[48]) {
            if(var10 == 0) {
               var10 = 1792;
            } else if(var10 == 1024) {
               var10 = 1280;
            } else {
               var10 = 1536;
            }
         } else if(class39.field340[50]) {
            if(var10 == 0) {
               var10 = 256;
            } else if(var10 == 1024) {
               var10 = 768;
            } else {
               var10 = 512;
            }
         }

         byte var11 = 0;
         if(class39.field340[35]) {
            var11 = -1;
         } else if(class39.field340[51]) {
            var11 = 1;
         }

         var2 = 0;
         if(var10 >= 0 || var11 != 0) {
            var2 = class39.field340[81]?client.field673:client.field672;
            var2 *= 16;
            client.field804 = var10;
            client.field671 = var11;
         }

         if(client.field602 < var2) {
            client.field602 += var2 / 8;
            if(client.field602 > var2) {
               client.field602 = var2;
            }
         } else if(client.field602 > var2) {
            client.field602 = client.field602 * 9 / 10;
         }

         if(client.field602 > 0) {
            var3 = client.field602 / 16;
            if(client.field804 >= 0) {
               var0 = client.field804 - class55.field507 & 2047;
               var4 = class122.field1702[var0];
               var5 = class122.field1708[var0];
               class154.field1979 += var4 * var3 / 65536;
               class53.field481 += var3 * var5 / 65536;
            }

            if(client.field671 != 0) {
               client.field857 += var3 * client.field671;
               if(client.field857 > 0) {
                  client.field857 = 0;
               }
            }
         } else {
            client.field804 = -1;
            client.field671 = -1;
         }

         if(class39.field340[13]) {
            client.field739.method2019(class133.method3115(class169.field2183, client.field739.field1250));
            client.field678 = 0;
         }
      }

      if(class48.field424 == 4 && class8.field57) {
         var0 = class48.field417 - client.field627;
         client.field767 = var0 * 2;
         client.field627 = var0 != -1 && var0 != 1?(class48.field417 + client.field627) / 2:class48.field417;
         var1 = client.field717 - class48.field425;
         client.field663 = var1 * 2;
         client.field717 = var1 != -1 && var1 != 1?(class48.field425 + client.field717) / 2:class48.field425;
      } else {
         if(class39.field340[96]) {
            client.field663 += (-24 - client.field663) / 2;
         } else if(class39.field340[97]) {
            client.field663 += (24 - client.field663) / 2;
         } else {
            client.field663 /= 2;
         }

         if(class39.field340[98]) {
            client.field767 += (12 - client.field767) / 2;
         } else if(class39.field340[99]) {
            client.field767 += (-12 - client.field767) / 2;
         } else {
            client.field767 /= 2;
         }

         client.field627 = class48.field417;
         client.field717 = class48.field425;
      }

      client.field662 = client.field663 / 2 + client.field662 & 2047;
      client.field632 += client.field767 / 2;
      if(client.field632 < 128) {
         client.field632 = 128;
      }

      if(client.field632 > 383) {
         client.field632 = 383;
      }

   }
}
