import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class86 {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Lbn;"
   )
   class58[] field1238 = new class58[100];
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1420819617
   )
   int field1236;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbn;",
      garbageValue = "-458883414"
   )
   class58 method2010(int var1, String var2, String var3, String var4) {
      class58 var5 = this.field1238[99];

      for(int var6 = this.field1236; var6 > 0; --var6) {
         if(var6 != 100) {
            this.field1238[var6] = this.field1238[var6 - 1];
         }
      }

      if(var5 == null) {
         var5 = new class58(var1, var2, var4, var3);
      } else {
         var5.method4098();
         var5.method4135();
         var5.method1106(var1, var2, var4, var3);
      }

      this.field1238[0] = var5;
      if(this.field1236 < 100) {
         ++this.field1236;
      }

      return var5;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)Lbn;",
      garbageValue = "-44"
   )
   class58 method2013(int var1) {
      return var1 >= 0 && var1 < this.field1236?this.field1238[var1]:null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1556967243"
   )
   int method2011() {
      return this.field1236;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Liv;IIB)Llc;",
      garbageValue = "-114"
   )
   public static class318 method2017(class247 var0, int var1, int var2) {
      if(!class306.method5702(var0, var1, var2)) {
         return null;
      } else {
         class318 var4 = new class318();
         var4.field3796 = class319.field3805;
         var4.field3792 = class275.field3574;
         var4.field3795 = class319.field3808[0];
         var4.field3793 = class319.field3807[0];
         var4.field3794 = class192.field2413[0];
         var4.field3801 = class319.field3804[0];
         int var5 = var4.field3801 * var4.field3794;
         byte[] var6 = class294.field3678[0];
         var4.field3798 = new int[var5];

         for(int var7 = 0; var7 < var5; ++var7) {
            var4.field3798[var7] = class319.field3806[var6[var7] & 255];
         }

         class319.field3808 = null;
         class319.field3807 = null;
         class192.field2413 = null;
         class319.field3804 = null;
         class319.field3806 = null;
         class294.field3678 = null;
         return var4;
      }
   }

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   static final void method2018() {
      if(client.field688 > 0) {
         class82.method1959();
      } else {
         client.field840.method5256();
         class102.method2310(40);
         class121.field1697 = client.field739.method2045();
         client.field739.method2024();
      }
   }
}
