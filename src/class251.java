import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class251 {
   @ObfuscatedName("j")
   static int[] field3229;
   @ObfuscatedName("w")
   final HashMap field3240;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   Bounds field3231;
   @ObfuscatedName("q")
   int[] field3237;
   @ObfuscatedName("b")
   int[] field3232;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1614131407
   )
   int field3233;

   public class251() {
      this.field3240 = new HashMap();
      this.field3231 = new Bounds(0, 0);
      this.field3237 = new int[2048];
      this.field3232 = new int[2048];
      this.field3233 = 0;
      Frames.method3084();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1134411134"
   )
   void method4786(int var1) {
      int var2 = var1 * 2 + 1;
      double var3 = (double)((float)var1 / 3.0F);
      int var5 = var1 * 2 + 1;
      double[] var6 = new double[var5];
      int var7 = -var1;

      for(int var8 = 0; var7 <= var1; ++var8) {
         var6[var8] = class157.method3303((double)var7, 0.0D, var3);
         ++var7;
      }

      double[] var16 = var6;
      double var9 = var6[var1] * var6[var1];
      int[] var11 = new int[var2 * var2];
      boolean var12 = false;

      for(int var13 = 0; var13 < var2; ++var13) {
         for(int var14 = 0; var14 < var2; ++var14) {
            int var15 = var11[var14 + var13 * var2] = (int)(var16[var13] * var16[var14] / var9 * 256.0D);
            if(!var12 && var15 > 0) {
               var12 = true;
            }
         }
      }

      SpritePixels var17 = new SpritePixels(var11, var2, var2);
      this.field3240.put(Integer.valueOf(var1), var17);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IB)Llc;",
      garbageValue = "-114"
   )
   SpritePixels method4788(int var1) {
      if(!this.field3240.containsKey(Integer.valueOf(var1))) {
         this.method4786(var1);
      }

      return (SpritePixels)this.field3240.get(Integer.valueOf(var1));
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "711608578"
   )
   public final void method4796(int var1, int var2) {
      if(this.field3233 < this.field3237.length) {
         this.field3237[this.field3233] = var1;
         this.field3232[this.field3233] = var2;
         ++this.field3233;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public final void method4793() {
      this.field3233 = 0;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IILlc;FI)V",
      garbageValue = "-821470330"
   )
   public final void method4789(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      SpritePixels var6 = this.method4788(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.width, var3.height);
      Bounds var9 = new Bounds(0, 0);
      this.field3231.method5729(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field3233; ++var10) {
         var11 = this.field3237[var10];
         var12 = this.field3232[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.height - (float)(var12 - var2) * var4) - var5;
         this.field3231.method5730(var13, var14);
         this.field3231.method5742(var8, var9);
         this.method4790(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.pixels.length; ++var10) {
         if(var3.pixels[var10] == 0) {
            var3.pixels[var10] = -16777216;
         } else {
            var11 = (var3.pixels[var10] + 64 - 1) / 256;
            if(var11 <= 0) {
               var3.pixels[var10] = -16777216;
            } else {
               if(var11 > field3229.length) {
                  var11 = field3229.length;
               }

               var12 = field3229[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Llc;Llc;Lka;I)V",
      garbageValue = "768553009"
   )
   void method4790(SpritePixels var1, SpritePixels var2, Bounds var3) {
      if(var3.field3750 != 0 && var3.field3751 != 0) {
         int var4 = 0;
         int var5 = 0;
         if(var3.field3752 == 0) {
            var4 = var1.width - var3.field3750;
         }

         if(var3.field3749 == 0) {
            var5 = var1.height - var3.field3751;
         }

         int var6 = var4 + var5 * var1.width;
         int var7 = var2.width * var3.field3749 + var3.field3752;

         for(int var8 = 0; var8 < var3.field3751; ++var8) {
            for(int var9 = 0; var9 < var3.field3750; ++var9) {
               int var10 = var7++;
               var2.pixels[var10] += var1.pixels[var6++];
            }

            var6 += var1.width - var3.field3750;
            var7 += var2.width - var3.field3750;
         }
      }

   }
}
