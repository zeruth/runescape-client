import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class214 implements Iterator {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lhq;"
   )
   class215 field2468;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   class206 field2467;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   class206 field2469 = null;


   @ObfuscatedSignature(
      signature = "(Lhq;)V"
   )
   class214(class215 var1) {
      this.field2468 = var1;
      this.field2467 = this.field2468.field2471.field2453;
      this.field2469 = null;
   }

   public Object next() {
      class206 var1 = this.field2467;
      if(var1 == this.field2468.field2471) {
         var1 = null;
         this.field2467 = null;
      } else {
         this.field2467 = var1.field2453;
      }

      this.field2469 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2468.field2471 != this.field2467;
   }

   public void remove() {
      if(this.field2469 == null) {
         throw new IllegalStateException();
      } else {
         this.field2469.method4135();
         this.field2469 = null;
      }
   }
}
