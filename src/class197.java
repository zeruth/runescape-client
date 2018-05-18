import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public final class class197 implements Iterable {

   @ObfuscatedName("w")
   int field2426;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Lgl;"
   )
   class204[] field2423;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2425;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2422;
   @ObfuscatedName("f")
   int field2424 = 0;


   public class197(int var1) {
      this.field2426 = var1;
      this.field2423 = new class204[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class204 var3 = this.field2423[var2] = new class204();
         var3.field2447 = var3;
         var3.field2448 = var3;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(J)Lgl;"
   )
   public class204 method3991(long var1) {
      class204 var3 = this.field2423[(int)(var1 & (long)(this.field2426 - 1))];

      for(this.field2425 = var3.field2447; var3 != this.field2425; this.field2425 = this.field2425.field2447) {
         if(this.field2425.field2449 == var1) {
            class204 var4 = this.field2425;
            this.field2425 = this.field2425.field2447;
            return var4;
         }
      }

      this.field2425 = null;
      return null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgl;J)V"
   )
   public void method3992(class204 var1, long var2) {
      if(var1.field2448 != null) {
         var1.method4098();
      }

      class204 var4 = this.field2423[(int)(var2 & (long)(this.field2426 - 1))];
      var1.field2448 = var4.field2448;
      var1.field2447 = var4;
      var1.field2448.field2447 = var1;
      var1.field2447.field2448 = var1;
      var1.field2449 = var2;
   }

   @ObfuscatedName("q")
   public void method4005() {
      int var1 = 0;

      while(var1 < this.field2426) {
         class204 var2 = this.field2423[var1];

         while(true) {
            class204 var3 = var2.field2447;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.method4098();
         }
      }

      this.field2425 = null;
      this.field2422 = null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method3996() {
      this.field2424 = 0;
      return this.method3995();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method3995() {
      class204 var1;
      if(this.field2424 > 0 && this.field2423[this.field2424 - 1] != this.field2422) {
         var1 = this.field2422;
         this.field2422 = var1.field2447;
         return var1;
      } else {
         do {
            if(this.field2424 >= this.field2426) {
               return null;
            }

            var1 = this.field2423[this.field2424++].field2447;
         } while(var1 == this.field2423[this.field2424 - 1]);

         this.field2422 = var1.field2447;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class210(this);
   }
}
