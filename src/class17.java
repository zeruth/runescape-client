import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public final class class17 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -987673901
   )
   int field147;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 41622299
   )
   int field144;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 924219265
   )
   int field143;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2003119817
   )
   int field145;
   @ObfuscatedSignature(
      signature = "Lay;"
   )
   // $FF: synthetic field
   final class30 this$0;


   @ObfuscatedSignature(
      signature = "(Lay;)V"
   )
   class17(class30 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1965753337"
   )
   public static void method190(int var0) {
      if(var0 != -1) {
         if(class80.field1173[var0]) {
            class130.field1824.method4659(var0);
            if(class230.field2615[var0] != null) {
               boolean var1 = true;

               for(int var2 = 0; var2 < class230.field2615[var0].length; ++var2) {
                  if(class230.field2615[var0][var2] != null) {
                     if(class230.field2615[var0][var2].field2625 != 2) {
                        class230.field2615[var0][var2] = null;
                     } else {
                        var1 = false;
                     }
                  }
               }

               if(var1) {
                  class230.field2615[var0] = null;
               }

               class80.field1173[var0] = false;
            }
         }
      }
   }
}
