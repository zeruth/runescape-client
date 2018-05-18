import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class142 extends class283 {

   @ObfuscatedName("ky")
   @ObfuscatedGetter(
      intValue = 946956583
   )
   static int field1911;
   @ObfuscatedName("w")
   final boolean field1909;


   public class142(boolean var1) {
      this.field1909 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkd;Lkd;I)I",
      garbageValue = "1971585662"
   )
   int method3181(class287 var1, class287 var2) {
      if(var1.field3648 != 0) {
         if(var2.field3648 == 0) {
            return this.field1909?-1:1;
         }
      } else if(var2.field3648 != 0) {
         return this.field1909?1:-1;
      }

      return this.method5320(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3181((class287)var1, (class287)var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)[Llh;",
      garbageValue = "18"
   )
   static class317[] method3182() {
      class317[] var0 = new class317[class319.field3809];

      for(int var1 = 0; var1 < class319.field3809; ++var1) {
         class317 var2 = var0[var1] = new class317();
         var2.field3790 = class319.field3805;
         var2.field3791 = class275.field3574;
         var2.field3784 = class319.field3808[var1];
         var2.field3789 = class319.field3807[var1];
         var2.field3786 = class192.field2413[var1];
         var2.field3787 = class319.field3804[var1];
         var2.field3788 = class319.field3806;
         var2.field3785 = class294.field3678[var1];
      }

      class319.field3808 = null;
      class319.field3807 = null;
      class192.field2413 = null;
      class319.field3804 = null;
      class319.field3806 = null;
      class294.field3678 = null;
      return var0;
   }
}
