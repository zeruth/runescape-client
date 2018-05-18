import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public final class class194 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   class206 field2419 = new class206();


   public class194() {
      this.field2419.field2453 = this.field2419;
      this.field2419.field2452 = this.field2419;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgc;)V"
   )
   public void method3981(class206 var1) {
      if(var1.field2452 != null) {
         var1.method4135();
      }

      var1.field2452 = this.field2419.field2452;
      var1.field2453 = this.field2419;
      var1.field2452.field2453 = var1;
      var1.field2453.field2452 = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgc;)V"
   )
   public void method3965(class206 var1) {
      if(var1.field2452 != null) {
         var1.method4135();
      }

      var1.field2452 = this.field2419;
      var1.field2453 = this.field2419.field2453;
      var1.field2452.field2453 = var1;
      var1.field2453.field2452 = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "()Lgc;"
   )
   class206 method3968() {
      class206 var1 = this.field2419.field2453;
      if(var1 == this.field2419) {
         return null;
      } else {
         var1.method4135();
         return var1;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "()Lgc;"
   )
   public class206 method3969() {
      class206 var1 = this.field2419.field2453;
      return var1 == this.field2419?null:var1;
   }

   @ObfuscatedName("a")
   void method3973() {
      while(true) {
         class206 var1 = this.field2419.field2453;
         if(var1 == this.field2419) {
            return;
         }

         var1.method4135();
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgc;Lgc;)V"
   )
   static void method3966(class206 var0, class206 var1) {
      if(var0.field2452 != null) {
         var0.method4135();
      }

      var0.field2452 = var1;
      var0.field2453 = var1.field2453;
      var0.field2452.field2453 = var0;
      var0.field2453.field2452 = var0;
   }
}
