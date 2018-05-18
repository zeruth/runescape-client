import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public abstract class class105 extends class204 {

   @ObfuscatedName("w")
   volatile boolean field1409 = true;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Ldu;"
   )
   class105 field1407;
   @ObfuscatedName("e")
   int field1406;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   class108 field1408;


   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "()Ldu;"
   )
   protected abstract class105 vmethod4421();

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Ldu;"
   )
   protected abstract class105 vmethod4422();

   @ObfuscatedName("d")
   protected abstract int vmethod4423();

   @ObfuscatedName("s")
   protected abstract void vmethod4424(int[] var1, int var2, int var3);

   @ObfuscatedName("g")
   protected abstract void vmethod4425(int var1);

   @ObfuscatedName("ak")
   int vmethod2484() {
      return 255;
   }

   @ObfuscatedName("ff")
   final void method2488(int[] var1, int var2, int var3) {
      if(this.field1409) {
         this.vmethod4424(var1, var2, var3);
      } else {
         this.vmethod4425(var3);
      }

   }
}
