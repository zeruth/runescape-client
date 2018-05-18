import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public abstract class class127 extends class206 {

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   static class318 field1804;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -2095268899
   )
   public int field1805 = 1000;


   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Ldk;",
      garbageValue = "111"
   )
   protected class119 vmethod3078() {
      return null;
   }

   @ObfuscatedName("cy")
   void vmethod3079(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      class119 var11 = this.vmethod3078();
      if(var11 != null) {
         this.field1805 = var11.field1805;
         var11.vmethod3079(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "2089291146"
   )
   public static int method3074(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if(var7 == 8364) {
               var3[var6 + var4] = -128;
            } else if(var7 == 8218) {
               var3[var6 + var4] = -126;
            } else if(var7 == 402) {
               var3[var6 + var4] = -125;
            } else if(var7 == 8222) {
               var3[var6 + var4] = -124;
            } else if(var7 == 8230) {
               var3[var6 + var4] = -123;
            } else if(var7 == 8224) {
               var3[var6 + var4] = -122;
            } else if(var7 == 8225) {
               var3[var6 + var4] = -121;
            } else if(var7 == 710) {
               var3[var6 + var4] = -120;
            } else if(var7 == 8240) {
               var3[var6 + var4] = -119;
            } else if(var7 == 352) {
               var3[var6 + var4] = -118;
            } else if(var7 == 8249) {
               var3[var6 + var4] = -117;
            } else if(var7 == 338) {
               var3[var6 + var4] = -116;
            } else if(var7 == 381) {
               var3[var6 + var4] = -114;
            } else if(var7 == 8216) {
               var3[var6 + var4] = -111;
            } else if(var7 == 8217) {
               var3[var6 + var4] = -110;
            } else if(var7 == 8220) {
               var3[var6 + var4] = -109;
            } else if(var7 == 8221) {
               var3[var6 + var4] = -108;
            } else if(var7 == 8226) {
               var3[var6 + var4] = -107;
            } else if(var7 == 8211) {
               var3[var6 + var4] = -106;
            } else if(var7 == 8212) {
               var3[var6 + var4] = -105;
            } else if(var7 == 732) {
               var3[var6 + var4] = -104;
            } else if(var7 == 8482) {
               var3[var6 + var4] = -103;
            } else if(var7 == 353) {
               var3[var6 + var4] = -102;
            } else if(var7 == 8250) {
               var3[var6 + var4] = -101;
            } else if(var7 == 339) {
               var3[var6 + var4] = -100;
            } else if(var7 == 382) {
               var3[var6 + var4] = -98;
            } else if(var7 == 376) {
               var3[var6 + var4] = -97;
            } else {
               var3[var6 + var4] = 63;
            }
         } else {
            var3[var6 + var4] = (byte)var7;
         }
      }

      return var5;
   }
}
