import java.applet.Applet;
import net.runelite.mapping.Export;
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
   @Export("intStackSize")
   static int intStackSize;
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
   static void method819(GameEngine var0) {
      if (class78.worldSelectShown) {
         class148.method3205(var0);
      } else {
         if ((MouseInput.mouseLastButton == 1 || !class8.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) && MouseInput.mouseLastPressedX >= class78.field1104 + 765 - 50 && MouseInput.mouseLastPressedY >= 453) {
            ScriptState.preferences.muted = !ScriptState.preferences.muted;
            Enum.method5008();
            if (!ScriptState.preferences.muted) {
               GroundObject.method2703(MouseInput.indexTrack1, "scape main", "", 255, false);
            } else {
               class37.method721();
            }
         }

         if (Client.gameState != 5) {
            if (class78.field1106 == -1L) {
               class78.field1106 = class166.method3456() + 1000L;
            }

            long var1 = class166.method3456();
            boolean var3;
            if (Client.field786 != null && Client.field861 < Client.field786.size()) {
               label653: {
                  while(Client.field861 < Client.field786.size()) {
                     class52 var4 = (class52)Client.field786.get(Client.field861);
                     if (!var4.method1065()) {
                        var3 = false;
                        break label653;
                     }

                     ++Client.field861;
                  }

                  var3 = true;
               }
            } else {
               var3 = true;
            }

            if (var3 && class78.field1141 == -1L) {
               class78.field1141 = var1;
               if (class78.field1141 > class78.field1106) {
                  class78.field1106 = class78.field1141;
               }
            }

            ++class78.field1118;
            if (Client.gameState == 10 || Client.gameState == 11) {
               int var15;
               if (Client.languageId == 0) {
                  if (MouseInput.mouseLastButton == 1 || !class8.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) {
                     var15 = class78.field1104 + 5;
                     short var5 = 463;
                     byte var6 = 100;
                     byte var7 = 35;
                     if (MouseInput.mouseLastPressedX >= var15 && MouseInput.mouseLastPressedX <= var6 + var15 && MouseInput.mouseLastPressedY >= var5 && MouseInput.mouseLastPressedY <= var5 + var7) {
                        if (IndexStoreActionHandler.loadWorlds()) {
                           class78.worldSelectShown = true;
                        }

                        return;
                     }
                  }

                  if (World.listFetcher != null && IndexStoreActionHandler.loadWorlds()) {
                     class78.worldSelectShown = true;
                  }
               }

               var15 = MouseInput.mouseLastButton;
               int var16 = MouseInput.mouseLastPressedX;
               int var17 = MouseInput.mouseLastPressedY;
               if (var15 == 0) {
                  var16 = MouseInput.mouseLastX;
                  var17 = MouseInput.mouseLastY;
               }

               if (!class8.middleMouseMovesCamera && var15 == 4) {
                  var15 = 1;
               }

               short var8;
               int var18;
               if (class78.loginIndex == 0) {
                  boolean var9 = false;

                  while(AbstractSoundSystem.method2208()) {
                     if (WallObject.currentPressedKey == 84) {
                        var9 = true;
                     }
                  }

                  var18 = class78.field1112 - 80;
                  var8 = 291;
                  if (var15 == 1 && var16 >= var18 - 75 && var16 <= var18 + 75 && var17 >= var8 - 20 && var17 <= var8 + 20) {
                     String var10 = CacheFile.method2551("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                     class32.method590(var10, true, "openjs", false);
                  }

                  var18 = class78.field1112 + 80;
                  if (var15 == 1 && var16 >= var18 - 75 && var16 <= var18 + 75 && var17 >= var8 - 20 && var17 <= var8 + 20 || var9) {
                     if ((Client.flags & 33554432) != 0) {
                        class78.Login_response0 = "";
                        class78.loginMessage1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class78.loginMessage2 = "Your normal account will not be affected.";
                        class78.loginMessage3 = "";
                        class78.loginIndex = 1;
                        class274.method5248();
                     } else if ((Client.flags & 4) != 0) {
                        if ((Client.flags & 1024) != 0) {
                           class78.loginMessage1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class78.loginMessage2 = "Players can attack each other almost everywhere";
                           class78.loginMessage3 = "and the Protect Item prayer won't work.";
                        } else {
                           class78.loginMessage1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class78.loginMessage2 = "Players can attack each other";
                           class78.loginMessage3 = "almost everywhere.";
                        }

                        class78.Login_response0 = "Warning!";
                        class78.loginIndex = 1;
                        class274.method5248();
                     } else if ((Client.flags & 1024) != 0) {
                        class78.loginMessage1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class78.loginMessage2 = "The Protect Item prayer will";
                        class78.loginMessage3 = "not work on this world.";
                        class78.Login_response0 = "Warning!";
                        class78.loginIndex = 1;
                        class274.method5248();
                     } else {
                        FileSystem.method4617(false);
                     }
                  }
               } else {
                  int var19;
                  short var20;
                  if (class78.loginIndex != 1) {
                     short var11;
                     if (class78.loginIndex == 2) {
                        var11 = 201;
                        var19 = var11 + 52;
                        if (var15 == 1 && var17 >= var19 - 12 && var17 < var19 + 2) {
                           class78.currentLoginField = 0;
                        }

                        var19 += 15;
                        if (var15 == 1 && var17 >= var19 - 12 && var17 < var19 + 2) {
                           class78.currentLoginField = 1;
                        }

                        var19 += 15;
                        var11 = 361;
                        if (var15 == 1 && var17 >= var11 - 15 && var17 < var11) {
                           Resampler.method2307("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class78.loginIndex = 5;
                           return;
                        }

                        var18 = class78.field1112 - 80;
                        var8 = 321;
                        if (var15 == 1 && var16 >= var18 - 75 && var16 <= var18 + 75 && var17 >= var8 - 20 && var17 <= var8 + 20) {
                           class78.username = class78.username.trim();
                           if (class78.username.length() == 0) {
                              Resampler.method2307("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (class78.password.length() == 0) {
                              Resampler.method2307("", "Please enter your password.", "");
                              return;
                           }

                           Resampler.method2307("", "Connecting to server...", "");
                           KeyFocusListener.method761(false);
                           Resampler.setGameState(20);
                           return;
                        }

                        var18 = class78.loginWindowX + 180 + 80;
                        if (var15 == 1 && var16 >= var18 - 75 && var16 <= var18 + 75 && var17 >= var8 - 20 && var17 <= var8 + 20) {
                           class78.loginIndex = 0;
                           class78.username = "";
                           class78.password = "";
                           MessageNode.field549 = 0;
                           GameEngine.field414 = "";
                           class78.field1132 = true;
                        }

                        var18 = class78.field1112 + -117;
                        var8 = 277;
                        class78.field1133 = var16 >= var18 && var16 < var18 + UrlRequest.field1881 && var17 >= var8 && var17 < var8 + class69.field1028;
                        if (var15 == 1 && class78.field1133) {
                           class78.Login_isUsernameRemembered = !class78.Login_isUsernameRemembered;
                           if (!class78.Login_isUsernameRemembered && ScriptState.preferences.rememberedUsername != null) {
                              ScriptState.preferences.rememberedUsername = null;
                              Enum.method5008();
                           }
                        }

                        var18 = class78.field1112 + 24;
                        var8 = 277;
                        class78.field1131 = var16 >= var18 && var16 < var18 + UrlRequest.field1881 && var17 >= var8 && var17 < var8 + class69.field1028;
                        if (var15 == 1 && class78.field1131) {
                           ScriptState.preferences.hideUsername = !ScriptState.preferences.hideUsername;
                           if (!ScriptState.preferences.hideUsername) {
                              class78.username = "";
                              ScriptState.preferences.rememberedUsername = null;
                              class274.method5248();
                           }

                           Enum.method5008();
                        }

                        while(true) {
                           while(AbstractSoundSystem.method2208()) {
                              boolean var21 = false;

                              for(int var22 = 0; var22 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var22) {
                                 if (Occluder.currentTypedKey == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var22)) {
                                    var21 = true;
                                    break;
                                 }
                              }

                              if (WallObject.currentPressedKey == 13) {
                                 class78.loginIndex = 0;
                                 class78.username = "";
                                 class78.password = "";
                                 MessageNode.field549 = 0;
                                 GameEngine.field414 = "";
                                 class78.field1132 = true;
                              } else if (class78.currentLoginField == 0) {
                                 if (WallObject.currentPressedKey == 85 && class78.username.length() > 0) {
                                    class78.username = class78.username.substring(0, class78.username.length() - 1);
                                 }

                                 if (WallObject.currentPressedKey == 84 || WallObject.currentPressedKey == 80) {
                                    class78.currentLoginField = 1;
                                 }

                                 if (var21 && class78.username.length() < 320) {
                                    class78.username = class78.username + Occluder.currentTypedKey;
                                 }
                              } else if (class78.currentLoginField == 1) {
                                 if (WallObject.currentPressedKey == 85 && class78.password.length() > 0) {
                                    class78.password = class78.password.substring(0, class78.password.length() - 1);
                                 }

                                 if (WallObject.currentPressedKey == 84 || WallObject.currentPressedKey == 80) {
                                    class78.currentLoginField = 0;
                                 }

                                 if (WallObject.currentPressedKey == 84) {
                                    class78.username = class78.username.trim();
                                    if (class78.username.length() == 0) {
                                       Resampler.method2307("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if (class78.password.length() == 0) {
                                       Resampler.method2307("", "Please enter your password.", "");
                                       return;
                                    }

                                    Resampler.method2307("", "Connecting to server...", "");
                                    KeyFocusListener.method761(false);
                                    Resampler.setGameState(20);
                                    return;
                                 }

                                 if (var21 && class78.password.length() < 20) {
                                    class78.password = class78.password + Occluder.currentTypedKey;
                                 }
                              }
                           }

                           return;
                        }
                     }

                     if (class78.loginIndex == 3) {
                        var19 = class78.loginWindowX + 180;
                        var20 = 276;
                        if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                           FileSystem.method4617(false);
                        }

                        var19 = class78.loginWindowX + 180;
                        var20 = 326;
                        if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                           Resampler.method2307("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class78.loginIndex = 5;
                           return;
                        }
                     } else {
                        String var12;
                        boolean var13;
                        int var14;
                        if (class78.loginIndex == 4) {
                           var19 = class78.loginWindowX + 180 - 80;
                           var20 = 321;
                           if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                              GameEngine.field414.trim();
                              if (GameEngine.field414.length() != 6) {
                                 Resampler.method2307("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              MessageNode.field549 = Integer.parseInt(GameEngine.field414);
                              GameEngine.field414 = "";
                              KeyFocusListener.method761(true);
                              Resampler.method2307("", "Connecting to server...", "");
                              Resampler.setGameState(20);
                              return;
                           }

                           if (var15 == 1 && var16 >= class78.loginWindowX + 180 - 9 && var16 <= class78.loginWindowX + 180 + 130 && var17 >= 263 && var17 <= 296) {
                              class78.field1132 = !class78.field1132;
                           }

                           if (var15 == 1 && var16 >= class78.loginWindowX + 180 - 34 && var16 <= class78.loginWindowX + 34 + 180 && var17 >= 351 && var17 <= 363) {
                              var12 = CacheFile.method2551("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                              class32.method590(var12, true, "openjs", false);
                           }

                           var19 = class78.loginWindowX + 180 + 80;
                           if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                              class78.loginIndex = 0;
                              class78.username = "";
                              class78.password = "";
                              MessageNode.field549 = 0;
                              GameEngine.field414 = "";
                           }

                           while(AbstractSoundSystem.method2208()) {
                              var13 = false;

                              for(var14 = 0; var14 < "1234567890".length(); ++var14) {
                                 if (Occluder.currentTypedKey == "1234567890".charAt(var14)) {
                                    var13 = true;
                                    break;
                                 }
                              }

                              if (WallObject.currentPressedKey == 13) {
                                 class78.loginIndex = 0;
                                 class78.username = "";
                                 class78.password = "";
                                 MessageNode.field549 = 0;
                                 GameEngine.field414 = "";
                              } else {
                                 if (WallObject.currentPressedKey == 85 && GameEngine.field414.length() > 0) {
                                    GameEngine.field414 = GameEngine.field414.substring(0, GameEngine.field414.length() - 1);
                                 }

                                 if (WallObject.currentPressedKey == 84) {
                                    GameEngine.field414.trim();
                                    if (GameEngine.field414.length() != 6) {
                                       Resampler.method2307("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    MessageNode.field549 = Integer.parseInt(GameEngine.field414);
                                    GameEngine.field414 = "";
                                    KeyFocusListener.method761(true);
                                    Resampler.method2307("", "Connecting to server...", "");
                                    Resampler.setGameState(20);
                                    return;
                                 }

                                 if (var13 && GameEngine.field414.length() < 6) {
                                    GameEngine.field414 = GameEngine.field414 + Occluder.currentTypedKey;
                                 }
                              }
                           }
                        } else if (class78.loginIndex == 5) {
                           var19 = class78.loginWindowX + 180 - 80;
                           var20 = 321;
                           if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                              class59.method1124();
                              return;
                           }

                           var19 = class78.loginWindowX + 180 + 80;
                           if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                              FileSystem.method4617(true);
                           }

                           while(AbstractSoundSystem.method2208()) {
                              var13 = false;

                              for(var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
                                 if (Occluder.currentTypedKey == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
                                    var13 = true;
                                    break;
                                 }
                              }

                              if (WallObject.currentPressedKey == 13) {
                                 FileSystem.method4617(true);
                              } else {
                                 if (WallObject.currentPressedKey == 85 && class78.username.length() > 0) {
                                    class78.username = class78.username.substring(0, class78.username.length() - 1);
                                 }

                                 if (WallObject.currentPressedKey == 84) {
                                    class59.method1124();
                                    return;
                                 }

                                 if (var13 && class78.username.length() < 320) {
                                    class78.username = class78.username + Occluder.currentTypedKey;
                                 }
                              }
                           }
                        } else {
                           if (class78.loginIndex == 6) {
                              while(true) {
                                 do {
                                    if (!AbstractSoundSystem.method2208()) {
                                       var11 = 321;
                                       if (var15 == 1 && var17 >= var11 - 20 && var17 <= var11 + 20) {
                                          FileSystem.method4617(true);
                                       }

                                       return;
                                    }
                                 } while(WallObject.currentPressedKey != 84 && WallObject.currentPressedKey != 13);

                                 FileSystem.method4617(true);
                              }
                           }

                           if (class78.loginIndex == 7) {
                              var19 = class78.loginWindowX + 180 - 80;
                              var20 = 321;
                              if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                                 var12 = CacheFile.method2551("secure", true) + "m=weblogin/loginform.ws?mod=dob&ssl=1&expired=0&dest=set_dob.ws";
                                 class32.method590(var12, true, "openjs", false);
                                 Resampler.method2307("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 class78.loginIndex = 6;
                                 return;
                              }

                              var19 = class78.loginWindowX + 180 + 80;
                              if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                                 FileSystem.method4617(true);
                              }
                           } else if (class78.loginIndex == 8) {
                              var19 = class78.loginWindowX + 180 - 80;
                              var20 = 321;
                              if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                                 class32.method590("https://www.jagex.com/terms/privacy/#eight", true, "openjs", false);
                                 Resampler.method2307("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 class78.loginIndex = 6;
                                 return;
                              }

                              var19 = class78.loginWindowX + 180 + 80;
                              if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                                 FileSystem.method4617(true);
                              }
                           }
                        }
                     }
                  } else {
                     while(AbstractSoundSystem.method2208()) {
                        if (WallObject.currentPressedKey == 84) {
                           FileSystem.method4617(false);
                        } else if (WallObject.currentPressedKey == 13) {
                           class78.loginIndex = 0;
                        }
                     }

                     var19 = class78.field1112 - 80;
                     var20 = 321;
                     if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                        FileSystem.method4617(false);
                     }

                     var19 = class78.field1112 + 80;
                     if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                        class78.loginIndex = 0;
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
   static void method818(Widget[] var0, Widget var1, boolean var2) {
      int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
      int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
      class9.method100(var0, var1.id, var3, var4, var2);
      if (var1.children != null) {
         class9.method100(var1.children, var1.id, var3, var4, var2);
      }

      WidgetNode var5 = (WidgetNode)Client.componentTable.get((long)var1.id);
      if (var5 != null) {
         MapIcon.method515(var5.id, var3, var4, var2);
      }

      if (var1.contentType == 1337) {
         ;
      }

   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "(Lhl;III)V",
      garbageValue = "-2144340985"
   )
   static void method820(Widget var0, int var1, int var2) {
      if (var0.dynamicX == 0) {
         var0.relativeX = var0.originalX;
      } else if (var0.dynamicX == 1) {
         var0.relativeX = var0.originalX + (var1 - var0.width) / 2;
      } else if (var0.dynamicX == 2) {
         var0.relativeX = var1 - var0.width - var0.originalX;
      } else if (var0.dynamicX == 3) {
         var0.relativeX = var0.originalX * var1 >> 14;
      } else if (var0.dynamicX == 4) {
         var0.relativeX = (var0.originalX * var1 >> 14) + (var1 - var0.width) / 2;
      } else {
         var0.relativeX = var1 - var0.width - (var0.originalX * var1 >> 14);
      }

      if (var0.dynamicY == 0) {
         var0.relativeY = var0.originalY;
      } else if (var0.dynamicY == 1) {
         var0.relativeY = (var2 - var0.height) / 2 + var0.originalY;
      } else if (var0.dynamicY == 2) {
         var0.relativeY = var2 - var0.height - var0.originalY;
      } else if (var0.dynamicY == 3) {
         var0.relativeY = var2 * var0.originalY >> 14;
      } else if (var0.dynamicY == 4) {
         var0.relativeY = (var2 - var0.height) / 2 + (var2 * var0.originalY >> 14);
      } else {
         var0.relativeY = var2 - var0.height - (var2 * var0.originalY >> 14);
      }

   }
}
