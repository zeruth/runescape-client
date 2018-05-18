import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public final class class200 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   class206 field2432 = new class206();
   @ObfuscatedName("m")
   int field2431;
   @ObfuscatedName("q")
   int field2433;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   class202 field2434;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgm;"
   )
   class194 field2435 = new class194();


   public class200(int var1) {
      this.field2431 = var1;
      this.field2433 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.field2434 = new class202(var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(J)Lgc;"
   )
   public class206 method4023(long var1) {
      class206 var3 = (class206)this.field2434.method4064(var1);
      if(var3 != null) {
         this.field2435.method3981(var3);
      }

      return var3;
   }

   @ObfuscatedName("m")
   public void method4022(long var1) {
      class206 var3 = (class206)this.field2434.method4064(var1);
      if(var3 != null) {
         var3.method4098();
         var3.method4135();
         ++this.field2433;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgc;J)V"
   )
   public void method4028(class206 var1, long var2) {
      if(this.field2433 == 0) {
         class206 var4 = this.field2435.method3968();
         var4.method4098();
         var4.method4135();
         if(var4 == this.field2432) {
            var4 = this.field2435.method3968();
            var4.method4098();
            var4.method4135();
         }
      } else {
         --this.field2433;
      }

      this.field2434.method4063(var1, var2);
      this.field2435.method3981(var1);
   }

   @ObfuscatedName("x")
   public void method4024() {
      this.field2435.method3973();
      this.field2434.method4054();
      this.field2432 = new class206();
      this.field2433 = this.field2431;
   }
}
