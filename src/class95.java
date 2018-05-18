import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public class class95 {

   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -397814515
   )
   public static int field1330;
   @ObfuscatedName("n")
   protected static boolean field1321;
   @ObfuscatedName("x")
   static ScheduledExecutorService field1323;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -743750755
   )
   static int field1324;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lck;"
   )
   static class89 field1339;
   @ObfuscatedName("p")
   protected int[] field1327;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldu;"
   )
   class105 field1328;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -759205163
   )
   int field1329 = 32;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      longValue = -913623916545243455L
   )
   long field1334 = class166.method3456();
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2024020127
   )
   int field1331;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -4910637
   )
   int field1322;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 700532029
   )
   int field1332;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      longValue = -5023377774405903021L
   )
   long field1320 = 0L;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -5737955
   )
   int field1326 = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 741309427
   )
   int field1335 = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1986148097
   )
   int field1337 = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      longValue = -5722049471560573075L
   )
   long field1338 = 0L;
   @ObfuscatedName("o")
   boolean field1333 = true;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1008236685
   )
   int field1340 = 0;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "[Ldu;"
   )
   class105[] field1341 = new class105[8];
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "[Ldu;"
   )
   class105[] field1342 = new class105[8];


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2011832996"
   )
   protected void vmethod2190() throws Exception {}

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "4"
   )
   protected void vmethod2200(int var1) throws Exception {}

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1202910483"
   )
   protected int vmethod2201() throws Exception {
      return this.field1331;
   }

   @ObfuscatedName("x")
   protected void vmethod2202() throws Exception {}

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "82"
   )
   protected void vmethod2203() {}

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2019010178"
   )
   protected void vmethod2204() throws Exception {}

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ldu;B)V",
      garbageValue = "102"
   )
   public final synchronized void method2226(class105 var1) {
      this.field1328 = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1112855945"
   )
   public final synchronized void method2192() {
      if(this.field1327 != null) {
         long var1 = class166.method3456();

         try {
            if(0L != this.field1320) {
               if(var1 < this.field1320) {
                  return;
               }

               this.vmethod2200(this.field1331);
               this.field1320 = 0L;
               this.field1333 = true;
            }

            int var3 = this.vmethod2201();
            if(this.field1337 - var3 > this.field1326) {
               this.field1326 = this.field1337 - var3;
            }

            int var4 = this.field1332 + this.field1322;
            if(var4 + 256 > 16384) {
               var4 = 16128;
            }

            if(var4 + 256 > this.field1331) {
               this.field1331 += 1024;
               if(this.field1331 > 16384) {
                  this.field1331 = 16384;
               }

               this.vmethod2203();
               this.vmethod2200(this.field1331);
               var3 = 0;
               this.field1333 = true;
               if(var4 + 256 > this.field1331) {
                  var4 = this.field1331 - 256;
                  this.field1332 = var4 - this.field1322;
               }
            }

            while(var3 < var4) {
               this.method2250(this.field1327, 256);
               this.vmethod2202();
               var3 += 256;
            }

            if(var1 > this.field1338) {
               if(!this.field1333) {
                  if(this.field1326 == 0 && this.field1335 == 0) {
                     this.vmethod2203();
                     this.field1320 = 2000L + var1;
                     return;
                  }

                  this.field1332 = Math.min(this.field1335, this.field1326);
                  this.field1335 = this.field1326;
               } else {
                  this.field1333 = false;
               }

               this.field1326 = 0;
               this.field1338 = var1 + 2000L;
            }

            this.field1337 = var3;
         } catch (Exception var7) {
            this.vmethod2203();
            this.field1320 = var1 + 2000L;
         }

         try {
            if(var1 > 500000L + this.field1334) {
               var1 = this.field1334;
            }

            while(var1 > this.field1334 + 5000L) {
               this.method2196(256);
               this.field1334 += (long)(256000 / field1330);
            }
         } catch (Exception var6) {
            this.field1334 = var1;
         }

      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1529143507"
   )
   public final void method2193() {
      this.field1333 = true;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2058489673"
   )
   public final synchronized void method2251() {
      this.field1333 = true;

      try {
         this.vmethod2204();
      } catch (Exception var2) {
         this.vmethod2203();
         this.field1320 = class166.method3456() + 2000L;
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "720259050"
   )
   public final synchronized void method2195() {
      if(class231.field2763 != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if(this == class231.field2763.field1355[var2]) {
               class231.field2763.field1355[var2] = null;
            }

            if(class231.field2763.field1355[var2] != null) {
               var1 = false;
            }
         }

         if(var1) {
            field1323.shutdownNow();
            field1323 = null;
            class231.field2763 = null;
         }
      }

      this.vmethod2203();
      this.field1327 = null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "29623"
   )
   final void method2196(int var1) {
      this.field1340 -= var1;
      if(this.field1340 < 0) {
         this.field1340 = 0;
      }

      if(this.field1328 != null) {
         this.field1328.vmethod4425(var1);
      }

   }

   @ObfuscatedName("ao")
   final void method2250(int[] var1, int var2) {
      int var3 = var2;
      if(field1321) {
         var3 = var2 << 1;
      }

      class193.method3935(var1, 0, var3);
      this.field1340 -= var2;
      if(this.field1328 != null && this.field1340 <= 0) {
         this.field1340 += field1330 >> 4;
         class19.method222(this.field1328);
         this.method2198(this.field1328, this.field1328.vmethod2484());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class105 var10;
         label99:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class105 var11 = this.field1341[var7];

                  while(var11 != null) {
                     class108 var12 = var11.field1408;
                     if(var12 != null && var12.field1440 > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.field1407;
                     } else {
                        var11.field1409 = true;
                        int var13 = var11.vmethod4423();
                        var4 += var13;
                        if(var12 != null) {
                           var12.field1440 += var13;
                        }

                        if(var4 >= this.field1329) {
                           break label99;
                        }

                        class105 var14 = var11.vmethod4421();
                        if(var14 != null) {
                           for(int var15 = var11.field1406; var14 != null; var14 = var11.vmethod4422()) {
                              this.method2198(var14, var15 * var14.vmethod2484() >> 8);
                           }
                        }

                        class105 var18 = var11.field1407;
                        var11.field1407 = null;
                        if(var10 == null) {
                           this.field1341[var7] = var18;
                        } else {
                           var10.field1407 = var18;
                        }

                        if(var18 == null) {
                           this.field1342[var7] = var10;
                        }

                        var11 = var18;
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class105 var16 = this.field1341[var6];
            class105[] var17 = this.field1341;
            this.field1342[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field1407;
               var16.field1407 = null;
            }
         }
      }

      if(this.field1340 < 0) {
         this.field1340 = 0;
      }

      if(this.field1328 != null) {
         this.field1328.vmethod4424(var1, 0, var2);
      }

      this.field1334 = class166.method3456();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Ldu;II)V",
      garbageValue = "1162362988"
   )
   final void method2198(class105 var1, int var2) {
      int var3 = var2 >> 5;
      class105 var4 = this.field1342[var3];
      if(var4 == null) {
         this.field1341[var3] = var1;
      } else {
         var4.field1407 = var1;
      }

      this.field1342[var3] = var1;
      var1.field1406 = var2;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1294539883"
   )
   public static final boolean method2208() {
      class39 var0 = class39.field350;
      synchronized(class39.field350) {
         if(class39.field348 == class39.field342) {
            return false;
         } else {
            class128.field1813 = class39.field339[class39.field342];
            class132.field1846 = class39.field344[class39.field342];
            class39.field342 = class39.field342 + 1 & 127;
            return true;
         }
      }
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2063770804"
   )
   static final void method2253() {
      class125.field1760 = false;
      client.field708 = false;
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "(Lhl;B)I",
      garbageValue = "-40"
   )
   static int method2252(class230 var0) {
      class211 var1 = (class211)client.field816.method4064(((long)var0.field2623 << 32) + (long)var0.field2633);
      return var1 != null?var1.field2464:var0.field2696;
   }
}
