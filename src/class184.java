import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class184 {

   @ObfuscatedName("my")
   @ObfuscatedGetter(
      intValue = -1621344433
   )
   static int field2378;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = 6328954577879716125L
   )
   static long field2380;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field2379;
   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      signature = "Lbd;"
   )
   static class75 field2376;


   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "1488900096"
   )
   public static boolean method3830(char var0) {
      return var0 >= 48 && var0 <= 57;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IZII)V",
      garbageValue = "1842007658"
   )
   public static final void method3828(int var0, boolean var1, int var2) {
      if(var0 >= 8000 && var0 <= '\ubb80') {
         class95.field1330 = var0;
         class95.field1321 = var1;
         class95.field1324 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(Ljj;IIII)V",
      garbageValue = "-223861270"
   )
   static final void method3829(class271 var0, int var1, int var2, int var3) {
      if(client.field657 < 400) {
         if(var0.field3529 != null) {
            var0 = var0.method5186();
         }

         if(var0 != null) {
            if(var0.field3535) {
               if(!var0.field3534 || client.field760 == var1) {
                  String var4 = var0.field3504;
                  if(var0.field3521 != 0) {
                     var4 = var4 + class32.method598(var0.field3521, class150.field1948.field566) + " " + " (" + "level-" + var0.field3521 + ")";
                  }

                  if(var0.field3534 && client.field753) {
                     class121.method2816("Examine", class50.method1060(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if(client.field771 == 1) {
                     class121.method2816("Use", client.field759 + " " + "->" + " " + class50.method1060(16776960) + var4, 7, var1, var2, var3);
                  } else if(client.field813) {
                     if((class45.field373 & 2) == 2) {
                        class121.method2816(client.field750, client.field751 + " " + "->" + " " + class50.method1060(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var5 = var0.field3534 && client.field753?2000:0;
                     String[] var6 = var0.field3506;
                     int var7;
                     int var8;
                     if(var6 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var6[var7] != null && !var6[var7].equalsIgnoreCase("Attack")) {
                              var8 = 0;
                              if(var7 == 0) {
                                 var8 = var5 + 9;
                              }

                              if(var7 == 1) {
                                 var8 = var5 + 10;
                              }

                              if(var7 == 2) {
                                 var8 = var5 + 11;
                              }

                              if(var7 == 3) {
                                 var8 = var5 + 12;
                              }

                              if(var7 == 4) {
                                 var8 = var5 + 13;
                              }

                              class121.method2816(var6[var7], class50.method1060(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if(var6 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var6[var7] != null && var6[var7].equalsIgnoreCase("Attack")) {
                              short var9 = 0;
                              if(client.field621 != class77.field1094) {
                                 if(client.field621 == class77.field1097 || class77.field1098 == client.field621 && var0.field3521 > class150.field1948.field566) {
                                    var9 = 2000;
                                 }

                                 var8 = 0;
                                 if(var7 == 0) {
                                    var8 = var9 + 9;
                                 }

                                 if(var7 == 1) {
                                    var8 = var9 + 10;
                                 }

                                 if(var7 == 2) {
                                    var8 = var9 + 11;
                                 }

                                 if(var7 == 3) {
                                    var8 = var9 + 12;
                                 }

                                 if(var7 == 4) {
                                    var8 = var9 + 13;
                                 }

                                 class121.method2816(var6[var7], class50.method1060(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if(!var0.field3534 || !client.field753) {
                        class121.method2816("Examine", class50.method1060(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }
}
