import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class137 implements Comparator {

   @ObfuscatedName("ru")
   static short[] field1889;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = 377740755
   )
   static int field1888;
   @ObfuscatedName("w")
   final boolean field1887;


   public class137(boolean var1) {
      this.field1887 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkd;Lkd;I)I",
      garbageValue = "1479821814"
   )
   int method3146(class287 var1, class287 var2) {
      return this.field1887?var1.field3649 - var2.field3649:var2.field3649 - var1.field3649;
   }

   public int compare(Object var1, Object var2) {
      return this.method3146((class287)var1, (class287)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2074570907"
   )
   public static boolean method3141() {
      long var0 = class166.method3456();
      int var2 = (int)(var0 - class250.field3223);
      class250.field3223 = var0;
      if(var2 > 200) {
         var2 = 200;
      }

      class250.field3209 += var2;
      if(class250.field3210 == 0 && class250.field3214 == 0 && class250.field3219 == 0 && class250.field3212 == 0) {
         return true;
      } else if(class250.field3217 == null) {
         return false;
      } else {
         try {
            if(class250.field3209 > 30000) {
               throw new IOException();
            } else {
               class246 var3;
               class182 var4;
               while(class250.field3214 < 200 && class250.field3212 > 0) {
                  var3 = (class246)class250.field3211.method4055();
                  var4 = new class182(4);
                  var4.method3552(1);
                  var4.method3554((int)var3.field2449);
                  class250.field3217.vmethod3385(var4.field2365, 0, 4);
                  class250.field3213.method4063(var3, var3.field2449);
                  --class250.field3212;
                  ++class250.field3214;
               }

               while(class250.field3210 < 200 && class250.field3219 > 0) {
                  var3 = (class246)class250.field3215.method3969();
                  var4 = new class182(4);
                  var4.method3552(0);
                  var4.method3554((int)var3.field2449);
                  class250.field3217.vmethod3385(var4.field2365, 0, 4);
                  var3.method4135();
                  class250.field3222.method4063(var3, var3.field2449);
                  --class250.field3219;
                  ++class250.field3210;
               }

               for(int var15 = 0; var15 < 100; ++var15) {
                  int var16 = class250.field3217.vmethod3354();
                  if(var16 < 0) {
                     throw new IOException();
                  }

                  if(var16 == 0) {
                     break;
                  }

                  class250.field3209 = 0;
                  byte var5 = 0;
                  if(class320.field3816 == null) {
                     var5 = 8;
                  } else if(class250.field3221 == 0) {
                     var5 = 1;
                  }

                  int var6;
                  int var7;
                  int var8;
                  int var10;
                  if(var5 > 0) {
                     var6 = var5 - class250.field3208.field2359;
                     if(var6 > var16) {
                        var6 = var16;
                     }

                     class250.field3217.vmethod3356(class250.field3208.field2365, class250.field3208.field2359, var6);
                     if(class250.field3225 != 0) {
                        for(var7 = 0; var7 < var6; ++var7) {
                           class250.field3208.field2365[class250.field3208.field2359 + var7] ^= class250.field3225;
                        }
                     }

                     class250.field3208.field2359 += var6;
                     if(class250.field3208.field2359 < var5) {
                        break;
                     }

                     if(class320.field3816 == null) {
                        class250.field3208.field2359 = 0;
                        var7 = class250.field3208.method3742();
                        var8 = class250.field3208.method3574();
                        int var9 = class250.field3208.method3742();
                        var10 = class250.field3208.method3573();
                        long var11 = (long)(var8 + (var7 << 16));
                        class246 var13 = (class246)class250.field3213.method4064(var11);
                        class250.field3220 = true;
                        if(var13 == null) {
                           var13 = (class246)class250.field3222.method4064(var11);
                           class250.field3220 = false;
                        }

                        if(var13 == null) {
                           throw new IOException();
                        }

                        int var14 = var9 == 0?5:9;
                        class320.field3816 = var13;
                        class232.field2771 = new class182(var14 + var10 + class320.field3816.field3169);
                        class232.field2771.method3552(var9);
                        class232.field2771.method3555(var10);
                        class250.field3221 = 8;
                        class250.field3208.field2359 = 0;
                     } else if(class250.field3221 == 0) {
                        if(class250.field3208.field2365[0] == -1) {
                           class250.field3221 = 1;
                           class250.field3208.field2359 = 0;
                        } else {
                           class320.field3816 = null;
                        }
                     }
                  } else {
                     var6 = class232.field2771.field2365.length - class320.field3816.field3169;
                     var7 = 512 - class250.field3221;
                     if(var7 > var6 - class232.field2771.field2359) {
                        var7 = var6 - class232.field2771.field2359;
                     }

                     if(var7 > var16) {
                        var7 = var16;
                     }

                     class250.field3217.vmethod3356(class232.field2771.field2365, class232.field2771.field2359, var7);
                     if(class250.field3225 != 0) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           class232.field2771.field2365[class232.field2771.field2359 + var8] ^= class250.field3225;
                        }
                     }

                     class232.field2771.field2359 += var7;
                     class250.field3221 += var7;
                     if(var6 == class232.field2771.field2359) {
                        if(16711935L == class320.field3816.field2449) {
                           class325.field3924 = class232.field2771;

                           for(var8 = 0; var8 < 256; ++var8) {
                              class249 var17 = class250.field3224[var8];
                              if(var17 != null) {
                                 class325.field3924.field2359 = var8 * 8 + 5;
                                 var10 = class325.field3924.method3573();
                                 int var18 = class325.field3924.method3573();
                                 var17.method4736(var10, var18);
                              }
                           }
                        } else {
                           class250.field3218.reset();
                           class250.field3218.update(class232.field2771.field2365, 0, var6);
                           var8 = (int)class250.field3218.getValue();
                           if(var8 != class320.field3816.field3170) {
                              try {
                                 class250.field3217.vmethod3368();
                              } catch (Exception var20) {
                                 ;
                              }

                              ++class250.field3226;
                              class250.field3217 = null;
                              class250.field3225 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           class250.field3226 = 0;
                           class250.field3227 = 0;
                           class320.field3816.field3167.method4740((int)(class320.field3816.field2449 & 65535L), class232.field2771.field2365, (class320.field3816.field2449 & 16711680L) == 16711680L, class250.field3220);
                        }

                        class320.field3816.method4098();
                        if(class250.field3220) {
                           --class250.field3214;
                        } else {
                           --class250.field3210;
                        }

                        class250.field3221 = 0;
                        class320.field3816 = null;
                        class232.field2771 = null;
                     } else {
                        if(class250.field3221 != 512) {
                           break;
                        }

                        class250.field3221 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var21) {
            try {
               class250.field3217.vmethod3368();
            } catch (Exception var19) {
               ;
            }

            ++class250.field3227;
            class250.field3217 = null;
            return false;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Ljh;",
      garbageValue = "-335324697"
   )
   public static class273 method3151(int var0) {
      class273 var1 = (class273)class273.field3551.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class273.field3548.method4626(12, var0);
         var1 = new class273();
         if(var2 != null) {
            var1.method5227(new class182(var2));
         }

         var1.method5218();
         class273.field3551.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)[Lip;",
      garbageValue = "1594770687"
   )
   public static class243[] method3149() {
      return new class243[]{class243.field3146, class243.field3151, class243.field3148, class243.field3147};
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "435577119"
   )
   static void method3148(int var0) {
      class53 var1 = (class53)class53.field478.method4064((long)var0);
      if(var1 != null) {
         var1.method4098();
      }
   }
}
