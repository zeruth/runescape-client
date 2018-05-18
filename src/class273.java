import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class273 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3548;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3549;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3550;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3551 = new class200(64);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3558 = new class200(100);
   @ObfuscatedName("n")
   public int[] field3553;
   @ObfuscatedName("h")
   int[] field3554;
   @ObfuscatedName("x")
   public int[] field3562;
   @ObfuscatedName("j")
   public int[] field3556;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1432697333
   )
   public int field3557 = -1;
   @ObfuscatedName("l")
   int[] field3565;
   @ObfuscatedName("d")
   public boolean field3559 = false;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1179183481
   )
   public int field3560 = 5;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1245201533
   )
   public int field3561 = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 78204383
   )
   public int field3555 = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1489530045
   )
   public int field3552 = 99;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -158478119
   )
   public int field3564 = -1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1261603831
   )
   public int field3563 = -1;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 2009554759
   )
   public int field3566 = 2;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "1587618407"
   )
   void method5227(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method5217(var1, var2);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-1281363822"
   )
   void method5217(class182 var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.method3574();
         this.field3562 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3562[var4] = var1.method3574();
         }

         this.field3553 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3553[var4] = var1.method3574();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3553[var4] += var1.method3574() << 16;
         }
      } else if(var2 == 2) {
         this.field3557 = var1.method3574();
      } else if(var2 == 3) {
         var3 = var1.method3742();
         this.field3565 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3565[var4] = var1.method3742();
         }

         this.field3565[var3] = 9999999;
      } else if(var2 == 4) {
         this.field3559 = true;
      } else if(var2 == 5) {
         this.field3560 = var1.method3742();
      } else if(var2 == 6) {
         this.field3561 = var1.method3574();
      } else if(var2 == 7) {
         this.field3555 = var1.method3574();
      } else if(var2 == 8) {
         this.field3552 = var1.method3742();
      } else if(var2 == 9) {
         this.field3564 = var1.method3742();
      } else if(var2 == 10) {
         this.field3563 = var1.method3742();
      } else if(var2 == 11) {
         this.field3566 = var1.method3742();
      } else if(var2 == 12) {
         var3 = var1.method3742();
         this.field3554 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3554[var4] = var1.method3574();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3554[var4] += var1.method3574() << 16;
         }
      } else if(var2 == 13) {
         var3 = var1.method3742();
         this.field3556 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3556[var4] = var1.method3572();
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "376562190"
   )
   void method5218() {
      if(this.field3564 == -1) {
         if(this.field3565 != null) {
            this.field3564 = 2;
         } else {
            this.field3564 = 0;
         }
      }

      if(this.field3563 == -1) {
         if(this.field3565 != null) {
            this.field3563 = 2;
         } else {
            this.field3563 = 0;
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Ldk;II)Ldk;",
      garbageValue = "363237978"
   )
   public class119 method5219(class119 var1, int var2) {
      var2 = this.field3553[var2];
      class130 var3 = class309.method5722(var2 >> 16);
      var2 &= '\uffff';
      if(var3 == null) {
         return var1.method2729(true);
      } else {
         class119 var4 = var1.method2729(!var3.method3085(var2));
         var4.method2783(var3, var2);
         return var4;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ldk;III)Ldk;",
      garbageValue = "28823444"
   )
   class119 method5220(class119 var1, int var2, int var3) {
      var2 = this.field3553[var2];
      class130 var4 = class309.method5722(var2 >> 16);
      var2 &= '\uffff';
      if(var4 == null) {
         return var1.method2729(true);
      } else {
         class119 var5 = var1.method2729(!var4.method3085(var2));
         var3 &= 3;
         if(var3 == 1) {
            var5.method2734();
         } else if(var3 == 2) {
            var5.method2770();
         } else if(var3 == 3) {
            var5.method2732();
         }

         var5.method2783(var4, var2);
         if(var3 == 1) {
            var5.method2732();
         } else if(var3 == 2) {
            var5.method2770();
         } else if(var3 == 3) {
            var5.method2734();
         }

         return var5;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ldk;II)Ldk;",
      garbageValue = "963524727"
   )
   class119 method5223(class119 var1, int var2) {
      var2 = this.field3553[var2];
      class130 var3 = class309.method5722(var2 >> 16);
      var2 &= '\uffff';
      if(var3 == null) {
         return var1.method2722(true);
      } else {
         class119 var4 = var1.method2722(!var3.method3085(var2));
         var4.method2783(var3, var2);
         return var4;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Ldk;ILjh;II)Ldk;",
      garbageValue = "-1304609036"
   )
   public class119 method5222(class119 var1, int var2, class273 var3, int var4) {
      var2 = this.field3553[var2];
      class130 var5 = class309.method5722(var2 >> 16);
      var2 &= '\uffff';
      if(var5 == null) {
         return var3.method5219(var1, var4);
      } else {
         var4 = var3.field3553[var4];
         class130 var6 = class309.method5722(var4 >> 16);
         var4 &= '\uffff';
         class119 var7;
         if(var6 == null) {
            var7 = var1.method2729(!var5.method3085(var2));
            var7.method2783(var5, var2);
            return var7;
         } else {
            var7 = var1.method2729(!var5.method3085(var2) & !var6.method3085(var4));
            var7.method2777(var5, var2, var6, var4, this.field3565);
            return var7;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ldk;II)Ldk;",
      garbageValue = "-1957089369"
   )
   public class119 method5235(class119 var1, int var2) {
      int var3 = this.field3553[var2];
      class130 var4 = class309.method5722(var3 >> 16);
      var3 &= '\uffff';
      if(var4 == null) {
         return var1.method2729(true);
      } else {
         class130 var5 = null;
         int var6 = 0;
         if(this.field3554 != null && var2 < this.field3554.length) {
            var6 = this.field3554[var2];
            var5 = class309.method5722(var6 >> 16);
            var6 &= '\uffff';
         }

         class119 var7;
         if(var5 != null && var6 != '\uffff') {
            var7 = var1.method2729(!var4.method3085(var3) & !var5.method3085(var6));
            var7.method2783(var4, var3);
            var7.method2783(var5, var6);
            return var7;
         } else {
            var7 = var1.method2729(!var4.method3085(var3));
            var7.method2783(var4, var3);
            return var7;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Liv;IB)Llh;",
      garbageValue = "100"
   )
   public static class317 method5215(class247 var0, int var1) {
      byte[] var3 = var0.method4718(var1);
      boolean var2;
      if(var3 == null) {
         var2 = false;
      } else {
         class171.method3471(var3);
         var2 = true;
      }

      return !var2?null:class224.method4461();
   }
}
