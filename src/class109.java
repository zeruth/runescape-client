import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class109 {

   @ObfuscatedName("qr")
   @ObfuscatedSignature(
      signature = "Lbm;"
   )
   public static class67 field1453;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ldw;"
   )
   class110 field1442;
   @ObfuscatedName("m")
   byte[] field1451;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = 79894814711093239L
   )
   long field1443 = -1L;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1152552109
   )
   int field1450;
   @ObfuscatedName("f")
   byte[] field1452;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = -5782506921457900227L
   )
   long field1445 = -1L;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1131433535
   )
   int field1447 = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = -7476910008420183513L
   )
   long field1448;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      longValue = 5226289285948649811L
   )
   long field1449;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = 8930523000186473743L
   )
   long field1446;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = 1367430875267670415L
   )
   long field1444;


   @ObfuscatedSignature(
      signature = "(Ldw;II)V"
   )
   public class109(class110 var1, int var2, int var3) throws IOException {
      this.field1442 = var1;
      this.field1446 = this.field1449 = var1.method2574();
      this.field1451 = new byte[var2];
      this.field1452 = new byte[var3];
      this.field1448 = 0L;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-776871131"
   )
   public void method2520() throws IOException {
      this.method2527();
      this.field1442.method2564();
   }

   @ObfuscatedName("m")
   public void method2521(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.field1448 = var1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-1366209319"
   )
   public long method2531() {
      return this.field1446;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "-88"
   )
   public void method2541(byte[] var1) throws IOException {
      this.method2528(var1, 0, var1.length);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "([BIIS)V",
      garbageValue = "255"
   )
   public void method2528(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(this.field1445 != -1L && this.field1448 >= this.field1445 && this.field1448 + (long)var3 <= (long)this.field1447 + this.field1445) {
            System.arraycopy(this.field1452, (int)(this.field1448 - this.field1445), var1, var2, var3);
            this.field1448 += (long)var3;
            return;
         }

         long var4 = this.field1448;
         int var7 = var3;
         int var8;
         if(this.field1448 >= this.field1443 && this.field1448 < (long)this.field1450 + this.field1443) {
            var8 = (int)((long)this.field1450 - (this.field1448 - this.field1443));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field1451, (int)(this.field1448 - this.field1443), var1, var2, var8);
            this.field1448 += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.field1451.length) {
            this.field1442.method2555(this.field1448);

            for(this.field1444 = this.field1448; var3 > 0; var3 -= var8) {
               var8 = this.field1442.method2560(var1, var2, var3);
               if(var8 == -1) {
                  break;
               }

               this.field1444 += (long)var8;
               this.field1448 += (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.method2529();
            var8 = var3;
            if(var3 > this.field1450) {
               var8 = this.field1450;
            }

            System.arraycopy(this.field1451, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field1448 += (long)var8;
         }

         if(-1L != this.field1445) {
            if(this.field1445 > this.field1448 && var3 > 0) {
               var8 = var2 + (int)(this.field1445 - this.field1448);
               if(var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field1448;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if(this.field1445 >= var4 && this.field1445 < (long)var7 + var4) {
               var13 = this.field1445;
            } else if(var4 >= this.field1445 && var4 < this.field1445 + (long)this.field1447) {
               var13 = var4;
            }

            if((long)this.field1447 + this.field1445 > var4 && (long)this.field1447 + this.field1445 <= (long)var7 + var4) {
               var10 = (long)this.field1447 + this.field1445;
            } else if((long)var7 + var4 > this.field1445 && var4 + (long)var7 <= this.field1445 + (long)this.field1447) {
               var10 = var4 + (long)var7;
            }

            if(var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.field1452, (int)(var13 - this.field1445), var1, (int)(var13 - var4) + var2, var12);
               if(var10 > this.field1448) {
                  var3 = (int)((long)var3 - (var10 - this.field1448));
                  this.field1448 = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.field1444 = -1L;
         throw var16;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "6"
   )
   void method2529() throws IOException {
      this.field1450 = 0;
      if(this.field1448 != this.field1444) {
         this.field1442.method2555(this.field1448);
         this.field1444 = this.field1448;
      }

      int var1;
      for(this.field1443 = this.field1448; this.field1450 < this.field1451.length; this.field1450 += var1) {
         var1 = this.field1442.method2560(this.field1451, this.field1450, this.field1451.length - this.field1450);
         if(var1 == -1) {
            break;
         }

         this.field1444 += (long)var1;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "8"
   )
   public void method2526(byte[] var1, int var2, int var3) throws IOException {
      try {
         if((long)var3 + this.field1448 > this.field1446) {
            this.field1446 = (long)var3 + this.field1448;
         }

         if(this.field1445 != -1L && (this.field1448 < this.field1445 || this.field1448 > this.field1445 + (long)this.field1447)) {
            this.method2527();
         }

         if(this.field1445 != -1L && (long)var3 + this.field1448 > (long)this.field1452.length + this.field1445) {
            int var4 = (int)((long)this.field1452.length - (this.field1448 - this.field1445));
            System.arraycopy(var1, var2, this.field1452, (int)(this.field1448 - this.field1445), var4);
            this.field1448 += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.field1447 = this.field1452.length;
            this.method2527();
         }

         if(var3 <= this.field1452.length) {
            if(var3 > 0) {
               if(-1L == this.field1445) {
                  this.field1445 = this.field1448;
               }

               System.arraycopy(var1, var2, this.field1452, (int)(this.field1448 - this.field1445), var3);
               this.field1448 += (long)var3;
               if(this.field1448 - this.field1445 > (long)this.field1447) {
                  this.field1447 = (int)(this.field1448 - this.field1445);
               }

            }
         } else {
            if(this.field1448 != this.field1444) {
               this.field1442.method2555(this.field1448);
               this.field1444 = this.field1448;
            }

            this.field1442.method2556(var1, var2, var3);
            this.field1444 += (long)var3;
            if(this.field1444 > this.field1449) {
               this.field1449 = this.field1444;
            }

            long var9 = -1L;
            long var6 = -1L;
            if(this.field1448 >= this.field1443 && this.field1448 < (long)this.field1450 + this.field1443) {
               var9 = this.field1448;
            } else if(this.field1443 >= this.field1448 && this.field1443 < (long)var3 + this.field1448) {
               var9 = this.field1443;
            }

            if((long)var3 + this.field1448 > this.field1443 && this.field1448 + (long)var3 <= this.field1443 + (long)this.field1450) {
               var6 = (long)var3 + this.field1448;
            } else if(this.field1443 + (long)this.field1450 > this.field1448 && (long)this.field1450 + this.field1443 <= (long)var3 + this.field1448) {
               var6 = this.field1443 + (long)this.field1450;
            }

            if(var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)(var9 + (long)var2 - this.field1448), this.field1451, (int)(var9 - this.field1443), var8);
            }

            this.field1448 += (long)var3;
         }
      } catch (IOException var12) {
         this.field1444 = -1L;
         throw var12;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1749709188"
   )
   void method2527() throws IOException {
      if(this.field1445 != -1L) {
         if(this.field1444 != this.field1445) {
            this.field1442.method2555(this.field1445);
            this.field1444 = this.field1445;
         }

         this.field1442.method2556(this.field1452, 0, this.field1447);
         this.field1444 += (long)(this.field1447 * 1912644031) * 1131433535L;
         if(this.field1444 > this.field1449) {
            this.field1449 = this.field1444;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.field1445 >= this.field1443 && this.field1445 < this.field1443 + (long)this.field1450) {
            var1 = this.field1445;
         } else if(this.field1443 >= this.field1445 && this.field1443 < this.field1445 + (long)this.field1447) {
            var1 = this.field1443;
         }

         if(this.field1445 + (long)this.field1447 > this.field1443 && this.field1445 + (long)this.field1447 <= (long)this.field1450 + this.field1443) {
            var3 = this.field1445 + (long)this.field1447;
         } else if((long)this.field1450 + this.field1443 > this.field1445 && (long)this.field1450 + this.field1443 <= this.field1445 + (long)this.field1447) {
            var3 = (long)this.field1450 + this.field1443;
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field1452, (int)(var1 - this.field1445), this.field1451, (int)(var1 - this.field1443), var5);
         }

         this.field1445 = -1L;
         this.field1447 = 0;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;Lgx;I)Lgx;",
      garbageValue = "-1971083675"
   )
   static final class197 method2525(class182 var0, class197 var1) {
      int var2 = var0.method3742();
      int var3;
      if(var1 == null) {
         var3 = class81.method1922(var2);
         var1 = new class197(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.method3742() == 1;
         int var5 = var0.method3572();
         Object var6;
         if(var4) {
            var6 = new class195(var0.method3577());
         } else {
            var6 = new class211(var0.method3573());
         }

         var1.method3992((class204)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-1854065562"
   )
   public static int method2553(int var0, int var1, int var2) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)J",
      garbageValue = "591361198"
   )
   public static long method2522(int var0) {
      return class120.field1688[var0];
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "378951678"
   )
   static void method2549() {
      client.field739.method2020();
      client.field739.field1254.field2359 = 0;
      client.field739.field1246 = null;
      client.field739.field1251 = null;
      client.field739.field1245 = null;
      client.field739.field1253 = null;
      client.field739.field1247 = 0;
      client.field739.field1249 = 0;
      client.field643 = 0;
      client.field657 = 0;
      client.field846 = false;
      client.field822 = 0;
      client.field820 = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         client.field806[var0] = null;
      }

      class150.field1948 = null;

      for(var0 = 0; var0 < client.field807.length; ++var0) {
         class72 var1 = client.field807[var0];
         if(var1 != null) {
            var1.field935 = -1;
            var1.field910 = false;
         }
      }

      class53.field478 = new class202(32);
      class102.method2310(30);

      for(var0 = 0; var0 < 100; ++var0) {
         client.field795[var0] = true;
      }

      class172 var3 = class133.method3115(class169.field2206, client.field739.field1250);
      class189 var4 = var3.field2279;
      int var2 = client.field675?2:1;
      var4.method3552(var2);
      var3.field2279.method3602(class9.field70);
      var3.field2279.method3602(class37.field326);
      client.field739.method2019(var3);
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)Ljava/lang/String;",
      garbageValue = "-1872122983"
   )
   static String method2551(String var0, boolean var1) {
      String var2 = var1?"https://":"http://";
      if(client.field596 == 1) {
         var0 = var0 + "-wtrc";
      } else if(client.field596 == 2) {
         var0 = var0 + "-wtqa";
      } else if(client.field596 == 3) {
         var0 = var0 + "-wtwip";
      } else if(client.field596 == 5) {
         var0 = var0 + "-wti";
      } else if(client.field596 == 4) {
         var0 = "local";
      }

      String var3 = "";
      if(class40.field357 != null) {
         var3 = "/p=" + class40.field357;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + client.field599 + "/a=" + class25.field231 + var3 + "/";
   }
}
