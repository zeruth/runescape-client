import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kr")
public final class class298 extends class299 {

   public class298(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class298(byte[] var1) {
      super(var1);
   }

   @ObfuscatedName("w")
   final void vmethod5636(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var3 * class314.field3770 + var2;
      int var8 = class314.field3770 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < class314.field3769) {
         var11 = class314.field3769 - var3;
         var5 -= var11;
         var3 = class314.field3769;
         var10 += var11 * var4;
         var7 += var11 * class314.field3770;
      }

      if(var3 + var5 > class314.field3768) {
         var5 -= var3 + var5 - class314.field3768;
      }

      if(var2 < class314.field3771) {
         var11 = class314.field3771 - var2;
         var4 -= var11;
         var2 = class314.field3771;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var2 + var4 > class314.field3767) {
         var11 = var2 + var4 - class314.field3767;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         class299.method5556(class314.field3772, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedName("m")
   final void vmethod5555(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 * class314.field3770 + var2;
      int var9 = class314.field3770 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(var3 < class314.field3769) {
         var12 = class314.field3769 - var3;
         var5 -= var12;
         var3 = class314.field3769;
         var11 += var12 * var4;
         var8 += var12 * class314.field3770;
      }

      if(var3 + var5 > class314.field3768) {
         var5 -= var3 + var5 - class314.field3768;
      }

      if(var2 < class314.field3771) {
         var12 = class314.field3771 - var2;
         var4 -= var12;
         var2 = class314.field3771;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if(var2 + var4 > class314.field3767) {
         var12 = var2 + var4 - class314.field3767;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(var4 > 0 && var5 > 0) {
         class299.method5638(class314.field3772, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
