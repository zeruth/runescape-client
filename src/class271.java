import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class271 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3532;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3522;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3501 = new class200(64);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3502 = new class200(50);
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -168395161
   )
   public int field3503;
   @ObfuscatedName("n")
   public String field3504 = "null";
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 106071213
   )
   public int field3519 = 1;
   @ObfuscatedName("x")
   int[] field3500;
   @ObfuscatedName("j")
   int[] field3507;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -864701749
   )
   public int field3517 = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 116335143
   )
   public int field3509 = -1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -359593807
   )
   public int field3499 = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1295753849
   )
   public int field3511 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -562700529
   )
   public int field3512 = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1082594129
   )
   public int field3518 = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -611649737
   )
   public int field3514 = -1;
   @ObfuscatedName("c")
   short[] field3515;
   @ObfuscatedName("e")
   short[] field3516;
   @ObfuscatedName("t")
   short[] field3508;
   @ObfuscatedName("u")
   short[] field3510;
   @ObfuscatedName("i")
   public String[] field3506 = new String[5];
   @ObfuscatedName("z")
   public boolean field3520 = true;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 108735845
   )
   public int field3521 = -1;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 2066846285
   )
   int field3505 = 128;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1631856349
   )
   int field3523 = 128;
   @ObfuscatedName("o")
   public boolean field3524 = false;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 97689843
   )
   int field3525 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1705110531
   )
   int field3526 = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1324227797
   )
   public int field3527 = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -204190151
   )
   public int field3528 = 32;
   @ObfuscatedName("ay")
   public int[] field3529;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 132919095
   )
   int field3530 = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 517239649
   )
   int field3531 = -1;
   @ObfuscatedName("aw")
   public boolean field3535 = true;
   @ObfuscatedName("ag")
   public boolean field3533 = true;
   @ObfuscatedName("ah")
   public boolean field3534 = false;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   class197 field3513;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "500"
   )
   void method5190() {}

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-9980013"
   )
   void method5169(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method5170(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-2118823050"
   )
   void method5170(class182 var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.method3742();
         this.field3500 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3500[var4] = var1.method3574();
         }
      } else if(var2 == 2) {
         this.field3504 = var1.method3577();
      } else if(var2 == 12) {
         this.field3519 = var1.method3742();
      } else if(var2 == 13) {
         this.field3517 = var1.method3574();
      } else if(var2 == 14) {
         this.field3511 = var1.method3574();
      } else if(var2 == 15) {
         this.field3509 = var1.method3574();
      } else if(var2 == 16) {
         this.field3499 = var1.method3574();
      } else if(var2 == 17) {
         this.field3511 = var1.method3574();
         this.field3512 = var1.method3574();
         this.field3518 = var1.method3574();
         this.field3514 = var1.method3574();
      } else if(var2 >= 30 && var2 < 35) {
         this.field3506[var2 - 30] = var1.method3577();
         if(this.field3506[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3506[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         var3 = var1.method3742();
         this.field3515 = new short[var3];
         this.field3516 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3515[var4] = (short)var1.method3574();
            this.field3516[var4] = (short)var1.method3574();
         }
      } else if(var2 == 41) {
         var3 = var1.method3742();
         this.field3508 = new short[var3];
         this.field3510 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3508[var4] = (short)var1.method3574();
            this.field3510[var4] = (short)var1.method3574();
         }
      } else if(var2 == 60) {
         var3 = var1.method3742();
         this.field3507 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3507[var4] = var1.method3574();
         }
      } else if(var2 == 93) {
         this.field3520 = false;
      } else if(var2 == 95) {
         this.field3521 = var1.method3574();
      } else if(var2 == 97) {
         this.field3505 = var1.method3574();
      } else if(var2 == 98) {
         this.field3523 = var1.method3574();
      } else if(var2 == 99) {
         this.field3524 = true;
      } else if(var2 == 100) {
         this.field3525 = var1.method3569();
      } else if(var2 == 101) {
         this.field3526 = var1.method3569();
      } else if(var2 == 102) {
         this.field3527 = var1.method3574();
      } else if(var2 == 103) {
         this.field3528 = var1.method3574();
      } else if(var2 != 106 && var2 != 118) {
         if(var2 == 107) {
            this.field3535 = false;
         } else if(var2 == 109) {
            this.field3533 = false;
         } else if(var2 == 111) {
            this.field3534 = true;
         } else if(var2 == 249) {
            this.field3513 = class109.method2525(var1, this.field3513);
         }
      } else {
         this.field3530 = var1.method3574();
         if(this.field3530 == '\uffff') {
            this.field3530 = -1;
         }

         this.field3531 = var1.method3574();
         if(this.field3531 == '\uffff') {
            this.field3531 = -1;
         }

         var3 = -1;
         if(var2 == 118) {
            var3 = var1.method3574();
            if(var3 == '\uffff') {
               var3 = -1;
            }
         }

         var4 = var1.method3742();
         this.field3529 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3529[var5] = var1.method3574();
            if(this.field3529[var5] == '\uffff') {
               this.field3529[var5] = -1;
            }
         }

         this.field3529[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Ljh;ILjh;IB)Ldk;",
      garbageValue = "-62"
   )
   public final class119 method5171(class273 var1, int var2, class273 var3, int var4) {
      if(this.field3529 != null) {
         class271 var12 = this.method5186();
         return var12 == null?null:var12.method5171(var1, var2, var3, var4);
      } else {
         class119 var5 = (class119)field3502.method4023((long)this.field3503);
         if(var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.field3500.length; ++var7) {
               if(!field3522.method4708(this.field3500[var7], 0)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            class113[] var8 = new class113[this.field3500.length];

            int var9;
            for(var9 = 0; var9 < this.field3500.length; ++var9) {
               var8[var9] = class113.method2619(field3522, this.field3500[var9], 0);
            }

            class113 var11;
            if(var8.length == 1) {
               var11 = var8[0];
            } else {
               var11 = new class113(var8, var8.length);
            }

            if(this.field3515 != null) {
               for(var9 = 0; var9 < this.field3515.length; ++var9) {
                  var11.method2689(this.field3515[var9], this.field3516[var9]);
               }
            }

            if(this.field3508 != null) {
               for(var9 = 0; var9 < this.field3508.length; ++var9) {
                  var11.method2632(this.field3508[var9], this.field3510[var9]);
               }
            }

            var5 = var11.method2631(this.field3525 + 64, this.field3526 * 5 + 850, -30, -50, -30);
            field3502.method4028(var5, (long)this.field3503);
         }

         class119 var10;
         if(var1 != null && var3 != null) {
            var10 = var1.method5222(var5, var2, var3, var4);
         } else if(var1 != null) {
            var10 = var1.method5219(var5, var2);
         } else if(var3 != null) {
            var10 = var3.method5219(var5, var4);
         } else {
            var10 = var5.method2729(true);
         }

         if(this.field3505 != 128 || this.field3523 != 128) {
            var10.method2759(this.field3505, this.field3523, this.field3505);
         }

         return var10;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)Ldo;",
      garbageValue = "14"
   )
   public final class113 method5174() {
      if(this.field3529 != null) {
         class271 var1 = this.method5186();
         return var1 == null?null:var1.method5174();
      } else if(this.field3507 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.field3507.length; ++var2) {
            if(!field3522.method4708(this.field3507[var2], 0)) {
               var5 = true;
            }
         }

         if(var5) {
            return null;
         } else {
            class113[] var6 = new class113[this.field3507.length];

            for(int var3 = 0; var3 < this.field3507.length; ++var3) {
               var6[var3] = class113.method2619(field3522, this.field3507[var3], 0);
            }

            class113 var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new class113(var6, var6.length);
            }

            int var4;
            if(this.field3515 != null) {
               for(var4 = 0; var4 < this.field3515.length; ++var4) {
                  var7.method2689(this.field3515[var4], this.field3516[var4]);
               }
            }

            if(this.field3508 != null) {
               for(var4 = 0; var4 < this.field3508.length; ++var4) {
                  var7.method2632(this.field3508[var4], this.field3510[var4]);
               }
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Ljj;",
      garbageValue = "1865410382"
   )
   public final class271 method5186() {
      int var1 = -1;
      if(this.field3530 != -1) {
         var1 = class138.method3159(this.field3530);
      } else if(this.field3531 != -1) {
         var1 = class225.field2578[this.field3531];
      }

      int var2;
      if(var1 >= 0 && var1 < this.field3529.length - 1) {
         var2 = this.field3529[var1];
      } else {
         var2 = this.field3529[this.field3529.length - 1];
      }

      return var2 != -1?class59.method1125(var2):null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "64"
   )
   public boolean method5194() {
      if(this.field3529 == null) {
         return true;
      } else {
         int var1 = -1;
         if(this.field3530 != -1) {
            var1 = class138.method3159(this.field3530);
         } else if(this.field3531 != -1) {
            var1 = class225.field2578[this.field3531];
         }

         return var1 >= 0 && var1 < this.field3529.length?this.field3529[var1] != -1:this.field3529[this.field3529.length - 1] != -1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1161234943"
   )
   public int method5196(int var1, int var2) {
      class197 var4 = this.field3513;
      int var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         class211 var5 = (class211)var4.method3991((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.field2464;
         }
      }

      return var3;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-370870861"
   )
   public String method5175(int var1, String var2) {
      return class71.method1822(this.field3513, var1, var2);
   }
}
