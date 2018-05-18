import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lh")
public final class class317 extends class314 {

   @ObfuscatedName("w")
   public byte[] field3785;
   @ObfuscatedName("m")
   public int[] field3788;
   @ObfuscatedName("q")
   public int field3786;
   @ObfuscatedName("b")
   public int field3787;
   @ObfuscatedName("f")
   public int field3784;
   @ObfuscatedName("n")
   public int field3789;
   @ObfuscatedName("h")
   public int field3790;
   @ObfuscatedName("x")
   public int field3791;


   @ObfuscatedName("w")
   public void method5862() {
      if(this.field3786 != this.field3790 || this.field3787 != this.field3791) {
         byte[] var1 = new byte[this.field3790 * this.field3791];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field3787; ++var3) {
            for(int var4 = 0; var4 < this.field3786; ++var4) {
               var1[var4 + (var3 + this.field3789) * this.field3790 + this.field3784] = this.field3785[var2++];
            }
         }

         this.field3785 = var1;
         this.field3786 = this.field3790;
         this.field3787 = this.field3791;
         this.field3784 = 0;
         this.field3789 = 0;
      }
   }

   @ObfuscatedName("m")
   public void method5864(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field3788.length; ++var4) {
         int var5 = this.field3788[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field3788[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field3788[var4] & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.field3788[var4] = var7 + (var6 << 8) + (var5 << 16);
      }

   }

   @ObfuscatedName("q")
   public void method5873(int var1, int var2) {
      var1 += this.field3784;
      var2 += this.field3789;
      int var3 = var1 + var2 * class314.field3770;
      int var4 = 0;
      int var5 = this.field3787;
      int var6 = this.field3786;
      int var7 = class314.field3770 - var6;
      int var8 = 0;
      int var9;
      if(var2 < class314.field3769) {
         var9 = class314.field3769 - var2;
         var5 -= var9;
         var2 = class314.field3769;
         var4 += var9 * var6;
         var3 += var9 * class314.field3770;
      }

      if(var5 + var2 > class314.field3768) {
         var5 -= var5 + var2 - class314.field3768;
      }

      if(var1 < class314.field3771) {
         var9 = class314.field3771 - var1;
         var6 -= var9;
         var1 = class314.field3771;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 + var1 > class314.field3767) {
         var9 = var6 + var1 - class314.field3767;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method5866(class314.field3772, this.field3785, this.field3788, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("j")
   public void method5867(int var1, int var2, int var3, int var4) {
      int var5 = this.field3786;
      int var6 = this.field3787;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field3790;
      int var10 = this.field3791;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if(this.field3784 > 0) {
         var13 = (var11 + (this.field3784 << 16) - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field3784 << 16);
      }

      if(this.field3789 > 0) {
         var13 = (var12 + (this.field3789 << 16) - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field3789 << 16);
      }

      if(var5 < var9) {
         var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
      }

      if(var6 < var10) {
         var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
      }

      var13 = var1 + var2 * class314.field3770;
      int var14 = class314.field3770 - var3;
      if(var2 + var4 > class314.field3768) {
         var4 -= var2 + var4 - class314.field3768;
      }

      int var15;
      if(var2 < class314.field3769) {
         var15 = class314.field3769 - var2;
         var4 -= var15;
         var13 += var15 * class314.field3770;
         var8 += var12 * var15;
      }

      if(var3 + var1 > class314.field3767) {
         var15 = var3 + var1 - class314.field3767;
         var3 -= var15;
         var14 += var15;
      }

      if(var1 < class314.field3771) {
         var15 = class314.field3771 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method5874(class314.field3772, this.field3785, this.field3788, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   @ObfuscatedName("x")
   static void method5866(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("a")
   static void method5874(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if(var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }
}
