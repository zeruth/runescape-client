import java.awt.Font;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public final class class110 {

   @ObfuscatedName("ac")
   static Font field1455;
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field1459;
   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      signature = "[Llc;"
   )
   static class318[] field1460;
   @ObfuscatedName("w")
   RandomAccessFile field1461;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = 7551439930244237273L
   )
   long field1454;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = -2482160206388848509L
   )
   long field1456;


   public class110(File var1, String var2, long var3) throws IOException {
      if(-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if(var1.length() >= var3) {
         var1.delete();
      }

      this.field1461 = new RandomAccessFile(var1, var2);
      this.field1454 = var3;
      this.field1456 = 0L;
      int var5 = this.field1461.read();
      if(var5 != -1 && !var2.equals("r")) {
         this.field1461.seek(0L);
         this.field1461.write(var5);
      }

      this.field1461.seek(0L);
   }

   @ObfuscatedName("w")
   final void method2555(long var1) throws IOException {
      this.field1461.seek(var1);
      this.field1456 = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1908424664"
   )
   public final void method2556(byte[] var1, int var2, int var3) throws IOException {
      if((long)var3 + this.field1456 > this.field1454) {
         this.field1461.seek(this.field1454 + 1L);
         this.field1461.write(1);
         throw new EOFException();
      } else {
         this.field1461.write(var1, var2, var3);
         this.field1456 += (long)var3;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-911450874"
   )
   public final void method2564() throws IOException {
      this.method2554(false);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1927514146"
   )
   public final void method2554(boolean var1) throws IOException {
      if(this.field1461 != null) {
         if(var1) {
            try {
               this.field1461.getFD().sync();
            } catch (SyncFailedException var3) {
               ;
            }
         }

         this.field1461.close();
         this.field1461 = null;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-1612176979"
   )
   public final long method2574() throws IOException {
      return this.field1461.length();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-788517916"
   )
   public final int method2560(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.field1461.read(var1, var2, var3);
      if(var4 > 0) {
         this.field1456 += (long)var4;
      }

      return var4;
   }

   protected void finalize() throws Throwable {
      if(this.field1461 != null) {
         System.out.println("");
         this.method2564();
      }

   }

   @ObfuscatedName("w")
   static double method2581(double var0) {
      return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ZZI)I",
      garbageValue = "-1606352773"
   )
   public static int method2580(boolean var0, boolean var1) {
      byte var2 = 0;
      int var3 = var2 + class250.field3214 + class250.field3212;
      return var3;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-86"
   )
   protected static final void method2579() {
      class47.field389.vmethod3346();

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         class47.field390[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         class47.field397[var0] = 0L;
      }

      class286.field3645 = 0;
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
      garbageValue = "1839884179"
   )
   static final void method2561(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      if(var2 >= 2000) {
         var2 -= 2000;
      }

      class172 var8;
      if(var2 == 1) {
         client.field743 = var6;
         client.field839 = var7;
         client.field696 = 2;
         client.field843 = 0;
         client.field820 = var0;
         client.field821 = var1;
         var8 = class133.method3115(class169.field2202, client.field739.field1250);
         var8.field2279.method3707(var0 + class178.field2315);
         var8.field2279.method3605(class59.field554);
         var8.field2279.method3595(class39.field340[82]?1:0);
         var8.field2279.method3725(class71.field1051 + var1);
         var8.field2279.method3602(class24.field220);
         var8.field2279.method3725(var3);
         var8.field2279.method3641(class174.field2296);
         client.field739.method2019(var8);
      } else if(var2 == 2) {
         client.field743 = var6;
         client.field839 = var7;
         client.field696 = 2;
         client.field843 = 0;
         client.field820 = var0;
         client.field821 = var1;
         var8 = class133.method3115(class169.field2222, client.field739.field1250);
         var8.field2279.method3595(class39.field340[82]?1:0);
         var8.field2279.method3725(var0 + class178.field2315);
         var8.field2279.method3605(var3);
         var8.field2279.method3602(client.field748);
         var8.field2279.method3555(class142.field1911);
         var8.field2279.method3605(class71.field1051 + var1);
         client.field739.method2019(var8);
      } else if(var2 == 3) {
         client.field743 = var6;
         client.field839 = var7;
         client.field696 = 2;
         client.field843 = 0;
         client.field820 = var0;
         client.field821 = var1;
         var8 = class133.method3115(class169.field2191, client.field739.field1250);
         var8.field2279.method3725(var3);
         var8.field2279.method3605(class71.field1051 + var1);
         var8.field2279.method3605(var0 + class178.field2315);
         var8.field2279.method3596(class39.field340[82]?1:0);
         client.field739.method2019(var8);
      } else if(var2 == 4) {
         client.field743 = var6;
         client.field839 = var7;
         client.field696 = 2;
         client.field843 = 0;
         client.field820 = var0;
         client.field821 = var1;
         var8 = class133.method3115(class169.field2168, client.field739.field1250);
         var8.field2279.method3707(var0 + class178.field2315);
         var8.field2279.method3595(class39.field340[82]?1:0);
         var8.field2279.method3602(class71.field1051 + var1);
         var8.field2279.method3605(var3);
         client.field739.method2019(var8);
      } else if(var2 == 5) {
         client.field743 = var6;
         client.field839 = var7;
         client.field696 = 2;
         client.field843 = 0;
         client.field820 = var0;
         client.field821 = var1;
         var8 = class133.method3115(class169.field2170, client.field739.field1250);
         var8.field2279.method3605(class71.field1051 + var1);
         var8.field2279.method3602(var3);
         var8.field2279.method3595(class39.field340[82]?1:0);
         var8.field2279.method3602(var0 + class178.field2315);
         client.field739.method2019(var8);
      } else if(var2 == 6) {
         client.field743 = var6;
         client.field839 = var7;
         client.field696 = 2;
         client.field843 = 0;
         client.field820 = var0;
         client.field821 = var1;
         var8 = class133.method3115(class169.field2188, client.field739.field1250);
         var8.field2279.method3596(class39.field340[82]?1:0);
         var8.field2279.method3707(var0 + class178.field2315);
         var8.field2279.method3602(var3);
         var8.field2279.method3725(class71.field1051 + var1);
         client.field739.method2019(var8);
      } else {
         class172 var9;
         class72 var19;
         if(var2 == 7) {
            var19 = client.field807[var3];
            if(var19 != null) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var9 = class133.method3115(class169.field2181, client.field739.field1250);
               var9.field2279.method3594(class39.field340[82]?1:0);
               var9.field2279.method3670(class174.field2296);
               var9.field2279.method3707(class59.field554);
               var9.field2279.method3605(class24.field220);
               var9.field2279.method3602(var3);
               client.field739.method2019(var9);
            }
         } else if(var2 == 8) {
            var19 = client.field807[var3];
            if(var19 != null) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var9 = class133.method3115(class169.field2212, client.field739.field1250);
               var9.field2279.method3641(class142.field1911);
               var9.field2279.method3602(var3);
               var9.field2279.method3596(class39.field340[82]?1:0);
               var9.field2279.method3725(client.field748);
               client.field739.method2019(var9);
            }
         } else if(var2 == 9) {
            var19 = client.field807[var3];
            if(var19 != null) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var9 = class133.method3115(class169.field2179, client.field739.field1250);
               var9.field2279.method3725(var3);
               var9.field2279.method3596(class39.field340[82]?1:0);
               client.field739.method2019(var9);
            }
         } else if(var2 == 10) {
            var19 = client.field807[var3];
            if(var19 != null) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var9 = class133.method3115(class169.field2235, client.field739.field1250);
               var9.field2279.method3602(var3);
               var9.field2279.method3552(class39.field340[82]?1:0);
               client.field739.method2019(var9);
            }
         } else if(var2 == 11) {
            var19 = client.field807[var3];
            if(var19 != null) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var9 = class133.method3115(class169.field2185, client.field739.field1250);
               var9.field2279.method3595(class39.field340[82]?1:0);
               var9.field2279.method3707(var3);
               client.field739.method2019(var9);
            }
         } else if(var2 == 12) {
            var19 = client.field807[var3];
            if(var19 != null) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var9 = class133.method3115(class169.field2192, client.field739.field1250);
               var9.field2279.method3594(class39.field340[82]?1:0);
               var9.field2279.method3605(var3);
               client.field739.method2019(var9);
            }
         } else if(var2 == 13) {
            var19 = client.field807[var3];
            if(var19 != null) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var9 = class133.method3115(class169.field2189, client.field739.field1250);
               var9.field2279.method3707(var3);
               var9.field2279.method3552(class39.field340[82]?1:0);
               client.field739.method2019(var9);
            }
         } else {
            class60 var22;
            if(var2 == 14) {
               var22 = client.field806[var3];
               if(var22 != null) {
                  client.field743 = var6;
                  client.field839 = var7;
                  client.field696 = 2;
                  client.field843 = 0;
                  client.field820 = var0;
                  client.field821 = var1;
                  var9 = class133.method3115(class169.field2223, client.field739.field1250);
                  var9.field2279.method3670(class174.field2296);
                  var9.field2279.method3602(class59.field554);
                  var9.field2279.method3605(var3);
                  var9.field2279.method3605(class24.field220);
                  var9.field2279.method3552(class39.field340[82]?1:0);
                  client.field739.method2019(var9);
               }
            } else if(var2 == 15) {
               var22 = client.field806[var3];
               if(var22 != null) {
                  client.field743 = var6;
                  client.field839 = var7;
                  client.field696 = 2;
                  client.field843 = 0;
                  client.field820 = var0;
                  client.field821 = var1;
                  var9 = class133.method3115(class169.field2234, client.field739.field1250);
                  var9.field2279.method3725(client.field748);
                  var9.field2279.method3641(class142.field1911);
                  var9.field2279.method3594(class39.field340[82]?1:0);
                  var9.field2279.method3707(var3);
                  client.field739.method2019(var9);
               }
            } else if(var2 == 16) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var8 = class133.method3115(class169.field2242, client.field739.field1250);
               var8.field2279.method3605(var3);
               var8.field2279.method3605(var0 + class178.field2315);
               var8.field2279.method3641(class174.field2296);
               var8.field2279.method3594(class39.field340[82]?1:0);
               var8.field2279.method3602(class59.field554);
               var8.field2279.method3725(class71.field1051 + var1);
               var8.field2279.method3602(class24.field220);
               client.field739.method2019(var8);
            } else if(var2 == 17) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var8 = class133.method3115(class169.field2254, client.field739.field1250);
               var8.field2279.method3707(class71.field1051 + var1);
               var8.field2279.method3605(client.field748);
               var8.field2279.method3725(var0 + class178.field2315);
               var8.field2279.method3596(class39.field340[82]?1:0);
               var8.field2279.method3641(class142.field1911);
               var8.field2279.method3605(var3);
               client.field739.method2019(var8);
            } else if(var2 == 18) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var8 = class133.method3115(class169.field2232, client.field739.field1250);
               var8.field2279.method3602(var3);
               var8.field2279.method3552(class39.field340[82]?1:0);
               var8.field2279.method3602(class71.field1051 + var1);
               var8.field2279.method3707(var0 + class178.field2315);
               client.field739.method2019(var8);
            } else if(var2 == 19) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var8 = class133.method3115(class169.field2257, client.field739.field1250);
               var8.field2279.method3707(var0 + class178.field2315);
               var8.field2279.method3602(class71.field1051 + var1);
               var8.field2279.method3707(var3);
               var8.field2279.method3595(class39.field340[82]?1:0);
               client.field739.method2019(var8);
            } else if(var2 == 20) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var8 = class133.method3115(class169.field2211, client.field739.field1250);
               var8.field2279.method3602(var3);
               var8.field2279.method3594(class39.field340[82]?1:0);
               var8.field2279.method3725(var0 + class178.field2315);
               var8.field2279.method3725(class71.field1051 + var1);
               client.field739.method2019(var8);
            } else if(var2 == 21) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var8 = class133.method3115(class169.field2173, client.field739.field1250);
               var8.field2279.method3707(var3);
               var8.field2279.method3605(var0 + class178.field2315);
               var8.field2279.method3594(class39.field340[82]?1:0);
               var8.field2279.method3605(class71.field1051 + var1);
               client.field739.method2019(var8);
            } else if(var2 == 22) {
               client.field743 = var6;
               client.field839 = var7;
               client.field696 = 2;
               client.field843 = 0;
               client.field820 = var0;
               client.field821 = var1;
               var8 = class133.method3115(class169.field2195, client.field739.field1250);
               var8.field2279.method3725(class71.field1051 + var1);
               var8.field2279.method3605(var3);
               var8.field2279.method3594(class39.field340[82]?1:0);
               var8.field2279.method3605(var0 + class178.field2315);
               client.field739.method2019(var8);
            } else if(var2 == 23) {
               if(client.field846) {
                  class56.field523.method2939();
               } else {
                  class56.field523.method2938(class192.field2415, var0, var1, true);
               }
            } else {
               class172 var10;
               class230 var23;
               if(var2 == 24) {
                  var23 = class61.method1188(var1);
                  boolean var15 = true;
                  if(var23.field2711 > 0) {
                     var15 = class15.method163(var23);
                  }

                  if(var15) {
                     var10 = class133.method3115(class169.field2231, client.field739.field1250);
                     var10.field2279.method3555(var1);
                     client.field739.method2019(var10);
                  }
               } else {
                  int var17;
                  int var25;
                  if(var2 == 25) {
                     var23 = class21.method304(var1, var0);
                     if(var23 != null) {
                        class23.method456();
                        var17 = class95.method2252(var23);
                        var25 = var17 >> 11 & 63;
                        int var18 = var23.field2754;
                        class230 var13 = class21.method304(var1, var0);
                        if(var13 != null && var13.field2715 != null) {
                           class56 var14 = new class56();
                           var14.field511 = var13;
                           var14.field525 = var13.field2715;
                           class67.method1728(var14);
                        }

                        client.field749 = var18;
                        client.field813 = true;
                        class142.field1911 = var1;
                        client.field748 = var0;
                        class45.field373 = var25;
                        class181.method3548(var13);
                        client.field771 = 0;
                        client.field750 = class11.method111(var23);
                        if(client.field750 == null) {
                           client.field750 = "Null";
                        }

                        if(var23.field2622) {
                           client.field751 = var23.field2697 + class50.method1060(16777215);
                        } else {
                           client.field751 = class50.method1060('\uff00') + var23.field2710 + class50.method1060(16777215);
                        }
                     }

                     return;
                  }

                  if(var2 == 26) {
                     class9.method99();
                  } else {
                     class230 var21;
                     if(var2 == 28) {
                        var8 = class133.method3115(class169.field2231, client.field739.field1250);
                        var8.field2279.method3555(var1);
                        client.field739.method2019(var8);
                        var21 = class61.method1188(var1);
                        if(var21.field2736 != null && var21.field2736[0][0] == 5) {
                           var17 = var21.field2736[0][1];
                           class225.field2578[var17] = 1 - class225.field2578[var17];
                           class230.method4537(var17);
                        }
                     } else if(var2 == 29) {
                        var8 = class133.method3115(class169.field2231, client.field739.field1250);
                        var8.field2279.method3555(var1);
                        client.field739.method2019(var8);
                        var21 = class61.method1188(var1);
                        if(var21.field2736 != null && var21.field2736[0][0] == 5) {
                           var17 = var21.field2736[0][1];
                           if(class225.field2578[var17] != var21.field2738[0]) {
                              class225.field2578[var17] = var21.field2738[0];
                              class230.method4537(var17);
                           }
                        }
                     } else if(var2 == 30) {
                        if(client.field756 == null) {
                           var8 = class133.method3115(class169.field2225, client.field739.field1250);
                           var8.field2279.method3670(var1);
                           var8.field2279.method3605(var0);
                           client.field739.method2019(var8);
                           client.field756 = class21.method304(var1, var0);
                           class181.method3548(client.field756);
                        }
                     } else if(var2 == 31) {
                        var8 = class133.method3115(class169.field2209, client.field739.field1250);
                        var8.field2279.method3602(class59.field554);
                        var8.field2279.method3555(class174.field2296);
                        var8.field2279.method3725(var3);
                        var8.field2279.method3725(var0);
                        var8.field2279.method3641(var1);
                        var8.field2279.method3725(class24.field220);
                        client.field739.method2019(var8);
                        client.field698 = 0;
                        class144.field1921 = class61.method1188(var1);
                        client.field699 = var0;
                     } else if(var2 == 32) {
                        var8 = class133.method3115(class169.field2204, client.field739.field1250);
                        var8.field2279.method3641(var1);
                        var8.field2279.method3725(var3);
                        var8.field2279.method3707(client.field748);
                        var8.field2279.method3725(var0);
                        var8.field2279.method3750(class142.field1911);
                        client.field739.method2019(var8);
                        client.field698 = 0;
                        class144.field1921 = class61.method1188(var1);
                        client.field699 = var0;
                     } else if(var2 == 33) {
                        var8 = class133.method3115(class169.field2187, client.field739.field1250);
                        var8.field2279.method3605(var3);
                        var8.field2279.method3602(var0);
                        var8.field2279.method3641(var1);
                        client.field739.method2019(var8);
                        client.field698 = 0;
                        class144.field1921 = class61.method1188(var1);
                        client.field699 = var0;
                     } else if(var2 == 34) {
                        var8 = class133.method3115(class169.field2184, client.field739.field1250);
                        var8.field2279.method3670(var1);
                        var8.field2279.method3605(var0);
                        var8.field2279.method3602(var3);
                        client.field739.method2019(var8);
                        client.field698 = 0;
                        class144.field1921 = class61.method1188(var1);
                        client.field699 = var0;
                     } else if(var2 == 35) {
                        var8 = class133.method3115(class169.field2238, client.field739.field1250);
                        var8.field2279.method3605(var0);
                        var8.field2279.method3555(var1);
                        var8.field2279.method3707(var3);
                        client.field739.method2019(var8);
                        client.field698 = 0;
                        class144.field1921 = class61.method1188(var1);
                        client.field699 = var0;
                     } else if(var2 == 36) {
                        var8 = class133.method3115(class169.field2199, client.field739.field1250);
                        var8.field2279.method3707(var0);
                        var8.field2279.method3641(var1);
                        var8.field2279.method3707(var3);
                        client.field739.method2019(var8);
                        client.field698 = 0;
                        class144.field1921 = class61.method1188(var1);
                        client.field699 = var0;
                     } else if(var2 == 37) {
                        var8 = class133.method3115(class169.field2198, client.field739.field1250);
                        var8.field2279.method3605(var0);
                        var8.field2279.method3602(var3);
                        var8.field2279.method3670(var1);
                        client.field739.method2019(var8);
                        client.field698 = 0;
                        class144.field1921 = class61.method1188(var1);
                        client.field699 = var0;
                     } else {
                        if(var2 == 38) {
                           class23.method456();
                           var23 = class61.method1188(var1);
                           client.field771 = 1;
                           class59.field554 = var0;
                           class174.field2296 = var1;
                           class24.field220 = var3;
                           class181.method3548(var23);
                           client.field759 = class50.method1060(16748608) + class120.method2784(var3).field3449 + class50.method1060(16777215);
                           if(client.field759 == null) {
                              client.field759 = "null";
                           }

                           return;
                        }

                        if(var2 == 39) {
                           var8 = class133.method3115(class169.field2196, client.field739.field1250);
                           var8.field2279.method3707(var3);
                           var8.field2279.method3602(var0);
                           var8.field2279.method3641(var1);
                           client.field739.method2019(var8);
                           client.field698 = 0;
                           class144.field1921 = class61.method1188(var1);
                           client.field699 = var0;
                        } else if(var2 == 40) {
                           var8 = class133.method3115(class169.field2172, client.field739.field1250);
                           var8.field2279.method3602(var0);
                           var8.field2279.method3641(var1);
                           var8.field2279.method3707(var3);
                           client.field739.method2019(var8);
                           client.field698 = 0;
                           class144.field1921 = class61.method1188(var1);
                           client.field699 = var0;
                        } else if(var2 == 41) {
                           var8 = class133.method3115(class169.field2221, client.field739.field1250);
                           var8.field2279.method3555(var1);
                           var8.field2279.method3602(var3);
                           var8.field2279.method3707(var0);
                           client.field739.method2019(var8);
                           client.field698 = 0;
                           class144.field1921 = class61.method1188(var1);
                           client.field699 = var0;
                        } else if(var2 == 42) {
                           var8 = class133.method3115(class169.field2230, client.field739.field1250);
                           var8.field2279.method3605(var3);
                           var8.field2279.method3725(var0);
                           var8.field2279.method3670(var1);
                           client.field739.method2019(var8);
                           client.field698 = 0;
                           class144.field1921 = class61.method1188(var1);
                           client.field699 = var0;
                        } else if(var2 == 43) {
                           var8 = class133.method3115(class169.field2220, client.field739.field1250);
                           var8.field2279.method3602(var3);
                           var8.field2279.method3707(var0);
                           var8.field2279.method3555(var1);
                           client.field739.method2019(var8);
                           client.field698 = 0;
                           class144.field1921 = class61.method1188(var1);
                           client.field699 = var0;
                        } else if(var2 == 44) {
                           var22 = client.field806[var3];
                           if(var22 != null) {
                              client.field743 = var6;
                              client.field839 = var7;
                              client.field696 = 2;
                              client.field843 = 0;
                              client.field820 = var0;
                              client.field821 = var1;
                              var9 = class133.method3115(class169.field2213, client.field739.field1250);
                              var9.field2279.method3605(var3);
                              var9.field2279.method3594(class39.field340[82]?1:0);
                              client.field739.method2019(var9);
                           }
                        } else if(var2 == 45) {
                           var22 = client.field806[var3];
                           if(var22 != null) {
                              client.field743 = var6;
                              client.field839 = var7;
                              client.field696 = 2;
                              client.field843 = 0;
                              client.field820 = var0;
                              client.field821 = var1;
                              var9 = class133.method3115(class169.field2216, client.field739.field1250);
                              var9.field2279.method3595(class39.field340[82]?1:0);
                              var9.field2279.method3605(var3);
                              client.field739.method2019(var9);
                           }
                        } else if(var2 == 46) {
                           var22 = client.field806[var3];
                           if(var22 != null) {
                              client.field743 = var6;
                              client.field839 = var7;
                              client.field696 = 2;
                              client.field843 = 0;
                              client.field820 = var0;
                              client.field821 = var1;
                              var9 = class133.method3115(class169.field2160, client.field739.field1250);
                              var9.field2279.method3552(class39.field340[82]?1:0);
                              var9.field2279.method3707(var3);
                              client.field739.method2019(var9);
                           }
                        } else if(var2 == 47) {
                           var22 = client.field806[var3];
                           if(var22 != null) {
                              client.field743 = var6;
                              client.field839 = var7;
                              client.field696 = 2;
                              client.field843 = 0;
                              client.field820 = var0;
                              client.field821 = var1;
                              var9 = class133.method3115(class169.field2218, client.field739.field1250);
                              var9.field2279.method3552(class39.field340[82]?1:0);
                              var9.field2279.method3725(var3);
                              client.field739.method2019(var9);
                           }
                        } else if(var2 == 48) {
                           var22 = client.field806[var3];
                           if(var22 != null) {
                              client.field743 = var6;
                              client.field839 = var7;
                              client.field696 = 2;
                              client.field843 = 0;
                              client.field820 = var0;
                              client.field821 = var1;
                              var9 = class133.method3115(class169.field2233, client.field739.field1250);
                              var9.field2279.method3596(class39.field340[82]?1:0);
                              var9.field2279.method3707(var3);
                              client.field739.method2019(var9);
                           }
                        } else if(var2 == 49) {
                           var22 = client.field806[var3];
                           if(var22 != null) {
                              client.field743 = var6;
                              client.field839 = var7;
                              client.field696 = 2;
                              client.field843 = 0;
                              client.field820 = var0;
                              client.field821 = var1;
                              var9 = class133.method3115(class169.field2164, client.field739.field1250);
                              var9.field2279.method3707(var3);
                              var9.field2279.method3594(class39.field340[82]?1:0);
                              client.field739.method2019(var9);
                           }
                        } else if(var2 == 50) {
                           var22 = client.field806[var3];
                           if(var22 != null) {
                              client.field743 = var6;
                              client.field839 = var7;
                              client.field696 = 2;
                              client.field843 = 0;
                              client.field820 = var0;
                              client.field821 = var1;
                              var9 = class133.method3115(class169.field2180, client.field739.field1250);
                              var9.field2279.method3725(var3);
                              var9.field2279.method3594(class39.field340[82]?1:0);
                              client.field739.method2019(var9);
                           }
                        } else if(var2 == 51) {
                           var22 = client.field806[var3];
                           if(var22 != null) {
                              client.field743 = var6;
                              client.field839 = var7;
                              client.field696 = 2;
                              client.field843 = 0;
                              client.field820 = var0;
                              client.field821 = var1;
                              var9 = class133.method3115(class169.field2203, client.field739.field1250);
                              var9.field2279.method3595(class39.field340[82]?1:0);
                              var9.field2279.method3602(var3);
                              client.field739.method2019(var9);
                           }
                        } else {
                           label1076: {
                              if(var2 != 57) {
                                 if(var2 == 58) {
                                    var23 = class21.method304(var1, var0);
                                    if(var23 != null) {
                                       var9 = class133.method3115(class169.field2194, client.field739.field1250);
                                       var9.field2279.method3750(var1);
                                       var9.field2279.method3670(class142.field1911);
                                       var9.field2279.method3725(var0);
                                       var9.field2279.method3605(client.field748);
                                       var9.field2279.method3605(var23.field2754);
                                       var9.field2279.method3605(client.field749);
                                       client.field739.method2019(var9);
                                    }
                                    break label1076;
                                 }

                                 if(var2 == 1001) {
                                    client.field743 = var6;
                                    client.field839 = var7;
                                    client.field696 = 2;
                                    client.field843 = 0;
                                    client.field820 = var0;
                                    client.field821 = var1;
                                    var8 = class133.method3115(class169.field2175, client.field739.field1250);
                                    var8.field2279.method3605(class71.field1051 + var1);
                                    var8.field2279.method3595(class39.field340[82]?1:0);
                                    var8.field2279.method3725(var0 + class178.field2315);
                                    var8.field2279.method3725(var3);
                                    client.field739.method2019(var8);
                                    break label1076;
                                 }

                                 if(var2 == 1002) {
                                    client.field743 = var6;
                                    client.field839 = var7;
                                    client.field696 = 2;
                                    client.field843 = 0;
                                    var8 = class133.method3115(class169.field2241, client.field739.field1250);
                                    var8.field2279.method3605(var3);
                                    client.field739.method2019(var8);
                                    break label1076;
                                 }

                                 if(var2 == 1003) {
                                    client.field743 = var6;
                                    client.field839 = var7;
                                    client.field696 = 2;
                                    client.field843 = 0;
                                    var19 = client.field807[var3];
                                    if(var19 != null) {
                                       class271 var24 = var19.field1058;
                                       if(var24.field3529 != null) {
                                          var24 = var24.method5186();
                                       }

                                       if(var24 != null) {
                                          var10 = class133.method3115(class169.field2236, client.field739.field1250);
                                          var10.field2279.method3605(var24.field3503);
                                          client.field739.method2019(var10);
                                       }
                                    }
                                    break label1076;
                                 }

                                 if(var2 == 1004) {
                                    client.field743 = var6;
                                    client.field839 = var7;
                                    client.field696 = 2;
                                    client.field843 = 0;
                                    var8 = class133.method3115(class169.field2252, client.field739.field1250);
                                    var8.field2279.method3707(var3);
                                    client.field739.method2019(var8);
                                    break label1076;
                                 }

                                 if(var2 == 1005) {
                                    var23 = class61.method1188(var1);
                                    if(var23 != null && var23.field2743[var0] >= 100000) {
                                       class61.method1189(27, "", var23.field2743[var0] + " x " + class120.method2784(var3).field3449);
                                    } else {
                                       var9 = class133.method3115(class169.field2252, client.field739.field1250);
                                       var9.field2279.method3707(var3);
                                       client.field739.method2019(var9);
                                    }

                                    client.field698 = 0;
                                    class144.field1921 = class61.method1188(var1);
                                    client.field699 = var0;
                                    break label1076;
                                 }

                                 if(var2 != 1007) {
                                    if(var2 == 1011 || var2 == 1010 || var2 == 1008 || var2 == 1009 || var2 == 1012) {
                                       class66.field987.method6103(var2, var3, new class226(var0), new class226(var1));
                                    }
                                    break label1076;
                                 }
                              }

                              var23 = class21.method304(var1, var0);
                              if(var23 != null) {
                                 var25 = var23.field2754;
                                 class230 var20 = class21.method304(var1, var0);
                                 if(var20 != null) {
                                    if(var20.field2610 != null) {
                                       class56 var11 = new class56();
                                       var11.field511 = var20;
                                       var11.field514 = var3;
                                       var11.field509 = var5;
                                       var11.field525 = var20.field2610;
                                       class67.method1728(var11);
                                    }

                                    boolean var16 = true;
                                    if(var20.field2711 > 0) {
                                       var16 = class15.method163(var20);
                                    }

                                    if(var16 && class150.method3219(class95.method2252(var20), var3 - 1)) {
                                       class172 var12;
                                       if(var3 == 1) {
                                          var12 = class133.method3115(class169.field2224, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 2) {
                                          var12 = class133.method3115(class169.field2174, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 3) {
                                          var12 = class133.method3115(class169.field2158, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 4) {
                                          var12 = class133.method3115(class169.field2171, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 5) {
                                          var12 = class133.method3115(class169.field2226, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 6) {
                                          var12 = class133.method3115(class169.field2177, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 7) {
                                          var12 = class133.method3115(class169.field2178, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 8) {
                                          var12 = class133.method3115(class169.field2229, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 9) {
                                          var12 = class133.method3115(class169.field2215, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }

                                       if(var3 == 10) {
                                          var12 = class133.method3115(class169.field2245, client.field739.field1250);
                                          var12.field2279.method3555(var1);
                                          var12.field2279.method3602(var0);
                                          var12.field2279.method3602(var25);
                                          client.field739.method2019(var12);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if(client.field771 != 0) {
         client.field771 = 0;
         class181.method3548(class61.method1188(class174.field2296));
      }

      if(client.field813) {
         class23.method456();
      }

      if(class144.field1921 != null && client.field698 == 0) {
         class181.method3548(class144.field1921);
      }

   }
}
