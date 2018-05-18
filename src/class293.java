import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class293 extends class285 {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   final class322 field3668;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lki;"
   )
   final class288 field3666;
   @ObfuscatedName("a")
   public String field3667 = null;
   @ObfuscatedName("l")
   public String field3669 = null;
   @ObfuscatedName("d")
   public byte field3674;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -182421895
   )
   public int field3671;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1322445059
   )
   int field3672 = 1;


   @ObfuscatedSignature(
      signature = "(Lla;Lki;)V"
   )
   public class293(class322 var1, class288 var2) {
      super(100);
      this.field3668 = var1;
      this.field3666 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Ljn;",
      garbageValue = "-39"
   )
   class282 vmethod5491() {
      return new class281();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)[Ljn;",
      garbageValue = "-1283030275"
   )
   class282[] vmethod5492(int var1) {
      return new class281[var1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1529272657"
   )
   final void method5493(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if(var9 >= 65 && var9 <= 90) {
            var5 += (long)(var9 + 1 - 65);
         } else if(var9 >= 97 && var9 <= 122) {
            var5 += (long)(var9 + 1 - 97);
         } else if(var9 >= 48 && var9 <= 57) {
            var5 += (long)(var9 + 27 - 48);
         }

         if(var5 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var5 % 37L && 0L != var5) {
         var5 /= 37L;
      }

      String var10 = class302.method5659(var5);
      if(var10 == null) {
         var10 = "";
      }

      this.field3667 = var10;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "128"
   )
   final void method5494(String var1) {
      long var5 = 0L;
      int var7 = var1.length();

      for(int var8 = 0; var8 < var7; ++var8) {
         var5 *= 37L;
         char var9 = var1.charAt(var8);
         if(var9 >= 65 && var9 <= 90) {
            var5 += (long)(var9 + 1 - 65);
         } else if(var9 >= 97 && var9 <= 122) {
            var5 += (long)(var9 + 1 - 97);
         } else if(var9 >= 48 && var9 <= 57) {
            var5 += (long)(var9 + 27 - 48);
         }

         if(var5 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var5 % 37L && var5 != 0L) {
         var5 /= 37L;
      }

      String var10 = class302.method5659(var5);
      if(var10 == null) {
         var10 = "";
      }

      this.field3669 = var10;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1237689075"
   )
   public final void method5507(class182 var1) {
      this.method5494(var1.method3577());
      long var2 = var1.method3792();
      long var5 = var2;
      String var4;
      int var7;
      if(var2 > 0L && var2 < 6582952005840035281L) {
         if(0L == var2 % 37L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var13 = var2; var13 != 0L; var13 /= 37L) {
               ++var7;
            }

            StringBuilder var15 = new StringBuilder(var7);

            while(var5 != 0L) {
               long var11 = var5;
               var5 /= 37L;
               var15.append(class303.field3732[(int)(var11 - var5 * 37L)]);
            }

            var4 = var15.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method5493(var4);
      this.field3674 = var1.method3569();
      var7 = var1.method3742();
      if(var7 != 255) {
         this.method5340();

         for(int var8 = 0; var8 < var7; ++var8) {
            class281 var9 = (class281)this.method5349(new class291(var1.method3577(), this.field3668));
            int var10 = var1.method3574();
            var9.method5432(var10, ++this.field3672 - 1);
            var9.field3647 = var1.method3569();
            var1.method3577();
            this.method5499(var9);
         }

      }
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1624046819"
   )
   public final void method5496(class182 var1) {
      class291 var2 = new class291(var1.method3577(), this.field3668);
      int var3 = var1.method3574();
      byte var4 = var1.method3569();
      boolean var5 = false;
      if(var4 == -128) {
         var5 = true;
      }

      class281 var6;
      if(var5) {
         if(this.method5341() == 0) {
            return;
         }

         var6 = (class281)this.method5374(var2);
         if(var6 != null && var6.method5433() == var3) {
            this.method5362(var6);
         }
      } else {
         var1.method3577();
         var6 = (class281)this.method5374(var2);
         if(var6 == null) {
            if(this.method5341() > super.field3642) {
               return;
            }

            var6 = (class281)this.method5349(var2);
         }

         var6.method5432(var3, ++this.field3672 - 1);
         var6.field3647 = var4;
         this.method5499(var6);
      }

   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-265283783"
   )
   public final void method5518() {
      for(int var1 = 0; var1 < this.method5341(); ++var1) {
         ((class281)this.method5351(var1)).method5275();
      }

   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   public final void method5498() {
      for(int var1 = 0; var1 < this.method5341(); ++var1) {
         ((class281)this.method5351(var1)).method5279();
      }

   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "(Ljw;B)V",
      garbageValue = "18"
   )
   final void method5499(class281 var1) {
      if(var1.method5299().equals(this.field3666.vmethod5443())) {
         this.field3671 = var1.field3647;
      }

   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(IIZB)V",
      garbageValue = "-10"
   )
   static final void method5501(int var0, int var1, boolean var2) {
      if(!var2 || var0 != class11.field82 || class54.field495 != var1) {
         class11.field82 = var0;
         class54.field495 = var1;
         class102.method2310(25);
         class16.method187("Loading - please wait.", true);
         int var3 = class178.field2315;
         int var4 = class71.field1051;
         class178.field2315 = (var0 - 6) * 8;
         class71.field1051 = (var1 - 6) * 8;
         int var5 = class178.field2315 - var3;
         int var6 = class71.field1051 - var4;
         var3 = class178.field2315;
         var4 = class71.field1051;

         int var7;
         int var9;
         for(var7 = 0; var7 < '\u8000'; ++var7) {
            class72 var8 = client.field807[var7];
            if(var8 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var8.field928[var9] -= var5;
                  var8.field939[var9] -= var6;
               }

               var8.field900 -= var5 * 128;
               var8.field918 -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            class60 var21 = client.field806[var7];
            if(var21 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var21.field928[var9] -= var5;
                  var21.field939[var9] -= var6;
               }

               var21.field900 -= var5 * 128;
               var21.field918 -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var18 = 104;
         byte var22 = 1;
         if(var5 < 0) {
            var20 = 103;
            var18 = -1;
            var22 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if(var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var18 != var13; var13 += var22) {
            for(var14 = var10; var14 != var11; var14 += var12) {
               int var15 = var13 + var5;
               int var16 = var14 + var6;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if(var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     client.field720[var17][var13][var14] = client.field720[var17][var15][var16];
                  } else {
                     client.field720[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(class62 var19 = (class62)client.field721.method4113(); var19 != null; var19 = (class62)client.field721.method4104()) {
            var19.field868 -= var5;
            var19.field880 -= var6;
            if(var19.field868 < 0 || var19.field880 < 0 || var19.field868 >= 104 || var19.field880 >= 104) {
               var19.method4098();
            }
         }

         if(client.field820 != 0) {
            client.field820 -= var5;
            client.field821 -= var6;
         }

         client.field598 = 0;
         client.field746 = false;
         class14.field118 -= var5 << 7;
         class13.field102 -= var6 << 7;
         class154.field1979 -= var5 << 7;
         class53.field481 -= var6 << 7;
         client.field815 = -1;
         client.field660.method4105();
         client.field722.method4105();

         for(var14 = 0; var14 < 4; ++var14) {
            client.field666[var14].method3413();
         }

      }
   }
}
