import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class248 implements Runnable {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   public static class205 field3196 = new class205();
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   public static class205 field3193 = new class205();
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 596410709
   )
   public static int field3191 = 0;
   @ObfuscatedName("b")
   public static Object field3194 = new Object();
   @ObfuscatedName("f")
   static Thread field3195;


   public void run() {
      try {
         while(true) {
            class205 var2 = field3196;
            class245 var1;
            synchronized(field3196) {
               var1 = (class245)field3196.method4113();
            }

            Object var14;
            if(var1 != null) {
               if(var1.field3163 == 0) {
                  var1.field3164.method3389((int)var1.field2449, var1.field3165, var1.field3165.length);
                  var2 = field3196;
                  synchronized(field3196) {
                     var1.method4098();
                  }
               } else if(var1.field3163 == 1) {
                  var1.field3165 = var1.field3164.method3388((int)var1.field2449);
                  var2 = field3196;
                  synchronized(field3196) {
                     field3193.method4126(var1);
                  }
               }

               var14 = field3194;
               synchronized(field3194) {
                  if(field3191 <= 1) {
                     field3191 = 0;
                     field3194.notifyAll();
                     return;
                  }

                  field3191 = 600;
               }
            } else {
               class18.method218(100L);
               var14 = field3194;
               synchronized(field3194) {
                  if(field3191 <= 1) {
                     field3191 = 0;
                     field3194.notifyAll();
                     return;
                  }

                  --field3191;
               }
            }
         }
      } catch (Exception var13) {
         class43.method786((String)null, var13);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "100"
   )
   static boolean method4734() {
      try {
         if(class65.field959 == null) {
            class65.field959 = class59.field552.method3117(new URL(class56.field521));
         } else if(class65.field959.method3131()) {
            byte[] var0 = class65.field959.method3130();
            class182 var1 = new class182(var0);
            var1.method3573();
            class65.field955 = var1.method3574();
            class143.field1914 = new class65[class65.field955];

            class65 var3;
            for(int var2 = 0; var2 < class65.field955; var3.field966 = var2++) {
               var3 = class143.field1914[var2] = new class65();
               var3.field960 = var1.method3574();
               var3.field961 = var1.method3573();
               var3.field963 = var1.method3577();
               var3.field964 = var1.method3577();
               var3.field952 = var1.method3742();
               var3.field957 = var1.method3804();
            }

            class136.method3137(class143.field1914, 0, class143.field1914.length - 1, class65.field958, class65.field969);
            class65.field959 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class65.field959 = null;
      }

      return false;
   }
}
