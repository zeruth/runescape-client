import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class199 implements Iterator {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   class203 field2429;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2428;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2430 = null;


   @ObfuscatedSignature(
      signature = "(Lgt;)V"
   )
   class199(class203 var1) {
      this.field2429 = var1;
      this.field2428 = this.field2429.field2446.field2447;
      this.field2430 = null;
   }

   public void remove() {
      if(this.field2430 == null) {
         throw new IllegalStateException();
      } else {
         this.field2430.method4098();
         this.field2430 = null;
      }
   }

   public Object next() {
      class204 var1 = this.field2428;
      if(var1 == this.field2429.field2446) {
         var1 = null;
         this.field2428 = null;
      } else {
         this.field2428 = var1.field2447;
      }

      this.field2430 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2429.field2446 != this.field2428;
   }
}
