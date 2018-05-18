import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public enum class15 implements class188 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   field128("runelite", 0, 3, (byte)0),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   field123("runelite", 1, 2, (byte)1),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   field124("runelite", 2, 1, (byte)2),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   field125("runelite", 3, 0, (byte)3);
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1306249167
   )
   final int field126;
   @ObfuscatedName("n")
   final byte field127;


   class15(String var1, int var2, int var3, byte var4) {
      this.field126 = var3;
      this.field127 = var4;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "60"
   )
   public int vmethod5860() {
      return this.field127;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)[Ly;",
      garbageValue = "-1135514295"
   )
   static class15[] method162() {
      return new class15[]{field125, field128, field123, field124};
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1438118573"
   )
   static int method157(int var0) {
      class58 var1 = (class58)class83.field1203.method3991((long)var0);
      return var1 == null?-1:(var1.field2453 == class83.field1205.field2471?-1:((class58)var1.field2453).field546);
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      signature = "(Lhl;B)Z",
      garbageValue = "-75"
   )
   static final boolean method163(class230 var0) {
      int var1 = var0.field2711;
      if(var1 == 205) {
         client.field688 = 250;
         return true;
      } else {
         int var2;
         int var3;
         if(var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            client.field853.method4486(var2, var3 == 1);
         }

         if(var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            client.field853.method4487(var2, var3 == 1);
         }

         if(var1 == 324) {
            client.field853.method4488(false);
         }

         if(var1 == 325) {
            client.field853.method4488(true);
         }

         if(var1 == 326) {
            class172 var4 = class133.method3115(class169.field2247, client.field739.field1250);
            client.field853.method4501(var4.field2279);
            client.field739.method2019(var4);
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1833717485"
   )
   static final void method161() {
      for(int var0 = 0; var0 < class81.field1180; ++var0) {
         class60 var1 = client.field806[class81.field1181[var0]];
         var1.method1166();
      }

   }
}
