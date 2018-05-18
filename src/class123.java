import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public final class class123 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 49564075
   )
   int field1732;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1955356749
   )
   int field1728;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 468269921
   )
   int field1729;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1438735933
   )
   int field1730;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 415292689
   )
   int field1727;
   @ObfuscatedName("n")
   boolean field1733 = true;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1234806617
   )
   int field1731;


   class123(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field1732 = var1;
      this.field1728 = var2;
      this.field1729 = var3;
      this.field1730 = var4;
      this.field1727 = var5;
      this.field1731 = var6;
      this.field1733 = var7;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([I[II)V",
      garbageValue = "711248926"
   )
   public static void method2897(int[] var0, int[] var1) {
      if(var0 != null && var1 != null) {
         class78.field1123 = var0;
         class183.field2370 = new int[var0.length];
         class183.field2373 = new byte[var0.length][][];

         for(int var2 = 0; var2 < class78.field1123.length; ++var2) {
            class183.field2373[var2] = new byte[var1[var2]][];
         }

      } else {
         class78.field1123 = null;
         class183.field2370 = null;
         class183.field2373 = null;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;IZI)Lec;",
      garbageValue = "-656092176"
   )
   public static class130 method2899(class247 var0, class247 var1, int var2, boolean var3) {
      boolean var4 = true;
      int[] var5 = var0.method4648(var2);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         byte[] var7 = var0.method4634(var2, var5[var6]);
         if(var7 == null) {
            var4 = false;
         } else {
            int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
            byte[] var9;
            if(var3) {
               var9 = var1.method4634(0, var8);
            } else {
               var9 = var1.method4634(var8, 0);
            }

            if(var9 == null) {
               var4 = false;
            }
         }
      }

      if(!var4) {
         return null;
      } else {
         try {
            return new class130(var0, var1, var2, var3);
         } catch (Exception var11) {
            return null;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;Lla;S)Ljava/lang/String;",
      garbageValue = "-2125"
   )
   public static String method2898(CharSequence var0, class322 var1) {
      if(var0 == null) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var0.length(); var2 < var3; ++var2) {
            char var5 = var0.charAt(var2);
            boolean var4 = var5 == 160 || var5 == 32 || var5 == 95 || var5 == 45;
            if(!var4) {
               break;
            }
         }

         while(var3 > var2 && class70.method1813(var0.charAt(var3 - 1))) {
            --var3;
         }

         int var14 = var3 - var2;
         if(var14 >= 1 && var14 <= class158.method3317(var1)) {
            StringBuilder var12 = new StringBuilder(var14);

            for(int var6 = var2; var6 < var3; ++var6) {
               char var7 = var0.charAt(var6);
               boolean var8;
               if(Character.isISOControl(var7)) {
                  var8 = false;
               } else if(class148.method3206(var7)) {
                  var8 = true;
               } else {
                  char[] var9 = class302.field3730;
                  int var10 = 0;

                  label84:
                  while(true) {
                     char var11;
                     if(var10 >= var9.length) {
                        var9 = class302.field3729;

                        for(var10 = 0; var10 < var9.length; ++var10) {
                           var11 = var9[var10];
                           if(var11 == var7) {
                              var8 = true;
                              break label84;
                           }
                        }

                        var8 = false;
                        break;
                     }

                     var11 = var9[var10];
                     if(var11 == var7) {
                        var8 = true;
                        break;
                     }

                     ++var10;
                  }
               }

               if(var8) {
                  char var13 = class171.method3473(var7);
                  if(var13 != 0) {
                     var12.append(var13);
                  }
               }
            }

            if(var12.length() == 0) {
               return null;
            } else {
               return var12.toString();
            }
         } else {
            return null;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-39"
   )
   static int method2895(int var0) {
      class86 var1 = (class86)class83.field1204.get(Integer.valueOf(var0));
      return var1 == null?0:var1.method2011();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BZI)Ljava/lang/Object;",
      garbageValue = "834039602"
   )
   public static Object method2896(byte[] var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else {
         if(var0.length > 136 && !class186.field2392) {
            try {
               class180 var2 = new class180();
               var2.vmethod3838(var0);
               return var2;
            } catch (Throwable var3) {
               class186.field2392 = true;
            }
         }

         return var0;
      }
   }
}
