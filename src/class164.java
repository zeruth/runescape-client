import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class164 {

   @ObfuscatedName("em")
   @ObfuscatedSignature(
      signature = "Lkl;"
   )
   static class296 field2056;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 71295879
   )
   public int field2049 = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -641265517
   )
   public int field2050 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 824762345
   )
   int field2048;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -234588691
   )
   int field2053;
   @ObfuscatedName("ao")
   public int[][] field2055;


   public class164(int var1, int var2) {
      this.field2048 = var1;
      this.field2053 = var2;
      this.field2055 = new int[this.field2048][this.field2053];
      this.method3413();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "438619304"
   )
   public void method3413() {
      for(int var1 = 0; var1 < this.field2048; ++var1) {
         for(int var2 = 0; var2 < this.field2053; ++var2) {
            if(var1 != 0 && var2 != 0 && var1 < this.field2048 - 5 && var2 < this.field2053 - 5) {
               this.field2055[var1][var2] = 16777216;
            } else {
               this.field2055[var1][var2] = 16777215;
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "2029854597"
   )
   public void method3414(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2049;
      var2 -= this.field2050;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method3442(var1, var2, 128);
            this.method3442(var1 - 1, var2, 8);
         }

         if(var4 == 1) {
            this.method3442(var1, var2, 2);
            this.method3442(var1, var2 + 1, 32);
         }

         if(var4 == 2) {
            this.method3442(var1, var2, 8);
            this.method3442(var1 + 1, var2, 128);
         }

         if(var4 == 3) {
            this.method3442(var1, var2, 32);
            this.method3442(var1, var2 - 1, 2);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method3442(var1, var2, 1);
            this.method3442(var1 - 1, var2 + 1, 16);
         }

         if(var4 == 1) {
            this.method3442(var1, var2, 4);
            this.method3442(var1 + 1, var2 + 1, 64);
         }

         if(var4 == 2) {
            this.method3442(var1, var2, 16);
            this.method3442(var1 + 1, var2 - 1, 1);
         }

         if(var4 == 3) {
            this.method3442(var1, var2, 64);
            this.method3442(var1 - 1, var2 - 1, 4);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method3442(var1, var2, 130);
            this.method3442(var1 - 1, var2, 8);
            this.method3442(var1, var2 + 1, 32);
         }

         if(var4 == 1) {
            this.method3442(var1, var2, 10);
            this.method3442(var1, var2 + 1, 32);
            this.method3442(var1 + 1, var2, 128);
         }

         if(var4 == 2) {
            this.method3442(var1, var2, 40);
            this.method3442(var1 + 1, var2, 128);
            this.method3442(var1, var2 - 1, 2);
         }

         if(var4 == 3) {
            this.method3442(var1, var2, 160);
            this.method3442(var1, var2 - 1, 2);
            this.method3442(var1 - 1, var2, 8);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method3442(var1, var2, 65536);
               this.method3442(var1 - 1, var2, 4096);
            }

            if(var4 == 1) {
               this.method3442(var1, var2, 1024);
               this.method3442(var1, var2 + 1, 16384);
            }

            if(var4 == 2) {
               this.method3442(var1, var2, 4096);
               this.method3442(var1 + 1, var2, 65536);
            }

            if(var4 == 3) {
               this.method3442(var1, var2, 16384);
               this.method3442(var1, var2 - 1, 1024);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method3442(var1, var2, 512);
               this.method3442(var1 - 1, var2 + 1, 8192);
            }

            if(var4 == 1) {
               this.method3442(var1, var2, 2048);
               this.method3442(var1 + 1, var2 + 1, '\u8000');
            }

            if(var4 == 2) {
               this.method3442(var1, var2, 8192);
               this.method3442(var1 + 1, var2 - 1, 512);
            }

            if(var4 == 3) {
               this.method3442(var1, var2, '\u8000');
               this.method3442(var1 - 1, var2 - 1, 2048);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method3442(var1, var2, 66560);
               this.method3442(var1 - 1, var2, 4096);
               this.method3442(var1, var2 + 1, 16384);
            }

            if(var4 == 1) {
               this.method3442(var1, var2, 5120);
               this.method3442(var1, var2 + 1, 16384);
               this.method3442(var1 + 1, var2, 65536);
            }

            if(var4 == 2) {
               this.method3442(var1, var2, 20480);
               this.method3442(var1 + 1, var2, 65536);
               this.method3442(var1, var2 - 1, 1024);
            }

            if(var4 == 3) {
               this.method3442(var1, var2, 81920);
               this.method3442(var1, var2 - 1, 1024);
               this.method3442(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIIZB)V",
      garbageValue = "-57"
   )
   public void method3415(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if(var5) {
         var6 += 131072;
      }

      var1 -= this.field2049;
      var2 -= this.field2050;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if(var7 >= 0 && var7 < this.field2048) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if(var8 >= 0 && var8 < this.field2053) {
                  this.method3442(var7, var8, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIS)V",
      garbageValue = "23059"
   )
   public void method3437(int var1, int var2) {
      var1 -= this.field2049;
      var2 -= this.field2050;
      this.field2055[var1][var2] |= 2097152;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "20"
   )
   public void method3424(int var1, int var2) {
      var1 -= this.field2049;
      var2 -= this.field2050;
      this.field2055[var1][var2] |= 262144;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "28"
   )
   void method3442(int var1, int var2, int var3) {
      this.field2055[var1][var2] |= var3;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "-1912776030"
   )
   public void method3419(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2049;
      var2 -= this.field2050;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method3421(var1, var2, 128);
            this.method3421(var1 - 1, var2, 8);
         }

         if(var4 == 1) {
            this.method3421(var1, var2, 2);
            this.method3421(var1, var2 + 1, 32);
         }

         if(var4 == 2) {
            this.method3421(var1, var2, 8);
            this.method3421(var1 + 1, var2, 128);
         }

         if(var4 == 3) {
            this.method3421(var1, var2, 32);
            this.method3421(var1, var2 - 1, 2);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(var4 == 0) {
            this.method3421(var1, var2, 1);
            this.method3421(var1 - 1, var2 + 1, 16);
         }

         if(var4 == 1) {
            this.method3421(var1, var2, 4);
            this.method3421(var1 + 1, var2 + 1, 64);
         }

         if(var4 == 2) {
            this.method3421(var1, var2, 16);
            this.method3421(var1 + 1, var2 - 1, 1);
         }

         if(var4 == 3) {
            this.method3421(var1, var2, 64);
            this.method3421(var1 - 1, var2 - 1, 4);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method3421(var1, var2, 130);
            this.method3421(var1 - 1, var2, 8);
            this.method3421(var1, var2 + 1, 32);
         }

         if(var4 == 1) {
            this.method3421(var1, var2, 10);
            this.method3421(var1, var2 + 1, 32);
            this.method3421(var1 + 1, var2, 128);
         }

         if(var4 == 2) {
            this.method3421(var1, var2, 40);
            this.method3421(var1 + 1, var2, 128);
            this.method3421(var1, var2 - 1, 2);
         }

         if(var4 == 3) {
            this.method3421(var1, var2, 160);
            this.method3421(var1, var2 - 1, 2);
            this.method3421(var1 - 1, var2, 8);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method3421(var1, var2, 65536);
               this.method3421(var1 - 1, var2, 4096);
            }

            if(var4 == 1) {
               this.method3421(var1, var2, 1024);
               this.method3421(var1, var2 + 1, 16384);
            }

            if(var4 == 2) {
               this.method3421(var1, var2, 4096);
               this.method3421(var1 + 1, var2, 65536);
            }

            if(var4 == 3) {
               this.method3421(var1, var2, 16384);
               this.method3421(var1, var2 - 1, 1024);
            }
         }

         if(var3 == 1 || var3 == 3) {
            if(var4 == 0) {
               this.method3421(var1, var2, 512);
               this.method3421(var1 - 1, var2 + 1, 8192);
            }

            if(var4 == 1) {
               this.method3421(var1, var2, 2048);
               this.method3421(var1 + 1, var2 + 1, '\u8000');
            }

            if(var4 == 2) {
               this.method3421(var1, var2, 8192);
               this.method3421(var1 + 1, var2 - 1, 512);
            }

            if(var4 == 3) {
               this.method3421(var1, var2, '\u8000');
               this.method3421(var1 - 1, var2 - 1, 2048);
            }
         }

         if(var3 == 2) {
            if(var4 == 0) {
               this.method3421(var1, var2, 66560);
               this.method3421(var1 - 1, var2, 4096);
               this.method3421(var1, var2 + 1, 16384);
            }

            if(var4 == 1) {
               this.method3421(var1, var2, 5120);
               this.method3421(var1, var2 + 1, 16384);
               this.method3421(var1 + 1, var2, 65536);
            }

            if(var4 == 2) {
               this.method3421(var1, var2, 20480);
               this.method3421(var1 + 1, var2, 65536);
               this.method3421(var1, var2 - 1, 1024);
            }

            if(var4 == 3) {
               this.method3421(var1, var2, 81920);
               this.method3421(var1, var2 - 1, 1024);
               this.method3421(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)V",
      garbageValue = "-1685774350"
   )
   public void method3435(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if(var6) {
         var7 += 131072;
      }

      var1 -= this.field2049;
      var2 -= this.field2050;
      int var8;
      if(var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if(var8 >= 0 && var8 < this.field2048) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if(var9 >= 0 && var9 < this.field2053) {
                  this.method3421(var8, var9, var7);
               }
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "2076707814"
   )
   void method3421(int var1, int var2, int var3) {
      this.field2055[var1][var2] &= ~var3;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1661859056"
   )
   public void method3434(int var1, int var2) {
      var1 -= this.field2049;
      var2 -= this.field2050;
      this.field2055[var1][var2] &= -262145;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2035540526"
   )
   public static void method3447() {
      class259.field3302.method4024();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-572241541"
   )
   static final void method3448(String var0) {
      class61.method1189(30, "", var0);
   }
}
