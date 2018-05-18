import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class92 extends class204 {

   @ObfuscatedName("h")
   static byte[] field1293;
   @ObfuscatedName("x")
   static int field1301;
   @ObfuscatedName("j")
   static int field1277;
   @ObfuscatedName("a")
   static int field1278;
   @ObfuscatedName("l")
   static int field1276;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[Lca;"
   )
   static class90[] field1270;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "[Lcl;"
   )
   static class94[] field1281;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "[Lcu;"
   )
   static class101[] field1282;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "[Lda;"
   )
   static class106[] field1275;
   @ObfuscatedName("y")
   static boolean[] field1269;
   @ObfuscatedName("c")
   static int[] field1285;
   @ObfuscatedName("e")
   static boolean field1284 = false;
   @ObfuscatedName("k")
   static float[] field1291;
   @ObfuscatedName("r")
   static float[] field1283;
   @ObfuscatedName("v")
   static float[] field1279;
   @ObfuscatedName("o")
   static float[] field1294;
   @ObfuscatedName("ai")
   static float[] field1286;
   @ObfuscatedName("at")
   static float[] field1296;
   @ObfuscatedName("ad")
   static float[] field1297;
   @ObfuscatedName("ac")
   static int[] field1298;
   @ObfuscatedName("ay")
   static int[] field1299;
   @ObfuscatedName("w")
   byte[][] field1280;
   @ObfuscatedName("m")
   int field1273;
   @ObfuscatedName("q")
   int field1302;
   @ObfuscatedName("b")
   int field1272;
   @ObfuscatedName("f")
   int field1292;
   @ObfuscatedName("n")
   boolean field1274;
   @ObfuscatedName("t")
   float[] field1287;
   @ObfuscatedName("u")
   int field1288;
   @ObfuscatedName("i")
   int field1289;
   @ObfuscatedName("z")
   boolean field1290;
   @ObfuscatedName("an")
   byte[] field1300;
   @ObfuscatedName("as")
   int field1295;
   @ObfuscatedName("aw")
   int field1271;


   class92(byte[] var1) {
      this.method2122(var1);
   }

   @ObfuscatedName("j")
   void method2122(byte[] var1) {
      class182 var2 = new class182(var1);
      this.field1273 = var2.method3573();
      this.field1302 = var2.method3573();
      this.field1272 = var2.method3573();
      this.field1292 = var2.method3573();
      if(this.field1292 < 0) {
         this.field1292 = ~this.field1292;
         this.field1274 = true;
      }

      int var3 = var2.method3573();
      this.field1280 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method3742();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method3580(var7, 0, var5);
         this.field1280[var4] = var7;
      }

   }

   @ObfuscatedName("l")
   float[] method2125(int var1) {
      method2120(this.field1280[var1], 0);
      method2121();
      int var2 = method2141(class11.method113(field1285.length - 1));
      boolean var3 = field1269[var2];
      int var4 = var3?field1276:field1278;
      boolean var5 = false;
      boolean var6 = false;
      if(var3) {
         var5 = method2121() != 0;
         var6 = method2121() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if(var3 && !var5) {
         var8 = (var4 >> 2) - (field1278 >> 2);
         var9 = (field1278 >> 2) + (var4 >> 2);
         var10 = field1278 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if(var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field1278 >> 2);
         var12 = (field1278 >> 2) + (var4 - (var4 >> 2));
         var13 = field1278 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class106 var14 = field1275[field1285[var2]];
      int var16 = var14.field1411;
      int var17 = var14.field1412[var16];
      boolean var15 = !field1281[var17].method2179();
      boolean var45 = var15;

      for(var17 = 0; var17 < var14.field1413; ++var17) {
         class101 var18 = field1282[var14.field1410[var17]];
         float[] var19 = field1291;
         var18.method2301(var19, var4 >> 1, var45);
      }

      int var40;
      if(!var15) {
         var17 = var14.field1411;
         var40 = var14.field1412[var17];
         field1281[var40].method2165(field1291, var4 >> 1);
      }

      int var42;
      if(var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field1291[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var40 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var43 = field1291;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var43[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var43[var21] = -var43[var4 - var21 - 1];
         }

         float[] var44 = var3?field1286:field1283;
         float[] var22 = var3?field1296:field1279;
         float[] var23 = var3?field1297:field1294;
         int[] var24 = var3?field1299:field1298;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var40; ++var25) {
            var26 = var43[var25 * 4] - var43[var4 - var25 * 4 - 1];
            var27 = var43[var25 * 4 + 2] - var43[var4 - var25 * 4 - 3];
            var28 = var44[var25 * 2];
            var29 = var44[var25 * 2 + 1];
            var43[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
            var43[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var43[var17 + var25 * 4 + 3];
            var27 = var43[var17 + var25 * 4 + 1];
            var28 = var43[var25 * 4 + 3];
            var29 = var43[var25 * 4 + 1];
            var43[var17 + var25 * 4 + 3] = var26 + var28;
            var43[var17 + var25 * 4 + 1] = var27 + var29;
            var30 = var44[var17 - 4 - var25 * 4];
            var31 = var44[var17 - 3 - var25 * 4];
            var43[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var43[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class11.method113(var4 - 1);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * var50 * 2;
               int var52 = var4 - var48 * (var50 * 2 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = var32 * 4;
                  float var34 = var43[var51 - 1 - var33];
                  float var35 = var43[var51 - 3 - var33];
                  float var36 = var43[var52 - 1 - var33];
                  float var37 = var43[var52 - 3 - var33];
                  var43[var51 - 1 - var33] = var34 + var36;
                  var43[var51 - 3 - var33] = var35 + var37;
                  float var38 = var44[var32 * var49];
                  float var39 = var44[var32 * var49 + 1];
                  var43[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var43[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if(var47 < var48) {
               var49 = var47 * 8;
               var50 = var48 * 8;
               var30 = var43[var49 + 1];
               var43[var49 + 1] = var43[var50 + 1];
               var43[var50 + 1] = var30;
               var30 = var43[var49 + 3];
               var43[var49 + 3] = var43[var50 + 3];
               var43[var50 + 3] = var30;
               var30 = var43[var49 + 5];
               var43[var49 + 5] = var43[var50 + 5];
               var43[var50 + 5] = var30;
               var30 = var43[var49 + 7];
               var43[var49 + 7] = var43[var50 + 7];
               var43[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var43[var47] = var43[var47 * 2 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var43[var4 - 1 - var47 * 2] = var43[var47 * 4];
            var43[var4 - 2 - var47 * 2] = var43[var47 * 4 + 1];
            var43[var4 - var40 - 1 - var47 * 2] = var43[var47 * 4 + 2];
            var43[var4 - var40 - 2 - var47 * 2] = var43[var47 * 4 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[var47 * 2];
            var28 = var23[var47 * 2 + 1];
            var29 = var43[var17 + var47 * 2];
            var30 = var43[var17 + var47 * 2 + 1];
            var31 = var43[var4 - 2 - var47 * 2];
            float var53 = var43[var4 - 1 - var47 * 2];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var43[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
            var43[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var43[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
            var43[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47] = var43[var17 + var47 * 2] * var22[var47 * 2] + var43[var17 + var47 * 2 + 1] * var22[var47 * 2 + 1];
            var43[var17 - 1 - var47] = var43[var17 + var47 * 2] * var22[var47 * 2 + 1] - var43[var17 + var47 * 2 + 1] * var22[var47 * 2];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47 + (var4 - var40)] = -var43[var47];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47] = var43[var40 + var47];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var40 + var47] = -var43[var40 - var47 - 1];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var17 + var47] = var43[var4 - var47 - 1];
         }

         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field1291[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field1291[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var41 = null;
      if(this.field1288 > 0) {
         var40 = var4 + this.field1288 >> 2;
         var41 = new float[var40];
         int var20;
         if(!this.field1290) {
            for(var42 = 0; var42 < this.field1289; ++var42) {
               var20 = var42 + (this.field1288 >> 1);
               var41[var42] += this.field1287[var20];
            }
         }

         if(!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var20 = var41.length - (var4 >> 1) + var42;
               var41[var20] += field1291[var42];
            }
         }
      }

      float[] var46 = this.field1287;
      this.field1287 = field1291;
      field1291 = var46;
      this.field1288 = var4;
      this.field1289 = var12 - (var4 >> 1);
      this.field1290 = var15;
      return var41;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "([I)Lcg;"
   )
   class93 method2128(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field1300 == null) {
            this.field1288 = 0;
            this.field1287 = new float[field1276];
            this.field1300 = new byte[this.field1302];
            this.field1295 = 0;
            this.field1271 = 0;
         }

         for(; this.field1271 < this.field1280.length; ++this.field1271) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method2125(this.field1271);
            if(var2 != null) {
               int var3 = this.field1295;
               int var4 = var2.length;
               if(var4 > this.field1302 - var3) {
                  var4 = this.field1302 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field1300[var3++] = (byte)(var6 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field1295;
               }

               this.field1295 = var3;
            }
         }

         this.field1287 = null;
         byte[] var7 = this.field1300;
         this.field1300 = null;
         return new class93(this.field1273, var7, this.field1272, this.field1292, this.field1274);
      }
   }

   @ObfuscatedName("w")
   static float method2124(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @ObfuscatedName("m")
   static void method2120(byte[] var0, int var1) {
      field1293 = var0;
      field1301 = var1;
      field1277 = 0;
   }

   @ObfuscatedName("q")
   static int method2121() {
      int var0 = field1293[field1301] >> field1277 & 1;
      ++field1277;
      field1301 += field1277 >> 3;
      field1277 &= 7;
      return var0;
   }

   @ObfuscatedName("x")
   static int method2141(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field1277; var0 -= var3) {
         var3 = 8 - field1277;
         int var4 = (1 << var3) - 1;
         var1 += (field1293[field1301] >> field1277 & var4) << var2;
         field1277 = 0;
         ++field1301;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field1293[field1301] >> field1277 & var3) << var2;
         field1277 += var0;
      }

      return var1;
   }

   @ObfuscatedName("a")
   static void method2129(byte[] var0) {
      method2120(var0, 0);
      field1278 = 1 << method2141(4);
      field1276 = 1 << method2141(4);
      field1291 = new float[field1276];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field1276:field1278;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
            var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
         }

         float[] var12 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var12[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
            var12[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
         }

         float[] var13 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var13[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
            var13[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var14 = new int[var5];
         int var10 = class11.method113(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            var14[var11] = class36.method690(var11, var10);
         }

         if(var1 != 0) {
            field1286 = var6;
            field1296 = var12;
            field1297 = var13;
            field1299 = var14;
         } else {
            field1283 = var6;
            field1279 = var12;
            field1294 = var13;
            field1298 = var14;
         }
      }

      var1 = method2141(8) + 1;
      field1270 = new class90[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field1270[var2] = new class90();
      }

      var2 = method2141(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method2141(16);
      }

      var2 = method2141(6) + 1;
      field1281 = new class94[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field1281[var3] = new class94();
      }

      var3 = method2141(6) + 1;
      field1282 = new class101[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field1282[var4] = new class101();
      }

      var4 = method2141(6) + 1;
      field1275 = new class106[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field1275[var5] = new class106();
      }

      var5 = method2141(6) + 1;
      field1269 = new boolean[var5];
      field1285 = new int[var5];

      for(int var15 = 0; var15 < var5; ++var15) {
         field1269[var15] = method2121() != 0;
         method2141(16);
         method2141(16);
         field1285[var15] = method2141(8);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Liv;)Z"
   )
   static boolean method2132(class247 var0) {
      if(!field1284) {
         byte[] var1 = var0.method4626(0, 0);
         if(var1 == null) {
            return false;
         }

         method2129(var1);
         field1284 = true;
      }

      return true;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Liv;II)Lcb;"
   )
   static class92 method2127(class247 var0, int var1, int var2) {
      if(!method2132(var0)) {
         var0.method4708(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method4626(var1, var2);
         return var3 == null?null:new class92(var3);
      }
   }
}
