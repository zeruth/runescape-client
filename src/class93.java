import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class93 extends class108 {

   @ObfuscatedName("w")
   public int field1307;
   @ObfuscatedName("m")
   public byte[] field1305;
   @ObfuscatedName("q")
   public int field1303;
   @ObfuscatedName("b")
   int field1306;
   @ObfuscatedName("f")
   public boolean field1304;


   class93(int var1, byte[] var2, int var3, int var4) {
      this.field1307 = var1;
      this.field1305 = var2;
      this.field1303 = var3;
      this.field1306 = var4;
   }

   class93(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field1307 = var1;
      this.field1305 = var2;
      this.field1303 = var3;
      this.field1306 = var4;
      this.field1304 = var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lcx;)Lcg;"
   )
   public class93 method2158(class102 var1) {
      this.field1305 = var1.method2308(this.field1305);
      this.field1307 = var1.method2309(this.field1307);
      if(this.field1303 == this.field1306) {
         this.field1303 = this.field1306 = var1.method2306(this.field1303);
      } else {
         this.field1303 = var1.method2306(this.field1303);
         this.field1306 = var1.method2306(this.field1306);
         if(this.field1303 == this.field1306) {
            --this.field1303;
         }
      }

      return this;
   }
}
