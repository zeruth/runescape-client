import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class309 implements Comparator {

   @ObfuscatedName("w")
   final boolean field3747;


   public class309(boolean var1) {
      this.field3747 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljn;Ljn;I)I",
      garbageValue = "1482542953"
   )
   int method5717(class282 var1, class282 var2) {
      return this.field3747?var1.method5299().method5464(var2.method5299()):var2.method5299().method5464(var1.method5299());
   }

   public int compare(Object var1, Object var2) {
      return this.method5717((class282)var1, (class282)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Lec;",
      garbageValue = "-2034638643"
   )
   static class130 method5722(int var0) {
      class130 var1 = (class130)class273.field3558.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         var1 = class123.method2899(class273.field3549, class273.field3550, var0, false);
         if(var1 != null) {
            class273.field3558.method4028(var1, (long)var0);
         }

         return var1;
      }
   }
}
