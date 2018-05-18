import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class205 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   public class204 field2451 = new class204();
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2450;


   public class205() {
      this.field2451.field2447 = this.field2451;
      this.field2451.field2448 = this.field2451;
   }

   @ObfuscatedName("w")
   public void method4105() {
      while(true) {
         class204 var1 = this.field2451.field2447;
         if(var1 == this.field2451) {
            this.field2450 = null;
            return;
         }

         var1.method4098();
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgl;)V"
   )
   public void method4126(class204 var1) {
      if(var1.field2448 != null) {
         var1.method4098();
      }

      var1.field2448 = this.field2451.field2448;
      var1.field2447 = this.field2451;
      var1.field2448.field2447 = var1;
      var1.field2447.field2448 = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgl;)V"
   )
   public void method4107(class204 var1) {
      if(var1.field2448 != null) {
         var1.method4098();
      }

      var1.field2448 = this.field2451;
      var1.field2447 = this.field2451.field2447;
      var1.field2448.field2447 = var1;
      var1.field2447.field2448 = var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4109() {
      class204 var1 = this.field2451.field2447;
      if(var1 == this.field2451) {
         return null;
      } else {
         var1.method4098();
         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4110() {
      class204 var1 = this.field2451.field2448;
      if(var1 == this.field2451) {
         return null;
      } else {
         var1.method4098();
         return var1;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4113() {
      class204 var1 = this.field2451.field2447;
      if(var1 == this.field2451) {
         this.field2450 = null;
         return null;
      } else {
         this.field2450 = var1.field2447;
         return var1;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4112() {
      class204 var1 = this.field2451.field2448;
      if(var1 == this.field2451) {
         this.field2450 = null;
         return null;
      } else {
         this.field2450 = var1.field2448;
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4104() {
      class204 var1 = this.field2450;
      if(var1 == this.field2451) {
         this.field2450 = null;
         return null;
      } else {
         this.field2450 = var1.field2447;
         return var1;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4114() {
      class204 var1 = this.field2450;
      if(var1 == this.field2451) {
         this.field2450 = null;
         return null;
      } else {
         this.field2450 = var1.field2448;
         return var1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgl;Lgl;)V"
   )
   public static void method4132(class204 var0, class204 var1) {
      if(var0.field2448 != null) {
         var0.method4098();
      }

      var0.field2448 = var1.field2448;
      var0.field2447 = var1;
      var0.field2448.field2447 = var0;
      var0.field2447.field2448 = var0;
   }
}
