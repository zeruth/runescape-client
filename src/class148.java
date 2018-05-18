import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class148 implements class147 {

   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1724878657
   )
   static int field1936;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Ljf;",
      garbageValue = "-1080549342"
   )
   public static class272 method3204(int var0) {
      class272 var1 = (class272)class272.field3537.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class272.field3539.method4626(4, var0);
         var1 = new class272();
         if(var2 != null) {
            var1.method5201(new class182(var2), var0);
         }

         var1.method5202();
         class272.field3537.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)[B",
      garbageValue = "-1986129501"
   )
   public static byte[] method3203(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if((var4 <= 0 || var4 >= 128) && (var4 < 160 || var4 > 255)) {
            if(var4 == 8364) {
               var2[var3] = -128;
            } else if(var4 == 8218) {
               var2[var3] = -126;
            } else if(var4 == 402) {
               var2[var3] = -125;
            } else if(var4 == 8222) {
               var2[var3] = -124;
            } else if(var4 == 8230) {
               var2[var3] = -123;
            } else if(var4 == 8224) {
               var2[var3] = -122;
            } else if(var4 == 8225) {
               var2[var3] = -121;
            } else if(var4 == 710) {
               var2[var3] = -120;
            } else if(var4 == 8240) {
               var2[var3] = -119;
            } else if(var4 == 352) {
               var2[var3] = -118;
            } else if(var4 == 8249) {
               var2[var3] = -117;
            } else if(var4 == 338) {
               var2[var3] = -116;
            } else if(var4 == 381) {
               var2[var3] = -114;
            } else if(var4 == 8216) {
               var2[var3] = -111;
            } else if(var4 == 8217) {
               var2[var3] = -110;
            } else if(var4 == 8220) {
               var2[var3] = -109;
            } else if(var4 == 8221) {
               var2[var3] = -108;
            } else if(var4 == 8226) {
               var2[var3] = -107;
            } else if(var4 == 8211) {
               var2[var3] = -106;
            } else if(var4 == 8212) {
               var2[var3] = -105;
            } else if(var4 == 732) {
               var2[var3] = -104;
            } else if(var4 == 8482) {
               var2[var3] = -103;
            } else if(var4 == 353) {
               var2[var3] = -102;
            } else if(var4 == 8250) {
               var2[var3] = -101;
            } else if(var4 == 339) {
               var2[var3] = -100;
            } else if(var4 == 382) {
               var2[var3] = -98;
            } else if(var4 == 376) {
               var2[var3] = -97;
            } else {
               var2[var3] = 63;
            }
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "-1019027474"
   )
   public static boolean method3206(char var0) {
      return var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Laa;I)V",
      garbageValue = "-24501572"
   )
   static void method3205(class47 var0) {
      if(class48.field431 == 1 || !class8.field57 && class48.field431 == 4) {
         int var1 = class78.field1104 + 280;
         if(class48.field432 >= var1 && class48.field432 <= var1 + 14 && class48.field437 >= 4 && class48.field437 <= 18) {
            class22.method307(0, 0);
            return;
         }

         if(class48.field432 >= var1 + 15 && class48.field432 <= var1 + 80 && class48.field437 >= 4 && class48.field437 <= 18) {
            class22.method307(0, 1);
            return;
         }

         int var2 = class78.field1104 + 390;
         if(class48.field432 >= var2 && class48.field432 <= var2 + 14 && class48.field437 >= 4 && class48.field437 <= 18) {
            class22.method307(1, 0);
            return;
         }

         if(class48.field432 >= var2 + 15 && class48.field432 <= var2 + 80 && class48.field437 >= 4 && class48.field437 <= 18) {
            class22.method307(1, 1);
            return;
         }

         int var3 = class78.field1104 + 500;
         if(class48.field432 >= var3 && class48.field432 <= var3 + 14 && class48.field437 >= 4 && class48.field437 <= 18) {
            class22.method307(2, 0);
            return;
         }

         if(class48.field432 >= var3 + 15 && class48.field432 <= var3 + 80 && class48.field437 >= 4 && class48.field437 <= 18) {
            class22.method307(2, 1);
            return;
         }

         int var4 = class78.field1104 + 610;
         if(class48.field432 >= var4 && class48.field432 <= var4 + 14 && class48.field437 >= 4 && class48.field437 <= 18) {
            class22.method307(3, 0);
            return;
         }

         if(class48.field432 >= var4 + 15 && class48.field432 <= var4 + 80 && class48.field437 >= 4 && class48.field437 <= 18) {
            class22.method307(3, 1);
            return;
         }

         if(class48.field432 >= class78.field1104 + 708 && class48.field437 >= 4 && class48.field432 <= class78.field1104 + 708 + 50 && class48.field437 <= 20) {
            class78.field1136 = false;
            class78.field1107.method5893(class78.field1104, 0);
            class24.field224.method5893(class78.field1104 + 382, 0);
            class78.field1108.method5873(class78.field1104 + 382 - class78.field1108.field3786 / 2, 18);
            return;
         }

         if(class78.field1137 != -1) {
            class65 var5 = class143.field1914[class78.field1137];
            class292.method5484(var5);
            class78.field1136 = false;
            class78.field1107.method5893(class78.field1104, 0);
            class24.field224.method5893(class78.field1104 + 382, 0);
            class78.field1108.method5873(class78.field1104 + 382 - class78.field1108.field3786 / 2, 18);
            return;
         }
      }

   }
}
