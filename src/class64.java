import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public class class64 extends class204 {

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Llh;"
   )
   static class317 field944;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -840135193
   )
   int field945;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2000565355
   )
   int field948;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2113659133
   )
   int field946;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1324315633
   )
   int field947;


   class64(int var1, int var2, int var3, int var4) {
      this.field945 = var1;
      this.field948 = var2;
      this.field946 = var3;
      this.field947 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-789024602"
   )
   void method1599(int var1, int var2, int var3, int var4) {
      this.field945 = var1;
      this.field948 = var2;
      this.field946 = var3;
      this.field947 = var4;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1790686135"
   )
   static final void method1601(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if(var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               class50.field449[0][var5][var4] = 127;
               if(var0 == var5 && var5 > 0) {
                  class50.field447[0][var5][var4] = class50.field447[0][var5 - 1][var4];
               }

               if(var0 + var2 == var5 && var5 < 103) {
                  class50.field447[0][var5][var4] = class50.field447[0][var5 + 1][var4];
               }

               if(var4 == var1 && var4 > 0) {
                  class50.field447[0][var5][var4] = class50.field447[0][var5][var4 - 1];
               }

               if(var4 == var3 + var1 && var4 < 103) {
                  class50.field447[0][var5][var4] = class50.field447[0][var5][var4 + 1];
               }
            }
         }
      }

   }
}
