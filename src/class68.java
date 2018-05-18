import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public final class class68 extends class204 {

   @ObfuscatedName("pr")
   @ObfuscatedGetter(
      intValue = -1476992915
   )
   static int field1014;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static class205 field1002 = new class205();
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -129307297
   )
   int field998;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -586243701
   )
   int field1000;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 618012917
   )
   int field1007;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1178062771
   )
   int field1001;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1692095007
   )
   int field1005;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1320451131
   )
   int field1011;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 989282411
   )
   int field1004;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lcd;"
   )
   class103 field1006;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1173437159
   )
   int field997;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1534158765
   )
   int field1003;
   @ObfuscatedName("d")
   int[] field1008;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -38140803
   )
   int field1009;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lcd;"
   )
   class103 field1010;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   class268 field999;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1770938983"
   )
   void method1730() {
      int var1 = this.field1004;
      class268 var2 = this.field999.method5076();
      if(var2 != null) {
         this.field1004 = var2.field3433;
         this.field1011 = var2.field3434 * 128;
         this.field997 = var2.field3435;
         this.field1003 = var2.field3405;
         this.field1008 = var2.field3437;
      } else {
         this.field1004 = -1;
         this.field1011 = 0;
         this.field997 = 0;
         this.field1003 = 0;
         this.field1008 = null;
      }

      if(var1 != this.field1004 && this.field1006 != null) {
         class141.field1906.method2050(this.field1006);
         this.field1006 = null;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([BILjava/lang/CharSequence;S)I",
      garbageValue = "-24553"
   )
   public static int method1745(byte[] var0, int var1, CharSequence var2) {
      int var3 = var2.length();
      int var4 = var1;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var2.charAt(var5);
         if(var6 <= 127) {
            var0[var4++] = (byte)var6;
         } else if(var6 <= 2047) {
            var0[var4++] = (byte)(192 | var6 >> 6);
            var0[var4++] = (byte)(128 | var6 & 63);
         } else {
            var0[var4++] = (byte)(224 | var6 >> 12);
            var0[var4++] = (byte)(128 | var6 >> 6 & 63);
            var0[var4++] = (byte)(128 | var6 & 63);
         }
      }

      return var4 - var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1360057077"
   )
   public static void method1742() {
      class23.field203.method4048(5);
      class23.field204.method4048(5);
   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1208624539"
   )
   static final void method1746() {
      int[] var0 = class81.field1181;

      int var1;
      for(var1 = 0; var1 < class81.field1180; ++var1) {
         class60 var2 = client.field806[var0[var1]];
         if(var2 != null && var2.field898 > 0) {
            --var2.field898;
            if(var2.field898 == 0) {
               var2.field895 = null;
            }
         }
      }

      for(var1 = 0; var1 < client.field635; ++var1) {
         int var4 = client.field636[var1];
         class72 var3 = client.field807[var4];
         if(var3 != null && var3.field898 > 0) {
            --var3.field898;
            if(var3.field898 == 0) {
               var3.field895 = null;
            }
         }
      }

   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      signature = "(Lbs;II)V",
      garbageValue = "-575882251"
   )
   static final void method1747(class63 var0, int var1) {
      if(var0.field896 > client.field679) {
         class84.method1994(var0);
      } else {
         int var2;
         int var3;
         int var4;
         int var5;
         int var7;
         if(var0.field901 >= client.field679) {
            if(var0.field901 == client.field679 || var0.field915 == -1 || var0.field913 != 0 || var0.field917 + 1 > class137.method3151(var0.field915).field3562[var0.field916]) {
               var2 = var0.field901 - var0.field896;
               var3 = client.field679 - var0.field896;
               var4 = var0.field925 * 128 + var0.field885 * 64;
               var5 = var0.field927 * 128 + var0.field885 * 64;
               int var6 = var0.field926 * 128 + var0.field885 * 64;
               var7 = var0.field888 * 128 + var0.field885 * 64;
               var0.field900 = (var3 * var6 + var4 * (var2 - var3)) / var2;
               var0.field918 = (var7 * var3 + var5 * (var2 - var3)) / var2;
            }

            var0.field936 = 0;
            var0.field934 = var0.field931;
            var0.field883 = var0.field934;
         } else {
            var0.field912 = var0.field909;
            if(var0.field937 == 0) {
               var0.field936 = 0;
            } else {
               label304: {
                  if(var0.field915 != -1 && var0.field913 == 0) {
                     class273 var11 = class137.method3151(var0.field915);
                     if(var0.field942 > 0 && var11.field3564 == 0) {
                        ++var0.field936;
                        break label304;
                     }

                     if(var0.field942 <= 0 && var11.field3563 == 0) {
                        ++var0.field936;
                        break label304;
                     }
                  }

                  var2 = var0.field900;
                  var3 = var0.field918;
                  var4 = var0.field928[var0.field937 - 1] * 128 + var0.field885 * 64;
                  var5 = var0.field939[var0.field937 - 1] * 128 + var0.field885 * 64;
                  if(var2 < var4) {
                     if(var3 < var5) {
                        var0.field934 = 1280;
                     } else if(var3 > var5) {
                        var0.field934 = 1792;
                     } else {
                        var0.field934 = 1536;
                     }
                  } else if(var2 > var4) {
                     if(var3 < var5) {
                        var0.field934 = 768;
                     } else if(var3 > var5) {
                        var0.field934 = 256;
                     } else {
                        var0.field934 = 512;
                     }
                  } else if(var3 < var5) {
                     var0.field934 = 1024;
                  } else if(var3 > var5) {
                     var0.field934 = 0;
                  }

                  byte var12 = var0.field940[var0.field937 - 1];
                  if(var4 - var2 <= 256 && var4 - var2 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
                     var7 = var0.field934 - var0.field883 & 2047;
                     if(var7 > 1024) {
                        var7 -= 2048;
                     }

                     int var8 = var0.field891;
                     if(var7 >= -256 && var7 <= 256) {
                        var8 = var0.field890;
                     } else if(var7 >= 256 && var7 < 768) {
                        var8 = var0.field893;
                     } else if(var7 >= -768 && var7 <= -256) {
                        var8 = var0.field882;
                     }

                     if(var8 == -1) {
                        var8 = var0.field890;
                     }

                     var0.field912 = var8;
                     int var9 = 4;
                     boolean var10 = true;
                     if(var0 instanceof class72) {
                        var10 = ((class72)var0).field1058.field3533;
                     }

                     if(var10) {
                        if(var0.field934 != var0.field883 && var0.field935 == -1 && var0.field929 != 0) {
                           var9 = 2;
                        }

                        if(var0.field937 > 2) {
                           var9 = 6;
                        }

                        if(var0.field937 > 3) {
                           var9 = 8;
                        }

                        if(var0.field936 > 0 && var0.field937 > 1) {
                           var9 = 8;
                           --var0.field936;
                        }
                     } else {
                        if(var0.field937 > 1) {
                           var9 = 6;
                        }

                        if(var0.field937 > 2) {
                           var9 = 8;
                        }

                        if(var0.field936 > 0 && var0.field937 > 1) {
                           var9 = 8;
                           --var0.field936;
                        }
                     }

                     if(var12 == 2) {
                        var9 <<= 1;
                     }

                     if(var9 >= 8 && var0.field890 == var0.field912 && var0.field894 != -1) {
                        var0.field912 = var0.field894;
                     }

                     if(var4 != var2 || var3 != var5) {
                        if(var2 < var4) {
                           var0.field900 += var9;
                           if(var0.field900 > var4) {
                              var0.field900 = var4;
                           }
                        } else if(var2 > var4) {
                           var0.field900 -= var9;
                           if(var0.field900 < var4) {
                              var0.field900 = var4;
                           }
                        }

                        if(var3 < var5) {
                           var0.field918 += var9;
                           if(var0.field918 > var5) {
                              var0.field918 = var5;
                           }
                        } else if(var3 > var5) {
                           var0.field918 -= var9;
                           if(var0.field918 < var5) {
                              var0.field918 = var5;
                           }
                        }
                     }

                     if(var4 == var0.field900 && var5 == var0.field918) {
                        --var0.field937;
                        if(var0.field942 > 0) {
                           --var0.field942;
                        }
                     }
                  } else {
                     var0.field900 = var4;
                     var0.field918 = var5;
                     --var0.field937;
                     if(var0.field942 > 0) {
                        --var0.field942;
                     }
                  }
               }
            }
         }
      }

      if(var0.field900 < 128 || var0.field918 < 128 || var0.field900 >= 13184 || var0.field918 >= 13184) {
         var0.field915 = -1;
         var0.field920 = -1;
         var0.field896 = 0;
         var0.field901 = 0;
         var0.field900 = var0.field928[0] * 128 + var0.field885 * 64;
         var0.field918 = var0.field939[0] * 128 + var0.field885 * 64;
         var0.method1590();
      }

      if(class150.field1948 == var0 && (var0.field900 < 1536 || var0.field918 < 1536 || var0.field900 >= 11776 || var0.field918 >= 11776)) {
         var0.field915 = -1;
         var0.field920 = -1;
         var0.field896 = 0;
         var0.field901 = 0;
         var0.field900 = var0.field928[0] * 128 + var0.field885 * 64;
         var0.field918 = var0.field939[0] * 128 + var0.field885 * 64;
         var0.method1590();
      }

      class129.method3083(var0);
      class33.method605(var0);
   }
}
