import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public final class class21 {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -744989909
   )
   static int field185;
   @ObfuscatedName("m")
   final int[] field187 = new int[4096];

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Las;I)V",
      garbageValue = "1585938107"
   )
   final void method296(class32 var1) {
      for(int var2 = 0; var2 < 64; ++var2) {
         for(int var3 = 0; var3 < 64; ++var3) {
            this.field187[var2 * 64 + var3] = var1.method596(var2, var3) | -16777216;
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "0"
   )
   final int method305(int var1, int var2) {
      return this.field187[var1 * 64 + var2];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lge;I)V",
      garbageValue = "1948250856"
   )
   @Export("encodeClassVerifier")
   public static void encodeClassVerifier(PacketBuffer param0) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIB)Lhl;",
      garbageValue = "-47"
   )
   @Export("getWidgetChild")
   public static Widget getWidgetChild(int var0, int var1) {
      Widget var2 = OwnWorldComparator.getWidget(var0);
      return var1 == -1 ? var2 : (var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1983839880"
   )
   public static void method303() {
      ItemComposition.items.reset();
      ItemComposition.itemModelCache.reset();
      ItemComposition.itemSpriteCache.reset();
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "(Lbe;ZI)V",
      garbageValue = "-2028731985"
   )
   @Export("closeWidget")
   static final void closeWidget(WidgetNode var0, boolean var1) {
      int var2 = var0.id;
      int var3 = (int)var0.hash;
      var0.unlink();
      if (var1) {
         WorldMapRectangle.method190(var2);
      }

      for(IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) {
         if ((var4.hash >> 48 & 65535L) == (long)var2) {
            var4.unlink();
         }
      }

      Widget var5 = OwnWorldComparator.getWidget(var3);
      if (var5 != null) {
         DState.method3548(var5);
      }

      WorldComparator.method9();
      if (Client.widgetRoot != -1) {
         class76.method1849(Client.widgetRoot, 1);
      }

   }
}
