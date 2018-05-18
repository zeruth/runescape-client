import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
public class class102 {

   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1984609843
   )
   int field1378;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1903277839
   )
   int field1372;
   @ObfuscatedName("n")
   int[][] field1376;


   public class102(int var1, int var2) {
      if(var2 != var1) {
         int var3 = class56.method1084(var1, var2);
         var1 /= var3;
         var2 /= var3;
         this.field1378 = var1;
         this.field1372 = var2;
         this.field1376 = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.field1376[var4];
            double var6 = 6.0D + (double)var4 / (double)var1;
            int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
            if(var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(7.0D + var6);
            if(var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = 3.141592653589793D * ((double)var8 - var6);
               double var14 = var10;
               if(var12 < -1.0E-4D || var12 > 1.0E-4D) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
               var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
            }
         }

      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "25"
   )
   byte[] method2308(byte[] var1) {
      if(this.field1376 != null) {
         int var2 = (int)((long)var1.length * (long)this.field1372 / (long)this.field1378) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.field1376[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var4 + var9] += var7 * var8[var9];
            }

            var5 += this.field1372;
            var9 = var5 / this.field1378;
            var4 += var9;
            var5 -= var9 * this.field1378;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + '\u8000' >> 16;
            if(var10 < -128) {
               var1[var6] = -128;
            } else if(var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "704464912"
   )
   int method2309(int var1) {
      if(this.field1376 != null) {
         var1 = (int)((long)this.field1372 * (long)var1 / (long)this.field1378);
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "559329434"
   )
   int method2306(int var1) {
      if(this.field1376 != null) {
         var1 = (int)((long)this.field1372 * (long)var1 / (long)this.field1378) + 6;
      }

      return var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1582271092"
   )
   static void method2307(String var0, String var1, String var2) {
      class78.field1124 = var0;
      class78.field1125 = var1;
      class78.field1139 = var2;
   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1066685626"
   )
   static void method2310(int var0) {
      if(var0 != client.field611) {
         if(client.field611 == 0) {
            class37.field321.method866();
         }

         if(var0 == 20 || var0 == 40 || var0 == 45) {
            client.field838 = 0;
            client.field645 = 0;
            client.field630 = 0;
            client.field840.method5257(var0);
            if(var0 != 20) {
               class39.method761(false);
            }
         }

         if(var0 != 20 && var0 != 40 && class121.field1697 != null) {
            class121.field1697.vmethod3368();
            class121.field1697 = null;
         }

         if(client.field611 == 25) {
            client.field649 = 0;
            client.field792 = 0;
            client.field697 = 1;
            client.field647 = 0;
            client.field648 = 1;
         }

         if(var0 != 5 && var0 != 10) {
            if(var0 == 20) {
               class72.method1841(class22.field196, class59.field553, true, client.field611 == 11?4:0);
            } else if(var0 == 11) {
               class72.method1841(class22.field196, class59.field553, false, 4);
            } else if(class78.field1122) {
               class78.field1105 = null;
               class78.field1113 = null;
               class192.field2416 = null;
               class78.field1107 = null;
               class24.field224 = null;
               class78.field1108 = null;
               class55.field502 = null;
               class78.field1109 = null;
               class78.field1110 = null;
               class51.field469 = null;
               class13.field104 = null;
               class189.field2398 = null;
               class9.field61 = null;
               class132.field1844 = null;
               class0.field4 = null;
               class81.field1178 = null;
               class85.field1228 = null;
               class45.field376 = null;
               class8.field51 = null;
               class83.field1206 = null;
               class297.field3701 = null;
               class274.field3569 = null;
               class190.method3911(2);
               class14.method139(true);
               class78.field1122 = false;
            }
         } else {
            class72.method1841(class22.field196, class59.field553, true, 0);
         }

         client.field611 = var0;
      }
   }
}
