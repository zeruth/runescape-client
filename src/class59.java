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
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = NPCComposition.NpcDefinition_indexCache.getConfigData(9, var0);
         var1 = new NPCComposition();
         var1.id = var0;
         if (var2 != null) {
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
         if (var0.field1006 != null) {
            class141.field1906.method2050(var0.field1006);
            var0.field1006 = null;
         }

         if (var0.field1010 != null) {
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
         if (var2 > 32767) {
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
      if (var3) {
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
      // $FF: Couldn't be decompiled
   }
}
