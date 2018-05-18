import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public final class class80 extends class127 {

   @ObfuscatedName("h")
   static boolean[] field1173;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 577260357
   )
   int field1174;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 70858691
   )
   int field1172;


   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Ldk;",
      garbageValue = "111"
   )
   protected final class119 vmethod3078() {
      return class120.method2784(this.field1174).method5104(this.field1172);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I[BLff;I)V",
      garbageValue = "494698684"
   )
   static void method1906(int var0, byte[] var1, class162 var2) {
      class245 var3 = new class245();
      var3.field3163 = 0;
      var3.field2449 = (long)var0;
      var3.field3165 = var1;
      var3.field3164 = var2;
      class205 var4 = class248.field3196;
      synchronized(class248.field3196) {
         class248.field3196.method4126(var3);
      }

      class158.method3313();
   }
}
