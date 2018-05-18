import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public final class class42 extends Canvas {

   @ObfuscatedName("w")
   Component field360;


   class42(Component var1) {
      this.field360 = var1;
   }

   public final void update(Graphics var1) {
      this.field360.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field360.paint(var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2000852642"
   )
   public static boolean method785(int var0) {
      if(class80.field1173[var0]) {
         return true;
      } else if(!class130.field1824.method4639(var0)) {
         return false;
      } else {
         int var1 = class130.field1824.method4638(var0);
         if(var1 == 0) {
            class80.field1173[var0] = true;
            return true;
         } else {
            if(class230.field2615[var0] == null) {
               class230.field2615[var0] = new class230[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if(class230.field2615[var0][var2] == null) {
                  byte[] var3 = class130.field1824.method4626(var0, var2);
                  if(var3 != null) {
                     class230.field2615[var0][var2] = new class230();
                     class230.field2615[var0][var2].field2623 = var2 + (var0 << 16);
                     if(var3[0] == -1) {
                        class230.field2615[var0][var2].method4522(new class182(var3));
                     } else {
                        class230.field2615[var0][var2].method4555(new class182(var3));
                     }
                  }
               }
            }

            class80.field1173[var0] = true;
            return true;
         }
      }
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "(Lic;Ljava/lang/String;B)V",
      garbageValue = "65"
   )
   static void method775(class249 var0, String var1) {
      class52 var2 = new class52(var0, var1);
      client.field786.add(var2);
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2010402622"
   )
   static void method784() {
      int var0;
      if(client.field823 == 0) {
         class56.field523 = new class125(4, 104, 104, class50.field447);

         for(var0 = 0; var0 < 4; ++var0) {
            client.field666[var0] = new class164(104, 104);
         }

         class283.field3633 = new class318(512, 512);
         class78.field1121 = "Starting game engine...";
         class78.field1120 = 5;
         client.field823 = 20;
      } else {
         int var1;
         int var2;
         int var3;
         int var4;
         if(client.field823 == 20) {
            int[] var30 = new int[9];

            for(var1 = 0; var1 < 9; ++var1) {
               var2 = var1 * 32 + 15 + 128;
               var3 = var2 * 3 + 600;
               var4 = class122.field1702[var2];
               var30[var1] = var3 * var4 >> 16;
            }

            class125.method2936(var30, 500, 800, 512, 334);
            class78.field1121 = "Prepared visibility map";
            class78.field1120 = 10;
            client.field823 = 30;
         } else if(client.field823 == 30) {
            class245.field3161 = class24.method461(0, false, true, true);
            client.field626 = class24.method461(1, false, true, true);
            class9.field62 = class24.method461(2, true, false, true);
            class19.field169 = class24.method461(3, false, true, true);
            class110.field1459 = class24.method461(4, false, true, true);
            class234.field2796 = class24.method461(5, true, true, true);
            class48.field436 = class24.method461(6, true, true, true);
            class216.field2477 = class24.method461(7, false, true, true);
            class59.field553 = class24.method461(8, false, true, true);
            class183.field2374 = class24.method461(9, false, true, true);
            class22.field196 = class24.method461(10, false, true, true);
            class55.field508 = class24.method461(11, false, true, true);
            class3.field21 = class24.method461(12, false, true, true);
            class3.field24 = class24.method461(13, true, false, true);
            class10.field77 = class24.method461(14, false, true, true);
            class6.field40 = class24.method461(15, false, true, true);
            class48.field435 = class24.method461(16, true, true, true);
            class78.field1121 = "Connecting to update server";
            class78.field1120 = 20;
            client.field823 = 40;
         } else if(client.field823 == 40) {
            byte var26 = 0;
            var0 = var26 + class245.field3161.method4739() * 4 / 100;
            var0 += client.field626.method4739() * 4 / 100;
            var0 += class9.field62.method4739() * 2 / 100;
            var0 += class19.field169.method4739() * 2 / 100;
            var0 += class110.field1459.method4739() * 6 / 100;
            var0 += class234.field2796.method4739() * 4 / 100;
            var0 += class48.field436.method4739() * 2 / 100;
            var0 += class216.field2477.method4739() * 58 / 100;
            var0 += class59.field553.method4739() * 2 / 100;
            var0 += class183.field2374.method4739() * 2 / 100;
            var0 += class22.field196.method4739() * 2 / 100;
            var0 += class55.field508.method4739() * 2 / 100;
            var0 += class3.field21.method4739() * 2 / 100;
            var0 += class3.field24.method4739() * 2 / 100;
            var0 += class10.field77.method4739() * 2 / 100;
            var0 += class6.field40.method4739() * 2 / 100;
            var0 += class48.field435.method4739() * 2 / 100;
            if(var0 != 100) {
               if(var0 != 0) {
                  class78.field1121 = "Checking for updates - " + var0 + "%";
               }

               class78.field1120 = 30;
            } else {
               method775(class245.field3161, "Animations");
               method775(client.field626, "Skeletons");
               method775(class110.field1459, "Sound FX");
               method775(class234.field2796, "Maps");
               method775(class48.field436, "Music Tracks");
               method775(class216.field2477, "Models");
               method775(class59.field553, "Sprites");
               method775(class55.field508, "Music Jingles");
               method775(class10.field77, "Music Samples");
               method775(class6.field40, "Music Patches");
               method775(class48.field435, "World Map");
               class78.field1121 = "Loaded update list";
               class78.field1120 = 30;
               client.field823 = 45;
            }
         } else {
            class249 var21;
            class249 var22;
            class249 var23;
            if(client.field823 == 45) {
               class184.method3828(22050, !client.field708, 2);
               class218 var29 = new class218();
               var29.method4235(9, 128);
               class2.field11 = class183.method3818(class47.field409, 0, 22050);
               class2.field11.method2226(var29);
               var21 = class6.field40;
               var22 = class10.field77;
               var23 = class110.field1459;
               class217.field2484 = var21;
               class217.field2482 = var22;
               class217.field2490 = var23;
               class217.field2485 = var29;
               class191.field2411 = class183.method3818(class47.field409, 1, 2048);
               class141.field1906 = new class88();
               class191.field2411.method2226(class141.field1906);
               class245.field3166 = new class102(22050, class95.field1330);
               class78.field1121 = "Prepared sound engine";
               class78.field1120 = 35;
               client.field823 = 50;
               class164.field2056 = new class296(class59.field553, class3.field24);
            } else if(client.field823 == 50) {
               class295[] var28 = new class295[]{class295.field3681, class295.field3682, class295.field3680, class295.field3685, class295.field3683, class295.field3684};
               var1 = var28.length;
               class296 var31 = class164.field2056;
               class295[] var32 = new class295[]{class295.field3681, class295.field3682, class295.field3680, class295.field3685, class295.field3683, class295.field3684};
               client.field644 = var31.method5522(var32);
               if(client.field644.size() < var1) {
                  class78.field1121 = "Loading fonts - " + client.field644.size() * 100 / var1 + "%";
                  class78.field1120 = 40;
               } else {
                  class170.field2264 = (class298)client.field644.get(class295.field3680);
                  class56.field524 = (class298)client.field644.get(class295.field3681);
                  class55.field499 = (class298)client.field644.get(class295.field3685);
                  class77.field1100 = new class324(true);
                  class78.field1121 = "Loaded fonts";
                  class78.field1120 = 40;
                  client.field823 = 60;
               }
            } else if(client.field823 == 60) {
               var21 = class22.field196;
               var22 = class59.field553;
               var3 = 0;
               if(var21.method4688("title.jpg", "")) {
                  ++var3;
               }

               if(var22.method4688("logo", "")) {
                  ++var3;
               }

               if(var22.method4688("logo_deadman_mode", "")) {
                  ++var3;
               }

               if(var22.method4688("titlebox", "")) {
                  ++var3;
               }

               if(var22.method4688("titlebutton", "")) {
                  ++var3;
               }

               if(var22.method4688("runes", "")) {
                  ++var3;
               }

               if(var22.method4688("title_mute", "")) {
                  ++var3;
               }

               if(var22.method4688("options_radio_buttons,0", "")) {
                  ++var3;
               }

               if(var22.method4688("options_radio_buttons,2", "")) {
                  ++var3;
               }

               if(var22.method4688("options_radio_buttons,4", "")) {
                  ++var3;
               }

               if(var22.method4688("options_radio_buttons,6", "")) {
                  ++var3;
               }

               var22.method4688("sl_back", "");
               var22.method4688("sl_flags", "");
               var22.method4688("sl_arrows", "");
               var22.method4688("sl_stars", "");
               var22.method4688("sl_button", "");
               byte var25 = 11;
               if(var3 < var25) {
                  class78.field1121 = "Loading title screen - " + var3 * 100 / var25 + "%";
                  class78.field1120 = 50;
               } else {
                  class78.field1121 = "Loaded title screen";
                  class78.field1120 = 50;
                  class102.method2310(5);
                  client.field823 = 70;
               }
            } else if(client.field823 == 70) {
               if(!class9.field62.method4631()) {
                  class78.field1121 = "Loading config - " + class9.field62.method4746() + "%";
                  class78.field1120 = 60;
               } else {
                  class249 var27 = class9.field62;
                  class272.field3539 = var27;
                  class257.method4860(class9.field62);
                  class83.method1986(class9.field62, class216.field2477);
                  class260.method4924(class9.field62, class216.field2477, client.field708);
                  var21 = class9.field62;
                  var22 = class216.field2477;
                  class271.field3532 = var21;
                  class271.field3522 = var22;
                  class312.method5752(class9.field62);
                  var23 = class9.field62;
                  class249 var24 = class216.field2477;
                  boolean var5 = client.field628;
                  class298 var6 = class170.field2264;
                  class269.field3443 = var23;
                  class256.field3281 = var24;
                  class4.field31 = var5;
                  class49.field443 = class269.field3443.method4638(10);
                  class163.field2036 = var6;
                  class249 var7 = class9.field62;
                  class249 var8 = class245.field3161;
                  class249 var9 = client.field626;
                  class273.field3548 = var7;
                  class273.field3549 = var8;
                  class273.field3550 = var9;
                  client.method1576(class9.field62, class216.field2477);
                  class84.method2002(class9.field62);
                  class249 var10 = class9.field62;
                  class254.field3254 = var10;
                  class254.field3251 = class254.field3254.method4638(16);
                  class157.method3310(class19.field169, class216.field2477, class59.field553, class3.field24);
                  class249 var11 = class9.field62;
                  class253.field3247 = var11;
                  class12.method124(class9.field62);
                  class249 var12 = class9.field62;
                  class256.field3278 = var12;
                  class249 var13 = class9.field62;
                  class257.field3283 = var13;
                  class256.method4852(class9.field62);
                  class242.field3144 = new class82();
                  class81.method1923(class9.field62, class59.field553, class3.field24);
                  class249 var14 = class9.field62;
                  class249 var15 = class59.field553;
                  class261.field3329 = var14;
                  class261.field3322 = var15;
                  class249 var16 = class9.field62;
                  class249 var17 = class59.field553;
                  class255.field3256 = var17;
                  if(var16.method4631()) {
                     class255.field3257 = var16.method4638(35);
                     class255.field3274 = new class255[class255.field3257];

                     for(int var18 = 0; var18 < class255.field3257; ++var18) {
                        byte[] var19 = var16.method4626(35, var18);
                        if(var19 != null) {
                           class255.field3274[var18] = new class255(var18);
                           class255.field3274[var18].method4826(new class182(var19));
                           class255.field3274[var18].method4827();
                        }
                     }
                  }

                  class78.field1121 = "Loaded config";
                  class78.field1120 = 60;
                  client.field823 = 80;
               }
            } else if(client.field823 == 80) {
               var0 = 0;
               if(class35.field302 == null) {
                  class35.field302 = class276.method5251(class59.field553, "compass", "");
               } else {
                  ++var0;
               }

               if(class127.field1804 == null) {
                  class127.field1804 = class276.method5251(class59.field553, "mapedge", "");
               } else {
                  ++var0;
               }

               if(class0.field0 == null) {
                  class0.field0 = class278.method5253(class59.field553, "mapscene", "");
               } else {
                  ++var0;
               }

               if(class63.field886 == null) {
                  class63.field886 = class36.method689(class59.field553, "headicons_pk", "");
               } else {
                  ++var0;
               }

               if(class39.field335 == null) {
                  class39.field335 = class36.method689(class59.field553, "headicons_prayer", "");
               } else {
                  ++var0;
               }

               if(class262.field3335 == null) {
                  class262.field3335 = class36.method689(class59.field553, "headicons_hint", "");
               } else {
                  ++var0;
               }

               if(class217.field2488 == null) {
                  class217.field2488 = class36.method689(class59.field553, "mapmarker", "");
               } else {
                  ++var0;
               }

               if(class110.field1460 == null) {
                  class110.field1460 = class36.method689(class59.field553, "cross", "");
               } else {
                  ++var0;
               }

               if(class81.field1190 == null) {
                  class81.field1190 = class36.method689(class59.field553, "mapdots", "");
               } else {
                  ++var0;
               }

               if(class71.field1049 == null) {
                  class71.field1049 = class278.method5253(class59.field553, "scrollbar", "");
               } else {
                  ++var0;
               }

               if(class78.field1115 == null) {
                  class78.field1115 = class278.method5253(class59.field553, "mod_icons", "");
               } else {
                  ++var0;
               }

               if(var0 < 11) {
                  class78.field1121 = "Loading sprites - " + var0 * 100 / 12 + "%";
                  class78.field1120 = 70;
               } else {
                  class299.field3711 = class78.field1115;
                  class127.field1804.method5958();
                  var1 = (int)(Math.random() * 21.0D) - 10;
                  var2 = (int)(Math.random() * 21.0D) - 10;
                  var3 = (int)(Math.random() * 21.0D) - 10;
                  var4 = (int)(Math.random() * 41.0D) - 20;
                  class0.field0[0].method5864(var1 + var4, var2 + var4, var3 + var4);
                  class78.field1121 = "Loaded sprites";
                  class78.field1120 = 70;
                  client.field823 = 90;
               }
            } else if(client.field823 == 90) {
               if(!class183.field2374.method4631()) {
                  class78.field1121 = "Loading textures - " + "0%";
                  class78.field1120 = 90;
               } else {
                  class10.field72 = new class111(class183.field2374, class59.field553, 20, 0.8D, client.field708?64:128);
                  class122.method2890(class10.field72);
                  class122.method2823(0.8D);
                  client.field823 = 100;
               }
            } else if(client.field823 == 100) {
               var0 = class10.field72.method2616();
               if(var0 < 100) {
                  class78.field1121 = "Loading textures - " + var0 + "%";
                  class78.field1120 = 90;
               } else {
                  class78.field1121 = "Loaded textures";
                  class78.field1120 = 90;
                  client.field823 = 110;
               }
            } else if(client.field823 == 110) {
               class257.field3282 = new class57();
               class47.field409.method3252(class257.field3282, 10);
               class78.field1121 = "Loaded input handler";
               class78.field1120 = 92;
               client.field823 = 120;
            } else if(client.field823 == 120) {
               if(!class22.field196.method4688("huffman", "")) {
                  class78.field1121 = "Loading wordpack - " + 0 + "%";
                  class78.field1120 = 94;
               } else {
                  class174 var20 = new class174(class22.field196.method4647("huffman", ""));
                  class300.field3724 = var20;
                  class78.field1121 = "Loaded wordpack";
                  class78.field1120 = 94;
                  client.field823 = 130;
               }
            } else if(client.field823 == 130) {
               if(!class19.field169.method4631()) {
                  class78.field1121 = "Loading interfaces - " + class19.field169.method4746() * 4 / 5 + "%";
                  class78.field1120 = 96;
               } else if(!class3.field21.method4631()) {
                  class78.field1121 = "Loading interfaces - " + (80 + class3.field21.method4746() / 6) + "%";
                  class78.field1120 = 96;
               } else if(!class3.field24.method4631()) {
                  class78.field1121 = "Loading interfaces - " + (96 + class3.field24.method4746() / 50) + "%";
                  class78.field1120 = 96;
               } else {
                  class78.field1121 = "Loaded interfaces";
                  class78.field1120 = 98;
                  client.field823 = 140;
               }
            } else if(client.field823 == 140) {
               class78.field1120 = 100;
               if(!class48.field435.method4713(class29.field257.field262)) {
                  class78.field1121 = "Loading world map - " + class48.field435.method4651(class29.field257.field262) / 10 + "%";
               } else {
                  if(class66.field987 == null) {
                     class66.field987 = new class321();
                     class66.field987.method6047(class48.field435, class55.field499, client.field644, class0.field0);
                  }

                  var0 = class66.field987.method6048();
                  if(var0 < 100) {
                     class78.field1121 = "Loading world map - " + (var0 * 9 / 10 + 10) + "%";
                  } else {
                     class78.field1121 = "Loaded world map";
                     client.field823 = 150;
                  }
               }
            } else if(client.field823 == 150) {
               class102.method2310(10);
            }
         }
      }
   }

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "62"
   )
   static final void method774() {
      for(int var0 = 0; var0 < client.field598; ++var0) {
         --client.field831[var0];
         if(client.field831[var0] < -10) {
            --client.field598;

            for(int var1 = var0; var1 < client.field598; ++var1) {
               client.field829[var1] = client.field829[var1 + 1];
               client.field762[var1] = client.field762[var1 + 1];
               client.field695[var1] = client.field695[var1 + 1];
               client.field831[var1] = client.field831[var1 + 1];
               client.field832[var1] = client.field832[var1 + 1];
            }

            --var0;
         } else {
            class91 var9 = client.field762[var0];
            if(var9 == null) {
               Object var10000 = null;
               var9 = class91.method2114(class110.field1459, client.field829[var0], 0);
               if(var9 == null) {
                  continue;
               }

               client.field831[var0] += var9.method2113();
               client.field762[var0] = var9;
            }

            if(client.field831[var0] < 0) {
               int var2;
               if(client.field832[var0] != 0) {
                  int var3 = (client.field832[var0] & 255) * 128;
                  int var4 = client.field832[var0] >> 16 & 255;
                  int var5 = var4 * 128 + 64 - class150.field1948.field900;
                  if(var5 < 0) {
                     var5 = -var5;
                  }

                  int var6 = client.field832[var0] >> 8 & 255;
                  int var7 = var6 * 128 + 64 - class150.field1948.field918;
                  if(var7 < 0) {
                     var7 = -var7;
                  }

                  int var8 = var5 + var7 - 128;
                  if(var8 > var3) {
                     client.field831[var0] = -100;
                     continue;
                  }

                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var2 = (var3 - var8) * client.field827 / var3;
               } else {
                  var2 = client.field768;
               }

               if(var2 > 0) {
                  class93 var10 = var9.method2110().method2158(class245.field3166);
                  class103 var11 = class103.method2370(var10, 100, var2);
                  var11.method2318(client.field695[var0] - 1);
                  class141.field1906.method2049(var11);
               }

               client.field831[var0] = -100;
            }
         }
      }

      if(client.field825 && !class158.method3314()) {
         if(client.field693 != 0 && client.field824 != -1) {
            class179.method3537(class48.field436, client.field824, 0, client.field693, false);
         }

         client.field825 = false;
      }

   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      signature = "(Lbu;IIBI)V",
      garbageValue = "2145269634"
   )
   static final void method783(class60 var0, int var1, int var2, byte var3) {
      int var4 = var0.field928[0];
      int var5 = var0.field939[0];
      int var6 = var0.method1141();
      if(var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if(var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var8 = var0.method1141();
            class166 var9 = class169.method3461(var1, var2);
            class164 var10 = client.field666[var0.field581];
            int[] var11 = client.field680;
            int[] var12 = client.field864;

            int var13;
            int var14;
            for(var13 = 0; var13 < 128; ++var13) {
               for(var14 = 0; var14 < 128; ++var14) {
                  class165.field2059[var13][var14] = 0;
                  class165.field2058[var13][var14] = 99999999;
               }
            }

            int var15;
            int var16;
            byte var18;
            int var19;
            int var20;
            int var22;
            int var24;
            int var25;
            int var26;
            boolean var33;
            int var35;
            int var36;
            int var38;
            if(var8 == 1) {
               var15 = var4;
               var16 = var5;
               byte var17 = 64;
               var18 = 64;
               var19 = var4 - var17;
               var20 = var5 - var18;
               class165.field2059[var17][var18] = 99;
               class165.field2058[var17][var18] = 0;
               byte var21 = 0;
               var22 = 0;
               class165.field2061[var21] = var4;
               var38 = var21 + 1;
               class165.field2060[var21] = var5;
               int[][] var23 = var10.field2055;

               boolean var34;
               while(true) {
                  if(var22 == var38) {
                     class310.field3748 = var15;
                     class51.field463 = var16;
                     var34 = false;
                     break;
                  }

                  var15 = class165.field2061[var22];
                  var16 = class165.field2060[var22];
                  var22 = var22 + 1 & 4095;
                  var35 = var15 - var19;
                  var36 = var16 - var20;
                  var24 = var15 - var10.field2049;
                  var25 = var16 - var10.field2050;
                  if(var9.vmethod3457(1, var15, var16, var10)) {
                     class310.field3748 = var15;
                     class51.field463 = var16;
                     var34 = true;
                     break;
                  }

                  var26 = class165.field2058[var35][var36] + 1;
                  if(var35 > 0 && class165.field2059[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136776) == 0) {
                     class165.field2061[var38] = var15 - 1;
                     class165.field2060[var38] = var16;
                     var38 = var38 + 1 & 4095;
                     class165.field2059[var35 - 1][var36] = 2;
                     class165.field2058[var35 - 1][var36] = var26;
                  }

                  if(var35 < 127 && class165.field2059[var35 + 1][var36] == 0 && (var23[var24 + 1][var25] & 19136896) == 0) {
                     class165.field2061[var38] = var15 + 1;
                     class165.field2060[var38] = var16;
                     var38 = var38 + 1 & 4095;
                     class165.field2059[var35 + 1][var36] = 8;
                     class165.field2058[var35 + 1][var36] = var26;
                  }

                  if(var36 > 0 && class165.field2059[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
                     class165.field2061[var38] = var15;
                     class165.field2060[var38] = var16 - 1;
                     var38 = var38 + 1 & 4095;
                     class165.field2059[var35][var36 - 1] = 1;
                     class165.field2058[var35][var36 - 1] = var26;
                  }

                  if(var36 < 127 && class165.field2059[var35][var36 + 1] == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
                     class165.field2061[var38] = var15;
                     class165.field2060[var38] = var16 + 1;
                     var38 = var38 + 1 & 4095;
                     class165.field2059[var35][var36 + 1] = 4;
                     class165.field2058[var35][var36 + 1] = var26;
                  }

                  if(var35 > 0 && var36 > 0 && class165.field2059[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
                     class165.field2061[var38] = var15 - 1;
                     class165.field2060[var38] = var16 - 1;
                     var38 = var38 + 1 & 4095;
                     class165.field2059[var35 - 1][var36 - 1] = 3;
                     class165.field2058[var35 - 1][var36 - 1] = var26;
                  }

                  if(var35 < 127 && var36 > 0 && class165.field2059[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
                     class165.field2061[var38] = var15 + 1;
                     class165.field2060[var38] = var16 - 1;
                     var38 = var38 + 1 & 4095;
                     class165.field2059[var35 + 1][var36 - 1] = 9;
                     class165.field2058[var35 + 1][var36 - 1] = var26;
                  }

                  if(var35 > 0 && var36 < 127 && class165.field2059[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
                     class165.field2061[var38] = var15 - 1;
                     class165.field2060[var38] = var16 + 1;
                     var38 = var38 + 1 & 4095;
                     class165.field2059[var35 - 1][var36 + 1] = 6;
                     class165.field2058[var35 - 1][var36 + 1] = var26;
                  }

                  if(var35 < 127 && var36 < 127 && class165.field2059[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 1] & 19136992) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
                     class165.field2061[var38] = var15 + 1;
                     class165.field2060[var38] = var16 + 1;
                     var38 = var38 + 1 & 4095;
                     class165.field2059[var35 + 1][var36 + 1] = 12;
                     class165.field2058[var35 + 1][var36 + 1] = var26;
                  }
               }

               var33 = var34;
            } else if(var8 == 2) {
               var33 = class50.method1059(var4, var5, var9, var10);
            } else {
               var33 = class18.method219(var4, var5, var8, var9, var10);
            }

            int var7;
            label364: {
               var14 = var4 - 64;
               var15 = var5 - 64;
               var16 = class310.field3748;
               var35 = class51.field463;
               if(!var33) {
                  var36 = Integer.MAX_VALUE;
                  var19 = Integer.MAX_VALUE;
                  byte var37 = 10;
                  var38 = var9.field2066;
                  var22 = var9.field2067;
                  int var32 = var9.field2070;
                  var24 = var9.field2069;

                  for(var25 = var38 - var37; var25 <= var38 + var37; ++var25) {
                     for(var26 = var22 - var37; var26 <= var22 + var37; ++var26) {
                        int var27 = var25 - var14;
                        int var28 = var26 - var15;
                        if(var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class165.field2058[var27][var28] < 100) {
                           int var29 = 0;
                           if(var25 < var38) {
                              var29 = var38 - var25;
                           } else if(var25 > var32 + var38 - 1) {
                              var29 = var25 - (var32 + var38 - 1);
                           }

                           int var30 = 0;
                           if(var26 < var22) {
                              var30 = var22 - var26;
                           } else if(var26 > var22 + var24 - 1) {
                              var30 = var26 - (var22 + var24 - 1);
                           }

                           int var31 = var30 * var30 + var29 * var29;
                           if(var31 < var36 || var31 == var36 && class165.field2058[var27][var28] < var19) {
                              var36 = var31;
                              var19 = class165.field2058[var27][var28];
                              var16 = var25;
                              var35 = var26;
                           }
                        }
                     }
                  }

                  if(var36 == Integer.MAX_VALUE) {
                     var7 = -1;
                     break label364;
                  }
               }

               if(var4 == var16 && var35 == var5) {
                  var7 = 0;
               } else {
                  var18 = 0;
                  class165.field2061[var18] = var16;
                  var36 = var18 + 1;
                  class165.field2060[var18] = var35;

                  for(var19 = var20 = class165.field2059[var16 - var14][var35 - var15]; var16 != var4 || var5 != var35; var19 = class165.field2059[var16 - var14][var35 - var15]) {
                     if(var20 != var19) {
                        var20 = var19;
                        class165.field2061[var36] = var16;
                        class165.field2060[var36++] = var35;
                     }

                     if((var19 & 2) != 0) {
                        ++var16;
                     } else if((var19 & 8) != 0) {
                        --var16;
                     }

                     if((var19 & 1) != 0) {
                        ++var35;
                     } else if((var19 & 4) != 0) {
                        --var35;
                     }
                  }

                  var38 = 0;

                  while(var36-- > 0) {
                     var11[var38] = class165.field2061[var36];
                     var12[var38++] = class165.field2060[var36];
                     if(var38 >= var11.length) {
                        break;
                     }
                  }

                  var7 = var38;
               }
            }

            var13 = var7;
            if(var7 >= 1) {
               for(var14 = 0; var14 < var13 - 1; ++var14) {
                  var0.method1164(client.field680[var14], client.field864[var14], var3);
               }

            }
         }
      }
   }
}
