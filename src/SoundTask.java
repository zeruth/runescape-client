import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("SoundTask")
public class SoundTask implements Runnable {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lcc;"
   )
   @Export("systems")
   volatile AbstractSoundSystem[] systems = new AbstractSoundSystem[2];

   public void run() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "116813309"
   )
   public static boolean method2272(int var0) {
      return (var0 >> 30 & 1) != 0;
   }
}
