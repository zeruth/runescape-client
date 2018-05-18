import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class104 {

   @ObfuscatedName("n")
   static float[][] field1401 = new float[2][8];
   @ObfuscatedName("h")
   static int[][] field1404 = new int[2][8];
   @ObfuscatedName("x")
   static float field1394;
   @ObfuscatedName("j")
   static int field1402;
   @ObfuscatedName("w")
   int[] field1397 = new int[2];
   @ObfuscatedName("q")
   int[][][] field1396 = new int[2][2][4];
   @ObfuscatedName("b")
   int[][][] field1399 = new int[2][2][4];
   @ObfuscatedName("f")
   int[] field1398 = new int[2];


   @ObfuscatedName("w")
   float method2470(int var1, int var2, float var3) {
      float var4 = (float)this.field1399[var1][0][var2] + var3 * (float)(this.field1399[var1][1][var2] - this.field1399[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   @ObfuscatedName("q")
   float method2482(int var1, int var2, float var3) {
      float var4 = (float)this.field1396[var1][0][var2] + var3 * (float)(this.field1396[var1][1][var2] - this.field1396[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method2472(var4);
   }

   @ObfuscatedName("x")
   int method2469(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.field1398[0] + (float)(this.field1398[1] - this.field1398[0]) * var2;
         var3 *= 0.0030517578F;
         field1394 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field1402 = (int)(field1394 * 65536.0F);
      }

      if(this.field1397[var1] == 0) {
         return 0;
      } else {
         var3 = this.method2470(var1, 0, var2);
         field1401[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method2482(var1, 0, var2));
         field1401[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.field1397[var1]; ++var4) {
            var3 = this.method2470(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method2482(var1, var4, var2));
            float var6 = var3 * var3;
            field1401[var1][var4 * 2 + 1] = field1401[var1][var4 * 2 - 1] * var6;
            field1401[var1][var4 * 2] = field1401[var1][var4 * 2 - 1] * var5 + field1401[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               field1401[var1][var7] += field1401[var1][var7 - 1] * var5 + field1401[var1][var7 - 2] * var6;
            }

            field1401[var1][1] += field1401[var1][0] * var5 + var6;
            field1401[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.field1397[0] * 2; ++var4) {
               field1401[0][var4] *= field1394;
            }
         }

         for(var4 = 0; var4 < this.field1397[var1] * 2; ++var4) {
            field1404[var1][var4] = (int)(field1401[var1][var4] * 65536.0F);
         }

         return this.field1397[var1] * 2;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lgy;Lcy;)V"
   )
   final void method2471(class182 var1, class96 var2) {
      int var3 = var1.method3742();
      this.field1397[0] = var3 >> 4;
      this.field1397[1] = var3 & 15;
      if(var3 != 0) {
         this.field1398[0] = var1.method3574();
         this.field1398[1] = var1.method3574();
         int var4 = var1.method3742();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field1397[var5]; ++var6) {
               this.field1396[var5][0][var6] = var1.method3574();
               this.field1399[var5][0][var6] = var1.method3574();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field1397[var5]; ++var6) {
               if((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field1396[var5][1][var6] = var1.method3574();
                  this.field1399[var5][1][var6] = var1.method3574();
               } else {
                  this.field1396[var5][1][var6] = this.field1396[var5][0][var6];
                  this.field1399[var5][1][var6] = this.field1399[var5][0][var6];
               }
            }
         }

         if(var4 != 0 || this.field1398[1] != this.field1398[0]) {
            var2.method2256(var1);
         }
      } else {
         int[] var7 = this.field1398;
         this.field1398[1] = 0;
         var7[0] = 0;
      }

   }

   @ObfuscatedName("m")
   static float method2472(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
