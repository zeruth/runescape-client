import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class139 extends class283 {

   @ObfuscatedName("f")
   static byte[][][] field1895;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = 1380868771
   )
   static int field1897;
   @ObfuscatedName("w")
   final boolean field1896;


   public class139(boolean var1) {
      this.field1896 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkd;Lkd;I)I",
      garbageValue = "-573424448"
   )
   int method3164(class287 var1, class287 var2) {
      if(client.field676 == var1.field3648) {
         if(var2.field3648 != client.field676) {
            return this.field1896?-1:1;
         }
      } else if(var2.field3648 == client.field676) {
         return this.field1896?1:-1;
      }

      return this.method5320(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3164((class287)var1, (class287)var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1705301378"
   )
   public static boolean method3167(int var0) {
      return var0 == class233.field2778.field2779;
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "814507959"
   )
   public static boolean method3161() {
      return client.field729 >= 2;
   }
}
