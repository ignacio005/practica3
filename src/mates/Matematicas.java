/*
Copyright [2024] [Ignacio Tirado Meza]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package mates;

import java.util.stream.DoubleStream;
/**
 * Esta clase gestiona las operaciones matemáticas necesarias.
 */
public class Matematicas {
    static int r = 1;

    /**
     * El método comprueba que puntos están dentro del círculo y calcula la aproximación de pi, mediante expresiones lambda.
     * @param pasos es el total de puntos.
     * @return devuelve la aproximación del número pi.
     */
    public static double generarNumeroPiIterativo(long pasos){
        double dentro = DoubleStream.generate(() -> -r + Math.random() * 2 * r).limit(pasos).filter(x -> { double y = -r + Math.random() * 2 * r; return x * x + y * y <= r * r; }).count();
        return 4.0 * dentro/pasos;
    }
}
