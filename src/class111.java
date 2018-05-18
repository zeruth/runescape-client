import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class111 implements class131 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lds;"
   )
   class116[] field1462;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   class205 field1463 = new class205();
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1229449465
   )
   int field1469;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1775803035
   )
   int field1465 = 0;
   @ObfuscatedName("f")
   double field1466 = 1.0D;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -303532825
   )
   int field1467 = 128;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   class247 field1464;


   @ObfuscatedSignature(
      signature = "(Liv;Liv;IDI)V"
   )
   public class111(class247 var1, class247 var2, int var3, double var4, int var6) {
      this.field1464 = var2;
      this.field1469 = var3;
      this.field1465 = this.field1469;
      this.field1466 = var4;
      this.field1467 = var6;
      int[] var7 = var1.method4648(0);
      int var8 = var7.length;
      this.field1462 = new class116[var1.method4638(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         class182 var10 = new class182(var1.method4626(0, var7[var9]));
         this.field1462[var7[var9]] = new class116(var10);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1352255203"
   )
   public int method2616() {
      int var1 = 0;
      int var2 = 0;
      class116[] var3 = this.field1462;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class116 var5 = var3[var4];
         if(var5 != null && var5.field1569 != null) {
            var1 += var5.field1569.length;
            int[] var6 = var5.field1569;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if(this.field1464.method4629(var8)) {
                  ++var2;
               }
            }
         }
      }

      if(var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   @ObfuscatedName("m")
   public void method2584(double var1) {
      this.field1466 = var1;
      this.method2589();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-509217315"
   )
   public int[] vmethod3098(int var1) {
      class116 var2 = this.field1462[var1];
      if(var2 != null) {
         if(var2.field1570 != null) {
            this.field1463.method4107(var2);
            var2.field1562 = true;
            return var2.field1570;
         }

         boolean var3 = var2.method2706(this.field1466, this.field1467, this.field1464);
         if(var3) {
            if(this.field1465 == 0) {
               class116 var4 = (class116)this.field1463.method4110();
               var4.method2707();
            } else {
               --this.field1465;
            }

            this.field1463.method4107(var2);
            var2.field1562 = true;
            return var2.field1570;
         }
      }

      return null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "76"
   )
   public int vmethod3107(int var1) {
      return this.field1462[var1] != null?this.field1462[var1].field1563:0;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "28"
   )
   public boolean vmethod3099(int var1) {
      return this.field1462[var1].field1559;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "245038345"
   )
   public boolean vmethod3100(int var1) {
      return this.field1467 == 64;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "11"
   )
   public void method2589() {
      for(int var1 = 0; var1 < this.field1462.length; ++var1) {
         if(this.field1462[var1] != null) {
            this.field1462[var1].method2707();
         }
      }

      this.field1463 = new class205();
      this.field1465 = this.field1469;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1593090917"
   )
   public void method2590(int var1) {
      for(int var2 = 0; var2 < this.field1462.length; ++var2) {
         class116 var3 = this.field1462[var2];
         if(var3 != null && var3.field1568 != 0 && var3.field1562) {
            var3.method2705(var1);
            var3.field1562 = false;
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "1490775105"
   )
   static synchronized byte[] method2614(int var0) {
      return class183.method3813(var0, false);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "-1550048479"
   )
   public static int method2615(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class294.method5519(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IIIZIZI)V",
      garbageValue = "451378026"
   )
   static void method2598(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if(var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         class65 var8 = class143.field1914[var6];
         class143.field1914[var6] = class143.field1914[var1];
         class143.field1914[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            if(class6.method71(class143.field1914[var9], var8, var2, var3, var4, var5) <= 0) {
               class65 var10 = class143.field1914[var9];
               class143.field1914[var9] = class143.field1914[var7];
               class143.field1914[var7++] = var10;
            }
         }

         class143.field1914[var1] = class143.field1914[var7];
         class143.field1914[var7] = var8;
         method2598(var0, var7 - 1, var2, var3, var4, var5);
         method2598(var7 + 1, var1, var2, var3, var4, var5);
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "-1195743275"
   )
   public static String method2592(CharSequence var0) {
      return class178.method3535('*', var0.length());
   }
}
