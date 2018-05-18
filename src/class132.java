import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public final class class132 {

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "Llh;"
   )
   static class317 field1844;
   @ObfuscatedName("cj")
   public static char field1846;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 617260111
   )
   int field1838;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 242440289
   )
   int field1840;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -906482335
   )
   int field1828;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -822062233
   )
   int field1829;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -754905395
   )
   int field1830;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1606352773
   )
   int field1845;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 85911845
   )
   int field1832;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -451208931
   )
   int field1826;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 574942283
   )
   int field1834;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -111629493
   )
   int field1835;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1649709051
   )
   int field1836;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -691877509
   )
   int field1837;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1691264071
   )
   int field1827;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1885408739
   )
   int field1839;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 364478629
   )
   int field1831;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 2008346895
   )
   int field1841;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1385685981
   )
   int field1842;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1299910263
   )
   int field1843;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(S)[Lix;",
      garbageValue = "27340"
   )
   public static class244[] method3112() {
      return new class244[]{class244.field3153, class244.field3155, class244.field3159, class244.field3156, class244.field3154, class244.field3158};
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "862300710"
   )
   static void method3110() {
      if(class78.field1127 == null || class78.field1127.length() <= 0) {
         if(class51.field468.field980 != null) {
            class78.field1127 = class51.field468.field980;
            class78.field1129 = true;
         } else {
            class78.field1129 = false;
         }

      }
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "1977010069"
   )
   static final void method3113(int var0, int var1, int var2, int var3, boolean var4) {
      if(var2 < 1) {
         var2 = 1;
      }

      if(var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      if(var5 < 0) {
         var5 = 0;
      } else if(var5 > 100) {
         var5 = 100;
      }

      int var6 = (client.field841 - client.field745) * var5 / 100 + client.field745;
      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var15;
      if(var7 < client.field707) {
         var15 = client.field707;
         var6 = var15 * var2 * 334 / (var3 * 512);
         if(var6 > client.field863) {
            var6 = client.field863;
            var8 = var3 * var6 * 512 / (var15 * 334);
            var9 = (var2 - var8) / 2;
            if(var4) {
               class314.method5762();
               class314.method5835(var0, var1, var9, var3, -16777216);
               class314.method5835(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if(var7 > client.field847) {
         var15 = client.field847;
         var6 = var15 * var2 * 334 / (var3 * 512);
         if(var6 < client.field844) {
            var6 = client.field844;
            var8 = var15 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if(var4) {
               class314.method5762();
               class314.method5835(var0, var1, var2, var9, -16777216);
               class314.method5835(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      var8 = (client.field615 - client.field842) * var5 / 100 + client.field842;
      client.field852 = var3 * var6 * var8 / 85504 << 1;
      if(var2 != client.field834 || var3 != client.field661) {
         int[] var14 = new int[9];

         for(int var10 = 0; var10 < 9; ++var10) {
            int var11 = var10 * 32 + 15 + 128;
            int var12 = var11 * 3 + 600;
            int var13 = class122.field1702[var11];
            var14[var10] = var13 * var12 >> 16;
         }

         class125.method2936(var14, 500, 800, var2, var3);
      }

      client.field848 = var0;
      client.field849 = var1;
      client.field834 = var2;
      client.field661 = var3;
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "188281095"
   )
   static final void method3111(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 2048 - var3 & 2047;
      int var7 = 2048 - var4 & 2047;
      int var8 = 0;
      int var9 = 0;
      int var10 = var5;
      int var11;
      int var12;
      int var13;
      if(var6 != 0) {
         var11 = class122.field1702[var6];
         var12 = class122.field1708[var6];
         var13 = var12 * var9 - var11 * var5 >> 16;
         var10 = var11 * var9 + var5 * var12 >> 16;
         var9 = var13;
      }

      if(var7 != 0) {
         var11 = class122.field1702[var7];
         var12 = class122.field1708[var7];
         var13 = var11 * var10 + var12 * var8 >> 16;
         var10 = var10 * var12 - var8 * var11 >> 16;
         var8 = var13;
      }

      class14.field118 = var0 - var8;
      class12.field96 = var1 - var9;
      class13.field102 = var2 - var10;
      class146.field1935 = var3;
      class55.field507 = var4;
      if(client.field678 == 1 && client.field729 >= 2 && client.field679 % 50 == 0 && (class154.field1979 >> 7 != class150.field1948.field900 >> 7 || class53.field481 >> 7 != class150.field1948.field918 >> 7)) {
         var11 = class150.field1948.field581;
         var12 = (class154.field1979 >> 7) + class178.field2315;
         var13 = (class53.field481 >> 7) + class71.field1051;
         class145.method3194(var12, var13, var11, true);
      }

   }
}
