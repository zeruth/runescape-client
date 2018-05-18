import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public final class class72 extends class63 {

   @ObfuscatedName("n")
   static byte[][][] field1055;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 160231311
   )
   static int field1056;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ljj;"
   )
   class271 field1058;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IBB)V",
      garbageValue = "71"
   )
   final void method1824(int var1, byte var2) {
      int var3 = super.field928[0];
      int var4 = super.field939[0];
      if(var1 == 0) {
         --var3;
         ++var4;
      }

      if(var1 == 1) {
         ++var4;
      }

      if(var1 == 2) {
         ++var3;
         ++var4;
      }

      if(var1 == 3) {
         --var3;
      }

      if(var1 == 4) {
         ++var3;
      }

      if(var1 == 5) {
         --var3;
         --var4;
      }

      if(var1 == 6) {
         --var4;
      }

      if(var1 == 7) {
         ++var3;
         --var4;
      }

      if(super.field915 != -1 && class137.method3151(super.field915).field3563 == 1) {
         super.field915 = -1;
      }

      if(super.field937 < 9) {
         ++super.field937;
      }

      for(int var5 = super.field937; var5 > 0; --var5) {
         super.field928[var5] = super.field928[var5 - 1];
         super.field939[var5] = super.field939[var5 - 1];
         super.field940[var5] = super.field940[var5 - 1];
      }

      super.field928[0] = var3;
      super.field939[0] = var4;
      super.field940[0] = var2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIZS)V",
      garbageValue = "30985"
   )
   final void method1823(int var1, int var2, boolean var3) {
      if(super.field915 != -1 && class137.method3151(super.field915).field3563 == 1) {
         super.field915 = -1;
      }

      if(!var3) {
         int var4 = var1 - super.field928[0];
         int var5 = var2 - super.field939[0];
         if(var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if(super.field937 < 9) {
               ++super.field937;
            }

            for(int var6 = super.field937; var6 > 0; --var6) {
               super.field928[var6] = super.field928[var6 - 1];
               super.field939[var6] = super.field939[var6 - 1];
               super.field940[var6] = super.field940[var6 - 1];
            }

            super.field928[0] = var1;
            super.field939[0] = var2;
            super.field940[0] = 1;
            return;
         }
      }

      super.field937 = 0;
      super.field942 = 0;
      super.field936 = 0;
      super.field928[0] = var1;
      super.field939[0] = var2;
      super.field900 = super.field885 * 64 + super.field928[0] * 128;
      super.field918 = super.field885 * 64 + super.field939[0] * 128;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Ldk;",
      garbageValue = "111"
   )
   protected final class119 vmethod3078() {
      if(this.field1058 == null) {
         return null;
      } else {
         class273 var1 = super.field915 != -1 && super.field913 == 0?class137.method3151(super.field915):null;
         class273 var2 = super.field912 != -1 && (super.field909 != super.field912 || var1 == null)?class137.method3151(super.field912):null;
         class119 var3 = this.field1058.method5171(var1, super.field916, var2, super.field911);
         if(var3 == null) {
            return null;
         } else {
            var3.method2725();
            super.field922 = var3.field1805;
            if(super.field920 != -1 && super.field921 != -1) {
               class119 var4 = class51.method1064(super.field920).method4864(super.field921);
               if(var4 != null) {
                  var4.method2736(0, -super.field924, 0);
                  class119[] var5 = new class119[]{var3, var4};
                  var3 = new class119(var5, 2);
               }
            }

            if(this.field1058.field3519 == 1) {
               var3.field1636 = true;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "0"
   )
   final boolean vmethod1828() {
      return this.field1058 != null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;ZII)V",
      garbageValue = "-2126731808"
   )
   static void method1841(class247 var0, class247 var1, boolean var2, int var3) {
      if(class78.field1122) {
         if(var3 == 4) {
            class78.field1135 = 4;
         }

      } else {
         class78.field1135 = var3;
         class314.method5767();
         byte[] var4 = var0.method4647("title.jpg", "");
         class78.field1107 = class256.method4854(var4);
         class24.field224 = class78.field1107.method5956();
         if((client.field726 & 536870912) != 0) {
            class78.field1108 = class47.method984(var1, "logo_deadman_mode", "");
         } else {
            class78.field1108 = class47.method984(var1, "logo", "");
         }

         class78.field1105 = class47.method984(var1, "titlebox", "");
         class78.field1113 = class47.method984(var1, "titlebutton", "");
         class192.field2416 = class278.method5253(var1, "runes", "");
         class55.field502 = class278.method5253(var1, "title_mute", "");
         class78.field1109 = class47.method984(var1, "options_radio_buttons,0", "");
         class64.field944 = class47.method984(var1, "options_radio_buttons,4", "");
         class78.field1110 = class47.method984(var1, "options_radio_buttons,2", "");
         class182.field2363 = class47.method984(var1, "options_radio_buttons,6", "");
         class136.field1881 = class78.field1109.field3786;
         class69.field1028 = class78.field1109.field3787;
         class0.field4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 64; ++var5) {
            class0.field4[var5] = var5 * 262144;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class0.field4[var5 + 64] = var5 * 1024 + 16711680;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class0.field4[var5 + 128] = var5 * 4 + 16776960;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class0.field4[var5 + 192] = 16777215;
         }

         class81.field1178 = new int[256];

         for(var5 = 0; var5 < 64; ++var5) {
            class81.field1178[var5] = var5 * 1024;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class81.field1178[var5 + 64] = var5 * 4 + '\uff00';
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class81.field1178[var5 + 128] = var5 * 262144 + '\uffff';
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class81.field1178[var5 + 192] = 16777215;
         }

         class85.field1228 = new int[256];

         for(var5 = 0; var5 < 64; ++var5) {
            class85.field1228[var5] = var5 * 4;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class85.field1228[var5 + 64] = var5 * 262144 + 255;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class85.field1228[var5 + 128] = var5 * 1024 + 16711935;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            class85.field1228[var5 + 192] = 16777215;
         }

         class45.field376 = new int[256];
         class8.field51 = new int['\u8000'];
         class83.field1206 = new int['\u8000'];
         class43.method790((class317)null);
         class297.field3701 = new int['\u8000'];
         class274.field3569 = new int['\u8000'];
         if(var2) {
            class78.field1127 = "";
            class78.field1143 = "";
         }

         class58.field549 = 0;
         class47.field414 = "";
         class78.field1132 = true;
         class78.field1136 = false;
         if(!class51.field468.field982) {
            class249 var8 = class48.field436;
            int var6 = var8.method4644("scape main");
            int var7 = var8.method4693(var6, "");
            class169.method3459(2, var8, var6, var7, 255, false);
         } else {
            class190.method3911(2);
         }

         class14.method139(false);
         class78.field1122 = true;
         class78.field1104 = (class9.field70 - 765) / 2;
         class78.field1117 = class78.field1104 + 202;
         class78.field1112 = class78.field1117 + 180;
         class78.field1107.method5893(class78.field1104, 0);
         class24.field224.method5893(class78.field1104 + 382, 0);
         class78.field1108.method5873(class78.field1104 + 382 - class78.field1108.field3786 / 2, 18);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;III)Llh;",
      garbageValue = "1929954642"
   )
   static class317 method1842(class247 var0, int var1, int var2) {
      return !class306.method5702(var0, var1, var2)?null:class224.method4461();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-654488904"
   )
   static int method1831(int var0, class84 var1, boolean var2) {
      class230 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class61.method1188(class69.field1026[--class45.field377]);
      } else {
         var3 = var2?class184.field2379:class67.field996;
      }

      int var4;
      if(var0 == 1300) {
         var4 = class69.field1026[--class45.field377] - 1;
         if(var4 >= 0 && var4 <= 9) {
            var3.method4531(var4, class69.field1021[--class83.field1207]);
            return 1;
         } else {
            --class83.field1207;
            return 1;
         }
      } else if(var0 == 1301) {
         class45.field377 -= 2;
         var4 = class69.field1026[class45.field377];
         int var5 = class69.field1026[class45.field377 + 1];
         var3.field2624 = class21.method304(var4, var5);
         return 1;
      } else if(var0 == 1302) {
         var3.field2702 = class69.field1026[--class45.field377] == 1;
         return 1;
      } else if(var0 == 1303) {
         var3.field2687 = class69.field1026[--class45.field377];
         return 1;
      } else if(var0 == 1304) {
         var3.field2694 = class69.field1026[--class45.field377];
         return 1;
      } else if(var0 == 1305) {
         var3.field2697 = class69.field1021[--class83.field1207];
         return 1;
      } else if(var0 == 1306) {
         var3.field2703 = class69.field1021[--class83.field1207];
         return 1;
      } else if(var0 == 1307) {
         var3.field2698 = null;
         return 1;
      } else {
         return 2;
      }
   }
}
