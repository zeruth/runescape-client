import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public abstract class class299 extends class314 {

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Llh;"
   )
   public static class317[] field3711;
   @ObfuscatedName("d")
   static int field3721 = -1;
   @ObfuscatedName("s")
   static int field3714 = -1;
   @ObfuscatedName("p")
   static int field3705 = -1;
   @ObfuscatedName("g")
   static int field3716 = -1;
   @ObfuscatedName("y")
   static int field3717 = 0;
   @ObfuscatedName("c")
   static int field3718 = 0;
   @ObfuscatedName("e")
   static int field3719 = 256;
   @ObfuscatedName("t")
   static int field3707 = 0;
   @ObfuscatedName("u")
   static int field3715 = 0;
   @ObfuscatedName("i")
   static Random field3706 = new Random();
   @ObfuscatedName("z")
   static String[] field3723 = new String[100];
   @ObfuscatedName("w")
   byte[][] field3720 = new byte[256][];
   @ObfuscatedName("m")
   int[] field3703;
   @ObfuscatedName("q")
   int[] field3704;
   @ObfuscatedName("b")
   int[] field3702;
   @ObfuscatedName("f")
   int[] field3722;
   @ObfuscatedName("n")
   int[] field3708;
   @ObfuscatedName("h")
   public int field3713 = 0;
   @ObfuscatedName("x")
   public int field3709;
   @ObfuscatedName("j")
   public int field3710;
   @ObfuscatedName("l")
   byte[] field3712;


   class299(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field3722 = var2;
      this.field3708 = var3;
      this.field3704 = var4;
      this.field3702 = var5;
      this.method5606(var1);
      this.field3720 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if(this.field3708[var10] < var8 && this.field3702[var10] != 0) {
            var8 = this.field3708[var10];
         }

         if(this.field3708[var10] + this.field3702[var10] > var9) {
            var9 = this.field3708[var10] + this.field3702[var10];
         }
      }

      this.field3709 = this.field3713 - var8;
      this.field3710 = var9 - this.field3713;
   }

   class299(byte[] var1) {
      this.method5606(var1);
   }

   @ObfuscatedName("w")
   abstract void vmethod5636(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedName("m")
   abstract void vmethod5555(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedName("s")
   void method5606(byte[] var1) {
      this.field3703 = new int[256];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field3703.length; ++var2) {
            this.field3703[var2] = var1[var2] & 255;
         }

         this.field3713 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field3703[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field3712 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if(var8 != 32 && var8 != 160) {
                     this.field3712[var8 + (var13 << 8)] = (byte)method5545(var11, var12, var4, this.field3703, var10, var13, var8);
                  }
               }
            }
         }

         this.field3713 = var4[32] + var10[32];
      }

   }

   @ObfuscatedName("g")
   int method5533(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.field3703[class294.method5519(var1) & 255];
   }

   @ObfuscatedName("y")
   public int method5536(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if(var6 == 60) {
               var2 = var5;
            } else {
               if(var6 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var6 = 60;
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=")) {
                           try {
                              String var9 = var7.substring(4);
                              int var8 = class1.method13(var9, 10, true);
                              var4 += field3711[var8].field3790;
                              var3 = -1;
                           } catch (Exception var12) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = 62;
                  }
               }

               if(var6 == 160) {
                  var6 = 32;
               }

               if(var2 == -1) {
                  var4 += this.field3703[(char)(class294.method5519(var6) & 255)];
                  if(this.field3712 != null && var3 != -1) {
                     var4 += this.field3712[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("c")
   public int method5537(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 60) {
               var10 = var14;
            } else {
               if(var15 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method5533('<');
                     if(this.field3712 != null && var11 != -1) {
                        var4 += this.field3712[(var11 << 8) + 60];
                     }

                     var11 = 60;
                  } else if(var16.equals("gt")) {
                     var4 += this.method5533('>');
                     if(this.field3712 != null && var11 != -1) {
                        var4 += this.field3712[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        String var18 = var16.substring(4);
                        int var17 = class1.method13(var18, 10, true);
                        var4 += field3711[var17].field3790;
                        var11 = 0;
                     } catch (Exception var22) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method5533(var15);
                     if(this.field3712 != null && var11 != -1) {
                        var4 += this.field3712[var15 + (var11 << 8)];
                     }

                     var11 = var15;
                  }

                  if(var15 == 32) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == 45) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var21 = var6.toString();
         if(var21.length() > var5) {
            var3[var12++] = var21.substring(var5, var21.length());
         }

         return var12;
      }
   }

   @ObfuscatedName("e")
   public int method5538(String var1, int var2) {
      int var3 = this.method5537(var1, new int[]{var2}, field3723);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method5536(field3723[var5]);
         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedName("t")
   public int method5539(String var1, int var2) {
      return this.method5537(var1, new int[]{var2}, field3723);
   }

   @ObfuscatedName("i")
   public void method5541(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method5550(var4, var5);
         this.method5553(var1, var2, var3);
      }
   }

   @ObfuscatedName("r")
   public void method5542(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method5550(var4, var5);
         field3719 = var6;
         this.method5553(var1, var2, var3);
      }
   }

   @ObfuscatedName("v")
   public void method5543(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method5550(var4, var5);
         this.method5553(var1, var2 - this.method5536(var1), var3);
      }
   }

   @ObfuscatedName("o")
   public void method5567(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method5550(var4, var5);
         this.method5553(var1, var2 - this.method5536(var1) / 2, var3);
      }
   }

   @ObfuscatedName("ai")
   public int method5595(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method5550(var6, var7);
         if(var10 == 0) {
            var10 = this.field3713;
         }

         int[] var11 = new int[]{var4};
         if(var5 < var10 + this.field3709 + this.field3710 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method5537(var1, var11, field3723);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field3709;
         } else if(var9 == 1) {
            var13 = var3 + (var5 - this.field3709 - this.field3710 - var10 * (var12 - 1)) / 2 + this.field3709;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field3710 - var10 * (var12 - 1);
         } else {
            var14 = (var5 - this.field3709 - this.field3710 - var10 * (var12 - 1)) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + var14 + this.field3709;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method5553(field3723[var14], var2, var13);
            } else if(var8 == 1) {
               this.method5553(field3723[var14], var2 + (var4 - this.method5536(field3723[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method5553(field3723[var14], var2 + var4 - this.method5536(field3723[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method5553(field3723[var14], var2, var13);
            } else {
               this.method5568(field3723[var14], var4);
               this.method5553(field3723[var14], var2, var13);
               field3707 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   @ObfuscatedName("at")
   public void method5546(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method5550(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method5540(var1, var2 - this.method5536(var1) / 2, var3, (int[])null, var7);
      }
   }

   @ObfuscatedName("ad")
   public void method5547(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method5550(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method5540(var1, var2 - this.method5536(var1) / 2, var3, var7, var8);
      }
   }

   @ObfuscatedName("ac")
   public void method5548(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method5550(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method5540(var1, var2 - this.method5536(var1) / 2, var3, (int[])null, var10);
      }
   }

   @ObfuscatedName("ay")
   public void method5549(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method5550(var4, var5);
         field3706.setSeed((long)var6);
         field3719 = 192 + (field3706.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if((field3706.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method5540(var1, var2, var3, var7, (int[])null);
      }
   }

   @ObfuscatedName("an")
   void method5550(int var1, int var2) {
      field3721 = -1;
      field3714 = -1;
      field3705 = var2;
      field3716 = var2;
      field3717 = var1;
      field3718 = var1;
      field3719 = 256;
      field3707 = 0;
      field3715 = 0;
   }

   @ObfuscatedName("as")
   void method5551(String var1) {
      try {
         if(var1.startsWith("col=")) {
            field3718 = class224.method4460(var1.substring(4), 16);
         } else if(var1.equals("/col")) {
            field3718 = field3717;
         } else if(var1.startsWith("str=")) {
            field3721 = class224.method4460(var1.substring(4), 16);
         } else if(var1.equals("str")) {
            field3721 = 8388608;
         } else if(var1.equals("/str")) {
            field3721 = -1;
         } else if(var1.startsWith("u=")) {
            field3714 = class224.method4460(var1.substring(2), 16);
         } else if(var1.equals("u")) {
            field3714 = 0;
         } else if(var1.equals("/u")) {
            field3714 = -1;
         } else if(var1.startsWith("shad=")) {
            field3716 = class224.method4460(var1.substring(5), 16);
         } else if(var1.equals("shad")) {
            field3716 = 0;
         } else if(var1.equals("/shad")) {
            field3716 = field3705;
         } else if(var1.equals("br")) {
            this.method5550(field3717, field3705);
         }
      } catch (Exception var3) {
         ;
      }

   }

   @ObfuscatedName("aw")
   void method5568(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == 60) {
            var4 = true;
         } else if(var6 == 62) {
            var4 = false;
         } else if(!var4 && var6 == 32) {
            ++var3;
         }
      }

      if(var3 > 0) {
         field3707 = (var2 - this.method5536(var1) << 8) / var3;
      }

   }

   @ObfuscatedName("ag")
   void method5553(String var1, int var2, int var3) {
      var3 -= this.field3713;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(class294.method5519(var1.charAt(var6)) & 255);
            if(var7 == 60) {
               var4 = var6;
            } else {
               int var9;
               if(var7 == 62 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = 60;
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              String var10 = var8.substring(4);
                              var9 = class1.method13(var10, 10, true);
                              class317 var12 = field3711[var9];
                              var12.method5873(var2, var3 + this.field3713 - var12.field3791);
                              var2 += var12.field3790;
                              var5 = -1;
                           } catch (Exception var16) {
                              ;
                           }
                        } else {
                           this.method5551(var8);
                        }
                        continue;
                     }

                     var7 = 62;
                  }
               }

               if(var7 == 160) {
                  var7 = 32;
               }

               if(var4 == -1) {
                  if(this.field3712 != null && var5 != -1) {
                     var2 += this.field3712[var7 + (var5 << 8)];
                  }

                  int var14 = this.field3704[var7];
                  var9 = this.field3702[var7];
                  if(var7 != 32) {
                     if(field3719 == 256) {
                        if(field3716 != -1) {
                           method5534(this.field3720[var7], var2 + this.field3722[var7] + 1, var3 + this.field3708[var7] + 1, var14, var9, field3716);
                        }

                        this.vmethod5636(this.field3720[var7], var2 + this.field3722[var7], var3 + this.field3708[var7], var14, var9, field3718);
                     } else {
                        if(field3716 != -1) {
                           method5557(this.field3720[var7], var2 + this.field3722[var7] + 1, var3 + this.field3708[var7] + 1, var14, var9, field3716, field3719);
                        }

                        this.vmethod5555(this.field3720[var7], var2 + this.field3722[var7], var3 + this.field3708[var7], var14, var9, field3718, field3719);
                     }
                  } else if(field3707 > 0) {
                     field3715 += field3707;
                     var2 += field3715 >> 8;
                     field3715 &= 255;
                  }

                  int var15 = this.field3703[var7];
                  if(field3721 != -1) {
                     class314.method5780(var2, var3 + (int)((double)this.field3713 * 0.7D), var15, field3721);
                  }

                  if(field3714 != -1) {
                     class314.method5780(var2, var3 + this.field3713 + 1, var15, field3714);
                  }

                  var2 += var15;
                  var5 = var7;
               }
            }
         }
      }

   }

   @ObfuscatedName("ah")
   void method5540(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field3713;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(class294.method5519(var1.charAt(var9)) & 255);
            if(var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = 60;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              String var15 = var11.substring(4);
                              var14 = class1.method13(var15, 10, true);
                              class317 var17 = field3711[var14];
                              var17.method5873(var12 + var2, var13 + (var3 + this.field3713 - var17.field3791));
                              var2 += var17.field3790;
                              var7 = -1;
                           } catch (Exception var21) {
                              ;
                           }
                        } else {
                           this.method5551(var11);
                        }
                        continue;
                     }

                     var10 = 62;
                  }
               }

               if(var10 == 160) {
                  var10 = 32;
               }

               if(var6 == -1) {
                  if(this.field3712 != null && var7 != -1) {
                     var2 += this.field3712[var10 + (var7 << 8)];
                  }

                  int var19 = this.field3704[var10];
                  var12 = this.field3702[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != 32) {
                     if(field3719 == 256) {
                        if(field3716 != -1) {
                           method5534(this.field3720[var10], var13 + var2 + this.field3722[var10] + 1, var3 + var14 + this.field3708[var10] + 1, var19, var12, field3716);
                        }

                        this.vmethod5636(this.field3720[var10], var13 + var2 + this.field3722[var10], var3 + var14 + this.field3708[var10], var19, var12, field3718);
                     } else {
                        if(field3716 != -1) {
                           method5557(this.field3720[var10], var13 + var2 + this.field3722[var10] + 1, var3 + var14 + this.field3708[var10] + 1, var19, var12, field3716, field3719);
                        }

                        this.vmethod5555(this.field3720[var10], var13 + var2 + this.field3722[var10], var3 + var14 + this.field3708[var10], var19, var12, field3718, field3719);
                     }
                  } else if(field3707 > 0) {
                     field3715 += field3707;
                     var2 += field3715 >> 8;
                     field3715 &= 255;
                  }

                  int var20 = this.field3703[var10];
                  if(field3721 != -1) {
                     class314.method5780(var2, var3 + (int)((double)this.field3713 * 0.7D), var20, field3721);
                  }

                  if(field3714 != -1) {
                     class314.method5780(var2, var3 + this.field3713, var20, field3714);
                  }

                  var2 += var20;
                  var7 = var10;
               }
            }
         }
      }

   }

   @ObfuscatedName("p")
   static int method5545(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedName("u")
   public static String method5643(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == 60) {
            var6.append("<lt>");
         } else if(var5 == 62) {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedName("az")
   static void method5534(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class314.field3770;
      int var7 = class314.field3770 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < class314.field3769) {
         var10 = class314.field3769 - var2;
         var4 -= var10;
         var2 = class314.field3769;
         var9 += var3 * var10;
         var6 += var10 * class314.field3770;
      }

      if(var2 + var4 > class314.field3768) {
         var4 -= var2 + var4 - class314.field3768;
      }

      if(var1 < class314.field3771) {
         var10 = class314.field3771 - var1;
         var3 -= var10;
         var1 = class314.field3771;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 + var1 > class314.field3767) {
         var10 = var3 + var1 - class314.field3767;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method5556(class314.field3772, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ObfuscatedName("ao")
   static void method5556(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("ap")
   static void method5557(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class314.field3770;
      int var8 = class314.field3770 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < class314.field3769) {
         var11 = class314.field3769 - var2;
         var4 -= var11;
         var2 = class314.field3769;
         var10 += var3 * var11;
         var7 += var11 * class314.field3770;
      }

      if(var2 + var4 > class314.field3768) {
         var4 -= var2 + var4 - class314.field3768;
      }

      if(var1 < class314.field3771) {
         var11 = class314.field3771 - var1;
         var3 -= var11;
         var1 = class314.field3771;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 + var1 > class314.field3767) {
         var11 = var3 + var1 - class314.field3767;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method5638(class314.field3772, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ObfuscatedName("af")
   static void method5638(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & '\uff00') * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & '\uff00') * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
