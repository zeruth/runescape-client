import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class295 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final class295 field3680 = new class295("PLAIN11", "p11_full");
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final class295 field3681 = new class295("PLAIN12", "p12_full");
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final class295 field3685 = new class295("BOLD12", "b12_full");
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final class295 field3682 = new class295("VERDANA11", "verdana_11pt_regular");
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final class295 field3683 = new class295("VERDANA13", "verdana_13pt_regular");
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final class295 field3684 = new class295("VERDANA15", "verdana_15pt_regular");
   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field3688;
   @ObfuscatedName("h")
   final String field3679;
   @ObfuscatedName("x")
   String field3686;


   class295(String var1, String var2) {
      this.field3679 = var1;
      this.field3686 = var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lge;B)V",
      garbageValue = "2"
   )
   static final void method5521(class189 var0) {
      for(int var1 = 0; var1 < class81.field1176; ++var1) {
         int var2 = class81.field1188[var1];
         class60 var3 = client.field806[var2];
         int var4 = var0.method3742();
         if((var4 & 1) != 0) {
            var4 += var0.method3742() << 8;
         }

         byte var5 = -1;
         int var6;
         if((var4 & 512) != 0) {
            var3.field920 = var0.method3676();
            var6 = var0.method3573();
            var3.field924 = var6 >> 16;
            var3.field923 = (var6 & '\uffff') + client.field679;
            var3.field921 = 0;
            var3.field903 = 0;
            if(var3.field923 > client.field679) {
               var3.field921 = -1;
            }

            if(var3.field920 == '\uffff') {
               var3.field920 = -1;
            }
         }

         if((var4 & 256) != 0) {
            var5 = var0.method3600();
         }

         if((var4 & 128) != 0) {
            var3.field935 = var0.method3562();
            if(var3.field935 == '\uffff') {
               var3.field935 = -1;
            }
         }

         if((var4 & 64) != 0) {
            var6 = var0.method3742();
            byte[] var7 = new byte[var6];
            class182 var8 = new class182(var7);
            var0.method3620(var7, 0, var6);
            class81.field1179[var2] = var8;
            var3.method1132(var8);
         }

         int var9;
         int var10;
         int var13;
         int var14;
         if((var4 & 32) != 0) {
            var6 = var0.method3597();
            int var11;
            int var12;
            int var15;
            if(var6 > 0) {
               for(var14 = 0; var14 < var6; ++var14) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var15 = var0.method3599();
                  if(var15 == 32767) {
                     var15 = var0.method3599();
                     var10 = var0.method3599();
                     var9 = var0.method3599();
                     var11 = var0.method3599();
                  } else if(var15 != 32766) {
                     var10 = var0.method3599();
                  } else {
                     var15 = -1;
                  }

                  var12 = var0.method3599();
                  var3.method1582(var15, var10, var9, var11, client.field679, var12);
               }
            }

            var14 = var0.method3742();
            if(var14 > 0) {
               for(var15 = 0; var15 < var14; ++var15) {
                  var9 = var0.method3599();
                  var10 = var0.method3599();
                  if(var10 != 32767) {
                     var11 = var0.method3599();
                     var12 = var0.method3597();
                     var13 = var10 > 0?var0.method3553():var12;
                     var3.method1583(var9, client.field679, var10, var11, var12, var13);
                  } else {
                     var3.method1579(var9);
                  }
               }
            }
         }

         if((var4 & 4) != 0) {
            var3.field897 = var0.method3574();
            if(var3.field937 == 0) {
               var3.field934 = var3.field897;
               var3.field897 = -1;
            }
         }

         if((var4 & 4096) != 0) {
            class81.field1177[var2] = var0.method3600();
         }

         if((var4 & 2048) != 0) {
            var3.field925 = var0.method3569();
            var3.field927 = var0.method3600();
            var3.field926 = var0.method3569();
            var3.field888 = var0.method3569();
            var3.field896 = var0.method3574() + client.field679;
            var3.field901 = var0.method3562() + client.field679;
            var3.field931 = var0.method3562();
            if(var3.field586) {
               var3.field925 += var3.field585;
               var3.field927 += var3.field588;
               var3.field926 += var3.field585;
               var3.field888 += var3.field588;
               var3.field937 = 0;
            } else {
               var3.field925 += var3.field928[0];
               var3.field927 += var3.field939[0];
               var3.field926 += var3.field928[0];
               var3.field888 += var3.field939[0];
               var3.field937 = 1;
            }

            var3.field942 = 0;
         }

         if((var4 & 16) != 0) {
            var6 = var0.method3562();
            class242 var17 = (class242)class7.method89(class274.method5249(), var0.method3553());
            boolean var20 = var0.method3553() == 1;
            var9 = var0.method3553();
            var10 = var0.field2359;
            if(var3.field587 != null && var3.field561 != null) {
               boolean var19 = false;
               if(var17.field3136 && class109.field1453.method1669(var3.field587)) {
                  var19 = true;
               }

               if(!var19 && client.field706 == 0 && !var3.field567) {
                  class81.field1189.field2359 = 0;
                  var0.method3619(class81.field1189.field2365, 0, var9);
                  class81.field1189.field2359 = 0;
                  String var16 = class299.method5643(class57.method1089(class59.method1128(class81.field1189)));
                  var3.field895 = var16.trim();
                  var3.field899 = var6 >> 8;
                  var3.field887 = var6 & 255;
                  var3.field898 = 150;
                  var3.field938 = var20;
                  var3.field941 = var3 != class150.field1948 && var17.field3136 && "" != client.field808 && var16.toLowerCase().indexOf(client.field808) == -1;
                  if(var17.field3143) {
                     var13 = var20?91:1;
                  } else {
                     var13 = var20?90:2;
                  }

                  if(var17.field3142 != -1) {
                     class61.method1189(var13, class36.method687(var17.field3142) + var3.field587.method5462(), var16);
                  } else {
                     class61.method1189(var13, var3.field587.method5462(), var16);
                  }
               }
            }

            var0.field2359 = var9 + var10;
         }

         if((var4 & 2) != 0) {
            var3.field895 = var0.method3577();
            if(var3.field895.charAt(0) == 126) {
               var3.field895 = var3.field895.substring(1);
               class61.method1189(2, var3.field587.method5462(), var3.field895);
            } else if(var3 == class150.field1948) {
               class61.method1189(2, var3.field587.method5462(), var3.field895);
            }

            var3.field938 = false;
            var3.field899 = 0;
            var3.field887 = 0;
            var3.field898 = 150;
         }

         if((var4 & 8) != 0) {
            var6 = var0.method3562();
            if(var6 == '\uffff') {
               var6 = -1;
            }

            var14 = var0.method3730();
            class144.method3193(var3, var6, var14);
         }

         if((var4 & 1024) != 0) {
            for(var6 = 0; var6 < 3; ++var6) {
               var3.field565[var6] = var0.method3577();
            }
         }

         if(var3.field586) {
            if(var5 == 127) {
               var3.method1173(var3.field585, var3.field588);
            } else {
               byte var18;
               if(var5 != -1) {
                  var18 = var5;
               } else {
                  var18 = class81.field1177[var2];
               }

               var3.method1134(var3.field585, var3.field588, var18);
            }
         }
      }

   }
}
