import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

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
   static boolean method3534(String param0, int param1, String param2) {
      // $FF: Couldn't be decompiled
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
