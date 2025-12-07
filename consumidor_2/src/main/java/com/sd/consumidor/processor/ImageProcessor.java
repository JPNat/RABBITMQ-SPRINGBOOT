package com.sd.consumidor.processor;

import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.color.ColorSpace;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

// Classe criada para processar uma imagem e transformar em
// escala de cinza


// Fonte do código adaptado:  https://www.arquivodecodigos.com.br/dicas/2149-java-como-converter-uma-imagem-colorida-em-tons-de-cinza-gray-scale-usando-colorspace-e-colorconvertop.html

public class ImageProcessor {

    public static byte[] convertToGrayscale(byte[] imageBytes) throws IOException {

        BufferedImage colorImage = ImageIO.read(new ByteArrayInputStream(imageBytes));

        if (colorImage == null) {
            throw new IOException("Erro na leitura da imagem.");
        }
        
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
        ColorConvertOp op = new ColorConvertOp(cs, null);
        
        BufferedImage grayscaleImage = op.filter(colorImage, null);
        

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        ImageIO.write(grayscaleImage, "jpg", baos); 

        return baos.toByteArray();
    }
}