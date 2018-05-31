import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class24 {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lv;"
   )
   static final class24 field222 = new class24(0);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lv;"
   )
   static final class24 field217 = new class24(1);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   static SpritePixels field224;
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = -2015070493
   )
   static int field220;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -942512239
   )
   final int field219;

   class24(int var1) {
      this.field219 = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ldt;[Lfm;I)V",
      garbageValue = "-1918380857"
   )
   static final void method457(Region var0, CollisionData[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if ((class50.tileSettings[var2][var3][var4] & 1) == 1) {
                  var5 = var2;
                  if ((class50.tileSettings[1][var3][var4] & 2) == 2) {
                     var5 = var2 - 1;
                  }

                  if (var5 >= 0) {
                     var1[var5].method3437(var3, var4);
                  }
               }
            }
         }
      }

      class50.field462 += (int)(Math.random() * 5.0D) - 2;
      if (class50.field462 < -8) {
         class50.field462 = -8;
      }

      if (class50.field462 > 8) {
         class50.field462 = 8;
      }

      class50.field461 += (int)(Math.random() * 5.0D) - 2;
      if (class50.field461 < -16) {
         class50.field461 = -16;
      }

      if (class50.field461 > 16) {
         class50.field461 = 16;
      }

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var16 = class50.field449[var2];
         var6 = (int)Math.sqrt(5100.0D);
         var7 = var6 * 768 >> 8;

         for(var8 = 1; var8 < 103; ++var8) {
            for(var9 = 1; var9 < 103; ++var9) {
               var10 = class50.tileHeights[var2][var9 + 1][var8] - class50.tileHeights[var2][var9 - 1][var8];
               var11 = class50.tileHeights[var2][var9][var8 + 1] - class50.tileHeights[var2][var9][var8 - 1];
               var12 = (int)Math.sqrt((double)(var10 * var10 + var11 * var11 + 65536));
               var13 = (var10 << 8) / var12;
               var14 = 65536 / var12;
               var15 = (var11 << 8) / var12;
               var17 = (var13 * -50 + var15 * -50 + var14 * -10) / var7 + 96;
               var18 = (var16[var9 - 1][var8] >> 2) + (var16[var9][var8 - 1] >> 2) + (var16[var9 + 1][var8] >> 3) + (var16[var9][var8 + 1] >> 3) + (var16[var9][var8] >> 1);
               WorldMapDecoration.field162[var9][var8] = var17 - var18;
            }
         }

         for(var8 = 0; var8 < 104; ++var8) {
            class50.floorHues[var8] = 0;
            Size.floorSaturations[var8] = 0;
            class50.field451[var8] = 0;
            MapIconReference.floorMultiplier[var8] = 0;
            class50.field452[var8] = 0;
         }

         for(var8 = -5; var8 < 109; ++var8) {
            for(var9 = 0; var9 < 104; ++var9) {
               var10 = var8 + 5;
               FloorUnderlayDefinition var19;
               if (var10 >= 0 && var10 < 104) {
                  var11 = class50.tileUnderlayIds[var2][var10][var9] & 255;
                  if (var11 > 0) {
                     var19 = UrlRequester.getUnderlayDefinition(var11 - 1);
                     class50.floorHues[var9] += var19.hue;
                     Size.floorSaturations[var9] += var19.saturation;
                     class50.field451[var9] += var19.lightness;
                     MapIconReference.floorMultiplier[var9] += var19.hueMultiplier;
                     ++class50.field452[var9];
                  }
               }

               var11 = var8 - 5;
               if (var11 >= 0 && var11 < 104) {
                  var12 = class50.tileUnderlayIds[var2][var11][var9] & 255;
                  if (var12 > 0) {
                     var19 = UrlRequester.getUnderlayDefinition(var12 - 1);
                     class50.floorHues[var9] -= var19.hue;
                     Size.floorSaturations[var9] -= var19.saturation;
                     class50.field451[var9] -= var19.lightness;
                     MapIconReference.floorMultiplier[var9] -= var19.hueMultiplier;
                     --class50.field452[var9];
                  }
               }
            }

            if (var8 >= 1 && var8 < 103) {
               var9 = 0;
               var10 = 0;
               var11 = 0;
               var12 = 0;
               var13 = 0;

               for(var14 = -5; var14 < 109; ++var14) {
                  var15 = var14 + 5;
                  if (var15 >= 0 && var15 < 104) {
                     var9 += class50.floorHues[var15];
                     var10 += Size.floorSaturations[var15];
                     var11 += class50.field451[var15];
                     var12 += MapIconReference.floorMultiplier[var15];
                     var13 += class50.field452[var15];
                  }

                  var17 = var14 - 5;
                  if (var17 >= 0 && var17 < 104) {
                     var9 -= class50.floorHues[var17];
                     var10 -= Size.floorSaturations[var17];
                     var11 -= class50.field451[var17];
                     var12 -= MapIconReference.floorMultiplier[var17];
                     var13 -= class50.field452[var17];
                  }

                  if (var14 >= 1 && var14 < 103 && (!Client.lowMemory || (class50.tileSettings[0][var8][var14] & 2) != 0 || (class50.tileSettings[var2][var8][var14] & 16) == 0)) {
                     if (var2 < class50.field446) {
                        class50.field446 = var2;
                     }

                     var18 = class50.tileUnderlayIds[var2][var8][var14] & 255;
                     int var41 = class139.tileOverlayIds[var2][var8][var14] & 255;
                     if (var18 > 0 || var41 > 0) {
                        int var20 = class50.tileHeights[var2][var8][var14];
                        int var21 = class50.tileHeights[var2][var8 + 1][var14];
                        int var22 = class50.tileHeights[var2][var8 + 1][var14 + 1];
                        int var23 = class50.tileHeights[var2][var8][var14 + 1];
                        int var24 = WorldMapDecoration.field162[var8][var14];
                        int var25 = WorldMapDecoration.field162[var8 + 1][var14];
                        int var26 = WorldMapDecoration.field162[var8 + 1][var14 + 1];
                        int var27 = WorldMapDecoration.field162[var8][var14 + 1];
                        int var28 = -1;
                        int var29 = -1;
                        int var30;
                        int var31;
                        if (var18 > 0) {
                           var30 = var9 * 256 / var12;
                           var31 = var10 / var13;
                           int var32 = var11 / var13;
                           var28 = class158.method3315(var30, var31, var32);
                           var30 = var30 + class50.field462 & 255;
                           var32 += class50.field461;
                           if (var32 < 0) {
                              var32 = 0;
                           } else if (var32 > 255) {
                              var32 = 255;
                           }

                           var29 = class158.method3315(var30, var31, var32);
                        }

                        if (var2 > 0) {
                           boolean var43 = true;
                           if (var18 == 0 && NPC.tileOverlayPath[var2][var8][var14] != 0) {
                              var43 = false;
                           }

                           if (var41 > 0 && !class148.getOverlayDefinition(var41 - 1).isHidden) {
                              var43 = false;
                           }

                           if (var43 && var21 == var20 && var20 == var22 && var20 == var23) {
                              MouseRecorder.field534[var2][var8][var14] |= 2340;
                           }
                        }

                        var30 = 0;
                        if (var29 != -1) {
                           var30 = Graphics3D.colorPalette[class16.method185(var29, 96)];
                        }

                        if (var41 == 0) {
                           var0.addTile(var2, var8, var14, 0, 0, -1, var20, var21, var22, var23, class16.method185(var28, var24), class16.method185(var28, var25), class16.method185(var28, var26), class16.method185(var28, var27), 0, 0, 0, 0, var30, 0);
                        } else {
                           var31 = NPC.tileOverlayPath[var2][var8][var14] + 1;
                           byte var44 = class50.overlayRotations[var2][var8][var14];
                           Overlay var33 = class148.getOverlayDefinition(var41 - 1);
                           int var34 = var33.texture;
                           int var35;
                           int var36;
                           int var37;
                           int var38;
                           if (var34 >= 0) {
                              var36 = Graphics3D.textureLoader.getAverageTextureRGB(var34);
                              var35 = -1;
                           } else if (var33.color == 16711935) {
                              var35 = -2;
                              var34 = -1;
                              var36 = -2;
                           } else {
                              var35 = class158.method3315(var33.hue, var33.saturation, var33.lightness);
                              var37 = var33.hue + class50.field462 & 255;
                              var38 = var33.lightness + class50.field461;
                              if (var38 < 0) {
                                 var38 = 0;
                              } else if (var38 > 255) {
                                 var38 = 255;
                              }

                              var36 = class158.method3315(var37, var33.saturation, var38);
                           }

                           var37 = 0;
                           if (var36 != -2) {
                              var37 = Graphics3D.colorPalette[KeyFocusListener.adjustHSLListness0(var36, 96)];
                           }

                           if (var33.otherRgbColor != -1) {
                              var38 = var33.otherHue + class50.field462 & 255;
                              int var39 = var33.otherLightness + class50.field461;
                              if (var39 < 0) {
                                 var39 = 0;
                              } else if (var39 > 255) {
                                 var39 = 255;
                              }

                              var36 = class158.method3315(var38, var33.otherSaturation, var39);
                              var37 = Graphics3D.colorPalette[KeyFocusListener.adjustHSLListness0(var36, 96)];
                           }

                           var0.addTile(var2, var8, var14, var31, var44, var34, var20, var21, var22, var23, class16.method185(var28, var24), class16.method185(var28, var25), class16.method185(var28, var26), class16.method185(var28, var27), KeyFocusListener.adjustHSLListness0(var35, var24), KeyFocusListener.adjustHSLListness0(var35, var25), KeyFocusListener.adjustHSLListness0(var35, var26), KeyFocusListener.adjustHSLListness0(var35, var27), var30, var37);
                        }
                     }
                  }
               }
            }
         }

         for(var8 = 1; var8 < 103; ++var8) {
            for(var9 = 1; var9 < 103; ++var9) {
               if ((class50.tileSettings[var2][var9][var8] & 8) != 0) {
                  var14 = 0;
               } else if (var2 > 0 && (class50.tileSettings[1][var9][var8] & 2) != 0) {
                  var14 = var2 - 1;
               } else {
                  var14 = var2;
               }

               var0.setPhysicalLevel(var2, var9, var8, var14);
            }
         }

         class50.tileUnderlayIds[var2] = null;
         class139.tileOverlayIds[var2] = null;
         NPC.tileOverlayPath[var2] = null;
         class50.overlayRotations[var2] = null;
         class50.field449[var2] = null;
      }

      var0.applyLighting(-50, -10, -50);

      for(var2 = 0; var2 < 104; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if ((class50.tileSettings[1][var2][var3] & 2) == 2) {
               var0.setBridge(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if (var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var40 = 0; var40 <= var5; ++var40) {
            for(var17 = 0; var17 <= 104; ++var17) {
               for(var18 = 0; var18 <= 104; ++var18) {
                  short var42;
                  if ((MouseRecorder.field534[var40][var18][var17] & var2) != 0) {
                     var6 = var17;
                     var7 = var17;
                     var8 = var40;

                     for(var9 = var40; var6 > 0 && (MouseRecorder.field534[var40][var18][var6 - 1] & var2) != 0; --var6) {
                        ;
                     }

                     while(var7 < 104 && (MouseRecorder.field534[var40][var18][var7 + 1] & var2) != 0) {
                        ++var7;
                     }

                     label351:
                     while(var8 > 0) {
                        for(var10 = var6; var10 <= var7; ++var10) {
                           if ((MouseRecorder.field534[var8 - 1][var18][var10] & var2) == 0) {
                              break label351;
                           }
                        }

                        --var8;
                     }

                     label340:
                     while(var9 < var5) {
                        for(var10 = var6; var10 <= var7; ++var10) {
                           if ((MouseRecorder.field534[var9 + 1][var18][var10] & var2) == 0) {
                              break label340;
                           }
                        }

                        ++var9;
                     }

                     var10 = (var7 - var6 + 1) * (var9 + 1 - var8);
                     if (var10 >= 8) {
                        var42 = 240;
                        var12 = class50.tileHeights[var9][var18][var6] - var42;
                        var13 = class50.tileHeights[var8][var18][var6];
                        Region.addOcclude(var5, 1, var18 * 128, var18 * 128, var6 * 128, var7 * 128 + 128, var12, var13);

                        for(var14 = var8; var14 <= var9; ++var14) {
                           for(var15 = var6; var15 <= var7; ++var15) {
                              MouseRecorder.field534[var14][var18][var15] &= ~var2;
                           }
                        }
                     }
                  }

                  if ((MouseRecorder.field534[var40][var18][var17] & var3) != 0) {
                     var6 = var18;
                     var7 = var18;
                     var8 = var40;

                     for(var9 = var40; var6 > 0 && (MouseRecorder.field534[var40][var6 - 1][var17] & var3) != 0; --var6) {
                        ;
                     }

                     while(var7 < 104 && (MouseRecorder.field534[var40][var7 + 1][var17] & var3) != 0) {
                        ++var7;
                     }

                     label404:
                     while(var8 > 0) {
                        for(var10 = var6; var10 <= var7; ++var10) {
                           if ((MouseRecorder.field534[var8 - 1][var10][var17] & var3) == 0) {
                              break label404;
                           }
                        }

                        --var8;
                     }

                     label393:
                     while(var9 < var5) {
                        for(var10 = var6; var10 <= var7; ++var10) {
                           if ((MouseRecorder.field534[var9 + 1][var10][var17] & var3) == 0) {
                              break label393;
                           }
                        }

                        ++var9;
                     }

                     var10 = (var7 - var6 + 1) * (var9 + 1 - var8);
                     if (var10 >= 8) {
                        var42 = 240;
                        var12 = class50.tileHeights[var9][var6][var17] - var42;
                        var13 = class50.tileHeights[var8][var6][var17];
                        Region.addOcclude(var5, 2, var6 * 128, var7 * 128 + 128, var17 * 128, var17 * 128, var12, var13);

                        for(var14 = var8; var14 <= var9; ++var14) {
                           for(var15 = var6; var15 <= var7; ++var15) {
                              MouseRecorder.field534[var14][var15][var17] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((MouseRecorder.field534[var40][var18][var17] & var4) != 0) {
                     var6 = var18;
                     var7 = var18;
                     var8 = var17;

                     for(var9 = var17; var8 > 0 && (MouseRecorder.field534[var40][var18][var8 - 1] & var4) != 0; --var8) {
                        ;
                     }

                     while(var9 < 104 && (MouseRecorder.field534[var40][var18][var9 + 1] & var4) != 0) {
                        ++var9;
                     }

                     label457:
                     while(var6 > 0) {
                        for(var10 = var8; var10 <= var9; ++var10) {
                           if ((MouseRecorder.field534[var40][var6 - 1][var10] & var4) == 0) {
                              break label457;
                           }
                        }

                        --var6;
                     }

                     label446:
                     while(var7 < 104) {
                        for(var10 = var8; var10 <= var9; ++var10) {
                           if ((MouseRecorder.field534[var40][var7 + 1][var10] & var4) == 0) {
                              break label446;
                           }
                        }

                        ++var7;
                     }

                     if ((var9 - var8 + 1) * (var7 - var6 + 1) >= 4) {
                        var10 = class50.tileHeights[var40][var6][var8];
                        Region.addOcclude(var5, 4, var6 * 128, var7 * 128 + 128, var8 * 128, var9 * 128 + 128, var10, var10);

                        for(var11 = var6; var11 <= var7; ++var11) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              MouseRecorder.field534[var40][var11][var12] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "2"
   )
   public static final void method460(int var0, int var1) {
      class120.Viewport_mouseX = var0;
      class120.Viewport_mouseY = var1;
      class120.Viewport_containsMouse = true;
      class120.Viewport_entityCountAtMouse = 0;
      class120.Viewport_false0 = false;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-499931776"
   )
   public static void method462() {
      Sequence.sequences.reset();
      Sequence.skeletons.reset();
   }

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "(IZZZI)Lic;",
      garbageValue = "-1721943618"
   )
   @Export("openCacheIndex")
   static IndexData openCacheIndex(int var0, boolean var1, boolean var2, boolean var3) {
      IndexFile var4 = null;
      if (class155.dat2File != null) {
         var4 = new IndexFile(var0, class155.dat2File, class155.idxFiles[var0], 1000000);
      }

      return new IndexData(var4, World.indexStore255, var0, var1, var2, var3);
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "7"
   )
   static final void method458() {
      int var0 = class81.playerIndexesCount;
      int[] var1 = class81.playerIndices;

      for(int var2 = 0; var2 < var0; ++var2) {
         Player var3 = Client.cachedPlayers[var1[var2]];
         if (var3 != null) {
            class68.method1747(var3, 1);
         }
      }

   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)V",
      garbageValue = "1978186516"
   )
   static final void method459(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (Client.lowMemory && var0 != class192.plane) {
            return;
         }

         long var7 = 0L;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if (var1 == 0) {
            var7 = ScriptEvent.region.method2927(var0, var2, var3);
         }

         if (var1 == 1) {
            var7 = ScriptEvent.region.method2928(var0, var2, var3);
         }

         if (var1 == 2) {
            var7 = ScriptEvent.region.method3045(var0, var2, var3);
         }

         if (var1 == 3) {
            var7 = ScriptEvent.region.method2930(var0, var2, var3);
         }

         int var12;
         if (0L != var7) {
            var12 = ScriptEvent.region.method2931(var0, var2, var3, var7);
            int var13 = class8.method93(var7);
            int var14 = var12 & 31;
            int var15 = var12 >> 6 & 3;
            ObjectComposition var16;
            if (var1 == 0) {
               ScriptEvent.region.method2954(var0, var2, var3);
               var16 = SoundTaskDataProvider.getObjectDefinition(var13);
               if (var16.clipType != 0) {
                  Client.collisionMaps[var0].method3419(var2, var3, var14, var15, var16.blocksProjectile);
               }
            }

            if (var1 == 1) {
               ScriptEvent.region.method2919(var0, var2, var3);
            }

            if (var1 == 2) {
               ScriptEvent.region.method3013(var0, var2, var3);
               var16 = SoundTaskDataProvider.getObjectDefinition(var13);
               if (var2 + var16.width > 103 || var3 + var16.width > 103 || var2 + var16.length > 103 || var3 + var16.length > 103) {
                  return;
               }

               if (var16.clipType != 0) {
                  Client.collisionMaps[var0].removeObject(var2, var3, var16.width, var16.length, var15, var16.blocksProjectile);
               }
            }

            if (var1 == 3) {
               ScriptEvent.region.method2921(var0, var2, var3);
               var16 = SoundTaskDataProvider.getObjectDefinition(var13);
               if (var16.clipType == 1) {
                  Client.collisionMaps[var0].method3434(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var12 = var0;
            if (var0 < 3 && (class50.tileSettings[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            Region var36 = ScriptEvent.region;
            CollisionData var37 = Client.collisionMaps[var0];
            ObjectComposition var38 = SoundTaskDataProvider.getObjectDefinition(var4);
            int var17;
            int var39;
            if (var5 != 1 && var5 != 3) {
               var39 = var38.width;
               var17 = var38.length;
            } else {
               var39 = var38.length;
               var17 = var38.width;
            }

            int var18;
            int var19;
            if (var39 + var2 <= 104) {
               var18 = (var39 >> 1) + var2;
               var19 = var2 + (var39 + 1 >> 1);
            } else {
               var18 = var2;
               var19 = var2 + 1;
            }

            int var20;
            int var21;
            if (var3 + var17 <= 104) {
               var20 = var3 + (var17 >> 1);
               var21 = var3 + (var17 + 1 >> 1);
            } else {
               var20 = var3;
               var21 = var3 + 1;
            }

            int[][] var22 = class50.tileHeights[var12];
            int var23 = var22[var19][var21] + var22[var18][var20] + var22[var19][var20] + var22[var18][var21] >> 2;
            int var24 = (var2 << 7) + (var39 << 6);
            int var25 = (var3 << 7) + (var17 << 6);
            long var26 = class59.method1129(var2, var3, 2, var38.int1 == 0, var4);
            int var28 = (var5 << 6) + var6;
            if (var38.supportItems == 1) {
               var28 += 256;
            }

            Object var29;
            if (var6 == 22) {
               if (var38.animationId == -1 && var38.impostorIds == null) {
                  var29 = var38.method5052(22, var5, var22, var24, var23, var25);
               } else {
                  var29 = new DynamicObject(var4, 22, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
               }

               var36.groundObjectSpawned(var0, var2, var3, var23, (Renderable)var29, var26, var28);
               if (var38.clipType == 1) {
                  var37.method3424(var2, var3);
               }
            } else if (var6 != 10 && var6 != 11) {
               if (var6 >= 12) {
                  if (var38.animationId == -1 && var38.impostorIds == null) {
                     var29 = var38.method5052(var6, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new DynamicObject(var4, var6, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
                  }

                  var36.method2911(var0, var2, var3, var23, 1, 1, (Renderable)var29, 0, var26, var28);
                  if (var38.clipType != 0) {
                     var37.addObject(var2, var3, var39, var17, var38.blocksProjectile);
                  }
               } else if (var6 == 0) {
                  if (var38.animationId == -1 && var38.impostorIds == null) {
                     var29 = var38.method5052(0, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new DynamicObject(var4, 0, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
                  }

                  var36.addBoundary(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, class50.field454[var5], 0, var26, var28);
                  if (var38.clipType != 0) {
                     var37.removeWall(var2, var3, var6, var5, var38.blocksProjectile);
                  }
               } else if (var6 == 1) {
                  if (var38.animationId == -1 && var38.impostorIds == null) {
                     var29 = var38.method5052(1, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new DynamicObject(var4, 1, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
                  }

                  var36.addBoundary(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, class50.field453[var5], 0, var26, var28);
                  if (var38.clipType != 0) {
                     var37.removeWall(var2, var3, var6, var5, var38.blocksProjectile);
                  }
               } else {
                  int var30;
                  Object var31;
                  if (var6 == 2) {
                     var30 = var5 + 1 & 3;
                     Object var32;
                     if (var38.animationId == -1 && var38.impostorIds == null) {
                        var31 = var38.method5052(2, var5 + 4, var22, var24, var23, var25);
                        var32 = var38.method5052(2, var30, var22, var24, var23, var25);
                     } else {
                        var31 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var38.animationId, true, (Renderable)null);
                        var32 = new DynamicObject(var4, 2, var30, var12, var2, var3, var38.animationId, true, (Renderable)null);
                     }

                     var36.addBoundary(var0, var2, var3, var23, (Renderable)var31, (Renderable)var32, class50.field454[var5], class50.field454[var30], var26, var28);
                     if (var38.clipType != 0) {
                        var37.removeWall(var2, var3, var6, var5, var38.blocksProjectile);
                     }
                  } else if (var6 == 3) {
                     if (var38.animationId == -1 && var38.impostorIds == null) {
                        var29 = var38.method5052(3, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new DynamicObject(var4, 3, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
                     }

                     var36.addBoundary(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, class50.field453[var5], 0, var26, var28);
                     if (var38.clipType != 0) {
                        var37.removeWall(var2, var3, var6, var5, var38.blocksProjectile);
                     }
                  } else if (var6 == 9) {
                     if (var38.animationId == -1 && var38.impostorIds == null) {
                        var29 = var38.method5052(var6, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new DynamicObject(var4, var6, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
                     }

                     var36.method2911(var0, var2, var3, var23, 1, 1, (Renderable)var29, 0, var26, var28);
                     if (var38.clipType != 0) {
                        var37.addObject(var2, var3, var39, var17, var38.blocksProjectile);
                     }
                  } else if (var6 == 4) {
                     if (var38.animationId == -1 && var38.impostorIds == null) {
                        var29 = var38.method5052(4, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new DynamicObject(var4, 4, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
                     }

                     var36.addBoundaryDecoration(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, class50.field454[var5], 0, 0, 0, var26, var28);
                  } else {
                     long var40;
                     if (var6 == 5) {
                        var30 = 16;
                        var40 = var36.method2927(var0, var2, var3);
                        if (0L != var40) {
                           var30 = SoundTaskDataProvider.getObjectDefinition(class8.method93(var40)).decorDisplacement;
                        }

                        if (var38.animationId == -1 && var38.impostorIds == null) {
                           var31 = var38.method5052(4, var5, var22, var24, var23, var25);
                        } else {
                           var31 = new DynamicObject(var4, 4, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
                        }

                        var36.addBoundaryDecoration(var0, var2, var3, var23, (Renderable)var31, (Renderable)null, class50.field454[var5], 0, var30 * class50.field456[var5], var30 * class50.field457[var5], var26, var28);
                     } else if (var6 == 6) {
                        var30 = 8;
                        var40 = var36.method2927(var0, var2, var3);
                        if (0L != var40) {
                           var30 = SoundTaskDataProvider.getObjectDefinition(class8.method93(var40)).decorDisplacement / 2;
                        }

                        if (var38.animationId == -1 && var38.impostorIds == null) {
                           var31 = var38.method5052(4, var5 + 4, var22, var24, var23, var25);
                        } else {
                           var31 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var38.animationId, true, (Renderable)null);
                        }

                        var36.addBoundaryDecoration(var0, var2, var3, var23, (Renderable)var31, (Renderable)null, 256, var5, var30 * class50.field458[var5], var30 * class50.field459[var5], var26, var28);
                     } else {
                        int var34;
                        if (var6 == 7) {
                           var34 = var5 + 2 & 3;
                           if (var38.animationId == -1 && var38.impostorIds == null) {
                              var29 = var38.method5052(4, var34 + 4, var22, var24, var23, var25);
                           } else {
                              var29 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var38.animationId, true, (Renderable)null);
                           }

                           var36.addBoundaryDecoration(var0, var2, var3, var23, (Renderable)var29, (Renderable)null, 256, var34, 0, 0, var26, var28);
                        } else if (var6 == 8) {
                           var30 = 8;
                           var40 = var36.method2927(var0, var2, var3);
                           if (0L != var40) {
                              var30 = SoundTaskDataProvider.getObjectDefinition(class8.method93(var40)).decorDisplacement / 2;
                           }

                           var34 = var5 + 2 & 3;
                           Object var35;
                           if (var38.animationId == -1 && var38.impostorIds == null) {
                              var31 = var38.method5052(4, var5 + 4, var22, var24, var23, var25);
                              var35 = var38.method5052(4, var34 + 4, var22, var24, var23, var25);
                           } else {
                              var31 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var38.animationId, true, (Renderable)null);
                              var35 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var38.animationId, true, (Renderable)null);
                           }

                           var36.addBoundaryDecoration(var0, var2, var3, var23, (Renderable)var31, (Renderable)var35, 256, var5, var30 * class50.field458[var5], var30 * class50.field459[var5], var26, var28);
                        }
                     }
                  }
               }
            } else {
               if (var38.animationId == -1 && var38.impostorIds == null) {
                  var29 = var38.method5052(10, var5, var22, var24, var23, var25);
               } else {
                  var29 = new DynamicObject(var4, 10, var5, var12, var2, var3, var38.animationId, true, (Renderable)null);
               }

               if (var29 != null) {
                  var36.method2911(var0, var2, var3, var23, var39, var17, (Renderable)var29, var6 == 11 ? 256 : 0, var26, var28);
               }

               if (var38.clipType != 0) {
                  var37.addObject(var2, var3, var39, var17, var38.blocksProjectile);
               }
            }
         }
      }

   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "0"
   )
   static void method463(int var0, int var1) {
      int var2 = WidgetNode.fontBold12.getTextWidth("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.menuOptionCount; ++var3) {
         var4 = WidgetNode.fontBold12.getTextWidth(class234.method4595(var3));
         if (var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = Client.menuOptionCount * 15 + 22;
      var4 = var0 - var2 / 2;
      if (var4 + var2 > class9.canvasWidth) {
         var4 = class9.canvasWidth - var2;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if (var1 + var3 > class37.canvasHeight) {
         var5 = class37.canvasHeight - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      class35.menuX = var4;
      class59.menuY = var5;
      class139.field1897 = var2;
      class137.field1888 = Client.menuOptionCount * 15 + 22;
   }
}
