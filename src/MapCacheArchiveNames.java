import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("MapCacheArchiveNames")
public class MapCacheArchiveNames {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   @Export("DETAILS")
   public static final MapCacheArchiveNames DETAILS = new MapCacheArchiveNames("details");
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   @Export("COMPOSITE_MAP")
   public static final MapCacheArchiveNames COMPOSITE_MAP = new MapCacheArchiveNames("compositemap");
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   @Export("COMPOSITE_TEXTURE")
   public static final MapCacheArchiveNames COMPOSITE_TEXTURE = new MapCacheArchiveNames("compositetexture");
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   @Export("AREA")
   public static final MapCacheArchiveNames AREA = new MapCacheArchiveNames("area");
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   @Export("LABELS")
   public static final MapCacheArchiveNames LABELS = new MapCacheArchiveNames("labels");
   @ObfuscatedName("n")
   @Export("name")
   public final String name;

   MapCacheArchiveNames(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1972552445"
   )
   static final int method518(int var0, int var1) {
      int var2 = var1 * 57 + var0;
      var2 ^= var2 << 13;
      int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }
}
