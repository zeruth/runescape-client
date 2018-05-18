import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class53 extends class204 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class202 field478 = new class202(32);
   @ObfuscatedName("fo")
   static int[] field484;
   @ObfuscatedName("gl")
   @ObfuscatedGetter(
      intValue = -277523073
   )
   static int field481;
   @ObfuscatedName("m")
   int[] field482 = new int[]{-1};
   @ObfuscatedName("q")
   int[] field480 = new int[]{0};


   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-2110619792"
   )
   static final void method1072(boolean var0) {
      class263.method4951();
      ++client.field739.field1252;
      if(client.field739.field1252 >= 50 || var0) {
         client.field739.field1252 = 0;
         if(!client.field641 && client.field739.method2045() != null) {
            class172 var1 = class133.method3115(class169.field2217, client.field739.field1250);
            client.field739.method2019(var1);

            try {
               client.field739.method2034();
            } catch (IOException var3) {
               client.field641 = true;
            }
         }

      }
   }
}
