import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class254 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3254;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1616582855
   )
   public static int field3251;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static class200 field3252 = new class200(64);
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1332449801
   )
   public int field3253 = 0;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-263761941"
   )
   public void method4821(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4823(var1, var2);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;IS)V",
      garbageValue = "128"
   )
   void method4823(class182 var1, int var2) {
      if(var2 == 5) {
         this.field3253 = var1.method3574();
      }

   }
}
