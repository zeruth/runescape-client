import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class210 implements Iterator {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   class197 field2460;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2461;
   @ObfuscatedName("q")
   int field2463;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2462 = null;


   @ObfuscatedSignature(
      signature = "(Lgx;)V"
   )
   class210(class197 var1) {
      this.field2460 = var1;
      this.method4159();
   }

   @ObfuscatedName("l")
   void method4159() {
      this.field2461 = this.field2460.field2423[0].field2447;
      this.field2463 = 1;
      this.field2462 = null;
   }

   public boolean hasNext() {
      if(this.field2460.field2423[this.field2463 - 1] != this.field2461) {
         return true;
      } else {
         while(this.field2463 < this.field2460.field2426) {
            if(this.field2460.field2423[this.field2463++].field2447 != this.field2460.field2423[this.field2463 - 1]) {
               this.field2461 = this.field2460.field2423[this.field2463 - 1].field2447;
               return true;
            }

            this.field2461 = this.field2460.field2423[this.field2463 - 1];
         }

         return false;
      }
   }

   public Object next() {
      class204 var1;
      if(this.field2460.field2423[this.field2463 - 1] != this.field2461) {
         var1 = this.field2461;
         this.field2461 = var1.field2447;
         this.field2462 = var1;
         return var1;
      } else {
         do {
            if(this.field2463 >= this.field2460.field2426) {
               return null;
            }

            var1 = this.field2460.field2423[this.field2463++].field2447;
         } while(var1 == this.field2460.field2423[this.field2463 - 1]);

         this.field2461 = var1.field2447;
         this.field2462 = var1;
         return var1;
      }
   }

   public void remove() {
      this.field2462.method4098();
      this.field2462 = null;
   }
}
