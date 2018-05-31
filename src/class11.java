import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class11 {
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = 671000199
   )
   static int field82;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2110796291"
   )
   @Export("ilog")
   public static int ilog(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "255"
   )
   static final void method112(String var0) {
      CollisionData.method3448("Please remove " + var0 + " from your ignore list first");
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1807417821"
   )
   static final void method115(String var0) {
      CollisionData.method3448(var0 + " is already on your ignore list");
   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "(Lbs;II)V",
      garbageValue = "1179021925"
   )
   @Export("characterToScreen")
   static final void characterToScreen(Actor var0, int var1) {
      KeyFocusListener.worldToScreen(var0.x, var0.y, var1);
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(Lhl;II)I",
      garbageValue = "595775225"
   )
   static final int method114(Widget param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      signature = "(Lhl;I)Ljava/lang/String;",
      garbageValue = "885848022"
   )
   static String method111(Widget var0) {
      int var1 = AbstractSoundSystem.getWidgetClickMask(var0);
      int var2 = var1 >> 11 & 63;
      return var2 == 0 ? null : (var0.targetVerb != null && var0.targetVerb.trim().length() != 0 ? var0.targetVerb : null);
   }
}
