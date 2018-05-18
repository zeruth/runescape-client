import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public class class91 {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Ldg;"
   )
   class107[] field1265 = new class107[10];
   @ObfuscatedName("q")
   int field1267;
   @ObfuscatedName("b")
   int field1268;


   @ObfuscatedSignature(
      signature = "(Lgy;)V"
   )
   class91(class182 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method3742();
         if(var3 != 0) {
            --var1.field2359;
            this.field1265[var2] = new class107();
            this.field1265[var2].method2513(var1);
         }
      }

      this.field1267 = var1.method3574();
      this.field1268 = var1.method3574();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "()Lcg;"
   )
   public class93 method2110() {
      byte[] var1 = this.method2118();
      return new class93(22050, var1, this.field1267 * 22050 / 1000, this.field1268 * 22050 / 1000);
   }

   @ObfuscatedName("q")
   public final int method2113() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field1265[var2] != null && this.field1265[var2].field1430 / 20 < var1) {
            var1 = this.field1265[var2].field1430 / 20;
         }
      }

      if(this.field1267 < this.field1268 && this.field1267 / 20 < var1) {
         var1 = this.field1267 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.field1265[var2] != null) {
               this.field1265[var2].field1430 -= var1 * 20;
            }
         }

         if(this.field1267 < this.field1268) {
            this.field1267 -= var1 * 20;
            this.field1268 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedName("x")
   final byte[] method2118() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.field1265[var2] != null && this.field1265[var2].field1424 + this.field1265[var2].field1430 > var1) {
            var1 = this.field1265[var2].field1424 + this.field1265[var2].field1430;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.field1265[var4] != null) {
               int var5 = this.field1265[var4].field1424 * 22050 / 1000;
               int var6 = this.field1265[var4].field1430 * 22050 / 1000;
               int[] var7 = this.field1265[var4].method2510(var5, this.field1265[var4].field1424);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = (var7[var8] >> 8) + var3[var8 + var6];
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;II)Lcm;"
   )
   public static class91 method2114(class247 var0, int var1, int var2) {
      byte[] var3 = var0.method4626(var1, var2);
      return var3 == null?null:new class91(new class182(var3));
   }
}
