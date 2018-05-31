import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class59 extends class166 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcv;"
   )
   static class98 field557;
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexSprites")
   static IndexData indexSprites;
   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      signature = "Lep;"
   )
   @Export("urlRequester")
   static UrlRequester urlRequester;
   @ObfuscatedName("jn")
   @ObfuscatedGetter(
      intValue = 1955230301
   )
   @Export("menuY")
   static int menuY;
   @ObfuscatedName("kc")
   @ObfuscatedGetter(
      intValue = -2137417073
   )
   @Export("selectedItemIndex")
   static int selectedItemIndex;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIILfm;I)Z",
      garbageValue = "1081805803"
   )
   public boolean vmethod3457(int var1, int var2, int var3, CollisionData var4) {
      return var2 == super.field2066 && var3 == super.field2067;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Ljj;",
      garbageValue = "324953864"
   )
   @Export("getNpcDefinition")
   public static NPCComposition getNpcDefinition(int var0) {
      NPCComposition var1 = (NPCComposition)NPCComposition.npcs.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = NPCComposition.NpcDefinition_indexCache.getConfigData(9, var0);
         var1 = new NPCComposition();
         var1.id = var0;
         if(var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         NPCComposition.npcs.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "225778137"
   )
   static void method1126() {
      for(class68 var0 = (class68)class68.field1002.getFront(); var0 != null; var0 = (class68)class68.field1002.getNext()) {
         if(var0.field1006 != null) {
            class141.field1906.method2050(var0.field1006);
            var0.field1006 = null;
         }

         if(var0.field1010 != null) {
            class141.field1906.method2050(var0.field1010);
            var0.field1010 = null;
         }
      }

      class68.field1002.clear();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;B)Ljava/lang/String;",
      garbageValue = "-72"
   )
   public static String method1128(Buffer var0) {
      String var1;
      try {
         int var2 = var0.getUSmart();
         if(var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class300.huffman.decompress(var0.payload, var0.offset, var3, 0, var2);
         String var4 = class165.getString(var3, 0, var2);
         var1 = var4;
      } catch (Exception var5) {
         var1 = "Cabbage";
      }

      return var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "109337396"
   )
   public static void method1120(int var0) {
      MouseInput.mouseIdleTicks = var0;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "269419072"
   )
   public static int method1122(int var0) {
      long var1 = class120.field1688[var0];
      int var3 = (int)(var1 >>> 14 & 3L);
      return var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1851845520"
   )
   public static void method1130() {
      Overlay.overlays.reset();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIIZII)J",
      garbageValue = "-1211445183"
   )
   public static long method1129(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if(var3) {
         var5 |= 65536L;
      }

      return var5;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-27"
   )
   static void method1124() {
      class78.username = class78.username.trim();
      if(class78.username.length() == 0) {
         Resampler.method2307("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var0;
         Buffer var6;
         try {
            URL var2 = new URL(CacheFile.method2551("services", false) + "m=accountappeal/login.ws");
            URLConnection var3 = var2.openConnection();
            var3.setRequestProperty("connection", "close");
            var3.setDoInput(true);
            var3.setDoOutput(true);
            var3.setConnectTimeout(5000);
            OutputStreamWriter var4 = new OutputStreamWriter(var3.getOutputStream());
            var4.write("data1=req");
            var4.flush();
            InputStream var5 = var3.getInputStream();
            var6 = new Buffer(new byte[1000]);

            while(true) {
               int var7 = var5.read(var6.payload, var6.offset, 1000 - var6.offset);
               if(var7 == -1) {
                  var6.offset = 0;
                  long var8 = var6.readLong();
                  var0 = var8;
                  break;
               }

               var6.offset += var7;
               if(var6.offset >= 1000) {
                  var0 = 0L;
                  break;
               }
            }
         } catch (Exception var23) {
            var0 = 0L;
         }

         byte var24;
         if(var0 == 0L) {
            var24 = 5;
         } else {
            String var25 = class78.username;
            Random var26 = new Random();
            Buffer var27 = new Buffer(128);
            var6 = new Buffer(128);
            int[] var28 = new int[]{var26.nextInt(), var26.nextInt(), (int)(var0 >> 32), (int)var0};
            var27.putByte(10);

            int var29;
            for(var29 = 0; var29 < 4; ++var29) {
               var27.putInt(var26.nextInt());
            }

            var27.putInt(var28[0]);
            var27.putInt(var28[1]);
            var27.putLong(var0);
            var27.putLong(0L);

            for(var29 = 0; var29 < 4; ++var29) {
               var27.putInt(var26.nextInt());
            }

            var27.encryptRsa(class73.field1062, class73.field1060);
            var6.putByte(10);

            for(var29 = 0; var29 < 3; ++var29) {
               var6.putInt(var26.nextInt());
            }

            var6.putLong(var26.nextLong());
            var6.method3646(var26.nextLong());
            if(Client.field718 != null) {
               var6.putBytes(Client.field718, 0, Client.field718.length);
            } else {
               byte[] var9 = PlayerComposition.method4515();
               var6.putBytes(var9, 0, var9.length);
            }

            var6.putLong(var26.nextLong());
            var6.encryptRsa(class73.field1062, class73.field1060);
            var29 = Size.getLength(var25);
            if(var29 % 8 != 0) {
               var29 += 8 - var29 % 8;
            }

            Buffer var30 = new Buffer(var29);
            var30.putString(var25);
            var30.offset = var29;
            var30.encryptXtea2(var28);
            Buffer var10 = new Buffer(var27.offset + var6.offset + var30.offset + 5);
            var10.putByte(2);
            var10.putByte(var27.offset);
            var10.putBytes(var27.payload, 0, var27.offset);
            var10.putByte(var6.offset);
            var10.putBytes(var6.payload, 0, var6.offset);
            var10.putShort(var30.offset);
            var10.putBytes(var30.payload, 0, var30.offset);
            String var11 = Frames.method3087(var10.payload);

            byte var12;
            try {
               URL var13 = new URL(CacheFile.method2551("services", false) + "m=accountappeal/login.ws");
               URLConnection var14 = var13.openConnection();
               var14.setDoInput(true);
               var14.setDoOutput(true);
               var14.setConnectTimeout(5000);
               OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
               var15.write("data2=" + LoginPacket.method3466(var11) + "&dest=" + LoginPacket.method3466("passwordchoice.ws"));
               var15.flush();
               InputStream var16 = var14.getInputStream();
               var10 = new Buffer(new byte[1000]);

               while(true) {
                  int var17 = var16.read(var10.payload, var10.offset, 1000 - var10.offset);
                  if(var17 == -1) {
                     var15.close();
                     var16.close();
                     String var18 = new String(var10.payload);
                     if(var18.startsWith("OFFLINE")) {
                        var12 = 4;
                     } else if(var18.startsWith("WRONG")) {
                        var12 = 7;
                     } else if(var18.startsWith("RELOAD")) {
                        var12 = 3;
                     } else if(var18.startsWith("Not permitted for social network accounts.")) {
                        var12 = 6;
                     } else {
                        var10.decryptXtea(var28);

                        while(var10.offset > 0 && var10.payload[var10.offset - 1] == 0) {
                           --var10.offset;
                        }

                        var18 = new String(var10.payload, 0, var10.offset);
                        boolean var19;
                        if(var18 == null) {
                           var19 = false;
                        } else {
                           label149: {
                              try {
                                 new URL(var18);
                              } catch (MalformedURLException var21) {
                                 var19 = false;
                                 break label149;
                              }

                              var19 = true;
                           }
                        }

                        if(var19) {
                           class54.method1073(var18, true, false);
                           var12 = 2;
                        } else {
                           var12 = 5;
                        }
                     }
                     break;
                  }

                  var10.offset += var17;
                  if(var10.offset >= 1000) {
                     var12 = 5;
                     break;
                  }
               }
            } catch (Throwable var22) {
               var22.printStackTrace();
               var12 = 5;
            }

            var24 = var12;
         }

         switch(var24) {
         case 2:
            Resampler.method2307(class237.field2928, class237.field3073, class237.field2832);
            class78.loginIndex = 6;
            break;
         case 3:
            Resampler.method2307("", "Error connecting to server.", "");
            break;
         case 4:
            Resampler.method2307("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            Resampler.method2307("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            Resampler.method2307("", "Error connecting to server.", "");
            break;
         case 7:
            Resampler.method2307("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }
      }

   }
}
