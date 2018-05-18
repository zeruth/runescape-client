import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class20 {

   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      signature = "Lkc;"
   )
   static class307 field170;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 304469767
   )
   int field180 = -1;
   @ObfuscatedName("m")
   String field173;
   @ObfuscatedName("q")
   String field172;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1717593601
   )
   int field171 = -1;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 649016241
   )
   int field174 = -1;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lhh;"
   )
   class226 field175 = null;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1148285323
   )
   int field176 = Integer.MAX_VALUE;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 435286975
   )
   int field177 = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -517933057
   )
   int field178 = Integer.MAX_VALUE;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 761760769
   )
   int field179 = 0;
   @ObfuscatedName("l")
   boolean field182 = false;
   @ObfuscatedName("d")
   LinkedList field181;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-1652999580"
   )
   public void method224(class182 var1, int var2) {
      this.field180 = var2;
      this.field173 = var1.method3577();
      this.field172 = var1.method3577();
      this.field175 = new class226(var1.method3573());
      this.field171 = var1.method3573();
      var1.method3742();
      this.field182 = var1.method3742() == 1;
      this.field174 = var1.method3742();
      int var3 = var1.method3742();
      this.field181 = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field181.add(this.method234(var1));
      }

      this.method230();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;I)Lan;",
      garbageValue = "1857556313"
   )
   class31 method234(class182 var1) {
      int var2 = var1.method3742();
      class15 var3 = (class15)class7.method89(class15.method162(), var2);
      Object var4 = null;
      switch(var3.field126) {
      case 0:
         var4 = new class37();
         break;
      case 1:
         var4 = new class14();
         break;
      case 2:
         var4 = new class27();
         break;
      case 3:
         var4 = new class18();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class31)var4).vmethod697(var1);
      return (class31)var4;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2127339237"
   )
   public boolean method226(int var1, int var2, int var3) {
      Iterator var4 = this.field181.iterator();

      class31 var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (class31)var4.next();
      } while(!var5.vmethod693(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "797903077"
   )
   public boolean method227(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if(var3 >= this.field176 && var3 <= this.field177) {
         if(var4 >= this.field178 && var4 <= this.field179) {
            Iterator var5 = this.field181.iterator();

            class31 var6;
            do {
               if(!var5.hasNext()) {
                  return false;
               }

               var6 = (class31)var5.next();
            } while(!var6.vmethod694(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-115293407"
   )
   public int[] method281(int var1, int var2, int var3) {
      Iterator var4 = this.field181.iterator();

      class31 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class31)var4.next();
      } while(!var5.vmethod693(var1, var2, var3));

      return var5.vmethod712(var1, var2, var3);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(III)Lhh;",
      garbageValue = "-158641779"
   )
   public class226 method229(int var1, int var2) {
      Iterator var3 = this.field181.iterator();

      class31 var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (class31)var3.next();
      } while(!var4.vmethod694(var1, var2));

      return var4.vmethod707(var1, var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-45"
   )
   void method230() {
      Iterator var1 = this.field181.iterator();

      while(var1.hasNext()) {
         class31 var2 = (class31)var1.next();
         var2.vmethod692(this);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1688444003"
   )
   public int method231() {
      return this.field180;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-246462321"
   )
   public boolean method265() {
      return this.field182;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-787896223"
   )
   public String method233() {
      return this.field173;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "0"
   )
   public String method254() {
      return this.field172;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2031090465"
   )
   int method235() {
      return this.field171;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "490850638"
   )
   public int method247() {
      return this.field174;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2121771207"
   )
   public int method223() {
      return this.field176;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-118"
   )
   public int method238() {
      return this.field177;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1514892384"
   )
   public int method292() {
      return this.field178;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1939790173"
   )
   public int method270() {
      return this.field179;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "257"
   )
   public int method241() {
      return this.field175.field2581;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "116"
   )
   public int method242() {
      return this.field175.field2587;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1576650277"
   )
   public int method243() {
      return this.field175.field2583;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(I)Lhh;",
      garbageValue = "-1803643827"
   )
   public class226 method244() {
      return new class226(this.field175);
   }

   @ObfuscatedName("m")
   static final void method293(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "-1942813104"
   )
   public static boolean method294(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if(var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }
}
