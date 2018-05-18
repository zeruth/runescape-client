import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class25 {

   @ObfuscatedName("mt")
   @ObfuscatedSignature(
      signature = "[Lhl;"
   )
   static class230[] field226;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lo;"
   )
   static final class25 field227 = new class25(0);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lo;"
   )
   static final class25 field233 = new class25(1);
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -256235113
   )
   static int field231;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -944658495
   )
   final int field228;


   class25(int var1) {
      this.field228 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)[Lfq;",
      garbageValue = "-1170126190"
   )
   static class170[] method466() {
      return new class170[]{class170.field2259, class170.field2260, class170.field2261, class170.field2258};
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "2065007798"
   )
   static int method464(int var0, class84 var1, boolean var2) {
      class230 var3 = var2?class184.field2379:class67.field996;
      if(var0 == 1700) {
         class69.field1026[++class45.field377 - 1] = var3.field2754;
         return 1;
      } else if(var0 == 1701) {
         if(var3.field2754 != -1) {
            class69.field1026[++class45.field377 - 1] = var3.field2677;
         } else {
            class69.field1026[++class45.field377 - 1] = 0;
         }

         return 1;
      } else if(var0 == 1702) {
         class69.field1026[++class45.field377 - 1] = var3.field2633;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-2"
   )
   static final void method465(int var0) {
      if(class42.method785(var0)) {
         class230[] var1 = class230.field2615[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            class230 var3 = var1[var2];
            if(var3 != null) {
               var3.field2746 = 0;
               var3.field2718 = 0;
            }
         }

      }
   }
}
