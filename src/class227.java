import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class227 {

   @ObfuscatedName("l")
   static final int[] field2594 = new int[]{8, 11, 4, 6, 9, 7, 10};
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static class200 field2597 = new class200(260);
   @ObfuscatedName("w")
   int[] field2588;
   @ObfuscatedName("m")
   int[] field2589;
   @ObfuscatedName("q")
   public boolean field2595;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -450132463
   )
   public int field2596;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -4201235233235096677L
   )
   long field2592;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = -4026195054363000471L
   )
   long field2593;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([I[IZII)V",
      garbageValue = "-966160324"
   )
   public void method4485(int[] var1, int[] var2, boolean var3, int var4) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < class260.field3319; ++var6) {
               class260 var7 = class30.method552(var6);
               if(var7 != null && !var7.field3311 && (var3?7:0) + var5 == var7.field3313) {
                  var1[field2594[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.field2588 = var1;
      this.field2589 = var2;
      this.field2595 = var3;
      this.field2596 = var4;
      this.method4490();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "-791766651"
   )
   public void method4486(int var1, boolean var2) {
      if(var1 != 1 || !this.field2595) {
         int var3 = this.field2588[field2594[var1]];
         if(var3 != 0) {
            var3 -= 256;

            class260 var4;
            do {
               if(!var2) {
                  --var3;
                  if(var3 < 0) {
                     var3 = class260.field3319 - 1;
                  }
               } else {
                  ++var3;
                  if(var3 >= class260.field3319) {
                     var3 = 0;
                  }
               }

               var4 = class30.method552(var3);
            } while(var4 == null || var4.field3311 || var4.field3313 != (this.field2595?7:0) + var1);

            this.field2588[field2594[var1]] = var3 + 256;
            this.method4490();
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "2076263971"
   )
   public void method4487(int var1, boolean var2) {
      int var3 = this.field2589[var1];
      boolean var4;
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = class185.field2390[var1].length - 1;
            }

            if(var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if(var3 >= class185.field2390[var1].length) {
               var3 = 0;
            }

            if(var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.field2589[var1] = var3;
      this.method4490();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-267489993"
   )
   public void method4488(boolean var1) {
      if(this.field2595 != var1) {
         this.method4485((int[])null, this.field2589, var1, -1);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "1570872526"
   )
   public void method4501(class182 var1) {
      var1.method3552(this.field2595?1:0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field2588[field2594[var2]];
         if(var3 == 0) {
            var1.method3552(-1);
         } else {
            var1.method3552(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.method3552(this.field2589[var2]);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   void method4490() {
      long var1 = this.field2592;
      int var3 = this.field2588[5];
      int var4 = this.field2588[9];
      this.field2588[5] = var4;
      this.field2588[9] = var3;
      this.field2592 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field2592 <<= 4;
         if(this.field2588[var5] >= 256) {
            this.field2592 += (long)(this.field2588[var5] - 256);
         }
      }

      if(this.field2588[0] >= 256) {
         this.field2592 += (long)(this.field2588[0] - 256 >> 4);
      }

      if(this.field2588[1] >= 256) {
         this.field2592 += (long)(this.field2588[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field2592 <<= 3;
         this.field2592 += (long)this.field2589[var5];
      }

      this.field2592 <<= 1;
      this.field2592 += (long)(this.field2595?1:0);
      this.field2588[5] = var3;
      this.field2588[9] = var4;
      if(0L != var1 && var1 != this.field2592) {
         field2597.method4022(var1);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljh;ILjh;II)Ldk;",
      garbageValue = "-1606352773"
   )
   public class119 method4506(class273 var1, int var2, class273 var3, int var4) {
      if(this.field2596 != -1) {
         return class59.method1125(this.field2596).method5171(var1, var2, var3, var4);
      } else {
         long var5 = this.field2592;
         int[] var7 = this.field2588;
         if(var1 != null && (var1.field3561 >= 0 || var1.field3555 >= 0)) {
            var7 = new int[12];

            for(int var15 = 0; var15 < 12; ++var15) {
               var7[var15] = this.field2588[var15];
            }

            if(var1.field3561 >= 0) {
               var5 += (long)(var1.field3561 - this.field2588[5] << 40);
               var7[5] = var1.field3561;
            }

            if(var1.field3555 >= 0) {
               var5 += (long)(var1.field3555 - this.field2588[3] << 48);
               var7[3] = var1.field3555;
            }
         }

         class119 var8 = (class119)field2597.method4023(var5);
         if(var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if(var11 >= 256 && var11 < 512 && !class30.method552(var11 - 256).method4898()) {
                  var9 = true;
               }

               if(var11 >= 512 && !class120.method2784(var11 - 512).method5110(this.field2595)) {
                  var9 = true;
               }
            }

            if(var9) {
               if(this.field2593 != -1L) {
                  var8 = (class119)field2597.method4023(this.field2593);
               }

               if(var8 == null) {
                  return null;
               }
            }

            if(var8 == null) {
               class113[] var16 = new class113[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  class113 var14;
                  if(var13 >= 256 && var13 < 512) {
                     var14 = class30.method552(var13 - 256).method4914();
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }

                  if(var13 >= 512) {
                     var14 = class120.method2784(var13 - 512).method5107(this.field2595);
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }
               }

               class113 var18 = new class113(var16, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if(this.field2589[var13] < class185.field2390[var13].length) {
                     var18.method2689(class36.field313[var13], class185.field2390[var13][this.field2589[var13]]);
                  }

                  if(this.field2589[var13] < class76.field1091[var13].length) {
                     var18.method2689(class150.field1947[var13], class76.field1091[var13][this.field2589[var13]]);
                  }
               }

               var8 = var18.method2631(64, 850, -30, -50, -30);
               field2597.method4028(var8, var5);
               this.field2593 = var5;
            }
         }

         if(var1 == null && var3 == null) {
            return var8;
         } else {
            class119 var17;
            if(var1 != null && var3 != null) {
               var17 = var1.method5222(var8, var2, var3, var4);
            } else if(var1 != null) {
               var17 = var1.method5219(var8, var2);
            } else {
               var17 = var3.method5219(var8, var4);
            }

            return var17;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Ldo;",
      garbageValue = "296620503"
   )
   class113 method4492() {
      if(this.field2596 != -1) {
         return class59.method1125(this.field2596).method5174();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field2588[var2];
            if(var3 >= 256 && var3 < 512 && !class30.method552(var3 - 256).method4906()) {
               var1 = true;
            }

            if(var3 >= 512 && !class120.method2784(var3 - 512).method5143(this.field2595)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class113[] var7 = new class113[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field2588[var4];
               class113 var6;
               if(var5 >= 256 && var5 < 512) {
                  var6 = class30.method552(var5 - 256).method4901();
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if(var5 >= 512) {
                  var6 = class120.method2784(var5 - 512).method5150(this.field2595);
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            class113 var8 = new class113(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if(this.field2589[var5] < class185.field2390[var5].length) {
                  var8.method2689(class36.field313[var5], class185.field2390[var5][this.field2589[var5]]);
               }

               if(this.field2589[var5] < class76.field1091[var5].length) {
                  var8.method2689(class150.field1947[var5], class76.field1091[var5][this.field2589[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1620962582"
   )
   public int method4493() {
      return this.field2596 == -1?(this.field2588[0] << 15) + this.field2588[1] + (this.field2588[11] << 5) + (this.field2588[8] << 10) + (this.field2589[0] << 25) + (this.field2589[4] << 20):305419896 + class59.method1125(this.field2596).field3503;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IS)I",
      garbageValue = "8211"
   )
   public static int method4514(int var0) {
      return var0 >> 17 & 7;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "1229360672"
   )
   public static byte[] method4515() {
      byte[] var0 = new byte[24];

      try {
         class155.field1988.method2521(0L);
         class155.field1988.method2541(var0);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
            ;
         }

         if(var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }
}
