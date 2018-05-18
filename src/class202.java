import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public final class class202 {

   @ObfuscatedName("w")
   int field2442;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Lgl;"
   )
   class204[] field2441;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2444;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2440;
   @ObfuscatedName("f")
   int field2443 = 0;


   public class202(int var1) {
      this.field2442 = var1;
      this.field2441 = new class204[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class204 var3 = this.field2441[var2] = new class204();
         var3.field2447 = var3;
         var3.field2448 = var3;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(J)Lgl;"
   )
   public class204 method4064(long var1) {
      class204 var3 = this.field2441[(int)(var1 & (long)(this.field2442 - 1))];

      for(this.field2444 = var3.field2447; var3 != this.field2444; this.field2444 = this.field2444.field2447) {
         if(this.field2444.field2449 == var1) {
            class204 var4 = this.field2444;
            this.field2444 = this.field2444.field2447;
            return var4;
         }
      }

      this.field2444 = null;
      return null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgl;J)V"
   )
   public void method4063(class204 var1, long var2) {
      if(var1.field2448 != null) {
         var1.method4098();
      }

      class204 var4 = this.field2441[(int)(var2 & (long)(this.field2442 - 1))];
      var1.field2448 = var4.field2448;
      var1.field2447 = var4;
      var1.field2448.field2447 = var1;
      var1.field2447.field2448 = var1;
      var1.field2449 = var2;
   }

   @ObfuscatedName("q")
   void method4054() {
      int var1 = 0;

      while(var1 < this.field2442) {
         class204 var2 = this.field2441[var1];

         while(true) {
            class204 var3 = var2.field2447;
            if(var3 == var2) {
               ++var1;
               break;
            }

            var3.method4098();
         }
      }

      this.field2444 = null;
      this.field2440 = null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4055() {
      this.field2443 = 0;
      return this.method4056();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "()Lgl;"
   )
   public class204 method4056() {
      class204 var1;
      if(this.field2443 > 0 && this.field2441[this.field2443 - 1] != this.field2440) {
         var1 = this.field2440;
         this.field2440 = var1.field2447;
         return var1;
      } else {
         do {
            if(this.field2443 >= this.field2442) {
               return null;
            }

            var1 = this.field2441[this.field2443++].field2447;
         } while(var1 == this.field2441[this.field2443 - 1]);

         this.field2440 = var1.field2447;
         return var1;
      }
   }
}
