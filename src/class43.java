import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class43 {
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      longValue = -2995709194999384083L
   )
   static long field362;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
      garbageValue = "-1859985399"
   )
   @Export("processClientError")
   public static void processClientError(String var0, Throwable var1) {
      if(var1 != null) {
         var1.printStackTrace();
      } else {
         try {
            String var2 = "";
            if(var1 != null) {
               Throwable var3 = var1;
               String var4;
               if(var1 instanceof RunException) {
                  RunException var5 = (RunException)var1;
                  var4 = var5.field1960 + " | ";
                  var3 = var5.parent;
               } else {
                  var4 = "";
               }

               StringWriter var17 = new StringWriter();
               PrintWriter var6 = new PrintWriter(var17);
               var3.printStackTrace(var6);
               var6.close();
               String var7 = var17.toString();
               BufferedReader var8 = new BufferedReader(new StringReader(var7));
               String var9 = var8.readLine();

               label53:
               while(true) {
                  while(true) {
                     String var10 = var8.readLine();
                     if(var10 == null) {
                        var4 = var4 + "| " + var9;
                        var2 = var4;
                        break label53;
                     }

                     int var11 = var10.indexOf(40);
                     int var12 = var10.indexOf(41, var11 + 1);
                     if(var11 >= 0 && var12 >= 0) {
                        String var13 = var10.substring(var11 + 1, var12);
                        int var14 = var13.indexOf(".java:");
                        if(var14 >= 0) {
                           var13 = var13.substring(0, var14) + var13.substring(var14 + 5);
                           var4 = var4 + var13 + ' ';
                           continue;
                        }

                        var10 = var10.substring(0, var11);
                     }

                     var10 = var10.trim();
                     var10 = var10.substring(var10.lastIndexOf(32) + 1);
                     var10 = var10.substring(var10.lastIndexOf(9) + 1);
                     var4 = var4 + var10 + ' ';
                  }
               }
            }

            if(var0 != null) {
               if(var1 != null) {
                  var2 = var2 + " | ";
               }

               var2 = var2 + var0;
            }

            System.out.println("Error: " + var2);
            var2 = var2.replace(':', '.');
            var2 = var2.replace('@', '_');
            var2 = var2.replace('&', '_');
            var2 = var2.replace('#', '_');
            if(RunException.field1957 == null) {
               return;
            }

            URL var16 = new URL(RunException.field1957.getCodeBase(), "clienterror.ws?c=" + class54.revision + "&u=" + RunException.field1958 + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&ct=" + RunException.field1959 + "&e=" + var2);
            DataInputStream var18 = new DataInputStream(var16.openStream());
            var18.read();
            var18.close();
         } catch (Exception var15) {
            ;
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Llh;I)V",
      garbageValue = "1936312734"
   )
   static final void method790(IndexedSprite var0) {
      short var1 = 256;

      int var2;
      for(var2 = 0; var2 < class8.field51.length; ++var2) {
         class8.field51[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * (double)var1);
         class8.field51[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < var1 - 1; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               class83.field1206[var5] = (class8.field51[var5 - 128] + class8.field51[var5 + 1] + class8.field51[var5 + 128] + class8.field51[var5 - 1]) / 4;
            }
         }

         int[] var6 = class8.field51;
         class8.field51 = class83.field1206;
         class83.field1206 = var6;
      }

      if(var0 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var0.height; ++var3) {
            for(var4 = 0; var4 < var0.width; ++var4) {
               if(var0.pixels[var2++] != 0) {
                  var5 = var4 + var0.offsetX + 16;
                  int var8 = var3 + var0.offsetY + 16;
                  int var7 = var5 + (var8 << 7);
                  class8.field51[var7] = 0;
               }
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "896754288"
   )
   static final void method791(int var0) {
      short var1 = 256;
      class78.field1116 += var0 * 128;
      int var2;
      if(class78.field1116 > class8.field51.length) {
         class78.field1116 -= class8.field51.length;
         var2 = (int)(Math.random() * 12.0D);
         method790(class192.runeSprites[var2]);
      }

      var2 = 0;
      int var3 = var0 * 128;
      int var4 = (var1 - var0) * 128;

      int var5;
      int var6;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = class297.field3701[var3 + var2] - class8.field51[var2 + class78.field1116 & class8.field51.length - 1] * var0 / 6;
         if(var6 < 0) {
            var6 = 0;
         }

         class297.field3701[var2++] = var6;
      }

      int var7;
      int var8;
      for(var5 = var1 - var0; var5 < var1; ++var5) {
         var6 = var5 * 128;

         for(var7 = 0; var7 < 128; ++var7) {
            var8 = (int)(Math.random() * 100.0D);
            if(var8 < 50 && var7 > 10 && var7 < 118) {
               class297.field3701[var6 + var7] = 255;
            } else {
               class297.field3701[var6 + var7] = 0;
            }
         }
      }

      if(class78.field1114 > 0) {
         class78.field1114 -= var0 * 4;
      }

      if(class78.field1138 > 0) {
         class78.field1138 -= var0 * 4;
      }

      if(class78.field1114 == 0 && class78.field1138 == 0) {
         var5 = (int)(Math.random() * (double)(2000 / var0));
         if(var5 == 0) {
            class78.field1114 = 1024;
         }

         if(var5 == 1) {
            class78.field1138 = 1024;
         }
      }

      for(var5 = 0; var5 < var1 - var0; ++var5) {
         class78.field1128[var5] = class78.field1128[var0 + var5];
      }

      for(var5 = var1 - var0; var5 < var1; ++var5) {
         class78.field1128[var5] = (int)(Math.sin((double)class78.field1119 / 14.0D) * 16.0D + Math.sin((double)class78.field1119 / 15.0D) * 14.0D + Math.sin((double)class78.field1119 / 16.0D) * 12.0D);
         ++class78.field1119;
      }

      class78.field1103 += var0;
      var5 = (var0 + (Client.gameCycle & 1)) / 2;
      if(var5 > 0) {
         for(var6 = 0; var6 < class78.field1103 * 100; ++var6) {
            var7 = (int)(Math.random() * 124.0D) + 2;
            var8 = (int)(Math.random() * 128.0D) + 128;
            class297.field3701[var7 + (var8 << 7)] = 192;
         }

         class78.field1103 = 0;

         int var9;
         for(var6 = 0; var6 < var1; ++var6) {
            var7 = 0;
            var8 = var6 * 128;

            for(var9 = -var5; var9 < 128; ++var9) {
               if(var9 + var5 < 128) {
                  var7 += class297.field3701[var5 + var8 + var9];
               }

               if(var9 - (var5 + 1) >= 0) {
                  var7 -= class297.field3701[var9 + var8 - (var5 + 1)];
               }

               if(var9 >= 0) {
                  class274.field3569[var8 + var9] = var7 / (var5 * 2 + 1);
               }
            }
         }

         for(var6 = 0; var6 < 128; ++var6) {
            var7 = 0;

            for(var8 = -var5; var8 < var1; ++var8) {
               var9 = var8 * 128;
               if(var8 + var5 < var1) {
                  var7 += class274.field3569[var6 + var9 + var5 * 128];
               }

               if(var8 - (var5 + 1) >= 0) {
                  var7 -= class274.field3569[var9 + var6 - (var5 + 1) * 128];
               }

               if(var8 >= 0) {
                  class297.field3701[var6 + var9] = var7 / (var5 * 2 + 1);
               }
            }
         }
      }

   }
}
