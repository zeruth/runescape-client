import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class172 extends class204 {

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Lfe;"
   )
   static class172[] field2281 = new class172[300];
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1988723367
   )
   static int field2277 = 0;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   class169 field2282;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -354778165
   )
   int field2278;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lge;"
   )
   public class189 field2279;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -499035007
   )
   public int field2280;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   public void method3479() {
      if(field2277 < field2281.length) {
         field2281[++field2277 - 1] = this;
      }
   }
}
