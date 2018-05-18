import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class224 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1466502535
   )
   public final int field2570;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -889955413
   )
   public final int field2575;
   @ObfuscatedName("q")
   public final int[] field2572;
   @ObfuscatedName("b")
   public final int[] field2573;


   class224(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2570 = var1;
      this.field2575 = var2;
      this.field2572 = var3;
      this.field2573 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1611464927"
   )
   public boolean method4459(int var1, int var2) {
      if(var2 >= 0 && var2 < this.field2573.length) {
         int var3 = this.field2573[var2];
         if(var1 >= var3 && var1 <= var3 + this.field2572[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;II)I",
      garbageValue = "-385243999"
   )
   public static int method4460(CharSequence var0, int var1) {
      return class1.method13(var0, var1, true);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/io/File;",
      garbageValue = "0"
   )
   public static File method4458(String var0) {
      if(!class158.field2001) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)class158.field2002.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(class158.field2000, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  class158.field2002.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if(var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Llh;",
      garbageValue = "44372009"
   )
   static class317 method4461() {
      class317 var0 = new class317();
      var0.field3790 = class319.field3805;
      var0.field3791 = class275.field3574;
      var0.field3784 = class319.field3808[0];
      var0.field3789 = class319.field3807[0];
      var0.field3786 = class192.field2413[0];
      var0.field3787 = class319.field3804[0];
      var0.field3788 = class319.field3806;
      var0.field3785 = class294.field3678[0];
      class319.field3808 = null;
      class319.field3807 = null;
      class192.field2413 = null;
      class319.field3804 = null;
      class319.field3806 = null;
      class294.field3678 = null;
      return var0;
   }
}
