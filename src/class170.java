import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class170 implements class167 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final class170 field2261 = new class170(14, 0);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   static final class170 field2259 = new class170(15, 4);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final class170 field2260 = new class170(16, -2);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static final class170 field2258 = new class170(18, -2);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "[Lfq;"
   )
   static final class170[] field2263 = new class170[32];
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   static class244 field2265;
   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "Lkr;"
   )
   static class298 field2264;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -748028369
   )
   public final int field2262;


   static {
      class170[] var0 = class25.method466();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         field2263[var0[var1].field2262] = var0[var1];
      }

   }

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   class170(int var1, int var2) {
      this.field2262 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "1942135912"
   )
   public static String method3466(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if((var4 < 97 || var4 > 122) && (var4 < 65 || var4 > 90) && (var4 < 48 || var4 > 57) && var4 != 46 && var4 != 45 && var4 != 42 && var4 != 95) {
            if(var4 == 32) {
               var2.append('+');
            } else {
               byte var5 = class294.method5519(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if(var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if(var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "749040427"
   )
   static int method3465(int var0, class84 var1, boolean var2) {
      if(var0 == 3600) {
         if(class109.field1453.field994 == 0) {
            class69.field1026[++class45.field377 - 1] = -2;
         } else if(class109.field1453.field994 == 1) {
            class69.field1026[++class45.field377 - 1] = -1;
         } else {
            class69.field1026[++class45.field377 - 1] = class109.field1453.field989.method5341();
         }

         return 1;
      } else {
         int var3;
         if(var0 == 3601) {
            var3 = class69.field1026[--class45.field377];
            if(class109.field1453.method1663() && var3 >= 0 && var3 < class109.field1453.field989.method5341()) {
               class292 var9 = (class292)class109.field1453.field989.method5351(var3);
               class69.field1021[++class83.field1207 - 1] = var9.method5300();
               class69.field1021[++class83.field1207 - 1] = var9.method5301();
            } else {
               class69.field1021[++class83.field1207 - 1] = "";
               class69.field1021[++class83.field1207 - 1] = "";
            }

            return 1;
         } else if(var0 == 3602) {
            var3 = class69.field1026[--class45.field377];
            if(class109.field1453.method1663() && var3 >= 0 && var3 < class109.field1453.field989.method5341()) {
               class69.field1026[++class45.field377 - 1] = ((class287)class109.field1453.field989.method5351(var3)).field3648;
            } else {
               class69.field1026[++class45.field377 - 1] = 0;
            }

            return 1;
         } else if(var0 == 3603) {
            var3 = class69.field1026[--class45.field377];
            if(class109.field1453.method1663() && var3 >= 0 && var3 < class109.field1453.field989.method5341()) {
               class69.field1026[++class45.field377 - 1] = ((class287)class109.field1453.field989.method5351(var3)).field3647;
            } else {
               class69.field1026[++class45.field377 - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if(var0 == 3604) {
               var5 = class69.field1021[--class83.field1207];
               int var6 = class69.field1026[--class45.field377];
               class9.method95(var5, var6);
               return 1;
            } else if(var0 == 3605) {
               var5 = class69.field1021[--class83.field1207];
               class109.field1453.method1672(var5);
               return 1;
            } else if(var0 == 3606) {
               var5 = class69.field1021[--class83.field1207];
               class109.field1453.method1674(var5);
               return 1;
            } else if(var0 == 3607) {
               var5 = class69.field1021[--class83.field1207];
               class109.field1453.method1670(var5);
               return 1;
            } else if(var0 == 3608) {
               var5 = class69.field1021[--class83.field1207];
               class109.field1453.method1675(var5);
               return 1;
            } else if(var0 == 3609) {
               var5 = class69.field1021[--class83.field1207];
               var5 = class9.method97(var5);
               class69.field1026[++class45.field377 - 1] = class109.field1453.method1668(new class291(var5, class19.field168), false)?1:0;
               return 1;
            } else if(var0 == 3611) {
               if(class0.field2 != null) {
                  class69.field1021[++class83.field1207 - 1] = class0.field2.field3667;
               } else {
                  class69.field1021[++class83.field1207 - 1] = "";
               }

               return 1;
            } else if(var0 == 3612) {
               if(class0.field2 != null) {
                  class69.field1026[++class45.field377 - 1] = class0.field2.method5341();
               } else {
                  class69.field1026[++class45.field377 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3613) {
               var3 = class69.field1026[--class45.field377];
               if(class0.field2 != null && var3 < class0.field2.method5341()) {
                  class69.field1021[++class83.field1207 - 1] = class0.field2.method5351(var3).method5299().method5462();
               } else {
                  class69.field1021[++class83.field1207 - 1] = "";
               }

               return 1;
            } else if(var0 == 3614) {
               var3 = class69.field1026[--class45.field377];
               if(class0.field2 != null && var3 < class0.field2.method5341()) {
                  class69.field1026[++class45.field377 - 1] = ((class287)class0.field2.method5351(var3)).method5433();
               } else {
                  class69.field1026[++class45.field377 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3615) {
               var3 = class69.field1026[--class45.field377];
               if(class0.field2 != null && var3 < class0.field2.method5341()) {
                  class69.field1026[++class45.field377 - 1] = ((class287)class0.field2.method5351(var3)).field3647;
               } else {
                  class69.field1026[++class45.field377 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3616) {
               class69.field1026[++class45.field377 - 1] = class0.field2 != null?class0.field2.field3674:0;
               return 1;
            } else if(var0 == 3617) {
               var5 = class69.field1021[--class83.field1207];
               if(class0.field2 != null) {
                  class172 var8 = class133.method3115(class169.field2255, client.field739.field1250);
                  var8.field2279.method3552(class12.method123(var5));
                  var8.field2279.method3549(var5);
                  client.field739.method2019(var8);
               }

               return 1;
            } else if(var0 == 3618) {
               class69.field1026[++class45.field377 - 1] = class0.field2 != null?class0.field2.field3671:0;
               return 1;
            } else if(var0 == 3619) {
               var5 = class69.field1021[--class83.field1207];
               class34.method633(var5);
               return 1;
            } else if(var0 == 3620) {
               class172 var10 = class133.method3115(class169.field2176, client.field739.field1250);
               var10.field2279.method3552(0);
               client.field739.method2019(var10);
               return 1;
            } else if(var0 == 3621) {
               if(!class109.field1453.method1663()) {
                  class69.field1026[++class45.field377 - 1] = -1;
               } else {
                  class69.field1026[++class45.field377 - 1] = class109.field1453.field993.method5341();
               }

               return 1;
            } else if(var0 == 3622) {
               var3 = class69.field1026[--class45.field377];
               if(class109.field1453.method1663() && var3 >= 0 && var3 < class109.field1453.field993.method5341()) {
                  class286 var4 = (class286)class109.field1453.field993.method5351(var3);
                  class69.field1021[++class83.field1207 - 1] = var4.method5300();
                  class69.field1021[++class83.field1207 - 1] = var4.method5301();
               } else {
                  class69.field1021[++class83.field1207 - 1] = "";
                  class69.field1021[++class83.field1207 - 1] = "";
               }

               return 1;
            } else if(var0 == 3623) {
               var5 = class69.field1021[--class83.field1207];
               var5 = class9.method97(var5);
               class69.field1026[++class45.field377 - 1] = class109.field1453.method1669(new class291(var5, class19.field168))?1:0;
               return 1;
            } else if(var0 == 3624) {
               var3 = class69.field1026[--class45.field377];
               if(class0.field2 != null && var3 < class0.field2.method5341() && class0.field2.method5351(var3).method5299().equals(class150.field1948.field587)) {
                  class69.field1026[++class45.field377 - 1] = 1;
               } else {
                  class69.field1026[++class45.field377 - 1] = 0;
               }

               return 1;
            } else if(var0 == 3625) {
               if(class0.field2 != null && class0.field2.field3669 != null) {
                  class69.field1021[++class83.field1207 - 1] = class0.field2.field3669;
               } else {
                  class69.field1021[++class83.field1207 - 1] = "";
               }

               return 1;
            } else if(var0 == 3626) {
               var3 = class69.field1026[--class45.field377];
               if(class0.field2 != null && var3 < class0.field2.method5341() && ((class281)class0.field2.method5351(var3)).method5277()) {
                  class69.field1026[++class45.field377 - 1] = 1;
               } else {
                  class69.field1026[++class45.field377 - 1] = 0;
               }

               return 1;
            } else if(var0 != 3627) {
               if(var0 == 3628) {
                  class109.field1453.field989.method5361();
                  return 1;
               } else {
                  boolean var7;
                  if(var0 == 3629) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class308(var7));
                     return 1;
                  } else if(var0 == 3630) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class309(var7));
                     return 1;
                  } else if(var0 == 3631) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class143(var7));
                     return 1;
                  } else if(var0 == 3632) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class137(var7));
                     return 1;
                  } else if(var0 == 3633) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class142(var7));
                     return 1;
                  } else if(var0 == 3634) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class145(var7));
                     return 1;
                  } else if(var0 == 3635) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class141(var7));
                     return 1;
                  } else if(var0 == 3636) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class139(var7));
                     return 1;
                  } else if(var0 == 3637) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class138(var7));
                     return 1;
                  } else if(var0 == 3638) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class140(var7));
                     return 1;
                  } else if(var0 == 3639) {
                     class109.field1453.field989.method5383();
                     return 1;
                  } else if(var0 == 3640) {
                     class109.field1453.field993.method5361();
                     return 1;
                  } else if(var0 == 3641) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field993.method5381(new class308(var7));
                     return 1;
                  } else if(var0 == 3642) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field993.method5381(new class309(var7));
                     return 1;
                  } else if(var0 == 3643) {
                     class109.field1453.field993.method5383();
                     return 1;
                  } else if(var0 == 3644) {
                     if(class0.field2 != null) {
                        class0.field2.method5361();
                     }

                     return 1;
                  } else if(var0 == 3645) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class308(var7));
                     }

                     return 1;
                  } else if(var0 == 3646) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class309(var7));
                     }

                     return 1;
                  } else if(var0 == 3647) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class143(var7));
                     }

                     return 1;
                  } else if(var0 == 3648) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class137(var7));
                     }

                     return 1;
                  } else if(var0 == 3649) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class142(var7));
                     }

                     return 1;
                  } else if(var0 == 3650) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class145(var7));
                     }

                     return 1;
                  } else if(var0 == 3651) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class141(var7));
                     }

                     return 1;
                  } else if(var0 == 3652) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class139(var7));
                     }

                     return 1;
                  } else if(var0 == 3653) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class138(var7));
                     }

                     return 1;
                  } else if(var0 == 3654) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class140(var7));
                     }

                     return 1;
                  } else if(var0 == 3655) {
                     if(class0.field2 != null) {
                        class0.field2.method5383();
                     }

                     return 1;
                  } else if(var0 == 3656) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     class109.field1453.field989.method5381(new class144(var7));
                     return 1;
                  } else if(var0 == 3657) {
                     var7 = class69.field1026[--class45.field377] == 1;
                     if(class0.field2 != null) {
                        class0.field2.method5381(new class144(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = class69.field1026[--class45.field377];
               if(class0.field2 != null && var3 < class0.field2.method5341() && ((class281)class0.field2.method5351(var3)).method5280()) {
                  class69.field1026[++class45.field377 - 1] = 1;
               } else {
                  class69.field1026[++class45.field377 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
