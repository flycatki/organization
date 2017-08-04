package com.batman.common.util;

import java.io.*;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class JarUtil {

    public static synchronized void decompress(String fileName, String outputPath) {
        if (!outputPath.endsWith(File.separator)) {
            outputPath += File.separator;
        }

        File dir = new File(outputPath);
        if (!dir.exists()) {
            dir.mkdir();
        }

        JarFile jf = null;
        try {
            jf = new JarFile(fileName);
            for (Enumeration<JarEntry> e = jf.entries(); e.hasMoreElements(); ) {
                JarEntry je = e.nextElement();
                String outFileName = outputPath + je.getName();
                File f = new File(outFileName);
                if (je.isDirectory()) {
                    if (!f.exists()) {
                        f.mkdir();
                    }
                } else {
                    File pf = f.getParentFile();
                    if (!pf.exists()) {
                        pf.mkdir();
                    }
                    InputStream in = jf.getInputStream(je);
                    OutputStream out = new BufferedOutputStream(new FileOutputStream(f));
                    byte[] buffer = new byte[2048];
                    int nBytes;
                    while((nBytes = in.read(buffer)) > 0) {
                        out.write(buffer, 0, nBytes);
                    }
                    out.flush();
                    out.close();
                    in.close();
                    }
                }
        } catch (Exception e) {
            System.out.println("解压" + fileName + "出错！" + e.getMessage());
        } finally {
            if (jf != null) {
                try {
                    jf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
