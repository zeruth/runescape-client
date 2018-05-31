import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ca")
@Implements("CodeBook")
public class CodeBook {
   @ObfuscatedName("w")
   @Export("dimensions")
   int dimensions;
   @ObfuscatedName("m")
   @Export("entries")
   int entries;
   @ObfuscatedName("q")
   @Export("entryLengths")
   int[] entryLengths;
   @ObfuscatedName("b")
   int[] field1262;
   @ObfuscatedName("f")
   @Export("valueVector")
   float[][] valueVector;
   @ObfuscatedName("n")
   int[] field1264;

   CodeBook() {
      class92.getInt(24);
      this.dimensions = class92.getInt(16);
      this.entries = class92.getInt(24);
      this.entryLengths = new int[this.entries];
      boolean var1 = class92.getBit() != 0;
      int var2;
      int var3;
      int var4;
      if (var1) {
         var2 = 0;

         for(var3 = class92.getInt(5) + 1; var2 < this.entries; ++var3) {
            int var5 = class92.getInt(class11.ilog(this.entries - var2));

            for(var4 = 0; var4 < var5; ++var4) {
               this.entryLengths[var2++] = var3;
            }
         }
      } else {
         boolean var15 = class92.getBit() != 0;

         for(var3 = 0; var3 < this.entries; ++var3) {
            if (var15 && class92.getBit() == 0) {
               this.entryLengths[var3] = 0;
            } else {
               this.entryLengths[var3] = class92.getInt(5) + 1;
            }
         }
      }

      this.createHuffmanTree();
      var2 = class92.getInt(4);
      if (var2 > 0) {
         float var16 = class92.float32Unpack(class92.getInt(32));
         float var6 = class92.float32Unpack(class92.getInt(32));
         var4 = class92.getInt(4) + 1;
         boolean var7 = class92.getBit() != 0;
         int var8;
         if (var2 == 1) {
            var8 = method2103(this.entries, this.dimensions);
         } else {
            var8 = this.entries * this.dimensions;
         }

         this.field1262 = new int[var8];

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            this.field1262[var9] = class92.getInt(var4);
         }

         this.valueVector = new float[this.entries][this.dimensions];
         float var10;
         int var11;
         int var12;
         if (var2 == 1) {
            for(var9 = 0; var9 < this.entries; ++var9) {
               var10 = 0.0F;
               var11 = 1;

               for(var12 = 0; var12 < this.dimensions; ++var12) {
                  int var13 = var9 / var11 % var8;
                  float var14 = (float)this.field1262[var13] * var6 + var16 + var10;
                  this.valueVector[var9][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for(var9 = 0; var9 < this.entries; ++var9) {
               var10 = 0.0F;
               var11 = var9 * this.dimensions;

               for(var12 = 0; var12 < this.dimensions; ++var12) {
                  float var17 = (float)this.field1262[var11] * var6 + var16 + var10;
                  this.valueVector[var9][var12] = var17;
                  if (var7) {
                     var10 = var17;
                  }

                  ++var11;
               }
            }
         }
      }

   }

   @ObfuscatedName("m")
   @Export("createHuffmanTree")
   void createHuffmanTree() {
      int[] var1 = new int[this.entries];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var3 = 0; var3 < this.entries; ++var3) {
         var4 = this.entryLengths[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var10 = var2[var8];
                  if (var10 != var6) {
                     break;
                  }

                  var9 = 1 << 32 - var8;
                  if ((var10 & var9) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var10 | var9;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var10 = var2[var8];
               if (var10 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field1264 = new int[8];
      var10 = 0;

      for(var3 = 0; var3 < this.entries; ++var3) {
         var4 = this.entryLengths[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.field1264[var6] == 0) {
                     this.field1264[var6] = var10;
                  }

                  var6 = this.field1264[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.field1264.length) {
                  int[] var11 = new int[this.field1264.length * 2];

                  for(var9 = 0; var9 < this.field1264.length; ++var9) {
                     var11[var9] = this.field1264[var9];
                  }

                  this.field1264 = var11;
               }

               var8 >>>= 1;
            }

            this.field1264[var6] = ~var3;
            if (var6 >= var10) {
               var10 = var6 + 1;
            }
         }
      }

   }

   @ObfuscatedName("q")
   @Export("getHuffmanRoot")
   int getHuffmanRoot() {
      int var1;
      for(var1 = 0; this.field1264[var1] >= 0; var1 = class92.getBit() != 0 ? this.field1264[var1] : var1 + 1) {
         ;
      }

      return ~this.field1264[var1];
   }

   @ObfuscatedName("x")
   float[] method2098() {
      return this.valueVector[this.getHuffmanRoot()];
   }

   @ObfuscatedName("w")
   static int method2103(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var3 = var2;
         int var4 = var1;

         int var5;
         for(var5 = 1; var4 > 1; var4 >>= 1) {
            if ((var4 & 1) != 0) {
               var5 *= var3;
            }

            var3 *= var3;
         }

         int var6;
         if (var4 == 1) {
            var6 = var5 * var3;
         } else {
            var6 = var5;
         }

         if (var6 <= var0) {
            return var2;
         }

         --var2;
      }
   }
}
