import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class206 extends class204 {

   @ObfuscatedName("cc")
   long field2454;
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   public class206 field2453;
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "Lgc;"
   )
   public class206 field2452;


   @ObfuscatedName("cv")
   public void method4135() {
      if(this.field2452 != null) {
         this.field2452.field2453 = this.field2453;
         this.field2453.field2452 = this.field2452;
         this.field2453 = null;
         this.field2452 = null;
      }
   }
}
