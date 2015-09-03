
Este es un ejemplo para poner la cámara en cualquier parte de la escena.

Si se corre el programa poniendo la cámara así:
(Clase DibujarCasita, línea 139)

        UVNMatrix m3 = new UVNMatrix(
                new Vector4(200, 100, -200),    // camera position
                new Vector4(0, 0, -350),        // look-at 
                new Vector4(0, 1, 0)            // up vector
        );
        dc.po.transformObject(m3);

La casita se verá como en la imagen1.PNG (con el techo hacia arriba)

Si se corre el programa poniendo la cámara así:

        UVNMatrix m3 = new UVNMatrix(
                new Vector4(200, 100, -200),    // camera position
                new Vector4(0, 0, -350),        // look-at 
                new Vector4(0, 1, 0)            // up vector
        );
        dc.po.transformObject(m3);

La casita se verá como en la imagen2.PNG (con el techo hacia la izquierda)

Usted debe insertar los valores adecuados en la matriz UVN
donde indican los comentarios “”