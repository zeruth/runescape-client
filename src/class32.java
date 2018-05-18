import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class32 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -9278083
   )
   int field285;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 727360665
   )
   int field282;
   @ObfuscatedName("q")
   int[][] field286;
   @ObfuscatedName("b")
   int[][] field284;
   @ObfuscatedName("f")
   int[][] field283;
   @ObfuscatedName("n")
   int[][] field281;


   class32(int var1, int var2) {
      this.field285 = var1;
      this.field282 = var2;
      this.field286 = new int[var1][var2];
      this.field284 = new int[var1][var2];
      this.field283 = new int[var1][var2];
      this.field281 = new int[var1][var2];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIILij;B)V",
      garbageValue = "2"
   )
   void method587(int var1, int var2, int var3, class259 var4) {
      if(var4 != null) {
         if(var3 + var1 >= 0 && var3 + var2 >= 0) {
            if(var1 - var3 <= this.field285 && var2 - var3 <= this.field282) {
               int var5 = Math.max(0, var1 - var3);
               int var6 = Math.min(this.field285, var3 + var1);
               int var7 = Math.max(0, var2 - var3);
               int var8 = Math.min(this.field282, var3 + var2);

               for(int var9 = var5; var9 < var6; ++var9) {
                  for(int var10 = var7; var10 < var8; ++var10) {
                     this.field286[var9][var10] += var4.field3304 * 256 / var4.field3307;
                     this.field284[var9][var10] += var4.field3305;
                     this.field283[var9][var10] += var4.field3306;
                     ++this.field281[var9][var10];
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1777051554"
   )
   int method596(int var1, int var2) {
      if(var1 >= 0 && var2 >= 0 && var1 < this.field285 && var2 < this.field282) {
         if(this.field283[var1][var2] == 0) {
            return 0;
         } else {
            int var3 = this.field286[var1][var2] / this.field281[var1][var2];
            int var4 = this.field284[var1][var2] / this.field281[var1][var2];
            int var5 = this.field283[var1][var2] / this.field281[var1][var2];
            return class1.method15((double)var3 / 256.0D, (double)var4 / 256.0D, (double)var5 / 256.0D);
         }
      } else {
         return 0;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
      garbageValue = "-95"
   )
   public static void method590(String var0, boolean var1, String var2, boolean var3) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if(class45.field368.startsWith("win") && !var3) {
            class178.method3534(var0, 0, "openjs");
            return;
         }

         if(class45.field368.startsWith("mac")) {
            class178.method3534(var0, 1, var2);
            return;
         }

         class178.method3534(var0, 2, "openjs");
      } else {
         class178.method3534(var0, 3, "openjs");
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "([BIII)Z",
      garbageValue = "607558620"
   )
   static final boolean method599(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      class182 var4 = new class182(var0);
      int var5 = -1;

      while(true) {
         int var6 = var4.method3583();
         if(var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            if(var8) {
               var9 = var4.method3599();
               if(var9 == 0) {
                  break;
               }

               var4.method3742();
            } else {
               var9 = var4.method3599();
               if(var9 == 0) {
                  break;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.method3742() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if(var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  class268 var15 = class40.method766(var5);
                  if(var12 != 22 || !client.field708 || var15.field3408 != 0 || var15.field3406 == 1 || var15.field3427) {
                     if(!var15.method5046()) {
                        ++client.field647;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lkr;Lkr;Lkr;ZB)V",
      garbageValue = "2"
   )
   static void method597(class298 var0, class298 var1, class298 var2, boolean var3) {
      if(var3) {
         class78.field1104 = (class9.field70 - 765) / 2;
         class78.field1117 = class78.field1104 + 202;
         class78.field1112 = class78.field1117 + 180;
      }

      if(class78.field1136) {
         class82.method1960(var0, var1);
      } else {
         if(var3) {
            class78.field1107.method5893(class78.field1104, 0);
            class24.field224.method5893(class78.field1104 + 382, 0);
            class78.field1108.method5873(class78.field1104 + 382 - class78.field1108.field3786 / 2, 18);
         }

         int var5;
         if(client.field611 == 0 || client.field611 == 5) {
            byte var4 = 20;
            var0.method5567("RuneScape is loading - please wait...", class78.field1117 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class314.method5778(class78.field1117 + 180 - 152, var5, 304, 34, 9179409);
            class314.method5778(class78.field1117 + 180 - 151, var5 + 1, 302, 32, 0);
            class314.method5835(class78.field1117 + 180 - 150, var5 + 2, class78.field1120 * 3, 30, 9179409);
            class314.method5835(class78.field1120 * 3 + (class78.field1117 + 180 - 150), var5 + 2, 300 - class78.field1120 * 3, 30, 0);
            var0.method5567(class78.field1121, class78.field1117 + 180, 276 - var4, 16777215, -1);
         }

         String var6;
         short var14;
         int var15;
         short var16;
         if(client.field611 == 20) {
            class78.field1105.method5873(class78.field1117 + 180 - class78.field1105.field3786 / 2, 271 - class78.field1105.field3787 / 2);
            var14 = 201;
            var0.method5567(class78.field1124, class78.field1117 + 180, var14, 16776960, 0);
            var15 = var14 + 15;
            var0.method5567(class78.field1125, class78.field1117 + 180, var15, 16776960, 0);
            var15 += 15;
            var0.method5567(class78.field1139, class78.field1117 + 180, var15, 16776960, 0);
            var15 += 15;
            var15 += 7;
            if(class78.field1135 != 4) {
               var0.method5541("Login: ", class78.field1117 + 180 - 110, var15, 16777215, 0);
               var16 = 200;

               for(var6 = class57.method1085(); var0.method5536(var6) > var16; var6 = var6.substring(0, var6.length() - 1)) {
                  ;
               }

               var0.method5541(class299.method5643(var6), class78.field1117 + 180 - 70, var15, 16777215, 0);
               var15 += 15;
               var0.method5541("Password: " + class111.method2592(class78.field1143), class78.field1117 + 180 - 108, var15, 16777215, 0);
               var15 += 15;
            }
         }

         if(client.field611 == 10 || client.field611 == 11) {
            class78.field1105.method5873(class78.field1117, 171);
            short var11;
            if(class78.field1135 == 0) {
               var14 = 251;
               var0.method5567("Welcome to RuneScape", class78.field1117 + 180, var14, 16776960, 0);
               var15 = var14 + 30;
               var5 = class78.field1117 + 180 - 80;
               var11 = 291;
               class78.field1113.method5873(var5 - 73, var11 - 20);
               var0.method5595("New User", var5 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class78.field1117 + 180 + 80;
               class78.field1113.method5873(var5 - 73, var11 - 20);
               var0.method5595("Existing User", var5 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if(class78.field1135 == 1) {
               var0.method5567(class78.field1111, class78.field1117 + 180, 201, 16776960, 0);
               var14 = 236;
               var0.method5567(class78.field1124, class78.field1117 + 180, var14, 16777215, 0);
               var15 = var14 + 15;
               var0.method5567(class78.field1125, class78.field1117 + 180, var15, 16777215, 0);
               var15 += 15;
               var0.method5567(class78.field1139, class78.field1117 + 180, var15, 16777215, 0);
               var15 += 15;
               var5 = class78.field1117 + 180 - 80;
               var11 = 321;
               class78.field1113.method5873(var5 - 73, var11 - 20);
               var0.method5567("Continue", var5, var11 + 5, 16777215, 0);
               var5 = class78.field1117 + 180 + 80;
               class78.field1113.method5873(var5 - 73, var11 - 20);
               var0.method5567("Cancel", var5, var11 + 5, 16777215, 0);
            } else {
               int var7;
               if(class78.field1135 == 2) {
                  var14 = 201;
                  var0.method5567(class78.field1124, class78.field1112, var14, 16776960, 0);
                  var15 = var14 + 15;
                  var0.method5567(class78.field1125, class78.field1112, var15, 16776960, 0);
                  var15 += 15;
                  var0.method5567(class78.field1139, class78.field1112, var15, 16776960, 0);
                  var15 += 15;
                  var15 += 7;
                  var0.method5541("Login: ", class78.field1112 - 110, var15, 16777215, 0);
                  var16 = 200;

                  for(var6 = class57.method1085(); var0.method5536(var6) > var16; var6 = var6.substring(1)) {
                     ;
                  }

                  var0.method5541(class299.method5643(var6) + (class78.field1126 == 0 & client.field679 % 40 < 20?class50.method1060(16776960) + "|":""), class78.field1112 - 70, var15, 16777215, 0);
                  var15 += 15;
                  var0.method5541("Password: " + class111.method2592(class78.field1143) + (class78.field1126 == 1 & client.field679 % 40 < 20?class50.method1060(16776960) + "|":""), class78.field1112 - 108, var15, 16777215, 0);
                  var15 += 15;
                  var14 = 277;
                  var7 = class78.field1112 + -117;
                  class317 var8 = class4.method54(class78.field1129, class78.field1133);
                  var8.method5873(var7, var14);
                  var7 = var7 + var8.field3786 + 5;
                  var1.method5541("Remember username", var7, var14 + 13, 16776960, 0);
                  var7 = class78.field1112 + 24;
                  var8 = class4.method54(class51.field468.field977, class78.field1131);
                  var8.method5873(var7, var14);
                  var7 = var7 + var8.field3786 + 5;
                  var1.method5541("Hide username", var7, var14 + 13, 16776960, 0);
                  var15 = var14 + 15;
                  int var9 = class78.field1112 - 80;
                  short var10 = 321;
                  class78.field1113.method5873(var9 - 73, var10 - 20);
                  var0.method5567("Login", var9, var10 + 5, 16777215, 0);
                  var9 = class78.field1112 + 80;
                  class78.field1113.method5873(var9 - 73, var10 - 20);
                  var0.method5567("Cancel", var9, var10 + 5, 16777215, 0);
                  var14 = 357;
                  var1.method5567("Forgotten your password? <col=ffffff>Click here.", class78.field1112, var14, 16776960, 0);
               } else if(class78.field1135 == 3) {
                  var14 = 201;
                  var0.method5567("Invalid username or password.", class78.field1117 + 180, var14, 16776960, 0);
                  var15 = var14 + 20;
                  var1.method5567("For accounts created after 24th November 2010, please use your", class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var1.method5567("email address to login. Otherwise please login with your username.", class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var5 = class78.field1117 + 180;
                  var11 = 276;
                  class78.field1113.method5873(var5 - 73, var11 - 20);
                  var2.method5567("Try again", var5, var11 + 5, 16777215, 0);
                  var5 = class78.field1117 + 180;
                  var11 = 326;
                  class78.field1113.method5873(var5 - 73, var11 - 20);
                  var2.method5567("Forgotten password?", var5, var11 + 5, 16777215, 0);
               } else if(class78.field1135 == 4) {
                  var0.method5567("Authenticator", class78.field1117 + 180, 201, 16776960, 0);
                  var14 = 236;
                  var0.method5567(class78.field1124, class78.field1117 + 180, var14, 16777215, 0);
                  var15 = var14 + 15;
                  var0.method5567(class78.field1125, class78.field1117 + 180, var15, 16777215, 0);
                  var15 += 15;
                  var0.method5567(class78.field1139, class78.field1117 + 180, var15, 16777215, 0);
                  var15 += 15;
                  var0.method5541("PIN: " + class111.method2592(class47.field414) + (client.field679 % 40 < 20?class50.method1060(16776960) + "|":""), class78.field1117 + 180 - 108, var15, 16777215, 0);
                  var15 -= 8;
                  var0.method5541("Trust this computer", class78.field1117 + 180 - 9, var15, 16776960, 0);
                  var15 += 15;
                  var0.method5541("for 30 days: ", class78.field1117 + 180 - 9, var15, 16776960, 0);
                  var5 = 180 + class78.field1117 - 9 + var0.method5536("for 30 days: ") + 15;
                  int var19 = var15 - var0.field3713;
                  class317 var12;
                  if(class78.field1132) {
                     var12 = class78.field1110;
                  } else {
                     var12 = class78.field1109;
                  }

                  var12.method5873(var5, var19);
                  var15 += 15;
                  int var13 = class78.field1117 + 180 - 80;
                  short var18 = 321;
                  class78.field1113.method5873(var13 - 73, var18 - 20);
                  var0.method5567("Continue", var13, var18 + 5, 16777215, 0);
                  var13 = class78.field1117 + 180 + 80;
                  class78.field1113.method5873(var13 - 73, var18 - 20);
                  var0.method5567("Cancel", var13, var18 + 5, 16777215, 0);
                  var1.method5567("<u=ff>Can\'t Log In?</u>", class78.field1117 + 180, var18 + 36, 255, 0);
               } else if(class78.field1135 == 5) {
                  var0.method5567("Forgotten your password?", class78.field1117 + 180, 201, 16776960, 0);
                  var14 = 221;
                  var2.method5567(class78.field1124, class78.field1117 + 180, var14, 16776960, 0);
                  var15 = var14 + 15;
                  var2.method5567(class78.field1125, class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var2.method5567(class78.field1139, class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var15 += 14;
                  var0.method5541("Username/email: ", class78.field1117 + 180 - 145, var15, 16777215, 0);
                  var16 = 174;

                  for(var6 = class57.method1085(); var0.method5536(var6) > var16; var6 = var6.substring(1)) {
                     ;
                  }

                  var0.method5541(class299.method5643(var6) + (client.field679 % 40 < 20?class50.method1060(16776960) + "|":""), class78.field1117 + 180 - 34, var15, 16777215, 0);
                  var15 += 15;
                  var7 = class78.field1117 + 180 - 80;
                  short var21 = 321;
                  class78.field1113.method5873(var7 - 73, var21 - 20);
                  var0.method5567("Recover", var7, var21 + 5, 16777215, 0);
                  var7 = class78.field1117 + 180 + 80;
                  class78.field1113.method5873(var7 - 73, var21 - 20);
                  var0.method5567("Back", var7, var21 + 5, 16777215, 0);
               } else if(class78.field1135 == 6) {
                  var14 = 201;
                  var0.method5567(class78.field1124, class78.field1117 + 180, var14, 16776960, 0);
                  var15 = var14 + 15;
                  var0.method5567(class78.field1125, class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var0.method5567(class78.field1139, class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var5 = class78.field1117 + 180;
                  var11 = 321;
                  class78.field1113.method5873(var5 - 73, var11 - 20);
                  var0.method5567("Back", var5, var11 + 5, 16777215, 0);
               } else if(class78.field1135 == 7) {
                  var14 = 216;
                  var0.method5567("Your date of birth isn\'t set.", class78.field1117 + 180, var14, 16776960, 0);
                  var15 = var14 + 15;
                  var2.method5567("Please verify your account status by", class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var2.method5567("setting your date of birth.", class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var5 = class78.field1117 + 180 - 80;
                  var11 = 321;
                  class78.field1113.method5873(var5 - 73, var11 - 20);
                  var0.method5567("Set Date of Birth", var5, var11 + 5, 16777215, 0);
                  var5 = class78.field1117 + 180 + 80;
                  class78.field1113.method5873(var5 - 73, var11 - 20);
                  var0.method5567("Back", var5, var11 + 5, 16777215, 0);
               } else if(class78.field1135 == 8) {
                  var14 = 216;
                  var0.method5567("Sorry, but your account is not eligible to play.", class78.field1117 + 180, var14, 16776960, 0);
                  var15 = var14 + 15;
                  var2.method5567("For more information, please take a look at", class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var2.method5567("our privacy policy.", class78.field1117 + 180, var15, 16776960, 0);
                  var15 += 15;
                  var5 = class78.field1117 + 180 - 80;
                  var11 = 321;
                  class78.field1113.method5873(var5 - 73, var11 - 20);
                  var0.method5567("Privacy Policy", var5, var11 + 5, 16777215, 0);
                  var5 = class78.field1117 + 180 + 80;
                  class78.field1113.method5873(var5 - 73, var11 - 20);
                  var0.method5567("Back", var5, var11 + 5, 16777215, 0);
               }
            }
         }

         if(class78.field1118 > 0) {
            class43.method791(class78.field1118);
            class78.field1118 = 0;
         }

         class58.method1105();
         class55.field502[class51.field468.field982?1:0].method5873(class78.field1104 + 765 - 40, 463);
         if(client.field611 > 5 && client.field599 == 0) {
            if(class132.field1844 != null) {
               var15 = class78.field1104 + 5;
               var16 = 463;
               byte var20 = 100;
               byte var17 = 35;
               class132.field1844.method5873(var15, var16);
               var0.method5567("World" + " " + client.field676, var20 / 2 + var15, var17 / 2 + var16 - 2, 16777215, 0);
               if(class65.field959 != null) {
                  var1.method5567("Loading...", var20 / 2 + var15, var17 / 2 + var16 + 12, 16777215, 0);
               } else {
                  var1.method5567("Click to switch", var20 / 2 + var15, var17 / 2 + var16 + 12, 16777215, 0);
               }
            } else {
               class132.field1844 = class47.method984(class59.field553, "sl_button", "");
            }
         }

      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-844828617"
   )
   static int method600(int var0, class84 var1, boolean var2) {
      class230 var3 = class61.method1188(class69.field1026[--class45.field377]);
      if(var0 == 2600) {
         class69.field1026[++class45.field377 - 1] = var3.field2644;
         return 1;
      } else if(var0 == 2601) {
         class69.field1026[++class45.field377 - 1] = var3.field2611;
         return 1;
      } else if(var0 == 2602) {
         class69.field1021[++class83.field1207 - 1] = var3.field2684;
         return 1;
      } else if(var0 == 2603) {
         class69.field1026[++class45.field377 - 1] = var3.field2674;
         return 1;
      } else if(var0 == 2604) {
         class69.field1026[++class45.field377 - 1] = var3.field2647;
         return 1;
      } else if(var0 == 2605) {
         class69.field1026[++class45.field377 - 1] = var3.field2701;
         return 1;
      } else if(var0 == 2606) {
         class69.field1026[++class45.field377 - 1] = var3.field2675;
         return 1;
      } else if(var0 == 2607) {
         class69.field1026[++class45.field377 - 1] = var3.field2676;
         return 1;
      } else if(var0 == 2608) {
         class69.field1026[++class45.field377 - 1] = var3.field2707;
         return 1;
      } else if(var0 == 2609) {
         class69.field1026[++class45.field377 - 1] = var3.field2638;
         return 1;
      } else if(var0 == 2610) {
         class69.field1026[++class45.field377 - 1] = var3.field2649;
         return 1;
      } else if(var0 == 2611) {
         class69.field1026[++class45.field377 - 1] = var3.field2648;
         return 1;
      } else if(var0 == 2612) {
         class69.field1026[++class45.field377 - 1] = var3.field2640;
         return 1;
      } else if(var0 == 2613) {
         class69.field1026[++class45.field377 - 1] = var3.field2700.vmethod5860();
         return 1;
      } else if(var0 == 2614) {
         class69.field1026[++class45.field377 - 1] = var3.field2679?1:0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(ILhh;ZI)V",
      garbageValue = "-1458690685"
   )
   static void method601(int var0, class226 var1, boolean var2) {
      class20 var3 = class71.method1821().method6046(var0);
      int var4 = class150.field1948.field581;
      int var5 = (class150.field1948.field900 >> 7) + class178.field2315;
      int var6 = (class150.field1948.field918 >> 7) + class71.field1051;
      class226 var7 = new class226(var4, var5, var6);
      class71.method1821().method6112(var3, var7, var1, var2);
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "(Lbu;ZI)V",
      garbageValue = "-1322367604"
   )
   static void method586(class60 var0, boolean var1) {
      if(var0 != null && var0.vmethod1828() && !var0.field567) {
         var0.field579 = false;
         if((client.field708 && class81.field1180 > 50 || class81.field1180 > 200) && var1 && var0.field912 == var0.field909) {
            var0.field579 = true;
         }

         int var2 = var0.field900 >> 7;
         int var3 = var0.field918 >> 7;
         if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = class59.method1129(0, 0, 0, false, var0.field583);
            if(var0.field574 != null && client.field679 >= var0.field575 && client.field679 < var0.field570) {
               var0.field579 = false;
               var0.field572 = class264.method4955(var0.field900, var0.field918, class192.field2415);
               var0.field905 = client.field679;
               class56.field523.method2971(class192.field2415, var0.field900, var0.field918, var0.field572, 60, var0, var0.field883, var4, var0.field568, var0.field573, var0.field577, var0.field578);
            } else {
               if((var0.field900 & 127) == 64 && (var0.field918 & 127) == 64) {
                  if(client.field689[var2][var3] == client.field690) {
                     return;
                  }

                  client.field689[var2][var3] = client.field690;
               }

               var0.field572 = class264.method4955(var0.field900, var0.field918, class192.field2415);
               var0.field905 = client.field679;
               class56.field523.method2945(class192.field2415, var0.field900, var0.field918, var0.field572, 60, var0, var0.field883, var4, var0.field884);
            }
         }
      }

   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2117746287"
   )
   static final void method595() {
      for(class70 var0 = (class70)client.field660.method4113(); var0 != null; var0 = (class70)client.field660.method4104()) {
         if(var0.field1034 == class192.field2415 && !var0.field1041) {
            if(client.field679 >= var0.field1033) {
               var0.method1812(client.field654);
               if(var0.field1041) {
                  var0.method4098();
               } else {
                  class56.field523.method2945(var0.field1034, var0.field1035, var0.field1044, var0.field1037, 60, var0, 0, -1L, false);
               }
            }
         } else {
            var0.method4098();
         }
      }

   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      signature = "(III)Ljava/lang/String;",
      garbageValue = "49130054"
   )
   static final String method598(int var0, int var1) {
      int var2 = var1 - var0;
      return var2 < -9?class50.method1060(16711680):(var2 < -6?class50.method1060(16723968):(var2 < -3?class50.method1060(16740352):(var2 < 0?class50.method1060(16756736):(var2 > 9?class50.method1060('\uff00'):(var2 > 6?class50.method1060(4259584):(var2 > 3?class50.method1060(8453888):(var2 > 0?class50.method1060(12648192):class50.method1060(16776960))))))));
   }
}
