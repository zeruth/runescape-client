import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public abstract class class247 {

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lfl;"
   )
   static class175 field3185 = new class175();
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -679236219
   )
   static int field3179 = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1625132987
   )
   int field3173;
   @ObfuscatedName("q")
   int[] field3174;
   @ObfuscatedName("b")
   int[] field3175;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgw;"
   )
   class198 field3176;
   @ObfuscatedName("n")
   int[] field3177;
   @ObfuscatedName("h")
   int[] field3178;
   @ObfuscatedName("x")
   int[] field3181;
   @ObfuscatedName("j")
   int[][] field3189;
   @ObfuscatedName("a")
   int[][] field3172;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Lgw;"
   )
   class198[] field3182;
   @ObfuscatedName("d")
   Object[] field3183;
   @ObfuscatedName("s")
   Object[][] field3184;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 424781117
   )
   public int field3180;
   @ObfuscatedName("y")
   boolean field3187;
   @ObfuscatedName("c")
   boolean field3190;


   class247(boolean var1, boolean var2) {
      this.field3187 = var1;
      this.field3190 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "-190680601"
   )
   void method4683(byte[] var1) {
      int var3 = var1.length;
      int var2 = class236.method4596(var1, 0, var3);
      this.field3180 = var2;
      class182 var4 = new class182(class175.method3501(var1));
      int var5 = var4.method3742();
      if(var5 >= 5 && var5 <= 7) {
         if(var5 >= 6) {
            var4.method3573();
         }

         int var6 = var4.method3742();
         if(var5 >= 7) {
            this.field3173 = var4.method3584();
         } else {
            this.field3173 = var4.method3574();
         }

         int var7 = 0;
         int var8 = -1;
         this.field3174 = new int[this.field3173];
         int var9;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field3173; ++var9) {
               this.field3174[var9] = var7 += var4.method3584();
               if(this.field3174[var9] > var8) {
                  var8 = this.field3174[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.field3173; ++var9) {
               this.field3174[var9] = var7 += var4.method3574();
               if(this.field3174[var9] > var8) {
                  var8 = this.field3174[var9];
               }
            }
         }

         this.field3177 = new int[var8 + 1];
         this.field3178 = new int[var8 + 1];
         this.field3181 = new int[var8 + 1];
         this.field3189 = new int[var8 + 1][];
         this.field3183 = new Object[var8 + 1];
         this.field3184 = new Object[var8 + 1][];
         if(var6 != 0) {
            this.field3175 = new int[var8 + 1];

            for(var9 = 0; var9 < this.field3173; ++var9) {
               this.field3175[this.field3174[var9]] = var4.method3573();
            }

            this.field3176 = new class198(this.field3175);
         }

         for(var9 = 0; var9 < this.field3173; ++var9) {
            this.field3177[this.field3174[var9]] = var4.method3573();
         }

         for(var9 = 0; var9 < this.field3173; ++var9) {
            this.field3178[this.field3174[var9]] = var4.method3573();
         }

         for(var9 = 0; var9 < this.field3173; ++var9) {
            this.field3181[this.field3174[var9]] = var4.method3574();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field3173; ++var9) {
               var10 = this.field3174[var9];
               var11 = this.field3181[var10];
               var7 = 0;
               var12 = -1;
               this.field3189[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field3189[var10][var13] = var7 += var4.method3584();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field3184[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < this.field3173; ++var9) {
               var10 = this.field3174[var9];
               var11 = this.field3181[var10];
               var7 = 0;
               var12 = -1;
               this.field3189[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field3189[var10][var13] = var7 += var4.method3574();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field3184[var10] = new Object[var12 + 1];
            }
         }

         if(var6 != 0) {
            this.field3172 = new int[var8 + 1][];
            this.field3182 = new class198[var8 + 1];

            for(var9 = 0; var9 < this.field3173; ++var9) {
               var10 = this.field3174[var9];
               var11 = this.field3181[var10];
               this.field3172[var10] = new int[this.field3184[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field3172[var10][this.field3189[var10][var12]] = var4.method3573();
               }

               this.field3182[var10] = new class198(this.field3172[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "1"
   )
   void vmethod4741(int var1) {}

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIS)[B",
      garbageValue = "16149"
   )
   public byte[] method4626(int var1, int var2) {
      return this.method4627(var1, var2, (int[])null);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II[II)[B",
      garbageValue = "-1627995834"
   )
   public byte[] method4627(int var1, int var2, int[] var3) {
      if(var1 >= 0 && var1 < this.field3184.length && this.field3184[var1] != null && var2 >= 0 && var2 < this.field3184[var1].length) {
         if(this.field3184[var1][var2] == null) {
            boolean var4 = this.method4710(var1, var3);
            if(!var4) {
               this.vmethod4761(var1);
               var4 = this.method4710(var1, var3);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class27.method502(this.field3184[var1][var2], false);
         if(this.field3190) {
            this.field3184[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-667807327"
   )
   public boolean method4708(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field3184.length && this.field3184[var1] != null && var2 >= 0 && var2 < this.field3184[var1].length) {
         if(this.field3184[var1][var2] != null) {
            return true;
         } else if(this.field3183[var1] != null) {
            return true;
         } else {
            this.vmethod4761(var1);
            return this.field3183[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "21"
   )
   public boolean method4629(int var1) {
      if(this.field3184.length == 1) {
         return this.method4708(0, var1);
      } else if(this.field3184[var1].length == 1) {
         return this.method4708(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "7"
   )
   public boolean method4639(int var1) {
      if(this.field3183[var1] != null) {
         return true;
      } else {
         this.vmethod4761(var1);
         return this.field3183[var1] != null;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "-2638"
   )
   public boolean method4631() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field3174.length; ++var2) {
         int var3 = this.field3174[var2];
         if(this.field3183[var3] == null) {
            this.vmethod4761(var3);
            if(this.field3183[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-45"
   )
   int vmethod4743(int var1) {
      return this.field3183[var1] != null?100:0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "1926011051"
   )
   public byte[] method4718(int var1) {
      if(this.field3184.length == 1) {
         return this.method4626(0, var1);
      } else if(this.field3184[var1].length == 1) {
         return this.method4626(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIB)[B",
      garbageValue = "19"
   )
   public byte[] method4634(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field3184.length && this.field3184[var1] != null && var2 >= 0 && var2 < this.field3184[var1].length) {
         if(this.field3184[var1][var2] == null) {
            boolean var3 = this.method4710(var1, (int[])null);
            if(!var3) {
               this.vmethod4761(var1);
               var3 = this.method4710(var1, (int[])null);
               if(!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class27.method502(this.field3184[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "5000000"
   )
   public byte[] method4640(int var1) {
      if(this.field3184.length == 1) {
         return this.method4634(0, var1);
      } else if(this.field3184[var1].length == 1) {
         return this.method4634(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1716933918"
   )
   void vmethod4761(int var1) {}

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-264770335"
   )
   public int[] method4648(int var1) {
      return this.field3189[var1];
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1627732983"
   )
   public int method4638(int var1) {
      return this.field3184[var1].length;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1905738641"
   )
   public int method4645() {
      return this.field3184.length;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2045891586"
   )
   public void method4662() {
      for(int var1 = 0; var1 < this.field3183.length; ++var1) {
         this.field3183[var1] = null;
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "92"
   )
   public void method4659(int var1) {
      for(int var2 = 0; var2 < this.field3184[var1].length; ++var2) {
         this.field3184[var1][var2] = null;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1450248011"
   )
   public void method4642() {
      for(int var1 = 0; var1 < this.field3184.length; ++var1) {
         if(this.field3184[var1] != null) {
            for(int var2 = 0; var2 < this.field3184[var1].length; ++var2) {
               this.field3184[var1][var2] = null;
            }
         }
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I[II)Z",
      garbageValue = "465658564"
   )
   boolean method4710(int var1, int[] var2) {
      if(this.field3183[var1] == null) {
         return false;
      } else {
         int var3 = this.field3181[var1];
         int[] var4 = this.field3189[var1];
         Object[] var5 = this.field3184[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            byte[] var18;
            if(var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
               var18 = class27.method502(this.field3183[var1], true);
               class182 var8 = new class182(var18);
               var8.method3590(var2, 5, var8.field2365.length);
            } else {
               var18 = class27.method502(this.field3183[var1], false);
            }

            byte[] var20 = class175.method3501(var18);
            if(this.field3187) {
               this.field3183[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               class182 var11 = new class182(var20);
               int[] var12 = new int[var3];
               var11.field2359 = var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.method3573();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.field2359 = var9;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.method3573();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field3190) {
                     var5[var4[var15]] = class123.method2896(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if(!this.field3190) {
               var5[var4[0]] = class123.method2896(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)I",
      garbageValue = "1124"
   )
   public int method4644(String var1) {
      var1 = var1.toLowerCase();
      return this.field3176.method4012(class111.method2615(var1));
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)I",
      garbageValue = "-1747890017"
   )
   public int method4693(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field3182[var1].method4012(class111.method2615(var2));
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "-591844980"
   )
   public boolean method4689(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3176.method4012(class111.method2615(var1));
      if(var3 < 0) {
         return false;
      } else {
         int var4 = this.field3182[var3].method4012(class111.method2615(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "1799910180"
   )
   public byte[] method4647(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3176.method4012(class111.method2615(var1));
      int var4 = this.field3182[var3].method4012(class111.method2615(var2));
      return this.method4626(var3, var4);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "209083034"
   )
   public boolean method4688(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3176.method4012(class111.method2615(var1));
      int var4 = this.field3182[var3].method4012(class111.method2615(var2));
      return this.method4708(var3, var4);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Z",
      garbageValue = "0"
   )
   public boolean method4713(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3176.method4012(class111.method2615(var1));
      return this.method4639(var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1985734087"
   )
   public void method4650(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3176.method4012(class111.method2615(var1));
      if(var2 >= 0) {
         this.vmethod4741(var2);
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)I",
      garbageValue = "65"
   )
   public int method4651(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3176.method4012(class111.method2615(var1));
      return this.vmethod4743(var2);
   }
}
