import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class173 {

   @ObfuscatedName("ms")
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   static class156 field2289;
   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      signature = "Lm;"
   )
   static class1 field2291;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 3382529256651238907L
   )
   static long field2288;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   static class36 field2293;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1532704803"
   )
   static void method3490() {
      class50.field446 = 99;
      class50.field450 = new byte[4][104][104];
      class139.field1895 = new byte[4][104][104];
      class72.field1055 = new byte[4][104][104];
      class50.field448 = new byte[4][104][104];
      class57.field534 = new int[4][105][105];
      class50.field449 = new byte[4][105][105];
      class19.field162 = new int[105][105];
      class50.field460 = new int[104];
      class12.field97 = new int[104];
      class50.field451 = new int[104];
      class36.field311 = new int[104];
      class50.field452 = new int[104];
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "(Ljh;IIII)V",
      garbageValue = "390326939"
   )
   static void method3491(class273 var0, int var1, int var2, int var3) {
      if(client.field598 < 50 && client.field827 != 0) {
         if(var0.field3556 != null && var1 < var0.field3556.length) {
            int var4 = var0.field3556[var1];
            if(var4 != 0) {
               int var5 = var4 >> 8;
               int var6 = var4 >> 4 & 7;
               int var7 = var4 & 15;
               client.field829[client.field598] = var5;
               client.field695[client.field598] = var6;
               client.field831[client.field598] = 0;
               client.field762[client.field598] = null;
               int var8 = (var2 - 64) / 128;
               int var9 = (var3 - 64) / 128;
               client.field832[client.field598] = var7 + (var9 << 8) + (var8 << 16);
               ++client.field598;
            }
         }
      }
   }
}
