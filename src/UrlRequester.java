import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
   @ObfuscatedName("z")
   @Export("osName")
   public static String osName;
   @ObfuscatedName("w")
   @Export("thread")
   final Thread thread = new Thread(this);
   @ObfuscatedName("m")
   @Export("isClosed")
   volatile boolean isClosed;
   @ObfuscatedName("q")
   @Export("requests")
   Queue requests = new LinkedList();

   public UrlRequester() {
      this.thread.setPriority(1);
      this.thread.start();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Ler;",
      garbageValue = "-1125383185"
   )
   @Export("request")
   public UrlRequest request(URL var1) {
      UrlRequest var2 = new UrlRequest(var1);
      synchronized(this) {
         this.requests.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-317870921"
   )
   @Export("close")
   public void close() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.thread.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1745487182"
   )
   public static int method3116() {
      return ++MouseInput.mouseIdleTicks - 1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)Lij;",
      garbageValue = "2"
   )
   @Export("getUnderlayDefinition")
   public static FloorUnderlayDefinition getUnderlayDefinition(int var0) {
      FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.underlays.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class231.underlay_ref.getConfigData(1, var0);
         var1 = new FloorUnderlayDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.post();
         FloorUnderlayDefinition.underlays.put(var1, (long)var0);
         return var1;
      }
   }
}
