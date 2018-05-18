import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public final class class318 extends class314 {

   @ObfuscatedName("w")
   public int[] field3798;
   @ObfuscatedName("m")
   public int field3794;
   @ObfuscatedName("q")
   public int field3801;
   @ObfuscatedName("b")
   public int field3795;
   @ObfuscatedName("f")
   int field3793;
   @ObfuscatedName("n")
   public int field3796;
   @ObfuscatedName("h")
   public int field3792;


   public class318(int[] var1, int var2, int var3) {
      this.field3798 = var1;
      this.field3794 = this.field3796 = var2;
      this.field3801 = this.field3792 = var3;
      this.field3793 = 0;
      this.field3795 = 0;
   }

   public class318(int var1, int var2) {
      this(new int[var2 * var1], var1, var2);
   }

   class318() {}

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "()Llc;"
   )
   public class318 method5956() {
      class318 var1 = new class318(this.field3794, this.field3801);
      var1.field3796 = this.field3796;
      var1.field3792 = this.field3792;
      var1.field3795 = this.field3796 - this.field3794 - this.field3795;
      var1.field3793 = this.field3793;

      for(int var2 = 0; var2 < this.field3801; ++var2) {
         for(int var3 = 0; var3 < this.field3794; ++var3) {
            var1.field3798[var3 + var2 * this.field3794] = this.field3798[var2 * this.field3794 + this.field3794 - 1 - var3];
         }
      }

      return var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "()Llc;"
   )
   public class318 method5885() {
      class318 var1 = new class318(this.field3796, this.field3792);

      for(int var2 = 0; var2 < this.field3801; ++var2) {
         for(int var3 = 0; var3 < this.field3794; ++var3) {
            var1.field3798[var3 + (var2 + this.field3793) * this.field3796 + this.field3795] = this.field3798[var3 + var2 * this.field3794];
         }
      }

      return var1;
   }

   @ObfuscatedName("q")
   public void method5886() {
      class314.method5761(this.field3798, this.field3794, this.field3801);
   }

   @ObfuscatedName("x")
   public void method5958() {
      if(this.field3794 != this.field3796 || this.field3801 != this.field3792) {
         int[] var1 = new int[this.field3796 * this.field3792];

         for(int var2 = 0; var2 < this.field3801; ++var2) {
            for(int var3 = 0; var3 < this.field3794; ++var3) {
               var1[var3 + (var2 + this.field3793) * this.field3796 + this.field3795] = this.field3798[var3 + var2 * this.field3794];
            }
         }

         this.field3798 = var1;
         this.field3794 = this.field3796;
         this.field3801 = this.field3792;
         this.field3795 = 0;
         this.field3793 = 0;
      }
   }

   @ObfuscatedName("j")
   public void method5888(int var1) {
      if(this.field3794 != this.field3796 || this.field3801 != this.field3792) {
         int var2 = var1;
         if(var1 > this.field3795) {
            var2 = this.field3795;
         }

         int var3 = var1;
         if(var1 + this.field3795 + this.field3794 > this.field3796) {
            var3 = this.field3796 - this.field3795 - this.field3794;
         }

         int var4 = var1;
         if(var1 > this.field3793) {
            var4 = this.field3793;
         }

         int var5 = var1;
         if(var1 + this.field3793 + this.field3801 > this.field3792) {
            var5 = this.field3792 - this.field3793 - this.field3801;
         }

         int var6 = var2 + var3 + this.field3794;
         int var7 = var4 + var5 + this.field3801;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field3801; ++var9) {
            for(int var10 = 0; var10 < this.field3794; ++var10) {
               var8[var6 * (var9 + var4) + var10 + var2] = this.field3798[var10 + var9 * this.field3794];
            }
         }

         this.field3798 = var8;
         this.field3794 = var6;
         this.field3801 = var7;
         this.field3795 -= var2;
         this.field3793 -= var4;
      }
   }

   @ObfuscatedName("a")
   public void method5889() {
      int[] var1 = new int[this.field3794 * this.field3801];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field3801; ++var3) {
         for(int var4 = this.field3794 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.field3798[var4 + var3 * this.field3794];
         }
      }

      this.field3798 = var1;
      this.field3795 = this.field3796 - this.field3794 - this.field3795;
   }

   @ObfuscatedName("l")
   public void method5890() {
      int[] var1 = new int[this.field3794 * this.field3801];
      int var2 = 0;

      for(int var3 = this.field3801 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.field3794; ++var4) {
            var1[var2++] = this.field3798[var4 + var3 * this.field3794];
         }
      }

      this.field3798 = var1;
      this.field3793 = this.field3792 - this.field3801 - this.field3793;
   }

   @ObfuscatedName("d")
   public void method5991(int var1) {
      int[] var2 = new int[this.field3794 * this.field3801];
      int var3 = 0;

      for(int var4 = 0; var4 < this.field3801; ++var4) {
         for(int var5 = 0; var5 < this.field3794; ++var5) {
            int var6 = this.field3798[var3];
            if(var6 == 0) {
               if(var5 > 0 && this.field3798[var3 - 1] != 0) {
                  var6 = var1;
               } else if(var4 > 0 && this.field3798[var3 - this.field3794] != 0) {
                  var6 = var1;
               } else if(var5 < this.field3794 - 1 && this.field3798[var3 + 1] != 0) {
                  var6 = var1;
               } else if(var4 < this.field3801 - 1 && this.field3798[var3 + this.field3794] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field3798 = var2;
   }

   @ObfuscatedName("s")
   public void method5892(int var1) {
      for(int var2 = this.field3801 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.field3794;

         for(int var4 = this.field3794 - 1; var4 > 0; --var4) {
            if(this.field3798[var4 + var3] == 0 && this.field3798[var4 + var3 - 1 - this.field3794] != 0) {
               this.field3798[var4 + var3] = var1;
            }
         }
      }

   }

   @ObfuscatedName("p")
   public void method5893(int var1, int var2) {
      var1 += this.field3795;
      var2 += this.field3793;
      int var3 = var1 + var2 * class314.field3770;
      int var4 = 0;
      int var5 = this.field3801;
      int var6 = this.field3794;
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
         method5895(class314.field3772, this.field3798, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("y")
   public void method5891(int var1, int var2) {
      var1 += this.field3795;
      var2 += this.field3793;
      int var3 = var1 + var2 * class314.field3770;
      int var4 = 0;
      int var5 = this.field3801;
      int var6 = this.field3794;
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
         method5957(class314.field3772, this.field3798, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("e")
   public void method5897(int var1, int var2, int var3, int var4) {
      if(var3 > 0 && var4 > 0) {
         int var5 = this.field3794;
         int var6 = this.field3801;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field3796;
         int var10 = this.field3792;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if(this.field3795 > 0) {
            var13 = (var11 + (this.field3795 << 16) - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field3795 << 16);
         }

         if(this.field3793 > 0) {
            var13 = (var12 + (this.field3793 << 16) - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field3793 << 16);
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

         method5898(class314.field3772, this.field3798, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   @ObfuscatedName("u")
   public void method5916(int var1, int var2, int var3, int var4) {
      if(var3 == 256) {
         this.method5891(var1, var2);
      } else {
         var1 += this.field3795;
         var2 += this.field3793;
         int var5 = var1 + var2 * class314.field3770;
         int var6 = 0;
         int var7 = this.field3801;
         int var8 = this.field3794;
         int var9 = class314.field3770 - var8;
         int var10 = 0;
         int var11;
         if(var2 < class314.field3769) {
            var11 = class314.field3769 - var2;
            var7 -= var11;
            var2 = class314.field3769;
            var6 += var11 * var8;
            var5 += var11 * class314.field3770;
         }

         if(var7 + var2 > class314.field3768) {
            var7 -= var7 + var2 - class314.field3768;
         }

         if(var1 < class314.field3771) {
            var11 = class314.field3771 - var1;
            var8 -= var11;
            var1 = class314.field3771;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if(var8 + var1 > class314.field3767) {
            var11 = var8 + var1 - class314.field3767;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if(var8 > 0 && var7 > 0) {
            method5900(class314.field3772, this.field3798, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   @ObfuscatedName("r")
   public void method5901(int var1, int var2, int var3) {
      var1 += this.field3795;
      var2 += this.field3793;
      int var4 = var1 + var2 * class314.field3770;
      int var5 = 0;
      int var6 = this.field3801;
      int var7 = this.field3794;
      int var8 = class314.field3770 - var7;
      int var9 = 0;
      int var10;
      if(var2 < class314.field3769) {
         var10 = class314.field3769 - var2;
         var6 -= var10;
         var2 = class314.field3769;
         var5 += var10 * var7;
         var4 += var10 * class314.field3770;
      }

      if(var6 + var2 > class314.field3768) {
         var6 -= var6 + var2 - class314.field3768;
      }

      if(var1 < class314.field3771) {
         var10 = class314.field3771 - var1;
         var7 -= var10;
         var1 = class314.field3771;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 + var1 > class314.field3767) {
         var10 = var7 + var1 - class314.field3767;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         method5902(class314.field3772, this.field3798, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   @ObfuscatedName("o")
   public void method5903(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field3794;
         int var7 = this.field3801;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field3796;
         int var11 = this.field3792;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field3795 > 0) {
            var14 = (var12 + (this.field3795 << 16) - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field3795 << 16);
         }

         if(this.field3793 > 0) {
            var14 = (var13 + (this.field3793 << 16) - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field3793 << 16);
         }

         if(var6 < var10) {
            var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         if(var7 < var11) {
            var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
         }

         var14 = var1 + var2 * class314.field3770;
         int var15 = class314.field3770 - var3;
         if(var2 + var4 > class314.field3768) {
            var4 -= var2 + var4 - class314.field3768;
         }

         int var16;
         if(var2 < class314.field3769) {
            var16 = class314.field3769 - var2;
            var4 -= var16;
            var14 += var16 * class314.field3770;
            var9 += var13 * var16;
         }

         if(var3 + var1 > class314.field3767) {
            var16 = var3 + var1 - class314.field3767;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < class314.field3771) {
            var16 = class314.field3771 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         method5904(class314.field3772, this.field3798, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   @ObfuscatedName("at")
   public void method5907(int var1, int var2, int var3) {
      var1 += this.field3795;
      var2 += this.field3793;
      int var4 = var1 + var2 * class314.field3770;
      int var5 = 0;
      int var6 = this.field3801;
      int var7 = this.field3794;
      int var8 = class314.field3770 - var7;
      int var9 = 0;
      int var10;
      if(var2 < class314.field3769) {
         var10 = class314.field3769 - var2;
         var6 -= var10;
         var2 = class314.field3769;
         var5 += var10 * var7;
         var4 += var10 * class314.field3770;
      }

      if(var6 + var2 > class314.field3768) {
         var6 -= var6 + var2 - class314.field3768;
      }

      if(var1 < class314.field3771) {
         var10 = class314.field3771 - var1;
         var7 -= var10;
         var1 = class314.field3771;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 + var1 > class314.field3767) {
         var10 = var7 + var1 - class314.field3767;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         if(var3 == 256) {
            method5906(0, 0, 0, class314.field3772, this.field3798, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method5972(0, 0, 0, class314.field3772, this.field3798, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   @ObfuscatedName("ay")
   public void method5899(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field3794;
         int var7 = this.field3801;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field3796;
         int var11 = this.field3792;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field3795 > 0) {
            var14 = (var12 + (this.field3795 << 16) - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field3795 << 16);
         }

         if(this.field3793 > 0) {
            var14 = (var13 + (this.field3793 << 16) - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field3793 << 16);
         }

         if(var6 < var10) {
            var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
         }

         if(var7 < var11) {
            var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
         }

         var14 = var1 + var2 * class314.field3770;
         int var15 = class314.field3770 - var3;
         if(var2 + var4 > class314.field3768) {
            var4 -= var2 + var4 - class314.field3768;
         }

         int var16;
         if(var2 < class314.field3769) {
            var16 = class314.field3769 - var2;
            var4 -= var16;
            var14 += var16 * class314.field3770;
            var9 += var13 * var16;
         }

         if(var3 + var1 > class314.field3767) {
            var16 = var3 + var1 - class314.field3767;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < class314.field3771) {
            var16 = class314.field3771 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if(var5 == 256) {
            method5909(0, 0, 0, var8, this.field3798, class314.field3772, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method5910(0, 0, 0, var8, this.field3798, class314.field3772, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   @ObfuscatedName("aw")
   public void method5911(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0?-var2:0;
      int var10 = var2 + this.field3801 <= var6?this.field3801:var6 - var2;
      int var11 = var1 < 0?-var1:0;
      int var10000;
      if(this.field3794 + var1 <= var5) {
         var10000 = this.field3794;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var11 + (var9 + var2 + var4) * class314.field3770 + var1;
      int var14 = var9 + var2;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if(var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if(this.field3794 + var1 <= var16 + var17) {
            var12 = this.field3794;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.field3798[var20 + var15 * this.field3794];
            if(var21 != 0) {
               class314.field3772[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += class314.field3770;
      }

   }

   @ObfuscatedName("ag")
   public void method5948(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = var12 * var13 + var11 * var14 + (var5 << 16);
         int var16 = var12 * var14 - var11 * var13 + (var6 << 16);
         int var17 = var1 + var2 * class314.field3770;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               class314.field3772[var19++] = this.field3798[this.field3794 * (var21 >> 16) + (var20 >> 16)];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += class314.field3770;
         }
      } catch (Exception var23) {
         ;
      }

   }

   @ObfuscatedName("ah")
   public void method5913(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = var11 * var12 + var10 * var13 + (var5 << 16);
         int var15 = var11 * var13 - var10 * var12 + (var6 << 16);
         int var16 = var1 + var2 * class314.field3770;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field3798[this.field3794 * (var19 >> 16) + (var18 >> 16)];
               if(var20 != 0) {
                  class314.field3772[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += class314.field3770;
         }
      } catch (Exception var22) {
         ;
      }

   }

   @ObfuscatedName("az")
   public void method5998(int var1, int var2, int var3, int var4) {
      this.method5994(this.field3796 << 3, this.field3792 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   @ObfuscatedName("ao")
   void method5994(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var6 != 0) {
         var1 -= this.field3795 << 4;
         var2 -= this.field3793 << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = var10 * -var1 + -var2 * var9;
         int var12 = -var2 * var10 + var9 * -(-var1);
         int var13 = var10 * ((this.field3794 << 4) - var1) + -var2 * var9;
         int var14 = var9 * -((this.field3794 << 4) - var1) + -var2 * var10;
         int var15 = ((this.field3801 << 4) - var2) * var9 + var10 * -var1;
         int var16 = ((this.field3801 << 4) - var2) * var10 + var9 * -(-var1);
         int var17 = ((this.field3801 << 4) - var2) * var9 + var10 * ((this.field3794 << 4) - var1);
         int var18 = ((this.field3801 << 4) - var2) * var10 + var9 * -((this.field3794 << 4) - var1);
         int var19;
         int var20;
         if(var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if(var15 < var19) {
            var19 = var15;
         }

         if(var17 < var19) {
            var19 = var17;
         }

         if(var15 > var20) {
            var20 = var15;
         }

         if(var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if(var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if(var16 < var21) {
            var21 = var16;
         }

         if(var18 < var21) {
            var21 = var18;
         }

         if(var16 > var22) {
            var22 = var16;
         }

         if(var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if(var19 < class314.field3771) {
            var19 = class314.field3771;
         }

         if(var20 > class314.field3767) {
            var20 = class314.field3767;
         }

         if(var21 < class314.field3769) {
            var21 = class314.field3769;
         }

         if(var22 > class314.field3768) {
            var22 = class314.field3768;
         }

         var20 = var19 - var20;
         if(var20 < 0) {
            var22 = var21 - var22;
            if(var22 < 0) {
               int var23 = var19 + var21 * class314.field3770;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var29 * var27 >> 4) + (var2 << 8);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if(var27 == 0) {
                  if(var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if(var30 >= 0 && var31 >= 0 && var30 - (this.field3794 << 12) < 0 && var31 - (this.field3801 << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                              if(var38 != 0) {
                                 class314.field3772[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if(var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                        var34 = var23;
                        var35 = var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if(var30 >= 0 && var30 - (this.field3794 << 12) < 0) {
                           if((var32 = var36 - (this.field3801 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                              if(var38 != 0) {
                                 class314.field3772[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                        var34 = var23;
                        var35 = var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if(var30 >= 0 && var30 - (this.field3794 << 12) < 0) {
                           if(var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (var36 + 1 - (this.field3801 << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                              if(var38 != 0) {
                                 class314.field3772[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if(var27 < 0) {
                  if(var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = var31;
                        var37 = var20;
                        if(var31 >= 0 && var31 - (this.field3801 << 12) < 0) {
                           if((var32 = var35 - (this.field3794 << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                              if(var38 != 0) {
                                 class314.field3772[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if(var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if((var32 = var35 - (this.field3794 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if((var32 = var36 - (this.field3801 << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                           if(var38 != 0) {
                              class314.field3772[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                        var34 = var23;
                        var35 = (var28 * var27 >> 4) + var30;
                        var36 = (var28 * var26 >> 4) + var31;
                        var37 = var20;
                        if((var32 = var35 - (this.field3794 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if(var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if((var32 = (var36 + 1 - (this.field3801 << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                           if(var38 != 0) {
                              class314.field3772[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if(var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = var31;
                     var37 = var20;
                     if(var31 >= 0 && var31 - (this.field3801 << 12) < 0) {
                        if(var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (var35 + 1 - (this.field3794 << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                           if(var38 != 0) {
                              class314.field3772[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if(var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = (var28 * var26 >> 4) + var31;
                     var37 = var20;
                     if(var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if((var32 = (var35 + 1 - (this.field3794 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if((var32 = var36 - (this.field3801 << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                        if(var38 != 0) {
                           class314.field3772[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += class314.field3770) {
                     var34 = var23;
                     var35 = (var28 * var27 >> 4) + var30;
                     var36 = (var28 * var26 >> 4) + var31;
                     var37 = var20;
                     if(var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if((var32 = (var35 + 1 - (this.field3794 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if(var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if((var32 = (var36 + 1 - (this.field3801 << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field3798[(var35 >> 12) + (var36 >> 12) * this.field3794];
                        if(var38 != 0) {
                           class314.field3772[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("ap")
   public void method5884(int var1, int var2, int var3, int var4) {
      if(var3 <= this.field3796 && var4 <= this.field3792) {
         int var5 = var3 * this.field3795 / this.field3796 + var1;
         int var6 = (var3 * (this.field3795 + this.field3794) + this.field3796 - 1) / this.field3796 + var1;
         int var7 = var2 + var4 * this.field3793 / this.field3792;
         int var8 = var2 + (this.field3792 + (this.field3793 + this.field3801) * var4 - 1) / this.field3792;
         if(var5 < class314.field3771) {
            var5 = class314.field3771;
         }

         if(var6 > class314.field3767) {
            var6 = class314.field3767;
         }

         if(var7 < class314.field3769) {
            var7 = class314.field3769;
         }

         if(var8 > class314.field3768) {
            var8 = class314.field3768;
         }

         if(var5 < var6 && var7 < var8) {
            int var9 = var5 + var7 * class314.field3770;
            int var10 = class314.field3770 - (var6 - var5);
            if(var9 < class314.field3772.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field3796 / var3 - (this.field3795 << 4);
                     int var16 = (var13 + 16) * this.field3796 / var3 - (this.field3795 << 4);
                     int var17 = var14 * this.field3792 / var4 - (this.field3793 << 4);
                     int var18 = (var14 + 16) * this.field3792 / var4 - (this.field3793 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if(var19 != 0) {
                        if(var15 < 0) {
                           var15 = 0;
                        }

                        if(var16 >= this.field3794 << 4) {
                           var16 = this.field3794 << 4;
                        }

                        if(var17 < 0) {
                           var17 = 0;
                        }

                        if(var18 >= this.field3801 << 4) {
                           var18 = this.field3801 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if(var28 == var17) {
                              var29 = var22;
                           }

                           if(var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field3798[var30 + var28 * this.field3794];
                              if(var31 != 0) {
                                 int var32;
                                 if(var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if(var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += var32 * (var31 >> 16 & 255);
                                 var25 += var32 * (var31 >> 8 & 255);
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if(var27 >= var19) {
                           var28 = var26 / var27 + (var24 / var27 << 16) + (var25 / var27 << 8);
                           if(var28 == 0) {
                              var28 = 1;
                           }

                           class314.field3772[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("g")
   static void method5895(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            ;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   @ObfuscatedName("c")
   static void method5957(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("t")
   static void method5898(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if(var2 != 0) {
               var0[var5++] = var2;
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

   @ObfuscatedName("i")
   static void method5900(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var12 = var9 * (var2 & 16711935) & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = var10 + ((var12 | var13) >>> 8);
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("v")
   static void method5902(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var13 & 16711935) * var10 + var9 * (var2 & 16711935) & -16711936) + ((var2 & '\uff00') * var9 + var10 * (var13 & '\uff00') & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("ai")
   static void method5904(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = var11 * (var4 >> 16);

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if(var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & '\uff00') * var12 + var13 * (var18 & '\uff00') & 16711680) + ((var18 & 16711935) * var13 + var12 * (var2 & 16711935) & -16711936) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   @ObfuscatedName("ad")
   static void method5906(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   @ObfuscatedName("ac")
   static void method5972(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = var13 * (var0 & 16711935);
               var0 = (var1 & -16711936) + (var13 * var0 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   @ObfuscatedName("an")
   static void method5909(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = var15 * (var9 >> 16);

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   @ObfuscatedName("as")
   static void method5910(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = var15 * (var9 >> 16);

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }
}
