import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public final class class176 {

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfb;"
   )
   static class181 field2308 = new class181();


   @ObfuscatedName("w")
   public static int method3503(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      class181 var5 = field2308;
      synchronized(field2308) {
         field2308.field2326 = var2;
         field2308.field2347 = var4;
         field2308.field2329 = var0;
         field2308.field2320 = 0;
         field2308.field2350 = var1;
         field2308.field2336 = 0;
         field2308.field2322 = 0;
         field2308.field2328 = 0;
         field2308.field2332 = 0;
         method3505(field2308);
         var1 -= field2308.field2350;
         field2308.field2326 = null;
         field2308.field2329 = null;
         return var1;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lfb;)V"
   )
   static void method3504(class181 var0) {
      byte var2 = var0.field2333;
      int var3 = var0.field2334;
      int var4 = var0.field2357;
      int var5 = var0.field2337;
      int[] var6 = class160.field2007;
      int var7 = var0.field2339;
      byte[] var8 = var0.field2329;
      int var9 = var0.field2320;
      int var10 = var0.field2350;
      int var12 = var0.field2330 + 1;

      label65:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label65;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label65;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         boolean var14 = true;

         byte var1;
         while(var14) {
            var14 = false;
            if(var4 == var12) {
               var3 = 0;
               break label65;
            }

            var2 = (byte)var5;
            var7 = var6[var7];
            var1 = (byte)(var7 & 255);
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label65;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
               var14 = true;
            } else if(var4 == var12) {
               if(var10 == 0) {
                  var3 = 1;
                  break label65;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
               var14 = true;
            }
         }

         var3 = 2;
         var7 = var6[var7];
         var1 = (byte)(var7 & 255);
         var7 >>= 8;
         ++var4;
         if(var4 != var12) {
            if(var1 != var5) {
               var5 = var1;
            } else {
               var3 = 3;
               var7 = var6[var7];
               var1 = (byte)(var7 & 255);
               var7 >>= 8;
               ++var4;
               if(var4 != var12) {
                  if(var1 != var5) {
                     var5 = var1;
                  } else {
                     var7 = var6[var7];
                     var1 = (byte)(var7 & 255);
                     var7 >>= 8;
                     ++var4;
                     var3 = (var1 & 255) + 4;
                     var7 = var6[var7];
                     var5 = (byte)(var7 & 255);
                     var7 >>= 8;
                     ++var4;
                  }
               }
            }
         }
      }

      int var13 = var0.field2332;
      var0.field2332 += var10 - var10;
      if(var0.field2332 < var13) {
         ;
      }

      var0.field2333 = var2;
      var0.field2334 = var3;
      var0.field2357 = var4;
      var0.field2337 = var5;
      class160.field2007 = var6;
      var0.field2339 = var7;
      var0.field2329 = var8;
      var0.field2320 = var9;
      var0.field2350 = var10;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lfb;)V"
   )
   static void method3505(class181 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field2340 = 1;
      if(class160.field2007 == null) {
         class160.field2007 = new int[var0.field2340 * 100000];
      }

      boolean var26 = true;

      while(var26) {
         byte var1 = method3506(var0);
         if(var1 == 23) {
            return;
         }

         var1 = method3506(var0);
         var1 = method3506(var0);
         var1 = method3506(var0);
         var1 = method3506(var0);
         var1 = method3506(var0);
         var1 = method3506(var0);
         var1 = method3506(var0);
         var1 = method3506(var0);
         var1 = method3506(var0);
         var1 = method3516(var0);
         if(var1 != 0) {
            ;
         }

         var0.field2338 = 0;
         var1 = method3506(var0);
         var0.field2338 = var0.field2338 << 8 | var1 & 255;
         var1 = method3506(var0);
         var0.field2338 = var0.field2338 << 8 | var1 & 255;
         var1 = method3506(var0);
         var0.field2338 = var0.field2338 << 8 | var1 & 255;

         int var36;
         for(var36 = 0; var36 < 16; ++var36) {
            var1 = method3516(var0);
            if(var1 == 1) {
               var0.field2344[var36] = true;
            } else {
               var0.field2344[var36] = false;
            }
         }

         for(var36 = 0; var36 < 256; ++var36) {
            var0.field2345[var36] = false;
         }

         int var37;
         for(var36 = 0; var36 < 16; ++var36) {
            if(var0.field2344[var36]) {
               for(var37 = 0; var37 < 16; ++var37) {
                  var1 = method3516(var0);
                  if(var1 == 1) {
                     var0.field2345[var37 + var36 * 16] = true;
                  }
               }
            }
         }

         method3522(var0);
         int var39 = var0.field2353 + 2;
         int var40 = method3508(3, var0);
         int var41 = method3508(15, var0);
         var36 = 0;

         while(var36 < var41) {
            var37 = 0;

            while(true) {
               var1 = method3516(var0);
               if(var1 == 0) {
                  var0.field2351[var36] = (byte)var37;
                  ++var36;
                  break;
               }

               ++var37;
            }
         }

         byte[] var27 = new byte[6];

         byte var29;
         for(var29 = 0; var29 < var40; var27[var29] = var29++) {
            ;
         }

         for(var36 = 0; var36 < var41; ++var36) {
            var29 = var0.field2351[var36];

            byte var28;
            for(var28 = var27[var29]; var29 > 0; --var29) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.field2327[var36] = var28;
         }

         int var38;
         for(var38 = 0; var38 < var40; ++var38) {
            int var50 = method3508(5, var0);
            var36 = 0;

            while(var36 < var39) {
               while(true) {
                  var1 = method3516(var0);
                  if(var1 == 0) {
                     var0.field2343[var38][var36] = (byte)var50;
                     ++var36;
                     break;
                  }

                  var1 = method3516(var0);
                  if(var1 == 0) {
                     ++var50;
                  } else {
                     --var50;
                  }
               }
            }
         }

         for(var38 = 0; var38 < var40; ++var38) {
            byte var2 = 32;
            byte var3 = 0;

            for(var36 = 0; var36 < var39; ++var36) {
               if(var0.field2343[var38][var36] > var3) {
                  var3 = var0.field2343[var38][var36];
               }

               if(var0.field2343[var38][var36] < var2) {
                  var2 = var0.field2343[var38][var36];
               }
            }

            method3510(var0.field2352[var38], var0.field2354[var38], var0.field2355[var38], var0.field2343[var38], var2, var3, var39);
            var0.field2356[var38] = var2;
         }

         int var42 = var0.field2353 + 1;
         int var43 = -1;
         byte var44 = 0;

         for(var36 = 0; var36 <= 255; ++var36) {
            var0.field2341[var36] = 0;
         }

         int var56 = 4095;

         int var35;
         int var55;
         for(var35 = 15; var35 >= 0; --var35) {
            for(var55 = 15; var55 >= 0; --var55) {
               var0.field2348[var56] = (byte)(var55 + var35 * 16);
               --var56;
            }

            var0.field2349[var35] = var56 + 1;
         }

         int var47 = 0;
         byte var54;
         if(var44 == 0) {
            ++var43;
            var44 = 50;
            var54 = var0.field2327[var43];
            var22 = var0.field2356[var54];
            var23 = var0.field2352[var54];
            var25 = var0.field2355[var54];
            var24 = var0.field2354[var54];
         }

         int var45 = var44 - 1;
         int var51 = var22;

         int var52;
         byte var53;
         for(var52 = method3508(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
            ++var51;
            var53 = method3516(var0);
         }

         int var46 = var25[var52 - var24[var51]];

         while(var46 != var42) {
            if(var46 != 0 && var46 != 1) {
               int var33 = var46 - 1;
               int var30;
               if(var33 < 16) {
                  var30 = var0.field2349[0];

                  for(var1 = var0.field2348[var30 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var30 + var33;
                     var0.field2348[var34] = var0.field2348[var34 - 1];
                     var0.field2348[var34 - 1] = var0.field2348[var34 - 2];
                     var0.field2348[var34 - 2] = var0.field2348[var34 - 3];
                     var0.field2348[var34 - 3] = var0.field2348[var34 - 4];
                  }

                  while(var33 > 0) {
                     var0.field2348[var30 + var33] = var0.field2348[var30 + var33 - 1];
                     --var33;
                  }

                  var0.field2348[var30] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  var30 = var0.field2349[var31] + var32;

                  for(var1 = var0.field2348[var30]; var30 > var0.field2349[var31]; --var30) {
                     var0.field2348[var30] = var0.field2348[var30 - 1];
                  }

                  ++var0.field2349[var31];

                  while(var31 > 0) {
                     --var0.field2349[var31];
                     var0.field2348[var0.field2349[var31]] = var0.field2348[var0.field2349[var31 - 1] + 16 - 1];
                     --var31;
                  }

                  --var0.field2349[0];
                  var0.field2348[var0.field2349[0]] = var1;
                  if(var0.field2349[0] == 0) {
                     var56 = 4095;

                     for(var35 = 15; var35 >= 0; --var35) {
                        for(var55 = 15; var55 >= 0; --var55) {
                           var0.field2348[var56] = var0.field2348[var0.field2349[var35] + var55];
                           --var56;
                        }

                        var0.field2349[var35] = var56 + 1;
                     }
                  }
               }

               ++var0.field2341[var0.field2342[var1 & 255] & 255];
               class160.field2007[var47] = var0.field2342[var1 & 255] & 255;
               ++var47;
               if(var45 == 0) {
                  ++var43;
                  var45 = 50;
                  var54 = var0.field2327[var43];
                  var22 = var0.field2356[var54];
                  var23 = var0.field2352[var54];
                  var25 = var0.field2355[var54];
                  var24 = var0.field2354[var54];
               }

               --var45;
               var51 = var22;

               for(var52 = method3508(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
                  ++var51;
                  var53 = method3516(var0);
               }

               var46 = var25[var52 - var24[var51]];
            } else {
               int var48 = -1;
               int var49 = 1;

               do {
                  if(var46 == 0) {
                     var48 += var49;
                  } else if(var46 == 1) {
                     var48 += var49 * 2;
                  }

                  var49 *= 2;
                  if(var45 == 0) {
                     ++var43;
                     var45 = 50;
                     var54 = var0.field2327[var43];
                     var22 = var0.field2356[var54];
                     var23 = var0.field2352[var54];
                     var25 = var0.field2355[var54];
                     var24 = var0.field2354[var54];
                  }

                  --var45;
                  var51 = var22;

                  for(var52 = method3508(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
                     ++var51;
                     var53 = method3516(var0);
                  }

                  var46 = var25[var52 - var24[var51]];
               } while(var46 == 0 || var46 == 1);

               ++var48;
               var1 = var0.field2342[var0.field2348[var0.field2349[0]] & 255];

               for(var0.field2341[var1 & 255] += var48; var48 > 0; --var48) {
                  class160.field2007[var47] = var1 & 255;
                  ++var47;
               }
            }
         }

         var0.field2334 = 0;
         var0.field2333 = 0;
         var0.field2335[0] = 0;

         for(var36 = 1; var36 <= 256; ++var36) {
            var0.field2335[var36] = var0.field2341[var36 - 1];
         }

         for(var36 = 1; var36 <= 256; ++var36) {
            var0.field2335[var36] += var0.field2335[var36 - 1];
         }

         for(var36 = 0; var36 < var47; ++var36) {
            var1 = (byte)(class160.field2007[var36] & 255);
            class160.field2007[var0.field2335[var1 & 255]] |= var36 << 8;
            ++var0.field2335[var1 & 255];
         }

         var0.field2339 = class160.field2007[var0.field2338] >> 8;
         var0.field2357 = 0;
         var0.field2339 = class160.field2007[var0.field2339];
         var0.field2337 = (byte)(var0.field2339 & 255);
         var0.field2339 >>= 8;
         ++var0.field2357;
         var0.field2330 = var47;
         method3504(var0);
         if(var0.field2330 + 1 == var0.field2357 && var0.field2334 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lfb;)B"
   )
   static byte method3506(class181 var0) {
      return (byte)method3508(8, var0);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lfb;)B"
   )
   static byte method3516(class181 var0) {
      return (byte)method3508(1, var0);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ILfb;)I"
   )
   static int method3508(int var0, class181 var1) {
      while(var1.field2336 < var0) {
         var1.field2322 = var1.field2322 << 8 | var1.field2326[var1.field2347] & 255;
         var1.field2336 += 8;
         ++var1.field2347;
         ++var1.field2328;
         if(var1.field2328 == 0) {
            ;
         }
      }

      int var3 = var1.field2322 >> var1.field2336 - var0 & (1 << var0) - 1;
      var1.field2336 -= var0;
      return var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lfb;)V"
   )
   static void method3522(class181 var0) {
      var0.field2353 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.field2345[var1]) {
            var0.field2342[var0.field2353] = (byte)var1;
            ++var0.field2353;
         }
      }

   }

   @ObfuscatedName("d")
   static void method3510(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var8 == var3[var9]) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }
}
