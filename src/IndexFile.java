import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("IndexFile")
public final class IndexFile {
   @ObfuscatedName("w")
   @Export("IndexStore_buffer")
   static byte[] IndexStore_buffer = new byte[520];
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   @Export("dataFile")
   CacheFile dataFile = null;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   @Export("indexFile")
   CacheFile indexFile = null;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 69040701
   )
   @Export("index")
   int index;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1834258411
   )
   @Export("maxSize")
   int maxSize = 65000;

   @ObfuscatedSignature(
      signature = "(ILdd;Ldd;I)V"
   )
   public IndexFile(int var1, CacheFile var2, CacheFile var3, int var4) {
      this.index = var1;
      this.dataFile = var2;
      this.indexFile = var3;
      this.maxSize = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)[B",
      garbageValue = "127"
   )
   @Export("read")
   public byte[] read(int param1) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I[BIB)Z",
      garbageValue = "-8"
   )
   @Export("write")
   public boolean write(int var1, byte[] var2, int var3) {
      CacheFile var4 = this.dataFile;
      CacheFile var5 = this.dataFile;
      synchronized(this.dataFile) {
         if (var3 >= 0 && var3 <= this.maxSize) {
            boolean var6 = this.write0(var1, var2, var3, true);
            if (!var6) {
               var6 = this.write0(var1, var2, var3, false);
            }

            return var6;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I[BIZB)Z",
      garbageValue = "-14"
   )
   @Export("write0")
   boolean write0(int param1, byte[] param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "(Lhl;B)Lhl;",
      garbageValue = "48"
   )
   static Widget method3387(Widget var0) {
      Widget var1 = var0;
      int var2 = PlayerComposition.method4514(AbstractSoundSystem.getWidgetClickMask(var0));
      Widget var3;
      if (var2 == 0) {
         var3 = null;
      } else {
         label29: {
            for(int var4 = 0; var4 < var2; ++var4) {
               var1 = OwnWorldComparator.getWidget(var1.parentId);
               if (var1 == null) {
                  var3 = null;
                  break label29;
               }
            }

            var3 = var1;
         }
      }

      Widget var5 = var3;
      if (var3 == null) {
         var5 = var0.dragParent;
      }

      return var5;
   }
}
