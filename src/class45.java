import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class45 {

   @ObfuscatedName("w")
   public static Applet field374 = null;
   @ObfuscatedName("m")
   public static String field368 = "";
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -317870921
   )
   static int field377;
   @ObfuscatedName("z")
   static int[] field376;
   @ObfuscatedName("lt")
   @ObfuscatedGetter(
      intValue = 1439319859
   )
   static int field373;


   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Laa;I)V",
      garbageValue = "-2097585990"
   )
   static void method819(class47 var0) {
      if(class78.field1136) {
         class148.method3205(var0);
      } else {
         if((class48.field431 == 1 || !class8.field57 && class48.field431 == 4) && class48.field432 >= class78.field1104 + 765 - 50 && class48.field437 >= 453) {
            class51.field468.field982 = !class51.field468.field982;
            class266.method5008();
            if(!class51.field468.field982) {
               class115.method2703(class48.field436, "scape main", "", 255, false);
            } else {
               class37.method721();
            }
         }

         if(client.field611 != 5) {
            if(class78.field1106 == -1L) {
               class78.field1106 = class166.method3456() + 1000L;
            }

            long var1 = class166.method3456();
            boolean var3;
            if(client.field786 != null && client.field861 < client.field786.size()) {
               while(true) {
                  if(client.field861 >= client.field786.size()) {
                     var3 = true;
                     break;
                  }

                  class52 var14 = (class52)client.field786.get(client.field861);
                  if(!var14.method1065()) {
                     var3 = false;
                     break;
                  }

                  ++client.field861;
               }
            } else {
               var3 = true;
            }

            if(var3 && class78.field1141 == -1L) {
               class78.field1141 = var1;
               if(class78.field1141 > class78.field1106) {
                  class78.field1106 = class78.field1141;
               }
            }

            ++class78.field1118;
            if(client.field611 == 10 || client.field611 == 11) {
               int var4;
               if(client.field599 == 0) {
                  if(class48.field431 == 1 || !class8.field57 && class48.field431 == 4) {
                     var4 = class78.field1104 + 5;
                     short var5 = 463;
                     byte var6 = 100;
                     byte var7 = 35;
                     if(class48.field432 >= var4 && class48.field432 <= var6 + var4 && class48.field437 >= var5 && class48.field437 <= var5 + var7) {
                        if(class248.method4734()) {
                           class78.field1136 = true;
                        }

                        return;
                     }
                  }

                  if(class65.field959 != null && class248.method4734()) {
                     class78.field1136 = true;
                  }
               }

               var4 = class48.field431;
               int var15 = class48.field432;
               int var16 = class48.field437;
               if(var4 == 0) {
                  var15 = class48.field425;
                  var16 = class48.field417;
               }

               if(!class8.field57 && var4 == 4) {
                  var4 = 1;
               }

               int var8;
               short var9;
               if(class78.field1135 == 0) {
                  boolean var17 = false;

                  while(class95.method2208()) {
                     if(class128.field1813 == 84) {
                        var17 = true;
                     }
                  }

                  var8 = class78.field1112 - 80;
                  var9 = 291;
                  if(var4 == 1 && var15 >= var8 - 75 && var15 <= var8 + 75 && var16 >= var9 - 20 && var16 <= var9 + 20) {
                     String var10 = class109.method2551("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                     class32.method590(var10, true, "openjs", false);
                  }

                  var8 = class78.field1112 + 80;
                  if(var4 == 1 && var15 >= var8 - 75 && var15 <= var8 + 75 && var16 >= var9 - 20 && var16 <= var9 + 20 || var17) {
                     if((client.field726 & 33554432) != 0) {
                        class78.field1111 = "";
                        class78.field1124 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class78.field1125 = "Your normal account will not be affected.";
                        class78.field1139 = "";
                        class78.field1135 = 1;
                        class274.method5248();
                     } else if((client.field726 & 4) != 0) {
                        if((client.field726 & 1024) != 0) {
                           class78.field1124 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class78.field1125 = "Players can attack each other almost everywhere";
                           class78.field1139 = "and the Protect Item prayer won\'t work.";
                        } else {
                           class78.field1124 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class78.field1125 = "Players can attack each other";
                           class78.field1139 = "almost everywhere.";
                        }

                        class78.field1111 = "Warning!";
                        class78.field1135 = 1;
                        class274.method5248();
                     } else if((client.field726 & 1024) != 0) {
                        class78.field1124 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class78.field1125 = "The Protect Item prayer will";
                        class78.field1139 = "not work on this world.";
                        class78.field1111 = "Warning!";
                        class78.field1135 = 1;
                        class274.method5248();
                     } else {
                        class245.method4617(false);
                     }
                  }
               } else {
                  int var18;
                  short var20;
                  if(class78.field1135 == 1) {
                     while(class95.method2208()) {
                        if(class128.field1813 == 84) {
                           class245.method4617(false);
                        } else if(class128.field1813 == 13) {
                           class78.field1135 = 0;
                        }
                     }

                     var18 = class78.field1112 - 80;
                     var20 = 321;
                     if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                        class245.method4617(false);
                     }

                     var18 = class78.field1112 + 80;
                     if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                        class78.field1135 = 0;
                     }
                  } else {
                     short var19;
                     if(class78.field1135 == 2) {
                        var19 = 201;
                        var18 = var19 + 52;
                        if(var4 == 1 && var16 >= var18 - 12 && var16 < var18 + 2) {
                           class78.field1126 = 0;
                        }

                        var18 += 15;
                        if(var4 == 1 && var16 >= var18 - 12 && var16 < var18 + 2) {
                           class78.field1126 = 1;
                        }

                        var18 += 15;
                        var19 = 361;
                        if(var4 == 1 && var16 >= var19 - 15 && var16 < var19) {
                           class102.method2307("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class78.field1135 = 5;
                           return;
                        }

                        var8 = class78.field1112 - 80;
                        var9 = 321;
                        if(var4 == 1 && var15 >= var8 - 75 && var15 <= var8 + 75 && var16 >= var9 - 20 && var16 <= var9 + 20) {
                           class78.field1127 = class78.field1127.trim();
                           if(class78.field1127.length() == 0) {
                              class102.method2307("", "Please enter your username/email address.", "");
                              return;
                           }

                           if(class78.field1143.length() == 0) {
                              class102.method2307("", "Please enter your password.", "");
                              return;
                           }

                           class102.method2307("", "Connecting to server...", "");
                           class39.method761(false);
                           class102.method2310(20);
                           return;
                        }

                        var8 = class78.field1117 + 180 + 80;
                        if(var4 == 1 && var15 >= var8 - 75 && var15 <= var8 + 75 && var16 >= var9 - 20 && var16 <= var9 + 20) {
                           class78.field1135 = 0;
                           class78.field1127 = "";
                           class78.field1143 = "";
                           class58.field549 = 0;
                           class47.field414 = "";
                           class78.field1132 = true;
                        }

                        var8 = class78.field1112 + -117;
                        var9 = 277;
                        class78.field1133 = var15 >= var8 && var15 < var8 + class136.field1881 && var16 >= var9 && var16 < var9 + class69.field1028;
                        if(var4 == 1 && class78.field1133) {
                           class78.field1129 = !class78.field1129;
                           if(!class78.field1129 && class51.field468.field980 != null) {
                              class51.field468.field980 = null;
                              class266.method5008();
                           }
                        }

                        var8 = class78.field1112 + 24;
                        var9 = 277;
                        class78.field1131 = var15 >= var8 && var15 < var8 + class136.field1881 && var16 >= var9 && var16 < var9 + class69.field1028;
                        if(var4 == 1 && class78.field1131) {
                           class51.field468.field977 = !class51.field468.field977;
                           if(!class51.field468.field977) {
                              class78.field1127 = "";
                              class51.field468.field980 = null;
                              class274.method5248();
                           }

                           class266.method5008();
                        }

                        while(class95.method2208()) {
                           boolean var12 = false;

                           for(int var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var11) {
                              if(class132.field1846 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)) {
                                 var12 = true;
                                 break;
                              }
                           }

                           if(class128.field1813 == 13) {
                              class78.field1135 = 0;
                              class78.field1127 = "";
                              class78.field1143 = "";
                              class58.field549 = 0;
                              class47.field414 = "";
                              class78.field1132 = true;
                           } else if(class78.field1126 == 0) {
                              if(class128.field1813 == 85 && class78.field1127.length() > 0) {
                                 class78.field1127 = class78.field1127.substring(0, class78.field1127.length() - 1);
                              }

                              if(class128.field1813 == 84 || class128.field1813 == 80) {
                                 class78.field1126 = 1;
                              }

                              if(var12 && class78.field1127.length() < 320) {
                                 class78.field1127 = class78.field1127 + class132.field1846;
                              }
                           } else if(class78.field1126 == 1) {
                              if(class128.field1813 == 85 && class78.field1143.length() > 0) {
                                 class78.field1143 = class78.field1143.substring(0, class78.field1143.length() - 1);
                              }

                              if(class128.field1813 == 84 || class128.field1813 == 80) {
                                 class78.field1126 = 0;
                              }

                              if(class128.field1813 == 84) {
                                 class78.field1127 = class78.field1127.trim();
                                 if(class78.field1127.length() == 0) {
                                    class102.method2307("", "Please enter your username/email address.", "");
                                    return;
                                 }

                                 if(class78.field1143.length() == 0) {
                                    class102.method2307("", "Please enter your password.", "");
                                    return;
                                 }

                                 class102.method2307("", "Connecting to server...", "");
                                 class39.method761(false);
                                 class102.method2310(20);
                                 return;
                              }

                              if(var12 && class78.field1143.length() < 20) {
                                 class78.field1143 = class78.field1143 + class132.field1846;
                              }
                           }
                        }
                     } else if(class78.field1135 == 3) {
                        var18 = class78.field1117 + 180;
                        var20 = 276;
                        if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                           class245.method4617(false);
                        }

                        var18 = class78.field1117 + 180;
                        var20 = 326;
                        if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                           class102.method2307("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class78.field1135 = 5;
                           return;
                        }
                     } else {
                        String var13;
                        boolean var21;
                        int var22;
                        if(class78.field1135 == 4) {
                           var18 = class78.field1117 + 180 - 80;
                           var20 = 321;
                           if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                              class47.field414.trim();
                              if(class47.field414.length() != 6) {
                                 class102.method2307("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class58.field549 = Integer.parseInt(class47.field414);
                              class47.field414 = "";
                              class39.method761(true);
                              class102.method2307("", "Connecting to server...", "");
                              class102.method2310(20);
                              return;
                           }

                           if(var4 == 1 && var15 >= class78.field1117 + 180 - 9 && var15 <= class78.field1117 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                              class78.field1132 = !class78.field1132;
                           }

                           if(var4 == 1 && var15 >= class78.field1117 + 180 - 34 && var15 <= class78.field1117 + 34 + 180 && var16 >= 351 && var16 <= 363) {
                              var13 = class109.method2551("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                              class32.method590(var13, true, "openjs", false);
                           }

                           var18 = class78.field1117 + 180 + 80;
                           if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                              class78.field1135 = 0;
                              class78.field1127 = "";
                              class78.field1143 = "";
                              class58.field549 = 0;
                              class47.field414 = "";
                           }

                           while(class95.method2208()) {
                              var21 = false;

                              for(var22 = 0; var22 < "1234567890".length(); ++var22) {
                                 if(class132.field1846 == "1234567890".charAt(var22)) {
                                    var21 = true;
                                    break;
                                 }
                              }

                              if(class128.field1813 == 13) {
                                 class78.field1135 = 0;
                                 class78.field1127 = "";
                                 class78.field1143 = "";
                                 class58.field549 = 0;
                                 class47.field414 = "";
                              } else {
                                 if(class128.field1813 == 85 && class47.field414.length() > 0) {
                                    class47.field414 = class47.field414.substring(0, class47.field414.length() - 1);
                                 }

                                 if(class128.field1813 == 84) {
                                    class47.field414.trim();
                                    if(class47.field414.length() != 6) {
                                       class102.method2307("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    class58.field549 = Integer.parseInt(class47.field414);
                                    class47.field414 = "";
                                    class39.method761(true);
                                    class102.method2307("", "Connecting to server...", "");
                                    class102.method2310(20);
                                    return;
                                 }

                                 if(var21 && class47.field414.length() < 6) {
                                    class47.field414 = class47.field414 + class132.field1846;
                                 }
                              }
                           }
                        } else if(class78.field1135 == 5) {
                           var18 = class78.field1117 + 180 - 80;
                           var20 = 321;
                           if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                              class59.method1124();
                              return;
                           }

                           var18 = class78.field1117 + 180 + 80;
                           if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                              class245.method4617(true);
                           }

                           while(class95.method2208()) {
                              var21 = false;

                              for(var22 = 0; var22 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var22) {
                                 if(class132.field1846 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var22)) {
                                    var21 = true;
                                    break;
                                 }
                              }

                              if(class128.field1813 == 13) {
                                 class245.method4617(true);
                              } else {
                                 if(class128.field1813 == 85 && class78.field1127.length() > 0) {
                                    class78.field1127 = class78.field1127.substring(0, class78.field1127.length() - 1);
                                 }

                                 if(class128.field1813 == 84) {
                                    class59.method1124();
                                    return;
                                 }

                                 if(var21 && class78.field1127.length() < 320) {
                                    class78.field1127 = class78.field1127 + class132.field1846;
                                 }
                              }
                           }
                        } else if(class78.field1135 == 6) {
                           while(class95.method2208()) {
                              if(class128.field1813 == 84 || class128.field1813 == 13) {
                                 class245.method4617(true);
                              }
                           }

                           var19 = 321;
                           if(var4 == 1 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                              class245.method4617(true);
                           }
                        } else if(class78.field1135 == 7) {
                           var18 = class78.field1117 + 180 - 80;
                           var20 = 321;
                           if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                              var13 = class109.method2551("secure", true) + "m=weblogin/loginform.ws?mod=dob&ssl=1&expired=0&dest=set_dob.ws";
                              class32.method590(var13, true, "openjs", false);
                              class102.method2307("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class78.field1135 = 6;
                              return;
                           }

                           var18 = class78.field1117 + 180 + 80;
                           if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                              class245.method4617(true);
                           }
                        } else if(class78.field1135 == 8) {
                           var18 = class78.field1117 + 180 - 80;
                           var20 = 321;
                           if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                              class32.method590("https://www.jagex.com/terms/privacy/#eight", true, "openjs", false);
                              class102.method2307("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class78.field1135 = 6;
                              return;
                           }

                           var18 = class78.field1117 + 180 + 80;
                           if(var4 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var20 - 20 && var16 <= var20 + 20) {
                              class245.method4617(true);
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "([Lhl;Lhl;ZI)V",
      garbageValue = "-757197837"
   )
   static void method818(class230[] var0, class230 var1, boolean var2) {
      int var3 = var1.field2674 != 0?var1.field2674:var1.field2627;
      int var4 = var1.field2647 != 0?var1.field2647:var1.field2639;
      class9.method100(var0, var1.field2623, var3, var4, var2);
      if(var1.field2626 != null) {
         class9.method100(var1.field2626, var1.field2623, var3, var4, var2);
      }

      class55 var5 = (class55)client.field826.method4064((long)var1.field2623);
      if(var5 != null) {
         class28.method515(var5.field506, var3, var4, var2);
      }

      if(var1.field2711 == 1337) {
         ;
      }

   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "(Lhl;III)V",
      garbageValue = "-2144340985"
   )
   static void method820(class230 var0, int var1, int var2) {
      if(var0.field2628 == 0) {
         var0.field2636 = var0.field2632;
      } else if(var0.field2628 == 1) {
         var0.field2636 = var0.field2632 + (var1 - var0.field2627) / 2;
      } else if(var0.field2628 == 2) {
         var0.field2636 = var1 - var0.field2627 - var0.field2632;
      } else if(var0.field2628 == 3) {
         var0.field2636 = var0.field2632 * var1 >> 14;
      } else if(var0.field2628 == 4) {
         var0.field2636 = (var0.field2632 * var1 >> 14) + (var1 - var0.field2627) / 2;
      } else {
         var0.field2636 = var1 - var0.field2627 - (var0.field2632 * var1 >> 14);
      }

      if(var0.field2629 == 0) {
         var0.field2637 = var0.field2653;
      } else if(var0.field2629 == 1) {
         var0.field2637 = (var2 - var0.field2639) / 2 + var0.field2653;
      } else if(var0.field2629 == 2) {
         var0.field2637 = var2 - var0.field2639 - var0.field2653;
      } else if(var0.field2629 == 3) {
         var0.field2637 = var2 * var0.field2653 >> 14;
      } else if(var0.field2629 == 4) {
         var0.field2637 = (var2 - var0.field2639) / 2 + (var2 * var0.field2653 >> 14);
      } else {
         var0.field2637 = var2 - var0.field2639 - (var2 * var0.field2653 >> 14);
      }

   }
}
