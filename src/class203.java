import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class203 implements Iterable {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2446 = new class204();
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2445;


   public class203() {
      this.field2446.field2447 = this.field2446;
      this.field2446.field2448 = this.field2446;
   }

   @ObfuscatedName("w")
   public void method4080() {
      while(this.field2446.field2447 != this.field2446) {
         this.field2446.field2447.method4098();
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgl;)V"
   )
   public void method4069(class204 var1) {
      if(var1.field2448 != null) {
         var1.method4098();
      }

      var1.field2448 = this.field2446.field2448;
      var1.field2447 = this.field2446;
      var1.field2448.field2447 = var1;
      var1.field2447.field2448 = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgl;)V"
   )
   public void method4070(class204 var1) {
      if(var1.field2448 != null) {
         var1.method4098();
      }

      var1.field2448 = this.field2446;
      var1.field2447 = this.field2446.field2447;
      var1.field2448.field2447 = var1;
      var1.field2447.field2448 = var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4072() {
      return this.method4078((class204)null);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgl;)Lgl;"
   )
   class204 method4078(class204 var1) {
      class204 var2;
      if(var1 == null) {
         var2 = this.field2446.field2447;
      } else {
         var2 = var1;
      }

      if(var2 == this.field2446) {
         this.field2445 = null;
         return null;
      } else {
         this.field2445 = var2.field2447;
         return var2;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4074() {
      class204 var1 = this.field2445;
      if(var1 == this.field2446) {
         this.field2445 = null;
         return null;
      } else {
         this.field2445 = var1.field2447;
         return var1;
      }
   }

   @ObfuscatedName("d")
   public boolean method4075() {
      return this.field2446.field2447 == this.field2446;
   }

   public Iterator iterator() {
      return new class199(this);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgl;Lgl;)V"
   )
   public static void method4089(class204 var0, class204 var1) {
      if(var0.field2448 != null) {
         var0.method4098();
      }

      var0.field2448 = var1;
      var0.field2447 = var1.field2447;
      var0.field2448.field2447 = var0;
      var0.field2447.field2448 = var0;
   }
}
