package net.runelite.rs;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public class Reflection {
   private static final boolean PRINT_DEBUG_MESSAGES = true;
   private static Map classes;

   static {
      classes = new HashMap();

      Path var2;
      try {
         for(Enumeration var0 = ClassLoader.getSystemResources(""); var0.hasMoreElements(); Files.walk(var2, new FileVisitOption[0]).filter((var0) -> {
            return Files.isRegularFile(var0, new LinkOption[0]);
         }).forEach((var0) -> {
            String var1 = var0.getName(var0.getNameCount() - 1).toString().replace(".class", "");

            try {
               Class var2 = Class.forName(var1);
               ObfuscatedName var3 = (ObfuscatedName)var2.getAnnotation(ObfuscatedName.class);
               if(var3 != null) {
                  classes.put(var3.value(), var2);
               }
            } catch (ClassNotFoundException var4) {
               ;
            }

         })) {
            URL var1 = (URL)var0.nextElement();

            try {
               var2 = (new File(var1.toURI())).toPath();
            } catch (URISyntaxException var4) {
               var2 = (new File(var1.getPath())).toPath();
            }
         }
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public static Class findClass(String var0) throws ClassNotFoundException {
      Class var1 = (Class)classes.get(var0);
      if(var1 != null) {
         return var1;
      } else {
         System.out.println("Server requested dummy class " + var0);
         return Class.forName(var0);
      }
   }

   public static Field findField(Class var0, String var1) throws NoSuchFieldException {
      System.out.println("Looking for field " + var1 + " in " + var0);
      Field[] var5;
      int var4 = (var5 = var0.getDeclaredFields()).length;

      for(int var3 = 0; var3 < var4; ++var3) {
         Field var2 = var5[var3];
         ObfuscatedName var6 = (ObfuscatedName)var2.getAnnotation(ObfuscatedName.class);
         if(var6 != null && var6.value().equals(var1)) {
            return var2;
         }
      }

      System.out.println("Server requested dummy field " + var1 + " in " + var0);
      return var0.getDeclaredField(var1);
   }

   public static String getMethodName(Method var0) {
      ObfuscatedName var1 = (ObfuscatedName)var0.getAnnotation(ObfuscatedName.class);
      return var1 != null?var1.value():var0.getName();
   }

   public static Class[] getParameterTypes(Method var0) {
      ObfuscatedSignature var1 = (ObfuscatedSignature)var0.getAnnotation(ObfuscatedSignature.class);
      Class[] var2 = var0.getParameterTypes();
      if(var1 == null) {
         return var2;
      } else {
         String var3 = var1.signature();
         int var4 = var3.lastIndexOf(41);
         char var5 = var3.charAt(var4 - 1);
         Class var6;
         switch(var5) {
         case 'B':
            var6 = Byte.TYPE;
            break;
         case 'I':
            var6 = Integer.TYPE;
            break;
         case 'S':
            var6 = Short.TYPE;
            break;
         default:
            throw new IllegalStateException();
         }

         var2 = (Class[])Arrays.copyOf(var2, var2.length + 1);
         var2[var2.length - 1] = var6;
         return var2;
      }
   }

   public static int getInt(Field var0, Object var1) throws IllegalArgumentException, IllegalAccessException {
      System.out.println("Getting field " + var0);
      boolean var2 = false;
      if((var0.getModifiers() & 2) == 0) {
         var0.setAccessible(true);
         var2 = true;
      }

      int var3;
      try {
         var3 = var0.getInt(var1);
      } catch (Exception var9) {
         var9.printStackTrace();
         throw var9;
      } finally {
         if(var2) {
            var0.setAccessible(false);
         }

      }

      ObfuscatedGetter var4 = (ObfuscatedGetter)var0.getAnnotation(ObfuscatedGetter.class);
      if(var4 != null) {
         int var5 = var4.intValue();
         int var6 = modInverse(var5);
         var3 *= var6;
      }

      return var3;
   }

   public static void setInt(Field var0, Object var1, int var2) throws IllegalArgumentException, IllegalAccessException {
      System.out.println("Setting field " + var0 + " to " + var2);
      ObfuscatedGetter var3 = (ObfuscatedGetter)var0.getAnnotation(ObfuscatedGetter.class);
      if(var3 != null) {
         int var4 = var3.intValue();
         var2 *= var4;
      }

      boolean var8 = false;
      if((var0.getModifiers() & 2) == 0) {
         var0.setAccessible(true);
         var8 = true;
      }

      try {
         var0.setInt(var1, var2);
      } finally {
         if(var8) {
            var0.setAccessible(false);
         }

      }

   }

   public static BigInteger modInverse(BigInteger var0, int var1) {
      BigInteger var2 = BigInteger.ONE.shiftLeft(var1);
      return var0.modInverse(var2);
   }

   public static int modInverse(int var0) {
      return modInverse(BigInteger.valueOf((long)var0), 32).intValue();
   }

   public static Object invoke(Method var0, Object var1, Object[] var2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
      System.out.println("Invoking " + var0);

      try {
         return var0.invoke(var1, var2);
      } catch (Throwable var4) {
         var4.printStackTrace();
         throw var4;
      }
   }
}
