import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class226 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 327374529
   )
   public int field2587;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -510649741
   )
   public int field2581;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 104556867
   )
   public int field2583;


   @ObfuscatedSignature(
      signature = "(Lhh;)V"
   )
   public class226(class226 var1) {
      this.field2587 = var1.field2587;
      this.field2581 = var1.field2581;
      this.field2583 = var1.field2583;
   }

   public class226(int var1, int var2, int var3) {
      this.field2587 = var1;
      this.field2581 = var2;
      this.field2583 = var3;
   }

   public class226() {
      this.field2587 = -1;
   }

   public class226(int var1) {
      if(var1 == -1) {
         this.field2587 = -1;
      } else {
         this.field2587 = var1 >> 28 & 3;
         this.field2581 = var1 >> 14 & 16383;
         this.field2583 = var1 & 16383;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "62"
   )
   public void method4466(int var1, int var2, int var3) {
      this.field2587 = var1;
      this.field2581 = var2;
      this.field2583 = var3;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "92"
   )
   public int method4467() {
      return this.field2587 << 28 | this.field2581 << 14 | this.field2583;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lhh;I)Z",
      garbageValue = "-1581452973"
   )
   boolean method4468(class226 var1) {
      return this.field2587 != var1.field2587?false:(this.field2581 != var1.field2581?false:this.field2583 == var1.field2583);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "-37"
   )
   String method4470(String var1) {
      return this.field2587 + var1 + (this.field2581 >> 6) + var1 + (this.field2583 >> 6) + var1 + (this.field2581 & 63) + var1 + (this.field2583 & 63);
   }

   public boolean equals(Object var1) {
      return this == var1?true:(!(var1 instanceof class226)?false:this.method4468((class226)var1));
   }

   public int hashCode() {
      return this.method4467();
   }

   public String toString() {
      return this.method4470(",");
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "741148208"
   )
   public static boolean method4482(int var0) {
      return (var0 >> 28 & 1) != 0;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)[Llc;",
      garbageValue = "2024020127"
   )
   static class318[] method4483() {
      class318[] var0 = new class318[class319.field3809];

      for(int var1 = 0; var1 < class319.field3809; ++var1) {
         class318 var2 = var0[var1] = new class318();
         var2.field3796 = class319.field3805;
         var2.field3792 = class275.field3574;
         var2.field3795 = class319.field3808[var1];
         var2.field3793 = class319.field3807[var1];
         var2.field3794 = class192.field2413[var1];
         var2.field3801 = class319.field3804[var1];
         int var3 = var2.field3794 * var2.field3801;
         byte[] var4 = class294.field3678[var1];
         var2.field3798 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var2.field3798[var5] = class319.field3806[var4[var5] & 255];
         }
      }

      class319.field3808 = null;
      class319.field3807 = null;
      class192.field2413 = null;
      class319.field3804 = null;
      class319.field3806 = null;
      class294.field3678 = null;
      return var0;
   }
}
