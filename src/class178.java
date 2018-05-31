import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("fx")
public class class178 {
   @ObfuscatedName("l")
   static boolean field2317;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = 1430708189
   )
   @Export("baseX")
   static int baseX;

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ILjava/lang/String;B)Z",
      garbageValue = "70"
   )
   static boolean method3534(String var0, int var1, String var2) {
      if(var1 == 0) {
         try {
            if(!class45.field368.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var12 = 0; var12 < var0.length(); ++var12) {
                  if(var11.indexOf(var0.charAt(var12)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var10) {
            return false;
         }
      } else if(var1 == 1) {
         try {
            Applet var3 = class45.field374;
            Object[] var4 = new Object[]{(new URL(class45.field374.getCodeBase(), var0)).toString()};
            Object var5 = JSObject.getWindow(var3).call(var2, var4);
            return var5 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if(var1 == 2) {
         try {
            class45.field374.getAppletContext().showDocument(new URL(class45.field374.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if(var1 == 3) {
         try {
            class41.method769(class45.field374, "loggedout");
         } catch (Throwable var9) {
            ;
         }

         try {
            class45.field374.getAppletContext().showDocument(new URL(class45.field374.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(CII)Ljava/lang/String;",
      garbageValue = "-759699337"
   )
   static String method3535(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }
}
