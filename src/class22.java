import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class22 {

   @ObfuscatedName("du")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field196;
   @ObfuscatedName("w")
   String field195;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1203180175
   )
   int field192;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -270775529
   )
   int field193;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Ls;"
   )
   class12 field197;


   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IILs;)V"
   )
   class22(String var1, int var2, int var3, class12 var4) {
      this.field195 = var1;
      this.field192 = var2;
      this.field193 = var3;
      this.field197 = var4;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1078611233"
   )
   static void method307(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if(class65.field958[var5] != var0) {
            var2[var4] = class65.field958[var5];
            var3[var4] = class65.field969[var5];
            ++var4;
         }
      }

      class65.field958 = var2;
      class65.field969 = var3;
      class136.method3137(class143.field1914, 0, class143.field1914.length - 1, class65.field958, class65.field969);
   }
}
