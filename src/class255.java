import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class255 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3256;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Lin;"
   )
   public static class255[] field3274;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -218417121
   )
   public static int field3257;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static class200 field3258 = new class200(256);
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1984544485
   )
   public final int field3261;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1491820591
   )
   public int field3260 = -1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1173914367
   )
   int field3259 = -1;
   @ObfuscatedName("x")
   public String field3262;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1101846903
   )
   public int field3263;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2031329049
   )
   public int field3276 = 0;
   @ObfuscatedName("d")
   public String[] field3266 = new String[5];
   @ObfuscatedName("s")
   public String field3270;
   @ObfuscatedName("p")
   int[] field3255;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 343486843
   )
   int field3269 = Integer.MAX_VALUE;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1058425241
   )
   int field3268 = Integer.MAX_VALUE;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1022428681
   )
   int field3271 = Integer.MIN_VALUE;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -103142247
   )
   int field3272 = Integer.MIN_VALUE;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lja;"
   )
   public class270 field3273;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   public class252 field3267;
   @ObfuscatedName("i")
   int[] field3275;
   @ObfuscatedName("z")
   byte[] field3264;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1673978829
   )
   public int field3277;


   public class255(int var1) {
      this.field3273 = class270.field3495;
      this.field3267 = class252.field3241;
      this.field3277 = -1;
      this.field3261 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;B)V",
      garbageValue = "81"
   )
   public void method4826(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4832(var1, var2);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-2040143632"
   )
   void method4832(class182 var1, int var2) {
      if(var2 == 1) {
         this.field3260 = var1.method3585();
      } else if(var2 == 2) {
         this.field3259 = var1.method3585();
      } else if(var2 == 3) {
         this.field3262 = var1.method3577();
      } else if(var2 == 4) {
         this.field3263 = var1.method3572();
      } else if(var2 == 5) {
         var1.method3572();
      } else if(var2 == 6) {
         this.field3276 = var1.method3742();
      } else {
         int var3;
         if(var2 == 7) {
            var3 = var1.method3742();
            if((var3 & 1) == 0) {
               ;
            }

            if((var3 & 2) == 2) {
               ;
            }
         } else if(var2 == 8) {
            var1.method3742();
         } else if(var2 >= 10 && var2 <= 14) {
            this.field3266[var2 - 10] = var1.method3577();
         } else if(var2 == 15) {
            var3 = var1.method3742();
            this.field3255 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field3255[var4] = var1.method3804();
            }

            var1.method3573();
            var4 = var1.method3742();
            this.field3275 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field3275.length; ++var5) {
               this.field3275[var5] = var1.method3573();
            }

            this.field3264 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field3264[var5] = var1.method3569();
            }
         } else if(var2 != 16) {
            if(var2 == 17) {
               this.field3270 = var1.method3577();
            } else if(var2 == 18) {
               var1.method3585();
            } else if(var2 == 19) {
               this.field3277 = var1.method3574();
            } else if(var2 == 21) {
               var1.method3573();
            } else if(var2 == 22) {
               var1.method3573();
            } else if(var2 == 23) {
               var1.method3742();
               var1.method3742();
               var1.method3742();
            } else if(var2 == 24) {
               var1.method3804();
               var1.method3804();
            } else if(var2 == 25) {
               var1.method3585();
            } else if(var2 == 28) {
               var1.method3742();
            } else if(var2 == 29) {
               this.field3273 = (class270)class7.method89(class240.method4602(), var1.method3742());
            } else if(var2 == 30) {
               class252[] var6 = new class252[]{class252.field3243, class252.field3241, class252.field3242};
               this.field3267 = (class252)class7.method89(var6, var1.method3742());
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2043410865"
   )
   public void method4827() {
      if(this.field3255 != null) {
         for(int var1 = 0; var1 < this.field3255.length; var1 += 2) {
            if(this.field3255[var1] < this.field3269) {
               this.field3269 = this.field3255[var1];
            } else if(this.field3255[var1] > this.field3271) {
               this.field3271 = this.field3255[var1];
            }

            if(this.field3255[var1 + 1] < this.field3268) {
               this.field3268 = this.field3255[var1 + 1];
            } else if(this.field3255[var1 + 1] > this.field3272) {
               this.field3272 = this.field3255[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZI)Llc;",
      garbageValue = "1484942310"
   )
   public class318 method4829(boolean var1) {
      int var2 = this.field3260;
      return this.method4830(var2);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IB)Llc;",
      garbageValue = "100"
   )
   class318 method4830(int var1) {
      if(var1 < 0) {
         return null;
      } else {
         class318 var2 = (class318)field3258.method4023((long)var1);
         if(var2 != null) {
            return var2;
         } else {
            var2 = class86.method2017(field3256, var1, 0);
            if(var2 != null) {
               field3258.method4028(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-534969127"
   )
   public int method4831() {
      return this.field3261;
   }
}
