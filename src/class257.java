import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class257 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3283;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static class200 field3285 = new class200(64);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "Lbk;"
   )
   static class57 field3282;
   @ObfuscatedName("q")
   public boolean field3284 = false;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "597972575"
   )
   public void method4856(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4857(var1, var2);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-693004220"
   )
   void method4857(class182 var1, int var2) {
      if(var2 == 2) {
         this.field3284 = true;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;I)V",
      garbageValue = "1026887111"
   )
   public static void method4860(class247 var0) {
      class231.field2759 = var0;
   }
}
