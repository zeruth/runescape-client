import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("z")
public final class class21 {

   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -744989909
   )
   static int field185;
   @ObfuscatedName("m")
   final int[] field187 = new int[4096];


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Las;I)V",
      garbageValue = "1585938107"
   )
   final void method296(class32 var1) {
      for(int var2 = 0; var2 < 64; ++var2) {
         for(int var3 = 0; var3 < 64; ++var3) {
            this.field187[var2 * 64 + var3] = var1.method596(var2, var3) | -16777216;
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "0"
   )
   final int method305(int var1, int var2) {
      return this.field187[var1 * 64 + var2];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lge;I)V",
      garbageValue = "1948250856"
   )
   public static void method306(class189 var0) {
      class312 var1 = (class312)class313.field3762.method4072();
      if(var1 != null) {
         int var2 = var0.field2359;
         var0.method3555(var1.field3758);

         for(int var3 = 0; var3 < var1.field3755; ++var3) {
            if(var1.field3759[var3] != 0) {
               var0.method3552(var1.field3759[var3]);
            } else {
               try {
                  int var4 = var1.field3756[var3];
                  Field var5;
                  int var6;
                  if(var4 == 0) {
                     var5 = var1.field3754[var3];
                     var6 = Reflection.getInt(var5, (Object)null);
                     var0.method3552(0);
                     var0.method3555(var6);
                  } else if(var4 == 1) {
                     var5 = var1.field3754[var3];
                     Reflection.setInt(var5, (Object)null, var1.field3757[var3]);
                     var0.method3552(0);
                  } else if(var4 == 2) {
                     var5 = var1.field3754[var3];
                     var6 = var5.getModifiers();
                     var0.method3552(0);
                     var0.method3555(var6);
                  }

                  Method var25;
                  if(var4 == 3) {
                     var25 = var1.field3760[var3];
                     byte[][] var10 = var1.field3761[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = Reflection.invoke(var25, (Object)null, var7);
                     if(var11 == null) {
                        var0.method3552(0);
                     } else if(var11 instanceof Number) {
                        var0.method3552(1);
                        var0.method3557(((Number)var11).longValue());
                     } else if(var11 instanceof String) {
                        var0.method3552(2);
                        var0.method3549((String)var11);
                     } else {
                        var0.method3552(4);
                     }
                  } else if(var4 == 4) {
                     var25 = var1.field3760[var3];
                     var6 = var25.getModifiers();
                     var0.method3552(0);
                     var0.method3555(var6);
                  }
               } catch (ClassNotFoundException var13) {
                  var0.method3552(-10);
               } catch (InvalidClassException var14) {
                  var0.method3552(-11);
               } catch (StreamCorruptedException var15) {
                  var0.method3552(-12);
               } catch (OptionalDataException var16) {
                  var0.method3552(-13);
               } catch (IllegalAccessException var17) {
                  var0.method3552(-14);
               } catch (IllegalArgumentException var18) {
                  var0.method3552(-15);
               } catch (InvocationTargetException var19) {
                  var0.method3552(-16);
               } catch (SecurityException var20) {
                  var0.method3552(-17);
               } catch (IOException var21) {
                  var0.method3552(-18);
               } catch (NullPointerException var22) {
                  var0.method3552(-19);
               } catch (Exception var23) {
                  var0.method3552(-20);
               } catch (Throwable var24) {
                  var0.method3552(-21);
               }
            }
         }

         var0.method3593(var2);
         var1.method4098();
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIB)Lhl;",
      garbageValue = "-47"
   )
   public static class230 method304(int var0, int var1) {
      class230 var2 = class61.method1188(var0);
      return var1 == -1?var2:(var2 != null && var2.field2626 != null && var1 < var2.field2626.length?var2.field2626[var1]:null);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1983839880"
   )
   public static void method303() {
      class269.field3444.method4024();
      class269.field3445.method4024();
      class269.field3459.method4024();
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "(Lbe;ZI)V",
      garbageValue = "-2028731985"
   )
   static final void method300(class55 var0, boolean var1) {
      int var2 = var0.field506;
      int var3 = (int)var0.field2449;
      var0.method4098();
      if(var1) {
         class17.method190(var2);
      }

      for(class211 var4 = (class211)client.field816.method4055(); var4 != null; var4 = (class211)client.field816.method4056()) {
         if((var4.field2449 >> 48 & 65535L) == (long)var2) {
            var4.method4098();
         }
      }

      class230 var5 = class61.method1188(var3);
      if(var5 != null) {
         class181.method3548(var5);
      }

      class0.method9();
      if(client.field752 != -1) {
         class76.method1849(client.field752, 1);
      }

   }
}
