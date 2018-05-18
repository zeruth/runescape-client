import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class260 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field3309;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field3320;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1926473263
   )
   public static int field3319;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static class200 field3312 = new class200(64);
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1101377565
   )
   public int field3313 = -1;
   @ObfuscatedName("n")
   int[] field3314;
   @ObfuscatedName("h")
   short[] field3315;
   @ObfuscatedName("x")
   short[] field3316;
   @ObfuscatedName("j")
   short[] field3317;
   @ObfuscatedName("a")
   short[] field3318;
   @ObfuscatedName("l")
   int[] field3310 = new int[]{-1, -1, -1, -1, -1};
   @ObfuscatedName("d")
   public boolean field3311 = false;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-501263376"
   )
   void method4896(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4897(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "243111015"
   )
   void method4897(class182 var1, int var2) {
      if(var2 == 1) {
         this.field3313 = var1.method3742();
      } else {
         int var3;
         int var4;
         if(var2 == 2) {
            var3 = var1.method3742();
            this.field3314 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3314[var4] = var1.method3574();
            }
         } else if(var2 == 3) {
            this.field3311 = true;
         } else if(var2 == 40) {
            var3 = var1.method3742();
            this.field3315 = new short[var3];
            this.field3316 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3315[var4] = (short)var1.method3574();
               this.field3316[var4] = (short)var1.method3574();
            }
         } else if(var2 == 41) {
            var3 = var1.method3742();
            this.field3317 = new short[var3];
            this.field3318 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3317[var4] = (short)var1.method3574();
               this.field3318[var4] = (short)var1.method3574();
            }
         } else if(var2 >= 60 && var2 < 70) {
            this.field3310[var2 - 60] = var1.method3574();
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "256"
   )
   public boolean method4898() {
      if(this.field3314 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field3314.length; ++var2) {
            if(!field3320.method4708(this.field3314[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(S)Ldo;",
      garbageValue = "128"
   )
   public class113 method4914() {
      if(this.field3314 == null) {
         return null;
      } else {
         class113[] var1 = new class113[this.field3314.length];

         for(int var2 = 0; var2 < this.field3314.length; ++var2) {
            var1[var2] = class113.method2619(field3320, this.field3314[var2], 0);
         }

         class113 var4;
         if(var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new class113(var1, var1.length);
         }

         int var3;
         if(this.field3315 != null) {
            for(var3 = 0; var3 < this.field3315.length; ++var3) {
               var4.method2689(this.field3315[var3], this.field3316[var3]);
            }
         }

         if(this.field3317 != null) {
            for(var3 = 0; var3 < this.field3317.length; ++var3) {
               var4.method2632(this.field3317[var3], this.field3318[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1530903671"
   )
   public boolean method4906() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(this.field3310[var2] != -1 && !field3320.method4708(this.field3310[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Ldo;",
      garbageValue = "-1279486319"
   )
   public class113 method4901() {
      class113[] var1 = new class113[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.field3310[var3] != -1) {
            var1[var2++] = class113.method2619(field3320, this.field3310[var3], 0);
         }
      }

      class113 var5 = new class113(var1, var2);
      int var4;
      if(this.field3315 != null) {
         for(var4 = 0; var4 < this.field3315.length; ++var4) {
            var5.method2689(this.field3315[var4], this.field3316[var4]);
         }
      }

      if(this.field3317 != null) {
         for(var4 = 0; var4 < this.field3317.length; ++var4) {
            var5.method2632(this.field3317[var4], this.field3318[var4]);
         }
      }

      return var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;ZB)V",
      garbageValue = "2"
   )
   public static void method4924(class247 var0, class247 var1, boolean var2) {
      class268.field3395 = var0;
      class9.field63 = var1;
      class268.field3432 = var2;
   }
}
