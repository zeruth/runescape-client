import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class175 {

   @ObfuscatedName("w")
   Inflater field2302;


   public class175() {
      this(-1, 1000000, 1000000);
   }

   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1000000"
   )
   class175(int var1, int var2, int var3) {}

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;[BI)V",
      garbageValue = "1499837314"
   )
   public void method3499(class182 var1, byte[] var2) {
      if(var1.field2365[var1.field2359] == 31 && var1.field2365[var1.field2359 + 1] == -117) {
         if(this.field2302 == null) {
            this.field2302 = new Inflater(true);
         }

         try {
            this.field2302.setInput(var1.field2365, var1.field2359 + 10, var1.field2365.length - (var1.field2359 + 8 + 10));
            this.field2302.inflate(var2);
         } catch (Exception var4) {
            this.field2302.reset();
            throw new RuntimeException("");
         }

         this.field2302.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "1"
   )
   static final byte[] method3501(byte[] var0) {
      class182 var1 = new class182(var0);
      int var2 = var1.method3742();
      int var3 = var1.method3573();
      if(var3 >= 0 && (class247.field3179 == 0 || var3 <= class247.field3179)) {
         if(var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3580(var4, 0, var3);
            return var4;
         } else {
            int var6 = var1.method3573();
            if(var6 >= 0 && (class247.field3179 == 0 || var6 <= class247.field3179)) {
               byte[] var5 = new byte[var6];
               if(var2 == 1) {
                  class176.method3503(var5, var6, var0, var3, 9);
               } else {
                  class247.field3185.method3499(var1, var5);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }
}
