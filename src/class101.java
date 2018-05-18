import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cu")
public class class101 {

   @ObfuscatedName("w")
   int field1367 = class92.method2141(16);
   @ObfuscatedName("m")
   int field1365 = class92.method2141(24);
   @ObfuscatedName("q")
   int field1366 = class92.method2141(24);
   @ObfuscatedName("b")
   int field1368 = class92.method2141(24) + 1;
   @ObfuscatedName("f")
   int field1369 = class92.method2141(6) + 1;
   @ObfuscatedName("n")
   int field1370 = class92.method2141(8);
   @ObfuscatedName("h")
   int[] field1371;


   class101() {
      int[] var1 = new int[this.field1369];

      int var2;
      for(var2 = 0; var2 < this.field1369; ++var2) {
         int var3 = 0;
         int var4 = class92.method2141(3);
         boolean var5 = class92.method2121() != 0;
         if(var5) {
            var3 = class92.method2141(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field1371 = new int[this.field1369 * 8];

      for(var2 = 0; var2 < this.field1369 * 8; ++var2) {
         this.field1371[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0?class92.method2141(8):-1;
      }

   }

   @ObfuscatedName("w")
   void method2301(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = class92.field1270[this.field1370].field1260;
         int var5 = this.field1366 - this.field1365;
         int var6 = var5 / this.field1368;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = class92.field1270[this.field1370].method2100();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field1369;
                     }

                     var10 /= this.field1369;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field1371[var8 + var11 * 8];
                  if(var12 >= 0) {
                     int var13 = var9 * this.field1368 + this.field1365;
                     class90 var14 = class92.field1270[var12];
                     int var15;
                     if(this.field1367 == 0) {
                        var15 = this.field1368 / var14.field1260;

                        for(int var16 = 0; var16 < var15; ++var16) {
                           float[] var17 = var14.method2098();

                           for(int var18 = 0; var18 < var14.field1260; ++var18) {
                              var1[var13 + var16 + var18 * var15] += var17[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field1368) {
                           float[] var19 = var14.method2098();

                           for(int var20 = 0; var20 < var14.field1260; ++var20) {
                              var1[var13 + var15] += var19[var20];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if(var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
