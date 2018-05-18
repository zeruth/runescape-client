import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public abstract class class285 {

   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1304434647
   )
   final int field3642;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1391335809
   )
   int field3639 = 0;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "[Ljn;"
   )
   class282[] field3638;
   @ObfuscatedName("h")
   HashMap field3641;
   @ObfuscatedName("x")
   HashMap field3640;
   @ObfuscatedName("j")
   Comparator field3643 = null;


   class285(int var1) {
      this.field3642 = var1;
      this.field3638 = this.vmethod5492(var1);
      this.field3641 = new HashMap(var1 / 8);
      this.field3640 = new HashMap(var1 / 8);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Ljn;",
      garbageValue = "-39"
   )
   abstract class282 vmethod5491();

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)[Ljn;",
      garbageValue = "-1283030275"
   )
   abstract class282[] vmethod5492(int var1);

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "34"
   )
   public void method5340() {
      this.field3639 = 0;
      Arrays.fill(this.field3638, (Object)null);
      this.field3641.clear();
      this.field3640.clear();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-163166883"
   )
   public int method5341() {
      return this.field3639;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-512164530"
   )
   public boolean method5342() {
      return this.field3642 == this.field3639;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "1132934568"
   )
   public boolean method5343(class291 var1) {
      return !var1.method5463()?false:(this.field3641.containsKey(var1)?true:this.field3640.containsKey(var1));
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljn;",
      garbageValue = "-541687086"
   )
   public class282 method5344(class291 var1) {
      class282 var2 = this.method5374(var1);
      return var2 != null?var2:this.method5346(var1);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljn;",
      garbageValue = "1140436781"
   )
   class282 method5374(class291 var1) {
      return !var1.method5463()?null:(class282)this.field3641.get(var1);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lkm;B)Ljn;",
      garbageValue = "127"
   )
   class282 method5346(class291 var1) {
      return !var1.method5463()?null:(class282)this.field3640.get(var1);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lkm;S)Z",
      garbageValue = "-129"
   )
   public final boolean method5397(class291 var1) {
      class282 var2 = this.method5374(var1);
      if(var2 == null) {
         return false;
      } else {
         this.method5362(var2);
         return true;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljn;I)V",
      garbageValue = "-581957899"
   )
   final void method5362(class282 var1) {
      int var2 = this.method5347(var1);
      if(var2 != -1) {
         this.method5415(var2);
         this.method5355(var1);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Ljn;",
      garbageValue = "783801932"
   )
   class282 method5349(class291 var1) {
      return this.method5373(var1, (class291)null);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lkm;Lkm;B)Ljn;",
      garbageValue = "-36"
   )
   class282 method5373(class291 var1, class291 var2) {
      if(this.method5374(var1) != null) {
         throw new IllegalStateException();
      } else {
         class282 var3 = this.vmethod5491();
         var3.method5316(var1, var2);
         this.method5356(var3);
         this.method5379(var3);
         return var3;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(II)Ljn;",
      garbageValue = "-873213050"
   )
   public final class282 method5351(int var1) {
      if(var1 >= 0 && var1 < this.field3639) {
         return this.field3638[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "109"
   )
   public final void method5383() {
      if(this.field3643 == null) {
         Arrays.sort(this.field3638, 0, this.field3639);
      } else {
         Arrays.sort(this.field3638, 0, this.field3639, this.field3643);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Ljn;Lkm;Lkm;B)V",
      garbageValue = "-124"
   )
   final void method5339(class282 var1, class291 var2, class291 var3) {
      this.method5355(var1);
      var1.method5316(var2, var3);
      this.method5379(var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ljn;I)I",
      garbageValue = "-108845866"
   )
   final int method5347(class282 var1) {
      for(int var2 = 0; var2 < this.field3639; ++var2) {
         if(this.field3638[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(Ljn;B)V",
      garbageValue = "125"
   )
   final void method5355(class282 var1) {
      if(this.field3641.remove(var1.field3630) == null) {
         throw new IllegalStateException();
      } else {
         if(var1.field3629 != null) {
            this.field3640.remove(var1.field3629);
         }

      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljn;I)V",
      garbageValue = "1626391782"
   )
   final void method5356(class282 var1) {
      this.field3638[++this.field3639 - 1] = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljn;B)V",
      garbageValue = "-14"
   )
   final void method5379(class282 var1) {
      this.field3641.put(var1.field3630, var1);
      if(var1.field3629 != null) {
         class282 var2 = (class282)this.field3640.put(var1.field3629, var1);
         if(var2 != null && var2 != var1) {
            var2.field3629 = null;
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "16"
   )
   final void method5415(int var1) {
      --this.field3639;
      if(var1 < this.field3639) {
         System.arraycopy(this.field3638, var1 + 1, this.field3638, var1, this.field3639 - var1);
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "935713082"
   )
   public final void method5361() {
      this.field3643 = null;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;B)V",
      garbageValue = "-1"
   )
   public final void method5381(Comparator var1) {
      if(this.field3643 == null) {
         this.field3643 = var1;
      } else if(this.field3643 instanceof class283) {
         ((class283)this.field3643).method5319(var1);
      }

   }
}
