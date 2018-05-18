import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class171 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2274 = new class171(14);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2267 = new class171(5);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2269 = new class171(2);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2270 = new class171(4);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2271 = new class171(15);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2276 = new class171(5);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2273 = new class171(7);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2268 = new class171(6);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2275 = new class171(4);
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfr;"
   )
   public static final class171 field2272 = new class171(3);


   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "14"
   )
   class171(int var1) {}

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-423054347"
   )
   static void method3474() {
      class50.field450 = null;
      class139.field1895 = null;
      class72.field1055 = null;
      class50.field448 = null;
      class57.field534 = null;
      class50.field449 = null;
      class19.field162 = null;
      class50.field460 = null;
      class12.field97 = null;
      class50.field451 = null;
      class36.field311 = null;
      class50.field452 = null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(CI)C",
      garbageValue = "999018951"
   )
   static char method3473(char var0) {
      switch(var0) {
      case 32:
      case 45:
      case 95:
      case 160:
         return '_';
      case 35:
      case 91:
      case 93:
         return var0;
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 224:
      case 225:
      case 226:
      case 227:
      case 228:
         return 'a';
      case 199:
      case 231:
         return 'c';
      case 200:
      case 201:
      case 202:
      case 203:
      case 232:
      case 233:
      case 234:
      case 235:
         return 'e';
      case 205:
      case 206:
      case 207:
      case 237:
      case 238:
      case 239:
         return 'i';
      case 209:
      case 241:
         return 'n';
      case 210:
      case 211:
      case 212:
      case 213:
      case 214:
      case 242:
      case 243:
      case 244:
      case 245:
      case 246:
         return 'o';
      case 217:
      case 218:
      case 219:
      case 220:
      case 249:
      case 250:
      case 251:
      case 252:
         return 'u';
      case 223:
         return 'b';
      case 255:
      case 376:
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIIIZB)Llc;",
      garbageValue = "62"
   )
   public static final class318 method3467(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + (long)var0 + ((long)var1 << 16);
      class318 var8;
      if(!var5) {
         var8 = (class318)class269.field3459.method4023(var6);
         if(var8 != null) {
            return var8;
         }
      }

      class269 var9 = class120.method2784(var0);
      if(var1 > 1 && var9.field3478 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.field3479[var11] && var9.field3479[var11] != 0) {
               var10 = var9.field3478[var11];
            }
         }

         if(var10 != -1) {
            var9 = class120.method2784(var10);
         }
      }

      class119 var21 = var9.method5104(1);
      if(var21 == null) {
         return null;
      } else {
         class318 var22 = null;
         if(var9.field3460 != -1) {
            var22 = method3467(var9.field3447, 10, 1, 0, 0, true);
            if(var22 == null) {
               return null;
            }
         } else if(var9.field3491 != -1) {
            var22 = method3467(var9.field3490, var1, var2, var3, 0, false);
            if(var22 == null) {
               return null;
            }
         } else if(var9.field3440 != -1) {
            var22 = method3467(var9.field3492, var1, 0, 0, 0, false);
            if(var22 == null) {
               return null;
            }
         }

         int[] var12 = class314.field3772;
         int var13 = class314.field3770;
         int var14 = class314.field3766;
         int[] var15 = new int[4];
         class314.method5776(var15);
         var8 = new class318(36, 32);
         class314.method5761(var8.field3798, 36, 32);
         class314.method5767();
         class122.method2850();
         class122.method2821(16, 16);
         class122.field1726 = false;
         if(var9.field3440 != -1) {
            var22.method5891(0, 0);
         }

         int var16 = var9.field3454;
         if(var5) {
            var16 = (int)((double)var16 * 1.5D);
         } else if(var2 == 2) {
            var16 = (int)(1.04D * (double)var16);
         }

         int var17 = var16 * class122.field1702[var9.field3470] >> 16;
         int var18 = var16 * class122.field1708[var9.field3470] >> 16;
         var21.method2725();
         var21.method2738(0, var9.field3456, var9.field3457, var9.field3470, var9.field3458, var21.field1805 / 2 + var17 + var9.field3486, var18 + var9.field3486);
         if(var9.field3491 != -1) {
            var22.method5891(0, 0);
         }

         if(var2 >= 1) {
            var8.method5991(1);
         }

         if(var2 >= 2) {
            var8.method5991(16777215);
         }

         if(var3 != 0) {
            var8.method5892(var3);
         }

         class314.method5761(var8.field3798, 36, 32);
         if(var9.field3460 != -1) {
            var22.method5891(0, 0);
         }

         if(var4 == 1 || var4 == 2 && var9.field3482 == 1) {
            class298 var19 = class163.field2036;
            String var20;
            if(var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if(var1 < 10000000) {
               var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
            }

            var19.method5541(var20, 0, 9, 16776960, 1);
         }

         if(!var5) {
            class269.field3459.method4028(var8, var6);
         }

         class314.method5761(var12, var13, var14);
         class314.method5766(var15);
         class122.method2850();
         class122.field1726 = true;
         return var8;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "-1621995107"
   )
   static void method3471(byte[] var0) {
      class182 var1 = new class182(var0);
      var1.field2359 = var0.length - 2;
      class319.field3809 = var1.method3574();
      class319.field3808 = new int[class319.field3809];
      class319.field3807 = new int[class319.field3809];
      class192.field2413 = new int[class319.field3809];
      class319.field3804 = new int[class319.field3809];
      class294.field3678 = new byte[class319.field3809][];
      var1.field2359 = var0.length - 7 - class319.field3809 * 8;
      class319.field3805 = var1.method3574();
      class275.field3574 = var1.method3574();
      int var2 = (var1.method3742() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class319.field3809; ++var3) {
         class319.field3808[var3] = var1.method3574();
      }

      for(var3 = 0; var3 < class319.field3809; ++var3) {
         class319.field3807[var3] = var1.method3574();
      }

      for(var3 = 0; var3 < class319.field3809; ++var3) {
         class192.field2413[var3] = var1.method3574();
      }

      for(var3 = 0; var3 < class319.field3809; ++var3) {
         class319.field3804[var3] = var1.method3574();
      }

      var1.field2359 = var0.length - 7 - class319.field3809 * 8 - (var2 - 1) * 3;
      class319.field3806 = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class319.field3806[var3] = var1.method3572();
         if(class319.field3806[var3] == 0) {
            class319.field3806[var3] = 1;
         }
      }

      var1.field2359 = 0;

      for(var3 = 0; var3 < class319.field3809; ++var3) {
         int var4 = class192.field2413[var3];
         int var5 = class319.field3804[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class294.field3678[var3] = var7;
         int var8 = var1.method3742();
         int var9;
         if(var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.method3569();
            }
         } else if(var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var10 * var4] = var1.method3569();
               }
            }
         }
      }

   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2032412192"
   )
   static void method3470(int var0) {
      client.field803 = 0L;
      if(var0 >= 2) {
         client.field675 = true;
      } else {
         client.field675 = false;
      }

      boolean var1 = client.field675?true:true;
      if(var1) {
         class37.field321.method896(765, 503);
      } else {
         class37.field321.method896(7680, 2160);
      }

      if(client.field611 >= 25) {
         class172 var2 = class133.method3115(class169.field2206, client.field739.field1250);
         class189 var3 = var2.field2279;
         int var4 = client.field675?2:1;
         var3.method3552(var4);
         var2.field2279.method3602(class9.field70);
         var2.field2279.method3602(class37.field326);
         client.field739.method2019(var2);
      }

   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      signature = "(Lbu;I)Z",
      garbageValue = "-536291877"
   )
   static boolean method3469(class60 var0) {
      if(client.field712 == 0) {
         return false;
      } else {
         boolean var1;
         if(class150.field1948 == var0) {
            var1 = (client.field712 & 8) != 0;
            return var1;
         } else {
            var1 = class16.method188();
            boolean var2;
            if(!var1) {
               var2 = (client.field712 & 1) != 0;
               var1 = var2 && var0.method1133();
            }

            var2 = var1;
            if(!var1) {
               boolean var3 = (client.field712 & 2) != 0;
               var2 = var3 && var0.method1136();
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      signature = "(IIS)V",
      garbageValue = "14520"
   )
   static final void method3472(int var0, int var1) {
      class205 var2 = client.field720[class192.field2415][var0][var1];
      if(var2 == null) {
         class56.field523.method2922(class192.field2415, var0, var1);
      } else {
         long var3 = -99999999L;
         class80 var5 = null;

         class80 var6;
         for(var6 = (class80)var2.method4113(); var6 != null; var6 = (class80)var2.method4104()) {
            class269 var7 = class120.method2784(var6.field1174);
            long var8 = (long)var7.field3487;
            if(var7.field3482 == 1) {
               var8 *= (long)(var6.field1172 + 1);
            }

            if(var8 > var3) {
               var3 = var8;
               var5 = var6;
            }
         }

         if(var5 == null) {
            class56.field523.method2922(class192.field2415, var0, var1);
         } else {
            var2.method4107(var5);
            class80 var12 = null;
            class80 var11 = null;

            for(var6 = (class80)var2.method4113(); var6 != null; var6 = (class80)var2.method4104()) {
               if(var6.field1174 != var5.field1174) {
                  if(var12 == null) {
                     var12 = var6;
                  }

                  if(var12.field1174 != var6.field1174 && var11 == null) {
                     var11 = var6;
                  }
               }
            }

            long var9 = class59.method1129(var0, var1, 3, false, 0);
            class56.field523.method2908(class192.field2415, var0, var1, class264.method4955(var0 * 128 + 64, var1 * 128 + 64, class192.field2415), var5, var9, var12, var11);
         }
      }
   }
}
