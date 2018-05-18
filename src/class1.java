import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class1 {

   @ObfuscatedName("m")
   public static Comparator field5 = new class7();
   @ObfuscatedName("q")
   public static Comparator field7;
   @ObfuscatedName("b")
   public static Comparator field8;
   @ObfuscatedName("f")
   public static Comparator field9;
   @ObfuscatedName("w")
   public final List field6;


   static {
      new class0();
      field7 = new class5();
      field8 = new class6();
      field9 = new class3();
   }

   @ObfuscatedSignature(
      signature = "(Lgy;Z)V",
      garbageValue = "1"
   )
   public class1(class182 var1, boolean var2) {
      int var3 = var1.method3574();
      boolean var4 = var1.method3742() == 1;
      byte var5;
      if(var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.method3574();
      this.field6 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field6.add(new class2(var1, var5, var3));
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;ZB)V",
      garbageValue = "0"
   )
   public void method11(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.field6, var1);
      } else {
         Collections.sort(this.field6, Collections.reverseOrder(var1));
      }

   }

   @ObfuscatedName("w")
   public static final int method15(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if(var2 != 0.0D) {
         double var12;
         if(var4 < 0.5D) {
            var12 = var4 * (var2 + 1.0D);
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = 2.0D * var4 - var12;
         double var16 = var0 + 0.3333333333333333D;
         if(var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if(var20 < 0.0D) {
            ++var20;
         }

         if(6.0D * var16 < 1.0D) {
            var6 = var16 * 6.0D * (var12 - var14) + var14;
         } else if(2.0D * var16 < 1.0D) {
            var6 = var12;
         } else if(3.0D * var16 < 2.0D) {
            var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
         } else {
            var6 = var14;
         }

         if(var0 * 6.0D < 1.0D) {
            var8 = var14 + var0 * (var12 - var14) * 6.0D;
         } else if(2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if(3.0D * var0 < 2.0D) {
            var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
         } else {
            var8 = var14;
         }

         if(6.0D * var20 < 1.0D) {
            var10 = (var12 - var14) * 6.0D * var20 + var14;
         } else if(var20 * 2.0D < 1.0D) {
            var10 = var12;
         } else if(3.0D * var20 < 2.0D) {
            var10 = var14 + (var12 - var14) * (0.6666666666666666D - var20) * 6.0D;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(256.0D * var8);
      int var23 = (int)(var10 * 256.0D);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IZB)I",
      garbageValue = "-10"
   )
   public static int method13(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(var8 == 45) {
                  var3 = true;
                  continue;
               }

               if(var8 == 43) {
                  continue;
               }
            }

            int var10;
            if(var8 >= 48 && var8 <= 57) {
               var10 = var8 - 48;
            } else if(var8 >= 65 && var8 <= 90) {
               var10 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Lez;"
   )
   public static class152 method12(Throwable var0, String var1) {
      class152 var2;
      if(var0 instanceof class152) {
         var2 = (class152)var0;
         var2.field1960 = var2.field1960 + ' ' + var1;
      } else {
         var2 = new class152(var0, var1);
      }

      return var2;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lge;II)V",
      garbageValue = "1586212486"
   )
   static void method10(class189 var0, int var1) {
      boolean var2 = var0.method3871(1) == 1;
      if(var2) {
         class81.field1188[++class81.field1176 - 1] = var1;
      }

      int var3 = var0.method3871(2);
      class60 var4 = client.field806[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field586 = false;
         } else if(client.field709 == var1) {
            throw new RuntimeException();
         } else {
            class81.field1184[var1] = (var4.field581 << 28) + (class178.field2315 + var4.field928[0] >> 13 << 14) + (class71.field1051 + var4.field939[0] >> 13);
            if(var4.field897 != -1) {
               class81.field1185[var1] = var4.field897;
            } else {
               class81.field1185[var1] = var4.field934;
            }

            class81.field1186[var1] = var4.field935;
            client.field806[var1] = null;
            if(var0.method3871(1) != 0) {
               class230.method4572(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.method3871(3);
            var6 = var4.field928[0];
            var7 = var4.field939[0];
            if(var5 == 0) {
               --var6;
               --var7;
            } else if(var5 == 1) {
               --var7;
            } else if(var5 == 2) {
               ++var6;
               --var7;
            } else if(var5 == 3) {
               --var6;
            } else if(var5 == 4) {
               ++var6;
            } else if(var5 == 5) {
               --var6;
               ++var7;
            } else if(var5 == 6) {
               ++var7;
            } else if(var5 == 7) {
               ++var6;
               ++var7;
            }

            if(client.field709 == var1 && (var4.field900 < 1536 || var4.field918 < 1536 || var4.field900 >= 11776 || var4.field918 >= 11776)) {
               var4.method1173(var6, var7);
               var4.field586 = false;
            } else if(var2) {
               var4.field586 = true;
               var4.field585 = var6;
               var4.field588 = var7;
            } else {
               var4.field586 = false;
               var4.method1134(var6, var7, class81.field1177[var1]);
            }

         } else if(var3 == 2) {
            var5 = var0.method3871(4);
            var6 = var4.field928[0];
            var7 = var4.field939[0];
            if(var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if(var5 == 1) {
               --var6;
               var7 -= 2;
            } else if(var5 == 2) {
               var7 -= 2;
            } else if(var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if(var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if(var5 == 5) {
               var6 -= 2;
               --var7;
            } else if(var5 == 6) {
               var6 += 2;
               --var7;
            } else if(var5 == 7) {
               var6 -= 2;
            } else if(var5 == 8) {
               var6 += 2;
            } else if(var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if(var5 == 10) {
               var6 += 2;
               ++var7;
            } else if(var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if(var5 == 12) {
               --var6;
               var7 += 2;
            } else if(var5 == 13) {
               var7 += 2;
            } else if(var5 == 14) {
               ++var6;
               var7 += 2;
            } else if(var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if(client.field709 == var1 && (var4.field900 < 1536 || var4.field918 < 1536 || var4.field900 >= 11776 || var4.field918 >= 11776)) {
               var4.method1173(var6, var7);
               var4.field586 = false;
            } else if(var2) {
               var4.field586 = true;
               var4.field585 = var6;
               var4.field588 = var7;
            } else {
               var4.field586 = false;
               var4.method1134(var6, var7, class81.field1177[var1]);
            }

         } else {
            var5 = var0.method3871(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.method3871(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.field928[0];
               var11 = var9 + var4.field939[0];
               if(client.field709 == var1 && (var4.field900 < 1536 || var4.field918 < 1536 || var4.field900 >= 11776 || var4.field918 >= 11776)) {
                  var4.method1173(var10, var11);
                  var4.field586 = false;
               } else if(var2) {
                  var4.field586 = true;
                  var4.field585 = var10;
                  var4.field588 = var11;
               } else {
                  var4.field586 = false;
                  var4.method1134(var10, var11, class81.field1177[var1]);
               }

               var4.field581 = (byte)(var7 + var4.field581 & 3);
               if(client.field709 == var1) {
                  class192.field2415 = var4.field581;
               }

            } else {
               var6 = var0.method3871(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var8 + class178.field2315 + var4.field928[0] & 16383) - class178.field2315;
               var11 = (var9 + class71.field1051 + var4.field939[0] & 16383) - class71.field1051;
               if(client.field709 == var1 && (var4.field900 < 1536 || var4.field918 < 1536 || var4.field900 >= 11776 || var4.field918 >= 11776)) {
                  var4.method1173(var10, var11);
                  var4.field586 = false;
               } else if(var2) {
                  var4.field586 = true;
                  var4.field585 = var10;
                  var4.field588 = var11;
               } else {
                  var4.field586 = false;
                  var4.method1134(var10, var11, class81.field1177[var1]);
               }

               var4.field581 = (byte)(var7 + var4.field581 & 3);
               if(client.field709 == var1) {
                  class192.field2415 = var4.field581;
               }

            }
         }
      }
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "448138613"
   )
   static void method14() {
      if(client.field719 >= 0 && client.field806[client.field719] != null) {
         class32.method586(client.field806[client.field719], false);
      }

   }
}
