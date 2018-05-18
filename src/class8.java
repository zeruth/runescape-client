import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class8 {

   @ObfuscatedName("rc")
   @ObfuscatedSignature(
      signature = "Lir;"
   )
   public static class251 field53;
   @ObfuscatedName("at")
   static int[] field51;
   @ObfuscatedName("ce")
   static boolean field57;
   @ObfuscatedName("fh")
   static byte[][] field58;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)[Lfr;",
      garbageValue = "-2014391752"
   )
   public static class171[] method90() {
      return new class171[]{class171.field2274, class171.field2267, class171.field2269, class171.field2270, class171.field2271, class171.field2276, class171.field2273, class171.field2268, class171.field2275, class171.field2272};
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)Ljq;",
      garbageValue = "43"
   )
   public static class267 method92(int var0) {
      class267 var1 = (class267)class267.field3367.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class267.field3386.method4626(32, var0);
         var1 = new class267();
         if(var2 != null) {
            var1.method5010(new class182(var2));
         }

         class267.field3367.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-44"
   )
   static int method91(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      return class320.field3816 != null && var2 == class320.field3816.field2449?class232.field2771.field2359 * 99 / (class232.field2771.field2365.length - class320.field3816.field3169) + 1:0;
   }

   @ObfuscatedName("l")
   public static int method93(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }
}
