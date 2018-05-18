import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class130 extends class206 {

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field1824;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Ldc;"
   )
   class117[] field1825;


   @ObfuscatedSignature(
      signature = "(Liv;Liv;IZ)V"
   )
   class130(class247 var1, class247 var2, int var3, boolean var4) {
      class205 var5 = new class205();
      int var6 = var1.method4638(var3);
      this.field1825 = new class117[var6];
      int[] var7 = var1.method4648(var3);
      int var8 = 0;

      while(var8 < var7.length) {
         byte[] var9 = var1.method4626(var3, var7[var8]);
         class124 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;
         class124 var12 = (class124)var5.method4113();

         while(true) {
            if(var12 != null) {
               if(var11 != var12.field1738) {
                  var12 = (class124)var5.method4104();
                  continue;
               }

               var10 = var12;
            }

            if(var10 == null) {
               byte[] var13;
               if(var4) {
                  var13 = var2.method4634(0, var11);
               } else {
                  var13 = var2.method4634(var11, 0);
               }

               var10 = new class124(var11, var13);
               var5.method4126(var10);
            }

            this.field1825[var7[var8]] = new class117(var9, var10);
            ++var8;
            break;
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "230121638"
   )
   public boolean method3085(int var1) {
      return this.field1825[var1].field1575;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1774422897"
   )
   static void method3084() {
      class251.field3229 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = class1.method15((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F));
         class251.field3229[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < class251.field3229.length; var1 -= var5) {
         var3 = var0 * 2;

         for(int var4 = class1.method15((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class251.field3229.length; ++var0) {
            class251.field3229[var0] = var4;
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)Ljava/lang/String;",
      garbageValue = "-759113708"
   )
   public static String method3087(byte[] var0) {
      int var2 = var0.length;
      StringBuilder var3 = new StringBuilder();

      for(int var4 = 0; var4 < var2 + 0; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class304.field3736[var5 >>> 2]);
         if(var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class304.field3736[(var5 & 3) << 4 | var6 >>> 4]);
            if(var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class304.field3736[(var6 & 15) << 2 | var7 >>> 6]).append(class304.field3736[var7 & 63]);
            } else {
               var3.append(class304.field3736[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class304.field3736[(var5 & 3) << 4]).append("==");
         }
      }

      String var1 = var3.toString();
      return var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "279055576"
   )
   public static void method3092() {
      class258.field3300.method4024();
      class258.field3299.method4024();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "48"
   )
   public static boolean method3095(char var0) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-793987681"
   )
   static final void method3094(String var0) {
      class164.method3448(var0 + " is already on your friend list");
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1163381700"
   )
   static final void method3091() {
      if(class27.field245) {
         if(class0.field2 != null) {
            class0.field2.method5383();
         }

         class15.method161();
         class27.field245 = false;
      }

   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      signature = "(ZLge;I)V",
      garbageValue = "687346891"
   )
   static final void method3096(boolean var0, class189 var1) {
      while(true) {
         if(var1.method3873(client.field739.field1247) >= 27) {
            int var2 = var1.method3871(15);
            if(var2 != 32767) {
               boolean var3 = false;
               if(client.field807[var2] == null) {
                  client.field807[var2] = new class72();
                  var3 = true;
               }

               class72 var4 = client.field807[var2];
               client.field636[++client.field635 - 1] = var2;
               var4.field932 = client.field679;
               int var5;
               if(var0) {
                  var5 = var1.method3871(8);
                  if(var5 > 127) {
                     var5 -= 256;
                  }
               } else {
                  var5 = var1.method3871(5);
                  if(var5 > 15) {
                     var5 -= 32;
                  }
               }

               int var6 = var1.method3871(1);
               if(var6 == 1) {
                  client.field638[++client.field637 - 1] = var2;
               }

               int var7 = client.field665[var1.method3871(3)];
               if(var3) {
                  var4.field934 = var4.field883 = var7;
               }

               int var8 = var1.method3871(1);
               int var9;
               if(var0) {
                  var9 = var1.method3871(8);
                  if(var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.method3871(5);
                  if(var9 > 15) {
                     var9 -= 32;
                  }
               }

               var4.field1058 = class59.method1125(var1.method3871(14));
               var4.field885 = var4.field1058.field3519;
               var4.field929 = var4.field1058.field3528;
               if(var4.field929 == 0) {
                  var4.field883 = 0;
               }

               var4.field890 = var4.field1058.field3511;
               var4.field891 = var4.field1058.field3512;
               var4.field882 = var4.field1058.field3518;
               var4.field893 = var4.field1058.field3514;
               var4.field909 = var4.field1058.field3517;
               var4.field892 = var4.field1058.field3509;
               var4.field889 = var4.field1058.field3499;
               var4.method1823(class150.field1948.field928[0] + var5, class150.field1948.field939[0] + var9, var8 == 1);
               continue;
            }
         }

         var1.method3872();
         return;
      }
   }
}
