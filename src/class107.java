import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class107 {

   @ObfuscatedName("e")
   static int[] field1431;
   @ObfuscatedName("t")
   static int[] field1435 = new int['\u8000'];
   @ObfuscatedName("u")
   static int[] field1433;
   @ObfuscatedName("z")
   static int[] field1428;
   @ObfuscatedName("k")
   static int[] field1436;
   @ObfuscatedName("r")
   static int[] field1437;
   @ObfuscatedName("v")
   static int[] field1438;
   @ObfuscatedName("o")
   static int[] field1439;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1425;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1415;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1416;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1432;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1418;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1419;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1420;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1421;
   @ObfuscatedName("j")
   int[] field1422 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("a")
   int[] field1423 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("l")
   int[] field1414 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("d")
   int field1429 = 0;
   @ObfuscatedName("s")
   int field1426 = 100;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   class104 field1427;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lcy;"
   )
   class96 field1417;
   @ObfuscatedName("y")
   int field1424 = 500;
   @ObfuscatedName("c")
   int field1430 = 0;


   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < '\u8000'; ++var1) {
         field1435[var1] = (var0.nextInt() & 2) - 1;
      }

      field1433 = new int['\u8000'];

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         field1433[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1431 = new int[220500];
      field1428 = new int[5];
      field1436 = new int[5];
      field1437 = new int[5];
      field1438 = new int[5];
      field1439 = new int[5];
   }

   @ObfuscatedName("w")
   final int[] method2510(int var1, int var2) {
      class193.method3935(field1431, 0, var1);
      if(var2 < 10) {
         return field1431;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1425.method2257();
         this.field1415.method2257();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field1416 != null) {
            this.field1416.method2257();
            this.field1432.method2257();
            var5 = (int)((double)(this.field1416.field1348 - this.field1416.field1346) * 32.768D / var3);
            var6 = (int)((double)this.field1416.field1346 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field1418 != null) {
            this.field1418.method2257();
            this.field1419.method2257();
            var8 = (int)((double)(this.field1418.field1348 - this.field1418.field1346) * 32.768D / var3);
            var9 = (int)((double)this.field1418.field1346 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field1422[var11] != 0) {
               field1428[var11] = 0;
               field1436[var11] = (int)((double)this.field1414[var11] * var3);
               field1437[var11] = (this.field1422[var11] << 14) / 100;
               field1438[var11] = (int)((double)(this.field1425.field1348 - this.field1425.field1346) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1423[var11]) / var3);
               field1439[var11] = (int)((double)this.field1425.field1346 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1425.method2260(var1);
            var13 = this.field1415.method2260(var1);
            if(this.field1416 != null) {
               var14 = this.field1416.method2260(var1);
               var15 = this.field1432.method2260(var1);
               var12 += this.method2512(var7, var15, this.field1416.field1353) >> 1;
               var7 = var7 + var6 + (var14 * var5 >> 16);
            }

            if(this.field1418 != null) {
               var14 = this.field1418.method2260(var1);
               var15 = this.field1419.method2260(var1);
               var13 = var13 * ((this.method2512(var10, var15, this.field1418.field1353) >> 1) + '\u8000') >> 15;
               var10 = var10 + var9 + (var14 * var8 >> 16);
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field1422[var14] != 0) {
                  var15 = field1436[var14] + var11;
                  if(var15 < var1) {
                     field1431[var15] += this.method2512(field1428[var14], var13 * field1437[var14] >> 15, this.field1425.field1353);
                     field1428[var14] += (var12 * field1438[var14] >> 16) + field1439[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field1420 != null) {
            this.field1420.method2257();
            this.field1421.method2257();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1420.method2260(var1);
               var16 = this.field1421.method2260(var1);
               if(var20) {
                  var12 = (var15 * (this.field1420.field1348 - this.field1420.field1346) >> 8) + this.field1420.field1346;
               } else {
                  var12 = (var16 * (this.field1420.field1348 - this.field1420.field1346) >> 8) + this.field1420.field1346;
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field1431[var14] = 0;
               }
            }
         }

         if(this.field1429 > 0 && this.field1426 > 0) {
            var11 = (int)((double)this.field1429 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1431[var12] += field1431[var12 - var11] * this.field1426 / 100;
            }
         }

         if(this.field1427.field1397[0] > 0 || this.field1427.field1397[1] > 0) {
            this.field1417.method2257();
            var11 = this.field1417.method2260(var1 + 1);
            var12 = this.field1427.method2469(0, (float)var11 / 65536.0F);
            var13 = this.field1427.method2469(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field1431[var14 + var12] * (long)class104.field1402 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field1431[var14 + var12 - 1 - var17] * (long)class104.field1404[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field1431[var14 - 1 - var17] * (long)class104.field1404[1][var17] >> 16);
                  }

                  field1431[var14] = var16;
                  var11 = this.field1417.method2260(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field1431[var14 + var12] * (long)class104.field1402 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field1431[var14 + var12 - 1 - var18] * (long)class104.field1404[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field1431[var14 - 1 - var18] * (long)class104.field1404[1][var18] >> 16);
                     }

                     field1431[var14] = var17;
                     var11 = this.field1417.method2260(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field1431[var14 + var12 - 1 - var18] * (long)class104.field1404[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field1431[var14 - 1 - var18] * (long)class104.field1404[1][var18] >> 16);
                        }

                        field1431[var14] = var17;
                        this.field1417.method2260(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1427.method2469(0, (float)var11 / 65536.0F);
                  var13 = this.field1427.method2469(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field1431[var11] < -32768) {
               field1431[var11] = -32768;
            }

            if(field1431[var11] > 32767) {
               field1431[var11] = 32767;
            }
         }

         return field1431;
      }
   }

   @ObfuscatedName("m")
   final int method2512(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?field1433[var1 & 32767] * var2 >> 14:(var3 == 3?(var2 * (var1 & 32767) >> 14) - var2:(var3 == 4?var2 * field1435[var1 / 2607 & 32767]:0)));
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;)V"
   )
   final void method2513(class182 var1) {
      this.field1425 = new class96();
      this.field1425.method2264(var1);
      this.field1415 = new class96();
      this.field1415.method2264(var1);
      int var2 = var1.method3742();
      if(var2 != 0) {
         --var1.field2359;
         this.field1416 = new class96();
         this.field1416.method2264(var1);
         this.field1432 = new class96();
         this.field1432.method2264(var1);
      }

      var2 = var1.method3742();
      if(var2 != 0) {
         --var1.field2359;
         this.field1418 = new class96();
         this.field1418.method2264(var1);
         this.field1419 = new class96();
         this.field1419.method2264(var1);
      }

      var2 = var1.method3742();
      if(var2 != 0) {
         --var1.field2359;
         this.field1420 = new class96();
         this.field1420.method2264(var1);
         this.field1421 = new class96();
         this.field1421.method2264(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method3599();
         if(var4 == 0) {
            break;
         }

         this.field1422[var3] = var4;
         this.field1423[var3] = var1.method3581();
         this.field1414[var3] = var1.method3599();
      }

      this.field1429 = var1.method3599();
      this.field1426 = var1.method3599();
      this.field1424 = var1.method3574();
      this.field1430 = var1.method3574();
      this.field1427 = new class104();
      this.field1417 = new class96();
      this.field1427.method2471(var1, this.field1417);
   }
}
