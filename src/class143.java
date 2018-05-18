import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class143 extends class283 {

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Lbb;"
   )
   static class65[] field1914;
   @ObfuscatedName("w")
   final boolean field1913;


   public class143(boolean var1) {
      this.field1913 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkd;Lkd;I)I",
      garbageValue = "-737922169"
   )
   int method3187(class287 var1, class287 var2) {
      return var2.field3648 != var1.field3648?(this.field1913?var1.field3648 - var2.field3648:var2.field3648 - var1.field3648):this.method5320(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3187((class287)var1, (class287)var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BI)Lcs;",
      garbageValue = "311466444"
   )
   static class84 method3186(byte[] var0) {
      class84 var1 = new class84();
      class182 var2 = new class182(var0);
      var2.field2359 = var2.field2365.length - 2;
      int var3 = var2.method3574();
      int var4 = var2.field2365.length - 2 - var3 - 12;
      var2.field2359 = var4;
      int var5 = var2.method3573();
      var1.field1213 = var2.method3574();
      var1.field1210 = var2.method3574();
      var1.field1215 = var2.method3574();
      var1.field1209 = var2.method3574();
      int var6 = var2.method3742();
      int var7;
      int var8;
      if(var6 > 0) {
         var1.field1217 = var1.method1989(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.method3574();
            class197 var9 = new class197(var8 > 0?class81.method1922(var8):1);
            var1.field1217[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.method3573();
               int var11 = var2.method3573();
               var9.method3992(new class211(var11), (long)var10);
            }
         }
      }

      var2.field2359 = 0;
      var2.method3576();
      var1.field1211 = new int[var5];
      var1.field1216 = new int[var5];
      var1.field1212 = new String[var5];

      for(var7 = 0; var2.field2359 < var4; var1.field1211[var7++] = var8) {
         var8 = var2.method3574();
         if(var8 == 3) {
            var1.field1212[var7] = var2.method3577();
         } else if(var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.field1216[var7] = var2.method3573();
         } else {
            var1.field1216[var7] = var2.method3742();
         }
      }

      return var1;
   }
}
