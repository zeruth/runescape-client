import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public abstract class class16 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -394254045
   )
   int field131;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 113242555
   )
   int field135;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -115293407
   )
   int field141;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -542251137
   )
   int field132;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1746992555
   )
   int field133;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1123040571
   )
   int field134;
   @ObfuscatedName("h")
   short[][][] field129;
   @ObfuscatedName("x")
   short[][][] field130;
   @ObfuscatedName("j")
   byte[][][] field137;
   @ObfuscatedName("a")
   byte[][][] field138;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[[[[Lu;"
   )
   class19[][][][] field139;


   class16() {
      new LinkedList();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IILgy;I)V",
      garbageValue = "-654618120"
   )
   void method165(int var1, int var2, class182 var3) {
      int var4 = var3.method3742();
      if(var4 != 0) {
         if((var4 & 1) != 0) {
            this.method167(var1, var2, var3, var4);
         } else {
            this.method175(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IILgy;II)V",
      garbageValue = "-1325628856"
   )
   void method167(int var1, int var2, class182 var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if(var5) {
         this.field130[0][var1][var2] = (short)var3.method3742();
      }

      this.field129[0][var1][var2] = (short)var3.method3742();
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IILgy;II)V",
      garbageValue = "-1146297648"
   )
   void method175(int var1, int var2, class182 var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.field129[0][var1][var2] = (short)var3.method3742();
      int var8;
      int var9;
      int var11;
      if(var6) {
         var8 = var3.method3742();

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.method3742();
            if(var10 != 0) {
               this.field130[var9][var1][var2] = (short)var10;
               var11 = var3.method3742();
               this.field137[var9][var1][var2] = (byte)(var11 >> 2);
               this.field138[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if(var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.method3742();
            if(var9 != 0) {
               class19[] var14 = this.field139[var8][var1][var2] = new class19[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method3585();
                  int var13 = var3.method3742();
                  var14[var11] = new class19(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-359965470"
   )
   int method168(int var1, int var2) {
      return var1 >= 0 && var2 >= 0?(var1 < 64 && var2 < 64?this.field129[0][var1][var2] - 1:-1):-1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1875239894"
   )
   int method182() {
      return this.field141;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1199787934"
   )
   int method170() {
      return this.field132;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "825820954"
   )
   static final int method185(int var0, int var1) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "713832417"
   )
   static void method186() {
      client.field605 = -1L;
      client.field608 = -1;
      class257.field3282.field533 = 0;
      class66.field978 = true;
      client.field609 = true;
      client.field782 = -1L;
      class313.field3762 = new class203();
      client.field739.method2020();
      client.field739.field1254.field2359 = 0;
      client.field739.field1246 = null;
      client.field739.field1251 = null;
      client.field739.field1245 = null;
      client.field739.field1253 = null;
      client.field739.field1247 = 0;
      client.field739.field1249 = 0;
      client.field643 = 0;
      client.field688 = 0;
      client.field858 = 0;
      client.field657 = 0;
      client.field846 = false;
      class59.method1120(0);
      class77.method1855();
      client.field771 = 0;
      client.field813 = false;
      client.field598 = 0;
      client.field662 = 0;
      client.field678 = 0;
      class8.field53 = null;
      client.field822 = 0;
      client.field815 = -1;
      client.field820 = 0;
      client.field821 = 0;
      client.field620 = class77.field1094;
      client.field621 = class77.field1094;
      client.field635 = 0;
      client.method1525();

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         client.field806[var0] = null;
      }

      for(var0 = 0; var0 < '\u8000'; ++var0) {
         client.field807[var0] = null;
      }

      client.field719 = -1;
      client.field722.method4105();
      client.field660.method4105();

      int var2;
      for(var0 = 0; var0 < 4; ++var0) {
         for(int var1 = 0; var1 < 104; ++var1) {
            for(var2 = 0; var2 < 104; ++var2) {
               client.field720[var0][var1][var2] = null;
            }
         }
      }

      client.field721 = new class205();
      class109.field1453.method1667();

      for(var0 = 0; var0 < class254.field3251; ++var0) {
         class254 var4 = (class254)class254.field3252.method4023((long)var0);
         class254 var5;
         if(var4 != null) {
            var5 = var4;
         } else {
            byte[] var3 = class254.field3254.method4626(16, var0);
            var4 = new class254();
            if(var3 != null) {
               var4.method4821(new class182(var3));
            }

            class254.field3252.method4028(var4, (long)var0);
            var5 = var4;
         }

         if(var5 != null) {
            class225.field2576[var0] = 0;
            class225.field2578[var0] = 0;
         }
      }

      class242.field3144.method1963();
      client.field760 = -1;
      if(client.field752 != -1) {
         class17.method190(client.field752);
      }

      for(class55 var6 = (class55)client.field826.method4055(); var6 != null; var6 = (class55)client.field826.method4056()) {
         class21.method300(var6, true);
      }

      client.field752 = -1;
      client.field826 = new class202(8);
      client.field756 = null;
      client.field657 = 0;
      client.field846 = false;
      client.field853.method4485((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

      for(var0 = 0; var0 < 8; ++var0) {
         client.field650[var0] = null;
         client.field850[var0] = false;
      }

      class53.field478 = new class202(32);
      client.field603 = true;

      for(var0 = 0; var0 < 100; ++var0) {
         client.field795[var0] = true;
      }

      class172 var8 = class133.method3115(class169.field2206, client.field739.field1250);
      class189 var7 = var8.field2279;
      var2 = client.field675?2:1;
      var7.method3552(var2);
      var8.field2279.method3602(class9.field70);
      var8.field2279.method3602(class37.field326);
      client.field739.method2019(var8);
      class0.field2 = null;

      for(var0 = 0; var0 < 8; ++var0) {
         client.field856[var0] = new class4();
      }

      class173.field2291 = null;
   }

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZS)V",
      garbageValue = "-7094"
   )
   static final void method187(String var0, boolean var1) {
      if(client.field715) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = class56.field524.method5538(var0, 250);
         int var6 = class56.field524.method5539(var0, 250) * 13;
         class314.method5835(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0);
         class314.method5778(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215);
         class56.field524.method5595(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         class34.method626(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2);
         if(var1) {
            class50.field455.vmethod5851(0, 0);
         } else {
            class243.method4608(var3, var4, var5, var6);
         }

      }
   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-99"
   )
   static boolean method188() {
      return (client.field712 & 4) != 0;
   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)V",
      garbageValue = "121"
   )
   static void method189(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < class49.field443; ++var4) {
         class269 var5 = class120.method2784(var4);
         if((!var1 || var5.field3489) && var5.field3460 == -1 && var5.field3449.toLowerCase().indexOf(var0) != -1) {
            if(var3 >= 250) {
               class28.field256 = -1;
               class137.field1889 = null;
               return;
            }

            if(var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      class137.field1889 = var2;
      class56.field522 = 0;
      class28.field256 = var3;
      String[] var8 = new String[class28.field256];

      for(int var9 = 0; var9 < class28.field256; ++var9) {
         var8[var9] = class120.method2784(var2[var9]).field3449;
      }

      class140.method3173(var8, class137.field1889);
   }
}
