import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class245 extends class204 {

   @ObfuscatedName("pt")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   static class102 field3166;
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field3161;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 642153213
   )
   int field3163;
   @ObfuscatedName("m")
   public byte[] field3165;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   public class162 field3164;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   public class249 field3162;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-94"
   )
   public static boolean method4620(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lge;I)V",
      garbageValue = "358617615"
   )
   static final void method4619(class189 var0) {
      int var1 = 0;
      var0.method3898();

      int var2;
      int var3;
      int var4;
      for(var2 = 0; var2 < class81.field1180; ++var2) {
         var3 = class81.field1181[var2];
         if((class81.field1183[var3] & 1) == 0) {
            if(var1 > 0) {
               --var1;
               class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
            } else {
               var4 = var0.method3871(1);
               if(var4 == 0) {
                  var1 = class73.method1843(var0);
                  class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
               } else {
                  class1.method10(var0, var3);
               }
            }
         }
      }

      var0.method3872();
      if(var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.method3898();

         for(var2 = 0; var2 < class81.field1180; ++var2) {
            var3 = class81.field1181[var2];
            if((class81.field1183[var3] & 1) != 0) {
               if(var1 > 0) {
                  --var1;
                  class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
               } else {
                  var4 = var0.method3871(1);
                  if(var4 == 0) {
                     var1 = class73.method1843(var0);
                     class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
                  } else {
                     class1.method10(var0, var3);
                  }
               }
            }
         }

         var0.method3872();
         if(var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.method3898();

            for(var2 = 0; var2 < class81.field1182; ++var2) {
               var3 = class81.field1175[var2];
               if((class81.field1183[var3] & 1) != 0) {
                  if(var1 > 0) {
                     --var1;
                     class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
                  } else {
                     var4 = var0.method3871(1);
                     if(var4 == 0) {
                        var1 = class73.method1843(var0);
                        class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
                     } else if(class230.method4572(var0, var3)) {
                        class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
                     }
                  }
               }
            }

            var0.method3872();
            if(var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.method3898();

               for(var2 = 0; var2 < class81.field1182; ++var2) {
                  var3 = class81.field1175[var2];
                  if((class81.field1183[var3] & 1) == 0) {
                     if(var1 > 0) {
                        --var1;
                        class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
                     } else {
                        var4 = var0.method3871(1);
                        if(var4 == 0) {
                           var1 = class73.method1843(var0);
                           class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
                        } else if(class230.method4572(var0, var3)) {
                           class81.field1183[var3] = (byte)(class81.field1183[var3] | 2);
                        }
                     }
                  }
               }

               var0.method3872();
               if(var1 != 0) {
                  throw new RuntimeException();
               } else {
                  class81.field1180 = 0;
                  class81.field1182 = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     class81.field1183[var2] = (byte)(class81.field1183[var2] >> 1);
                     class60 var5 = client.field806[var2];
                     if(var5 != null) {
                        class81.field1181[++class81.field1180 - 1] = var2;
                     } else {
                        class81.field1175[++class81.field1182 - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1680267972"
   )
   static void method4617(boolean var0) {
      class78.field1124 = "";
      class78.field1125 = "Enter your username/email & password.";
      class78.field1139 = "";
      class78.field1135 = 2;
      if(var0) {
         class78.field1143 = "";
      }

      class132.method3110();
      class274.method5248();
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "(Lhl;IIIIIII)V",
      garbageValue = "1715888302"
   )
   static final void method4618(class230 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(client.field659) {
         client.field736 = 32;
      } else {
         client.field736 = 0;
      }

      client.field659 = false;
      int var7;
      if(class48.field424 == 1 || !class8.field57 && class48.field424 == 4) {
         if(var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field2611 -= 4;
            class181.method3548(var0);
         } else if(var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.field2611 += 4;
            class181.method3548(var0);
         } else if(var5 >= var1 - client.field736 && var5 < client.field736 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if(var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.field2611 = var8 * (var4 - var3) / var9;
            class181.method3548(var0);
            client.field659 = true;
         }
      }

      if(client.field788 != 0) {
         var7 = var0.field2627;
         if(var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field2611 += client.field788 * 45;
            class181.method3548(var0);
         }
      }

   }
}
