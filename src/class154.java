import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class154 implements Runnable {

   @ObfuscatedName("w")
   public static String field1972;
   @ObfuscatedName("m")
   public static String field1971;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -717725833
   )
   static int field1980;
   @ObfuscatedName("gd")
   @ObfuscatedGetter(
      intValue = 1240744529
   )
   static int field1979;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   class153 field1973 = null;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   class153 field1974 = null;
   @ObfuscatedName("f")
   Thread field1975;
   @ObfuscatedName("n")
   boolean field1976 = false;


   public class154() {
      field1972 = "Unknown";
      field1971 = "1.6";

      try {
         field1972 = System.getProperty("java.vendor");
         field1971 = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.field1976 = false;
      this.field1975 = new Thread(this);
      this.field1975.setPriority(10);
      this.field1975.setDaemon(true);
      this.field1975.start();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1910531284"
   )
   public final void method3241() {
      synchronized(this) {
         this.field1976 = true;
         this.notifyAll();
      }

      try {
         this.field1975.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIILjava/lang/Object;B)Led;",
      garbageValue = "107"
   )
   final class153 method3243(int var1, int var2, int var3, Object var4) {
      class153 var5 = new class153();
      var5.field1967 = var1;
      var5.field1962 = var2;
      var5.field1969 = var4;
      synchronized(this) {
         if(this.field1974 != null) {
            this.field1974.field1965 = var5;
            this.field1974 = var5;
         } else {
            this.field1974 = this.field1973 = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;II)Led;",
      garbageValue = "-1394371433"
   )
   public final class153 method3245(String var1, int var2) {
      return this.method3243(1, var2, 0, var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Runnable;IB)Led;",
      garbageValue = "1"
   )
   public final class153 method3252(Runnable var1, int var2) {
      return this.method3243(2, var2, 0, var1);
   }

   public final void run() {
      while(true) {
         class153 var1;
         synchronized(this) {
            while(true) {
               if(this.field1976) {
                  return;
               }

               if(this.field1973 != null) {
                  var1 = this.field1973;
                  this.field1973 = this.field1973.field1965;
                  if(this.field1973 == null) {
                     this.field1974 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
                  ;
               }
            }
         }

         try {
            int var5 = var1.field1967;
            if(var5 == 1) {
               var1.field1970 = new Socket(InetAddress.getByName((String)var1.field1969), var1.field1962);
            } else if(var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.field1969);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field1962);
               var1.field1970 = var3;
            } else if(var5 == 4) {
               var1.field1970 = new DataInputStream(((URL)var1.field1969).openStream());
            }

            var1.field1966 = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.field1966 = 2;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "214742600"
   )
   static void method3259(int var0, String var1, String var2, String var3) {
      class86 var4 = (class86)class83.field1204.get(Integer.valueOf(var0));
      if(var4 == null) {
         var4 = new class86();
         class83.field1204.put(Integer.valueOf(var0), var4);
      }

      class58 var5 = var4.method2010(var0, var1, var2, var3);
      class83.field1203.method3992(var5, (long)var5.field546);
      class83.field1205.method4183(var5);
      client.field633 = client.field775;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lic;II)V",
      garbageValue = "-95084124"
   )
   static void method3242(class249 var0, int var1) {
      if(class325.field3924 != null) {
         class325.field3924.field2359 = var1 * 8 + 5;
         int var2 = class325.field3924.method3573();
         int var3 = class325.field3924.method3573();
         var0.method4736(var2, var3);
      } else {
         class37.method699((class249)null, 255, 255, 0, (byte)0, true);
         class250.field3224[var1] = var0;
      }
   }
}
