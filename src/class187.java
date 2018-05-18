import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class187 {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-125"
   )
   public static void method3844(int var0, int var1) {
      class263 var3 = (class263)class263.field3338.method4023((long)var0);
      class263 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var8 = class263.field3337.method4626(14, var0);
         var3 = new class263();
         if(var8 != null) {
            var3.method4945(new class182(var8));
         }

         class263.field3338.method4028(var3, (long)var0);
         var2 = var3;
      }

      int var4 = var2.field3342;
      int var5 = var2.field3339;
      int var6 = var2.field3341;
      int var7 = class225.field2579[var6 - var5];
      if(var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      class225.field2578[var4] = class225.field2578[var4] & ~var7 | var1 << var5 & var7;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgy;IB)V",
      garbageValue = "33"
   )
   public static void method3855(class182 var0, int var1) {
      if(class155.field1988 != null) {
         try {
            class155.field1988.method2521(0L);
            class155.field1988.method2526(var0.field2365, var1, 24);
         } catch (Exception var3) {
            ;
         }
      }

   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-120"
   )
   static final int method3860() {
      if(class51.field468.field981) {
         return class192.field2415;
      } else {
         int var0 = class264.method4955(class14.field118, class13.field102, class192.field2415);
         return var0 - class12.field96 < 800 && (class50.field445[class192.field2415][class14.field118 >> 7][class13.field102 >> 7] & 4) != 0?class192.field2415:3;
      }
   }
}
