import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class44 extends class95 {

   @ObfuscatedName("w")
   AudioFormat field363;
   @ObfuscatedName("m")
   SourceDataLine field364;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 316529917
   )
   int field365;
   @ObfuscatedName("b")
   byte[] field366;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2011832996"
   )
   protected void vmethod2190() {
      this.field363 = new AudioFormat((float)class95.field1330, 16, class95.field1321?2:1, true, false);
      this.field366 = new byte[256 << (class95.field1321?2:1)];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "4"
   )
   protected void vmethod2200(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.field363, var1 << (class95.field1321?2:1));
         this.field364 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field364.open();
         this.field364.start();
         this.field365 = var1;
      } catch (LineUnavailableException var3) {
         if(class118.method2717(var1) != 1) {
            this.vmethod2200(class81.method1922(var1));
         } else {
            this.field364 = null;
            throw var3;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1202910483"
   )
   protected int vmethod2201() {
      return this.field365 - (this.field364.available() >> (class95.field1321?2:1));
   }

   @ObfuscatedName("x")
   protected void vmethod2202() {
      int var1 = 256;
      if(class95.field1321) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field1327[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field366[var2 * 2] = (byte)(var3 >> 8);
         this.field366[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field364.write(this.field366, 0, var1 << 1);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "82"
   )
   protected void vmethod2203() {
      if(this.field364 != null) {
         this.field364.close();
         this.field364 = null;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2019010178"
   )
   protected void vmethod2204() {
      this.field364.flush();
   }
}
