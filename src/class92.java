import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class92 extends Node {
   @ObfuscatedName("h")
   @Export("payload")
   static byte[] payload;
   @ObfuscatedName("x")
   @Export("position")
   static int position;
   @ObfuscatedName("j")
   @Export("bitPosition")
   static int bitPosition;
   @ObfuscatedName("a")
   @Export("blockSize0")
   static int blockSize0;
   @ObfuscatedName("l")
   @Export("blockSize1")
   static int blockSize1;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[Lca;"
   )
   @Export("codeBooks")
   static CodeBook[] codeBooks;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "[Lcl;"
   )
   @Export("floors")
   static Floor1[] floors;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "[Lcu;"
   )
   @Export("residues")
   static Residue[] residues;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "[Lda;"
   )
   @Export("mappings")
   static Mapping[] mappings;
   @ObfuscatedName("y")
   @Export("modeBlockFlags")
   static boolean[] modeBlockFlags;
   @ObfuscatedName("c")
   @Export("modeMappings")
   static int[] modeMappings;
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
      Buffer var2 = new Buffer(var1);
      this.field1273 = var2.readInt();
      this.field1302 = var2.readInt();
      this.field1272 = var2.readInt();
      this.field1292 = var2.readInt();
      if (this.field1292 < 0) {
         this.field1292 = ~this.field1292;
         this.field1274 = true;
      }

      int var3 = var2.readInt();
      this.field1280 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.readBytes(var7, 0, var5);
         this.field1280[var4] = var7;
      }

   }

   @ObfuscatedName("l")
   float[] method2125(int var1) {
      setBytes(this.field1280[var1], 0);
      getBit();
      int var2 = getInt(class11.ilog(modeMappings.length - 1));
      boolean var3 = modeBlockFlags[var2];
      int var4 = var3 ? blockSize1 : blockSize0;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = getBit() != 0;
         var6 = getBit() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (blockSize0 >> 2);
         var9 = (blockSize0 >> 2) + (var4 >> 2);
         var10 = blockSize0 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (blockSize0 >> 2);
         var12 = (blockSize0 >> 2) + (var4 - (var4 >> 2));
         var13 = blockSize0 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      Mapping var14 = mappings[modeMappings[var2]];
      int var15 = var14.mux;
      int var16 = var14.submapFloors[var15];
      boolean var17 = !floors[var16].decodedFloor();
      boolean var18 = var17;

      for(var16 = 0; var16 < var14.field1413; ++var16) {
         Residue var19 = residues[var14.field1410[var16]];
         float[] var20 = field1291;
         var19.decodeResidue(var20, var4 >> 1, var18);
      }

      int var48;
      if (!var17) {
         var16 = var14.mux;
         var48 = var14.submapFloors[var16];
         floors[var48].computeFloor(field1291, var4 >> 1);
      }

      float[] var21;
      int var22;
      int var49;
      if (var17) {
         for(var16 = var4 >> 1; var16 < var4; ++var16) {
            field1291[var16] = 0.0F;
         }
      } else {
         var16 = var4 >> 1;
         var48 = var4 >> 2;
         var49 = var4 >> 3;
         var21 = field1291;

         for(var22 = 0; var22 < var16; ++var22) {
            var21[var22] *= 0.5F;
         }

         for(var22 = var16; var22 < var4; ++var22) {
            var21[var22] = -var21[var4 - var22 - 1];
         }

         float[] var23 = var3 ? field1286 : field1283;
         float[] var24 = var3 ? field1296 : field1279;
         float[] var25 = var3 ? field1297 : field1294;
         int[] var26 = var3 ? field1299 : field1298;

         int var27;
         float var28;
         float var29;
         float var30;
         float var31;
         for(var27 = 0; var27 < var48; ++var27) {
            var28 = var21[var27 * 4] - var21[var4 - var27 * 4 - 1];
            var29 = var21[var27 * 4 + 2] - var21[var4 - var27 * 4 - 3];
            var30 = var23[var27 * 2];
            var31 = var23[var27 * 2 + 1];
            var21[var4 - var27 * 4 - 1] = var28 * var30 - var29 * var31;
            var21[var4 - var27 * 4 - 3] = var28 * var31 + var29 * var30;
         }

         float var32;
         float var33;
         for(var27 = 0; var27 < var49; ++var27) {
            var28 = var21[var16 + var27 * 4 + 3];
            var29 = var21[var16 + var27 * 4 + 1];
            var30 = var21[var27 * 4 + 3];
            var31 = var21[var27 * 4 + 1];
            var21[var16 + var27 * 4 + 3] = var28 + var30;
            var21[var16 + var27 * 4 + 1] = var29 + var31;
            var32 = var23[var16 - 4 - var27 * 4];
            var33 = var23[var16 - 3 - var27 * 4];
            var21[var27 * 4 + 3] = (var28 - var30) * var32 - (var29 - var31) * var33;
            var21[var27 * 4 + 1] = (var29 - var31) * var32 + (var28 - var30) * var33;
         }

         var27 = class11.ilog(var4 - 1);

         int var34;
         int var35;
         int var36;
         int var37;
         for(var34 = 0; var34 < var27 - 3; ++var34) {
            var35 = var4 >> var34 + 2;
            var36 = 8 << var34;

            for(var37 = 0; var37 < 2 << var34; ++var37) {
               int var38 = var4 - var35 * var37 * 2;
               int var39 = var4 - var35 * (var37 * 2 + 1);

               for(int var40 = 0; var40 < var4 >> var34 + 4; ++var40) {
                  int var41 = var40 * 4;
                  float var42 = var21[var38 - 1 - var41];
                  float var43 = var21[var38 - 3 - var41];
                  float var44 = var21[var39 - 1 - var41];
                  float var45 = var21[var39 - 3 - var41];
                  var21[var38 - 1 - var41] = var42 + var44;
                  var21[var38 - 3 - var41] = var43 + var45;
                  float var46 = var23[var40 * var36];
                  float var47 = var23[var40 * var36 + 1];
                  var21[var39 - 1 - var41] = (var42 - var44) * var46 - (var43 - var45) * var47;
                  var21[var39 - 3 - var41] = (var43 - var45) * var46 + (var42 - var44) * var47;
               }
            }
         }

         for(var34 = 1; var34 < var49 - 1; ++var34) {
            var35 = var26[var34];
            if (var34 < var35) {
               var36 = var34 * 8;
               var37 = var35 * 8;
               var32 = var21[var36 + 1];
               var21[var36 + 1] = var21[var37 + 1];
               var21[var37 + 1] = var32;
               var32 = var21[var36 + 3];
               var21[var36 + 3] = var21[var37 + 3];
               var21[var37 + 3] = var32;
               var32 = var21[var36 + 5];
               var21[var36 + 5] = var21[var37 + 5];
               var21[var37 + 5] = var32;
               var32 = var21[var36 + 7];
               var21[var36 + 7] = var21[var37 + 7];
               var21[var37 + 7] = var32;
            }
         }

         for(var34 = 0; var34 < var16; ++var34) {
            var21[var34] = var21[var34 * 2 + 1];
         }

         for(var34 = 0; var34 < var49; ++var34) {
            var21[var4 - 1 - var34 * 2] = var21[var34 * 4];
            var21[var4 - 2 - var34 * 2] = var21[var34 * 4 + 1];
            var21[var4 - var48 - 1 - var34 * 2] = var21[var34 * 4 + 2];
            var21[var4 - var48 - 2 - var34 * 2] = var21[var34 * 4 + 3];
         }

         for(var34 = 0; var34 < var49; ++var34) {
            var29 = var25[var34 * 2];
            var30 = var25[var34 * 2 + 1];
            var31 = var21[var16 + var34 * 2];
            var32 = var21[var16 + var34 * 2 + 1];
            var33 = var21[var4 - 2 - var34 * 2];
            float var51 = var21[var4 - 1 - var34 * 2];
            float var52 = var30 * (var31 - var33) + var29 * (var32 + var51);
            var21[var16 + var34 * 2] = (var31 + var33 + var52) * 0.5F;
            var21[var4 - 2 - var34 * 2] = (var31 + var33 - var52) * 0.5F;
            var52 = var30 * (var32 + var51) - var29 * (var31 - var33);
            var21[var16 + var34 * 2 + 1] = (var32 - var51 + var52) * 0.5F;
            var21[var4 - 1 - var34 * 2] = (-var32 + var51 + var52) * 0.5F;
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var34] = var21[var16 + var34 * 2] * var24[var34 * 2] + var21[var16 + var34 * 2 + 1] * var24[var34 * 2 + 1];
            var21[var16 - 1 - var34] = var21[var16 + var34 * 2] * var24[var34 * 2 + 1] - var21[var16 + var34 * 2 + 1] * var24[var34 * 2];
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var34 + (var4 - var48)] = -var21[var34];
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var34] = var21[var48 + var34];
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var48 + var34] = -var21[var48 - var34 - 1];
         }

         for(var34 = 0; var34 < var48; ++var34) {
            var21[var16 + var34] = var21[var4 - var34 - 1];
         }

         for(var34 = var8; var34 < var9; ++var34) {
            var29 = (float)Math.sin(((double)(var34 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field1291[var34] *= (float)Math.sin(1.5707963267948966D * (double)var29 * (double)var29);
         }

         for(var34 = var11; var34 < var12; ++var34) {
            var29 = (float)Math.sin(((double)(var34 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field1291[var34] *= (float)Math.sin(1.5707963267948966D * (double)var29 * (double)var29);
         }
      }

      var21 = null;
      if (this.field1288 > 0) {
         var48 = var4 + this.field1288 >> 2;
         var21 = new float[var48];
         if (!this.field1290) {
            for(var49 = 0; var49 < this.field1289; ++var49) {
               var22 = var49 + (this.field1288 >> 1);
               var21[var49] += this.field1287[var22];
            }
         }

         if (!var17) {
            for(var49 = var8; var49 < var4 >> 1; ++var49) {
               var22 = var21.length - (var4 >> 1) + var49;
               var21[var22] += field1291[var49];
            }
         }
      }

      float[] var50 = this.field1287;
      this.field1287 = field1291;
      field1291 = var50;
      this.field1288 = var4;
      this.field1289 = var12 - (var4 >> 1);
      this.field1290 = var17;
      return var21;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "([I)Lcg;"
   )
   RawAudioNode method2128(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field1300 == null) {
            this.field1288 = 0;
            this.field1287 = new float[blockSize1];
            this.field1300 = new byte[this.field1302];
            this.field1295 = 0;
            this.field1271 = 0;
         }

         for(; this.field1271 < this.field1280.length; ++this.field1271) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method2125(this.field1271);
            if (var2 != null) {
               int var3 = this.field1295;
               int var4 = var2.length;
               if (var4 > this.field1302 - var3) {
                  var4 = this.field1302 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field1300[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field1295;
               }

               this.field1295 = var3;
            }
         }

         this.field1287 = null;
         byte[] var7 = this.field1300;
         this.field1300 = null;
         return new RawAudioNode(this.field1273, var7, this.field1272, this.field1292, this.field1274);
      }
   }

   @ObfuscatedName("w")
   @Export("float32Unpack")
   static float float32Unpack(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @ObfuscatedName("m")
   @Export("setBytes")
   static void setBytes(byte[] var0, int var1) {
      payload = var0;
      position = var1;
      bitPosition = 0;
   }

   @ObfuscatedName("q")
   @Export("getBit")
   static int getBit() {
      int var0 = payload[position] >> bitPosition & 1;
      ++bitPosition;
      position += bitPosition >> 3;
      bitPosition &= 7;
      return var0;
   }

   @ObfuscatedName("x")
   @Export("getInt")
   static int getInt(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - bitPosition; var0 -= var3) {
         var3 = 8 - bitPosition;
         int var4 = (1 << var3) - 1;
         var1 += (payload[position] >> bitPosition & var4) << var2;
         bitPosition = 0;
         ++position;
         var2 += var3;
      }

      if (var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (payload[position] >> bitPosition & var3) << var2;
         bitPosition += var0;
      }

      return var1;
   }

   @ObfuscatedName("a")
   static void method2129(byte[] var0) {
      setBytes(var0, 0);
      blockSize0 = 1 << getInt(4);
      blockSize1 = 1 << getInt(4);
      field1291 = new float[blockSize1];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0 ? blockSize1 : blockSize0;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
            var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
         }

         float[] var13 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var13[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
            var13[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
         }

         float[] var14 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var14[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
            var14[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var15 = new int[var5];
         int var10 = class11.ilog(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            var15[var11] = MapIconReference.method690(var11, var10);
         }

         if (var1 != 0) {
            field1286 = var6;
            field1296 = var13;
            field1297 = var14;
            field1299 = var15;
         } else {
            field1283 = var6;
            field1279 = var13;
            field1294 = var14;
            field1298 = var15;
         }
      }

      var1 = getInt(8) + 1;
      codeBooks = new CodeBook[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         codeBooks[var2] = new CodeBook();
      }

      var2 = getInt(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         getInt(16);
      }

      var2 = getInt(6) + 1;
      floors = new Floor1[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         floors[var3] = new Floor1();
      }

      var3 = getInt(6) + 1;
      residues = new Residue[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         residues[var4] = new Residue();
      }

      var4 = getInt(6) + 1;
      mappings = new Mapping[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         mappings[var5] = new Mapping();
      }

      var5 = getInt(6) + 1;
      modeBlockFlags = new boolean[var5];
      modeMappings = new int[var5];

      for(int var12 = 0; var12 < var5; ++var12) {
         modeBlockFlags[var12] = getBit() != 0;
         getInt(16);
         getInt(16);
         modeMappings[var12] = getInt(8);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Liv;)Z"
   )
   static boolean method2132(IndexDataBase var0) {
      if (!field1284) {
         byte[] var1 = var0.getConfigData(0, 0);
         if (var1 == null) {
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
   @Export("getInstrument")
   static class92 getInstrument(IndexDataBase var0, int var1, int var2) {
      if (!method2132(var0)) {
         var0.tryLoadRecord(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.getConfigData(var1, var2);
         return var3 == null ? null : new class92(var3);
      }
   }
}
