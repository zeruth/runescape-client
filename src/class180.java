import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class180 extends class186 {

   @ObfuscatedName("w")
   ByteBuffer field2319;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "114"
   )
   byte[] vmethod3833() {
      byte[] var1 = new byte[this.field2319.capacity()];
      this.field2319.position(0);
      this.field2319.get(var1);
      return var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "-321653700"
   )
   void vmethod3838(byte[] var1) {
      this.field2319 = ByteBuffer.allocateDirect(var1.length);
      this.field2319.position(0);
      this.field2319.put(var1);
   }
}
