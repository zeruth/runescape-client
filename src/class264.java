import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class264 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field3346;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static class200 field3345 = new class200(64);
   @ObfuscatedName("q")
   char field3344;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1903486205
   )
   public int field3348;
   @ObfuscatedName("f")
   public String field3347;
   @ObfuscatedName("n")
   boolean field3349 = true;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "75"
   )
   void method4954() {}

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-235335289"
   )
   void method4959(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4957(var1, var2);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lgy;IB)V",
      garbageValue = "-5"
   )
   void method4957(class182 var1, int var2) {
      if(var2 == 1) {
         this.field3344 = class52.method1068(var1.method3569());
      } else if(var2 == 2) {
         this.field3348 = var1.method3573();
      } else if(var2 == 4) {
         this.field3349 = false;
      } else if(var2 == 5) {
         this.field3347 = var1.method3577();
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-69"
   )
   public boolean method4956() {
      return this.field3344 == 115;
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "66"
   )
   static final int method4955(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if(var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if(var2 < 3 && (class50.field445[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = (128 - var6) * class50.field447[var5][var3][var4] + var6 * class50.field447[var5][var3 + 1][var4] >> 7;
         int var9 = class50.field447[var5][var3][var4 + 1] * (128 - var6) + var6 * class50.field447[var5][var3 + 1][var4 + 1] >> 7;
         return var9 * var7 + var8 * (128 - var7) >> 7;
      } else {
         return 0;
      }
   }
}
