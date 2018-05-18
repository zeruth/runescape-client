import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public class class56 extends class204 {

   @ObfuscatedName("rl")
   @ObfuscatedGetter(
      intValue = -902649341
   )
   static int field522;
   @ObfuscatedName("by")
   static String field521;
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "Lkr;"
   )
   static class298 field524;
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "Ldt;"
   )
   static class125 field523;
   @ObfuscatedName("w")
   Object[] field525;
   @ObfuscatedName("m")
   boolean field526;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   class230 field511;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -411332337
   )
   int field512;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1874529329
   )
   int field513;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1125388097
   )
   int field514;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   class230 field515;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1655578203
   )
   int field520;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 866882175
   )
   int field510;
   @ObfuscatedName("a")
   String field509;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 847405195
   )
   int field519;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -652399611
   )
   int field518 = 76;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;I)V",
      garbageValue = "-1794033575"
   )
   public void method1078(Object[] var1) {
      this.field525 = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "-26624"
   )
   public void method1079(int var1) {
      this.field518 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-124"
   )
   public static int method1084(int var0, int var1) {
      int var2;
      if(var1 > var0) {
         var2 = var0;
         var0 = var1;
         var1 = var2;
      }

      while(var1 != 0) {
         var2 = var0 % var1;
         var0 = var1;
         var1 = var2;
      }

      return var0;
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(ZLge;I)V",
      garbageValue = "-435874001"
   )
   static final void method1083(boolean var0, class189 var1) {
      client.field646 = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      if(!client.field646) {
         var2 = var1.method3574();
         var3 = var1.method3574();
         int var4 = var1.method3574();
         class47.field404 = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               class47.field404[var5][var6] = var1.method3573();
            }
         }

         class61.field592 = new int[var4];
         class140.field1901 = new int[var4];
         class53.field484 = new int[var4];
         class8.field58 = new byte[var4][];
         class112.field1475 = new byte[var4][];
         boolean var16 = false;
         if((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
            var16 = true;
         }

         if(var2 / 8 == 48 && var3 / 8 == 148) {
            var16 = true;
         }

         var4 = 0;

         for(var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
            for(var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               if(!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
                  class61.field592[var4] = var8;
                  class140.field1901[var4] = class234.field2796.method4644("m" + var6 + "_" + var7);
                  class53.field484[var4] = class234.field2796.method4644("l" + var6 + "_" + var7);
                  ++var4;
               }
            }
         }

         class293.method5501(var2, var3, true);
      } else {
         var2 = var1.method3562();
         var3 = var1.method3676();
         boolean var15 = var1.method3553() == 1;
         var5 = var1.method3574();
         var1.method3898();

         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.method3871(1);
                  if(var9 == 1) {
                     client.field652[var6][var7][var8] = var1.method3871(26);
                  } else {
                     client.field652[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.method3872();
         class47.field404 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class47.field404[var6][var7] = var1.method3573();
            }
         }

         class61.field592 = new int[var5];
         class140.field1901 = new int[var5];
         class53.field484 = new int[var5];
         class8.field58 = new byte[var5][];
         class112.field1475 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = client.field652[var6][var7][var8];
                  if(var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if(class61.field592[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if(var12 != -1) {
                        class61.field592[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        class140.field1901[var5] = class234.field2796.method4644("m" + var13 + "_" + var14);
                        class53.field484[var5] = class234.field2796.method4644("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         class293.method5501(var2, var3, !var15);
      }

   }
}
