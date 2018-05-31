import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("IndexStoreActionHandler")
public class IndexStoreActionHandler implements Runnable {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   @Export("IndexStoreActionHandler_requestQueue")
   public static Deque IndexStoreActionHandler_requestQueue;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   @Export("IndexStoreActionHandler_responseQueue")
   public static Deque IndexStoreActionHandler_responseQueue;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 596410709
   )
   public static int field3191;
   @ObfuscatedName("b")
   @Export("IndexStoreActionHandler_lock")
   public static Object IndexStoreActionHandler_lock;
   @ObfuscatedName("f")
   @Export("IndexStoreActionHandler_thread")
   static Thread IndexStoreActionHandler_thread;

   static {
      IndexStoreActionHandler_requestQueue = new Deque();
      IndexStoreActionHandler_responseQueue = new Deque();
      field3191 = 0;
      IndexStoreActionHandler_lock = new Object();
   }

   public void run() {
      try {
         while(true) {
            Deque var1 = IndexStoreActionHandler_requestQueue;
            Deque var3 = IndexStoreActionHandler_requestQueue;
            FileSystem var2;
            synchronized(IndexStoreActionHandler_requestQueue) {
               var2 = (FileSystem)IndexStoreActionHandler_requestQueue.getFront();
            }

            Object var4;
            Object var11;
            if(var2 != null) {
               Deque var12;
               if(var2.type == 0) {
                  var2.index.write((int)var2.hash, var2.field3165, var2.field3165.length);
                  var1 = IndexStoreActionHandler_requestQueue;
                  var12 = IndexStoreActionHandler_requestQueue;
                  synchronized(IndexStoreActionHandler_requestQueue) {
                     var2.unlink();
                  }
               } else if(var2.type == 1) {
                  var2.field3165 = var2.index.read((int)var2.hash);
                  var1 = IndexStoreActionHandler_requestQueue;
                  var12 = IndexStoreActionHandler_requestQueue;
                  synchronized(IndexStoreActionHandler_requestQueue) {
                     IndexStoreActionHandler_responseQueue.addFront(var2);
                  }
               }

               var11 = IndexStoreActionHandler_lock;
               var4 = IndexStoreActionHandler_lock;
               synchronized(IndexStoreActionHandler_lock) {
                  if(field3191 <= 1) {
                     field3191 = 0;
                     IndexStoreActionHandler_lock.notifyAll();
                     return;
                  }

                  field3191 = 600;
               }
            } else {
               WorldMapType1.method218(100L);
               var11 = IndexStoreActionHandler_lock;
               var4 = IndexStoreActionHandler_lock;
               synchronized(IndexStoreActionHandler_lock) {
                  if(field3191 <= 1) {
                     field3191 = 0;
                     IndexStoreActionHandler_lock.notifyAll();
                     return;
                  }

                  --field3191;
               }
            }
         }
      } catch (Exception var10) {
         class43.processClientError((String)null, var10);
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "100"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if(World.listFetcher == null) {
            World.listFetcher = class59.urlRequester.request(new URL(ScriptEvent.field521));
         } else if(World.listFetcher.isDone()) {
            byte[] var0 = World.listFetcher.getResponse();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            World.worldCount = var1.readUnsignedShort();
            class143.worldList = new World[World.worldCount];

            World var2;
            for(int var3 = 0; var3 < World.worldCount; var2.index = var3++) {
               var2 = class143.worldList[var3] = new World();
               var2.id = var1.readUnsignedShort();
               var2.mask = var1.readInt();
               var2.address = var1.readString();
               var2.activity = var1.readString();
               var2.location = var1.readUnsignedByte();
               var2.playerCount = var1.readShort();
            }

            UrlRequest.method3137(class143.worldList, 0, class143.worldList.length - 1, World.field958, World.field969);
            World.listFetcher = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         World.listFetcher = null;
      }

      return false;
   }
}
