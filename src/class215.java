import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class215 implements Iterable {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   public class206 field2471 = new class206();
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   class206 field2470;


   public class215() {
      this.field2471.field2453 = this.field2471;
      this.field2471.field2452 = this.field2471;
   }

   @ObfuscatedName("w")
   public void method4191() {
      while(this.field2471.field2453 != this.field2471) {
         this.field2471.field2453.method4135();
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgc;)V"
   )
   public void method4183(class206 var1) {
      if(var1.field2452 != null) {
         var1.method4135();
      }

      var1.field2452 = this.field2471.field2452;
      var1.field2453 = this.field2471;
      var1.field2452.field2453 = var1;
      var1.field2453.field2452 = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Lgc;"
   )
   class206 method4184() {
      class206 var1 = this.field2471.field2453;
      if(var1 == this.field2471) {
         return null;
      } else {
         var1.method4135();
         return var1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "()Lgc;"
   )
   class206 method4185() {
      return this.method4186((class206)null);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lgc;)Lgc;"
   )
   class206 method4186(class206 var1) {
      class206 var2;
      if(var1 == null) {
         var2 = this.field2471.field2453;
      } else {
         var2 = var1;
      }

      if(var2 == this.field2471) {
         this.field2470 = null;
         return null;
      } else {
         this.field2470 = var2.field2453;
         return var2;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "()Lgc;"
   )
   class206 method4187() {
      class206 var1 = this.field2470;
      if(var1 == this.field2471) {
         this.field2470 = null;
         return null;
      } else {
         this.field2470 = var1.field2453;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class214(this);
   }
}
