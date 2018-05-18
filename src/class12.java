import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class12 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ls;"
   )
   public static final class12 field93 = new class12("SMALL", 1, 0, 4);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Ls;"
   )
   public static final class12 field87 = new class12("MEDIUM", 2, 1, 2);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ls;"
   )
   public static final class12 field89 = new class12("LARGE", 0, 2, 0);
   @ObfuscatedName("l")
   static int[] field97;
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   static class153 field94;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = -23097341
   )
   static int field91;
   @ObfuscatedName("gk")
   @ObfuscatedGetter(
      intValue = -1690305633
   )
   static int field96;
   @ObfuscatedName("b")
   final String field90;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -46781563
   )
   final int field88;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 355855233
   )
   final int field92;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1178525389
   )
   final int field98;


   class12(String var1, int var2, int var3, int var4) {
      this.field90 = var1;
      this.field88 = var2;
      this.field92 = var3;
      this.field98 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(FI)Z",
      garbageValue = "843081340"
   )
   boolean method121(float var1) {
      return var1 >= (float)this.field98;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "85"
   )
   static int method122(int var0, int var1) {
      class272 var2 = class148.method3204(var0);
      if(var2 == null) {
         return var1;
      } else if(var2.field3540 >= 0) {
         return var2.field3540 | -16777216;
      } else if(var2.field3542 >= 0) {
         int var3 = class7.method87(class122.field1712.vmethod3107(var2.field3542), 96);
         return class122.field1721[var3] | -16777216;
      } else if(var2.field3538 == 16711935) {
         return var1;
      } else {
         int var4 = var2.field3546;
         int var5 = var2.field3543;
         int var6 = var2.field3544;
         if(var6 > 179) {
            var5 /= 2;
         }

         if(var6 > 192) {
            var5 /= 2;
         }

         if(var6 > 217) {
            var5 /= 2;
         }

         if(var6 > 243) {
            var5 /= 2;
         }

         int var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
         int var8 = class7.method87(var7, 96);
         return class122.field1721[var8] | -16777216;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;B)V",
      garbageValue = "-116"
   )
   public static void method124(class247 var0) {
      class311.field3753 = var0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Ls;",
      garbageValue = "-1696635948"
   )
   static class12 method117(int var0) {
      class12[] var1 = new class12[]{field87, field89, field93};
      class12[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class12 var4 = var2[var3];
         if(var0 == var4.field92) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "1717836676"
   )
   public static int method123(String var0) {
      return var0.length() + 1;
   }
}
