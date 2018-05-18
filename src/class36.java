import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class36 {

   @ObfuscatedName("h")
   public static short[] field313;
   @ObfuscatedName("s")
   static int[] field311;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -903251761
   )
   public int field312;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lhh;"
   )
   public class226 field308;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lhh;"
   )
   public class226 field309;


   @ObfuscatedSignature(
      signature = "(ILhh;Lhh;)V"
   )
   public class36(int var1, class226 var2, class226 var3) {
      this.field312 = var1;
      this.field308 = var2;
      this.field309 = var3;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-1097194852"
   )
   static String method687(int var0) {
      return "<img=" + var0 + ">";
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "124"
   )
   public static int method690(int var0, int var1) {
      int var2;
      for(var2 = 0; var1 > 0; --var1) {
         var2 = var2 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liv;Ljava/lang/String;Ljava/lang/String;I)[Llc;",
      garbageValue = "-773021704"
   )
   public static class318[] method689(class247 var0, String var1, String var2) {
      int var3 = var0.method4644(var1);
      int var4 = var0.method4693(var3, var2);
      return class69.method1804(var0, var3, var4);
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1707847485"
   )
   static final void method688() {
      for(class62 var0 = (class62)client.field721.method4113(); var0 != null; var0 = (class62)client.field721.method4104()) {
         if(var0.field877 == -1) {
            var0.field867 = 0;
            class7.method85(var0);
         } else {
            var0.method4098();
         }
      }

   }
}
