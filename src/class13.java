import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class13 {

   @ObfuscatedName("pa")
   @ObfuscatedGetter(
      intValue = -186313731
   )
   static int field99;
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "[Llh;"
   )
   static class317[] field104;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = -865738607
   )
   static int field101;
   @ObfuscatedName("ge")
   @ObfuscatedGetter(
      intValue = 2008638169
   )
   static int field102;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1880010131
   )
   int field103;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lhh;"
   )
   class226 field100;


   @ObfuscatedSignature(
      signature = "(ILhh;)V"
   )
   class13(int var1, class226 var2) {
      this.field103 = var1;
      this.field100 = var2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lge;IB)V",
      garbageValue = "32"
   )
   static final void method125(class189 var0, int var1) {
      int var2 = var0.field2359;
      class81.field1176 = 0;
      class245.method4619(var0);
      class295.method5521(var0);
      if(var0.field2359 - var2 != var1) {
         throw new RuntimeException(var0.field2359 - var2 + " " + var1);
      }
   }
}
