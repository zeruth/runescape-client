import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class116 extends class204 {

   @ObfuscatedName("g")
   static int[] field1572;
   @ObfuscatedName("f")
   int field1563;
   @ObfuscatedName("n")
   boolean field1559;
   @ObfuscatedName("h")
   int[] field1569;
   @ObfuscatedName("x")
   int[] field1565;
   @ObfuscatedName("j")
   int[] field1566;
   @ObfuscatedName("a")
   int[] field1567;
   @ObfuscatedName("l")
   int field1568;
   @ObfuscatedName("d")
   int field1571;
   @ObfuscatedName("s")
   int[] field1570;
   @ObfuscatedName("p")
   boolean field1562 = false;


   @ObfuscatedSignature(
      signature = "(Lgy;)V"
   )
   class116(class182 var1) {
      this.field1563 = var1.method3574();
      this.field1559 = var1.method3742() == 1;
      int var2 = var1.method3742();
      if(var2 >= 1 && var2 <= 4) {
         this.field1569 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field1569[var3] = var1.method3574();
         }

         if(var2 > 1) {
            this.field1565 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1565[var3] = var1.method3742();
            }
         }

         if(var2 > 1) {
            this.field1566 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field1566[var3] = var1.method3742();
            }
         }

         this.field1567 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field1567[var3] = var1.method3573();
         }

         this.field1568 = var1.method3742();
         this.field1571 = var1.method3742();
         this.field1570 = null;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(DILiv;)Z"
   )
   boolean method2706(double var1, int var3, class247 var4) {
      int var5;
      for(var5 = 0; var5 < this.field1569.length; ++var5) {
         if(var4.method4640(this.field1569[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field1570 = new int[var5];

      for(int var6 = 0; var6 < this.field1569.length; ++var6) {
         class317 var7 = class273.method5215(var4, this.field1569[var6]);
         var7.method5862();
         byte[] var8 = var7.field3785;
         int[] var9 = var7.field3788;
         int var10 = this.field1567[var6];
         if((var10 & -16777216) == 16777216) {
            ;
         }

         if((var10 & -16777216) == 33554432) {
            ;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if(var14 >> 8 == (var14 & '\uffff')) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = class122.method2825(var9[var11], var1);
         }

         if(var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field1565[var6 - 1];
         }

         if(var11 == 0) {
            if(var3 == var7.field3786) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field1570[var12] = var9[var8[var12] & 255];
               }
            } else if(var7.field3786 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field1570[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
                  }
               }
            } else {
               if(var7.field3786 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field1570[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if(var11 == 1) {
            ;
         }

         if(var11 == 2) {
            ;
         }

         if(var11 == 3) {
            ;
         }
      }

      return true;
   }

   @ObfuscatedName("m")
   void method2707() {
      this.field1570 = null;
   }

   @ObfuscatedName("q")
   void method2705(int var1) {
      if(this.field1570 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if(this.field1568 == 1 || this.field1568 == 3) {
            if(field1572 == null || field1572.length < this.field1570.length) {
               field1572 = new int[this.field1570.length];
            }

            if(this.field1570.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1570.length;
            var4 = var2 * this.field1571 * var1;
            var5 = var3 - 1;
            if(this.field1568 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field1572[var6] = this.field1570[var7];
            }

            var10 = this.field1570;
            this.field1570 = field1572;
            field1572 = var10;
         }

         if(this.field1568 == 2 || this.field1568 == 4) {
            if(field1572 == null || field1572.length < this.field1570.length) {
               field1572 = new int[this.field1570.length];
            }

            if(this.field1570.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1570.length;
            var4 = this.field1571 * var1;
            var5 = var2 - 1;
            if(this.field1568 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field1572[var8] = this.field1570[var9];
               }
            }

            var10 = this.field1570;
            this.field1570 = field1572;
            field1572 = var10;
         }

      }
   }
}
