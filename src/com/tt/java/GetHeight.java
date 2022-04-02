package com.tt.java;

public int getHeight {

		private static void drawSTL(File qrFile, String filename) {
		    int height = 0;
		    int width = 0;
		    float PLATFORM_RATIO = 2.3f;
		    float PLATFORM_HEIGHT = 1.0f;
		    boolean printPlatform = false;
		    boolean printQRbottom = true;
		    STLDrawer drawer = null;//from  ww  w  . j ava 2s  .  c  om
		    float[] pofloat1 = new float[3];
		    float[] pofloat2 = new float[3];
		    float[] pofloat3 = new float[3];
		    float[] pofloat4 = new float[3];
		    Color color;
		    int count;
		    BufferedImage image = null;

		    try {
		        drawer = new STLDrawer("STLs/" + filename + ".stl");
		    } catch (FileNotFoundException e) {
		        System.out.println("ERROR: Unable to create stl file! - " + filename + ".stl");
		        e.printStackTrace();
		    }

		    try {
		        image = javax.imageio.ImageIO.read(qrFile);
		        height = image.getHeight();
		        width = image.getWidth();

		    } catch (IOException e) {
		        System.out.println("ERROR: Unable to open picture file! - " + qrFile.toString());
		        e.printStackTrace();
		    }

		    if (printPlatform) {
		        //Base background
		        pofloat1[0] = 0.0f;
		        pofloat1[1] = 0.0f;
		        pofloat1[2] = 0;

		        pofloat2[0] = 0.0f + (float) width;
		        pofloat2[1] = 0.0f + 0.0f;
		        pofloat2[2] = 0;

		        pofloat3[0] = 0.0f + (float) width;
		        pofloat3[1] = 0.0f + (float) height;
		        pofloat3[2] = 0;

		        pofloat4[0] = 0.0f + 0.0f;
		        pofloat4[1] = 0.0f + (float) height;
		        pofloat4[2] = 0;
		        drawer.drawCube(pofloat1, pofloat2, pofloat3, pofloat4, PLATFORM_HEIGHT);
		        //end base background
		    }

		    int[][] drawArray = new int[width + 2][height + 2];

		    for (int jj = 0; jj < height; jj++) {
		        for (int ii = 0; ii < width; ii++) {
		            color = new Color(image.getRGB(ii, jj));

		            if (color.equals(Color.BLACK)) {
		                drawArray[ii + 1][height - jj + 1] = 1; //PNG origin starts at top left of image, my origin is bottom left
		            }
		        }
		    }

		    count = 0;
		    for (int jj = 1; jj < height + 2; jj++) //drawTop
		    {

		        for (int ii = 1; ii < width + 2; ii++) {
		            if (drawArray[ii][jj] == 1) {
		                while ((ii + count < width + 2) && (drawArray[ii + count][jj] == 1)
		                        && (drawArray[ii + count][jj + 1] == 0)) {
		                    count++;
		                }

		                pofloat1[0] = (float) ii;
		                pofloat1[1] = (float) jj;
		                pofloat1[2] = PLATFORM_HEIGHT;

		                pofloat4[0] = (float) ii + 0.0f;
		                pofloat4[1] = (float) jj + 1.0f;
		                pofloat4[2] = PLATFORM_HEIGHT;

		                pofloat3[0] = (float) ii + count;//1.0f;
		                pofloat3[1] = (float) jj + 1.0f;
		                pofloat3[2] = PLATFORM_HEIGHT;

		                pofloat2[0] = (float) ii + 1.0f;
		                pofloat2[1] = (float) jj + 0.0f;
		                pofloat2[2] = PLATFORM_HEIGHT;

		                ii = ii + count;

		                if (count != 0) {
		                    drawer.drawTop(pofloat1, pofloat2, pofloat3, pofloat4, PLATFORM_RATIO);
		                }
		                count = 0;
		            }

		        }

		    }
		    count = 0;
		    for (int jj = 1; jj < height + 2; jj++) //bottom
		    {

		        for (int ii = 1; ii < width + 2; ii++) {
		            if (drawArray[ii][jj] == 1) {
		                while ((ii + count < width + 2) && (drawArray[ii + count][jj] == 1)
		                        && (drawArray[ii + count][jj - 1] == 0)) {
		                    count++;
		                }

		                pofloat1[0] = (float) ii;
		                pofloat1[1] = (float) jj;
		                pofloat1[2] = PLATFORM_HEIGHT;

		                pofloat4[0] = (float) ii + 0.0f;
		                pofloat4[1] = (float) jj + 1.0f;
		                pofloat4[2] = PLATFORM_HEIGHT;

		                pofloat3[0] = (float) ii + 1.0f;
		                pofloat3[1] = (float) jj + 1.0f;
		                pofloat3[2] = PLATFORM_HEIGHT;

		                pofloat2[0] = (float) ii + count;//1.0f;
		                pofloat2[1] = (float) jj + 0.0f;
		                pofloat2[2] = PLATFORM_HEIGHT;

		                if (count != 0) {
		                    drawer.drawBottom(pofloat1, pofloat2, pofloat3, pofloat4, PLATFORM_RATIO);
		                }
		                ii = ii + count;
		                count = 0;

		            }

		        }

		    }

		    for (int ii = 1; ii < width + 2; ii++) //draw right
		    {

		        for (int jj = 1; jj < height + 2; jj++) {
		            if (drawArray[ii][jj] == 1) {
		                while ((jj + count < height + 2) && (drawArray[ii][jj + count] == 1)
		                        && (drawArray[ii + 1][jj + count] == 0)) {
		                    count++;
		                }

		                pofloat1[0] = (float) ii;
		                pofloat1[1] = (float) jj;
		                pofloat1[2] = PLATFORM_HEIGHT;

		                pofloat4[0] = (float) ii + 0.0f;
		                pofloat4[1] = (float) jj + 1.0f;
		                pofloat4[2] = PLATFORM_HEIGHT;

		                pofloat3[0] = (float) ii + 1.0f;
		                pofloat3[1] = (float) jj + count;//1.0f;
		                pofloat3[2] = PLATFORM_HEIGHT;

		                pofloat2[0] = (float) ii + 1.0f;
		                pofloat2[1] = (float) jj + 0.0f;
		                pofloat2[2] = PLATFORM_HEIGHT;

		                if (count != 0) {
		                    drawer.drawRight(pofloat1, pofloat2, pofloat3, pofloat4, PLATFORM_RATIO);
		                }

		                jj = jj + count;
		                count = 0;
		            }

		        }

		    }

		    for (int ii = 1; ii < width + 2; ii++) //draw left
		    {

		        for (int jj = 1; jj < height + 2; jj++) {
		            if (drawArray[ii][jj] == 1) {
		                while ((jj + count < height + 2) && (drawArray[ii][jj + count] == 1)
		                        && (drawArray[ii - 1][jj + count] == 0)) {
		                    count++;
		                }

		                pofloat1[0] = (float) ii;
		                pofloat1[1] = (float) jj;
		                pofloat1[2] = PLATFORM_HEIGHT;

		                pofloat4[0] = (float) ii + 0.0f;
		                pofloat4[1] = (float) jj + count;//1.0f;
		                pofloat4[2] = PLATFORM_HEIGHT;

		                pofloat3[0] = (float) ii + 1.0f;
		                pofloat3[1] = (float) jj + 1.0f;
		                pofloat3[2] = PLATFORM_HEIGHT;

		                pofloat2[0] = (float) ii + 1.0f;
		                pofloat2[1] = (float) jj + 0.0f;
		                pofloat2[2] = PLATFORM_HEIGHT;

		                if (count != 0) {
		                    drawer.drawLeft(pofloat1, pofloat2, pofloat3, pofloat4, PLATFORM_RATIO);
		                }

		                jj = jj + count;
		                count = 0;
		            }

		        }

		    }

		    for (int jj = 1; jj < height + 2; jj++) //draw back
		    {

		        for (int ii = 1; ii < width + 2; ii++) {
		            if (drawArray[ii][jj] == 1) {
		                while ((ii + count < width + 2) && (drawArray[ii + count][jj] == 1)) {
		                    count++;
		                }

		                pofloat1[0] = (float) ii;
		                pofloat1[1] = (float) jj;
		                pofloat1[2] = PLATFORM_HEIGHT;

		                pofloat4[0] = (float) ii + 0.0f;
		                pofloat4[1] = (float) jj + 1.0f;
		                pofloat4[2] = PLATFORM_HEIGHT;

		                pofloat3[0] = (float) ii + count;//1.0f;
		                pofloat3[1] = (float) jj + 1.0f;
		                pofloat3[2] = PLATFORM_HEIGHT;

		                pofloat2[0] = (float) ii + count;//1.0f;
		                pofloat2[1] = (float) jj + 0.0f;
		                pofloat2[2] = PLATFORM_HEIGHT;

		                if (count != 0) {
		                    drawer.drawBack(pofloat1, pofloat2, pofloat3, pofloat4, PLATFORM_RATIO);
		                }
		                ii = ii + count;
		                count = 0;
		            }

		        }

		    }

		    if (printQRbottom) {
		        for (int jj = 1; jj < height + 2; jj++) //draw front
		        {

		            for (int ii = 1; ii < width + 2; ii++) {
		                if (drawArray[ii][jj] == 1) {
		                    while ((ii + count < width + 2) && (drawArray[ii + count][jj] == 1)) {
		                        count++;
		                    }

		                    pofloat1[0] = (float) ii;
		                    pofloat1[1] = (float) jj;
		                    pofloat1[2] = PLATFORM_HEIGHT;

		                    pofloat4[0] = (float) ii + 0.0f;
		                    pofloat4[1] = (float) jj + 1.0f;
		                    pofloat4[2] = PLATFORM_HEIGHT;

		                    pofloat3[0] = (float) ii + count;//1.0f;
		                    pofloat3[1] = (float) jj + 1.0f;
		                    pofloat3[2] = PLATFORM_HEIGHT;

		                    pofloat2[0] = (float) ii + count;//1.0f;
		                    pofloat2[1] = (float) jj + 0.0f;
		                    pofloat2[2] = PLATFORM_HEIGHT;

		                    if (count != 0) {
		                        drawer.drawFront(pofloat1, pofloat2, pofloat3, pofloat4, PLATFORM_RATIO);
		                    }
		                    ii = ii + count;
		                    count = 0;
		                }

		            }

		        }
		    }

		    drawer.resizeNumTriangles();

		    System.out.println("STL drawn: " + filename + ".stl");
		    drawer.closeFile();

		}
	}


