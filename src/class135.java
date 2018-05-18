import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class135 implements Runnable {

   @ObfuscatedName("z")
   public static String field1875;
   @ObfuscatedName("w")
   final Thread field1876 = new Thread(this);
   @ObfuscatedName("m")
   volatile boolean field1879;
   @ObfuscatedName("q")
   Queue field1877 = new LinkedList();


   public class135() {
      this.field1876.setPriority(1);
      this.field1876.start();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Ler;",
      garbageValue = "-1125383185"
   )
   public class136 method3117(URL var1) {
      class136 var2 = new class136(var1);
      synchronized(this) {
         this.field1877.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-317870921"
   )
   public void method3120() {
      this.field1879 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1876.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public void run() {
      while(!this.field1879) {
         try {
            class136 var1;
            synchronized(this) {
               var1 = (class136)this.field1877.poll();
               if(var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field1886.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if(var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field1883 = var5;
               }

               var1.field1882 = true;
            } catch (IOException var14) {
               var1.field1882 = true;
            } finally {
               if(var2 != null) {
                  var2.close();
               }

               if(var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            class43.method786((String)null, var17);
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1745487182"
   )
   public static int method3116() {
      return ++class48.field426 - 1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)Lij;",
      garbageValue = "2"
   )
   public static class259 method3127(int var0) {
      class259 var1 = (class259)class259.field3302.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class231.field2759.method4626(1, var0);
         var1 = new class259();
         if(var2 != null) {
            var1.method4880(new class182(var2), var0);
         }

         var1.method4894();
         class259.field3302.method4028(var1, (long)var0);
         return var1;
      }
   }
}
