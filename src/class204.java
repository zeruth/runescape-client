import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class204 {

   @ObfuscatedName("cb")
   public long field2449;
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   public class204 field2447;
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      signature = "Lgl;"
   )
   class204 field2448;


   @ObfuscatedName("kc")
   public void method4098() {
      if(this.field2448 != null) {
         this.field2448.field2447 = this.field2447;
         this.field2447.field2448 = this.field2448;
         this.field2447 = null;
         this.field2448 = null;
      }
   }

   @ObfuscatedName("kz")
   public boolean method4099() {
      return this.field2448 != null;
   }
}
