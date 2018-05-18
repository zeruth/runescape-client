import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class243 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   static final class243 field3148 = new class243("LIVE", 0);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   static final class243 field3147 = new class243("BUILDLIVE", 3);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   static final class243 field3151 = new class243("RC", 1);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   static final class243 field3146 = new class243("WIP", 2);
   @ObfuscatedName("f")
   public final String field3150;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1213546159
   )
   public final int field3149;


   class243(String var1, int var2) {
      this.field3150 = var1;
      this.field3149 = var2;
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1240991873"
   )
   static final void method4608(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < client.field793; ++var4) {
         if(client.field798[var4] + client.field800[var4] > var0 && client.field798[var4] < var0 + var2 && client.field799[var4] + client.field604[var4] > var1 && client.field799[var4] < var3 + var1) {
            client.field796[var4] = true;
         }
      }

   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1551283972"
   )
   static final void method4609(int var0, int var1, int var2, int var3) {
      if(client.field771 == 0 && !client.field813) {
         class121.method2816("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while(true) {
         int var10 = class120.field1686;
         if(var8 >= var10) {
            if(-1L != var4) {
               var8 = (int)(var4 >>> 0 & 127L);
               var10 = class5.method59(var4);
               class60 var11 = client.field806[client.field719];
               class82.method1942(var11, client.field719, var8, var10);
            }

            return;
         }

         long var25 = class109.method2522(var8);
         if(var6 != var25) {
            label312: {
               var6 = var25;
               long var15 = class120.field1688[var8];
               int var14 = (int)(var15 >>> 0 & 127L);
               var14 = var14;
               int var27 = class177.method3533(var8);
               int var16 = class59.method1122(var8);
               int var17 = class8.method93(class120.field1688[var8]);
               int var18 = var17;
               if(var16 == 2 && class56.field523.method2931(class192.field2415, var14, var27, var25) >= 0) {
                  class268 var19 = class40.method766(var17);
                  if(var19.field3430 != null) {
                     var19 = var19.method5076();
                  }

                  if(var19 == null) {
                     break label312;
                  }

                  if(client.field771 == 1) {
                     class121.method2816("Use", client.field759 + " " + "->" + " " + class50.method1060('\uffff') + var19.field3416, 1, var17, var14, var27);
                  } else if(client.field813) {
                     if((class45.field373 & 4) == 4) {
                        class121.method2816(client.field750, client.field751 + " " + "->" + " " + class50.method1060('\uffff') + var19.field3416, 2, var17, var14, var27);
                     }
                  } else {
                     String[] var28 = var19.field3390;
                     if(var28 != null) {
                        for(int var31 = 4; var31 >= 0; --var31) {
                           if(var28[var31] != null) {
                              short var22 = 0;
                              if(var31 == 0) {
                                 var22 = 3;
                              }

                              if(var31 == 1) {
                                 var22 = 4;
                              }

                              if(var31 == 2) {
                                 var22 = 5;
                              }

                              if(var31 == 3) {
                                 var22 = 6;
                              }

                              if(var31 == 4) {
                                 var22 = 1001;
                              }

                              class121.method2816(var28[var31], class50.method1060('\uffff') + var19.field3416, var22, var18, var14, var27);
                           }
                        }
                     }

                     class121.method2816("Examine", class50.method1060('\uffff') + var19.field3416, 1002, var19.field3396, var14, var27);
                  }
               }

               int var20;
               class72 var21;
               class60 var23;
               int[] var35;
               int var37;
               if(var16 == 1) {
                  class72 var32 = client.field807[var18];
                  if(var32 == null) {
                     break label312;
                  }

                  if(var32.field1058.field3519 == 1 && (var32.field900 & 127) == 64 && (var32.field918 & 127) == 64) {
                     for(var20 = 0; var20 < client.field635; ++var20) {
                        var21 = client.field807[client.field636[var20]];
                        if(var21 != null && var21 != var32 && var21.field1058.field3519 == 1 && var21.field900 == var32.field900 && var21.field918 == var32.field918) {
                           class184.method3829(var21.field1058, client.field636[var20], var14, var27);
                        }
                     }

                     var20 = class81.field1180;
                     var35 = class81.field1181;

                     for(var37 = 0; var37 < var20; ++var37) {
                        var23 = client.field806[var35[var37]];
                        if(var23 != null && var23.field900 == var32.field900 && var32.field918 == var23.field918) {
                           class82.method1942(var23, var35[var37], var14, var27);
                        }
                     }
                  }

                  class184.method3829(var32.field1058, var18, var14, var27);
               }

               if(var16 == 0) {
                  class60 var33 = client.field806[var18];
                  if(var33 == null) {
                     break label312;
                  }

                  if((var33.field900 & 127) == 64 && (var33.field918 & 127) == 64) {
                     for(var20 = 0; var20 < client.field635; ++var20) {
                        var21 = client.field807[client.field636[var20]];
                        if(var21 != null && var21.field1058.field3519 == 1 && var21.field900 == var33.field900 && var21.field918 == var33.field918) {
                           class184.method3829(var21.field1058, client.field636[var20], var14, var27);
                        }
                     }

                     var20 = class81.field1180;
                     var35 = class81.field1181;

                     for(var37 = 0; var37 < var20; ++var37) {
                        var23 = client.field806[var35[var37]];
                        if(var23 != null && var23 != var33 && var23.field900 == var33.field900 && var23.field918 == var33.field918) {
                           class82.method1942(var23, var35[var37], var14, var27);
                        }
                     }
                  }

                  if(var18 != client.field719) {
                     class82.method1942(var33, var18, var14, var27);
                  } else {
                     var4 = var25;
                  }
               }

               if(var16 == 3) {
                  class205 var34 = client.field720[class192.field2415][var14][var27];
                  if(var34 != null) {
                     for(class80 var38 = (class80)var34.method4112(); var38 != null; var38 = (class80)var34.method4114()) {
                        class269 var36 = class120.method2784(var38.field1174);
                        if(client.field771 == 1) {
                           class121.method2816("Use", client.field759 + " " + "->" + " " + class50.method1060(16748608) + var36.field3449, 16, var38.field1174, var14, var27);
                        } else if(client.field813) {
                           if((class45.field373 & 1) == 1) {
                              class121.method2816(client.field750, client.field751 + " " + "->" + " " + class50.method1060(16748608) + var36.field3449, 17, var38.field1174, var14, var27);
                           }
                        } else {
                           String[] var29 = var36.field3463;

                           for(int var30 = 4; var30 >= 0; --var30) {
                              if(var29 != null && var29[var30] != null) {
                                 byte var24 = 0;
                                 if(var30 == 0) {
                                    var24 = 18;
                                 }

                                 if(var30 == 1) {
                                    var24 = 19;
                                 }

                                 if(var30 == 2) {
                                    var24 = 20;
                                 }

                                 if(var30 == 3) {
                                    var24 = 21;
                                 }

                                 if(var30 == 4) {
                                    var24 = 22;
                                 }

                                 class121.method2816(var29[var30], class50.method1060(16748608) + var36.field3449, var24, var38.field1174, var14, var27);
                              } else if(var30 == 2) {
                                 class121.method2816("Take", class50.method1060(16748608) + var36.field3449, 20, var38.field1174, var14, var27);
                              }
                           }

                           class121.method2816("Examine", class50.method1060(16748608) + var36.field3449, 1004, var38.field1174, var14, var27);
                        }
                     }
                  }
               }
            }
         }

         ++var8;
      }
   }
}
